package org.example.beerandpizza;



import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {

        //DECLARACION DE VARIABLES
        private ListView lista;
        private Button sugerencias1;
        private TextView output;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);








            //INSTANCIAR OBJETOS DE XML A JAVA
            lista = findViewById(R.id.opciones);

            //MÉTODO QUE NOS PERMITE ACCEDER A UN ACTIVITY SEGUN LA SELECCIÓN HECHA
            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                             @Override
                                             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                 //SE EVALÚA QUE LA SELECCIÓN NO FUESE NULA
                                                 if(position != -1) {
                                                     //En caso de ser cualquier opcion, excepto por el carrito, envía al Activity2

                                                     if (position != 2) {
                                                         Intent intento = new Intent(MainActivity.this, Activity2.class);
                                                         intento.putExtra("posicion", position);
                                                         startActivity(intento);


                                                     } else {//Caso contratio envía al ActivityStore que muestra el carrito
                                                         Intent intento = new Intent(MainActivity.this, ActivityStore.class);
                                                         startActivity(intento);

                                                     }//Fin If
                                                 }//Fin If
                                             }//Fin onItemClick()
                                         }//Fin setOnItem..
            );

        }//Fin onCreate()



        public void lanzarsuperpizza (View view) {
            Intent i = new Intent(this, Superpizza.class);
            startActivity(i);

        }


        public void lanzaranimacion(View view) {
            Intent i = new Intent(this, Animacion.class);
            startActivity(i);

        }


        public void mandarCorreo(View view){
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT, "asunto");
            i.putExtra(Intent.EXTRA_TEXT, "texto correo");
            i.putExtra(Intent.EXTRA_EMAIL, new String[]{"sugerencias@beerandpizza.es"});
            startActivity(i);
        }










}//F