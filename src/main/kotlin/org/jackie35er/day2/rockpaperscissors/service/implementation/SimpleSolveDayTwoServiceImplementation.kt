package org.jackie35er.day2.rockpaperscissors.service.implementation

import org.jackie35er.common.printer.IntWrapperToConsolePrinter
import org.jackie35er.common.reader.AllLinesInResourceFileReaderBufferedReaderWithFileReader
import org.jackie35er.common.service.SolveDayService
import org.jackie35er.day2.rockpaperscissors.service.EvaluateGameService
import org.jackie35er.day2.rockpaperscissors.service.ParseStringWrapperListToGameService

class SimpleSolveDayTwoServiceImplementation(
    private val allLinesInResourceFileReaderBufferedReaderWithFileReader: AllLinesInResourceFileReaderBufferedReaderWithFileReader,
    private val intWrapperToConsolePrinter: IntWrapperToConsolePrinter,
    private val parseStringWrapperListToGameService: ParseStringWrapperListToGameService,
    private val evaluateGameService: EvaluateGameService
): SolveDayService {

    override fun solveDay() {
        val stringWrapperLines = allLinesInResourceFileReaderBufferedReaderWithFileReader.readAllLinesInFile()
        val game = parseStringWrapperListToGameService.parseStringWrapperListToGame(stringWrapperLines)
        val score = evaluateGameService.calculateGameScore(game)
        intWrapperToConsolePrinter.printIntWrapperToConsole(score)
    }
}