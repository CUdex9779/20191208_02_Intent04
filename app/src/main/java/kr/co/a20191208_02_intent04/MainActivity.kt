package kr.co.a20191208_02_intent04

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialBtn.setOnClickListener {
//            누구에게 전화를 걸리 정보를 미리 명시
            val uri = Uri.parse("tel:010-1111-2222")
//            어느 화면을 넘겨줄지 명시
            val Intent = Intent(Intent.ACTION_DIAL,uri)
            startActivity(Intent)
        }

//        callBtn.setOnClickListener {
//            val uri = Uri.parse("tel:010-1111-2222")
//            val Inte = Intent(Intent.ACTION_CALL,uri)
//            startActivity(Inte)
//        }

        smsBtn.setOnClickListener {
            val uri = Uri.parse("smsto:${smsNumEdt.text.toString()}")

            val inte = Intent(Intent.ACTION_SENDTO,uri)

            inte.putExtra("sms_body","광고 문구 입력하자")

            startActivity(inte)
        }

        naverBtn.setOnClickListener {
            val uri = Uri.parse("https://naver.com")
            val intent = Intent(Intent.ACTION_VIEW , uri)
            startActivity(intent)
        }

        kakaoAppBtn.setOnClickListener {
            val uri = Uri.parse("market://details?id=com.kakao.talk")
            val intent = Intent(Intent.ACTION_VIEW , uri)
            startActivity(intent)
        }

    }
}
