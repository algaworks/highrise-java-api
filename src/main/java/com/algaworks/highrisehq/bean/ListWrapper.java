package com.algaworks.highrisehq.bean;

import java.util.List;

/**
 * 
 * @author thiagofa
 *
 */
public interface ListWrapper<T> {

	public List<T> getObjects();
	public void setObjects(List<T> objects);
	
}