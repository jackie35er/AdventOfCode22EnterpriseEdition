package org.jackie35er.common.printer.implementation

import org.jackie35er.common.mapper.implementation.SimpleStringWrapperToStringMapperImplementation
import org.jackie35er.common.printer.StringWrapperToConsolePrinter
import org.jackie35er.common.wrapper.domain.StringWrapper

class StringWrapperToConsolePrinterImplementation: StringWrapperToConsolePrinter {

    private val mapper = SimpleStringWrapperToStringMapperImplementation

    override fun printStringWrapperToConsole(stringWrapper: StringWrapper) {
        val out = mapper.mapStringWrapperToString(stringWrapper)
        println(out)
    }

}