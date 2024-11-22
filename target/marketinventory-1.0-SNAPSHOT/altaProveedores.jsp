
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
<%@include file="Componentes/bodyprimeraparte.jsp"%>

<h1>Alta Proveedores</h1>
<p>Este es el modulo para crear nuevos Proveedores</p>

<form class="user" action="SvProveedores" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="number" class="form-control form-control-user" id="documento" name="documento"
                                            placeholder="Documento">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                                            placeholder="Nombre">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellido" name="apellido"
                                            placeholder="Apellido">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="number" class="form-control form-control-user" id="telefono" name="telefono"
                                            placeholder="Telefono">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="empresa" name="empresa"
                                            placeholder="Empresa">
                                    </div>
                                </div>
                                <button class="btn btn-primary btn-user btn-block" type ="submit">
                                    Agregar proveedor
                                </button>
                            </form>


<%@include file="Componentes/bodyfinal.jsp"%>



                                

