package com.example.gestures

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    var gDetector: GestureDetectorCompat? = null
    lateinit var gestureImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gestureImage = findViewById(R.id.imageView)

        this.gDetector = GestureDetectorCompat(this, this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }
    @SuppressLint("SetTextI18n")
    override fun onDown(e: MotionEvent?): Boolean {
        return true
    }

    @SuppressLint("SetTextI18n")
    override fun onShowPress(e: MotionEvent?) {
    }

    @SuppressLint("SetTextI18n")
    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        return true
    }

    @SuppressLint("SetTextI18n")
    override fun onScroll(e1: MotionEvent?, e2: MotionEvent?, distanceX: Float, distanceY: Float): Boolean {
        gestureImage.setImageResource(R.drawable.beach3)
        return true
    }

    @SuppressLint("SetTextI18n")
    override fun onLongPress(e: MotionEvent?) {
    }

    @SuppressLint("SetTextI18n")
    override fun onFling(e1: MotionEvent?, e2: MotionEvent?, velocityX: Float, velocityY: Float): Boolean {
        return true
    }

    @SuppressLint("SetTextI18n")
    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        gestureImage.setImageResource(R.drawable.beach1)
        return true
    }

    @SuppressLint("SetTextI18n")
    override fun onDoubleTap(e: MotionEvent?): Boolean {
        return true
    }

    @SuppressLint("SetTextI18n")
    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        gestureImage.setImageResource(R.drawable.beach2)
        return true
    }
}