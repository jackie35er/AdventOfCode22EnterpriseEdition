package org.jackie35er.common.mapper.implementation

import org.jackie35er.common.mapper.IntWrapperToIntMapper
import org.jackie35er.common.wrapper.domain.IntWrapper

object SimpleIntWrapperToIntWrapperMapperImplementation: IntWrapperToIntMapper {

        override fun mapIntWrapperToInt(intWrapper: IntWrapper): Int {
            return intWrapper.value
        }
}