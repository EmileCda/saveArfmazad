package fr.emile.laze.model.dao.interfaces;

import java.util.List;

import fr.emile.laze.entity.User;

public interface IUserDao {

	User add(User user) throws Exception;
	User get(int id) throws Exception;
	List<User> get() throws Exception;
	int Update(User user)throws Exception;
	int delete (int id,boolean isDeleted)throws Exception;
	int delete (User user,boolean isDeleted)throws Exception;
	int delete (int id)throws Exception;
	int delete (User user)throws Exception;
}
