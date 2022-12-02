package org.jackie35er.common.comparator.implementation

import org.jackie35er.common.comparator.StringWrapperIsNotEmptyComparator
import org.jackie35er.common.mapper.StringWrapperToStringMapper
import org.jackie35er.common.mapper.implementation.SimpleStringWrapperToStringMapperImplementation
import org.jackie35er.common.wrapper.domain.StringWrapper

class SimpleStringWrapperIsNotEmptyComparatorImplementation(private val stringWrapper: StringWrapper): StringWrapperIsNotEmptyComparator {

    private val stringWrapperToStringMapper: StringWrapperToStringMapper

    init {
        stringWrapperToStringMapper = SimpleStringWrapperToStringMapperImplementation
    }

    override fun isStringWrapperNotEmpty(): Boolean {
        return stringWrapperToStringMapper.mapStringWrapperToString(stringWrapper).isNotEmpty()
    }
}
