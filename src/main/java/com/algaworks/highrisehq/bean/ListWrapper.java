package com.algaworks.highrisehq.bean;

import java.util.List;

public interface ListWrapper<T> {

	public List<T> getObjects();
	public void setObjects(List<T> objects);
	
}