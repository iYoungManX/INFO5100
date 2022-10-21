import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Lab6{
    private JLabel totalAssignmentPointsLabel;

    private JLabel earnedPointsLabel;

    private JFrame frame;

    private JPanel panel;

    private JLabel PercentageLabel;

    private JTextField totalAssignmentPointsText;

    private JTextField earnedPointsText;

    private JTextField percentageText;

    private JButton calculateScoreButton;

    private JLabel weightedGradeLabel;

    private JTextField weightedGradeText;



    public Lab6(){
        frame = new JFrame();
        panel= new JPanel();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
    }
    public void buildUI(){
        totalAssignmentPointsLabel =
                new JLabel("Total Assignment Points");
        totalAssignmentPointsLabel.setBounds(50,20,300,50);
        panel.add(totalAssignmentPointsLabel);

        earnedPointsLabel =
                new JLabel("Earned Points");
        earnedPointsLabel.setBounds(250,20,300,50);
        panel.add(earnedPointsLabel);


        PercentageLabel =
                new JLabel("Percentage of Class");
        PercentageLabel.setBounds(50,80,300,50);
        panel.add(PercentageLabel);

        totalAssignmentPointsText =
                new JTextField(10);
        totalAssignmentPointsText.setBounds(50,60,150,25);
        panel.add(totalAssignmentPointsText);

        earnedPointsText =
                new JTextField(10);
        earnedPointsText.setBounds(250,60,150,25);
        panel.add(earnedPointsText);


        percentageText =
                new JTextField(10);
        percentageText.setBounds(50,120,150,25);
        panel.add(percentageText);


        calculateScoreButton = new JButton("Click to calculate score");
        calculateScoreButton.setBounds(180,180,200,25);
        calculateScoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalAssignmentPoints= Integer.parseInt(totalAssignmentPointsText.getText());
                int earnedPoints= Integer.parseInt(earnedPointsText.getText());
                int percentage= Integer.parseInt(percentageText.getText());

                WeightedGrade weightedGrade = new WeightedGrade(
                        totalAssignmentPoints,earnedPoints, percentage);
                double result= weightedGrade.getTotalWeightedGrade();
                weightedGradeText.setText(String.valueOf(result));

            }
        });
        panel.add(calculateScoreButton);


        weightedGradeLabel =
                new JLabel("Percentage of Class");
        weightedGradeLabel.setBounds(190,200,300,50);
        panel.add(weightedGradeLabel);

        weightedGradeText =
                new JTextField(10);
        weightedGradeText.setBounds(190,240,150,25);
        panel.add(weightedGradeText);
        frame.setVisible(true);
    }
}



