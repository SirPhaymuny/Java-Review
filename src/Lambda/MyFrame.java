package Lambda;

import javax.swing.*;

public class MyFrame extends JFrame {
    JButton myButton = new JButton("My button");
    MyFrame(){
        myButton.setBounds(100,100,100,100);
        myButton.addActionListener(
            (e) -> System.out.println("You clicked")
        );

        /*myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked");
            }
        });*/
        this.add(myButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
