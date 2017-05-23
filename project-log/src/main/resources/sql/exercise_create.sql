DROP TABLE projectlog.exercise;

CREATE TABLE projectlog.exercise
(
    exercise_id SERIAL NOT NULL,
    name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT exercise_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.exercise
    OWNER to postgres;