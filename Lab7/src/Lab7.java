import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Lab7{
    private JLabel readFileLabel;

    private JLabel writeFileLabel;

    private JFrame frame;

    private JPanel panel;

    private JTextField inputFileText;

    private JTextField userInputText;


    private JButton readFromFileButton;

    private JButton writeToFileButton;

    private JLabel leftFistFiveLabel;

    private JLabel rightFistFiveLabel;

    private JTextArea leftText;

    private JTextArea rightText;


    private int left=50;
    private int top=20;
    private int leftdis=350;
    private int topdis=80;





    public Lab7(){
        frame = new JFrame();
        panel= new JPanel();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
    }
    public void buildUI(){
        readFileLabel =
                new JLabel("Reading File Name");
        readFileLabel.setBounds(left,top,300,50);
        panel.add(readFileLabel);

        writeFileLabel =
                new JLabel("File Name to write");
        writeFileLabel.setBounds(left+leftdis,top,300,50);
        panel.add(writeFileLabel);


        inputFileText = new JTextField(10);
        inputFileText.setText("annual.csv");
        inputFileText.setBounds(left,top+topdis,200,50);
        panel.add(inputFileText);

        userInputText =
                new JTextField(10);
        userInputText.setBounds(left+leftdis,top+topdis,200,50);
        panel.add(userInputText);




        readFromFileButton = new JButton("Click to read from file");
        readFromFileButton.setBounds(left,top+2*topdis,200,25);
        readFromFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filename = inputFileText.getText();
                //System.out.println(filename);
                Read read = new Read();
                String res= read.readFromFile("src/"+filename)[0];
                leftText.setText(res);
            }
        });
        panel.add(readFromFileButton);



       writeToFileButton = new JButton("Click to write to file");
       writeToFileButton.setBounds(left+leftdis,top+2*topdis,200,25);
       writeToFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Write write = new Write();
                write.writeToFile(leftText.getText(),"src/"+userInputText.getText());
                String filename = inputFileText.getText();
                Read read = new Read();
                String res= read.readFromFile("src/"+filename)[1];
                //System.out.println(res);
                rightText.setText(res);
            }
        });
        panel.add(writeToFileButton);


        leftFistFiveLabel =
                new JLabel("First five lines of file");
        leftFistFiveLabel.setBounds(left,top+3*topdis,300,50);
        panel.add(leftFistFiveLabel);

        rightFistFiveLabel =
                new JLabel("First five lines of file");
        rightFistFiveLabel.setBounds(left+leftdis,top+3*topdis,300,50);
        panel.add(rightFistFiveLabel);

        leftText =
                new JTextArea();
        leftText.setBounds(left,top+4*topdis,200,200);
        panel.add(leftText);

        rightText =
                new JTextArea();
        rightText.setBounds(left+leftdis,top+4*topdis,200,200);
        panel.add(rightText);
        frame.setVisible(true);
    }


}