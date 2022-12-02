package org.jackie35er.common.service.implementation

import org.jackie35er.common.service.BufferedReaderCloserService
import java.io.BufferedReader

class SimpleBufferedReaderCloserServiceImplementation(private val bufferedReader: BufferedReader) : BufferedReaderCloserService{

    override fun closeBufferedReader() {
        bufferedReader.close()
    }
}