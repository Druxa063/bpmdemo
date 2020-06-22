alter table BPMDEMO_CONTRACT add column ENTITY_ID uuid ^
update BPMDEMO_CONTRACT set ENTITY_ID = newid() where ENTITY_ID is null ;
alter table BPMDEMO_CONTRACT alter column ENTITY_ID set not null ;
