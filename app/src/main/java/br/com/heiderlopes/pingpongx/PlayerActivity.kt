package br.com.heiderlopes.pingpongx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_player.*

class PlayerActivity : AppCompatActivity() {

    val PLACAR_REQUEST_CODE = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        btStart.setOnClickListener {
            val proximaTela = Intent(this, MainActivity::class.java)

            proximaTela.putExtra("PLAYER1", etPlayer1.text.toString())
            proximaTela.putExtra("PLAYER2", etPlayer2.text.toString())

            startActivityForResult(proximaTela, PLACAR_REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode) {
            PLACAR_REQUEST_CODE -> {
                if(resultCode == RESULT_OK) {
                    finish()
                } else if(resultCode == RESULT_CANCELED) {
                    etPlayer1.setText("")
                    etPlayer2.setText("")
                }
            }
            else -> {

            }
        }
    }
}