package org.jackie35er.common.factory.implementation

import java.io.BufferedReader
import java.io.Reader

class SimpleBufferedReaderFactoryImplementation(private val reader: Reader) {

    fun createBufferedReader(): BufferedReader {
        return BufferedReader(reader)
    }
}