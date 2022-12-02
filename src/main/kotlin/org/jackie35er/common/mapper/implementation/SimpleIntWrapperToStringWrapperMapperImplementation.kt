package org.jackie35er.common.mapper.implementation

import org.jackie35er.common.mapper.IntWrapperToStringMapper
import org.jackie35er.common.mapper.IntWrapperToStringWrapperMapper
import org.jackie35er.common.mapper.StringToStringWrapperMapper
import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.common.wrapper.domain.StringWrapper

object SimpleIntWrapperToStringWrapperMapperImplementation : IntWrapperToStringWrapperMapper {

    private val intWrapperToStringMapper: IntWrapperToStringMapper
    private val stringToStringWrapperMapper: StringToStringWrapperMapper

    init {
        this.intWrapperToStringMapper = SimpleIntWrapperToStringMapperImplementation
        this.stringToStringWrapperMapper = SimpleStringToStringWrapperMapperImplementation
    }

    override fun mapIntWrapperToStringWrapper(intWrapper: IntWrapper): StringWrapper {
        val string = intWrapperToStringMapper.mapIntWrapperToString(intWrapper)

        return stringToStringWrapperMapper.mapStringToStringWrapper(string)
    }
}