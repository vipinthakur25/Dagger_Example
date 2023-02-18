package com.example.daggerexample

import android.util.Log
import com.example.daggerexample.Constants.Companion.TAG

class EmailService {
    fun send(to: String, from: String, body: String) {
        Log.d(TAG, "Email Sent")
    }
}