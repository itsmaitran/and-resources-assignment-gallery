package com.lambdaschool.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create an array of new ImageView objects
        val views = mutableListOf<ImageView>()
            // Step through that list and manually assign drawables to each object in your array.
            views.add(0, ImageView(this))
            views[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
            views.add(1, ImageView(this))
            views[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092))
            views.add(2, ImageView(this))
            views[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847))
            views.add(3, ImageView(this))
            views[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517))
            views.add(4, ImageView(this))
            views[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))
            views.add(5, ImageView(this))
            views[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105))
            views.add(6, ImageView(this))
            views[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))
            views.add(7, ImageView(this))
            views[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))
            views.add(8, ImageView(this))
            views[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965))
            views.add(9, ImageView(this))
            views[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.wallpaper_astronomy_astrophotography_2538107))

        // Copy the ImageView style from styles.xml and paste it into MainActivity.kt as a comment. We'll use this as a reference.
        // <style name="ImageView">
        // <item name="android:layout_width">match_parent</item>
        // <item name="android:layout_height">wrap_content</item>
        // <item name="android:padding">10dp</item>
        // <item name="android:adjustViewBounds">true</item>
        // </style>

        // To apply the height and width, we'll need to create a LayoutParams object and pass in constants to represent match_parent and wrap_content as constructor parameters.
        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        // Create an indexed forEach loop to step through the Views array
        views.forEachIndexed { index, imageView ->
            // Access the entry's layoutParams property and assign it the value of the layoutParams object you created before the loop.
            imageView.layoutParams = layoutParams
            // Access the entry's adjustViewBounds property and assign it the value true.
            imageView.adjustViewBounds = true
            // Call the entry's setPadding method and pass in the values for the padding on each side: left, top, right, bottom.
            imageView.setPadding(10, 10, 10, 10)
            // Finally, decide which column each entry should go on. This can be done with any of a number of simple logic techniques using the index.
            // Whichever you decide. call the parent view's addView method and pass in the entry that you are currently working on.
            if (index % 2 == 0) {
                left_column.addView(imageView)
            } else {
                right_column.addView(imageView)
            }
        }
    }
}
