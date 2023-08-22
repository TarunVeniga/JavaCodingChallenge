package com.coding.Java.Coding.Challenge2.repository;

import com.coding.Java.Coding.Challenge2.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(String status);

    List<Task> findAllByCompletedDateLessThanEqualAndCompletedDateGreaterThanEqual(Date startDate, Date endDate);

    List<Task> findAllByDueDateLessThan(Date currentDate);
}
