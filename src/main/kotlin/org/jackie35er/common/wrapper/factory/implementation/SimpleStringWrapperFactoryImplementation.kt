package org.jackie35er.common.wrapper.factory.implementation

import org.jackie35er.common.wrapper.domain.StringWrapper
import org.jackie35er.common.wrapper.factory.StringWrapperFactory

class SimpleStringWrapperFactoryImplementation(private val string: String) : StringWrapperFactory {

    override fun createStringWrapper(): StringWrapper {
        return StringWrapper(string)
    }
}
