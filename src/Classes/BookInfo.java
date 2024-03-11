
package Classes;


public class BookInfo extends Info implements Display{
    
    private String author;
    private String book_category;
    private int page;

    public BookInfo(int id,String name,String author,String book_category , int page) {
        super(name, id);
        this.author = author;
        this.book_category = book_category;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public String getBook_category() {
        return book_category;
    }

    public int getPage() {
        return page;
    }

    

    @Override
    public String toString() {
        return  id+ " " +name + " " + author + " " + book_category + " " + page ;
    }

    @Override
    public void display() {
        for(BookInfo a : Book.arraylist){
            System.out.println(a);
        }
    }
    

    
    
    
    
}
