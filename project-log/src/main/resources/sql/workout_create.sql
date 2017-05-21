DROP TABLE public.workout;

CREATE TABLE public.workout
(
    workout_id integer NOT NULL DEFAULT nextval('workout_id_seq'::regclass),
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    date_workout date NOT NULL,
    user_id integer NOT NULL,
    CONSTRAINT workout_pkey PRIMARY KEY (workout_id),
    CONSTRAINT workout_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES public.app_user (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.workout
    OWNER to postgres;