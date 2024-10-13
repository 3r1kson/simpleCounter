package com.example.counterapp

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class CounterViewModel() : ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
    private var _count: MutableState<Int> = mutableStateOf(_repository.getCounter().count)
    var count: MutableState<Int> = _count

    fun increment() {
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrement() {
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count

    }
}