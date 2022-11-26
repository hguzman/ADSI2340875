/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    $("tr #delproducto").click(function () {
        var id = $(this).parent().find("#idprod").val();
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
                                parent.location.href = "CtrProducto?accion=Listar";
                            }

                        });

                    } else {
                        swal("Tu producto no se eliminó :)");
                    }
                    
                });
                
                function eliminar(id){
                    var url="CtrProducto?accion=Eliminar"
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


