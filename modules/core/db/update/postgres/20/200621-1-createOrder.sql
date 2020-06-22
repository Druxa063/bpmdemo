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
);