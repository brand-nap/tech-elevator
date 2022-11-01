DROP TABLE IF EXISTS card, forty_fives CASCADE;

CREATE TABLE card (
	card_id serial,
	card_value int,
	suit varchar(9) NOT NULL,
	color varchar(6) NOT NULL,
	is_royal boolean,
	face varchar(4) UNIQUE NOT NULL,
	CONSTRAINT PK_card PRIMARY KEY (card_id)
);

CREATE TABLE forty_fives (
	forty_fives_id serial,
	card_value int,
	suit varchar(9) NOT NULL,
	color varchar(6) NOT NULL,
	is_royal boolean,
	face varchar(4) UNIQUE NOT NULL,
	CONSTRAINT PK_forty_fives PRIMARY KEY (forty_fives_id)
);

-- Fill clubs | regular deck
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (1, 'Clubs', 'black', false, 'A♣');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (2, 'Clubs', 'black', false, '2♣');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (3, 'Clubs', 'black', false, '3♣');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (4, 'Clubs', 'black', false, '4♣');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (5, 'Clubs', 'black', false, '5♣');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (6, 'Clubs', 'black', false, '6♣');
INSERT INTO card (card_value, suit, color, is_royal, face)  VALUES (7, 'Clubs', 'black', false, '7♣');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (8, 'Clubs', 'black', false, '8♣');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (9, 'Clubs', 'black', false, '9♣');
INSERT INTO card (card_value, suit, color, is_royal, face)  VALUES (10, 'Clubs', 'black', false, '10♣');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (11, 'Clubs', 'black', true, 'J♣');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (12, 'Clubs', 'black', true, 'Q♣');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (13, 'Clubs', 'black', true, 'K♣');

-- Fill diamonds | regular deck
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (1, 'Diamonds', 'red', false, 'A♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (2, 'Diamonds', 'red', false, '2♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (3, 'Diamonds', 'red', false, '3♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (4, 'Diamonds', 'red', false, '4♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (5, 'Diamonds', 'red', false, '5♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (6, 'Diamonds', 'red', false, '6♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (7, 'Diamonds', 'red', false, '7♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (8, 'Diamonds', 'red', false, '8♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (9, 'Diamonds', 'red', false, '9♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (10, 'Diamonds', 'red', false, '10♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (11, 'Diamonds', 'red', true, 'J♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (12, 'Diamonds', 'red', true, 'Q♦');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (13, 'Diamonds', 'red', true, 'K♦');


-- Fill spades | regular deck
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (1, 'Spades', 'black', false, 'A♠');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (2, 'Spades', 'black', false, '2♠');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (3, 'Spades', 'black', false, '3♠');
INSERT INTO card (card_value, suit, color, is_royal, face)  VALUES (4, 'Spades', 'black', false, '4♠');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (5, 'Spades', 'black', false, '5♠');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (6, 'Spades', 'black', false, '6♠');
INSERT INTO card (card_value, suit, color, is_royal, face)  VALUES (7, 'Spades', 'black', false, '7♠');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (8, 'Spades', 'black', false, '8♠');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (9, 'Spades', 'black', false, '9♠');
INSERT INTO card (card_value, suit, color, is_royal, face)  VALUES (10, 'Spades', 'black', false, '10♠');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (11, 'Spades', 'black', true, 'J♠');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (12, 'Spades', 'black', true, 'Q♠');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (13, 'Spades', 'black', true, 'K♠');


-- Fill hearts | regular deck
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (1, 'Hearts', 'red', false, 'A♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (2, 'Hearts', 'red', false, '2♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (3, 'Hearts', 'red', false, '3♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (4, 'Hearts', 'red', false, '4♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (5, 'Hearts', 'red', false, '5♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (6, 'Hearts', 'red', false, '6♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (7, 'Hearts', 'red', false, '7♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (8, 'Hearts', 'red', false, '8♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (9, 'Hearts', 'red', false, '9♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (10, 'Hearts', 'red', false, '10♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (11, 'Hearts', 'red', true, 'J♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (12, 'Hearts', 'red', true, 'Q♥');
INSERT INTO card (card_value, suit, color, is_royal, face) VALUES (13, 'Hearts', 'red', true, 'K♥');



