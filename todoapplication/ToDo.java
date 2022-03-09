package todoapplication;

import javax.swing.*;


public class ToDo{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new ToDoApp();
            }
        });        
    }
}
