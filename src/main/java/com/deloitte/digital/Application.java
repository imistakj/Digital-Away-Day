package com.deloitte.digital;

import com.deloitte.digital.exception.DigitalDayException;
import com.deloitte.digital.file.FileUtils;
import com.deloitte.digital.model.Task;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    static String INPUT = "input.txt";
    static List<Task> tasks;
    static List<Task> taskList = new ArrayList<>();
    static LocalTime time;
    static int teamCount = 1;
    static List<Task> orderedTasks;

    public static void main(String[] args) throws Exception {

        FileUtils fileUtils = new FileUtils();

        try {

            tasks = fileUtils.loadTasksFromResources(INPUT);
            orderedTasks = tasks.stream().sorted((t1, t2) -> t2.getDuration() - t1.getDuration()).collect(Collectors.toList());
            Thread th1 = new Thread(task1);
            Thread th2 = new Thread(task2);
            th1.setName("Team : 1");
            th1.start();
            th1.join();
            th2.start();

        } catch (DigitalDayException e) {
            System.out.println("There was an error executing away day:" + e.getLocalizedMessage());
        }
    }


    static Runnable task1 = new Runnable() {
        public void run() {
            System.out.println("Team : " + teamCount);
            boolean timeInt = false;
            for (Task task : orderedTasks) {
                if (null != task && !timeInt) {
                    time = LocalTime.of(9, 00);
                    task.setStartTime(time);
                    timeInt = true;
                }
                if (time.getHour() == 17) {
                    break;
                }
                time = addTask(task, time);

            }
            for (Task task : taskList) {
                System.out.println(task);
            }
            taskList.clear();
            teamCount++;

        }
    };


    static Runnable task2 = new Runnable() {
        public void run() {
            System.out.println("Team : " + teamCount);
            boolean timeInt = false;
            for (Task task : tasks) {
                if (null != task && !timeInt) {
                    time = LocalTime.of(9, 00);
                    task.setStartTime(time);
                    timeInt = true;
                }
                if (time.getHour() == 17) {
                    break;
                }
                time = addTask(task, time);

            }
            for (Task task : taskList) {
                System.out.println(task);
            }
            teamCount++;

        }
    };

    public static LocalTime addTask(Task task, LocalTime time) {
        if (task != null) {
            task.setStartTime(time);
            taskList.add(task);
            if (time.getHour() == 12) {
                time = time.plusMinutes(60);
                return time;
            }

            time = time.plusMinutes(task.getDuration());
            return time;
        }

        return time;
    }


}
