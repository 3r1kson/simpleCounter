package com.example.counterapp

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class CounterViewModel : ViewModel() {
    private var _count: MutableState<Int> = mutableStateOf(0)
    var count: MutableState<Int> = _count

    fun increment() {
        println(_count)
        _count.value += 1
        println(_count)
    }

    fun decrement() {
        _count.value -= 1
    }
}