package com.example.myresume

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatDelegate
import com.example.myresume.databinding.ActivityMainBinding
import java.util.*

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpUI()

    }

    private fun setUpUI() {
        binding.gmailIcon.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","danielayesoro18@gmail.com",null))
            startActivity(Intent.createChooser(emailIntent,null))
        }

        binding.linkedinIcon.setOnClickListener {
            val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/ayesoro-daniel/"))
            startActivity(urlIntent)
        }

        binding.githubIcon.setOnClickListener {
            val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Dayesoro"))
            startActivity(urlIntent)
        }

        binding.twitterIcon.setOnClickListener {
            val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/DAyesoro"))
            startActivity(urlIntent)
        }
        binding.darkMode.setOnClickListener {
            Log.d("hi","hello")
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
    }


}