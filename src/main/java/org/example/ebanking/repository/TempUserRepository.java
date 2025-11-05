package org.example.ebanking.repository;


import org.example.ebanking.entity.TempUser;
import org.springframework.data.repository.CrudRepository;

public interface TempUserRepository extends CrudRepository<TempUser, String> {

}