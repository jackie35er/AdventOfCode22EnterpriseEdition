package org.jackie35er.day1.calorieCalculator.service.implementation

import org.jackie35er.day1.calorieCalculator.domain.ElfList
import org.jackie35er.day1.calorieCalculator.domain.TotalCalories
import org.jackie35er.day1.calorieCalculator.service.FindMaxCaloriesCountPerElfInElfListService
import org.jackie35er.day1.calorieCalculator.strategy.HandleCalorieListStrategy
import org.jackie35er.day1.calorieCalculator.strategy.implementation.SumCalorieListStrategyImplementation

class SimpleFindMaxCaloriesCountPerElfInElfListServiceImplementation: FindMaxCaloriesCountPerElfInElfListService {


    private val calorieCalculator = SimpleCaloriesCalculatorServiceImplementation
    private val strategy: HandleCalorieListStrategy

    init {
        strategy = SumCalorieListStrategyImplementation()
    }


    override fun findMaxCaloriesCountPerElfInElfList(elfList: ElfList): TotalCalories {

        return elfList.elves.map {
            val totalCalories = calorieCalculator.calculateTotalCalories(it.calories, strategy)
            return@map TotalCalories(elf = it, totalCalories = totalCalories)
        }.maxBy { it.totalCalories.value }
    }

}