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
