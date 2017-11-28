package com.hogo.rahul.machinetaskstringreverse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etString;
    TextView tvReverseString;
    StringBuffer str;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// string from edittext
        etString = findViewById(R.id.et_string);
        tvReverseString = findViewById(R.id.tv_reverse_string);

        etString.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                System.out.println("ONtext changed " + new String(charSequence.toString()));
                str = new StringBuffer(charSequence.toString()).reverse();
                tvReverseString.setText(str);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                System.out.println("ONtext changed " + new String(charSequence.toString()));
                str = new StringBuffer(charSequence.toString()).reverse();
                tvReverseString.setText(str);
            }

            @Override
            public void afterTextChanged(Editable editable) {

                System.out.println("ONtext changed " + new String(editable.toString()));
                str = new StringBuffer(editable.toString()).reverse();
                tvReverseString.setText(str);
            }
        });

    }

}

