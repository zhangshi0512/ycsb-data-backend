package com.test.datamanagement.repository;

import com.test.datamanagement.entity.TestConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestConfigRepository extends JpaRepository<TestConfig, Long> {

}