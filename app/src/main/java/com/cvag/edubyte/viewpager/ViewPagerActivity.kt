package com.cvag.edubyte.ui

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.cvag.edubyte.R
import com.cvag.edubyte.viewpager.DotIndicatorPagerAdapter
import com.cvag.edubyte.viewpager.ZoomOutPageTransformer
import kotlinx.android.synthetic.main.fragment_home.view_pager
import kotlinx.android.synthetic.main.fragment_home.worm_dots_indicator

class ViewPagerActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    requestWindowFeature(Window.FEATURE_NO_TITLE)
    window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
    setContentView(R.layout.fragment_home)

    with(view_pager) {
      adapter = DotIndicatorPagerAdapter()
      setPageTransformer(true, ZoomOutPageTransformer())

//      dots_indicator.setViewPager(this)
//      spring_dots_indicator.setViewPager(this)
      worm_dots_indicator.setViewPager(this)
    }
  }
}
