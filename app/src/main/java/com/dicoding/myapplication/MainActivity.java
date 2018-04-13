package com.dicoding.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
   // ToDo 2 ButterrKnife untuk ngenalin widget
    @BindView(R.id.edt_height)
    EditText etLength;

    //ToDo 3 ButterrKnife untuk ngenalin widget
    @BindView(R.id.edt_width)
    EditText etWidth;

    //ToDo 4 ButterrKnife untuk ngenalin widget
    @BindView(R.id.edt_height)
    EditText etHeight;

    //ToDo 5 ButterrKnife untuk ngenalin widget
    @BindView(R.id.btn_calculate)
    Button btnHasil;

    // ToDo 6 ButterrKnife untuk ngenalin widget
    @BindView(R.id.tv_result)
    EditText tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //Eksekusi Perhitungan
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId()== R.id.btn_calculate){String length = etLength.getText().toString().trim();
                String width = etWidth.getText().toString().trim();
                String height = etHeight.getText().toString().trim();
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(length)) {
                    isEmptyFields = true;
                    etLength.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(width)){
                    isEmptyFields = true;
                    etWidth.setError("Field ini tidak boleh kosong");
                }
                    if (TextUtils.isEmpty(height)){
                        isEmptyFields = true;
                        etHeight.setError("Field ini tidak boleh kosong");
                    }
                    if (!isEmptyFields) {
                        double l = Double.parseDouble(length);
                        double w = Double.parseDouble(width);
                        double h = Double.parseDouble(height);
                        double volume = 1 * w * h;
                        tvHasil.setText(String.valueOf(volume));
                    }
                    }

            }
        });
    }
}
