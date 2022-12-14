package org.jackie35er.common.wrapper.domain

interface List<T> {

    fun add(element: T)

    fun add(index: Int, element: T)

    fun addAll(elements: List<T>)

    fun addAll(index: Int, elements: List<T>)

    fun clear()

    fun contains(element: T): Boolean

    fun containsAll(elements: List<T>): Boolean

    fun get(index: Int): T

    fun indexOf(element: T): Int

    fun isEmpty(): Boolean

    operator fun iterator(): Iterator<T>

    fun lastIndexOf(element: T): Int

    fun listIterator(): ListIterator<T>

    fun listIterator(index: Int): ListIterator<T>

    fun remove(element: T): Boolean

    fun removeAll(elements: List<T>): Boolean

    fun removeAt(index: Int): T

    fun retainAll(elements: List<T>): Boolean

    fun set(index: Int, element: T): T

    fun size(): Int

    fun subList(fromIndex: Int, toIndex: Int): List<T>

    fun map(function: () -> Any): List<T>
}