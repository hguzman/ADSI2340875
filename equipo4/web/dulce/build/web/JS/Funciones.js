
$(document).ready(function () {
    $("tr #btndelete").click(function () {
        var id = $(this).parent().find("#idp").val();
        swal({
            title: "Esta seguro de eliminar el producto?",
            text: "Una vez eliminado, no podra recuperarlo!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminar(id);
                        swal("El producto! ha sido eliminado!", {
                            icon: "success",
                        }).then((willDelete)=>{
                            if (willDelete){
                                parent.location.href="CtrProducto?accion=carrito";
                            }
                        });
                    } else {
                        swal("producto no eliminado!");
                    }
                });
    });
    
    function eliminar(id){
        var url="CtrProducto?accion=Delete";
        $.ajax({
            type: 'post',
            url: url,
            data: "idp="+id,
            success: function (data, textStatus, jqXHR){
                
            }
        });
    }
    
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

