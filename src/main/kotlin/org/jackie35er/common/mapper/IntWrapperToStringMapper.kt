package org.jackie35er.common.mapper

import org.jackie35er.common.wrapper.domain.IntWrapper

interface IntWrapperToStringMapper {
    fun mapIntWrapperToString(intWrapper: IntWrapper): String
}
