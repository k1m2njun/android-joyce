package com.example.activityandfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class RedFragment : Fragment() {
    // 프래그먼트 레이아웃 작성
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_red, container, false)
        // layout
        // container: 부모 view - 여기에서는 activity_two_color.frame_layout
        // attachToRoot: fragment 자동 추가 ? false
    }
}