package de.patrick260.safealarmclock.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import de.patrick260.safealarmclock.R;

public class CreateAlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_dialog);

        findViewById(R.id.btn_confirm_create_alarm).setOnClickListener(this::onCreateDialog);

    }

    public void onCreateDialog(View view) {

        

    }

}