package com.codehustlers.fcvyoutubedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codehustlers.fcvyoutubedemo.databinding.ActivityFrameLayoutBinding
import com.codehustlers.fcvyoutubedemo.fragments.OneFragment

class FrameLayoutActivity: AppCompatActivity() {

    private lateinit var binding: ActivityFrameLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrameLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.flMain, OneFragment::class.java, null).commit()

    }

}