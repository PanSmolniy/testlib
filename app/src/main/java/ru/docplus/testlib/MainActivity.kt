package ru.docplus.testlib

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import ru.docplus.supertoastlibraryuhaveneverseensmtlikethat.SuperToastClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        var superToast = SuperToastClass().showSuperToast(this)
    }

}
