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

        val imageUrl = "https://www.google.com/imgres?imgurl=http%3A%2F%2Fmblogthumb4.phinf.naver.net%2FMjAxNzEyMjJfMTQ5%2FMDAxNTEzOTI5NzgzMjky.FtXbEGsBcQj3hXJIcgWPvySmBIVB4taWRzkxFs4Ap-Ig.U1Ilr5GUV0rzWCywkneLUzVBLyq_HtDWoinUITOEbZQg.JPEG.f4040277%2F9.jpg%3Ftype%3Dw800&imgrefurl=http%3A%2F%2Fm.blog.naver.com%2FPostView.nhn%3FblogId%3Df4040277%26logNo%3D221169069426&tbnid=JEvskg6PJ7vg7M&vet=12ahUKEwj834Kv6NXqAhUFx2EKHZ9iDvoQMygRegUIARDMAQ..i&docid=xB0pkdLL7sTQgM&w=800&h=450&q=%EB%A6%AC%ED%8B%80%EB%9D%BC%EC%9D%B4%EC%96%B8&ved=2ahUKEwj834Kv6NXqAhUFx2EKHZ9iDvoQMygRegUIARDMAQ"

        Glide.with(mContext).load(imageUrl).into(profileImg)

    }
}