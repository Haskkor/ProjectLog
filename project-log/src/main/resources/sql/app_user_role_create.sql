DROP TABLE projectlog.app_user_role;

CREATE TABLE projectlog.app_user_role
(
    app_user_id bigint NOT NULL,
    role_id bigint NOT NULL,
    CONSTRAINT app_user_role_pkey PRIMARY KEY (app_user_id, role_id),
    CONSTRAINT app_user_fkey FOREIGN KEY (app_user_id)
        REFERENCES projectlog.app_user (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT role_fkey FOREIGN KEY (role_id)
        REFERENCES projectlog.role (role_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE projectlog.app_user_role
    OWNER to postgres;