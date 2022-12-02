package org.jackie35er.common.mapper.implementation

import org.jackie35er.common.mapper.StringToStringWrapperMapper
import org.jackie35er.common.wrapper.domain.StringWrapper

object SimpleStringToStringWrapperMapperImplementation : StringToStringWrapperMapper{
    override fun mapStringToStringWrapper(string: String): StringWrapper {
        return StringWrapper(string)
    }
}