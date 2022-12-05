package org.jackie35er.day2.rockpaperscissors.domain

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.common.wrapper.domain.StringWrapper

enum class Move(val letters: List<StringWrapper>,val score: IntWrapper) {
    ROCK(listOf(StringWrapper("A"), StringWrapper("X")), IntWrapper(1)),
    PAPER(listOf(StringWrapper("B"), StringWrapper("Y")), IntWrapper(2)),
    SCISSORS(listOf(StringWrapper("C"), StringWrapper("Z")), IntWrapper(3))


}

