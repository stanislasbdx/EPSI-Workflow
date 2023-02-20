package fr.stan1712.epsi.HelloWorld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnNature)
        button.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application, DetailsActivity::class.java);
            startActivity(newIntent);
        })
    }
}