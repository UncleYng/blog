package blog.model;

import java.util.Date;

public class Comment {
	private long id;
	private String comment;
	private Blog blog;
	private Date createTime;
	private User fromWho;
}
