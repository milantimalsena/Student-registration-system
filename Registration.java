import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.event.ItemListener;


public class Registration {

    JFrame frame;
    JLabel idlabel, namelabel, contactlabel, genderlabel,courselabel, feelabel, interestlabel, reasonlabel;
    JTextField idfield, namefield, contactfield, tfield,  feeField, reasonField;
    JRadioButton maleButton, femaleButton;
    ButtonGroup genderGroup;
    JComboBox<String> courseComboBox;
    JCheckBox sportCheckBox, musicCheckBox;
    JPanel mainPanel, formPanel, buttonPanel, outputPanel;
    JTextArea outputArea;


private ArrayList<Student> studentlist;






    public Registration(){
        studentlist =new ArrayList<>();


        frame = new JFrame("Registration Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
   
        frame.add(mainPanel);

        formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(15, 10, 20, 10); // Padding for components
        // gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        

        idlabel = new JLabel("Id:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(idlabel, gbc);
        gbc.anchor = GridBagConstraints.LINE_START;
        idfield = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy =0;
        formPanel.add(idfield, gbc);


        namelabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(namelabel, gbc);
        gbc.anchor = GridBagConstraints.LINE_START;
        namefield = new JTextField(15);
        gbc.gridx =1;
        gbc.gridy = 1;
        formPanel.add(namefield, gbc);

        contactlabel = new JLabel("Contact:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(contactlabel, gbc);
        gbc.anchor = GridBagConstraints.LINE_START;
        contactfield = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 2;
        formPanel.add(contactfield, gbc);



        courselabel = new JLabel("Course:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        formPanel.add(courselabel, gbc);
        gbc.anchor = GridBagConstraints.LINE_START;
        String[] courses = {"BIT", "BBA"};
        courseComboBox = new JComboBox<>(courses);
        gbc.gridx = 1;
        gbc.gridy = 5;
        formPanel.add(courseComboBox, gbc);




        feelabel = new JLabel("Fee:");
        gbc.gridx = 0;
        gbc.gridy = 6;
        formPanel.add(feelabel, gbc);
        gbc.anchor = GridBagConstraints.LINE_START;
        feeField = new JTextField(15);
       feeField.setEditable(false);
        gbc.gridx = 1;
        gbc.gridy = 6;
        formPanel.add(feeField, gbc);



        //Faltai panal banara gender lai rakhako

        genderlabel = new JLabel("Gender:");
        gbc.gridx = 0;
        gbc.gridy = 7;
        formPanel.add(genderlabel, gbc);

        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        formPanel.add(genderPanel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 7;
        formPanel.add(genderPanel, gbc);
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        interestlabel = new JLabel("Interests:");
        gbc.gridx = 0;
        gbc.gridy = 8;
        formPanel.add(interestlabel, gbc);
        gbc.anchor = GridBagConstraints.LINE_START;
        sportCheckBox = new JCheckBox("Sports");
        musicCheckBox = new JCheckBox("Music");
        JPanel interestPanel = new JPanel();
        interestPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        interestPanel.add(sportCheckBox);
        interestPanel.add(musicCheckBox);
        gbc.gridx = 1;
        gbc.gridy = 8;
        formPanel.add(interestPanel, gbc);


        reasonlabel = new JLabel("Reason:");
        gbc.gridx = 0;
        gbc.gridy = 9;
        formPanel.add(reasonlabel, gbc);
        gbc.anchor = GridBagConstraints.LINE_START;
        reasonField = new JTextField(15);
        
      
        gbc.gridx = 1;
        gbc.gridy = 9;
        formPanel.add(reasonField, gbc);


    //     maleButton = new JRadioButton("Male");
    //     femaleButton = new JRadioButton("Female");
        
     


    //     formPanel.add(maleButton);
    //   formPanel.add(femaleButton);

    //     gbc.gridx = 0;
    //     gbc.gridy = 7;
    //     formPanel.add(formPanel, gbc);

    //     frame.add(formPanel, BorderLayout.WEST);

    //     genderGroup = new ButtonGroup();
    //     genderGroup.add(maleButton);
    //     genderGroup.add(femaleButton);




buttonPanel = new JPanel();
JButton submitButton = new JButton("Submit");

JButton clearButton = new JButton("Clear");

JButton displayButton = new JButton("Display");

buttonPanel.add(submitButton);
buttonPanel.add(clearButton);
buttonPanel.add(displayButton);

buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));





//action listeners for buttons

clearButton.addActionListener(new ActionListener()  {
    @Override
    public void actionPerformed(ActionEvent e){

       int selectedOption = JOptionPane.showConfirmDialog(frame, "Do you really wanna clear all", "cofim",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (selectedOption == JOptionPane.YES_OPTION) {

            
        


        idfield.setText("");
        namefield.setText("");
        contactfield.setText("");
        reasonField.setText("");
        maleButton.setSelected(false);
        femaleButton.setSelected(false);
        feeField.setText("RS12345");
        courseComboBox.setSelectedIndex(0);
        reasonField.setText("");
        musicCheckBox.setSelected(false);
        sportCheckBox.setSelected(false);
        }

        else{

        }

    }

});


submitButton.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e){
        String idString = idfield.getText();
        int id = Integer.parseInt(idString);

        String name =namefield.getText();
        String Contact = contactfield.getText();
        String course = (String) courseComboBox.getSelectedItem();

        // String feestring = feeField.getText();
        // int fee = Integer.parseInt((feestring));

    
        String  gender;
        if(maleButton.isSelected()){
            gender="Male";
        }

        else{
            gender= "Female";
        }


        ArrayList <String> interest = new ArrayList<>();
        if (sportCheckBox.isSelected()) {
            interest.add("Sports");
            
        }

        if(musicCheckBox.isSelected()){
            interest.add("Music");
        }

    String reason = reasonField.getText();


    Student student= new Student(id, name, Contact, interest, course, "23", reason);
    studentlist.add(student);
        System.out.println(studentlist.toString());

    JOptionPane.showMessageDialog(frame,"Student details added successfully", "Added successfully", JOptionPane.INFORMATION_MESSAGE);






    }



});

submitButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String idString = idfield.getText();
        int id = Integer.parseInt(idString);

        String name = namefield.getText();
        String contact = contactfield.getText();
        String course = (String) courseComboBox.getSelectedItem();

        // String feestring = feeField.getText();
        // int fee = Integer.parseInt((feestring));
        String fee = feeField.getText();
        String  gender;
        if (maleButton.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        ArrayList<String> interest = new ArrayList<>();
        if (sportCheckBox.isSelected()) {
            interest.add("Sports");
        }
        if (musicCheckBox.isSelected()) {
            interest.add("Music");
        }
        String reason = reasonField.getText();
        Student student = new Student(id, name, contact, interest
, course, fee, reason);
        studentlist.add(student);
        System.out.println(studentlist.toString());

        JOptionPane.showMessageDialog(frame, "Student details added successfully", "Added successfully", JOptionPane.INFORMATION_MESSAGE);
    }
});


//item listener for course combo box
courseComboBox.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent e) {
        String selectedOption = (String) courseComboBox.getSelectedItem();
        switch (selectedOption) {
        case "BIT":
        feeField.setText("RS 12345");
            
            break;

            case "BBA":
            feeField.setText("RS5545");
            break;

    
        default:
            feeField.setText("RS 11111");
            break;
    }



    
}
});




