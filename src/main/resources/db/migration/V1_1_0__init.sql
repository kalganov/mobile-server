CREATE SCHEMA IF NOT EXISTS mobile_server;
SET search_path TO mobile_server;

CREATE TABLE input
(
    id                uuid          NOT NULL,
    user_id           text         NOT NULL,
    typing_speed      bigint        NOT NULL,
    start_symbol      integer       NOT NULL,
    end_symbol        integer       NOT NULL,
    created_at        TIMESTAMP     NOT NULL DEFAULT now(),
    CONSTRAINT "pk_catalog.category" PRIMARY KEY (id)
)