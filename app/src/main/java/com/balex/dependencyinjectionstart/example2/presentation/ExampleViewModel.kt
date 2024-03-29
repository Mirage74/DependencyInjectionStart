package com.balex.dependencyinjectionstart.example2.presentation

import com.balex.dependencyinjectionstart.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
