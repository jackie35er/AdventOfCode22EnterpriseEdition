package org.jackie35er.day2.rockpaperscissors.mapper

import org.jackie35er.common.wrapper.domain.StringWrapper
import org.jackie35er.day2.rockpaperscissors.domain.Move

interface StringWrapperToMoveMapper {

    fun mapStringWrapperToMove(stringWrapper: StringWrapper): Move

}