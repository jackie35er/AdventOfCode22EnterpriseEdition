package org.jackie35er.day2.rockpaperscissors.service.implementation

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.day2.rockpaperscissors.domain.Move
import org.jackie35er.day2.rockpaperscissors.domain.Round
import org.jackie35er.day2.rockpaperscissors.service.RoundEvaluatorService

class SimpleRoundEvaluatorServiceImplementation: RoundEvaluatorService  {
    override fun evaluateRound(round: Round): IntWrapper {
        var win = false
        val player1Move = round.player1
        val player2Move = round.player2

        if(player2Move.move == Move.ROCK && player1Move.move == Move.SCISSORS)
            win = true
        else if(player2Move.move == Move.PAPER && player1Move.move == Move.ROCK)
            win = true
        else if(player2Move.move == Move.SCISSORS && player1Move.move == Move.PAPER)
            win = true

        var score = player2Move.move.score.value

        score += if (win) 6 else if(player2Move.move == player1Move.move) 3 else 0

        return IntWrapper(score)
    }
}