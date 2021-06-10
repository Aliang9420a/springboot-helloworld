<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>
<body>
${name}
${data}

<#if sex=='0'>
    男
<#elseif sex=='1'>
    女
<#else>
    其他
</#if>

<#if age gt 18>
    成年了
<#else>
    未成年
</#if>



<#list list as user>
${user}
</#list>
</body>
</html>