package br.edu.ifpb.pob.banco.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var btSalvarContato: Button
    private lateinit var btListaContatos: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btSalvarContato = findViewById(R.id.btFormSalvar)
        this.btListaContatos = findViewById(R.id.btFormListar)
        this.btSalvarContato.setOnClickListener(OnClickAdd())
        this.btListaContatos.setOnClickListener(OnClickListar())

    }

    inner class OnClickAdd : View.OnClickListener {
        override fun onClick(p0: View?) {
            Toast.makeText(this@MainActivity, "Contato Adicionado com sucesso", Toast.LENGTH_LONG)
                .show()
        }
    }
    inner  class OnClickListar: View.OnClickListener{
        override fun onClick(p0: View?) {
            val intent = Intent(this@MainActivity,ListaContatos::class.java)
            if(intent.resolveActivity(packageManager) != null) startActivity(intent)
        }
    }
}
