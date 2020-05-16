
function checkAgree() {
    var agree = document.getElementsByName("agree")
    
    for(i=0; i<agree.length; i++) {
        if(!agree[i].checked) {
            alert("모든 항목에 동의해야 합니다.");
            return;
        } 
              
    }
    location.href="join.html";   
}


function chkSubmit(){
    var frm = document.forms['joinInput'];
    var pw1 = document.getElementById('joinPassword1')
    var pw2 = document.getElementById('joinPassword2')
 
    
    if(frm['joinId'].value.trim() == ""){
        alert("id를 입력하세요");
        frm['joinId'].focus()  
        return false;

    } else if(frm['joinPassword1'].value.trim()=="") {
        alert("비밀번호를 입력하세요");
        frm['joinPassword1'].focus()  
        return false;  

    } else if(frm['joinPassword2'].value.trim()=="") {
        alert("비밀번호 확인을 입력하세요");
        frm['joinPassword2'].focus()  
        return false;   

    }  else if(frm['joinEmail'].value.trim()=="") {
        alert("이메일을 입력하세요");
        frm['joinEmail'].focus()  
        return false;  

    } else if(frm['joinTel'].value.trim()=="") {
        alert("전화번호를 입력하세요");
        frm['joinTel'].focus()  
        return false;   
    } 

    alert("회원가입 완료!");
    return true;  
}



