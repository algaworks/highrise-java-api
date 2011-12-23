/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.highrisehq.managers;

import com.algaworks.highrisehq.bean.ListWrapper;
import com.sun.jersey.api.client.WebResource;
import java.util.List;
import javax.ws.rs.core.MultivaluedMap;

/**
 *
 * @author duncan
 */
public class DealManager extends HighriseManager {

    public DealManager(WebResource webResource, String authorization) {
        super(webResource, authorization);
    }
    
    @Override
    public <T, W extends ListWrapper<T>> List<T> getAsList(Class<T> objectType, Class<W> listWrapType, String path, MultivaluedMap<String, String> params) {
        return super.getAsList(objectType, listWrapType, path, params);
    }
}
