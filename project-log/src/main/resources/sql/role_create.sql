DROP TABLE public.role;

CREATE TABLE public.role
(
    role_id integer NOT NULL DEFAULT nextval('user_profile_id_seq'::regclass),
    name character varying(30) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT user_profile_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.role
    OWNER to postgres;