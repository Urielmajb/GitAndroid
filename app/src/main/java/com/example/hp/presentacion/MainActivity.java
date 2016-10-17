package com.example.hp.presentacion;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    TextView mNombre;
    TextView mNombre_Completo;
    TextView mApellido;
    TextView mApellido_Completo;
    TextView mEdad;
    TextView mEdad_Com;
    TextView mNacionalidad;
    TextView mNacionalidad_Completa;
    TextView mSexo;
    TextView mSexoF;
    TextView mCarrera;
    TextView mCarreaCom;
    TextView mLugar;
    TextView mUCA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNombre= (TextView) findViewById(R.id.txt1);
        mNombre.setTextColor(Color.BLUE);
        mNombre_Completo= (TextView) findViewById(R.id.txt2);
        mApellido = (TextView) findViewById(R.id.txt3);
        mApellido.setTextColor(Color.BLUE);
        mApellido_Completo = (TextView) findViewById(R.id.txt4);
        mEdad = (TextView) findViewById(R.id.txt5);
        mEdad.setTextColor(Color.BLUE);
        mEdad_Com = (TextView) findViewById(R.id.txt6);
        mNacionalidad = (TextView) findViewById(R.id.txt7);
        mNacionalidad.setTextColor(Color.BLUE);
        mNacionalidad_Completa = (TextView) findViewById(R.id.txt8);
        mSexo = (TextView) findViewById(R.id.txt9);
        mSexo.setTextColor(Color.BLUE);
        mSexoF = (TextView) findViewById(R.id.txt10);
        mCarrera = (TextView) findViewById(R.id.txt11);
        mCarrera.setTextColor(Color.BLUE);
        mCarreaCom = (TextView) findViewById(R.id.txt12);
        mLugar = (TextView) findViewById(R.id.txt13);
        mLugar.setTextColor(Color.BLUE);
        mUCA = (TextView) findViewById(R.id.txt14);
        ImageView mImagen = (ImageView) findViewById(R.id.imageView2);


    }
}
