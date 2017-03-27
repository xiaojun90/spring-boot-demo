<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<link rel="shortcut icon" href="${contextPath }/logo.ico?v=1.1" type="image/x-icon"/>
<link href="${contextPath }/assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="${contextPath }/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<style>
	.login {
		background-color: #444 !important
	}
	.login-content {
		width: 400px;
	    margin: auto;
	    margin-top: 150px;
	}
	.margin-left-5 {
		margin-left: 5px;
	}
	.required {
		color: red;
	}
</style>
</head>
<body class="login">
	<div class="panel panel-primary login-content">
	  <div class="panel-heading">用户登录</div>
	  <div class="panel-body">
	    <form action="">
	    	<div class="form-group">
			    <label for="exampleInputEmail1">用户名<i class="required">*</i></label>
			    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="请输入用户名">
			</div>
			<div class="form-group">
			    <label for="exampleInputEmail1">密码<i class="required">*</i></label>
			    <input type="password" class="form-control" id="exampleInputEmail1" placeholder="请输入密码">
			</div>
			<div class="row">
				<div class="col-md-9">
					<label>
				      <input type="checkbox"> 记住我
				    </label>
				</div>
				<div class="col-md-3">
					<button type="submit" class="btn btn-primary pull-right">登录<i class="fa fa-arrow-right margin-left-5" aria-hidden="true"></i></button>
				</div>
			</div>
	    </form>
	  </div>
	</div>
</body>
</html>