package com.balex.dependencyinjectionstart.example2.data.database

import android.content.Context
import android.util.Log
import javax.inject.Inject


class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val currTime: Long
){

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
