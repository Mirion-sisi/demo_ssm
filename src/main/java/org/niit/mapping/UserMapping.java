package org.niit.mapping;

import org.niit.pojo.User;

public interface UserMapping {
	public User selectById(int id);
	
	public int insertData(User user);
	
	public int delData(User user);
	
	public int updateData(User user);
}
