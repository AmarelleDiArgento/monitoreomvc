/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.monitoreomvc.configuration;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author almoreno
 */
public interface DAO<O, K,T> {

	void insert(O o);

	void update(O o);

	void delete(K id);

	O findOneById(K id);

	O findOneByName(T t);

	List<O> findAll();

}
