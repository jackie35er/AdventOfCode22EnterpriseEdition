package org.jackie35er.common.factory.implementation

import org.jackie35er.common.domain.Path
import org.jackie35er.common.factory.PathFactory
import org.jackie35er.common.wrapper.domain.StringWrapper

class SimplePathFactoryImplementation(private val stringWrapper: StringWrapper): PathFactory {
    override fun createPath(): Path {
        return Path(stringWrapper)
    }
}