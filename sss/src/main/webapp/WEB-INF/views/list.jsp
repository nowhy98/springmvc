<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
    <meta charset="utf-8">
    <script type="text/javascript" src="/static/js/jquery-1.12.4.min.js"></script>
    <%-- 引入样式--%>
    <link href="/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="/static/bootstrap-3.3.7-dist/css/fresh-bootstrap-table.css">

    <script src="/static/js/bootstrap-table.js"></script>

    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
</head>
<body>

<%--<input type="hidden" id="menuHid" value="${menuHid}" />--%>

<div id="toolbar" class="btn-group">
    <button  id="btn_add" type="button" class="btn btn-warning" data-toggle="modal" data-target="#add">
        <span class="glyphicon glyphicon-plus" aria-hidden="true" ></span>新增
    </button>
</div>






<div class="modal fade" tabindex="-1" role="dialog" id="add">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <form method="post" action="http://localhost:8083/save" id="ff">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">新增用户</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <input type="text" placeholder="姓名" name="name"  class="form-control" />
                    </div>
                    <div class="form-group">
                        <input type="text" placeholder="手机号" name="phone"  class="form-control" />
                    </div>
                    <div class="form-group">
                        <input type="text" placeholder="地址" name="address" class="form-control" />
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <input type="submit" class="btn btn-primary" value="保存" >
                </div>
            </form>
        </div>
    </div>
</div>


<div class="modal fade" id="edit" role="dialog">
    <div class="modal-dialog">
        <form action="http://localhost:8083/edit" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">修改用户信息</h4>
                </div>
                <div id="editBookModal" class="modal-body">
                    <div class="form-horizontal">
                        <div class="form-group">
                            <label for="editBookName" class="col-sm-2 control-label">编号:</label>
                            <div class="col-sm-10">
                                <input class="form-control" readonly="readonly" name="id" id="id" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="editBookName" class="col-sm-2 control-label">姓名:</label>
                            <div class="col-sm-10">
                                <input class="form-control" name="name" id="name" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="editBookAuthor" class="col-sm-2 control-label">手机号:</label>
                            <div class="col-sm-10">
                                <input class="form-control" id="phone" name="phone" type="phone">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="editBookPrice" class="col-sm-2 control-label">地址:</label>
                            <div class="col-sm-10">
                                <input class="form-control" id="address" name="address" type="text">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <div class="center-block">
                        <button id="cancelEdit" type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <input id="saveEdit" type="submit" class="btn btn-success">
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>



<div class="modal fade" id="del" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">确认要删除吗？</h4>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <input id="del" type="button" class="btn btn-danger" data-dismiss="modal" value="删除" onclick="del()" />
            </div>
        </div>
    </div>
</div>

<input type="hidden" id="lj" value="${pageContext.request.contextPath}" />
<div class="logo">
    <h1 align="center">用户信息增删改查</h1>
</div>
<div class="container-fluid">
    <div class="row main">
        <div class="col-md-3 nav">
            <div id="tree"></div>
        </div>
        <div class="col-md-9 content">
            <div class="content-body">
                <table class="table" id="table"></table>
            </div>
        </div>
    </div>
</div>


</body>
<script src="/static/js/list.js"></script>
</html>
