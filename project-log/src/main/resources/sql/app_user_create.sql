DROP TABLE projectlog.app_user;

CREATE TABLE projectlog.app_user
(
    user_id SERIAL NOT NULL,
    password character varying(100) COLLATE pg_catalog."default" NOT NULL,
    first_name character varying(30) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(30) COLLATE pg_catalog."default" NOT NULL,
    email character varying(30) COLLATE pg_catalog."default" NOT NULL,
    active boolean COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT app_user_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.app_user
    OWNER to postgres;