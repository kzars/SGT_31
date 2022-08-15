package oop;

public class Book {
    //Fields
    private String title;
    private String author;
    private int numberOfPages;

    //Setter methods
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages){
        if(isNumberOfPagesCorrect(numberOfPages)){
            this.numberOfPages = numberOfPages;
        }else {
            System.out.println("The provided number of pages is incorrect: " + numberOfPages);
        }
    }

    //Methods
    private  boolean isNumberOfPagesCorrect(int numberOfPages){
        return numberOfPages > 10;
    }

    public void printBookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);
    }

}
