package org.jackie35er.day1.calorieCalculator.factory

import org.jackie35er.day1.calorieCalculator.domain.TotalCalories

interface TotalCaloriesFactory {

    fun createTotalCalories(): TotalCalories
}