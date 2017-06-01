package nz.co.farnault.projectlog.mapping;

import java.util.HashSet;
import java.util.Set;

import nz.co.farnault.projectlog.dto.ExerciseDTO;
import nz.co.farnault.projectlog.model.Exercise;

public class ExerciseConverter {

	public static ExerciseDTO convert(Exercise exercise) {
		ExerciseDTO dto = new ExerciseDTO();
		dto.setId(exercise.getId());
		dto.setMuscleGroups(MuscleGroupConverter.convertMuscleGroups(exercise.getMuscleGroups()));
		dto.setName(exercise.getName());
		dto.setWorkingSets(WorkingSetConverter.convertWorkingSets(exercise.getWorkingSets()));
		return dto;
	}

	public static Exercise convert(ExerciseDTO dto) {
		Exercise exercise = new Exercise();
		exercise.setId(dto.getId());
		exercise.setMuscleGroups(MuscleGroupConverter.convertMuscleGroupDTOs(dto.getMuscleGroups()));
		exercise.setName(dto.getName());
		exercise.setWorkingSets(WorkingSetConverter.convertWorkingSetDTOs(dto.getWorkingSets()));
		return exercise;
	}

	public static Set<ExerciseDTO> convertExercises(Set<Exercise> exercises) {
		Set<ExerciseDTO> dtos = new HashSet<ExerciseDTO>();
		for (Exercise exercise : exercises) {
			dtos.add(convert(exercise));
		}
		return dtos;
	}

	public static Set<Exercise> convertExerciseDTOs(Set<ExerciseDTO> dtos) {
		Set<Exercise> exercises = new HashSet<Exercise>();
		for (ExerciseDTO dto : dtos) {
			exercises.add(convert(dto));
		}
		return exercises;
	}
}
