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
<#if teachers?has_content>
    <h1>Список сотрудников:</h1>
    <#list teachers as teacher>
        <h3>Имя: ${teacher.name}</h3> <br>
    </#list>
</#if>

<#if teacher??>
    ${teacher.name}
</#if>

</body>
</html>