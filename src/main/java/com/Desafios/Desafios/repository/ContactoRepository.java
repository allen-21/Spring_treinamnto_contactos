package com.Desafios.Desafios.repository;

import com.Desafios.Desafios.models.ContactoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ContactoRepository extends CrudRepository<ContactoModel, Long> {
}
