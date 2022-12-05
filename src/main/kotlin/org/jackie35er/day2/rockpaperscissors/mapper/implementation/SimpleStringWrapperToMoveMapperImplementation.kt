package org.jackie35er.day2.rockpaperscissors.mapper.implementation

import org.jackie35er.common.mapper.StringWrapperToStringMapper
import org.jackie35er.common.mapper.implementation.SimpleStringWrapperToStringMapperImplementation
import org.jackie35er.common.wrapper.domain.StringWrapper
import org.jackie35er.day2.rockpaperscissors.domain.Move
import org.jackie35er.day2.rockpaperscissors.mapper.StringWrapperToMoveMapper

object SimpleStringWrapperToMoveMapperImplementation: StringWrapperToMoveMapper {

    private val stringWrapperToStringMapper: StringWrapperToStringMapper

    init {
        stringWrapperToStringMapper = SimpleStringWrapperToStringMapperImplementation
    }

    override fun mapStringWrapperToMove(stringWrapper: StringWrapper): Move {
        return Move.values().find {
            val strings = it.letters.map { wrapper ->
                stringWrapperToStringMapper.mapStringWrapperToString(wrapper)
            }
            val found = strings.find { str ->
                str == stringWrapperToStringMapper.mapStringWrapperToString(stringWrapper)
            }
            return@find found != null
        }!!
    }
}