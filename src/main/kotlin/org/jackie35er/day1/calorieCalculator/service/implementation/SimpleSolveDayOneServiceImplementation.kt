package org.jackie35er.day1.calorieCalculator.service.implementation

import org.jackie35er.common.printer.IntWrapperToConsolePrinter
import org.jackie35er.common.reader.AllLinesInResourceFileReaderBufferedReaderWithFileReader
import org.jackie35er.common.service.SolveDayService
import org.jackie35er.day1.calorieCalculator.service.FindMaxCaloriesCountPerElfInElfListService
import org.jackie35er.day1.calorieCalculator.service.ParseStringWrapperListToElfListService

class SimpleSolveDayOneServiceImplementation(
    private val findMaxCaloriesCountPerElfInElfListService: FindMaxCaloriesCountPerElfInElfListService,
    private val intWrapperToConsolePrinter: IntWrapperToConsolePrinter,
    private val parseStringWrapperListToElfListService: ParseStringWrapperListToElfListService,
    private val allLinesInResourceFileReaderBufferedReaderWithFileReader: AllLinesInResourceFileReaderBufferedReaderWithFileReader
): SolveDayService {

    override fun solveDay() {
        val stringWrapperLines = allLinesInResourceFileReaderBufferedReaderWithFileReader.readAllLinesInFile()
        val elfList = parseStringWrapperListToElfListService.parseStringWrapperListToElfList(stringWrapperLines)
        val maxElf = findMaxCaloriesCountPerElfInElfListService.findMaxCaloriesCountPerElfInElfList(elfList)
        intWrapperToConsolePrinter.printIntWrapperToConsole(maxElf.totalCalories)
    }

}