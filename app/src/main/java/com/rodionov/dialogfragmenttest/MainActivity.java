package com.rodionov.dialogfragmenttest;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements JavaFragmentDialogTest.NoticeDialogListener {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaFragmentDialogTest javaFragmentDialogTest = new JavaFragmentDialogTest();
                javaFragmentDialogTest.show(getSupportFragmentManager(), "tag");
            }
        });
    }

    @Override
    public void onDialogPositiveClick(int hour, int minute) {
        textView.setText("Hour " + hour + " minute " + minute);
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {

    }
}
