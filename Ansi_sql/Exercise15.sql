Event Session Time Conflict:

SELECT s1.session_id, s2.session_id, s1.event_id
FROM Sessions s1
JOIN Sessions s2 
ON s1.event_id = s2.event_id 
AND s1.session_id <> s2.session_id
AND s1.start_time < s2.end_time 
AND s2.start_time < s1.end_time;
