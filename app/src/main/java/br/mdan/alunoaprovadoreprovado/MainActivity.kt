package br.mdan.alunoaprovadoreprovado

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

        //val btnVerificar = Verificar
        //val resultado = Resultado

        private fun setListeners() {
            Verificar.setOnClickListener {
                mostrar(NotaF.text.toString(), NotaS.text.toString(), Faltas.text.toString())
            }
        }

        private fun mostrar(
            notaF: String,
            notaS: String,
            faltas: String,
        ) {
            //val notaF = Integer.parseInt(NotaF.text.toString())
            //val notaS = Integer.parseInt(NotaS.text.toString())
            //val media = (notaF + notaS) / 2
            //val faltas = Integer.parseInt(Faltas.text.toString())
            //val nome = Nome.text.toString()

            val notaF = notaF.toFloatOrNull()
            val notaS = notaS.toFloatOrNull()
            val faltas = faltas.toFloatOrNull()
            val nome = Nome.text.toString()

            if (notaF != null && notaS != null && faltas != null && nome != null) {
                val media = (notaF + notaS) / 2
                if (media > 6 && faltas <= 10) {
                    Resultado.setText(
                        nome + " Aprovado" +
                                "\nMédia: " + media +
                                "\nQuantidade de Faltas: " + faltas
                    )
                    Resultado.setTextColor(Color.GREEN)
                } else {
                    Resultado.setText(
                        nome + " Reprovado" +
                                "\nMédia: " + media +
                                "\nQuantidade de Faltas: " + faltas
                    )
                    Resultado.setTextColor(Color.RED)
                }
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "Insira os Valores Solicitados!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
}