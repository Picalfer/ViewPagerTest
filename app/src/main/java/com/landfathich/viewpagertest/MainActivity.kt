package com.landfathich.viewpagertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.landfathich.viewpagertest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        // создаем адаптер
        val pagerAdapter = ViewPagerAdapter()

        // привязываем созданный адаптер к нашему ViewPager, который в разметке
        binding.viewPager2.adapter = pagerAdapter

        // создаем список элементов, который передадим в адаптер
        val pagerItems = listOf<PagerItem>(
            PagerItem(
                ContextCompat.getColor(this, R.color.black),
                "Black",
                ContextCompat.getColor(this, R.color.white)
            ),
            PagerItem(
                ContextCompat.getColor(this, R.color.white),
                "White",
                ContextCompat.getColor(this, R.color.black)
            ),
            PagerItem(
                ContextCompat.getColor(this, R.color.black),
                "Black",
                ContextCompat.getColor(this, R.color.white)
            )
        )

        // передаем список в адаптер
        pagerAdapter.setItems(pagerItems)
    }
}

