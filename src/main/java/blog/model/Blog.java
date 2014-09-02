package blog.model;

import java.util.Date;

public class Blog {
	private long id;
	private User user;
	private String title;
	private String content;
	private Date createTime;
	private Date lastModify;
	private int readCount;
	private boolean isDisplay;
	private String relatePic;
}
