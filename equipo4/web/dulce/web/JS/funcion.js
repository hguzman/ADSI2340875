$(document).ready(function () {
    
    $("tr #cantidad").click(function(){
       var idp = $(this).parent().find("#idpro").val();
       var cantidad = $(this).parent().find("#cantidad").val();
       var url = "CtrProducto?accion=ActualizarCantidad";
       $.ajax({
            type: 'post',
            url: url,
            data: "idp="+idp +"&Cantidad="+Cantidad,
            success: function (data, textStatus, jqXHR){
                location.href="CtrProducto?accion=Carrito";
            }
        });
    });
});

