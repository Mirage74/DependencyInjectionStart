package com.balex.dependencyinjectionstart.example2.data.network

import android.content.Context
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val currTime: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
