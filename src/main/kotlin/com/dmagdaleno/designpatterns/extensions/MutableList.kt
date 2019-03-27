package com.dmagdaleno.designpatterns.extensions

fun <E> MutableList<E>.removeLast() {
    val lastIndex = this.lastIndex
    this.removeAt(lastIndex)
}