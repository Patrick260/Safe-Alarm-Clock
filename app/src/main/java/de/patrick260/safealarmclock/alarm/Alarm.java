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

    private boolean recurring;


    public Alarm(final String alarm_name, final boolean recurring) {

        this.alarm_name = alarm_name;
        this.recurring = recurring;

    }


    public void schedule() {



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

}
