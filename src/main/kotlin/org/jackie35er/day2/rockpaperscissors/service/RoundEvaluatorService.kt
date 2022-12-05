package org.jackie35er.day2.rockpaperscissors.service

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.day2.rockpaperscissors.domain.Round

interface RoundEvaluatorService {
    fun evaluateRound(round: Round): IntWrapper
}