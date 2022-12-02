package org.jackie35er.common.reader.implementation

import org.jackie35er.common.domain.Path
import org.jackie35er.common.factory.BufferedReaderWithFileReaderFactory
import org.jackie35er.common.factory.implementation.SimpleBufferedReaderWithFileReaderFactoryImplementation
import org.jackie35er.common.factory.implementation.SimpleFileReaderFactoryImplementation
import org.jackie35er.common.reader.AllLinesInResourceFileReaderBufferedReaderWithFileReader
import org.jackie35er.common.service.implementation.SimpleReadAllLinesWithBufferedReaderServiceImplementation
import org.jackie35er.common.wrapper.domain.StringWrapper

class SimpleAllLinesInResourceFileReaderBufferedReaderWithFileReaderImplementation(path: Path) : AllLinesInResourceFileReaderBufferedReaderWithFileReader {

    private val bufferedReaderWithFileReaderFactory : BufferedReaderWithFileReaderFactory


    init {
        val fileReaderFactory = SimpleFileReaderFactoryImplementation(path)
        val fileReader = fileReaderFactory.createFileReader()

        this.bufferedReaderWithFileReaderFactory = SimpleBufferedReaderWithFileReaderFactoryImplementation(fileReader)
    }

    override fun readAllLinesInFile(): List<StringWrapper> {
        val bufferedReader = bufferedReaderWithFileReaderFactory.createBufferedReaderWithFileReader()
        val readAllLinesWithBufferedReaderService = SimpleReadAllLinesWithBufferedReaderServiceImplementation(bufferedReader)

        return readAllLinesWithBufferedReaderService.readAllLinesWithBufferedReader()
    }
}