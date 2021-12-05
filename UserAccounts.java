package assignment_2;

public class UserAccounts {

	private int bookId;
	private String bookname;
	private double bookprice;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	public UserAccounts(int bookId, String bookname, double bookprice) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "UserAccounts [bookId=" + bookId + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}

	

}
