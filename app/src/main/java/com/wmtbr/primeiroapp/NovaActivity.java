package com.wmtbr.primeiroapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NovaActivity extends AppCompatActivity {
        Button meuBotao;
        Button meuBotao0;
        TextView meuTexto;
        TextView meuTexto0;
        EditText meuEdit;


        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.novo);

            meuTexto0 = (TextView) findViewById(R.id.textView);
            meuTexto = (TextView) findViewById(R.id.editText);
            meuBotao0 = (Button) findViewById(R.id.button2);
            meuBotao = (Button) findViewById(R.id.button3);

            meuBotao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    awesomeButtonClicked();
                }
            });

            meuBotao0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    awesomeButtonClicked0();
                }
            });


        }

        private void awesomeButtonClicked(){
        Toast.makeText(this, meuTexto.getText(), Toast.LENGTH_LONG).show();
    }
    private void awesomeButtonClicked0(){
        Toast.makeText(this, meuTexto0.getText(), Toast.LENGTH_LONG).show();
    }

    }

