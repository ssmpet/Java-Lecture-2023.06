SELECT district, COUNT(*) AS district_count FROM city
	WHERE countrycode='KOR'
	GROUP BY district
	ORDER BY district_count DESC
	LIMIT 5;

	