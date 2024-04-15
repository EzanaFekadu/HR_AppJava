package com.example.HR_AppJava;
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    Scanner scanner = new Scanner(System.in);
    // Unique variables to each task needed here
    private String task;
    private int duration;
    private boolean completed;
    // Constructor to initialize Task object with a name and duration
    public Task(String name, int duration, boolean completed) {
        
        // Initially, the task is not completed
        this.task = name;
        this.duration = duration;
        this.completed = false;
        
    }
    public void setName(){
        task = scanner.nextLine();
    }
    public void setDuration(){
        duration = scanner.nextInt();
    }
    public void setCompleted(){
        completed = true;
    }
    public void setAllCompleted(){
        System.out.println("Did you complete this task? (Yes or No): " + task);
        String answer = scanner.nextLine();
        if(answer.equals("Yes"))
            completed = true;
    }
    public String getName(){
        return task;
    }
    public int getDuration(){
        return duration;
    }
    public boolean getCompleted(){
        return completed;
    }

}

class TaskTracker {
    // List to store Task objects
    ArrayList<Task> taskList = new ArrayList<>(50);

    // Constructor to initialize TaskTracker object with an empty task list
    public TaskTracker(ArrayList<Task> TaskTracker) {
        TaskTracker = taskList;
    }

    // Method to add a new task to the task list
    public void addTask(Task task) {
        taskList.add(task);
    }

    // Method to mark a task as completed based on its index in the list
    public void markTaskAsComplete(int index) {
        taskList.get(index).setCompleted();
    }

    // Method to display all tasks in the task list
    public void displayTasks() {
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println((i+1) + ". " + taskList.get(i).getName() + " - Duration: " + taskList.get(i).getDuration() + " minutes");
        }
        
    }

    // Method to calculate the total duration of completed tasks
    public int calculateTotalDuration() {
        int totalDuration = 0;
        // loop logic goes here
        for (int i = 0; i < taskList.size(); i++) {
            if(taskList.get(i).getCompleted())
                totalDuration += taskList.get(i).getDuration();
        }

        return totalDuration;
    }

    // Method to calculate the average duration of completed tasks
    public double calculateAverageDuration() {
        double Total = 0.00;
        for (int i = 0; i < taskList.size(); i++) {
            if(taskList.get(i).getCompleted())
                Total += taskList.get(i).getDuration();
        }
        return Total/taskList.size();
    }

    // Method to find the maximum duration among completed tasks
    public int findMaxDuration() {
        int max = 0;
        for (int j = 0; j < taskList.size(); j++) {
            int temp = taskList.get(j).getDuration();
            if (temp>max && taskList.get(j).getCompleted()) {
                max = temp;
            }
        }
        return max;
    }
}

public class TaskMasterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create Task objects
        Task task1 = new Task("Complete Assignment", 30, false);
        //more tasks go here
        Task task2 = new Task("Read a book", 45, false);
        Task task3 = new Task("Exercise", 60, false);
        Task task4 = new Task("Prepare food", 45, false);
        Task task5 = new Task("Sleep for 8 hours", 480, false);
        // Create TaskTracker object called "tracker"
        TaskTracker tracker = new TaskTracker(null);

        // Add tasks to the task list
        tracker.addTask(task1);
        tracker.addTask(task2);
        tracker.addTask(task3);
        tracker.addTask(task4);
        tracker.addTask(task5);
        System.out.println("Would you like to add a new task? (Yes or No)" );
        String answer = scanner.nextLine();
        if (answer.equals("Yes")) {
            Task newTask = new Task(null, 0, false);
            tracker.addTask(newTask);
            newTask.setName();
            newTask.setDuration();
            newTask.setCompleted();
        }
        // Display tasks in the task list
        tracker.displayTasks();
        
        // Mark tasks as completed
        System.out.println("Have you completed all this tasks? (Yes or No)");
        String ans = scanner.nextLine();
        if (ans.equals("Yes")) {
            for (int i = 0; i < tracker.taskList.size(); i++) {
                tracker.taskList.get(i).setCompleted();
            }            
        }
        else
            for (int i = 0; i < tracker.taskList.size(); i++) {
                tracker.taskList.get(i).setAllCompleted();
            }
        /* if (ans.equals("Yes")) {
            for (int i = 0; i < tracker.taskList.size(); i++) {
                tracker.markTaskAsComplete(i);
            }
        }
        else
            System.out.println("Not all tasks are completed."); */
        // Display calculated statistics
        System.out.println("Total Duration of Completed Tasks: " + tracker.calculateTotalDuration() + " minutes");
        System.out.println("Average Duration of Completed Tasks: " + tracker.calculateAverageDuration() + " minutes");
        System.out.println("Maximum Duration among Completed Tasks: " + tracker.findMaxDuration() + " minutes");
    }
}
