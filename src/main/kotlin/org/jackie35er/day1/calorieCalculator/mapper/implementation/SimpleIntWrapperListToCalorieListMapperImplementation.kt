package org.jackie35er.day1.calorieCalculator.mapper.implementation

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.day1.calorieCalculator.domain.Calorie
import org.jackie35er.day1.calorieCalculator.domain.CalorieList
import org.jackie35er.day1.calorieCalculator.mapper.IntWrapperListToCalorieListMapper

object SimpleIntWrapperListToCalorieListMapperImplementation: IntWrapperListToCalorieListMapper {

    override fun mapIntWrapperListToCalorieList(intWrapperList: List<IntWrapper>): CalorieList {
        return CalorieList(intWrapperList.map { Calorie(it) })
    }
}