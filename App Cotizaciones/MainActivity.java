package com.example.cotizaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumeroCotizacion;
    private EditText txtDescripcion;
    private EditText txtPrecio;
    private EditText txtPorcentajeIni;
    private EditText txtPlazo;

    private Button btnCalcular;

    private TextView lblNumerodeCotizacion;
    private TextView lblDescripcion;
    private TextView lblPrecio;
    private TextView lblPorcentajeIni;
    private TextView lblPlazo;


    private TextView lblPagoInicial;
    private TextView lblTotalaFin;
    private TextView lblPagoMensual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumeroCotizacion = (EditText) findViewById(R.id.txtNumeroCotizacion);
        txtDescripcion = (EditText) findViewById(R.id.txtDescripcion);
        txtPrecio = (EditText) findViewById(R.id.txtPrecio);
        txtPorcentajeIni = (EditText) findViewById(R.id.txtPorcentajeIni);
        txtPlazo = (EditText) findViewById(R.id.txtPlazo);

        lblNumerodeCotizacion = (TextView) findViewById(R.id.lblNumerodeCotizacion);
        lblDescripcion = (TextView) findViewById(R.id.lblDescripcion);
        lblPrecio = (TextView) findViewById(R.id.lblPrecio);
        lblPorcentajeIni = (TextView) findViewById(R.id.lblPorcentajeIni);
        lblPlazo = (TextView) findViewById(R.id.lblPlazo);
        lblPagoInicial = (TextView) findViewById(R.id.lblPagoInicial);
        lblTotalaFin = (TextView) findViewById(R.id.lblTotalaFin);
        lblPagoMensual = (TextView) findViewById(R.id.lblPagoMensual);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        Cotizaciones cotizacion = new Cotizaciones();

        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w) {
                float pagoInicial;
                float totalaFin;
                float pagoMensual;

                String numerodeCotizacion = txtNumeroCotizacion.getText().toString();
                cotizacion.setNumerodeCotizacion(Integer.parseInt(numerodeCotizacion));

                String descripcion = txtDescripcion.getText().toString();
                cotizacion.setDescripcion(descripcion);

                String precio = txtPrecio.getText().toString();
                cotizacion.setPrecio(Float.valueOf(precio));

                String porcentajeIni = txtPorcentajeIni.getText().toString();
                cotizacion.setPorcentajeInicial(Float.valueOf(porcentajeIni));


                String plazo = txtPlazo.getText().toString();
                cotizacion.setPlazo(Integer.parseInt(plazo));

                pagoInicial = cotizacion.CalcularPagoInicial();

                totalaFin = cotizacion.CalcularTotalaFin();

                pagoMensual = cotizacion.PagoMensual();


                //Imprimir datos
                lblNumerodeCotizacion.setText("# " + cotizacion.getNumerodeCotizacion());
                lblDescripcion.setText("Descripción: " + cotizacion.getDescripcion());
                lblPrecio.setText("Precio del auto: " + cotizacion.getPrecio());
                lblPorcentajeIni.setText("Porcentaje: " + cotizacion.getPorcentajeInicial());
                lblPlazo.setText("Plazo: " + cotizacion.getPlazo());
                lblPagoInicial.setText("Pago incial: " + pagoInicial);
                lblTotalaFin.setText("Total a financiar: " + totalaFin);
                lblPagoMensual.setText("Pago mensual " + pagoMensual);
            }
        });
    }
   }