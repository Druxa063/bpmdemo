create table BPMDEMO_INSTRUMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    --
    PRICE double precision,
    QUANTITY integer,
    YEAR integer,
    COUNTRY varchar(255),
    CATEGORY varchar(255),
    RATING double precision,
    IS_SHOPPING_CART boolean,
    --
    primary key (ID)
);