package in.sampleandiosapp.session3_assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b_login;
    EditText mEdit1;
    EditText mEdit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_login = (Button)findViewById(R.id.button);
        b_login.setOnClickListener(this);

        mEdit1   = (EditText)findViewById(R.id.editText);
        mEdit2   = (EditText)findViewById(R.id.editText2);

    }
    @Override
    public void onClick(View view)
    {

        if(TextUtils.isEmpty(mEdit1.getText().toString()))
        {
            Toast.makeText(getApplicationContext(), "Message :" + "Please enter UserName", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(mEdit2.getText().toString()))
        {
            Toast.makeText(getApplicationContext(), "Message :" + "Please enter Password", Toast.LENGTH_LONG).show();
        }

    }
}
