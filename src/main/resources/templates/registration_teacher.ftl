<#import "/spring.ftl" as spring/>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Добавить сотрудника</title>
</head>
<body>

<form action='/admin/add/teacher' method="post" id="form"  enctype="multipart/form-data">
    <label>Фамилия:<br>
    <@spring.bind "form.lastname"/>
        <input type="text"
               name="lastname"/><br>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
        <br>
    </label>

    <label>Имя:<br>
    <@spring.bind "form.firstname"/>
        <input type="text"
               name="firstname"/><br>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
        <br>
    </label>

    <label>
        <img id="image_upload_preview" src="/img/defaultImage.jpg" style="height: 200px"/>
        <br>
    <@spring.bind "form.file"/>
        <input type="file" name="file"/><br/>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
    </label>

    <input type="submit" value="Сохранить">
</form>

</body>
</html>