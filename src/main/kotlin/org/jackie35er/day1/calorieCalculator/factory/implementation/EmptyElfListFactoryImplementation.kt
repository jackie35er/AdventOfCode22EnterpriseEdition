package org.jackie35er.day1.calorieCalculator.factory.implementation

import org.jackie35er.day1.calorieCalculator.domain.ElfList
import org.jackie35er.day1.calorieCalculator.factory.ElfListFactory

class EmptyElfListFactoryImplementation : ElfListFactory {

    override fun createElfList(): ElfList {
        return ElfList(mutableListOf())
    }
}