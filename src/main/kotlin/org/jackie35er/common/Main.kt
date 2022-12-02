package org.jackie35er.common

import org.jackie35er.common.factory.implementation.SimpleDaySolverFactoryImplementation

fun main() {
    val factory = SimpleDaySolverFactoryImplementation()
    val service = factory.getDaySolver(Level.Level1)
    service.solveDay()
}