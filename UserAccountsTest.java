package assignment_2;

import java.util.*;

public class UserAccountsTest {

	public static void main(String[] args) {
		int bookId;
		String bookname;
		double bookprice = 0;
		int count = 0;

		Scanner as = new Scanner(System.in);
		UserAccounts ua[] = new UserAccounts[100];
		while (true) {
			System.out.println("1.Add new book");
			System.out.println("2.Update existing book");
			System.out.println("3.Search particular book");
			System.out.println("4.Display all books");
			System.out.println("5.Delete existing book");
			System.out.println(" ");
			System.out.println("Enter your choice:");
			int choice = as.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter number of books to be added: ");
				int n = as.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.println("Enter bookId");
					bookId = as.nextInt();
					System.out.println("Enter book name: ");
					bookname = as.next();
					System.out.println("Enter price:");
					bookprice = as.nextDouble();
					ua[count] = new UserAccounts(bookId, bookname, bookprice);
					count++;
				}
				System.out.println("book Added Sucessfully.");
				System.out.println(" ");
				break;

			case 2:
				System.out.println("Enter the bookID to Update:");
				bookId = as.nextInt();
				for (int i = 0; i < count; i++) {
					if (ua[i] != null && ua[i].getBookId() == bookId) {
						System.out.println("Enter book name for update: ");
						bookname = as.next();
						ua[i].setBookname(bookname);
						System.out.println("Enter price to update: ");
						bookprice = as.nextDouble();
						ua[i].setBookprice(bookprice);
					}

				}
				System.out.println("Book updated Sucessfully.");
				System.out.println(" ");
				break;

			case 3:
				System.out.println("Enter the BookId to search: ");
				bookId = as.nextInt();
				for (int i = 0; i < count; i++) {
					if (ua[i] != null && ua[i].getBookId() == bookId) {
						System.out.println(ua[i]);
					}
				}
				System.out.println("Search Completed.");
				System.out.println(" ");
				break;

			case 4:
				System.out.println("All Books are:");
				for (int i = 0; i < count; i++) {
					System.out.println(ua[i]);
				}
				System.out.println(" ");
				break;

			case 5:
				System.out.println("Enter BookID to delete: ");
				bookId = as.nextInt();
				for (int i = 0; i < count; i++) {
					if (ua[i] != null && ua[i].getBookId() == bookId) {
						ua[i] = null;
					}
				}
				System.out.println("Deleted Sucessfully.");
				break;

			default:
				System.out.println("Entered Wrong Number.");
			}
		}
	}
}
