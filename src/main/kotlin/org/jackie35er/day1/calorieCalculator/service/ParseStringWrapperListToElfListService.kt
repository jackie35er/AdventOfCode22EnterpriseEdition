package org.jackie35er.day1.calorieCalculator.service

import org.jackie35er.common.wrapper.domain.StringWrapper
import org.jackie35er.day1.calorieCalculator.domain.Elf
import org.jackie35er.day1.calorieCalculator.domain.ElfList

interface ParseStringWrapperListToElfListService {

    fun parseStringWrapperListToElfList(stringWrapperList: List<StringWrapper>): ElfList
}