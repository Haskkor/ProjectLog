package nz.co.farnault.projectlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nz.co.farnault.projectlog.repository.MuscleGroupRepository;

@Service("muscleGroupService")
public class MuscleGroupServiceImpl implements MuscleGroupService {

	@Autowired
	private MuscleGroupRepository muscleGroupRepository;
}
