/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $("tr #delpro").click(function () {
        var id = $(this).parent().find("#id").val();
        swal({
            title: "Esta seguro de eliminar el producto?",
            text: "Una vez eliminado, no podra recuperarlo!",
            icon: "danger",
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminarpro(id);
                        swal("El producto! ha sido eliminado!", {
                            icon: "success",
                        }).then((willDelete)=>{
                            if (willDelete){
                                parent.location.href="CtrProducto?accion=Listar";
                            }
                        });
                    } else {
                        swal("producto no eliminado!");
                    }
                });
    });
    
    function eliminarpro(id){
            var url="CtrProducto?accion=Eliminar";
        $.ajax({
            type: 'post',
            url: url,
            data: "id="+id,
            success: function (data, textStatus, jqXHR){
                
            }
        });
    }
    
    
});

