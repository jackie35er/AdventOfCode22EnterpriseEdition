package org.jackie35er.day1.calorieCalculator.domain.util.implementation

import org.jackie35er.day1.calorieCalculator.domain.Elf
import org.jackie35er.day1.calorieCalculator.domain.ElfList
import org.jackie35er.day1.calorieCalculator.domain.util.ElfListAdder

class SimpleElfListAdderImplementation(private val elfList: ElfList) : ElfListAdder {

    override fun addSingleElfToElfList(elf: Elf) {
        elfList.elves.add(elf)
    }
}