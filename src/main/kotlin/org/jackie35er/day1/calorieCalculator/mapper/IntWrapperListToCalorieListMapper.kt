package org.jackie35er.day1.calorieCalculator.mapper

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.day1.calorieCalculator.domain.CalorieList

interface IntWrapperListToCalorieListMapper {

    fun mapIntWrapperListToCalorieList(intWrapperList: List<IntWrapper>): CalorieList
}