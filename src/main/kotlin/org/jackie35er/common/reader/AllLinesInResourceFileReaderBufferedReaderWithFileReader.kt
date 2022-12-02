package org.jackie35er.common.reader

import org.jackie35er.common.wrapper.domain.StringWrapper

interface AllLinesInResourceFileReaderBufferedReaderWithFileReader {

    fun readAllLinesInFile(): List<StringWrapper>
}