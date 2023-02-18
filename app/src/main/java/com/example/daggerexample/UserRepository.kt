package com.example.daggerexample

import android.util.Log
import com.example.daggerexample.Constants.Companion.TAG

class UserRepository {
    fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB")
    }
}