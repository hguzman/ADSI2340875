$(document).ready(function () {
    $("tr #btndelete").click(function () {
        var id = $(this).parent().find("#idp").val();
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
                        swal("Poof! El producto se ha eliminado !",{
                            icon: "success",
                        }).then((willdeDelete)=>{
                            if(willDelete){
                                parent.location.href="CtrProducto?accion=carrito"
                            }
                        });
                        
                    } else {
                       swal("Producto no eliminado!");
                    }
                });
    });
});

function eliminar(id){
    var url = "CtrProducto?accion=Delete"
    $.ajax({
        type:'post', 
        url: url,
        data: "idp="+id,
        succes: function(data, textStatus, jqXHR){
            
        }
    });
    }
 

