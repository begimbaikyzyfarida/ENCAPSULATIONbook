import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(123,"Jamilya","Chyngyz Aitmatov",1879);
        Book book2 = new Book (456,"World", "Lev Tolstoi",1645);
        Book book3 = new Book (64,"Voina i mir", "William Cuthbert Faulkner",1998);
        Book book4 = new Book (4231,"Hello", "William Cuthbert Faulkner",2022);
        Book book5 = new Book (56,"Bye", "Joseph Blotner",1981);
        Book book6 = new Book (26,"See you", "James Arthur Baldwin",1964);

        Book [] books = {book1,book2,book3,book4,book6};
        Library library = new Library("Bilimkana","Tunguch 89",books);
        System.out.println(library.addABookToTheLibrary(book5));
        System.out.println(Arrays.toString(library.removeBookFromLibrary(book4)));
        System.out.println(library.updateBookByName("Bye", 45));
        System.out.println(Arrays.toString(library.getAllBookByAuthor("Chyngyz Aitmatov")));
        System.out.println(library);
    }
}
