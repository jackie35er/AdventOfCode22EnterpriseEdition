package org.jackie35er.common.service

import org.jackie35er.common.wrapper.domain.StringWrapper

interface ReadAllLinesWithBufferedReaderService {

    fun readAllLinesWithBufferedReader(): List<StringWrapper>
}