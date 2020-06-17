$(document).ready(function(){
	
	$("#mycate").click(function(){
		json();
	});
});

function json(){
	
	$.ajax({
		url : "cate_list.ajax"
		, type : "POST"
		, cache : false
		, success : function(data, status){
			if(status == "success"){
				
		
			}			
		}
	});
} // end loadPage()
