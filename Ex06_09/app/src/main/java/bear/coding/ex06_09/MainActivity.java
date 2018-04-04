package bear.coding.ex06_09;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    EditText editName;
    EditText editAge;
    EditText editAddress;
    Button btnSend;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText)findViewById(R.id.editName);
        editAge = (EditText)findViewById(R.id.editAge);
        editAddress = (EditText)findViewById(R.id.editAddress);
        btnSend = (Button)findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editName.getText().toString();
                String Age = editAge.getText().toString();
                String Address = editAddress.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                bundle.putInt("Age", Integer.parseInt(Age));
                bundle.putString("Adress", Address);

                Intent intent = new Intent(getApplicationContext(), NextActivity.class);

                intent.putExtra("bundle", bundle);

                startActivity(intent);

            }
        });
    }
}
