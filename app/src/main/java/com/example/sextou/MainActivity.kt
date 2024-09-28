package com.example.sextou

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sextou.data.Mock
import com.example.sextou.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        binding.buttonNewDrink.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if(view.id == R.id.button_new_drink){
            handleImageList()
        }
    }

    private fun handleImageList() {

        val handler = Handler(Looper.getMainLooper())

        for (i in 0..10){

            handler.postDelayed({
                val index: Int = Random.nextInt(Mock().listImageDrink.size)
                binding.imageDrink.setImageResource(Mock().listImageDrink[index].src)
            }, i * 500L)
            // val index: Int = Random.nextInt(Mock().listImageDrink.size)
            // binding.imageDrink.setImageResource(Mock().listImageDrink[index].src)
        }
    }


}