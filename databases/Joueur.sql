use blackjack;

create table Joueur(
	id_joueur int primary key,
    username_joueur int,
    solde_joueur int,
    mise int,
    id_main int,
    foreign key(id_main) references Hand(id_main)
);

ALTER TABLE joueur
CHANGE COLUMN Username username INT;
ALTER TABLE joueur
CHANGE COLUMN Solde solde INT;
ALTER TABLE joueur
add COLUMN mise INT;
