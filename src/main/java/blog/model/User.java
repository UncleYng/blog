package blog.model;

import java.util.Date;

public class User {
	private long id;
	private String username;
	private String password;
	private String email;
	private int level;	// 用户状态，默认为0，激活后为1
	private Date createTime;
	private Date lastActive;
	
}
