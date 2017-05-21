DROP TABLE public.muscle_group_exercise;

CREATE TABLE public.muscle_group_exercise
(
    muscle_group_id bigint NOT NULL,
    exercise_id bigint NOT NULL,
    CONSTRAINT muscle_group_exercise_pkey PRIMARY KEY (muscle_group_id, exercise_id),
    CONSTRAINT muscle_group_fkey FOREIGN KEY (muscle_group_id)
        REFERENCES public.muscle_group (muscle_group_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT exercise_fkey FOREIGN KEY (exercise_id)
        REFERENCES public.exercise (exercise_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.muscle_group_exercise
    OWNER to postgres;