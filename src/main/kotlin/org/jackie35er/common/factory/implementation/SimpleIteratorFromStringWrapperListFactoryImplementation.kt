package org.jackie35er.common.factory.implementation

import org.jackie35er.common.factory.IteratorFromStringWrapperListFactory
import org.jackie35er.common.wrapper.domain.StringWrapper

class SimpleIteratorFromStringWrapperListFactoryImplementation(private val stringWrapperList: List<StringWrapper>): IteratorFromStringWrapperListFactory {

    override fun createIteratorFromStringWrapperList(): Iterator<StringWrapper> {
        return stringWrapperList.iterator()
    }
}
