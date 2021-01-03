/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Book { 
    //Information of a book
    private String author;
    private String title;
    private String idBook;
    private String category;
    private String startBorrowed;
    private String endBorrowedPrediction;
    private String available;
    
    //Link image of the book
    private String link;
    
    //Link pdf and audio of the book
    private String linkPdf;
    private String linkAudio;
    
    
    //Consider who is borrowing this book
    private String who_is_borrowing_this_book = null;
    
    //Getters and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStartBorrowed() {
        return startBorrowed;
    }

    public void setStartBorrowed(String startBorrowed) {
        this.startBorrowed = startBorrowed;
    }

    public String getEndBorrowedPrediction() {
        return endBorrowedPrediction;
    }

    public void setEndBorrowedPrediction(String endBorrowedPrediction) {
        this.endBorrowedPrediction = endBorrowedPrediction;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    public String getWho_is_borrowing_this_book() {
        return who_is_borrowing_this_book;
    }

    public void setWho_is_borrowing_this_book(String who_is_borrowing_this_book) {
        this.who_is_borrowing_this_book = who_is_borrowing_this_book;
    }
    
    public String getLinkPdf() {
        return linkPdf;
    }

    public void setLinkPdf(String linkPdf) {
        this.linkPdf = linkPdf;
    }
    
    public String getLinkAudio() {
        return linkAudio;
    }

    public void setLinkAudio(String linkAudio) {
        this.linkAudio = linkAudio;
    }
    //End of getters and setters
    
    
    //Format the date
   /* public void setDate(Date object){
        this.projectId = id;
        String date1;
        date1 = startDate + "/" + startMonth + "/" + startYear;
        this.startDate = formatter.parse(date1);
        date1 = endDate + "/" + endMonth + "/" + endYear;
        this.endDate = formatter.parse(date1);
    }*/

    
    
}
