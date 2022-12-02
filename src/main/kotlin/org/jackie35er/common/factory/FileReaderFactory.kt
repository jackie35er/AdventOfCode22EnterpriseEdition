package org.jackie35er.common.factory

import java.io.FileReader

interface FileReaderFactory {

    fun createFileReader(): FileReader
}