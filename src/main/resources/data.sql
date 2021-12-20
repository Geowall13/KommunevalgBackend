/* Municipality */
INSERT INTO municipality(name, blank_votes, eligible_voters, total_votes) VALUES("Samsø Kommune", 0, 3187, 0);

/* Parties */
INSERT INTO party(party_name, initials, votes, municipality) VALUES("Socialdemokratiet", "A", 0, 1);
INSERT INTO party(party_name, initials, votes, municipality) VALUES("Det konservative Folkeparti", "C", 0, 1);
INSERT INTO party(party_name, initials, votes, municipality) VALUES("Socialistisk Folkeparti", "F", 0, 1);
INSERT INTO party(party_name, initials, votes, municipality) VALUES("Dansk Folkeparti", "O", 0, 1);
INSERT INTO party(party_name, initials, votes, municipality) VALUES("Venstre, Danmarks Liberale Parti", "V", 0, 1);
INSERT INTO party(party_name, initials, votes, municipality) VALUES("Enhedslisten + De Rød Grønne", "Ø", 0, 1);


/* Kandidater for Socialdemokraterne */
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Marcel", null, "Meijer", 0, 1);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Michael", null, "Kristensen", 0, 1);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Helle", null, "Hansen", 0, 1);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Karina", null, "Knobelauch", 0, 1);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Stefan", "Hafstein", "Wolffbrandt", 0, 1);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Robert", "V.", "Rasmussen", 0, 1);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Pia", null, "Ramsing", 0, 1);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Anders", "Baun", "Sørensen", 0, 1);

/* Kandidater for Konservative */
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Per", "Urban", "Olsen", 0, 2);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Peter", null, "Askjær", 0, 2);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Martin", null, "Sørensen", 0, 2);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Louise", null, "Bramstorp", 0, 2);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Sigfred", null, "Jensen", 0, 2);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Jørn", "C.", "Nissen", 0, 2);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Morten", "Ø.", "Kristensen", 0, 2);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Susanne", null, "Andersen", 0, 2);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Iulian", "V.", "Paiu", 0, 2);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Per", null, "Hingel", 0, 2);

/* Kandidater for Socialistisk Folkeparti */
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Ulla", null, "Holm", 0, 3);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Kjeld", null, "Bønkel", 0, 3);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Anne", "Grethe", "Olsen", 0, 3);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Lone", null, "Krag", 0, 3);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Børge", "S.", "Buur", 0, 3);

/* Kandidater for Dansk Folkeparti */
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Per", null, "Mortensen", 0, 4);

/* Kandidater for Venstre */
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Søren", null, "Wiese", 0, 5);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Anita", "Elgaard Højholt", "Olesen", 0, 5);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Carsten", null, "Bruun", 0, 5);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Mogens", null, "Exner", 0, 5);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Anja", null, "Guldborg", 0, 5);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Klaus", null, "Holdorf", 0, 5);

/* Kandidater for Enhedslisten */
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Katrine", "Høegh Mc", "Quaid", 0, 6);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Jette", "M.", "Søgaard", 0, 6);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Søren", null, "Caspersen", 0, 6);
Insert INTO candidate(first_name, middle_name, sur_name, votes, party) VALUES("Pia", null, "Birkmand", 0, 6);
