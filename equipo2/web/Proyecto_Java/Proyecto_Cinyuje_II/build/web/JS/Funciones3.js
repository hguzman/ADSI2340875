/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $("tr #delusuario").click(function () {
        var id = $(this).parent().find("#id").val();
        swal({
            title: "¿Está seguro que desea eliminar el usuario?",
            text: "Una vez eliminado, no podrá recuperarlo",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminarusu(id);

                        swal("El usuario ha sido eliminado", {
                            icon: "success",
                        }).then((willDelete) => {
                            if (willDelete) {
                                parent.location.href = "CtrUsuario?accion=Listar";
                            }

                        });

                    } else {
                        swal("Tu usuario no se eliminó :)");
                    }
                    
                });
                
                function eliminarusu(id){
                    var url="CtrUsuario?accion=Eliminar";
                    $.ajax({
                        type: 'get',
                        url: url,
                        data: "id="+id,
                        success: function (data, textStatus, jqXHR){
                            
                            
                        }
                    });
                    
                }
                
                


    })


})
