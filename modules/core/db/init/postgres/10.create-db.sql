-- begin BPMDEMO_INSTRUMENT
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
    ORDER_ID uuid,
    --
    primary key (ID)
)^
-- end BPMDEMO_INSTRUMENT
-- begin BPMDEMO_PERSON
create table BPMDEMO_PERSON (
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
    LAST_NAME varchar(255),
    EMAIL varchar(255),
    ROLE varchar(50),
    PASSWORD varchar(255),
    --
    primary key (ID)
)^
-- end BPMDEMO_PERSON
-- begin BPMDEMO_ORDER
create table BPMDEMO_ORDER (
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
    PERSON_ID uuid,
    DATE timestamp,
    STATUS varchar(255),
    DELIVERY varchar(255),
    --
    primary key (ID)
)^
-- end BPMDEMO_ORDER
