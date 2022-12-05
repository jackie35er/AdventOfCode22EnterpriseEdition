package org.jackie35er.day2.rockpaperscissors.service.implementation

import org.jackie35er.common.mapper.StringToStringWrapperMapper
import org.jackie35er.common.mapper.StringWrapperToStringMapper
import org.jackie35er.common.mapper.implementation.SimpleStringToStringWrapperMapperImplementation
import org.jackie35er.common.mapper.implementation.SimpleStringWrapperToStringMapperImplementation
import org.jackie35er.common.wrapper.domain.StringWrapper
import org.jackie35er.day2.rockpaperscissors.domain.Game
import org.jackie35er.day2.rockpaperscissors.domain.PlayerMove
import org.jackie35er.day2.rockpaperscissors.domain.Round
import org.jackie35er.day2.rockpaperscissors.mapper.StringWrapperToMoveMapper
import org.jackie35er.day2.rockpaperscissors.mapper.implementation.SimpleStringWrapperToMoveMapperImplementation
import org.jackie35er.day2.rockpaperscissors.service.ParseStringWrapperListToGameService

class SimpleParseStringWrapperListToGameServiceImplementation : ParseStringWrapperListToGameService {

    private val stringWrapperToStringMapper: StringWrapperToStringMapper
    private val stringWrapperToMoveMapper: StringWrapperToMoveMapper
    private val stringToStringWrapperMapper: StringToStringWrapperMapper

    init {
        stringWrapperToStringMapper = SimpleStringWrapperToStringMapperImplementation
        stringWrapperToMoveMapper = SimpleStringWrapperToMoveMapperImplementation
        stringToStringWrapperMapper = SimpleStringToStringWrapperMapperImplementation
    }

    override fun parseStringWrapperListToGame(stringWrappers: List<StringWrapper>): Game {
        val rounds = stringWrappers.map {
            val mapped = stringWrapperToStringMapper.mapStringWrapperToString(it)
            val splitted = mapped.split(" ")
            val playerMove1 = PlayerMove(
                stringWrapperToMoveMapper.mapStringWrapperToMove(
                    stringToStringWrapperMapper.mapStringToStringWrapper(
                        splitted[0]
                    )
                )
            )
            val playerMove2 = PlayerMove(
                stringWrapperToMoveMapper.mapStringWrapperToMove(
                    stringToStringWrapperMapper.mapStringToStringWrapper(
                        splitted[1]
                    )
                )
            )
            Round(playerMove1, playerMove2)
        }
        return Game(rounds)
    }
}