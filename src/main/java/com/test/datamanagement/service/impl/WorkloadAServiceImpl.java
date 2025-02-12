package com.test.datamanagement.service.impl;
import com.test.datamanagement.entity.WorkloadA;
import com.test.datamanagement.repository.WorkloadARepository;
import com.test.datamanagement.service.WorkloadAService;
import java.util.List;
import java.util.Optional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class WorkloadAServiceImpl implements WorkloadAService {

  private final WorkloadARepository workloadARepository;
  private final JdbcTemplate jdbcTemplate;

  public WorkloadAServiceImpl(WorkloadARepository workloadARepository, JdbcTemplate jdbcTemplate) {
    this.workloadARepository = workloadARepository;
    this.jdbcTemplate = jdbcTemplate;
  }
  @Override
  public List<WorkloadA> findAllEntity() {
    return workloadARepository.findAll();
  }
  @Override
  public Optional<WorkloadA> findById(Long id) {
    return workloadARepository.findById(id);
  }
  @Override
  public Optional<WorkloadA> findFirstByOrderByIdDesc() {
    return workloadARepository.findFirstByOrderByIdDesc();
  }
  @Override
  public WorkloadA saveEntity(WorkloadA workloadA) {
    return workloadARepository.save(workloadA);
  }
  @Override
  public WorkloadA updateEntity(WorkloadA workloadA) {
    return workloadARepository.save(workloadA);
  }
  @Override
  public void deleteEntity(Long id) {
    workloadARepository.deleteById(id);
  }

}
