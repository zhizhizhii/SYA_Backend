package com.sya.dao;

import com.sya.model.Favorite;
import com.sya.model.Work;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkDAO extends CrudRepository<Work, Integer> {

    List<Work> findAllByFavoriteHasWorks_Favorite(Favorite favorite);
}
