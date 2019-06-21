package com.example.hafizaoyunu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.nex3z.togglebuttongroup.SingleSelectToggleGroup
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity()/*, View.OnClickListener, SingleSelectToggleGroup.OnCheckedChangeListener */{

    var checkedIdOyunTuruMain = 0
    var checkedIdZorlukMain = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val oyunTuru = findViewById<SingleSelectToggleGroup>(R.id.oyun_turu)
        //oyunTuru.setOnCheckedChangeListener(this)
        oyunTuru.setOnCheckedChangeListener(SingleSelectToggleGroup.OnCheckedChangeListener {
                group, checkedIdOyunTuru ->
            Log.e("LOGCAT", "onCheckedChanged(): checkedId = $checkedIdOyunTuru")
            checkedIdOyunTuruMain = checkedIdOyunTuru
        })

        val zorluk = findViewById<SingleSelectToggleGroup>(R.id.zorluk)
        zorluk.setOnCheckedChangeListener(SingleSelectToggleGroup.OnCheckedChangeListener {
            group, checkedIdZorluk ->
            Log.e("LOGCAT", "onCheckedChanged(): checkedId = $checkedIdZorluk")
            checkedIdZorlukMain = checkedIdZorluk
        })
        //Log.e("LOGCAT", "onCheckedChanged(): checkedId = $checkedIdZorluk")

        buttonBasla.setOnClickListener {
            if (checkedIdOyunTuruMain == 2131230786 && checkedIdZorlukMain == 2131230819) {
                val intent = Intent(this@MainActivity, EasyActivity::class.java)
                startActivity(intent)
            }
            else if (checkedIdOyunTuruMain == 2131230786 && checkedIdZorlukMain == 2131230949) {
            val intent = Intent(this@MainActivity, MidActivity::class.java)
            startActivity(intent)
        }
            else if (checkedIdOyunTuruMain == 2131230786 && checkedIdZorlukMain == 2131230838) {
            val intent = Intent(this@MainActivity, HardActivity::class.java)
            startActivity(intent)
        }
            else if (checkedIdOyunTuruMain == 2131231054 && checkedIdZorlukMain == 2131230819) {
            val intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)
        }
            else if (checkedIdOyunTuruMain == 2131231054 && checkedIdZorlukMain == 2131230949) {
            val intent = Intent(this@MainActivity, MidTimerActivity::class.java)
            startActivity(intent)
        }
            else if (checkedIdOyunTuruMain == 2131231054 && checkedIdZorlukMain == 2131230838) {
                val intent = Intent(this@MainActivity, MainActivity::class.java)
                startActivity(intent)
            }
            else if (checkedIdOyunTuruMain == 2131230994 && checkedIdZorlukMain == 2131230819) {
                val intent = Intent(this@MainActivity, MainActivity::class.java)
                startActivity(intent)
            }
            else if (checkedIdOyunTuruMain == 2131230994 && checkedIdZorlukMain == 2131230949) {
                val intent = Intent(this@MainActivity, MidMoveActivity::class.java)
                startActivity(intent)
            }
            else if (checkedIdOyunTuruMain == 2131230994 && checkedIdZorlukMain == 2131230838) {
                val intent = Intent(this@MainActivity, MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Secim Yapilmali!", Toast.LENGTH_SHORT).show()
            }

        }




        //buttonBasla.setOnClickListener(this)

    }
/*
    override fun onCheckedChanged(group: SingleSelectToggleGroup?, checkedId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onClick(p0: View?) {
        if(checkedId == 2131230786){
        val intent = Intent(this@MainActivity, MainActivity::class.java)
        startActivity(intent)
    }
    }

*/

}
