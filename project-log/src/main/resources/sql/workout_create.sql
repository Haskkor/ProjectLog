DROP TABLE projectlog.workout;

CREATE TABLE projectlog.workout
(
    workout_id SERIAL NOT NULL,
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    date_workout date NOT NULL,
    user_id integer NOT NULL,
    CONSTRAINT workout_pkey PRIMARY KEY (workout_id),
    CONSTRAINT workout_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES projectlog.app_user (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.workout
    OWNER to postgres;