package fr.mc.myapplication.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fr.mc.myapplication.R
import kotlinx.android.synthetic.main.activity_main.first_button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // In Kotlin it's better to use camelCase id for using it in the code
        first_button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_from_bottom, 0)
                .replace(R.id.fragment_container, FirstFragment())
                .commit()
        }
    }
}