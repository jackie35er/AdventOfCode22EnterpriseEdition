package org.jackie35er.day1.calorieCalculator.factory.implementation

import org.jackie35er.day1.calorieCalculator.domain.Elf
import org.jackie35er.day1.calorieCalculator.domain.ElfList
import org.jackie35er.day1.calorieCalculator.factory.ElfListFactory

class SimpleElfListFactoryImplementation(private val elves: MutableList<Elf>) : ElfListFactory {

    override fun createElfList(): ElfList {
        return ElfList(elves)
    }
}
