package com.keepit.blackparade.dio;

import com.keepit.blackparade.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//Allowed Operations
public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonsById(UUID id);
    int deletePersonById(UUID id);
    int updatePersonById(UUID id, Person person);
}
