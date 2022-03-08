package com.woongs.fastclass_study_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_library.*

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        Glide.with(this)
            .load(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(imageview)
    }
}