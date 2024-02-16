public class Main {

    public static void main(String[] args) {
        AList<Book> aList = new AList<>();
        SLList<Book> sList = new SLList<>();
        DLList<Book> dlList = new DLList<>();
        //AList bookList = new AList<>();


        Book book1 = new Book("It", "Stephen King", 20.99);
        Book book2 = new Book("A Court of Thorns and Roses", "Sarah J Maas", 25.95);
        Book book3 = new Book("If You Give A Mouse A Cookie", "Laura Numeroff", 10.85);
        //System.out.println(bookList);

        //bookList.toString();

        //Adding elements
        aList.listAdd(book1);
        aList.listAdd(book1);
        aList.listAdd(book3);
        aList.listAdd(book1);

        sList.listAdd(book1);
        sList.listAdd(book1);
        sList.listAdd(book2);
        sList.listAdd(book1);

        dlList.listAdd(book1);
        dlList.listAdd(book1);
        dlList.listAdd(book2);
        dlList.listAdd(book1);

        System.out.println("Array List: ");
        System.out.println(aList);
        System.out.println("**********************");

        System.out.println("Singly Linked List: ");
        System.out.println(sList);
        System.out.println("**********************");


        System.out.println("Double Linked List: ");
        System.out.println(dlList);
        System.out.println("**********************");

        //Removing an Element
        aList.listRemove(1);
        sList.listRemove(2);
        dlList.listRemove(3);

        System.out.println("New Array List: ");
        System.out.println(aList);
        System.out.println("**********************");

        System.out.println("New Singly Linked List: ");
        System.out.println(sList);
        System.out.println("**********************");

        System.out.println("New Double Linked List: ");
        System.out.println(dlList);
        System.out.println("**********************");

    }
}
