use blackjack;

create table Croupier (
	id_croupier int primary key,
    valeurTotalLimit int,
    id_main int,
    foreign key(id_main) references Hand(id_main)
);