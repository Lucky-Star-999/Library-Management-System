
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ManageData {
    
    //It contains "username" and profile of all manager (key = username, value = Manager)
    HashMap<String, Manager> allManager = new HashMap<>();
    
    //key = username, value = Student
    HashMap<String, Student> allStudent = new HashMap<>();
    
    //key = idBook, value = Book
    HashMap<String, Book> allBook = new HashMap<>();
    
    //An array contains the book borrowed for all student currently
    ArrayList<String> bookBorrowed = new ArrayList<>();
    
    //HashMap contain comboBox
    //HashMap<String, String> comboBoxSupport = new HashMap<>();
    
    //Show the username of a user logging in the program
    private String who_is_using_this_program;
    private String type_of_user_using_this_program;
    private String temporaryAvatar;
    
    //Show the choosing row at jTable
    private String username_choosen;
    
    
    //Show the choosing book
    private String book_choosen;
    
    
    
    
    //This is a Singleton
    private static final ManageData manageData = new ManageData();
    private ManageData(){}
    public static ManageData getManageData(){
        return manageData;
    }
    
    
    //Getters and setters
    public String getWho_is_using_this_program() {
        return who_is_using_this_program;
    }

    public void setWho_is_using_this_program(String who_is_using_this_program) {
        this.who_is_using_this_program = who_is_using_this_program;
    }
    
    public String getUsername_choosen() {
        return username_choosen;
    }

    public void setUsername_choosen(String username_choosen) {
        this.username_choosen = username_choosen;
    }
    
    public String getType_of_user_using_this_program() {
        return type_of_user_using_this_program;
    }

    public void setType_of_user_using_this_program(String type_of_user_using_this_program) {
        this.type_of_user_using_this_program = type_of_user_using_this_program;
    }
    
    public String getBook_choosen() {
        return book_choosen;
    }

    public void setBook_choosen(String book_choosen) {
        this.book_choosen = book_choosen;
    }
    
    public String getTemporaryAvatar() {
        return temporaryAvatar;
    }

    public void setTemporaryAvatar(String temporaryAvatar) {
        this.temporaryAvatar = temporaryAvatar;
    }
    //End of getters and setters

    

    

    
    
    //Save the manager list in a file
    public void saveAllManager(){
	//String path = new File("src\\databaseSaving\\All Managers.txt").getAbsolutePath();
        String path = new File("src/main/java/database/All Managers.txt").getAbsolutePath();
        
        try (FileWriter fstream = new FileWriter(path);
	    BufferedWriter info = new BufferedWriter(fstream)) {
            for(Manager value: this.allManager.values()){
		info.write(String.format(value.getUsername() + "%n"));
                info.write(String.format(value.getPassword() + "%n"));
                info.write(String.format(value.getFullName() + "%n"));
                info.write(String.format(value.getEmail() + "%n"));
                info.write(String.format(value.getPhone() + "%n"));
                info.write(String.format(value.getLinkOfAvatar()+ "%n"));
            }  
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    
    
    
    //Load file of managers
    public void loadAllManager(){
        //String path = new File("src\\databaseSaving\\All Managers.txt").getAbsolutePath();
        String path = new File("src/main/java/database/All Managers.txt").getAbsolutePath();
        try {
            List<String> content = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
            String username = "0";
	    int length = content.size();
            if (length!=0){
                for(int i=0; i<length/6; i++){
                    username = content.get(6*i);
                    this.allManager.put(username, new Manager());
                    this.allManager.get(username).setUsername(content.get(6*i));
                    this.allManager.get(username).setPassword(content.get(6*i+1));
                    this.allManager.get(username).setFullName(content.get(6*i+2));
                    this.allManager.get(username).setEmail(content.get(6*i+3));
                    this.allManager.get(username).setPhone(content.get(6*i+4));
                    this.allManager.get(username).setLinkOfAvatar(content.get(6*i+5));
                }
            }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    
    
    //Save the student list in a file
    public void saveAllStudent(){
	//String path = new File("src\\databaseSaving\\All Students.txt").getAbsolutePath();
        String path = new File("src/main/java/database/All Students.txt").getAbsolutePath();
        
        try (FileWriter fstream = new FileWriter(path);
	    BufferedWriter info = new BufferedWriter(fstream)) {
            for(Student value: this.allStudent.values()){
		info.write(String.format(value.getUsername() + "%n"));
                info.write(String.format(value.getPassword() + "%n"));
                info.write(String.format(value.getFullName() + "%n"));
                info.write(String.format(value.getEmail() + "%n"));
                info.write(String.format(value.getPhone() + "%n"));
                info.write(String.format(value.getIdStudent()+ "%n"));
                info.write(String.format(value.getFine()+ "%n"));
                info.write(String.format(value.getLinkOfAvatar()+ "%n"));
            }  
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    
    
    
    //Load file of students
    public void loadAllStudent(){
        //String path = new File("src\\databaseSaving\\All Students.txt").getAbsolutePath();
        String path = new File("src/main/java/database/All Students.txt").getAbsolutePath();
        try {
            List<String> content = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
            String username = "0";
	    int length = content.size();
            if (length!=0){
                for(int i=0; i<length/8; i++){
                    username = content.get(8*i);
                    this.allStudent.put(username, new Student());
                    this.allStudent.get(username).setUsername(content.get(8*i));
                    this.allStudent.get(username).setPassword(content.get(8*i+1));
                    this.allStudent.get(username).setFullName(content.get(8*i+2));
                    this.allStudent.get(username).setEmail(content.get(8*i+3));
                    this.allStudent.get(username).setPhone(content.get(8*i+4));
                    this.allStudent.get(username).setIdStudent(content.get(8*i+5));
                    this.allStudent.get(username).setFine(Integer.valueOf(content.get(8*i+6)));
                    this.allStudent.get(username).setLinkOfAvatar(content.get(8*i+7));
                }
            }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    
    //Save all information of all the books
    public void saveAllBook(){
	//String path = new File("src\\databaseSaving\\All Books.txt").getAbsolutePath();
        String path = new File("src/main/java/database/All Books.txt").getAbsolutePath();
        
        try (FileWriter fstream = new FileWriter(path);
	    BufferedWriter info = new BufferedWriter(fstream)) {
            for(Book value: this.allBook.values()){
		info.write(String.format(value.getIdBook()+ "%n"));
                info.write(String.format(value.getTitle()+ "%n"));
                info.write(String.format(value.getCategory()+ "%n"));
                info.write(String.format(value.getAuthor()+ "%n"));
                info.write(String.format(value.getStartBorrowed()+ "%n"));
                info.write(String.format(value.getEndBorrowedPrediction()+ "%n"));
                info.write(String.format(value.getAvailable()+ "%n"));
                info.write(String.format(value.getWho_is_borrowing_this_book()+ "%n"));
                info.write(String.format(value.getLink()+ "%n"));
                info.write(String.format(value.getLinkPdf()+ "%n"));
                info.write(String.format(value.getLinkAudio()+ "%n"));
            }  
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    
    
    //Load information of all the books
    public void loadAllBook(){
        //String path = new File("src\\databaseSaving\\All Books.txt").getAbsolutePath();
        String path = new File("src/main/java/database/All Books.txt").getAbsolutePath();
        try {
            List<String> content = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
            String id = "0";
	    int length = content.size();
            if (length!=0){
                for(int i=0; i<length/11; i++){
                    id = content.get(11*i);
                    this.allBook.put(id, new Book());
                    this.allBook.get(id).setIdBook(content.get(11*i));
                    this.allBook.get(id).setTitle(content.get(11*i+1));
                    this.allBook.get(id).setCategory(content.get(11*i+2));
                    this.allBook.get(id).setAuthor(content.get(11*i+3));
                    this.allBook.get(id).setStartBorrowed(content.get(11*i+4));
                    this.allBook.get(id).setEndBorrowedPrediction(content.get(11*i+5));
                    this.allBook.get(id).setAvailable(content.get(11*i+6));
                    this.allBook.get(id).setWho_is_borrowing_this_book(content.get(11*i+7));
                    this.allBook.get(id).setLink(content.get(11*i+8));
                    this.allBook.get(id).setLinkPdf(content.get(11*i+9));
                    this.allBook.get(id).setLinkAudio(content.get(11*i+10));
                }
            }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    
    
    //Check login of manager
    public int checkLoginManager(HashMap<String, Manager> managerList, String username, String pass){
	for(String key: managerList.keySet()){
            if (key.equals(username)){
                if (pass.equals(managerList.get(key).getPassword())){
                    return 1;
                }
            }
	}
	return 0;
    }
    
    
    //Check login of student
    public int checkLoginStudent(HashMap<String, Student> studentList, String username, String pass){
	for(String key: studentList.keySet()){
            if (key.equals(username)){
                if (pass.equals(studentList.get(key).getPassword())){
                    return 1;
                }
            }
	}
	return 0;
    }
    
    
    //Check change password for manager
    public void checkChangePasswordManager(String str1, String str2){
        if (!(str1.equals(str2))){
            JOptionPane.showMessageDialog(null, "New password is different than confirm!\nPlease type again");
        }
        else{
            if (this.type_of_user_using_this_program.equals("manager")){
                this.allManager.get(this.who_is_using_this_program).setPassword(str1);
                this.saveAllManager();
                JOptionPane.showMessageDialog(null, "Change password successfully");
            }
            else if (this.type_of_user_using_this_program.equals("student")){
                this.allStudent.get(this.who_is_using_this_program).setPassword(str1);
                this.saveAllStudent();
                JOptionPane.showMessageDialog(null, "Change password successfully");
            }
        } 
    }
    
    
    public static void copyFileUsingChannel(File source, File dest) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }finally{
           sourceChannel.close();
           destChannel.close();
        }
    }
    
    public boolean checkingNotDuplicateAvatarFile(String path){
        int count = 0;
        for(Manager value: ManageData.getManageData().allManager.values()){
            if (value.getLinkOfAvatar().equals(path)){
                count++;
            }
        }
        for(Student value: ManageData.getManageData().allStudent.values()){
            if (value.getLinkOfAvatar().equals(path)){
                count++;
            }
        }
        
        if (count == 1){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    
    public boolean checkingNotDuplicateBook(String id){
        int count = 0;
        for(String key: allBook.keySet()){
            if (key.equals(id)){
                count++;
            }
        }
        if (count==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    /*public void copyCategoryMapComboBox(JComboBox jComboBox1){
        this.comboBoxSupport.clear();
        for(Book key: allBook.values()){
            this.comboBoxSupport.put(key.getCategory(), "1");
        }
        for (String key: comboBoxSupport.keySet()){
            jComboBox1.addItem(key);
        }
    }*/
    
    /*public void updateStudentFine(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = java.time.LocalDate.now();
        
        for(Book value: ManageData.getManageData().allBook.values()){
            if (!value.getWho_is_borrowing_this_book().equals("null")){
                LocalDate startBorrowed = LocalDate.parse(value.getStartBorrowed(), formatter);
                Period period = Period.between(startBorrowed, today);
                int differentDays = period.getDays();
                System.out.println(differentDays);
                if (differentDays > 10){
                    this.allStudent.get(value.getWho_is_borrowing_this_book()).setFine((differentDays - 10)*15000);
                }
            }
            
        }
    }*/
    
    public void updateStudentFine(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = java.time.LocalDate.now();
        
        for(String key: this.allStudent.keySet()){
            int fine = 0;
            for(Book value: this.allBook.values()){
                if(value.getWho_is_borrowing_this_book()!=null){
                    if (!value.getWho_is_borrowing_this_book().equals("null")){
                        if(value.getWho_is_borrowing_this_book().equals(key)){
                            LocalDate startBorrowed = LocalDate.parse(value.getStartBorrowed(), formatter);
                            Period period = Period.between(startBorrowed, today);
                            int differentDays = period.getDays();
                            if (differentDays > 10){
                                fine += (differentDays - 10);
                            }
                        } 
                    }
                } 
            }
            if (fine > 0){
                fine *= 15000;
            }
            this.allStudent.get(key).setFine(fine);
        }
    }
    
    
    /*public void openPdfFile(String path){
        try{
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + path);
        }
        catch(Exception e){
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                try {
                    desktop.open(new File(path));
                } catch (IOException ex) {
                    //Logger.getLogger(ManageData.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "This file is not supported by the system");
                }
            } 
            else {
                System.out.println("Open is not supported");
            }
            //JOptionPane.showMessageDialog(null, "This file is not supported by the system");
        }
    }*/
    
    public void openPdfFile(String path){
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                try {
                    desktop.open(new File(path));
                } catch (IOException ex) {
                    //Logger.getLogger(ManageData.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "This file is not supported by the system");
                }
            } 
            else {
                System.out.println("Open is not supported");
            }
    }
}
