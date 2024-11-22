
<%@page import="Logica.Productos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
<%@include file="Componentes/bodyprimeraparte.jsp"%>

<h1>Edicion de Productos</h1>
<p>Este es el modulo para editar los datos de los Productos</p>

<% Productos prod = (Productos) request.getSession().getAttribute("prodEditar");%>

<form class="user" action="SvEditProductos" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreProducto" name="nombreProducto"
                                            placeholder="Nombre de Producto" value="<%=prod.getNombreProducto() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="precio" name="precio"
                                            placeholder="Precio" value="<%=prod.getPrecio() %>">
                                    </div>
                                </div>
                                <button class="btn btn-primary btn-user btn-block" type ="submit">
                                    Guardar cambios
                                </button>
                            </form>


<%@include file="Componentes/bodyfinal.jsp"%>




                                

