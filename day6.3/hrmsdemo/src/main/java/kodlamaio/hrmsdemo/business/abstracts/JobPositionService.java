package kodlamaio.hrmsdemo.business.abstracts;

import java.util.List;

import kodlamaio.hrmsdemo.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();

}
