package todoapplication;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ToDoApp{
    JFrame jframe;
    JPanel panel;

    ToDoApp(){
        panel = new JPanel();
        JButton addNewTask = new JButton("Add New Task");

        jframe = new JFrame("ToDo App");
        jframe.setSize(500,500);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        
        panel.setBounds(0,0,400,400);
        panel.setLayout(new GridLayout(0,1));
        
        addNewTask.addActionListener(new AddNewTask());


        jframe.add(panel);
        jframe.add(addNewTask, BorderLayout.SOUTH);
        jframe.setVisible(true);
        
    } 

    class AddNewTask implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JDialog task_adder = new JDialog();
            JTextField task_content = new JTextField(20);
            JButton okbtn = new JButton("OK");
            
            task_adder.setTitle("Add A New Task");
            task_adder.setLayout(new FlowLayout());
            task_adder.setResizable(false);

            task_adder.setSize(500,100);
            


            okbtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    panel.add(new Card(task_content.getText(), panel));
                    
                    panel.revalidate();
                    panel.repaint();
                    
                    task_adder.dispose();
                }
            });
            
            task_adder.add(new JLabel("Enter task: "));
            task_adder.add(task_content);
            task_adder.add(okbtn);

           
            task_adder.setVisible(true);
            

        }
    }
}