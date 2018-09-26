package com.example.how.anko_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*

class LayoutParamsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        linearLayout {
            button("Login") {
                textSize = 26f
            }.lparams(width = wrapContent) {
                horizontalMargin = dip(5)
                topMargin = dip(20)
            }
        }
    }
}
