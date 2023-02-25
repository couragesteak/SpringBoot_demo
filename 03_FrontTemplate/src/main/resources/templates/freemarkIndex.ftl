<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<div style="width: 200px;font-weight: 600;">
    <div style="border: 1px solid red">
        名字：${name}
    </div>

    <div style="border: 1px solid red;margin-top: 10px;">
        性别：
        <#if sex=="0">
            男
        <#elseif sex=="1">
            女
        <#else>
            未知
        </#if>
    </div>


    <div style="border: 1px solid red;margin-top: 10px;">
        是否成年：
        <#if (age>=18)>
            成年
        <#else>
            未成年
        </#if>
    </div>

    <div style="border: 1px solid red;margin-top: 10px;">
        标签：
        <#list tagList as tag>
            ${tag}
        </#list>
    </div>

</div>

</body>
</html>