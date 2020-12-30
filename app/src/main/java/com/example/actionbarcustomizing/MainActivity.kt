package com.example.actionbarcustomizing

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.actionbarcustomizing.databinding.ActivityMainBinding
import com.example.actionbarcustomizing.databinding.CustomActionbarBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var topBarbinding : CustomActionbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayShowCustomEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(false)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        //layout을 통해 view를 생성한다.
        //val topBar = layoutInflater.inflate(R.layout.custom_actionbar, null)
        topBarbinding = CustomActionbarBinding.inflate(layoutInflater)

        supportActionBar?.customView = topBarbinding.root

        topBarbinding.run {
            textView2.text = "커스텀 액션바"
            textView2.setTextColor(Color.WHITE)

            button.setOnClickListener {
                binding.textView.text = "액션바의 버튼을 눌렀습니다."
            }

        }
    }
}