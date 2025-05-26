Resource Availability Check:

SELECT e.title 
FROM Events e
WHERE e.event_id NOT IN (
  SELECT DISTINCT event_id FROM Resources
);
