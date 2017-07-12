<#import "/spring.ftl" as spring/>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Добавить сотрудника</title>
</head>
<body>

<form action='/admin/add/teacher' method="post" id="add_form">
    <label>Фамилия:<br>
    <@spring.bind "add_form.lastname"/>
        <input type="text"
               name="lastname"/><br>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
        <br>
    </label>

    <label>Имя:<br>
    <@spring.bind "add_form.firstname"/>
        <input type="text"
               name="firstname"/><br>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
        <br>
    </label>

    <#--<label>Добавьте фото:<br>-->
        <#--<form method="POST" action="/uploadFile" enctype="multipart/form-data">-->
            <#--<input type="file" name="file">-->
            <#--<input type="submit" value="Upload"> Нажми на меня!-->
        <#--</form>-->
        <#--<br>-->
    <#--</label>-->
    <#--</form>-->
    <input type="submit" value="Сохранить">
</form>

</body>
</html>