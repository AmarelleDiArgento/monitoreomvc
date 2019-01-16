package com.lotus.monitoreomvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.monitoreomvc.configuration.DAO;
import com.lotus.monitoreomvc.dao.interfaz.CausaDao;
import com.lotus.monitoreomvc.model.Causa;
import com.lotus.monitoreomvc.service.interfaz.CausaSer;

@Service("causaService")
@Transactional
public class CausaSerImp implements CausaSer {
	@Autowired
	private CausaDao _causaDao;

	@Override
	public void insert(Causa o) {
		_causaDao.insert(o);
	}

	@Override
	public void update(Causa o) {
		_causaDao.update(o);
	}

	@Override
	public void delete(Long id) {
		_causaDao.delete(id);
	}

	@Override
	public Causa findOneById(Long id) {
		return _causaDao.findOneById(id);
	}

	@Override
	public Causa findOneByName(String t) {
		return _causaDao.findOneByName(t);
	}

	@Override
	public List<Causa> findAll() {
		return _causaDao.findAll();
	}

}
