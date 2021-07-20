<#include "parts/security.ftl">
<#import "parts/common.ftl" as c>

<@c.page>

<div>
    <h1>${user.username}<h1>
</div>

<#if isAdmin>
    <div class="card-columns">
        <#list users as u>
            <div class="card my-3">
                ${u.username}
                ${u.email}
            </div>
        <#else>
            No emails
        </#list>
    </div>
<#else>
     <div>
        <h1>User things <h1>
     </div>
</#if>
</@c.page>