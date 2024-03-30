package com.balex.dependencyinjectionstart.example2.di

import android.content.Context
import com.balex.dependencyinjectionstart.example2.presentation.MainActivity
import com.balex.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component (modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)

//    @Component.Builder
//    interface ApplicationComponentBuilder {
//
//        @BindsInstance
//        fun context(context: Context): ApplicationComponentBuilder
//
//        @BindsInstance
//        fun currentTime(time: Long): ApplicationComponentBuilder
//
//        fun build(): ApplicationComponent
//
//    }

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance time: Long
        ): ApplicationComponent

    }
}