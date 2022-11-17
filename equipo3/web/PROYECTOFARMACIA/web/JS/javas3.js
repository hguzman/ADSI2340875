$(document).ready(function () {
    $("tr #delusuaio").click(function () {
        var id = $(this).parent().find("#idp").val();
        swal({
            title: "Esta seguro de eliminar el usuario?",
            text: "Una vez eliminado no podra recuperar!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminarusu(id);
                        swal("Poof! El usuario se ha eliminado !",{
                            icon: "success",
                        }).then((willdeDelete)=>{
                            if(willDelete){
                                parent.location.href="CtrProducto?accion=Listar"
                            }
                        });
                        
                    } else {
                       swal("usuario no eliminado!");
                    }
                });
    });
});

function eliminarusu(id){
    var url = "Ctrusuario?accion=Eliminar"
    $.ajax({
        type:'get', 
        url: url,
        data: "idp="+id,
        succes: function(data, textStatus, jqXHR){
            
        }
    });
    }
