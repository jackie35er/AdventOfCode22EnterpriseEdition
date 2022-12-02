package org.jackie35er.common.mapper.implementation

import org.jackie35er.common.mapper.StringWrapperToStringMapper
import org.jackie35er.common.wrapper.domain.StringWrapper

object SimpleStringWrapperToStringMapperImplementation : StringWrapperToStringMapper{

    override fun mapStringWrapperToString(stringWrapper: StringWrapper): String {
        return stringWrapper.value
    }
}