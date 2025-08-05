package librarymanagement;

public class books {

	int id;
	String name;
	String author;
    boolean avl;
	public books(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this .avl=true;
	}

	@Override
	public String toString() {
		return "books [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
