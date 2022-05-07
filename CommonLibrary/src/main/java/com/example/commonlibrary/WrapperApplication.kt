package com.example.commonlibrary

import android.app.Application

open class WrapperApplication :Application(){
    lateinit var  wrapperApplication: WrapperApplication
    override fun onCreate() {
        super.onCreate()
        wrapperApplication=this;
    }
}