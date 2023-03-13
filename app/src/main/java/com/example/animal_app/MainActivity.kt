package com.example.animal_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animal_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
      setContentView(binding.root)

        val dog = Animals(getString(R.string.dog_name),getString(R.string.descr_dog),R.drawable.dog)
        val cat = Animals(getString(R.string.cat_name),getString(R.string.descr_cat),R.drawable.cat)
        val ara = Animals(getString(R.string.ara_name),getString(R.string.descr_ara),R.drawable.ara)

        binding.buttonDog.setOnClickListener {
            val i = Intent(this, Description:: class.java)
            i.putExtra(ANIMAL,dog)
            startActivity(i)
        }
        binding.buttonCat.setOnClickListener {
            val i = Intent(this, Description:: class.java)
            i.putExtra(ANIMAL,cat)
            startActivity(i)
        }
        binding.buttonAra.setOnClickListener {
            val i = Intent(this, Description:: class.java)
            i.putExtra(ANIMAL,ara)
            startActivity(i)
        }
    }
    companion object{
        const val ANIMAL = "Key_animal"
    }
}