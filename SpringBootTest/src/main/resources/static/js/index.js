$(function() {
	$("#nav").tree({
		url : "indexServlet?method=findTree",
		lines : true,
		onClick : function(data) {
			if (data.url) {
				if ($("#tabs").tabs("exists", data.text)) {
					$("#tabs").tabs("select", data.text);
				} else {
					$("#tabs").tabs("add", {
						title : data.text,
						closable : true,
						href : data.url
					})
				}

			}
		}

	})

	// 默认首页选项卡
	$("#tabs").tabs({
		fit : true,
		border : false,
	})

	
})