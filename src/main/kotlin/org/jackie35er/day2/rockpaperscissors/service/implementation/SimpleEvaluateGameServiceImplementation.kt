package org.jackie35er.day2.rockpaperscissors.service.implementation

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.day2.rockpaperscissors.domain.Game
import org.jackie35er.day2.rockpaperscissors.service.EvaluateGameService
import org.jackie35er.day2.rockpaperscissors.service.RoundEvaluatorService

class SimpleEvaluateGameServiceImplementation(
    private val roundEvaluatorService: RoundEvaluatorService
): EvaluateGameService {
    override fun calculateGameScore(game: Game): IntWrapper {
        val score = game.rounds.map {
            roundEvaluatorService.evaluateRound(it)
        }.map {
            it.value
        }.reduce{ a,b -> a + b }
        return IntWrapper(score)
    }
}