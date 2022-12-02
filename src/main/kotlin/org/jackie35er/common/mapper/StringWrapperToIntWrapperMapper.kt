package org.jackie35er.common.mapper

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.common.wrapper.domain.StringWrapper

interface StringWrapperToIntWrapperMapper {
    fun mapStringWrapperToIntWrapper(stringWrapper: StringWrapper): IntWrapper
}