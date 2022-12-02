package org.jackie35er.common.factory

import org.jackie35er.common.domain.Path
import org.jackie35er.common.wrapper.domain.StringWrapper


interface PathFactory {

    fun createPath(): Path
}