package org.jackie35er.common.wrapper.factory

import org.jackie35er.common.wrapper.domain.StringWrapper

interface StringWrapperFactory {

    fun createStringWrapper(): StringWrapper
}