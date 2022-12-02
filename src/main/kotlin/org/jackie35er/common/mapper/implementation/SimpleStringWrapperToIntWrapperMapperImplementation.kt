package org.jackie35er.common.mapper.implementation

import org.jackie35er.common.mapper.StringWrapperToIntWrapperMapper
import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.common.wrapper.domain.StringWrapper

object SimpleStringWrapperToIntWrapperMapperImplementation: StringWrapperToIntWrapperMapper {

    override fun mapStringWrapperToIntWrapper(stringWrapper: StringWrapper): IntWrapper {
        return IntWrapper(stringWrapper.value.toInt())
    }
}