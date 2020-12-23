CREATE TABLE input_3
(
    id                uuid          NOT NULL,
    user_id           text         NOT NULL,
    typing_speed      bigint        NOT NULL,
    start_symbol      integer       NOT NULL,
    end_symbol        integer       NOT NULL,
    created_at        TIMESTAMP     NOT NULL DEFAULT now(),
    CONSTRAINT "pk_catalog.category" PRIMARY KEY (id)
)