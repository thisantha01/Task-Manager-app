public class Task {
    private String title;
    private int daysToFinish;
    private boolean isCompleted;

    //constructor for creating task object
    public Task(String title,int daysToFinish,boolean isCompleted){
        this.title=title;
        this.daysToFinish=daysToFinish;
        this.isCompleted= isCompleted;
    }

    //Getters
    public String getTitle(){
        return title;
    }

    public int getDaysToFinish(){
        return daysToFinish;
    }

    public boolean isCompleted(){
        return isCompleted;
    }



}
