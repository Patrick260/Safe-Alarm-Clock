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

public final class Alarm {

    private String alarm_name;

    private int hour;
    private int minute;

    private boolean recurring;
    private boolean enabled;


    public Alarm(final String alarm_name, final int hour, final int minute, final boolean recurring, final boolean enabled) {

        this.alarm_name = alarm_name;
        this.hour = hour;
        this.minute = minute;
        this.recurring = recurring;
        this.enabled = enabled;

    }


    public void schedule() {



    }

    public void cancel() {



    }


    public String getAlarm_name() {
        return alarm_name;
    }

    public void setAlarm_name(final String alarm_name) {
        this.alarm_name = alarm_name;
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

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

}
