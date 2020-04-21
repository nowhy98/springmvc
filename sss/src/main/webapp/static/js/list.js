$(function() {
    $('#table').bootstrapTable({
        url: 'http://localhost:8083/queryAll',    					    //请求后台的URL（*）
        method: 'post',                      //请求方式（*）
        toolbar: '#toolbar',                //工具按钮用哪个容器
        uniqueId: "bid",
        pagination: false,                   //是否显示分页（*）
        toolbarAlign: "right", //工具栏对齐方式
        // sidePagination: "client", //分页方式：client客户端分页，server服务端分页
        uniqueId: "id",
        // pageNumber: 1,                       //初始化加载第一页
        // pageSize: 10,                       //每页的记录行数
        // pageList: [10, 15, 20], //可供选择的每页的行数
        pagination: false, // 是否分页
        sortable: true, // 是否启用排序
        sortOrder: "asc",                   //排序方式
        showColumns: false, //是否显示列选择按钮
        showRefresh: false,                  //是否显示刷新按钮
        clickToSelect: true,                //是否启用点击选中行
        // showToggle: true,
        checkbox: true,
        columns: [{
            field: 'checked',
            checkbox: true,
            align: 'center',
            valign: 'middle'
        }, {

            field: 'id',
            title: '编号',
            display:false
        }, {
            field: 'name',
            title: '姓名'
        }, {
            field: 'phone',
            title: '手机号'
        }, {
            field: 'address',
            title: '地址'
        },{field: 'operate',
         title: '操作',
         formatter: operateFormatter //自定义方法，添加操作按钮
      },]
    });




    // $.ajax({
    //     type: "post",
    //     url: $("#lj").val()+'/sy/menu_NodeMenu.action?menuHid='+$("#menuHid").val(),
    //     dataType: "json",
    //     success: function (result) {
    //         console.log(result)
    //         alert(JSON.stringify(result));
    //         $("#tree").treeview({
    //             data: result,         // 数据源
    //             highlightSelected: true,    //是否高亮选中
    //             levels:3,  //设置继承树默认展开的级别
    //             showTags: true //是否在每个节点右边显示tags标签。tag值必须在每个列表树的data结构中给出
    //         });
    //     },
    //     error: function () {
    //         alert("加载失败！")
    //     }
    // });


});


//
//删除
    function del() {
        var info = $("#table").bootstrapTable('getSelections');

        $.ajax({
            url: "http://localhost:8083/delete",
            type: "post",
            data: {
                "id": info[0].id
            },
            success: function (status) {
                $("#table").bootstrapTable('refresh');
            }
        });

    }

//修改
    function editModel() {
        var info = $("#table").bootstrapTable('getSelections');
        if (info.length > 1) {
            alert("不能同时修改两个目标");
        }
        else if (info.length == 0) {
            alert("请先选中要修改的目标");
        }
        else {
            $("#edit").modal("show");
            $("#id").val(info[0].id);
            $("#name").val(info[0].name);
            $("#phone").val(info[0].phone);
            $("#address").val(info[0].address);
        }
    }

    function editCancel() {
        $('#edit').on('hidden.bs.modal', function () {
            $(':input', '#myFormId').not(':button,:submit,:reset').val('').removeAttr('checked').removeAttr('checked');
        });
    }

    function operateFormatter(value, row, index) {
        var result = "";
        result += "<button style='cursor: pointer' class='btn btn-primary'  onclick='editModel()'>修改</button>&nbsp;&nbsp;";
        result += "<button style='cursor: pointer' class='btn btn-danger' data-toggle='modal' data-target='#del' οnclick='del()'>删除</button>";
        return result;
    }

