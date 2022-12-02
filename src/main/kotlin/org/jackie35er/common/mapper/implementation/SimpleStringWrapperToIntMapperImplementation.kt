package org.jackie35er.common.mapper.implementation

import org.jackie35er.common.mapper.StringWrapperToIntMapper
import org.jackie35er.common.wrapper.domain.StringWrapper

object SimpleStringWrapperToIntMapperImplementation: StringWrapperToIntMapper {

    override fun mapStringWrapperToInt(stringWrapper: StringWrapper): Int {
        return stringWrapper.value.toInt()
    }
}