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
        <#if teacher.imagePath??>
            <img src="${teacher.imagePath}" style="height: 200px"/>
        </#if>
        <h3>Фамилия: ${teacher.lastname}</h3>
        <h3>Имя: ${teacher.firstname}</h3>
        <h3>Институт:
            <#if teacher.institutes?has_content>
                <#list teacher.institutes as institute>
                    ${institute.name}
                </#list>
            <#else>
                не указан
            </#if>
        </h3>
        <h3>Должность:
            <#if teacher.workplace??>
            ${teacher.workplace}
            <#else>
                не указана
            </#if>
        </h3>
        <a href="/admin/edit/teacher/${teacher.id}">Редактировать</a>
        <a href="/admin/remove/teacher/${teacher.id}">Удалить</a>
    </div>
</#list>
<#else>
    <#if teacher??>
    <div>
        <#if teacher.imagePath??>
            <img src="${teacher.imagePath}" style="height: 200px"/>
        </#if>
        <h3>Фамилия: ${teacher.lastname}</h3>
        <h3>Имя: ${teacher.firstname}</h3>
        <h3>Институт:
            <#if teacher.institutes?has_content>
                <#list teacher.institutes as institute>
                ${institute.name}
                </#list>
            <#else>
                не указан
            </#if>
        </h3>
        <h3>Должность:
            <#if teacher.workplace??>
                ${teacher.workplace}
            <#else>
                не указана
            </#if>
        </h3>
        <a href="/admin/edit/teacher/${teacher.id}">Редактировать</a>
        <a href="/admin/remove/teacher/${teacher.id}">Удалить</a>
    <div>
    <#else>
        <h1>Пока нет данных. <a href="/admin/add/teacher">Добавить нового сотрудника?</a></h1>
    </#if>
</#if>

</body>
</html>