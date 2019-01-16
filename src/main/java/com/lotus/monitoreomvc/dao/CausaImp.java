package com.lotus.monitoreomvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.monitoreomvc.configuration.AbstractSession;
import com.lotus.monitoreomvc.dao.interfaz.CausaDao;
import com.lotus.monitoreomvc.model.Causa;


@Repository
@Transactional
public class CausaImp extends AbstractSession implements CausaDao {

	public void insert(Causa o) {
		getSession().persist(o);
	}

	public void update(Causa o) {
		getSession().update(o);
	}

	public void delete(Long id) {
		Causa o = (Causa) findOneById(id);
		if(o!=null) {
			getSession().delete(o);
		}
	}

	public Causa findOneById(Long id) {
		// TODO Auto-generated method stub
		return (Causa) getSession().get(Causa.class, id);
	}

	public Causa findOneByName(String t) {
		return (Causa) getSession().createQuery(
				"from Causa from name = :name")
				.setParameter("name", t).list();
	}

	public List<Causa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	//public List<Causa> findAll() {
	//	return (List<Causa>) getSession().createQuery("from tbCausa").list();
	//}

}
