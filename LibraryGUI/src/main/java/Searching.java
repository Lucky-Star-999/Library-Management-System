
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Searching {
    //This class help store some temprary arrays (HashMap)
    /* When output the information in the table when searching,
       the program will go here to get information from the array.
    */
    
    //Search info of student by name (last name)
    //key = username, value = Student
    HashMap<String, Student> searchStudentByName = new HashMap<>();
    
    //Search info of student by ID Student
    //key = username, value = Student
    HashMap<String, Student> searchStudentById = new HashMap<>();
    
    
    //Merge search by ID and name of Student
    HashMap<String, Student> mergeSearch = new HashMap<>();
    
    //Search info of book by title
    //key = idBook, value = Book
    HashMap<String, Book> searchBookByName = new HashMap<>();
    
    //Search info of book by ID Book
    //key = idBook, value = Book
    HashMap<String, Book> searchBookById = new HashMap<>();
    
    //Merge search by ID and name of book
    HashMap<String, Book> searchBookByNameAndId = new HashMap<>();
    
    
    
    //This is a Singleton
    private static final Searching searching = new Searching();
    private Searching(){}
    public static Searching getSearching(){
        return searching;
    }
    
    
    //Search student by ID, "str1" is entire string, "str2" is substring needing checked
    public boolean isThisStringContainSubString(String str1, String str2){
        return str1.toLowerCase().contains(str2.toLowerCase());
    }
    
    
    //Search student name
    public void translateToSearchStudentByName(String str){
        this.searchStudentByName.clear();
        for(Student value: ManageData.getManageData().allStudent.values()){
            if (isThisStringContainSubString(value.getFullName(), str)){
                String username = value.getUsername();
                this.searchStudentByName.put(username, new Student());
                this.searchStudentByName.get(username).setUsername(value.getUsername());
                this.searchStudentByName.get(username).setFullName(value.getFullName());
                this.searchStudentByName.get(username).setPhone(value.getPhone());
                this.searchStudentByName.get(username).setIdStudent(value.getIdStudent());
            }
        }
    }
    
    
    //Search student id
    public void translateToSearchStudentById(String str){
        this.searchStudentById.clear();
        for(Student value: ManageData.getManageData().allStudent.values()){
            if (isThisStringContainSubString(value.getIdStudent(), str)){
                String username = value.getUsername();
                this.searchStudentById.put(username, new Student());
                this.searchStudentById.get(username).setUsername(value.getUsername());
                this.searchStudentById.get(username).setFullName(value.getFullName());
                this.searchStudentById.get(username).setPhone(value.getPhone());
                this.searchStudentById.get(username).setIdStudent(value.getIdStudent());
            }
        }
    }
    
    
    
    //Merge search ID and name of Student
    public void mergeSearchStudent(String str){
        this.mergeSearch.clear();
        translateToSearchStudentByName(str);
        translateToSearchStudentById(str);
        mergeSearch.putAll(searchStudentByName);
        mergeSearch.putAll(searchStudentById);
    }
    
    
    //Search book for name
    public void translateToSearchBookByName(String str){
        this.searchBookByName.clear();
        for(Book value: ManageData.getManageData().allBook.values()){
            if (isThisStringContainSubString(value.getTitle(), str)){
                String id = value.getIdBook();
                this.searchBookByName.put(id, new Book());
                this.searchBookByName.get(id).setIdBook(value.getIdBook());
                this.searchBookByName.get(id).setCategory(value.getCategory());
                this.searchBookByName.get(id).setTitle(value.getTitle());
                this.searchBookByName.get(id).setAuthor(value.getAuthor());
                this.searchBookByName.get(id).setAvailable(value.getAvailable());
            }
        }
    }
    
    
    //Search book for Id
    public void translateToSearchBookById(String str){
        this.searchBookById.clear();
        for(Book value: ManageData.getManageData().allBook.values()){
            if (isThisStringContainSubString(value.getIdBook(), str)){
                String id = value.getIdBook();
                this.searchBookById.put(id, new Book());
                this.searchBookById.get(id).setIdBook(value.getIdBook());
                this.searchBookById.get(id).setCategory(value.getCategory());
                this.searchBookById.get(id).setTitle(value.getTitle());
                this.searchBookById.get(id).setAuthor(value.getAuthor());
                this.searchBookById.get(id).setAvailable(value.getAvailable());
            }
        }
    }
    
    
    //Search book by name and ID
    public void mergeSearchBook(String str){
        this.searchBookByNameAndId.clear();
        translateToSearchBookById(str);
        translateToSearchBookByName(str);
        searchBookByNameAndId.putAll(searchBookByName);
        searchBookByNameAndId.putAll(searchBookById);
    }
        
}
