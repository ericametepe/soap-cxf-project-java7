
-- Database: "rfi-db"

-- DROP DATABASE "rfi-db";

CREATE DATABASE "rfi-db"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'French_France.1252'
       LC_CTYPE = 'French_France.1252'
       CONNECTION LIMIT = -1;
       
       
 CREATE SEQUENCE IND_SEQ 
 MINVALUE 1 
 START  WITH 1
 INCREMENT  BY  1;
       
 CREATE SEQUENCE DONNE_RFI_SEQ
  MINVALUE 1 
  START  WITH 1
  INCREMENT  BY  1;
       

-- DROP SEQUENCE histo_ind_seq;

CREATE SEQUENCE histo_ind_seq
   MINVALUE 1 
   START  WITH 1
   INCREMENT  BY  1;
       
       
-- Table: donneesrfi

-- DROP TABLE donneesrfi;

CREATE TABLE donneesrfi
(
  id integer NOT NULL,
  code character varying(255) NOT NULL,
  codeliste character varying(6) NOT NULL,
  libelle character varying(255) NOT NULL,
  libellelong character varying(255),
  CONSTRAINT donneesrfi_pkey PRIMARY KEY (id)
)TABLESPACE pg_default;


INSERT INTO donneesrfi(
            id, code, codeliste, libelle, libellelong)
    VALUES (1, '1', '000CIV', 'M', 'Monsieur');
    
INSERT INTO donneesrfi(
            id, code, codeliste, libelle, libellelong)
    VALUES (2, '2', '000CIV', 'F', 'Madame');
    
    
    INSERT INTO donneesrfi(
            id, code, codeliste, libelle, libellelong)
    VALUES (3, 'S', 'SITPRO', 'Salarie', null);
    
       INSERT INTO donneesrfi(
            id, code, codeliste, libelle, libellelong)
    VALUES (4, 'P', 'SITPRO', 'Chomage partiel', null);
    
     INSERT INTO donneesrfi(
            id, code, codeliste, libelle, libellelong)
    VALUES (5, 'D', 'SITPRO', 'Demandeur d''emploi',null );
 
 
-- Table: historique

-- DROP TABLE historique;


CREATE TABLE individu
(
  id bigint NOT NULL,
  adresseligne1 character varying(255),
  adresseligne2 character varying(255),
  adresseligne3 character varying(255),
  codepostal character varying(255),
  pays character varying(255),
  ville character varying(255),
  civilite character varying(1) NOT NULL,
  datedenaissance timestamp without time zone NOT NULL,
  email character varying(255),
  idmetier character varying(8) NOT NULL,
  nir character varying(13) NOT NULL,
  nomdenaissance character varying(50) NOT NULL,
  prenom character varying(255) NOT NULL,
  rattachementcpf boolean NOT NULL,
  situationprofessionnelle character varying(1) NOT NULL,
  telephone character varying(255),
  CONSTRAINT individu_pkey PRIMARY KEY (id),
  CONSTRAINT individu_idmetier_key UNIQUE (idmetier),
  CONSTRAINT individu_nir_key UNIQUE (nir)
) TABLESPACE pg_default;


-- Table: historique

-- DROP TABLE historique;

-- Table: historique

-- DROP TABLE historique;

CREATE TABLE historique
(
  id bigint NOT NULL,
  adresseligne1 character varying(255),
  adresseligne2 character varying(255),
  adresseligne3 character varying(255),
  codepostal character varying(255),
  pays character varying(255),
  ville character varying(255),
  civilite character varying(255) NOT NULL,
  datedenaissance timestamp without time zone NOT NULL,
  dateevenement timestamp without time zone,
  email character varying(255),
  idmetier character varying(8),
  nir character varying(13) NOT NULL,
  nomdenaissance character varying(255) NOT NULL,
  prenom character varying(255) NOT NULL,
  rattachementcpf boolean NOT NULL,
  situationprofessionnelle character varying(255) NOT NULL,
  telephone character varying(255),
  typeevt character varying(255),
  applicationorigine character varying(255) NOT NULL,
  codesite character varying(255) NOT NULL,
  login character varying(255) NOT NULL,
  CONSTRAINT historique_pkey PRIMARY KEY (id),
 --CONSTRAINT HISTORIQUE_IDMETIER_KEY UNIQUE (IDMETIER),
 -- CONSTRAINT HISTORIQUE_NIR_KEY UNIQUE (NIR)
) TABLESPACE pg_default;

-- Index: nir_idx

-- DROP INDEX nir_idx;

CREATE INDEX nir_idx
  ON individu
  USING btree
  (nir COLLATE pg_catalog."default") TABLESPACE pg_default ;
  
  CREATE INDEX nir_idx
  ON individu
  USING btree
  (nir COLLATE pg_catalog."default") TABLESPACE pg_default ;
  
  CREATE INDEX idmetier_idx ON individu (idmetier) TABLESPACE pg_default;
  
  CREATE INDEX codeListe_idx ON donneesrfi (codeliste) TABLESPACE pg_default;
    
    
  
  
  
  
  
  

