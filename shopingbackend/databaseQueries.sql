CREATE TABLE category (

	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY(id)


);


INSERT INTO category (name, description,image_url,is_active) VALUES ('Men', 'mens Wear','cat_1.png',true);
INSERT INTO category (name, description,image_url,is_active) VALUES ('Women', 'womens Wear','cat_2.png',true);
INSERT INTO category (name, description,image_url,is_active) VALUES ('Kids', 'kids wear','image_3.png',true);

CREATE TABLE user_details (

	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(50),
	email VARCHAR(100),
	contact_number VARCHAR(15),
	CONSTRAINT pk_user_id PRIMARY KEY(id),
);


INSERT INTO user_details
(first_name, last_name,role, enabled, password, email, contact_number)
VALUES ('Hemadri','yadav','ADMIN',true,'admin','hemadri.m513@gmail.com','8686167648');

INSERT INTO user_details
(first_name, last_name,role, enabled, password, email, contact_number)
VALUES ('bhagya','lakshmi','SUPPLIER',true,'12345','lakshmi.bhagya@gmail.com','9700990205');

INSERT INTO user_details
(first_name, last_name,role, enabled, password, email, contact_number)
VALUES ('yamini','p','SUPPLIER',true,'12345','yaminyams@gmail.com','123456789');






CREATE TABLE product (

	id IDENTITY,
	code VARCHAR(50),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category(id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_details(id),

);



INSERT INTO product(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('A11','T Shirt','adidas','banded mens shirt',800,5,true,3,2);
INSERT INTO product(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('A12','T Shirt','nike','banded mens shirt',750,2,true,3,3);
INSERT INTO product(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('A13','T Shirt','polo','banded mens shirt',900,5,true,3,2);
INSERT INTO product(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('B11','Saree','cavalli','womens sarees',6000,3,true,1,2);
INSERT INTO product(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('B12','Shirt','john','banded womens shirt',1200,5,true,1,3);

