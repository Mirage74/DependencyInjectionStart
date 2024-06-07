package com.balex.dependencyinjectionstart.example2.data.repository

import android.util.Log
import com.balex.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.balex.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.balex.dependencyinjectionstart.example2.data.mapper.ExampleMapper
import com.balex.dependencyinjectionstart.example2.di.ProdQualifier
import com.balex.dependencyinjectionstart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    //@TestQualifier private val remoteDataSource: ExampleRemoteDataSource,
    @ProdQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    init {
        Log.d("ExampleRepositoryImpl", "ExampleRepositoryImpl init")
    }

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
