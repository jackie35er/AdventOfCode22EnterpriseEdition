package org.jackie35er.common.factory

import java.io.BufferedReader

interface BufferedReaderWithFileReaderFactory {

    fun createBufferedReaderWithFileReader(): BufferedReader
}