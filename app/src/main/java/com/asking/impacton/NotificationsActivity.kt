package com.asking.impacton

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class NotificationsActivity : AppCompatActivity() {
    private lateinit var notificationsList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        notificationsList = findViewById(R.id.notificationsList)

        // Exemples de notifications
        val notifications = arrayOf("Notification 1", "Notification 2", "Notification 3")
        notificationsList.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, notifications)
    }
}
