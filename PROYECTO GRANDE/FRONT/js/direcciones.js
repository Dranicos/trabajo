
    function añadirDireccion(){

        let localidad = document.querySelector(".localidad").value;
        let codigo = document.querySelector(".codigo").value;
        let calle = document.querySelector(".calle").value;
        let piso = document.querySelector(".piso").value;
        let letra = document.querySelector(".letra").value
        let numero = document.querySelector(".numero").value

        const options = {headers:{'Accept': 'application/json','Content-Type': 'application/json'},
        method: 'POST', 
        
        body: '{"calle":"'+ calle +'","codigo_Postal":"'+ codigo +'","letra":"'
        + letra +'","localidad":"'+ localidad +'","numero":"' + numero + '","piso":"' + piso +'"}'}
    
        console.log(options)
        fetch('http://localhost:8088/inicio/direcciones/Dranicos', options)
        .then(response =>  
            response.json())
        .then((data) =>{
            console.log(data)
        
            if(localidad == "" || codigo == "" || calle == "" || piso == "" || letra == "" || numero == ""){
                alert("Introduce los datos correctamente");
            } else {
                alert("Direccion Creada Correctamente");
                window.location="datosCliente.html";
            }
        });
    }