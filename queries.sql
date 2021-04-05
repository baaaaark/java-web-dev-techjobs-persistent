## Part 1: Test it with SQL

CREATE TABLE techjobs.job (
    id INT
    name VARCHAR(255)
    employer_id INT
);

## Part 2: Test it with SQL

SELECT techjobs.name
FROM techjobs.employer
WHERE (location = "St. Louis City")

## Part 3: Test it with SQL

DROP TABLE techjobs.jobs;

## Part 4: Test it with SQL

SELECT name, description
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.skills_id IS NOT NULL