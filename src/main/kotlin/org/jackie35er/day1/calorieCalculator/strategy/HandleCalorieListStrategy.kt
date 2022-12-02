package org.jackie35er.day1.calorieCalculator.strategy

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.day1.calorieCalculator.domain.CalorieList

interface HandleCalorieListStrategy {

    fun handleCalorieListStrategy(calorieList: CalorieList): IntWrapper

}