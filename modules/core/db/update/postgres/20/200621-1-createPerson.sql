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
    ROLES varchar(50),
    PASSWORD varchar(255),
    --
    primary key (ID)
);