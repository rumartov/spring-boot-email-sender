<#import "parts/common.ftl" as c>

<@c.page>

<div>
    <h1>${user.username}<h1>
</div>

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

</@c.page>