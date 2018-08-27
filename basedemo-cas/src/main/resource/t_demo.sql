CREATE TABLE t_demo
(
  id serial,
  name text,
  intarray integer[],
  txtarray text[],
  createdate date,
  createtime timestamp without time zone,
  CONSTRAINT t_demo_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
