
CREATE DATABASE MetaDataDB;

USE MetaDataDB;

CREATE TABLE customersCredentials
(
AccountNumber int NOT NULL,
Username varchar(255) NOT NULL,
Password varchar(255) NOT NULL,
PRIMARY KEY (AccountNumber)
);

USE MetaDataDB;

INSERT INTO customersCredentials 
VALUES(15629909,'MaryAGracia','A.11498');


INSERT INTO customersCredentials 
VALUES(15629901,'MichaelScott','J.11499');


INSERT INTO customersCredentials 
VALUES(15629929,'ShaneLAlcala','11477_S');

INSERT INTO customersCredentials 
VALUES(15629558,'ChrisIPoulin','15889_C');

INSERT INTO customersCredentials 
VALUES(15629577,'TrevorEBowen','Bowen_6618');

INSERT INTO customersCredentials 
VALUES(15629579,'ChristineRHuynh','goo6Cooboo');

INSERT INTO customersCredentials 
VALUES(15629172,'MathewMShover','Thuthunaez3');

INSERT INTO customersCredentials 
VALUES(15629222,'ElishaCCole','na1Kee3en');

INSERT INTO customersCredentials 
VALUES(15629122,'MichaelEDavidson','meus4P6o');

INSERT INTO customersCredentials 
VALUES(15629552,'CharlesSSerrato','na1Kee3en');
