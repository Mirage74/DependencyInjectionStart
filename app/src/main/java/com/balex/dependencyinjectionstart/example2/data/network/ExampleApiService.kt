package com.balex.dependencyinjectionstart.example2.data.network

import android.content.Context
import android.util.Log
import com.balex.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val currTime: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $currTime ${System.currentTimeMillis()}")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
