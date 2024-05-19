/**
 * 
 */
let account = document.getElementById("ac");
let reply;
let errorAccount = document.getElementById("errorAccount");
let successAccount = document.getElementById("sucessAccount");
async function VerifyAccount(){
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
						successAccount.innerText = "";
					}else{
						if(response=="errorAcount"){
							errorAccount.innerText="已有相同帳戶名稱";
							successAccount.innerText = "";
						}else{
							successValue.innerText="可使用的帳戶名稱";
							successAccount.innerText="";
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
						successPassword.innerText = "";
					}else{
						if(response=="errorPassword"){
							errorPassword.innerText="密碼已被註冊";
							successPassword.innerText = "";
						}else{
							successPassword.innerText="可使用的帳戶密碼";
							errorPassword.innerText="";
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
 