package org.jackie35er.common.wrapper.domain

class ListWrapper<T> : List<T> {


    private val list: MutableList<T> = mutableListOf()

    override fun add(element: T) {
        list.add(element)
    }

    override fun add(index: Int, element: T) {
        list.add(index, element)
    }

    override fun addAll(elements: List<T>) {
        for (element in elements) {
            list.add(element)
        }
    }

    override fun addAll(index: Int, elements: List<T>) {
        TODO("not yet implemented")
    }

    override fun clear() {
        list.clear()
    }

    override operator fun contains(element: T): Boolean {
        return list.contains(element)
    }

    override fun containsAll(elements: List<T>): Boolean {
        TODO("not yet implemented")
    }

    override operator fun get(index: Int): T {
        return list[index]
    }

    override fun indexOf(element: T): Int {
        return list.indexOf(element)
    }

    override fun isEmpty(): Boolean {
        return list.isEmpty()
    }

    // TODO: Implement custom Iterator
    override operator fun iterator(): Iterator<T> {
        return list.iterator()
    }

    override fun lastIndexOf(element: T): Int {
        return list.lastIndexOf(element)
    }

    override fun listIterator(): ListIterator<T> {
        return list.listIterator()
    }

    override fun listIterator(index: Int): ListIterator<T> {
        return list.listIterator(index)
    }

    override fun remove(element: T): Boolean {
        return list.remove(element)
    }

    override fun removeAll(elements: List<T>): Boolean {
        TODO("not yet implemented")
    }

    override fun removeAt(index: Int): T {
        return list.removeAt(index)
    }

    override fun retainAll(elements: List<T>): Boolean {
        TODO("not yet implemented")
    }

    override operator fun set(index: Int, element: T): T {
        return list.set(index, element)
    }

    override fun size(): Int {
        return list.size
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<T> {
        TODO("not yet implemented")
    }

    override fun map(function: () -> Any): List<T> {
        TODO("Not yet implemented")
    }
}