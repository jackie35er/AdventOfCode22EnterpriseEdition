package org.jackie35er.day1.calorieCalculator.service

import org.jackie35er.day1.calorieCalculator.domain.Elf
import org.jackie35er.day1.calorieCalculator.domain.ElfList
import org.jackie35er.day1.calorieCalculator.domain.TotalCalories

interface FindMaxCaloriesCountPerElfInElfListService {

    fun findMaxCaloriesCountPerElfInElfList(elfList: ElfList): TotalCalories

}