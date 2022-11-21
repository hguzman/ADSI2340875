$(document).ready(function () {
    $("tr #delpro").click(function () {
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
                        swal("Poof! El Producto se ha eliminado !",{
                            icon: "success",
                        }).then((willDelete)=>{
                            if(willDelete){
                                parent.location.href="CtrProducto?accion=Listar"
                            }
                        });
                        
                    } else {
                       swal("Producto no eliminado!");
                    }
                });
    });
});

function eliminar(id){
    var url = "CtrProducto?accion=Eliminar"
    $.ajax({
        type:'post', 
        url: url,
        data: "id="+id,
        success: function(data, textStatus, jqXHR){
            
        }
    });
    }