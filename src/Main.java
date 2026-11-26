public class Main {
    public static void main(String[] args){
        //Create an actual Task object using our Task blueprint
        Task myTask = new Task("Learn encasulation",2,false);

        //read data using Getters
        System.out.println("Original title: "+ myTask.getTitle());
        System.out.println("Is done: "+myTask.isCompleted());

        //change data using setters
        myTask.setTitle("encapsulation completd");
        myTask.setCompleted(true);

        //Read again to see the changes
        System.out.println("New title: "+myTask.getTitle());
        System.out.println("Is done: "+myTask.isCompleted());



    }
}