package org.example.beerandpizza;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteEcho extends AppCompatActivity {

    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidorecho);
        output = (TextView)findViewById(R.id.TextView011);
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitNetwork().build());
        ejecutaCliente();
    }


    private void ejecutaCliente(){
        //String ip = "127.0.0.1";
        String ip = "192.168.1.130";
        //String ip = 158.42.146.127;
        int puerto = 7;
        log ("socket" + ip + puerto);
        try{
            Socket sk = new Socket(ip,puerto);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            PrintWriter salida = new PrintWriter(new OutputStreamWriter(sk.getOutputStream()),true);
            log("enviando.... hola mundo");
            salida.println("hola Mundo");
            log("recibiendo....."   + entrada.readLine());
            sk.close();

        }catch (Exception e ){
            log("error:"  + e.toString());
        }
    }
    private void log(String cadena){
        output.append(cadena + "\n");
    }
}


