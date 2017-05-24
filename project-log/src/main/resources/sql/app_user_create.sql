DROP TABLE projectlog.app_user;

CREATE TABLE projectlog.app_user
(
    user_id SERIAL NOT NULL,
    password character varying(100) NOT NULL,
    first_name character varying(30) NOT NULL,
    last_name character varying(30) NOT NULL,
    email character varying(30) NOT NULL,
    active boolean NOT NULL,
    CONSTRAINT app_user_pkey PRIMARY KEY (user_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.app_user
    OWNER to postgres;