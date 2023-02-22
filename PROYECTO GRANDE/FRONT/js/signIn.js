function log(){

    let username = document.querySelector(".username").value;
    
    let password = document.querySelector(".password").value;

    console.log(username)
    
    const options = {headers:{'Accept': 'application/json','Content-Type': 'application/json'},
    method: 'POST', body: '{"username":"' + username +'","password":"' + password + '"}'};

    console.log(options)
    fetch('http://localhost:8088/inicio/login', options)
    .then(response =>  
        response.json())
    .then((data) =>{
        console.log(data)

        if(data.username == null || data.password == null){
            alert("Introduce los datos de usuario");
        }
        else if(username != data.username || password != data.password) {
            alert("introduzca correctamente los datos");
        } else {
            localStorage.setItem('username', data.username);
            window.location="mainPage.html";
        }
    });
}