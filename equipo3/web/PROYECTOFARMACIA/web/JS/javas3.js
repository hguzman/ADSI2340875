$(document).ready(function () {
    $("tr #delusuaio").click(function () {
        var id = $(this).parent().find("#id").val();
        swal({
            title: "Esta seguro de eliminar?",
            text: "Una vez eliminado no podra recuperar!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminar(id);
                        swal("Poof! El usuario se ha eliminado !",{
                            icon: "success",
                        }).then((willDelete)=>{
                            if(willDelete){
                                parent.location.href="CtrUsuario?accion=Listar"
                            }
                        });
                        
                    } else {
                       swal("Usuario no eliminado!");
                    }
                });
    });
});

function eliminar(id){
    var url = "CtrUsuario?accion=Eliminar"
    $.ajax({
        type:'get', 
        url: url,
        data: "id="+id,
        success: function(data, textStatus, jqXHR){
            
        }
    });
    }
 

