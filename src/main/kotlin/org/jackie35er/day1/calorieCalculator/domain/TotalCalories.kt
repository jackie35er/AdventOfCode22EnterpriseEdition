package org.jackie35er.day1.calorieCalculator.domain

import org.jackie35er.common.wrapper.domain.IntWrapper

data class TotalCalories(
    val elf: Elf,
    val totalCalories: IntWrapper
) : Comparable<TotalCalories> {
    override fun compareTo(other: TotalCalories): Int {
        if(this.totalCalories.value > other.totalCalories.value)
            return 1
        if(this.totalCalories.value < other.totalCalories.value)
            return -1
        return 0
    }
}
