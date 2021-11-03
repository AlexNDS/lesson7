package practica.lesson7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    var flag=1
        

        val button: Button = findViewById(R.id.button2)
        val button = button:setOnClickListener {
            if (flag==1){flag==2} else (flag==1)
        }

}}