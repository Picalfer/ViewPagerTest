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
                getColor(R.color.soft_green),
                "Green",
                getColor(R.color.black)
            ),
            PagerItem(
                getColor(R.color.soft_red),
                "Red",
                getColor(R.color.black)
            ),
            PagerItem(
                getColor(R.color.soft_yellow),
                "Yellow",
                getColor(R.color.black)
            )
        )

        // передаем список в адаптер
        pagerAdapter.setItems(pagerItems)
    }
}

