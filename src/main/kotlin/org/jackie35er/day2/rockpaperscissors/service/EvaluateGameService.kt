package org.jackie35er.day2.rockpaperscissors.service

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.day2.rockpaperscissors.domain.Game

interface EvaluateGameService {

    fun calculateGameScore(game: Game): IntWrapper

}