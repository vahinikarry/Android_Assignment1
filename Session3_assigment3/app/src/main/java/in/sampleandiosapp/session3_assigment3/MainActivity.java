package in.sampleandiosapp.session3_assigment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button mButtoncompute;
    EditText mEdit1;
    EditText mEdit2;
    EditText mEdit3;
    EditText mEdit4;
    EditText mEdit5;
    EditText mEdit6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtoncompute = (Button)findViewById(R.id.button);
        mEdit1   = (EditText)findViewById(R.id.editText);
        mEdit2   = (EditText)findViewById(R.id.editText2);
        mEdit3   = (EditText)findViewById(R.id.editText3);
        mEdit4   = (EditText)findViewById(R.id.editText4);
        mEdit5   = (EditText)findViewById(R.id.editText5);
        mEdit6   = (EditText)findViewById(R.id.editText6);

        mButtoncompute.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        //TextView txt = (TextView)view;
        int rate= Integer.parseInt( mEdit2.getText().toString());
        int monthlyfloatInterestPaid=Math.round((Integer.parseInt(mEdit1.getText().toString()) * (rate / (100 * 12))));//monthlyfloatInterestPaid= Math.round((principal * (rate / (100 * 12))))
        int monthlyPrinciple=Integer.parseInt(mEdit3.getText().toString())- monthlyfloatInterestPaid;//monthlyPrinciple= minimum_payment-monthlyfloatInterestPaid
        int monthlyBalance=Integer.parseInt(mEdit1.getText().toString())-monthlyPrinciple; //monthlyBalance=principal-monthlyPrinciple
        mEdit4.setText(monthlyBalance);
        //mEdit5s
        //mEdit6

    }
}
