<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Список сотрудников</title>
</head>
<body>
<h1>Список сотрудников:</h1>
<#if teachers?has_content>
    <#list teachers as teacher>
        <h3>Фамилия: ${teacher.lastname}</h3>
        <h3>Имя: ${teacher.firstname}</h3>
        <br>
    </#list>
<#else>
    <#if teacher??>
        <h3>Фамилия: ${teacher.lastname}</h3>
        <h3>Имя: ${teacher.firstname}</h3>
    <#else>
        <h1>Пока нет данных. <a href="/admin/add/teacher">Добавить нового сотрудника?</a></h1>
    </#if>
</#if>



</body>
</html>