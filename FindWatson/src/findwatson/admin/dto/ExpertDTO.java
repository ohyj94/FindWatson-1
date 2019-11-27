package findwatson.admin.dto;

import java.sql.Timestamp;

public class ExpertDTO {
	private int seq;
	private String writer;
	private String title;
	private String content;
	private Timestamp writeDate;
	private int viewCount;
	
	public ExpertDTO(int seq, String writer, String title, String content, Timestamp writeDate, int viewCount) {
		super();
		this.seq = seq;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
		this.viewCount = viewCount;
	}
	public ExpertDTO() {
		super();
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	
	
}
