function registro(){

    let username = document.querySelector(".username").value;
    let password = document.querySelector(".password").value;
    let date = document.querySelector(".date").value;
    let nombre = document.querySelector(".nombre").value;
    let apellido = document.querySelector(".apellido").value
    let correo = document.querySelector(".correo").value;
    
    const options = {headers:{'Accept': 'application/json','Content-Type': 'application/json'},
    method: 'POST', body: '{"apellidos":"'+ apellido +'","email":"'+ correo +'","fecha_Nacimiento":"'
    + date +'","nombre":"'+ nombre +'","password":"' + password + '","username":"' + username +'"}'}

    console.log(options)
    fetch('http://localhost:8088/inicio/registrar', options)
    .then(response =>  
        response.json())
    .then((data) =>{
        console.log(data)
    
        if(username == "" || password == "" || date == "" || nombre == "" || correo == ""){
            alert("Introduce los datos correctamente");
        } else {
            alert("usuario creado correctamente");
            window.location="signIn.html";
        }
    });
}