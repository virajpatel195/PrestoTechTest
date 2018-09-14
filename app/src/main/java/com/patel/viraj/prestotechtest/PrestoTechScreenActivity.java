package com.patel.viraj.prestotechtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.patel.viraj.prestotechtest.Model.SockModel;

import java.util.ArrayList;

public class PrestoTechScreenActivity extends AppCompatActivity {
    EditText edtTxtInput;
    TextView txtOutput, txtBonusOutput;
    Button btnRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presto_tech_screen);
        initialization();
        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtBonusOutput.setText("Expected output: \n" + SockModel.oppositeSockSeparator(SockModel.sockParser(edtTxtInput.getText().toString().trim())));
                txtOutput.setText("Expected bonus output: \n" + SockModel.sockSeparator(SockModel.sockParser(edtTxtInput.getText().toString())));

            }
        });
    }

    void initialization() {
        btnRun = (Button) findViewById(R.id.btnRun);
        edtTxtInput = (EditText) findViewById(R.id.edtTextInput);
        txtOutput = (TextView) findViewById(R.id.textOutput);
        txtBonusOutput = (TextView) findViewById(R.id.textBonusOutput);
    }
}
