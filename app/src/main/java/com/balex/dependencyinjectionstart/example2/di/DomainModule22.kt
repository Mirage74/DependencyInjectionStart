package com.balex.dependencyinjectionstart.example2.di

import com.balex.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.balex.dependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule22 {
    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }

}

//abstract class DomainModule {
//
//    @Binds
//    abstract fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
//
//}

//interface DomainModule {
//    @Provides
//    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
//
//}