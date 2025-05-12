-- SQL

DELETE p FROM Person p JOIN Person e ON p.email=e.email AND p.id>e.id;

-- PSQL

DELETE FROM Person p USING Person e WHERE p.email=e.email AND p.id>e.id;