package com.sourabh.lazyshop

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class LazyShop : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}