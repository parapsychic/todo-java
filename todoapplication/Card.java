package todoapplication;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;


public class Card extends JPanel {


    Card(String content, JPanel parent) {
        JLabel message = new JLabel();
        JCheckBox done = new JCheckBox();
        var thisCard = this;

        done.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    parent.remove(thisCard);
                    parent.revalidate();
                    parent.repaint();
                }
            }
        });


        this.setSize(200, 300);
        message.setText(content);
        this.add(done);
        this.add(message);
        this.setVisible(true);
    }

   

}
