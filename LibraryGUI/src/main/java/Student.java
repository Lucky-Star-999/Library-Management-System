
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Student extends User{
    
    //Personal information
    private String idStudent;
    private int fine = 0;
    
    //Array List containing books that a student borrowed (not been returned yet)
    //It contains id of the book
    ArrayList<String> bookBorrowed = new ArrayList<>();
    
    
    //Getters and setters
    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public ArrayList<String> getBookBorrowed() {
        return bookBorrowed;
    }

    public void setBookBorrowed(ArrayList<String> bookBorrowed) {
        this.bookBorrowed = bookBorrowed;
    }
    //End of getters and setters
    
    
}
