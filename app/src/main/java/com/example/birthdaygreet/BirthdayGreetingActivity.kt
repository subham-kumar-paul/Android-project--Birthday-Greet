package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeeting.*

class BirthdayGreeetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text = "Happy Birthday\n$name!"
    }
}