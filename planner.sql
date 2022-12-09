INSERT INTO ressource (email, first_name, last_name, password, role_id, task_id, team_id)
VALUES ("anassarbaoui20@gmail.com", "anass", "arbaoui", "1234", 1, 1, 1);

*******************************************************************************************************

INSERT INTO task (deadline, description, name, priority, statut, team_id)
VALUES ("2022-08-10T15:52:08.557944","second task", "task 1", "urgent", "to do", 1)

*******************************************************************************************************************************
select task.id as task_id, task.name, description, priority, deadline, statut, req.name as team_name 
from
task 
inner join 
team 
on task.team_id = team.id
inner join(
select team.name 
from team 
inner join ressource
on team.id = ressource.team_id
where ressource.id = 1) as req

*******************************************************************************************************************************************
/* liste des membres d'une équipe */

select first_name, last_name, team.name from 
ressource
inner join 
team 
where ressource.team_id = team.id and team.id = 1

*********************************************************************************************************************************************************