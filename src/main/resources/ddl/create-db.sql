-- SCHEMA: public

-- DROP SCHEMA IF EXISTS public ;

CREATE SCHEMA IF NOT EXISTS public
    AUTHORIZATION pg_database_owner;

COMMENT ON SCHEMA public
    IS 'standard public schema';

GRANT USAGE ON SCHEMA public TO PUBLIC;

GRANT ALL ON SCHEMA public TO pg_database_owner;

CREATE TABLE configuration (
	record_id serial primary key,
	cloud_provider VARCHAR(10) not null,
	created_at timestamp
);

CREATE FUNCTION config_timestamp() RETURNS TRIGGER AS $config_timestamp$
	BEGIN
		NEW.created_at := current_timestamp;
		RETURN NEW;
	END;
$config_timestamp$ LANGUAGE plpgsql;

CREATE TRIGGER config_timestamp BEFORE INSERT OR UPDATE ON configuration
	FOR EACH ROW EXECUTE FUNCTION config_timestamp();

CREATE TABLE parameter (
	param_id serial primary key,
	record_id integer,
	param_type VARCHAR (20) NOT NULL,
	param_key VARCHAR (30) NOT NULL,
	param_value VARCHAR NOT NULL,

	CONSTRAINT fkey_configuration
		FOREIGN KEY (record_id)
			REFERENCES configuration(record_id)
);