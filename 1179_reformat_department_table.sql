#1179. Reformat Department Table
#https://leetcode.com/problems/reformat-department-table/
#SQL problem

# Write your MySQL query statement below
#I need the NULL statement because I know some values can be null
SELECT Department.id, 
SUM(If(Department.month = 'Jan', revenue, null)) As Jan_Revenue,
SUM(If(Department.month = 'Feb', revenue, null)) As Feb_Revenue,
SUM(If(Department.month = 'Mar', revenue, null)) As Mar_Revenue,
SUM(If(Department.month = 'Apr', revenue, null)) As Apr_Revenue,
SUM(If(Department.month = 'May', revenue, null)) As May_Revenue,
SUM(If(Department.month = 'Jun', revenue, null)) As Jun_Revenue,
SUM(If(Department.month = 'Jul', revenue, null)) As Jul_Revenue,
SUM(If(Department.month = 'Aug', revenue, null)) As Aug_Revenue,
SUM(If(Department.month = 'Sep', revenue, null)) As Sep_Revenue,
SUM(If(Department.month = 'Oct', revenue, null)) As Oct_Revenue,
SUM(If(Department.month = 'Nov', revenue, null)) As Nov_Revenue,
SUM(If(Department.month = 'Dec', revenue, null)) As Dec_Revenue
FROM Department 
GROUP BY id
#AS id, revenue, month