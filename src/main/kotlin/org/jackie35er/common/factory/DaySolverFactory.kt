package org.jackie35er.common.factory

import org.jackie35er.common.Level
import org.jackie35er.common.service.SolveDayService

interface DaySolverFactory {

    fun getDaySolver(level: Level): SolveDayService

}