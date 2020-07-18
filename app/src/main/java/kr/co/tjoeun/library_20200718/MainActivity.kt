package kr.co.tjoeun.library_20200718

import android.content.Intent
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        goToPhotoViewBtn.setOnClickListener {

            val myIntent = Intent(mContext, ProfilePhotoActivity::class.java)
            startActivity(myIntent)

        }
    }

    override fun setValues() {

        val imageUrl = "https://lh3.googleusercontent.com/proxy/lR_uVCo_jm9X87EHg7nOS-LkOoQYMQ3J8zz8ed0PHCj2hy0YYtIFoaZ1lCHW0pUYWdaDGPV2IGVHO6_BmxG6FiYhd05DRYSGhYEsiu9yteen_OdcBuIGJ_zuT0272PggHhmQhYdZfOJo0DHhHH7BVZzZE-sxSikwkVdXTK4DUfrHCQECAOIDRABTHmY6AlLZjOACl1elqVGVDMuPFSPwlyKxcpqizt1yzvqj_xOSiM_hZJiIOc12jPOoH4joJzCyTcQWM66KYvcFIg-6aClxulo27SSN9GbY6Q"

        Glide.with(mContext).load(imageUrl).into(profileImg)

    }
}