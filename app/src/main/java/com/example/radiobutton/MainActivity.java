package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioGroup radioGroup;
    private Button button;
    private TextView textView;
    private Button grnderbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.RadioGroupd);
        button=findViewById(R.id.showId);
        textView=findViewById(R.id.TextViewId);


        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int slected =radioGroup.getCheckedRadioButtonId();
        grnderbutton=findViewById(slected);
        String value=grnderbutton.getText().toString();
        textView.setText("you have slected : " + value);

    }
}
