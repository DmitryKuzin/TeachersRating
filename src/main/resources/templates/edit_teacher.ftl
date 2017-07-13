<#import "/spring.ftl" as spring/>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Добавить сотрудника</title>
</head>
<body>

<form action='/admin/edit/teacher/${teacher.id}' method="post" enctype="multipart/form-data">
    <label>Фамилия:<br>
    <@spring.bind "form.lastname"/>
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
    <@spring.bind "form.firstname"/>
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

    <label>Институт:<br>
    <@spring.bind "form.institute"/>
        <select name="institute" multiple>
            <option disabled selected value="">Выберите институт</option>
        <#list institutes as institute>
            <option value="${institute.id}">${institute.name}</option>
        </#list>
        </select>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
        <br>
    </label>

    <label>Должность:<br>
    <@spring.bind "form.workplace"/>
    <#if teacher.workplace??>
        <input type="text"
               name="workplace" value="${teacher.workplace}"/><br>
    <#else>
        <input type="text"
               name="workplace""/><br>
    </#if>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
        <br>
    </label>

    <label>
    <@spring.bind "form.file"/>
    <#if teacher.imagePath??>
        <img src="${teacher.imagePath}" style="height: 200px"/>
    <#else>
        <img src="/img/defaultImage.jpg" style="height: 200px"/>
    </#if>
        <br>
        <input type="file" name="file"/><br/>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
    </label>
    <input type="submit" value="Сохранить">
</form>

</body>
</html>