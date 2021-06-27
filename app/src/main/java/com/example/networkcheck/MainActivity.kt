package com.example.networkcheck

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : SuperActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_check.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_check -> {
                if(isInternetAvailable(this)) {
                    tv_status.text = "연결상태"
                } else {
                    tv_status.text = "비연결 상태"
                }
            }
        }
    }


}