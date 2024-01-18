package com.example.ScheduleORCweb.repo;

import com.example.ScheduleORCweb.models.phons_namber;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface phons_namberRepository extends CrudRepository<phons_namber, Long>{
    @Transactional
    @Modifying
    @Query("UPDATE phons_namber p SET p.namber_phone=:namber_phone WHERE p.name=:name")
    void UpdatePhoneNamberByName(@Param("namber_phone") String namber_phone,@Param("name") String name);
    @Transactional
    @Modifying
    @Query("DELETE from phons_namber p WHERE p.name=:name")
    void DeleteAllByName(@Param("name") String name);
}
