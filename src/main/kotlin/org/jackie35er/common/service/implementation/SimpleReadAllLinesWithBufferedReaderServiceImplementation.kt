package org.jackie35er.common.service.implementation

import org.jackie35er.common.mapper.StringListToStringWrapperListMapper
import org.jackie35er.common.mapper.implementation.SimpleStringListToStringWrapperListImplementation
import org.jackie35er.common.service.BufferedReaderCloserService
import org.jackie35er.common.service.ReadAllLinesWithBufferedReaderService
import org.jackie35er.common.wrapper.domain.StringWrapper
import java.io.BufferedReader

class SimpleReadAllLinesWithBufferedReaderServiceImplementation(private val bufferedReader: BufferedReader):
    ReadAllLinesWithBufferedReaderService {

    private val stringListToStringWrapperListMapper: StringListToStringWrapperListMapper
    private val bufferedReaderCloserService : BufferedReaderCloserService

    init {
        stringListToStringWrapperListMapper = SimpleStringListToStringWrapperListImplementation
        bufferedReaderCloserService = SimpleBufferedReaderCloserServiceImplementation(bufferedReader)
    }

    override fun readAllLinesWithBufferedReader(): List<StringWrapper> {
        val linesReadByBufferedReader = bufferedReader.readLines()
        val mappedStringWrapperList = stringListToStringWrapperListMapper.mapStringListToStringWrapperList(linesReadByBufferedReader)
        bufferedReaderCloserService.closeBufferedReader()

        return mappedStringWrapperList
    }
}