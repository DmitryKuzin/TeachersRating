<#import "/spring.ftl" as spring/>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Добавить сотрудника</title>
</head>
<body>

<form action='/admin/add/teacher' method="post" id="add_form">
    <label>ФИО:<br>
    <@spring.bind "add_form.name"/>
        <input type="text"
               name="name"/><br>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
        <br>
    </label>
    <input type="submit" value="Сохранить">
</form>

</body>
</html>