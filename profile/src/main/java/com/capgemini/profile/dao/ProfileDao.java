package com.capgemini.profile.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDao extends MongoRepository<Profile,Long> {

}
