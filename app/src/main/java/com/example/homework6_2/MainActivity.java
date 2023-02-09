package com.example.homework6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnOk;
    private EditText edtEmail, edtPassword;
    private TextView txt1, txtHello, txtRegister, txtForgot, txtTouch;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk = findViewById(R.id.button);
        edtPassword = findViewById(R.id.edit_password);
        edtEmail = findViewById(R.id.edit_text2);
        txtForgot = findViewById(R.id.txt_password);
        txtTouch = findViewById(R.id.txt_touch);
        txtRegister = findViewById(R.id.txt_password1);
        txtHello = findViewById(R.id.txt_password2);
        txt1 = findViewById(R.id.txt_password3);


        btnOk.setOnClickListener(view -> {
            if(edtEmail.getText().toString().equals("admin") &&
                    edtPassword.getText().toString().equals("admin")){
                btnOk.setVisibility(View.INVISIBLE);
                edtPassword.setVisibility(View.INVISIBLE);
                edtEmail.setVisibility(View.INVISIBLE);
                txt1.setVisibility(View.INVISIBLE);
                txtRegister.setVisibility(View.INVISIBLE);
                txtHello.setVisibility(View.VISIBLE);
                txtTouch.setVisibility(View.INVISIBLE);
                txtForgot.setVisibility(View.INVISIBLE);

                Toast.makeText(this, "Вы успешно прошли регистрацию!",
                        Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Вы ввели неправильно Email или Password!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        edtEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                btnOk.setBackground(getDrawable(R.drawable.bc_btn_orange));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }




}