package com.tpi.crud.dao.api;

import com.tpi.crud.entity.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface ContactosDaoAPI  extends CrudRepository<Contacto,Long> {

}
