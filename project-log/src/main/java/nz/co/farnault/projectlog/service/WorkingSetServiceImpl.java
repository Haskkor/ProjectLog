package nz.co.farnault.projectlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nz.co.farnault.projectlog.repository.WorkingSetRepository;

@Service("workingSetService")
public class WorkingSetServiceImpl implements WorkingSetService {

	@Autowired
	private WorkingSetRepository workingSetRepository;
}
