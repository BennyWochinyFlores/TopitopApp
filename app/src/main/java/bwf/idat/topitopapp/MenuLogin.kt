package bwf.idat.topitopapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bwf.idat.topitopapp.databinding.ActivityMenuLoginBinding

class MenuLogin : AppCompatActivity() {
    private lateinit var binding: ActivityMenuLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMenuLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnlogin.setOnClickListener {
            val intent = Intent(this@MenuLogin, MenuPrincipal::class.java)
            startActivity(intent)
            finish()
        }
    }
}