package com.balex.dependencyinjectionstart.example1

import dagger.Component


@Component (modules = [ComputerModule::class])
interface NewComponent {

//    fun getMouse(): Mouse
//
//    fun getKeyboard(): Keyboard

    fun inject(activity: Activity)
}