
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
<%@include file="Componentes/bodyprimeraparte.jsp"%>

<h1>Alta Productos</h1>
<p>Desarrollo</p>

<form class="user">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre"
                                            placeholder="Nombre">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="precio"
                                            placeholder="Precio">
                                    </div>
                                </div>
                                
                                <a href="#" class="btn btn-primary btn-user btn-block">
                                    Agregar Producto
                                </a>
                            </form>


<%@include file="Componentes/bodyfinal.jsp"%>