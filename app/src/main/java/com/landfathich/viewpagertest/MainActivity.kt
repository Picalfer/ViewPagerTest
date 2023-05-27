package com.landfathich.viewpagertest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.landfathich.viewpagertest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        // сделает viewpager2 вертикальным
        binding.viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL

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

        binding.viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                // в этом методе мы можем проверить состояние ViewPager
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int,
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                // этот метод возвращает позицию и скролл
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                // этот метод возвращает текущую страницу
            }
        })

        binding.viewPager2.setPageTransformer { page, position ->
            val pagerHeight = page.height
            page.findViewById<TextView>(R.id.text_view).translationY =
                -position * (pagerHeight / 2) // эффект параллакса
        }
    }
}

