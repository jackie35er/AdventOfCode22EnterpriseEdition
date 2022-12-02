package org.jackie35er.day1.calorieCalculator.strategy.implementation

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.day1.calorieCalculator.domain.CalorieList
import org.jackie35er.day1.calorieCalculator.strategy.HandleCalorieListStrategy

class SumCalorieListStrategyImplementation: HandleCalorieListStrategy {

    override fun handleCalorieListStrategy(calorieList: CalorieList): IntWrapper {
        return IntWrapper(calorieList.calories.map { it.calorieCount }.map { it.value }.reduce { a, b -> a + b })
    }

}