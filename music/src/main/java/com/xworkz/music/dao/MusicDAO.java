package com.xworkz.music.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.music.dto.MusicDTO;

@Component
public class MusicDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public MusicDAO() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	public Integer saveAndReturnId(MusicDTO music){
		System.out.println("inside save method");
		Session session = sessionFactory.openSession(); 
		session.beginTransaction();
		try{
			Integer id = (Integer) session.save(music);
			session.getTransaction().commit();
			System.out.println("data is saved successfully with id"+id);
			return id;
		}catch(HibernateException e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
		return 0;
	}

}
