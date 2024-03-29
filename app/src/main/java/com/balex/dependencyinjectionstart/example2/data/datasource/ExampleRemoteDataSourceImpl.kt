package com.balex.dependencyinjectionstart.example2.data.datasource

import com.balex.dependencyinjectionstart.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}
