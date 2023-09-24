package fr.emile.laze.model.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.emile.laze.common.IConstant;
import fr.emile.laze.entity.User;
import fr.emile.laze.model.connector.HibernateConnector;
import fr.emile.laze.model.dao.interfaces.IUserDao;

public class UserDao implements IUserDao, IConstant {
	
	
	

	public UserDao() {
	}

	@Override
	public User add(User user) throws Exception {
		Session session = HibernateConnector.getSession();
		Transaction transaction = null ;
		try {
			
		
		transaction = session.beginTransaction();
		session.save(user.getAddress());
		session.save(user);
		transaction.commit();
		} catch (Exception e) {
		
			if (transaction!= null) {
				transaction.rollback();
			}
			
		} finally {
			if (session != null && session.isOpen())
				session.close();
			
		}
		
		
		
		return null;
	}

	@Override
	public User get(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Update(User user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id, boolean isDeleted) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User user, boolean isDeleted) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
