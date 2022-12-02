package org.jackie35er.common.printer.implementation

import org.jackie35er.common.mapper.implementation.SimpleIntWrapperToStringWrapperMapperImplementation
import org.jackie35er.common.printer.IntWrapperToConsolePrinter
import org.jackie35er.common.printer.StringWrapperToConsolePrinter
import org.jackie35er.common.wrapper.domain.IntWrapper


class IntegerWrapperToConsolePrinterImplementation: IntWrapperToConsolePrinter {

    private val stringWrapperToConsolePrinterImplementation: StringWrapperToConsolePrinter
    private val mapper = SimpleIntWrapperToStringWrapperMapperImplementation

    init {
        stringWrapperToConsolePrinterImplementation = StringWrapperToConsolePrinterImplementation()
    }

    override fun printIntWrapperToConsole(intWrapper: IntWrapper) {
        val stringWrapper = mapper.mapIntWrapperToStringWrapper(intWrapper)
        stringWrapperToConsolePrinterImplementation.printStringWrapperToConsole(stringWrapper)
    }

}