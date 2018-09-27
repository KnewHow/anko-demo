package com.example.how.anko_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class AnkoComponentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoginBoxUI().setContentView(this)
    }
}

class LoginBoxUI :AnkoComponent<AnkoComponentActivity> {
    private  val customStyle = { v: Any ->
        when(v) {
            is Button -> v.textSize  = 26f
            is EditText -> v.textSize = 24f
        }
    }

    override fun createView(ui: AnkoContext<AnkoComponentActivity>): View = with(ui) {
        verticalLayout{
            padding = dip(32)
            val name = editText{
                hint="LogInBoxComponent"
            }
            val password = editText(InputConstraints.PASSWORD) {
                hint="LogInBoxComponent"
            }
            button("Login In") {
                onClick {

                }
            }
        }.applyRecursively(customStyle)
    }
}
