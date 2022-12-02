package org.jackie35er.day1.calorieCalculator.factory

import org.jackie35er.day1.calorieCalculator.domain.Calorie

interface CalorieFactory {

    fun createCalorie() : Calorie
}