package com.balex.dependencyinjectionstart.example2.di

import com.balex.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.balex.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.balex.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.balex.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.balex.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.balex.dependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}