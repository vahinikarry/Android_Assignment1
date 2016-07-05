package in.sampleandiosapp.session3_assignment2;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_display1,bt_display2,bt_display3,bt_display4,bt_display5,bt_display6,bt_display7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_display1=(Button)findViewById(R.id.button1);
        bt_display1.setOnClickListener(this);
        bt_display2=(Button)findViewById(R.id.button2);
        bt_display2.setOnClickListener(this);
        bt_display3=(Button)findViewById(R.id.button3);
        bt_display3.setOnClickListener(this);
        bt_display4=(Button)findViewById(R.id.button4);
        bt_display4.setOnClickListener(this);
        bt_display5=(Button)findViewById(R.id.button5);
        bt_display5.setOnClickListener(this);
        bt_display6=(Button)findViewById(R.id.button6);
        bt_display6.setOnClickListener(this);
        bt_display7=(Button)findViewById(R.id.button7);
        bt_display7.setOnClickListener(this);
    }
        @Override
    public void onClick(View view)
    {
        Button b = (Button)view;

        if(b.getText().toString()=="@string/button1_color")
        {
            Toast.makeText(getApplicationContext(), "Message :" + "you pressed"+ "@string/button1_color", Toast.LENGTH_LONG).show();
        }
        else if(b.getText().toString()=="@string/button2_color")
        {
            Toast.makeText(getApplicationContext(), "Message :" + "you pressed"+ "@string/button1_color", Toast.LENGTH_LONG).show();

        }
        else if(b.getText().toString()=="@string/button3_color")
        {
            Toast.makeText(getApplicationContext(), "Message :" + "you pressed"+ "@string/button1_color", Toast.LENGTH_LONG).show();

        }
        else if(b.getText().toString()=="@string/button4_color")
        {
            Toast.makeText(getApplicationContext(), "Message :" + "you pressed"+ "@string/button1_color", Toast.LENGTH_LONG).show();

        }
        else if(b.getText().toString()=="@string/button5_color")
        {
            Toast.makeText(getApplicationContext(), "Message :" + "you pressed"+ "@string/button1_color", Toast.LENGTH_LONG).show();

        }
        else if(b.getText().toString()=="@string/button6_color")
        {
            Toast.makeText(getApplicationContext(), "Message :" + "you pressed"+ "@string/button1_color", Toast.LENGTH_LONG).show();

        }
        else if(b.getText().toString()=="@string/button7_color")
        {
            Toast.makeText(getApplicationContext(), "Message :" + "you pressed"+ "@string/button1_color", Toast.LENGTH_LONG).show();

        }
        else if(b.getText().toString()=="@string/button8_color")
        {
            Toast.makeText(getApplicationContext(), "Message :" + "you pressed"+ "@string/button1_color", Toast.LENGTH_LONG).show();

        }
    }
}
