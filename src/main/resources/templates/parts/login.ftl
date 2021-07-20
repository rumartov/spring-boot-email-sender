<#macro login path isRegisterForm>
<form action="${path}" method="post">
    <#if isRegisterForm>
        <div class="form-group row">
                <label class="col-sm-2 col-form-label">Email :</label>
                <div class="col-sm-3">
                    <input type="text" name="email"
                    class="form-control ${(emailError??)?string('is-invalid', '')}"
                    placeholder="Email" />
                <#if emailError??>
                    <div class="invalid-feedback">
                        ${emailError}
                    </div>
                </#if>
                </div>
        </div>
    </#if>

    <div class="form-group row">
        <label class="col-sm-2 col-form-label">User Name :</label>
        <div class="col-sm-3">
            <input type="text" name="username"
            class="form-control ${(usernameError??)?string('is-invalid', '')}"
            placeholder="User name" />
            <#if usernameError??>
                <div class="invalid-feedback">
                    ${usernameError}
                </div>
            </#if>
        </div>
    </div>

    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Password:</label>
        <div class="col-sm-3">
            <input type="password" name="password"
            class="form-control ${(usernameError??)?string('is-invalid', '')}"
             placeholder="Password" />
             <#if passwordError??>
                 <div class="invalid-feedback">
                    ${passwordError}
                 </div>
             </#if>
        </div>
    </div>

    <input type="hidden" name="_csrf" value="${_csrf.token}"/>

    <#if !isRegisterForm>
        <a href="/registration">Register</a>
    </#if>

    <button class="btn btn-primary" type="submit">
        <#if isRegisterForm>
            Create
        <#else>
            Sign In
        </#if>
    </button>
</form>
</#macro>

<#macro logout>
<form action="/logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <button class="btn btn-primary" type="submit">Sign Out</button>
</form>
</#macro>
