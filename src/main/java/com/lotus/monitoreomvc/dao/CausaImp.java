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

	@Override
	public void insert(Causa o) {
		getSession().persist(o);
	}

	@Override
	public void update(Causa o) {
		getSession().update(o);
	}

	@Override
	public void delete(Long id) {
		Causa o = (Causa) findOneById(id);
		if(o!=null) {
			getSession().delete(o);
		}
	}

	@Override
	public Causa findOneById(Long id) {
		// TODO Auto-generated method stub
		return (Causa) getSession().get(Causa.class, id);
	}

	@Override
	public Causa findOneByName(String t) {
		return (Causa) getSession().createQuery(
				"from Causa from name = :name")
				.setParameter("name", t).list();
	}

	@Override
	public List<Causa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	//public List<Causa> findAll() {
	//	return (List<Causa>) getSession().createQuery("from tbCausa").list();
	//}

}
