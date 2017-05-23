DROP TABLE projectlog.set;

CREATE TABLE projectlog.set
(
    set_id SERIAL NOT NULL,
    reps character varying(30) COLLATE pg_catalog."default" NOT NULL,
    weights character varying(30) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT set_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.set
    OWNER to postgres;