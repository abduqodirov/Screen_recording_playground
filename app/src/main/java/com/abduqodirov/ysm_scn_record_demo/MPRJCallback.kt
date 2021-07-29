package com.abduqodirov.ysm_scn_record_demo

import android.media.projection.MediaProjection
import timber.log.Timber

class MPRJCallback : MediaProjection.Callback() {

    override fun onStop() {
        super.onStop()

        Timber.d("onStop chaqirildi")
    }
}