CREATE TABLE "mendixsystem$remote_primary_key" (
	"id" VARCHAR_IGNORECASE(36) NOT NULL,
	"entity_id" VARCHAR_IGNORECASE(255) NOT NULL,
	"attribute_name" VARCHAR_IGNORECASE(255) NOT NULL,
	"column_name" VARCHAR_IGNORECASE(255) NOT NULL,
	"type" INT NOT NULL,
	"length" INT NULL,
	PRIMARY KEY("id"));
ALTER TABLE "mendixsystem$entity" ADD "remote_primary_key" BOOLEAN NULL;
UPDATE "mendixsystem$version"
 SET "preanalysismigrationversionnumber" = '4.0.0';
ALTER TABLE "mendixsystem$version" ADD "mendixversion" VARCHAR_IGNORECASE(255) NULL;
UPDATE "mendixsystem$version"
 SET "preanalysismigrationversionnumber" = '4.1.0';
