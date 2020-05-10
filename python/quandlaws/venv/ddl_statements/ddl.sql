CREATE TABLE "caseSchillerIndex" ("state" TEXT, "date" TEXT, "value" TEXT);

CREATE TABLE zipgeo (
	zipcode text primary key,
	city text not null,
	state text not null,
	latitude text not null,
	longitude text not null
);

CREATE TABLE MLPSF (
	zipcode text not null,
	date text not null,	
	value not null
)

create table visualization (
	zipcode INTEGER not null,
	date text not null,
	value decimal not null,
	city text not null,
	state text not null,
	latitude float not null,
	longitude float not null
)

insert into visualization 
select cast (m.zipcode as INTEGER ) as zipcode,m.date,cast(m.value as DECIMAL ) as value,
z.city as city,
z.state as state,
cast(z.latitude as FLOAT ) as latitude,
cast(z.longitude as float) as longitude
from MLPSF m join zipgeo z
on m.zipcode=z.zipcode
where m.date='2019-12-31'