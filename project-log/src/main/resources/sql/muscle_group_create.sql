DROP TABLE projectlog.muscle_group;

CREATE TABLE projectlog.muscle_group
(
    muscle_group_id SERIAL NOT NULL,
    name character varying(30) NOT NULL,
    CONSTRAINT muscle_group_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.muscle_group
    OWNER to postgres;