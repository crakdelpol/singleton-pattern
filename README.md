# SingletonPattern
Example of singleton pattern

La mia risposta su Quora [Che cos'è un singleton in informatica?](https://qr.ae/TWpfPk)

Vari utilizzi del pattern singleton

 * scrivere log e gestione delle eccezioni: invece di instanziale piu' log viene instanziato 1 logger solo e riutilizzato con diverse diciture.
 * File di configurazione: non serve tutte le volte andare ad instanziare una risorsa, basta instanziarne una e poi andare  a leggere sempre la stessa.

 * cache e gestione delle connessioni, è importante utilizzare una cache e non andare a instanziarne diverse. Per la gestione delle connessioni si puo' fare riferimento ad  Hbernate che utilizza un singleton pattern per la sua connection factories.


Il java singleton pattern è stato definito per ottimizzare le applicazioni Java. Assicura che gli oggetti condivisi tra i threads siano gestiti correttamente e non ci sia incoerenza di dati.
Ci sono molti modi per implementare il singleton pattern  in questo progetto ne ho visti solo alcuni.

