package com.abduqodirov.ysm_scn_record_demo

import android.app.Application
import timber.log.Timber

class ScrApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}