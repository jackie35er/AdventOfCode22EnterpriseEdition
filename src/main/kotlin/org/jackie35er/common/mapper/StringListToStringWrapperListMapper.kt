package org.jackie35er.common.mapper

import org.jackie35er.common.wrapper.domain.StringWrapper

interface StringListToStringWrapperListMapper {

    fun mapStringListToStringWrapperList(stringList: List<String>): List<StringWrapper>
}