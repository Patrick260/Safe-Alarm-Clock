/*
    Copyright (C) 2022  Patrick260

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

package de.patrick260.safealarmclock.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Random;

import de.patrick260.safealarmclock.R;
import de.patrick260.safealarmclock.alarm.Alarm;

public final class ScheduleAlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_alarm);

        findViewById(R.id.btn_schedule_alarm).setOnClickListener(this::scheduleAlarm);

    }

    private void scheduleAlarm(final View view) {

        final int alarmId = new Random().nextInt(Integer.MAX_VALUE);

        final Alarm alarm = new Alarm(
                alarmId,
                ((EditText) findViewById(R.id.et_alarm_name)).getText().toString(),
                ((TimePicker) findViewById(R.id.tp_time_picker)).getHour(),
                ((TimePicker) findViewById(R.id.tp_time_picker)).getMinute(),
                ((CheckBox) findViewById(R.id.cb_recurring_alarm)).isChecked()
        );

        alarm.schedule(getApplicationContext());

        finish();

    }

}
