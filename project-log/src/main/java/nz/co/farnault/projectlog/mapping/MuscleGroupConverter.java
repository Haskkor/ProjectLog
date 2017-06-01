package nz.co.farnault.projectlog.mapping;

import java.util.HashSet;
import java.util.Set;

import nz.co.farnault.projectlog.dto.MuscleGroupDTO;
import nz.co.farnault.projectlog.model.MuscleGroup;

public class MuscleGroupConverter {

	public static MuscleGroupDTO convert(MuscleGroup muscleGroup) {
		MuscleGroupDTO dto = new MuscleGroupDTO();
		dto.setId(muscleGroup.getId());
		dto.setName(muscleGroup.getName());
		dto.setExercises(ExerciseConverter.convertExercises(muscleGroup.getExercises()));
		return dto;
	}

	public static MuscleGroup convert(MuscleGroupDTO dto) {
		MuscleGroup muscleGroup = new MuscleGroup();
		muscleGroup.setId(dto.getId());
		muscleGroup.setName(dto.getName());
		muscleGroup.setExercises(ExerciseConverter.convertExerciseDTOs(dto.getExercises()));
		return muscleGroup;
	}

	public static Set<MuscleGroupDTO> convertMuscleGroups(Set<MuscleGroup> muscleGroups) {
		Set<MuscleGroupDTO> dtos = new HashSet<MuscleGroupDTO>();
		for (MuscleGroup muscleGroup : muscleGroups) {
			dtos.add(convert(muscleGroup));
		}
		return dtos;
	}

	public static Set<MuscleGroup> convertMuscleGroupDTOs(Set<MuscleGroupDTO> dtos) {
		Set<MuscleGroup> muscleGroups = new HashSet<MuscleGroup>();
		for (MuscleGroupDTO dto : dtos) {
			muscleGroups.add(convert(dto));
		}
		return muscleGroups;
	}

}
