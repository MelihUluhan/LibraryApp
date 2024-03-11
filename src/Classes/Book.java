package Classes;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    public static ArrayList<BookInfo> arraylist = new ArrayList<BookInfo>();
    public static ArrayList<BookInfo> rBook = new ArrayList<BookInfo>();

    public static File bookFile = new File("book.txt");
    public static File rFile = new File("returnbook.txt");

    public static ArrayList<BookInfo> getArraylist() {
        return arraylist;
    }

    

    public static boolean searchName(String name) {
        for (BookInfo a : arraylist) {
            if (a.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public static boolean searchAuthor(String author) {
        for (BookInfo a : arraylist) {
            if (a.getAuthor().equals(author)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean searchId(int id) {
        for (BookInfo a : arraylist) {
            if (a.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static String displayAll(ArrayList arraylist) {
        String all = "";
        for (int i = 0; i < arraylist.size(); i++) {
            all += arraylist.get(i).toString() + "\n";
        }
        return all;
    }

    public static void readtxtFile() {

        try {
            Scanner input = new Scanner(bookFile);
            while (input.hasNext()) {
                int id = input.nextInt();
                String name = input.next();
                String author = input.next();
                String book_category = input.next();
                int page = input.nextInt();
                
                arraylist.add(new BookInfo(id,name, author, book_category, page));

            }
            input.close();
            
            Scanner input2 = new Scanner(rFile);
            while (input2.hasNext()) {
                int id = input2.nextInt();
                String name = input2.next();
                String author = input2.next();
                String book_category = input2.next();
                int page = input2.nextInt();
                
                rBook.add(new BookInfo(id,name, author, book_category, page));

            }
            input2.close();

        } catch (Exception e) {
            System.out.println("Read operation problem." + e);
        }

    }

    public static void addBook(int id,String name, String author, String book_category, int page) {
        Book.arraylist.add(new BookInfo(id,name, author, book_category, page));
    }

    public static void delBook(int id) {
        try {
            int index=-1;
            for (int i=0; i<arraylist.size(); i++) {
            if (arraylist.get(i).getId() == id) {
                index = i;
            }
            
            }
            if(index != -1){
                arraylist.remove(index);
            }
            
            
        } catch (Exception e) {
            System.out.println("");
        }
        
    }
}
