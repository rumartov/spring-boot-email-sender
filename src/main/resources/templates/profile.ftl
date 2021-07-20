<#include "parts/security.ftl">
<#import "parts/common.ftl" as c>

<@c.page>

<div>
    <h1>${user.username}<h1>
</div>

<#if isAdmin>

        <table class="table">
            <thead>
                <tr>
                  <th scope="col">Id</th>
                  <th scope="col">Username</th>
                  <th scope="col">Email</th>
                </tr>
            </thead>
              <tbody>
                   <#list users as u>
                        <tr>
                            <td>${u.id}</td>
                            <td>${u.username}</td>
                            <td>${u.email}</td>
                        </tr>
                        <#else>
                            No emails
                   </#list>

               </tbody>
        </table>

<#else>
     <div>
        <h1>User things <h1>
     </div>
</#if>
</@c.page>