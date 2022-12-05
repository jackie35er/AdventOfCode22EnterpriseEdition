package org.jackie35er.day2.rockpaperscissors.service

import org.jackie35er.common.wrapper.domain.StringWrapper
import org.jackie35er.day2.rockpaperscissors.domain.Game

interface ParseStringWrapperListToGameService {

    fun parseStringWrapperListToGame(stringWrappers: List<StringWrapper>): Game

}