<#import "/spring.ftl" as spring/>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Добавить сотрудника</title>
</head>
<body>

<form action='/admin/edit/teacher/${teacher.id}' method="post" id="add_form">
    <label>Фамилия:<br>
    <@spring.bind "add_form.lastname"/>
        <#if teacher??>
            <#if teacher.lastname??>
                <input type="text" name="lastname" value="${teacher.lastname}"/>
            <#else>
                <input type="text" name="lastname"/>
            </#if>
        <#else>
            <input type="text" name="lastname"/>
        </#if>
        <br>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
        <br>
    </label>

    <label>Имя:<br>
    <@spring.bind "add_form.firstname"/>
        <#if teacher??>
            <#if teacher.firstname??>
                <input type="text" name="firstname" value="${teacher.firstname}"/>
            <#else>
                <input type="text" name="firstname"/>
            </#if>
        <#else>
            <input type="text" name="firstname"/>
        </#if>
        <br>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
        <br>
    </label>
    <input type="submit" value="Сохранить">
</form>

</body>
</html>