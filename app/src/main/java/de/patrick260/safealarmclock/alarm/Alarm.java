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

package de.patrick260.safealarmclock.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;

import de.patrick260.safealarmclock.util.AlarmReceiver;

public final class Alarm {

    private int alarmId;

    private String alarmName;

    private int hour;
    private int minute;

    private boolean recurring;
    private boolean enabled;


    public Alarm(final int alarmId, final String alarmName, final int hour, final int minute, final boolean recurring, final boolean enabled) {

        this.alarmId = alarmId;
        this.alarmName = alarmName;
        this.hour = hour;
        this.minute = minute;
        this.recurring = recurring;
        this.enabled = enabled;

    }


    public void schedule(final Context context) {

        final AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

        final Intent intent = new Intent(context, AlarmReceiver.class);
        intent.putExtra("RECURRING", recurring);
        intent.putExtra("ALARM_NAME", alarmName);

        final PendingIntent pendingIntent = PendingIntent.getBroadcast(context, alarmId, intent, 0);

        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        if (calendar.getTimeInMillis() <= System.currentTimeMillis()) {

            calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + 1);

        }

        if (recurring) {

            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 86400000, pendingIntent);

        } else {

            alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);

        }

        enabled = true;

    }

    public void cancel(final Context context) {

        final AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

        alarmManager.cancel(PendingIntent.getBroadcast(context, alarmId, new Intent(context, AlarmReceiver.class), 0));

        enabled = false;

    }


    public int getAlarmId() {

        return alarmId;

    }

    public void setAlarmId(final int alarmId) {

        this.alarmId = alarmId;

    }

    public String getAlarmName() {

        return alarmName;

    }

    public void setAlarmName(final String alarmName) {

        this.alarmName = alarmName;

    }

    public boolean isRecurring() {

        return recurring;

    }

    public void setRecurring(final boolean recurring) {

        this.recurring = recurring;

    }

    public boolean isEnabled() {

        return enabled;

    }

    public void setEnabled(final boolean enabled) {

        this.enabled = enabled;

    }

    public int getHour() {

        return hour;

    }

    public void setHour(final int hour) {

        this.hour = hour;

    }

    public int getMinute() {

        return minute;

    }

    public void setMinute(final int minute) {

        this.minute = minute;

    }

}
