package com.balex.dependencyinjectionstart.example1

class Activity {

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}