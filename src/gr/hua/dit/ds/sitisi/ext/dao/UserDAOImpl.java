package gr.hua.dit.ds.sitisi.ext.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gr.hua.dit.ds.sitisi.ext.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{

	// inject the session factory
		@Autowired
		private SessionFactory sessionFactory;

		@Override
		@Transactional
		public User findUserByUsername(String username) {
			return sessionFactory.getCurrentSession().get(User.class, username);

		}

}
