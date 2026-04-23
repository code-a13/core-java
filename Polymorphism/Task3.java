package Polymorphism;

public class Task3 {
    public static void main(String[] args) {
        LibrarySearch lib = new LibrarySearch();
        LibrarySearch digital = new EBookSearch();
        lib.find("IKIGAI");
        lib.find(13);
        digital.find("Ikigai");
    }
}

class LibrarySearch{
    void find(String bookName){
        System.out.println("Searching by Name: "+bookName);
    }
    void find(int bookId){
        System.out.println("Searching by Id: "+bookId);
    }
}

class EBookSearch extends LibrarySearch{
    @Override
    void find(String bookName){
        System.out.println("Searching in Digital Databases: "+bookName);
    }
}