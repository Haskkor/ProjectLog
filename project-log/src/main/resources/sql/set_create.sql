DROP TABLE projectlog.set;

CREATE TABLE projectlog.set
(
    set_id SERIAL NOT NULL,
    reps character varying(30) NOT NULL,
    weights character varying(30) NOT NULL,
    exercise_id integer NOT NULL,
    CONSTRAINT set_pkey PRIMARY KEY (id),
    CONSTRAINT set_exercise_id_fkey FOREIGN KEY (exercise_id)
	    REFERENCES projectlog.exercise (exercise_id) MATCH SIMPLE
	    ON UPDATE NO ACTION
	    ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.set
    OWNER to postgres;