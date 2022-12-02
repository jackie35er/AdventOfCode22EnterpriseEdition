package org.jackie35er.common.mapper

import org.jackie35er.common.wrapper.domain.StringWrapper

interface StringWrapperToStringMapper {

    fun mapStringWrapperToString(stringWrapper: StringWrapper): String
}