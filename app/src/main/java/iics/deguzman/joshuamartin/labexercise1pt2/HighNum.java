package iics.deguzman.joshuamartin.labexercise1pt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HighNum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_num);

        final Button pressMeButton = (Button) findViewById(R.id.pressMeButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView resultTextView = (TextView) findViewById(R.id.textView);

                int a = Integer.parseInt(editText1.getText().toString());
                int b = Integer.parseInt(editText2.getText().toString());

                int c = a - b;

                if(c>0){
                    resultTextView.setText("1st number is higher.");
                } else if(c < 0){
                    resultTextView.setText("2nd number is higher");
                } else{
                    resultTextView.setText("Numbers are equal");
                }
            }
        });



    }
}
