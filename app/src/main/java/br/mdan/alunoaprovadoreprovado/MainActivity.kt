package br.mdan.alunoaprovadoreprovado

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVerificar = Verificar
        val resultado = Resultado

        btnVerificar.setOnClickListener{

            val notaF = Integer.parseInt(NotaF.text.toString())
            val notaS = Integer.parseInt(NotaS.text.toString())
            val media = (notaF + notaS)/2
            val faltas = Integer.parseInt(Faltas.text.toString())
            val nome = Nome.text.toString()

            if (media > 6 && faltas <= 10) {
                resultado.setText(nome + "Aprovado" +
                        "\nMédia: " + media +
                        "\nQuantidade de Faltas: " + faltas )
                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.setText(nome + "Reprovado" +
                        "\nMédia: " + media +
                        "\nQuantidade de Faltas: " + faltas )
                resultado.setTextColor(Color.RED)
            }
        }
    }
}