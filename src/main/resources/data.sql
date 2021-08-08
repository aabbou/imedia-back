DROP TABLE IF EXISTS T_PRODUCT;

CREATE TABLE T_PRODUCT (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  PRODUCT_NAME VARCHAR(100) NOT NULL,
  PRODUCT_DESCRIPTION VARCHAR(1000) DEFAULT NULL,
  PRODUCT_PRICE DECIMAL (7, 2) NOT NULL,
  PRODUCT_CURRENCY VARCHAR(3) DEFAULT 'EUR'
);

/*INSERT INTO T_PRODUCT (ID,PRODUCT_NAME, PRODUCT_DESCRIPTION, PRODUCT_PRICE,PRODUCT_CURRENCY) VALUES
  (1,'Product 1', 'Description 1', 345.99,'EUR'),
  (2,'Product 2', 'Description 2', 345.99,'EUR'),
  (3,'Product 3', 'Description 3', 345.99,'EUR'),
  (4,'Product 4', 'Description 4', 345.99,'EUR'),
  (5,'Product 5', 'Description 5', 345.99,'EUR');*/

DROP TABLE IF EXISTS T_CATEGORY;

CREATE TABLE T_CATEGORY (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  CATEGORY_LABEL VARCHAR(100) NOT NULL,
  CATEGORY_DESCRIPTION VARCHAR(1000) DEFAULT NULL
);

/*INSERT INTO T_CATEGORY (ID,CATEGORY_LABEL) VALUES
  (1,'Category 1'),
  (2,'Category 2'),
  (3,'Category 3'),
  (4,'Category 4'),
  (5,'Category 5'),
  (6,'Category 6'),
  (7,'Category 7'),
  (8,'Category 8'),
  (9,'Category 9'),
  (10,'Category 10');*/
  
DROP TABLE IF EXISTS T_PRODUCT_CATEGORY;

CREATE TABLE T_PRODUCT_CATEGORY (
  PRODUCT_ID INT NOT NULL,
  CATEGORY_ID INT NOT NULL,
  PRIMARY KEY (PRODUCT_ID,CATEGORY_ID)
);

/*INSERT INTO T_PRODUCT_CATEGORY (PRODUCT_ID,CATEGORY_ID) VALUES
  (1,1),
  (1,3),
  (1,4),
  (2,1),
  (2,2),
  (2,10),
  (3,5),
  (4,7),
  (4,8),
  (4,9),
  (5,9),
  (5,3),
  (5,4),
  (5,5),
  (5,10);*/
  