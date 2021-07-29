package com.abduqodirov.ysm_scn_record_demo

import android.hardware.display.VirtualDisplay
import android.media.MediaRecorder
import android.media.projection.MediaProjection
import android.media.projection.MediaProjectionManager
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private val PERMISSION_CODE = 1
    private val mScreenDensity = 0
    private val mProjectionManager: MediaProjectionManager? = null
    private val DISPLAY_WIDTH = 480
    private val DISPLAY_HEIGHT = 640
    private val mMediaProjection: MediaProjection? = null
    private val mVirtualDisplay: VirtualDisplay? = null
    private val mMediaProjectionCallback: MPRJCallback? = null
    private val mToggleButton: ToggleButton? = null
    private val mMediaRecorder: MediaRecorder? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        mScreenDensity = displayMetrics.densityDpi
    }
}