-- Create and grant privileges to the remote user
CREATE USER 'remoteuser'@'%' IDENTIFIED BY 'baron69Tronch';
GRANT ALL PRIVILEGES ON proverbsdb.* TO 'remoteuser'@'%' WITH GRANT OPTION;

-- Ensure root user has access from any host
ALTER USER 'root'@'localhost' IDENTIFIED BY 'baron69Tronch';
CREATE USER 'root'@'%' IDENTIFIED BY 'baron69Tronch';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;

-- Apply the changes
FLUSH PRIVILEGES;

-- Create the database
CREATE DATABASE proverbsdb;

-- Switch to your new database
USE proverbsdb;

-- Create the table
CREATE TABLE proverbs (
    id bigint(10),
    text varchar(2000),
    origin varchar(200),
    source varchar(1000)
);

-- Insert records
INSERT INTO proverbs (id, text, origin, source) VALUES
    (1,"If you want to go fast, go alone. If you want to go far, go together.","African proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (2,"Fall seven times, stand up eight.","Japanese proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (3,"Shared joy is a double joy; shared sorrow is half a sorrow.","Swedish proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (4,"Words should be weighed, not counted.","Yiddish proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (5,"If you can’t live longer, live deeper","Italian proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (6,"Do good and throw it in the sea.","Arab proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (7,"Where love reigns, the impossible may be attained.","Indian proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (8,"It is better to light a candle than curse the darkness.","Chinese proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (9,"A man who uses force is afraid of reasoning.","Kenyan proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (10,"Still waters run deep.","Latin proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (11,"He who does not travel, does not know the value of men.","Moorish proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (12,"The night rinses what the day has soaped.","Swedish proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (13,"Measure a thousand times and cut once.","Turkish proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (14,"A spoon does not know the taste of soup, nor a learned fool the taste of wisdom.","Welsh proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (15,"The most beautiful fig may contain a worm.","Zulu proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (16,"Change yourself and fortune will change.","Portuguese proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (17,"In love, there is always one who kisses and one who offers the cheek.","French proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (18,"Evil enters like a needle and spreads like an oak tree.","Ethiopian proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (19,"Who begins too much accomplishes little.","German proverb","https://thecultureur.com/around-the-world-in-52-proverbs/"),
    (20,"Whoever gossips to you will gossip about you.","Spanish proverb","https://thecultureur.com/around-the-world-in-52-proverbs/");

