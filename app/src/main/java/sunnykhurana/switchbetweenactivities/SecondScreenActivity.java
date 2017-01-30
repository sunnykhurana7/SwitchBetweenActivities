package sunnykhurana.switchbetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        TextView txtname = (TextView) findViewById(R.id.txtname);
        TextView txtemail = (TextView) findViewById(R.id.txtemail);
        Button btnClose = (Button) findViewById(R.id.btnClose);


        // Receiving the data
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        Log.e("Second Screen", name + "." + email);


        // Displayed Received Data
        txtname.setText(name);
        txtemail.setText(email);

        // Binding Click Event To The Button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // closing second screen activity
                finish();
            }
        });

    }
}
