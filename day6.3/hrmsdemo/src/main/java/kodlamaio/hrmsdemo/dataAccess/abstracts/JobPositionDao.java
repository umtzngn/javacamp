package kodlamaio.hrmsdemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsdemo.entities.concretes.JobPosition;

public interface JobPositionDao  extends JpaRepository<JobPosition, Integer>{

}
