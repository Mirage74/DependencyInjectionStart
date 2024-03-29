package com.balex.dependencyinjectionstart.example1

import javax.inject.Inject


class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var mouse: Mouse

    @Inject
    lateinit var monitor: Monitor

    @Inject
    lateinit var computer: Computer

//    val component = DaggerNewComponent.create()
//    val keyboard = component.getKeyboard()
//    val mouse = component.getMouse()


    init {
        DaggerNewComponent.create().inject(this)

    }

}