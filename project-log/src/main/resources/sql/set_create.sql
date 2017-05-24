DROP TABLE projectlog.working_set;

CREATE TABLE projectlog.working_set
(
    working_set_id SERIAL NOT NULL,
    reps character varying(30) NOT NULL,
    weights character varying(30) NOT NULL,
    exercise_id integer NOT NULL,
    CONSTRAINT working_set_pkey PRIMARY KEY (working_set_id),
    CONSTRAINT working_set_exercise_id_fkey FOREIGN KEY (exercise_id)
	    REFERENCES projectlog.exercise (exercise_id) MATCH SIMPLE
	    ON UPDATE NO ACTION
	    ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.working_set
    OWNER to postgres;