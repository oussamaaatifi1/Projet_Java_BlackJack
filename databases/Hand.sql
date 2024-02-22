use blackjack;

create table hand(
	id_main int primary key,
    valeurTotal int,
    nbCartes int
    
);

ALTER TABLE hand
DROP CONSTRAINT fk_hand_carte;