/**
 * 
 */
let account = document.getElementById("ac");
let reply;
let errorAccount = document.getElementById("errorAccount");
let successAccount = document.getElementById("sucessAccount");
async function VerifyAccount(){
	errorAccount.innerText="";
	successAccount.innerText = "";
	if(account.value !="") {
		try{
			reply = await $.ajax({
				url:"/vegven/verifyAccount?account="+account.value,
				type:"POST",
				contentType:"application/json",
				data:JSON.stringify({
					account:account.value
				}),
				success:function(response){
					console.log(response);
					if(response=="errorMatchAccount"){
						errorAccount.innerText="帳號必須包含英文大小寫以及數字";
						
					}else{
						if(response=="errorAcount"){
							errorAccount.innerText="已有相同帳戶名稱";
							
						}else{
							successAccount.innerText="可使用的帳戶名稱";
							
						}
					}
				},
				error: function(xhr, status, error) {
                    console.error('Error fetching account verification:', xhr.responseText);
                }

			})			
			
		}catch(error) {
            console.error('Error fetching account verification:', error);
		}
		
	}	
 }
 let errorPassword = document.getElementById("errorPassword");
 let successPassword = document.getElementById("successPassword");
 let password = document.getElementById("pw");
 async function VerifyPassword(){
	errorPassword.innerText="";
	successPassword.innerText = "";
	if(password.value !="") {
		try{
			reply = await $.ajax({
				url:"/vegven/verifyPassword?password="+password.value,
				type:"POST",
				contentType:"application/json",
				data:JSON.stringify({
					password:password.value
				}),
				success:function(response){
					console.log(response);
					if(response=="errorMatchPassword"){
						errorPassword.innerText="密碼必須包含英文大小寫以及數字";
						
					}else{
						if(response=="errorPassword"){
							errorPassword.innerText="密碼已被註冊";
							
						}else{
							successPassword.innerText="可使用的帳戶密碼";
							
						}
					}
				},
				error: function(xhr, status, error) {
                    console.error('Error fetching account verification:', xhr.responseText);
                }

			})			
			
		}catch(error) {
            console.error('Error fetching account verification:', error);
		}
		
	}	
 }
 
 let againPW = document.getElementById("againPW");
 let errorAgainPW = document.getElementById("errorMatchPassword");
 let successAgaainPW = document.getElementById("successMatchPassword");
 async function matchAgainPassword(){
	errorAgainPW.innerText = "";
	successAgaainPW.innerText = "";
	if(password.value == againPW.value ){
		successAgaainPW.innerText = "與密碼輸入相符";
		
	}else{
		errorAgainPW.innerText = "與密碼輸入不相符"
	}
 }
 
 let email = document.getElementById("mails");
 let errorMail = document.getElementById("errorMail");
 let successMail = document.getElementById("successMail");
 async function VerifyEmail(){
	errorMail.innerText="";
	successMail.innerText="";
	if(email.value !="") {
		try{
			reply = await $.ajax({
				url:"/vegven/verifyEmail?email="+email.value,
				type:"POST",
				contentType:"application/json",
				data:JSON.stringify({
					mail:email.value
				}),
				success:function(response){
					console.log(response);
					if(response=="errorMatchEmail"){
						errorMail.innerText="不正確的信箱格式";
						
					}else{
						if(response=="sameEmail"){
							errorMail.innerText="信箱已被註冊";
							
						}else{
							successMail.innerText="可註冊的信箱";
							
						}
					}
				},
				error: function(xhr, status, error) {
                    console.error('Error fetching account verification:', xhr.responseText);
                }

			})			
			
		}catch(error) {
            console.error('Error fetching account verification:', error);
		}
		
	}
 }
 
 let phone = document.getElementById("phone");
 let errorPhone = document.getElementById("errorPhone");
 let successPhone = document.getElementById("successPhone");
 async function VerifyPhone (){
	errorPhone.innerText="";
	successPhone.innerText="";
	if(phone.value !="") {
		try{
			reply = await $.ajax({
				url:"/vegven/VerifyPhone?phone="+phone.value,
				type:"POST",
				contentType:"application/json",
				data:JSON.stringify({
					phone:phone.value
				}),
				success:function(response){
					console.log(response);
					if(response=="errorMatchPhone"){
						errorPhone.innerText="請輸入台灣手機格式";
						
					}else{
						if(response=="samePhone"){
							errorPhone.innerText="此手機已被驗證";
							
						}else{
							successPhone.innerText="此號碼可使用";
							
						}
					}
				},
				error: function(xhr, status, error) {
                    console.error('Error fetching account verification:', xhr.responseText);
                }

			})			
			
		}catch(error) {
            console.error('Error fetching account verification:', error);
		}
		
	}
 }