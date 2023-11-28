SELECT name, languages.language,languages.percentage FROM countries
JOIN languages
ON languages.country_id=countries.id
WHERE languages.language="slovene";

SELECT countries.name,count(cities.name)FROM countries
LEFT JOIN cities
ON cities.country_id=countries.id
GROUP BY countries.name
ORDER BY count(cities.name) DESC;

SELECT name,population,country_id FROM cities
WHERE cities.population>500000
AND cities.country_id=(SELECT id FROM countries WHERE countries.name="mexico")
ORDER BY population DESC;

SELECT countries.name,languages.language,languages.percentage FROM countries
JOIN languages 
ON countries.id=languages.country_id
order by languages.percentage DESC;

SELECT name,surface_area,population FROM countries
WHERE surface_area<501
AND population >100000;

SELECT name,government_form,capital,life_expectancy FROM countries
WHERE government_form="Constitutional Monarchy"
AND capital>200
AND life_expectancy>75;

SELECT countries.name ,cities.name,cities.district,cities.population FROM countries
JOIN cities ON countries.id=cities.country_id
WHERE cities.district="Buenos Aires"
AND cities.population>500000;

SELECT countries.region,count(countries.name) FROM countries
GROUP BY countries.region
ORDER BY countries DESC;

