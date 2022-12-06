package com.tpi.crud.service.impl;

import com.tpi.crud.commons.GenericServiceImpl;
import com.tpi.crud.dao.api.ContactosDaoAPI;
import com.tpi.crud.entity.Contacto;
import com.tpi.crud.service.api.ContactosServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactosServiceImpl extends GenericServiceImpl<Contacto,Long> implements ContactosServiceAPI {

    @Autowired
    private ContactosDaoAPI contactosDaoAPI;
    @Override
    public CrudRepository<Contacto, Long> getDao() {
        return contactosDaoAPI;
    }
}
