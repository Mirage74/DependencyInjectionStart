package com.balex.dependencyinjectionstart.example2.di

import com.balex.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.balex.dependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {
    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }
}