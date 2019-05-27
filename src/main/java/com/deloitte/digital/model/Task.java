package com.deloitte.digital.model;

import java.time.LocalTime;

/**
 * Class for task information
 *
 * @author Carlos Lopez
 */
public class Task {

    static String SPRINT = "sprint";

    private String name;

    private LocalTime startTime;

    private Integer duration;

    public Task(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("");
        buffer
                .append(this.startTime + " ")
                .append((this.getStartTime().getHour() < 12 ? "am" : "pm"))
                .append(" : " + (this.getStartTime().getHour() != 12 ? ((this.getStartTime().getHour() == 16) && (this.getStartTime().getMinute() == 40 || this.getStartTime().getMinute() == 45)) ? "Staff Motivation " : this.getName() : "Lunch Break") + " ")
                .append((this.duration != 15 ? (this.getStartTime().getHour() == 12) ? this.duration = 60 : this.duration : SPRINT + " min"));
        return buffer.toString();

    }

}
