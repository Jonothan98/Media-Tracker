package com.MediaTracker.UserService.Repository;

import com.MediaTracker.UserService.Models.ShowList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowListRepository extends JpaRepository<ShowList,Integer> {
}
