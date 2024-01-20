package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.UserfeedbackForm;

@Repository
public interface UserFeedBackFormDao extends JpaRepository<UserfeedbackForm, Integer>{

}
