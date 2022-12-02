package org.jackie35er.common.comparator.implementation

import org.jackie35er.common.comparator.HasStringWrapperIteratorANextValueComparator
import org.jackie35er.common.wrapper.domain.StringWrapper

class SimpleHasStringWrapperIteratorANextValueImplementation(private val stringWrapperIterator: Iterator<StringWrapper>): HasStringWrapperIteratorANextValueComparator {

    override fun hasStringWrapperIteratorANextValue(): Boolean {
        return stringWrapperIterator.hasNext()
    }
}
