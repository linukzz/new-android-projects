package com.example.ex04_02;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin=(Spinner)findViewById(R.id.spinner1);

        ArrayAdapter adapter =
                ArrayAdapter.createFromResource(
                        getApplicationContext(),
                        R.array.planets_array,
                        android.R.layout.simple_spinner_item);

        spin.setAdapter(adapter);
    }
}