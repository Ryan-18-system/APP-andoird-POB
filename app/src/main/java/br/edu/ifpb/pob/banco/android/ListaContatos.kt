package br.edu.ifpb.pob.banco.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaContatos : AppCompatActivity() {
    private lateinit var btRetornar : FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_contatos)
        this.btRetornar = findViewById(R.id.btRetornar)

        this.btRetornar.setOnClickListener {
            finish()
        }
    }
}