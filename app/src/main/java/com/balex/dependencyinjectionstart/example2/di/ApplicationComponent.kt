package com.balex.dependencyinjectionstart.example2.di

import com.balex.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.Component

@Component (modules = [DataModule::class, DomainModule22::class, ContextModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}