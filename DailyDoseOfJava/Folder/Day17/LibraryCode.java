package Day17;
import java.util.HashMap;
import java.util.Map;
public class LibraryCode 
{
	private int noOfBooks;
	private String name;
	private Map<String,Integer> bookGenres;
	
	public LibraryCode()
	{
		bookGenres = new HashMap<>();
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}
	
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Integer> getBookGenres() {
		return bookGenres;
	}

	public void setBookGenres(Map<String, Integer> bookGenres) {
		this.bookGenres = bookGenres;
	}
	
	public void addBook(String genre)
	{
		if(bookGenres.containsKey(genre))
		{
			bookGenres.put(genre, bookGenres.get(genre) + 1);
		}
		else 
			{
				bookGenres.put(genre,1);
			}
		noOfBooks++;
	}

	public int searchBooks(String genre)
	{
		return bookGenres.getOrDefault(genre,0);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LibraryCode library = new LibraryCode();
		library.setName("My Local library");
		library.addBook("Science Fiction");
		library.addBook("Science Fiction");
		library.addBook("Fantasy");
		library.addBook("Fantasy");
		library.addBook("Fantasy");
		
		System.out.println(library.getName());
		System.out.println(library.getNoOfBooks());
		System.out.println(library.getBookGenres());
		System.out.println(library.searchBooks("Fantasy"));
		System.out.println(library.searchBooks("Science Fiction"));
		System.out.println(library.searchBooks("Non Fiction"));
	}

}
