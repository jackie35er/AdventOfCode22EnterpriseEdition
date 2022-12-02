package org.jackie35er.day1.calorieCalculator.service.implementation

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.day1.calorieCalculator.domain.CalorieList
import org.jackie35er.day1.calorieCalculator.service.CaloriesCalculatorService
import org.jackie35er.day1.calorieCalculator.strategy.HandleCalorieListStrategy

object SimpleCaloriesCalculatorServiceImplementation: CaloriesCalculatorService {

    override fun calculateTotalCalories(calories: CalorieList, handleCalorieListStrategy: HandleCalorieListStrategy): IntWrapper {
        return handleCalorieListStrategy.handleCalorieListStrategy(calories)
    }

}