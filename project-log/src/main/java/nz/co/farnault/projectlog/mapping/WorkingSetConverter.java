package nz.co.farnault.projectlog.mapping;

import java.util.HashSet;
import java.util.Set;

import nz.co.farnault.projectlog.dto.WorkingSetDTO;
import nz.co.farnault.projectlog.model.WorkingSet;

public class WorkingSetConverter {

	public static WorkingSetDTO convert(WorkingSet workingSet) {
		WorkingSetDTO dto = new WorkingSetDTO();
		dto.setId(workingSet.getId());
		dto.setReps(workingSet.getReps());
		dto.setWeights(workingSet.getWeights());
		dto.setExercise(ExerciseConverter.convert(workingSet.getExercise()));
		dto.setWorkouts(WorkoutConverter.convertWorkouts(workingSet.getWorkouts()));
		return dto;
	}

	public static WorkingSet convert(WorkingSetDTO dto) {
		WorkingSet workingSet = new WorkingSet();
		workingSet.setId(dto.getId());
		workingSet.setReps(dto.getReps());
		workingSet.setWeights(dto.getWeights());
		workingSet.setExercise(ExerciseConverter.convert(dto.getExercise()));
		workingSet.setWorkouts(WorkoutConverter.convertWorkoutDTOs(dto.getWorkouts()));
		return workingSet;
	}

	public static Set<WorkingSetDTO> convertWorkingSets(Set<WorkingSet> workingSets) {
		Set<WorkingSetDTO> dtos = new HashSet<WorkingSetDTO>();
		for (WorkingSet workingSet : workingSets) {
			dtos.add(convert(workingSet));
		}
		return dtos;
	}

	public static Set<WorkingSet> convertWorkingSetDTOs(Set<WorkingSetDTO> dtos) {
		Set<WorkingSet> workingSets = new HashSet<WorkingSet>();
		for (WorkingSetDTO dto : dtos) {
			workingSets.add(convert(dto));
		}
		return workingSets;
	}
}
