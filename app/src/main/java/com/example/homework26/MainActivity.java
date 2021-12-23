package com.example.homework26;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView t1, t2, t3;
    private EditText gmail, password;
    String gmail1 = "admin";
    String password1 = "admin";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn_send);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.btn_send3);
        t3 = findViewById(R.id.t5);
        gmail = findViewById(R.id.editText1);
        password = findViewById(R.id.btn_send2);


//        TextView String = (TextView) findViewById(R.id.String);
//        TextView password = (TextView) findViewById(R.id.password);
//        Button button = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gmail.getText().toString().equals(gmail1) &&
                        password.getText().toString().equals(password1)) {
                    gmail.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    t3.setVisibility(View.GONE);
                    btn.setVisibility(View.GONE);
                    t1.setVisibility(View.GONE);

                    Toast.makeText
                            (MainActivity.this, " Вы успешно зарегестрировались",
                                    Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText
                            (MainActivity.this, " Не верный пароль,почта !!! ",
                                    Toast.LENGTH_SHORT).show();

            }
        });
        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (gmail.getText().toString().length() > 0) {
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));

                } else {
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }

            }
        });


    }
}