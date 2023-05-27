package com.landfathich.viewpagertest.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.landfathich.viewpagertest.databinding.ItemCityBinding
import com.landfathich.viewpagertest.models.PagerCityItem

class PagerViewCityHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun onBind(item: PagerCityItem, itemBinding: ItemCityBinding) {
        with(itemBinding) {
            imageView.setImageDrawable(item.photo)
            cardView.setBackgroundColor(item.cardColor)
            textView.setTextColor(item.textColor)
            textView.text = item.text
        }
    }
}