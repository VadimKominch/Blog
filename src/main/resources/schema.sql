create table if not exists `Users`
(
    `id`       int(11)     NOT NULL AUTO_INCREMENT,
    `Login`    varchar(20) NOT NULL,
    `Password` varchar(20) NOT NULL,
    `Username` varchar(20) NOT NULL,
    PRIMARY KEY (`id`)
);

create table if not exists `articles`
(
    `id`       int(11)     NOT NULL AUTO_INCREMENT,
    `article_name`    varchar(100) NOT NULL,
    `article_text` mediumtext NOT NULL,
    PRIMARY KEY (`id`)
);

/*INSERT into `articles` (`article_name`, `article_text`) VALUES ('My first experience in renting the flat','I`m very shy person. From very beginning of my life i was
afraid of asking somebody for information or help. It sounds strange,but this is me and my demons. And this time started. I`m 22 and my studying is almost over.
I need to find some place where i can live and can work. I start finding. But problem didn`t be in finding but in asking. I was afraid of communicating with people, even
don`t seeing them. But some events from my life show me that our life is very short and we must be brave,no matter if its worth being afraid.');
*/

INSERT into `articles` (`article_name`, `article_text`) VALUES ('hello','world');
INSERT into `articles` (`article_name`, `article_text`) VALUES ('hello','Vadim');