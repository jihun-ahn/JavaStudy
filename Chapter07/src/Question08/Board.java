package Question08;

public class Board {
	private String id;
	private String title;
	private String writer;
	private String content="";
	private String password;
	private int postNumber;
	
	public Board(String id, String title, String writer, String password) {
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.password = password;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content += content;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}

	public void resetContent() {
		this.content = "";
		
	}
}

