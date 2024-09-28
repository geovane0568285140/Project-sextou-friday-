package com.example.sextou.data
import com.example.sextou.PreferenceContante
import com.example.sextou.R

data class ImageDrink(val src: Int, val nameDrink: String)

class Mock {

  var listImageDrink = listOf<ImageDrink>(
      ImageDrink(R.mipmap.skol, PreferenceContante.name_drink.Skol),
      ImageDrink(R.mipmap.spaten, PreferenceContante.name_drink.spaten),
      ImageDrink(R.mipmap.amstel, PreferenceContante.name_drink.amstel),
      ImageDrink(R.mipmap.brahma, PreferenceContante.name_drink.brahma),
      ImageDrink(R.mipmap.heineken, PreferenceContante.name_drink.heineken)
    )

}