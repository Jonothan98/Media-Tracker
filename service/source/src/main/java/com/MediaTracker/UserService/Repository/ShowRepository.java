package com.MediaTracker.UserService.Repository;

import com.MediaTracker.UserService.Models.ShowItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface ShowRepository  extends JpaRepository<ShowItem,Long> {

}
