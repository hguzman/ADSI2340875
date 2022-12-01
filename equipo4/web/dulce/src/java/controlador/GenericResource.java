/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import modelo.producto;
import modelo.productoDAO;

/**
 * REST Web Service
 *
 * @author HPLAPTOP01
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of controlador.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    
    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    public static List<producto> lista = new ArrayList();
    @GET
    @Path("Listar")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<producto> ListarProductos(){
        producto p = new producto();
        productoDAO pdao = new productoDAO();
        lista = pdao.listar();
        return lista;
    }
}
