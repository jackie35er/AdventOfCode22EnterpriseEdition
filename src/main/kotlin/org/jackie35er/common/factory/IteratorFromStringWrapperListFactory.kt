package org.jackie35er.common.factory

import org.jackie35er.common.wrapper.domain.StringWrapper

interface IteratorFromStringWrapperListFactory {
    fun createIteratorFromStringWrapperList(): Iterator<StringWrapper>
}