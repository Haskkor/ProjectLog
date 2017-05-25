package nz.co.farnault.projectlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nz.co.farnault.projectlog.repository.WorkoutRepository;

@Service("workoutService")
public class WorkoutServiceImpl implements WorkoutService {

	@Autowired
	private WorkoutRepository workoutRepository;
}
