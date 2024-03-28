package com.balex.dependencyinjectionstart.example1

import dagger.Component


@Component
interface NewComponent {

    fun inject(activity: Activity)
}