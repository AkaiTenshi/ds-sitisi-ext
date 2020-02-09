package gr.hua.dit.ds.sitisi.ext.dao;

import gr.hua.dit.ds.sitisi.ext.entity.User;

public interface UserDAO {
	User findUserByUsername(String username);
}
