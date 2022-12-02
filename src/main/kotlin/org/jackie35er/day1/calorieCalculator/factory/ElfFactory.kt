package org.jackie35er.day1.calorieCalculator.factory

import org.jackie35er.day1.calorieCalculator.domain.CalorieList
import org.jackie35er.day1.calorieCalculator.domain.Elf
import java.util.function.Supplier

interface ElfFactory {

    fun createElf(): Elf
}