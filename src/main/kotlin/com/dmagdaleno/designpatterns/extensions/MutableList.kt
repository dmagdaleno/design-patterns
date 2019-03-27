package com.dmagdaleno.designpatterns.extensions

fun <E> MutableList<E>.removeLast() {
    this.removeAt(this.lastIndex)
}