package com.example.hafizaoyunu2

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.ImageView
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_mid_timer.*
import java.util.*

class MidTimerActivity : AppCompatActivity(), View.OnClickListener {

    var clickedCardId1: Int? = -1
    var clickedCardId2: Int? = -1
    var sayacTimer = 0


    var resimler = arrayOf(
        R.drawable.ic_001_aquarium,
        R.drawable.ic_001_aquarium,
        R.drawable.ic_003_backpack,
        R.drawable.ic_003_backpack,
        R.drawable.ic_004_basketball,
        R.drawable.ic_004_basketball,
        R.drawable.ic_009_board_games,
        R.drawable.ic_009_board_games,
        R.drawable.ic_011_kid_and_baby,
        R.drawable.ic_011_kid_and_baby,
        R.drawable.ic_012_cafe,
        R.drawable.ic_012_cafe,
        R.drawable.ic_013_camera,
        R.drawable.ic_013_camera,
        R.drawable.ic_015_cocktail,
        R.drawable.ic_015_cocktail,
        R.drawable.ic_024_golf,
        R.drawable.ic_024_golf,
        R.drawable.ic_026_ice_cream,
        R.drawable.ic_026_ice_cream,
        R.drawable.ic_027_joystick,
        R.drawable.ic_027_joystick,
        R.drawable.ic_033_music_player,
        R.drawable.ic_033_music_player,
        R.drawable.ic_034_woods,
        R.drawable.ic_034_woods,
        R.drawable.ic_035_painting,
        R.drawable.ic_035_painting,
        R.drawable.ic_043_surfing_board,
        R.drawable.ic_043_surfing_board,
        R.drawable.ic_044_tent,
        R.drawable.ic_044_tent,
        R.drawable.ic_045_theatre,
        R.drawable.ic_045_theatre,
        R.drawable.ic_050_walking,
        R.drawable.ic_050_walking
    )
    // Shuffle the elements in the array
    val shuffledResimler = Arrays.asList(*resimler)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mid_timer)

        Collections.shuffle(shuffledResimler)


        // en iyi yazim
        imageView11.setOnClickListener(this)
        imageView12.setOnClickListener(this)
        imageView13.setOnClickListener(this)
        imageView14.setOnClickListener(this)
        imageView15.setOnClickListener(this)
        imageView16.setOnClickListener(this)
        imageView21.setOnClickListener(this)
        imageView22.setOnClickListener(this)
        imageView23.setOnClickListener(this)
        imageView24.setOnClickListener(this)
        imageView25.setOnClickListener(this)
        imageView26.setOnClickListener(this)
        imageView31.setOnClickListener(this)
        imageView32.setOnClickListener(this)
        imageView33.setOnClickListener(this)
        imageView34.setOnClickListener(this)
        imageView35.setOnClickListener(this)
        imageView36.setOnClickListener(this)
        imageView41.setOnClickListener(this)
        imageView42.setOnClickListener(this)
        imageView43.setOnClickListener(this)
        imageView44.setOnClickListener(this)
        imageView45.setOnClickListener(this)
        imageView46.setOnClickListener(this)
        imageView51.setOnClickListener(this)
        imageView52.setOnClickListener(this)
        imageView53.setOnClickListener(this)
        imageView54.setOnClickListener(this)
        imageView55.setOnClickListener(this)
        imageView56.setOnClickListener(this)
        imageView61.setOnClickListener(this)
        imageView62.setOnClickListener(this)
        imageView63.setOnClickListener(this)
        imageView64.setOnClickListener(this)
        imageView65.setOnClickListener(this)
        imageView66.setOnClickListener(this)
        imageView11.setTag(shuffledResimler[0])
        imageView12.setTag(shuffledResimler[1])
        imageView13.setTag(shuffledResimler[2])
        imageView14.setTag(shuffledResimler[3])
        imageView15.setTag(shuffledResimler[4])
        imageView16.setTag(shuffledResimler[5])
        imageView21.setTag(shuffledResimler[6])
        imageView22.setTag(shuffledResimler[7])
        imageView23.setTag(shuffledResimler[8])
        imageView24.setTag(shuffledResimler[9])
        imageView25.setTag(shuffledResimler[10])
        imageView26.setTag(shuffledResimler[11])
        imageView31.setTag(shuffledResimler[12])
        imageView32.setTag(shuffledResimler[13])
        imageView33.setTag(shuffledResimler[14])
        imageView34.setTag(shuffledResimler[15])
        imageView35.setTag(shuffledResimler[16])
        imageView36.setTag(shuffledResimler[17])
        imageView41.setTag(shuffledResimler[18])
        imageView42.setTag(shuffledResimler[19])
        imageView43.setTag(shuffledResimler[20])
        imageView44.setTag(shuffledResimler[21])
        imageView45.setTag(shuffledResimler[22])
        imageView46.setTag(shuffledResimler[23])
        imageView51.setTag(shuffledResimler[24])
        imageView52.setTag(shuffledResimler[25])
        imageView53.setTag(shuffledResimler[26])
        imageView54.setTag(shuffledResimler[27])
        imageView55.setTag(shuffledResimler[28])
        imageView56.setTag(shuffledResimler[29])
        imageView61.setTag(shuffledResimler[30])
        imageView62.setTag(shuffledResimler[31])
        imageView63.setTag(shuffledResimler[32])
        imageView64.setTag(shuffledResimler[33])
        imageView65.setTag(shuffledResimler[34])
        imageView66.setTag(shuffledResimler[35])

        val animation = ObjectAnimator.ofInt(progressbar, "progress", 100,0)
        animation.duration = 50000
        animation.interpolator = DecelerateInterpolator()
        animation.addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animator: Animator) {}

            override fun onAnimationEnd(animator: Animator) {
                val intent = Intent(this@MidTimerActivity, LoseActivity::class.java)
                startActivity(intent)
            }

            override fun onAnimationCancel(animator: Animator) {}

            override fun onAnimationRepeat(animator: Animator) {}
        })
        animation.start()
    }



    override fun onClick(v: View?) {

        sayacTimer++
        Log.e("LOGCAT","Sayac: $sayacTimer")

        when (v?.id) {

            R.id.imageView11 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[0])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(findViewById(R.id.imageView11))
            }
            R.id.imageView12 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[1])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView13 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[2])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView14 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[3])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView15 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[4])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView16 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[5])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView21 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[6])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView22 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[7])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView23 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[8])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView24 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[9])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView25 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[10])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView26 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[11])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView31 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[12])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView32 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[13])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView33 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[14])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView34 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[15])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView35 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[16])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView36 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[17])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView41 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[18])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView42 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[19])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView43 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[20])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView44 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[21])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView45 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[22])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView46 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[23])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView51 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[24])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView52 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[25])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView53 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[26])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView54 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[27])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView55 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[28])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView56 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[29])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView61 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[30])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView62 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[31])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView63 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[32])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView64 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[33])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView65 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[34])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }
            R.id.imageView66 -> {
                v as ImageView
                v.setImageResource(shuffledResimler[35])
                v.isClickable = false
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(v)
            }

        }



        if (clickedCardId1 == -1) {
            clickedCardId1 = v?.id
        } else if (clickedCardId1 != -1 && clickedCardId2 == -1) {
            clickedCardId2 = v?.id

            if (findViewById<ImageView>(clickedCardId1!!).tag == findViewById<ImageView>(clickedCardId2!!).tag) {
                //findViewById<ImageView>(clickedCardId1!!).setImageResource(R.drawable.ic_check_green)
                //findViewById<ImageView>(clickedCardId2!!).setImageResource(R.drawable.ic_check_green)
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(findViewById(clickedCardId1!!))
                YoYo.with(Techniques.FlipInY)
                    .duration(1000)
                    .playOn(findViewById(clickedCardId2!!))
                findViewById<ImageView>(clickedCardId1!!).visibility = View.INVISIBLE
                findViewById<ImageView>(clickedCardId2!!).visibility = View.INVISIBLE
            }
        } else {
            findViewById<ImageView>(clickedCardId1!!).setImageResource(R.drawable.ic_question)
            findViewById<ImageView>(clickedCardId2!!).setImageResource(R.drawable.ic_question)
            YoYo.with(Techniques.FlipInY)
                .duration(1000)
                .playOn(findViewById(clickedCardId1!!))
            YoYo.with(Techniques.FlipInY)
                .duration(1000)
                .playOn(findViewById(clickedCardId2!!))


            findViewById<ImageView>(clickedCardId1!!).isClickable = true
            findViewById<ImageView>(clickedCardId2!!).isClickable = true

            clickedCardId1 = v?.id
            clickedCardId2 = -1
        }


    }
}