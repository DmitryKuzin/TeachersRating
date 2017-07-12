<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Список сотрудников</title>
</head>
<body>
<h1>Список сотрудников:</h1>
<#if teachers?has_content>
<#list teachers as teacher>
    <div>
        <h3>Фамилия: ${teacher.lastname}</h3>
        <h3>Имя: ${teacher.firstname}</h3>
        <a href="/admin/edit/teacher/${teacher.id}">Редактировать</a>
        <a href="/admin/remove/teacher/${teacher.id}">Удалить</a>
    </div>
</#list>
<#else>
    <#if teacher??>
    <div>
        <h3>Фамилия: ${teacher.lastname}</h3>
        <h3>Имя: ${teacher.firstname}</h3>
        <a href="/admin/edit/teacher/${teacher.id}">Редактировать</a>
        <a href="/admin/remove/teacher/${teacher.id}">Удалить</a>
    <div>
    <#else>
        <h1>Пока нет данных. <a href="/admin/add/teacher">Добавить нового сотрудника?</a></h1>
    </#if>
</#if>

</body>
</html>