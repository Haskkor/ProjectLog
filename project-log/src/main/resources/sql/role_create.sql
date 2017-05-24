--DROP TABLE projectlog.role;

CREATE TABLE projectlog.role
(
    role_id SERIAL NOT NULL,
    name character varying(30) NOT NULL,
    CONSTRAINT user_profile_pkey PRIMARY KEY (role_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.role
    OWNER to postgres;