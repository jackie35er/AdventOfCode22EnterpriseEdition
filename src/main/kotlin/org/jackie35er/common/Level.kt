package org.jackie35er.common

import org.jackie35er.common.domain.Path
import org.jackie35er.common.factory.implementation.SimplePathFactoryImplementation
import org.jackie35er.common.wrapper.domain.StringWrapper
import org.jackie35er.common.wrapper.factory.implementation.SimpleStringWrapperFactoryImplementation


enum class Level(pathAsString: String) {
    Level1("src/main/resources/day1/caloriesForAllElvesInPlainText.sus"),
    Level2("src/main/resources/day2/rockpaperscissorsPlainText.sus");


    val path: Path
    init {
        val stringWrapperFactory = SimpleStringWrapperFactoryImplementation(pathAsString)
        val pathFactory = SimplePathFactoryImplementation(stringWrapperFactory.createStringWrapper())

        path = pathFactory.createPath()
    }
}