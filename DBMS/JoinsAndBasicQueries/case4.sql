SELECT date,
       AVG(death_count) AS average_daily_deaths
FROM covid_deaths
GROUP BY date
ORDER BY date;