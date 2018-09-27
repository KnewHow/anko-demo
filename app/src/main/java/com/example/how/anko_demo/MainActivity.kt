package com.example.how.anko_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val name= "How"
        super.onCreate(savedInstanceState)
        verticalLayout {
            padding = dip(30)
            editText {
                hint = "Name"
                textSize = 24f
            }
            editText(name) {
                hint = "Password"
                textSize = 24f
            }.topPadding=dip(10)
            button("Login") {
                textSize = 26f
                onClick  { startActivity<LayoutParamsActivity>("id" to 5)}
            }
        }
    }
}
