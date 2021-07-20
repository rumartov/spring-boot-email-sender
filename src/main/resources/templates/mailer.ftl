<#import "parts/common.ftl" as c>

<@c.page>
<form action="mailer" method="post">
    <div class="mb-3">
      <label class="form-label">Subject</label>
      <textarea name="subject" class="form-control" rows="1"></textarea>
    </div>
    <div class="mb-3">
      <label class="form-label">Message</label>
      <textarea name="message" class="form-control" rows="20"></textarea>
    </div>

    <button class="btn btn-primary" type="submit">
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
        Send all
    </button>
</form">

</@c.page>