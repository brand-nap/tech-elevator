DROP TABLE IF EXISTS members_groups;
DROP TABLE IF EXISTS members_events;
DROP TABLE IF EXISTS members;
DROP TABLE IF EXISTS events;
DROP TABLE IF EXISTS interest_groups;
DROP SEQUENCE IF EXISTS members_serial;
DROP SEQUENCE IF EXISTS groups_serial;
DROP SEQUENCE IF EXISTS events_serial;
-- MEMBERS TABLE
CREATE SEQUENCE members_serial;
CREATE TABLE members(
	member_id int NOT NULL DEFAULT nextval('members_serial'),
	last_name varchar(20) NOT NULL,
	first_name varchar(20) NOT NULL,
	email varchar(30) NOT NULL,
	phone bigint NULL,
	birthday date NOT NULL,
	is_reminded boolean NOT NULL,
	CONSTRAINT pk_members_member_id PRIMARY KEY (member_id),
	CONSTRAINT chk_valid_email CHECK (email LIKE '%@%.%')
);

--Member Number
--Last Name
--First Name
--Email Address
--Phone Number (some members may not provide one)
--Date of Birth
--Flag indicating if they want reminder emails
----------------------------------------------------------------------------

-- INTEREST_GROUP TABLE
CREATE SEQUENCE groups_serial;
CREATE TABLE interest_groups(
	group_id int NOT NULL DEFAULT nextval('groups_serial'),
	group_name varchar(20) NOT NULL,
	CONSTRAINT PK_interest_groups_group_id PRIMARY KEY (group_id),
	CONSTRAINT UQ_group_name UNIQUE(group_name)
);

--Group Number
--Name (no two groups can have the same name)
--Has zero-to-many Members
----------------------------------------------------------------------------

-- EVENTS TABLE
CREATE SEQUENCE events_serial;
CREATE TABLE events(
	event_id int NOT NULL DEFAULT nextval('events_serial'),
	event_name varchar(20) NOT NULL,
	start_date_time date NOT NULL,
	duration int NOT NULL,
	group_id int NOT NULL,
	CONSTRAINT PK_events_event_id PRIMARY KEY (event_id),
	CONSTRAINT FK_interest_group_group_id FOREIGN KEY (group_id) REFERENCES interest_groups(group_id),
	CONSTRAINT chk_half_hour_duration CHECK (duration >= 30)
);

--Event Number
--Name
--Description
--Start Date and Time
--Duration (minimum of 30 minutes)
--Group running this event
--Has zero-to-many Members
----------------------------------------------------------------------------

-- MEMBERS_EVENTS TABLE
CREATE TABLE members_events(
	member_id int NOT NULL,
	event_id int NOT NULL,
	CONSTRAINT PK_members_events PRIMARY KEY (event_id, member_id),
	CONSTRAINT FK_members_events_member FOREIGN KEY(member_id) REFERENCES members(member_id),
    CONSTRAINT FK_members_events_event FOREIGN KEY(event_id) REFERENCES events(event_id)
);

----------------------------------------------------------------------------

-- MEMBERS_INTEREST_GROUPS TABLE
CREATE TABLE members_groups(
	member_id int NOT NULL,
	group_id int NOT NULL,
	CONSTRAINT PK_members_groups PRIMARY KEY (group_id, member_id),
	CONSTRAINT FK_members_groups_member FOREIGN KEY(member_id) REFERENCES members(member_id),
    CONSTRAINT FK_members_groups_group FOREIGN KEY(group_id) REFERENCES interest_groups(group_id)
);

INSERT INTO members(last_name, first_name, email, phone, birthday, is_reminded)
VALUES ('Perez', 'Brandon', '8randonperes@gmail.com', 8088599122, '02/15/2003', false);

INSERT INTO interest_groups(group_name)
VALUES ('Tech Elevator');

INSERT INTO events(event_name, start_date_time, duration, group_id)
VALUES ('Java', '10/18/2022 11:26', 38, 1);

INSERT INTO members_groups(member_id, group_id)
VALUES (1, 1);

INSERT INTO members_events(member_id, event_id)
VALUES (1, 1);



