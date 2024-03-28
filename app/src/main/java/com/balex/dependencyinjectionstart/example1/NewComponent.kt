package com.balex.dependencyinjectionstart.example1

import dagger.Component


@Component
interface NewComponent {

//    fun getMouse(): Mouse
//
//    fun getKeyboard(): Keyboard

    fun inject(activity: Activity)
}