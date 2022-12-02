package org.jackie35er.common.mapper

import org.jackie35er.common.wrapper.domain.IntWrapper

interface IntWrapperToIntMapper {

    fun mapIntWrapperToInt(intWrapper: IntWrapper): Int
}