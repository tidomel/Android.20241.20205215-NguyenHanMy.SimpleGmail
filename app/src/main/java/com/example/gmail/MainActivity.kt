package com.example.gmail

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalTime

class MainActivity : AppCompatActivity() {
    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mailItems = ArrayList(listOf(
            Mail_item(
                title = "Project Deadline Update",
                context = "The deadline for the Q4 report has been extended to next Friday.",
                receiver = "Mike Anderson",
                LocalTime.of(12, 34),
                resources.getIdentifier("avatar", "drawable", packageName)
            ),
            Mail_item(
                title = "Holiday Party Invitation",
                context = "You're invited to our annual holiday celebration on December 20th at 6pm.",
                receiver = "Sarah Wilson",
                LocalTime.of(11, 22),
                resources.getIdentifier("avatar", "drawable", packageName)
            ),
            Mail_item(
                title = "Training Session Schedule",
                context = "Mandatory cybersecurity training session scheduled for next Monday at 2pm.",
                receiver = "David Chen",
                LocalTime.of(11, 16),
                resources.getIdentifier("avatar", "drawable", packageName)
            ),
            Mail_item(
                title = "Office Maintenance Notice",
                context = "Building maintenance will be conducted this weekend. Please secure your belongings.",
                receiver = "Emma Thompson",
                LocalTime.of(10, 12),
                resources.getIdentifier("avatar", "drawable", packageName)
            ),
            Mail_item(
                title = "New Client Meeting",
                context = "Introductory meeting with potential client XYZ Corp scheduled for Wednesday at 11am.",
                receiver = "Robert Garcia",
                LocalTime.of(10, 11),
                resources.getIdentifier("avatar", "drawable", packageName)
            )
        ))

        findViewById<ListView>(R.id.MailContent).adapter = GmailAdapter(mailItems)


    }
}


