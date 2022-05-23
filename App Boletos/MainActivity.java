package com.example.boletos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText txtNumeroBoleto;
    private EditText txtNombreCliente;
    private EditText txtEdad;
    private EditText txtFecha;
    private Spinner spnDestinos;
    private Spinner spnTipoBoleto;
    private EditText txtPrecio;

    private Button btnCalular;

    private TextView lblNumeroBoleto2;
    private TextView lblNombreCliente2;
    private TextView lblEdad2;
    private TextView lblFecha2;
    private TextView lblDestinos2;
    private TextView lblTipoBoleto2;
    private TextView lblPrecio2;
    private TextView lblSubTotal;
    private TextView lblTotal;
    private TextView lblDescuento;
    private TextView lblImpuesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumeroBoleto = (EditText) findViewById(R.id.txtNumeroBoleto);
        txtNombreCliente = (EditText) findViewById(R.id.txtNombreCliente);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtFecha = (EditText) findViewById(R.id.txtFecha);
        spnDestinos = (Spinner) findViewById(R.id.spnDestinos);
        spnTipoBoleto = (Spinner) findViewById(R.id.spnTipoBoleto);
        txtPrecio = (EditText) findViewById(R.id.txtPrecio);

        lblNumeroBoleto2 = (TextView) findViewById(R.id.lblNumeroBoleto2);
        lblNombreCliente2 = (TextView) findViewById(R.id.lblNombreCliente2);
        lblEdad2 = (TextView) findViewById(R.id.lblEdad2);
        lblFecha2 = (TextView) findViewById(R.id.lblFecha2);
        lblDestinos2 = (TextView) findViewById(R.id.lblDestinos2);
        lblTipoBoleto2 = (TextView) findViewById(R.id.lblTipoBoleto2);
        lblPrecio2 = (TextView) findViewById(R.id.lblPrecio2);

        lblSubTotal = (TextView) findViewById(R.id.lblSubTotal);
        lblTotal = (TextView) findViewById(R.id.lblTotal);
        lblDescuento = (TextView) findViewById(R.id.lblDescuento);
        lblImpuesto = (TextView) findViewById(R.id.lblImpuesto);

        btnCalular = (Button) findViewById(R.id.btnCalcular);

        final String [] destinos = {""};
        final int [] tipodeViaje = {0};

        Boletos boleto = new Boletos();

        btnCalular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float subTotal;
                float descuento;
                float iva;
                float total;

                String numerodeBoleto = txtNumeroBoleto.getText().toString();
                boleto.setNumerodeBoleto(Integer.parseInt(numerodeBoleto));

                String nombreCliente = txtNombreCliente.getText().toString();
                boleto.setNombreCliente(nombreCliente);

                String edad = txtEdad.getText().toString();

                String fecha = txtFecha.getText().toString();
                boleto.setFecha(fecha);

                boleto.setDestino(destinos[0]);

                boleto.setTipodeViaje(tipodeViaje[0]);

                String precio = txtPrecio.getText().toString();
                boleto.setPrecio(Float.valueOf(precio));

                subTotal = boleto.CalcularSubtotal();

                descuento = boleto.CalcularDescuento(Integer.parseInt(edad));

                iva = boleto.CalcularIVA();

                total = boleto.CalcularTotal();


                //Imprimir datos
                lblNumeroBoleto2.setText("No°: " + boleto.getNumerodeBoleto());
                lblNombreCliente2.setText("Nombre: " + boleto.getNombreCliente());
                lblEdad2.setText("Edad " + edad);
                lblFecha2.setText("Fecha: "+ boleto.getFecha());
                lblDestinos2.setText("Destino: " + boleto.getDestino());
                lblTipoBoleto2.setText("Tipo de Boleto: "+ boleto.getTipodeViaje());
                lblPrecio2.setText("Precio: " + boleto.getPrecio());
                lblSubTotal.setText("Subtotal: "+subTotal);
                lblImpuesto.setText("Impuesto: " + iva);
                lblDescuento.setText("Descuento: " + descuento);
                lblTotal.setText("Total: " + total);
            }
        });


        ArrayAdapter<String> Adpt1 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.destinos));
        spnDestinos.setAdapter(Adpt1);
        spnDestinos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                destinos[0] = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String> Adpt2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.tipoBoleto));
        spnTipoBoleto.setAdapter(Adpt2);
        spnTipoBoleto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String tipo = adapterView.getItemAtPosition(i).toString();
                if (tipo.matches("Sencillo")) {
                    tipodeViaje [0] = 1;
                } else if (tipo.matches("Doble")){
                    tipodeViaje [0] = 2;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}