--DROP TABLE projectlog.workout_working_set;

CREATE TABLE projectlog.workout_working_set
(
    workout_id bigint NOT NULL,
    working_set_id bigint NOT NULL,
    CONSTRAINT workout_working_set_pkey PRIMARY KEY (workout_id, working_set_id),
    CONSTRAINT workout_fkey FOREIGN KEY (workout_id)
        REFERENCES projectlog.workout (workout_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT working_set_fkey FOREIGN KEY (working_set_id)
        REFERENCES projectlog.working_set (working_set_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.workout_working_set
    OWNER to postgres;