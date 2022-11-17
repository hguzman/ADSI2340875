$(document).ready(function () {
    $("tr #btndelete").click(function () {
        var id = $(this).parent().find("#idp").val();
        swal({
            title: "¿Está seguro que desea eliminar el producto?",
            text: "Una vez eliminado, no podrá recuperarlo",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminar(id);

                        swal("El producto ha sido eliminado", {
                            icon: "success",
                        }).then((willDelete) => {
                            if (willDelete) {
                                parent.location.href = "CtrProducto?accion=Carrito";
                            }

                        });

                    } else {
                        swal("Tu producto no se eliminó :)");
                    }
                    
                });
                
                function eliminar(id){
                    var url="CtrProducto?accion=Delete"
                    $.ajax({
                        type: 'post',
                        url: url,
                        data: "idp="+id,
                        success: function (data, textStatus, jqXHR){
                            
                            
                        }
                    });
                    
                }
                
                


    })


})

