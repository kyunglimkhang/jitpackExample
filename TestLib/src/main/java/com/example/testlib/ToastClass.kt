package com.example.testlib

import android.content.Context
import android.webkit.ConsoleMessage
import android.widget.Toast

class ToastClass {

    companion object {
        fun showToast(context: Context, message: String) = Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}