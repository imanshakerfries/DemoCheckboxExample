package sg.edu.rp.c346.id21014919.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnChecked;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.cbEnable);
        btnChecked = findViewById(R.id.btnCheck);
        tvShow = findViewById(R.id.tvShow);

        btnChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();

                if(cbEnabled.isChecked() == true) {
                    tvShow.setText("The discount is given");
                } else {
                    tvShow.setText("The discount is not given");

            }
        };

    });
    }}