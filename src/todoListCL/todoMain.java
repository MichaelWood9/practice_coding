package todoListCL;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class todoMain {


    public static void main(String[] args) throws IOException {
        String task;
        int priority;
        String deadline;
        String removeTask;

        int option;

        ArrayList<todoTask> todoArray = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        addTodo(todoArray,"Read",7,"22/07/23");

        while (true) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Please select an option");
            System.out.println("Press 1 to display todolist");
            System.out.println("press 2 to add todo task");
            System.out.println("press 3 to remove to task");
            System.out.println("press 4 to exit the program");
            option = scanner.nextInt();

            if (option == 1){
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("displaying todolist");
                printlist(todoArray);
            }
            else if (option == 2){
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("please enter a task name");
                scanner.nextLine();
                task = scanner.nextLine();
                System.out.println(task);
                System.out.println("please enter a priority between 1-10");
                priority = scanner.nextInt();
                System.out.println("please enter a deadline date");
                deadline = scanner.next();
                addTodo(todoArray,task,priority,deadline);
                System.out.println("todo task added");

            }
            else if (option == 3){
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("please enter the task name you want to remove");
                scanner.nextLine();
                removeTask = scanner.nextLine();
                removeTodo(removeTask,todoArray);
                System.out.println("task has been removed");
            }
            else if (option == 4){
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("ending program");
                saveTodo(todoArray);
                break;
            }
            else {
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("Error please select and option between 1-4");
            }

        }

    }




    public static void printlist(ArrayList array){
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
    public static void addTodo(ArrayList arrayTodo ,String task,int priority,String deadline){
        todoTask t4 = new todoTask(task,priority,deadline);
        arrayTodo.add(t4);

    }
    public static void removeTodo(String taskName,ArrayList <todoTask> arrayTodo){
        int count=0;
        int removeCount = 0;
        String temp;
        for(todoTask t : arrayTodo){
            temp = t.getTaskName();
            if(temp.equals(taskName)){
                removeCount = count;
            }
            count++;

        }
        arrayTodo.remove(removeCount);
    }

    public static void saveTodo(ArrayList <todoTask> arrayTodo) throws IOException {
        boolean firstline = false;
        for(todoTask t :arrayTodo){
            String outputText = t.getTaskName() + "|" + t.getPriority() + "|" + t.getDeadline();
            saveToFile("todo.txt", outputText,firstline);
            firstline = true;
        }
    }

    public static void saveToFile(String filename, String text, boolean append) throws IOException {
        File file = new File(filename);

        FileWriter filewriter = new FileWriter(file,append);

        PrintWriter printWriter = new PrintWriter(filewriter);

        printWriter.println(text);

        printWriter.close();
    }

}
