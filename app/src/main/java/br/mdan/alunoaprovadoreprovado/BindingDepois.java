package br.mdan.alunoaprovadoreprovado;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.mdan.alunoaprovadoreprovado.databinding.ActivityMainBinding;

public class BindingDepois extends AppCompatActivity {

    //private ActivityMainBinding binding;
    //setContentView(binding.getRoot());

    //View viewPrincipal = findViewById(R.id.Nome);
    //System.out.println(viewPrincipal);

    private Button btnVerifica = findViewById(R.id.Verificar);
    public TextView resultado = findViewById(R.id.Resultado);
    public EditText notaF = findViewById(R.id.NotaF);

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding = ActivityMainBinding.inflate(getLayoutInflater());

        btnVerifica.setOnClickListener(view -> {
            resultado.setText("Hello World!");
           // resultado.setText(notaF.getText());

        });
    }
}