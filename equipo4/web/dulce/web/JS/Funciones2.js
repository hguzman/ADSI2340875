/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $("tr #delusuario").click(function () {
        var id = $(this).parent().find("#id").val();
        swal({
            title: "Esta seguro de eliminar el usuario?",
            text: "Una vez eliminado, no podra recuperarlo!",
            icon: "danger",
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminarusu(id);
                        swal("El usuario! ha sido eliminado!", {
                            icon: "success",
                        }).then((willDelete)=>{
                            if (willDelete){
                                parent.location.href="ctrlUsuario?accion=Listar";
                            }
                        });
                    } else {
                        swal("usuario no eliminado!");
                    }
                });
    });
    
    function eliminarusu(id){
        console.log("entro en eliminar")
        var url="ctrlUsuario?accion=Eliminar";
        $.ajax({
            type: 'get',
            url: url,
            data: "id="+id,
            success: function (data, textStatus, jqXHR){
                
            }
        });
    }
});


