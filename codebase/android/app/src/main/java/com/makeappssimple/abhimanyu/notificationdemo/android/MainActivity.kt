package com.makeappssimple.abhimanyu.notificationdemo.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.makeappssimple.abhimanyu.notificationdemo.android.ui.theme.NotificationDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotificationDemoTheme {
                NotificationDemo()
            }
        }
    }
}
