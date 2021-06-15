USE MetaDataDB;

CREATE TABLE customersInformation
(
AccountNumber varchar(255)NOT NULL,
FullName varchar(255) NOT NULL,
Balance decimal(9,2),
PaymentDueDate char(10),
CardType char(6),
CardNumber char(16),
CardCVV char(4),
ExpirationDate char(5),
ZipCode char(20),
PRIMARY KEY (AccountNumber),
FOREIGN KEY (AccountNumber) REFERENCES CustomersCredentials(AccountNumber)
);

USE MetaDataDB;

INSERT INTO customersInformation 
VALUES('15629909','Mary A. Gracia',109.60,'08/21/2021','Debit','4539778019779431','708','10/27','41740');

INSERT INTO customersInformation 
VALUES('15629901','Michael Scott',57.80,'08/11/2021','Debit','4929650870055474','576','09/27','45428');

INSERT INTO customersInformation 
VALUES('15629929','Shane L. Alcala',78.80,'08/03/2021','Debit','4485160187243710','666','12/22','65756');

INSERT INTO customersInformation 
VALUES('15629558','Chris I. Poulin',53.60,'08/13/2021','Debit','4485733261060869','278','9/23','65684');

INSERT INTO customersInformation 
VALUES('15629577','Trevor E. Bowen',80.60,'08/15/2021','Debit','4916645794939527','330','10/24','93320');

INSERT INTO customersInformation 
VALUES('15629579','Christine R. Huynh',39.54,'08/18/2021','Credit','5588500793525013','529','10/28','93320');

INSERT INTO customersInformation
VALUES('15629172','Mathew M. Shover',101.54,'08/30/2021','Credit','5465270622650667','176','07/23','96560');

INSERT INTO customersInformation 
VALUES('15629222','Elisha C. Cole',49.54,'08/31/2021','Credit','5370398858183048','312','07/27','39998');

INSERT INTO customersInformation 
VALUES('15629122','Michael E. Davidson',77.84,'08/14/2021','Credit','5350962957756725','355','02/22','98889');

INSERT INTO customersInformation 
VALUES('15629552','Charles S. Serrato',150.84,'08/23/2021','Credit','5264649612880504','598','08/22','98889');

