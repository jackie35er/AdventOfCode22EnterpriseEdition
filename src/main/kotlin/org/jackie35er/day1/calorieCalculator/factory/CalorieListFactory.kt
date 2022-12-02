package org.jackie35er.day1.calorieCalculator.factory

import org.jackie35er.day1.calorieCalculator.domain.Calorie
import org.jackie35er.day1.calorieCalculator.domain.CalorieList
import java.util.function.Supplier

interface CalorieListFactory {

        fun createCalorieList(): CalorieList
}