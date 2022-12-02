package org.jackie35er.common.mapper

import org.jackie35er.common.wrapper.domain.StringWrapper

interface StringWrapperToIntMapper {

    fun mapStringWrapperToInt(stringWrapper: StringWrapper): Int
}