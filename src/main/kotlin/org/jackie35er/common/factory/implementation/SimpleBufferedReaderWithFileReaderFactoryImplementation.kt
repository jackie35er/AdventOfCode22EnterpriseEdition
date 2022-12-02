package org.jackie35er.common.factory.implementation

import org.jackie35er.common.factory.BufferedReaderWithFileReaderFactory
import java.io.BufferedReader
import java.io.FileReader

class SimpleBufferedReaderWithFileReaderFactoryImplementation(private val fileReader: FileReader) :
    BufferedReaderWithFileReaderFactory {
    override fun createBufferedReaderWithFileReader(): BufferedReader {
        val bufferedReaderFactory = SimpleBufferedReaderFactoryImplementation(fileReader)

        return bufferedReaderFactory.createBufferedReader()
    }
}
