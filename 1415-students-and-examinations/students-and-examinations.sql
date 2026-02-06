# Write your MySQL query statement below
select distinct st.student_id, st.student_name, sub.subject_name, count( ex.student_id) attended_exams
FROM Students st JOIN Subjects sub LEFT JOIN Examinations ex
ON st.student_id = ex.student_id
AND sub.subject_name = ex.subject_name
GROUP BY sub.subject_name, st.student_id
ORDER BY st.student_id, sub.subject_name;