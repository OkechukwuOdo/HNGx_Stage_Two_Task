package com.HNGx.App.HNGx_Stage_Two_Task.repository;

import com.HNGx.App.HNGx_Stage_Two_Task.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Client,Long> {

}
