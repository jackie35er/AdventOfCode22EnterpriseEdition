package org.jackie35er.common.mapper.implementation

import org.jackie35er.common.mapper.StringListToStringWrapperListMapper
import org.jackie35er.common.wrapper.domain.StringWrapper

object SimpleStringListToStringWrapperListImplementation : StringListToStringWrapperListMapper {

    private val stringToStringWrapperMapper = SimpleStringToStringWrapperMapperImplementation


    override fun mapStringListToStringWrapperList(stringList: List<String>): List<StringWrapper> {
        return stringList.map { string -> stringToStringWrapperMapper.mapStringToStringWrapper(string) }
    }
}