
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
<%@include file="Componentes/bodyprimeraparte.jsp"%>

<h1>Alta Productos</h1>
<p>Este es el modulo para crear nuevos Productos</p>

<form class="user" action="SvProductos" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreProducto" name="nombreProducto"
                                            placeholder="Nombre del Producto">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="number" class="form-control form-control-user" id="precio" name="precio"
                                            placeholder="Precio">
                                    </div>
                                </div>
                                <button class="btn btn-primary btn-user btn-block" type ="submit">
                                    Agregar Producto
                                </button>
                            </form>


<%@include file="Componentes/bodyfinal.jsp"%>



                                

