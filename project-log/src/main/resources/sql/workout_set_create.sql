DROP TABLE projectlog.workout_set;

CREATE TABLE projectlog.workout_set
(
    workout_id bigint NOT NULL,
    set_id bigint NOT NULL,
    CONSTRAINT workout_set_pkey PRIMARY KEY (workout_id, set_id),
    CONSTRAINT workout_fkey FOREIGN KEY (workout_id)
        REFERENCES projectlog.workout (workout_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT set_fkey FOREIGN KEY (set_id)
        REFERENCES projectlog.set (set_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.workout_set
    OWNER to postgres;