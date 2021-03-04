package com.example.floorcalculatorbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText edNumberDecimal, edNumberDecimal2, edNumberDecimal3, edNumberDecimal4, edNumberDecimal5, edNumberDecimal6;
    RadioButton rb20, rb19, rb18, rb17, rb16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNumberDecimal = (EditText) findViewById(R.id.editTextNumberDecimal);
        edNumberDecimal2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        edNumberDecimal3 = (EditText) findViewById(R.id.editTextNumberDecimal3);
        edNumberDecimal4 = (EditText) findViewById(R.id.editTextNumberDecimal4);
        edNumberDecimal5 = (EditText) findViewById(R.id.editTextNumberDecimal5);
        edNumberDecimal6 = (EditText) findViewById(R.id.editTextNumberDecimal6);
        rb20 = (RadioButton) findViewById(R.id.radioButton20);
        rb19 = (RadioButton) findViewById(R.id.radioButton19);
        rb18 = (RadioButton) findViewById(R.id.radioButton18);
        rb17 = (RadioButton) findViewById(R.id.radioButton17);
        rb16 = (RadioButton) findViewById(R.id.radioButton16);
    }

    public void calcular(View v) {
        double b, h, a, c, g, r, y, k, s, pt;

        b = Double.parseDouble(edNumberDecimal.getText().toString());
        h = Double.parseDouble(edNumberDecimal2.getText().toString());
        a = (b * h);
        if (rb20.isChecked()) {
            c = (a / 0.16);
            g = (c * 1 / 10);
            r = (a * 1 / 3);
            y = (a * 7);
            k = (a * 1.10 * 15);
            s = (y * 1.86 + r * 18 + k);
            pt = (s);

            edNumberDecimal3.setText(String.valueOf(c));
            edNumberDecimal4.setText(String.valueOf(r));
            edNumberDecimal5.setText(String.valueOf(y));
            edNumberDecimal6.setText(String.valueOf(pt));
        } else {
            if (rb19.isChecked()) {
                c = (a / 0.0625);
                g = (c * 1 / 10);
                r = (a * 1 / 3);
                y = (a * 7);
                k = (a * 1.10 * 29);
                s = (y * 1.86 + r * 18 + k);
                pt = (s);

                edNumberDecimal3.setText(String.valueOf(c));
                edNumberDecimal4.setText(String.valueOf(r));
                edNumberDecimal5.setText(String.valueOf(y));
                edNumberDecimal6.setText(String.valueOf(pt));


            } else {
                if (rb18.isChecked()) {
                    c = (a / 0.2856);
                    g = (c * 1 / 10);
                    r = (a * 1 / 3);
                    y = (a * 7);
                    k = (a * 1.10 * 100);
                    s = (y * 1.86 + r * 18 + k);
                    pt = (s);

                    edNumberDecimal3.setText(String.valueOf(c));
                    edNumberDecimal4.setText(String.valueOf(r));
                    edNumberDecimal5.setText(String.valueOf(y));
                    edNumberDecimal6.setText(String.valueOf(pt));

                } else {
                    if (rb17.isChecked()) {
                        c = (a / 0.0676);
                        g = (c * 1 / 10);
                        r = (a * 1 / 3);
                        y = (a * 7);
                        k = (a * 1.10 * 158);
                        s = (y * 1.86 + r * 18 + k);
                        pt = (s);
                        edNumberDecimal3.setText(String.valueOf(c));
                        edNumberDecimal4.setText(String.valueOf(r));
                        edNumberDecimal5.setText(String.valueOf(y));
                        edNumberDecimal6.setText(String.valueOf(pt));

                    } else {
                        if (rb16.isChecked()) {
                            c = (a / 0.16);
                            g = (c * 1 / 10);
                            r = (a * 1 / 3);
                            y = (a * 7);
                            k = (a * 1.10 * 162);
                            s = (y * 1.86 + r * 18 + k);
                            pt = (s);
                            edNumberDecimal3.setText(String.valueOf(c));
                            edNumberDecimal4.setText(String.valueOf(r));
                            edNumberDecimal5.setText(String.valueOf(y));
                            edNumberDecimal6.setText(String.valueOf(pt));

                        }

                    }
                }


            }


        }

    }
}