package com.example.animal_app

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animal_app.databinding.ActivityDescriptionBinding
import com.example.animal_app.databinding.ActivityMainBinding

class Description : AppCompatActivity() {
    private lateinit var binding : ActivityDescriptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var animal = intent.getParcelableExtra<Animals>(MainActivity.ANIMAL)
        title=animal?.name

        binding.textDescription.text= animal!!.decsr
        binding.imageAnimals.setImageResource(animal.img)
    }
}