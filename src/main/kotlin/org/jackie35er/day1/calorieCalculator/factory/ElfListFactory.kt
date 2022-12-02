package org.jackie35er.day1.calorieCalculator.factory

import org.jackie35er.day1.calorieCalculator.domain.Elf
import org.jackie35er.day1.calorieCalculator.domain.ElfList

interface ElfListFactory {

    fun createElfList(): ElfList
}