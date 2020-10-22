package br.com.heiderlopes.pingpongx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper())
            .postDelayed({
                //Inicia a proxima activity
                startActivity(Intent(this, PlayerActivity::class.java))
                //Finaliza a Activity atual
                finish()
            }, 2000)
    }
}