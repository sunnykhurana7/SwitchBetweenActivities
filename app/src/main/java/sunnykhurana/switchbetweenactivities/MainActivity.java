package sunnykhurana.switchbetweenactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editname, editemail;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editname = (EditText) findViewById(R.id.editname);
        editemail = (EditText) findViewById(R.id.editemail);
        btnSend = (Button) findViewById(R.id.btnsubmit);

        // Listening to button event
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // starting a new activity
                Intent intent = new Intent(getApplicationContext(), SecondScreenActivity.class);


                // sending data to another activity
                intent.putExtra("name", editname.getText().toString());
                intent.putExtra("email", editemail.getText().toString());

                Log.e("n", editname.getText() + ".." + editemail.getText());

                startActivity(intent);

            }
        });

    }
}
