function employeCheck() {
	var employee = $("#employee").val();
	var phone = $("#phone").val();
	if (employee == "") {
		return;
	}
	var param = "paijianyuan=" + employee + "&phone=" + phone + "&m=add";
	add(param);
}

function checkDel(id){
	if(confirm("确定要删除该派件员？") == true){
		var param = "id=" + id + "&m=del";
		del(param);
	}
}

function del(param) {
	$.ajax( {
		type : "post",
		async : false,
		cache : false,
		url : "employee.do",
		data : param,
		timeout : 50000,
		error : function() {
			alert("删除失败！\r\n请检查网络是否连接正常！");
		},
		success : function(data) {
			data = trim(data);
			if (parseInt(data) != 1) {
				alert("删除失败！\r\n该员工可能已经被删除！");
			}else{
				alert("删除成功！");
				window.location.reload();
			}
		}
	});
}

function add(param) {
	$.ajax( {
		type : "post",
		async : false,
		cache : false,
		url : "employee.do",
		data : param,
		timeout : 50000,
		error : function() {
			alert("添加失败！\r\n请检查网络是否连接正常！");
		},
		success : function(data) {
			data = trim(data);
			if (parseInt(data) != 1) {
				alert("添加失败！\r\n该员工可能已经存在！");
			}else{
				alert("添加成功！");
				window.location.reload();
			}
		}
	});
}