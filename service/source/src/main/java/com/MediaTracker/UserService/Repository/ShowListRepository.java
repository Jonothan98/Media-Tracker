package com.MediaTracker.UserService.Repository;

import com.MediaTracker.UserService.Models.ShowList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowListRepository extends JpaRepository<ShowList, Integer> {
    @Query(value = "SELECT * FROM list WHERE user_user_id = :id", nativeQuery = true)
    List<ShowList> findByUserid(int id);
}
