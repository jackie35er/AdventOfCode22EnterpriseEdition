# Advent of code 2022 Enterprise Edition
inspired by [FizzBuzz Enterprise Edition](https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition)

## What is this?
This is a Repository for the 2022 [Advent of Code](https://adventofcode.com/) Tasks, where various design patterns are being utilized to get the best performance possible.  
## How to support 

Pull Requests are very appreciated.

However it needs to be approved by at least a teammember, 2 of the 3 musketeers, my dog, 4 cats, my neighbor Günther, a McDonalds-Worker, a female CS-Student, Jesus, someone who is not a nerd, Robert C. Martin, Maya the Bee, Sebastian Kurz and Elon Musk(print version only).

## Class Awards:

### Longest Class Name Award
With 76 characters: 
`SimpleAllLinesInResourceFileReaderBufferedReaderWithFileReaderImplementation`

coded on day 1
### Disgusting Tongue-twister Award
`IntWrapperToStringWrapperMapper`

coded on day 1
### Most Lines of Code Award
 With 57 lines:
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

