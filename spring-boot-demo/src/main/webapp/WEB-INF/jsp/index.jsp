<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
<link href="webjars/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<link href="webjars/bootstrap-fileinput/4.3.5/css/fileinput.min.css" rel="stylesheet">
<script type="text/javascript" src="webjars/jquery/2.0.3/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap-fileinput/4.3.5/js/fileinput.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap-fileinput/4.3.5/js/locales/zh.js"></script>
</head>
<body>
	<form class="form-horizontal required-validate" action="${ctx}/save?callbackType=confirmTimeoutForward" enctype="multipart/form-data" method="post" onsubmit="return iframeCallback(this, pageAjaxDone)">

    <div class="form-group">
        <label for="" class="col-md-1 control-label">项目封面</label>
        <div class="col-md-10 tl th">
            <input type="file" name="image" class="projectfile" value="${deal.image}" />
            <p class="help-block">支持jpg、jpeg、png、gif格式，大小不超过2.0M</p>
        </div>
    </div>  
    <div class="form-group text-center ">
        <div class="col-md-10 col-md-offset-1">
            <button type="submit" class="btn btn-primary btn-lg">保存</button>
        </div>
    </div>
</form> 
	<script type="text/javascript">
	
		
	</script>
</body>
</html>