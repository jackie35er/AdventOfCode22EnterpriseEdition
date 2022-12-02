package org.jackie35er.common.factory.implementation

import org.jackie35er.common.Level
import org.jackie35er.common.domain.Path
import org.jackie35er.common.factory.DaySolverFactory
import org.jackie35er.common.printer.IntWrapperToConsolePrinter
import org.jackie35er.common.printer.StringWrapperToConsolePrinter
import org.jackie35er.common.printer.implementation.IntegerWrapperToConsolePrinterImplementation
import org.jackie35er.common.printer.implementation.StringWrapperToConsolePrinterImplementation
import org.jackie35er.common.reader.AllLinesInResourceFileReaderBufferedReaderWithFileReader
import org.jackie35er.common.reader.implementation.SimpleAllLinesInResourceFileReaderBufferedReaderWithFileReaderImplementation
import org.jackie35er.common.service.SolveDayService
import org.jackie35er.common.wrapper.domain.StringWrapper
import org.jackie35er.day1.calorieCalculator.service.FindMaxCaloriesCountPerElfInElfListService
import org.jackie35er.day1.calorieCalculator.service.ParseStringWrapperListToElfListService
import org.jackie35er.day1.calorieCalculator.service.implementation.SimpleFindMaxCaloriesCountPerElfInElfListServiceImplementation
import org.jackie35er.day1.calorieCalculator.service.implementation.SimpleParseStringWrapperListToElfListServiceImplementation
import org.jackie35er.day1.calorieCalculator.service.implementation.SimpleSolveDayOneServiceImplementation

class SimpleDaySolverFactoryImplementation: DaySolverFactory {

    private val findMaxCaloriesCountPerElfInElfListService: FindMaxCaloriesCountPerElfInElfListService
    private val intWrapperToConsolePrinter: IntWrapperToConsolePrinter
    private val parseStringWrapperListToElfListService: ParseStringWrapperListToElfListService

    init {
        this.findMaxCaloriesCountPerElfInElfListService = SimpleFindMaxCaloriesCountPerElfInElfListServiceImplementation()
        this.intWrapperToConsolePrinter = IntegerWrapperToConsolePrinterImplementation()
        this.parseStringWrapperListToElfListService = SimpleParseStringWrapperListToElfListServiceImplementation()
    }

    override fun getDaySolver(level: Level): SolveDayService {
        val allLinesInResourceFileReaderBufferedReaderWithFileReader = SimpleAllLinesInResourceFileReaderBufferedReaderWithFileReaderImplementation(level.path)
        return when (level) {
            Level.Level1 -> SimpleSolveDayOneServiceImplementation(findMaxCaloriesCountPerElfInElfListService, intWrapperToConsolePrinter,
                parseStringWrapperListToElfListService
                , allLinesInResourceFileReaderBufferedReaderWithFileReader)
        }
    }

}