// display button action listener
displayButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        outputArea.setText(""); // Clear previous output
        for (Student student : studentlist) {
            outputArea.append("Student Details:\n");
            outputArea.append("-------------------------\n");
            outputArea.append("ID: " + student.getId() + "\n");
            outputArea.append("Name: " + student.getName() + "\n");
            outputArea.append("Contact: " + student.getContact() + "\n");
            outputArea.append("Course: " + student.getCourse() + "\n");
            outputArea.append("Fee: " + student.getFee() + "\n");
            outputArea.append("Gender: " + student.getGender() + "\n");
            outputArea.append("Interests: " + student.getInterest() + "\n");
            outputArea.append("Reason: " + student.getReason() + "\n");
            outputArea.append("-------------------------\n");
        }
        outputArea.append("Total"+ studentlist.size());
    }
});











outputPanel = new JPanel();

        
          outputPanel = new JPanel();
    outputPanel.setLayout(new BorderLayout());
    outputPanel.setBorder(BorderFactory.createTitledBorder("Display "));
    outputArea = new JTextArea(20, 50);
    outputArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(outputArea);
    outputPanel.add(scrollPane, BorderLayout.CENTER);


       




    frame.add(formPanel, BorderLayout.WEST);
    frame.add(outputPanel, BorderLayout.EAST);
    frame.add(buttonPanel, BorderLayout.SOUTH);
    frame.add(mainPanel);



        frame.setVisible(true);

        
    }
public static void main(String[] args) {
    new Registration();
}

    
}
