package com.balex.dependencyinjectionstart.example2.di

import com.balex.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.balex.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.balex.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.balex.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {


    @Provides
    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}