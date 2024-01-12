package com.example.ScheduleORCweb.repo;

import com.example.ScheduleORCweb.models.schedule;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

;
@Repository
public interface scheduleRepository extends CrudRepository<schedule, Long>{

    @Query("select s from schedule s WHERE s.day=:day AND s.week_of_the_year=:week_of_the_year AND s.until_after=:until_after")
    Iterable<schedule> findNameByAll(@Param("week_of_the_year") String week_of_the_year,@Param("day") String day,@Param("until_after") String until_after);
    @Transactional
    @Modifying
    @Query("UPDATE schedule s SET s.name=:name WHERE s.day=:day AND s.week_of_the_year=:week_of_the_year AND s.until_after=:until_after")
    void UPDATENameByAll(@Param("week_of_the_year") String week_of_the_year,@Param("day") String day,@Param("until_after") String until_after,@Param("name") String name);
    @Transactional
    @Modifying
    @Query("DELETE from schedule s WHERE s.day=:day AND s.week_of_the_year=:week_of_the_year AND s.until_after=:until_after")
    void deleteNameByAll(@Param("week_of_the_year") String week_of_the_year,@Param("day") String day,@Param("until_after") String until_after);


}
