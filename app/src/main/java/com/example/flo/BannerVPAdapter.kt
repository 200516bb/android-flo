package com.example.flo

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class BannerVPAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    private val fragmentlist : ArrayList<Fragment> = ArrayList() //이 클래스 안에서만 사용하기 때문에 private

//    override fun getItemCount(): Int { // 데이터 몇개를 전달할 것인지
//        return fragmentlist.size
//    }

    override fun getItemCount(): Int = fragmentlist.size // 한 줄일땐 이렇게 사용 가능

    override fun createFragment(position: Int): Fragment = fragmentlist[position]

    fun addFragment(fragment: Fragment){
        fragmentlist.add(fragment) // 인자로 받은 fragment를 fragmentlist에 추가
        notifyItemInserted(fragmentlist.size-1) // index 값 / viewpager에게 새로 추가됐음을 알림
    }


}