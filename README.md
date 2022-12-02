# Advent of code 2022 Enterprise Edition
inspired by [FizzBuzz Enterprise Edition](https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition)

## What is this?
Das sind die Lösungen für die [Advent of Code](https://adventofcode.com/) Aufgaben, mit sämtlichen Design Patterns angewendet, die wir kennen.

## How to support 

Jede Pull Request ist willkommen, um den Code zu verbessern.

Jedoch muss sie davor von einem Teammitglied, 2 von den 3 Musketieren, meinem Hund, 4 Katzen, Günther von nebenan, einem McDonalds-Mitarbeiter, einer Informatikerin, Jesus, keinem Hochstapler, Robert C. Martin, Biene Maja, Sebastian Kurz und Elon Musk(nur in ausgedruckter Form) genehmigt werden.

## Class Awards:

### Longest Class Name Award
Mit 76 Zeichen: 
`SimpleAllLinesInResourceFileReaderBufferedReaderWithFileReaderImplementation`

coded on day 1
### Ärgster Zungenbrecher Award
`IntWrapperToStringWrapperMapper`

coded on day 1
### Most Lines of Code Award
 Mit 57 Zeilen
```kotlin
package org.jackie35er.day1.calorieCalculator.service.implementation

import org.jackie35er.common.comparator.implementation.SimpleHasStringWrapperIteratorANextValueImplementation
import org.jackie35er.common.comparator.implementation.SimpleStringWrapperIsNotEmptyComparatorImplementation
import org.jackie35er.common.factory.implementation.SimpleIteratorFromStringWrapperListFactoryImplementation
import org.jackie35er.common.mapper.StringWrapperToIntWrapperMapper
import org.jackie35er.common.mapper.implementation.SimpleStringWrapperToIntWrapperMapperImplementation
import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.common.wrapper.domain.StringWrapper
import org.jackie35er.day1.calorieCalculator.domain.Calorie
import org.jackie35er.day1.calorieCalculator.domain.CalorieList
import org.jackie35er.day1.calorieCalculator.domain.Elf
import org.jackie35er.day1.calorieCalculator.domain.ElfList
import org.jackie35er.day1.calorieCalculator.domain.util.implementation.SimpleElfListAdderImplementation
import org.jackie35er.day1.calorieCalculator.factory.ElfListFactory
import org.jackie35er.day1.calorieCalculator.factory.implementation.EmptyElfListFactoryImplementation
import org.jackie35er.day1.calorieCalculator.mapper.IntWrapperListToCalorieListMapper
import org.jackie35er.day1.calorieCalculator.mapper.implementation.SimpleIntWrapperListToCalorieListMapperImplementation
import org.jackie35er.day1.calorieCalculator.service.ParseStringWrapperListToElfListService

class SimpleParseStringWrapperListToElfListServiceImplementation : ParseStringWrapperListToElfListService {

    private val emptyElfListFactory: ElfListFactory
    private val stringWrapperToIntWrapperMapper: StringWrapperToIntWrapperMapper
    private val intWrapperListToCalorieListMapper: IntWrapperListToCalorieListMapper

    init {
        this.emptyElfListFactory = EmptyElfListFactoryImplementation()
        this.stringWrapperToIntWrapperMapper = SimpleStringWrapperToIntWrapperMapperImplementation
        this.intWrapperListToCalorieListMapper = SimpleIntWrapperListToCalorieListMapperImplementation
    }

    override fun parseStringWrapperListToElfList(stringWrapperList: List<StringWrapper>): ElfList {
        val iteratorFromStringWrapperListFactory = SimpleIteratorFromStringWrapperListFactoryImplementation(stringWrapperList)
        val stringWrapperIterator = iteratorFromStringWrapperListFactory.createIteratorFromStringWrapperList()
        val elfList = this.emptyElfListFactory.createElfList()
        val elfListAdder = SimpleElfListAdderImplementation(elfList)
        val hasStringWrapperIteratorANextValueComparator = SimpleHasStringWrapperIteratorANextValueImplementation(stringWrapperIterator)

        val intWrapperList = mutableListOf<IntWrapper>()

        while(hasStringWrapperIteratorANextValueComparator.hasStringWrapperIteratorANextValue()) {
            val currentValue = stringWrapperIterator.next()

            val stringWrapperIsNotEmptyComparator = SimpleStringWrapperIsNotEmptyComparatorImplementation(currentValue)
            if(stringWrapperIsNotEmptyComparator.isStringWrapperNotEmpty()) {
                intWrapperList.add(stringWrapperToIntWrapperMapper.mapStringWrapperToIntWrapper(currentValue))
            }
            else {
                elfListAdder.addSingleElfToElfList(Elf(intWrapperListToCalorieListMapper.mapIntWrapperListToCalorieList(intWrapperList)))
                intWrapperList.clear()
            }
        }

        return elfList
    }
}
```
coded on day 1

