/**
 *
 **/
/*document.write(`<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">`);*/

/*let link=document.createElement('link');
link.href ='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css';
link.rel = 'stylesheet';
link.integrity = 'sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N';
link.crossOrigin = 'anonymous';
document.head.appendChild(link);

/*link=document.createElement('script');
link.src ='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js';
link.integrity = 'sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+';
link.crossOrigin = 'anonymous';
document.head.appendChild(link);

link = document.createElement('script');
link.src = 'http://code.jquery.com/jquery-3.1.1.min.js';
document.head.appendChild(link);

link = document.createElement('link');
link.href = 'https://cdnjs.cloudflare.com/ajax/libs/croppie/2.6.5/croppie.css';
link.rel = 'stylesheet'
document.head.appendChild(link);

link=document.createElement('link');
link.href ='https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css';
link.rel = 'stylesheet';
document.head.appendChild(link);*/

let header = document.getElementById('header');

/*顯示LOGO*/
let logo = document.createElement('form');
let viewLogo = document.createElement('div');
let imglogo = document.createElement('img');
logo.action = '/main';
viewLogo.id = 'logo';
logo.className = 'mr-auto'
imglogo.className = 'ml-5'
imglogo.src = '/img/Vegven.png';
imglogo.style = 'width:200px;height:100%;';
header.appendChild(logo);
logo.appendChild(viewLogo);
viewLogo.appendChild(imglogo);

/*顯示登入按鈕*/
let login = document.createElement('form');
let viewLogin = document.createElement('div');
let loginIcon = document.createElement('i');
login.action='';
viewLogin.className='btn ';
viewLogin.style ='width:100px;height:100%;align-items: center;display: inline-flex;';
viewLogin.innerText = 'Login';
loginIcon.className = 'bi bi-person-circle mb-2 ml-1';
header.appendChild(login);
login.appendChild(viewLogin);
viewLogin.appendChild(loginIcon);

/*購物車*/
let cart = document.createElement('form');
let viewCart = document.createElement('div');
let cartIcon = document.createElement('i');
cart.action='';
viewCart.className='btn ';
viewCart.style ='width:100px;height:100%;align-items: center;display: inline-flex;';
viewCart.innerText = '購物車';
cartIcon.className = 'bi bi-cart4 mb-2 ml-1';
header.appendChild(cart);
cart.appendChild(viewCart);
viewCart.appendChild(cartIcon);

/*購買紀錄*/
let buy = document.createElement('form');
let viewBuy = document.createElement('div');
let buyIcon = document.createElement('i');
buy.action='';
viewBuy.className='btn ';
viewBuy.style ='width:120px;height:100%;align-items: center;display: inline-flex;';
viewBuy.innerText = '購買紀錄';
buyIcon.className = 'bi bi-clipboard-check mb-2 ml-1';
header.appendChild(buy);
buy.appendChild(viewBuy);
viewBuy.appendChild(buyIcon);
/*$('#header').append(`
	<form action="/">
		<div id="logo"><img src="/img/Vegven.png" style="width:200px;height:100%;"></div>
	</form>
	<form action="">
		<div class="btn" style="width:100px;height:100%;align-items: center;display: inline-flex;"><span>login</span><i class="bi bi-person-circle mb-2 ml-1"></i></div>
	</form>
	<form action="">
		<div class="btn" style="width:100px;height:100%;align-items: center;display: inline-flex;"><span>購物車</span><i  class="bi bi-cart4 mb-2 ml-1"></i></div>		
	</form>
	<form action="">
		<div class="btn" style="width:120px;height:100%;align-items: center;display: inline-flex;"><span>購買紀錄</span><i  class="bi bi-clipboard-check mb-2 ml-1"></i></div>
	</form>
`)*/

