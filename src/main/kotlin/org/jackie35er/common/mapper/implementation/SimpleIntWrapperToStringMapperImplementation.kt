package org.jackie35er.common.mapper.implementation

import org.jackie35er.common.mapper.IntToStringMapper
import org.jackie35er.common.mapper.IntWrapperToIntMapper
import org.jackie35er.common.mapper.IntWrapperToStringMapper
import org.jackie35er.common.wrapper.domain.IntWrapper

object SimpleIntWrapperToStringMapperImplementation : IntWrapperToStringMapper {

    private val intToStringMapper: IntToStringMapper
    private val intWrapperToIntMapper: IntWrapperToIntMapper

    init {
        intToStringMapper = SimpleIntToStringMapperImplementation
        intWrapperToIntMapper = SimpleIntWrapperToIntWrapperMapperImplementation
    }

    override fun mapIntWrapperToString(intWrapper: IntWrapper): String {
        val mappedIntValue = intWrapperToIntMapper.mapIntWrapperToInt(intWrapper)

        return intToStringMapper.mapIntToString(mappedIntValue)
    }
}
