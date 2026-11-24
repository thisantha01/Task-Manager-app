public class Main {
    public static void main(String[] args){
        //Create an actual Task object using our Task blueprint
        Task myTask = new Task("Learn constructors",2,true);

        //Fill in the details of this specific task
        //myTask.title = "Learn classes and objects";
        //myTask.daysToFinish = 3;
        //myTask.isCompleted = false;

        // print the details stored inside our object
        System.out.println("Task title: "+ myTask.title);
        System.out.println("Days to finish: "+myTask.daysToFinish);
        System.out.println("Is it finished: "+myTask.isCompleted);

        //create a variable for text
        String taskTitle = "Learn Java Basics";

        //create a variable for numbers
        int taskDays = 5;

        //create a box for true or false
        boolean  isCompleted = true;


        //print them out
        //System.out.println("My task is: "+taskTitle);
        //System.out.println("Days to finish: "+taskDays);

        //Make a decision based on the boolean
        if(isCompleted == true){
            System.out.println("Status: Great job,you finished the task. ");
        }else{
            System.out.println("Status: task is not done, keep working");
        }

    }
}