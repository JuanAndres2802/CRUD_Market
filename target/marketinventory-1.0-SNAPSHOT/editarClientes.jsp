
<%@page import="Logica.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
<%@include file="Componentes/bodyprimeraparte.jsp"%>

<h1>Edicion de Clientes</h1>
<p>Este es el modulo para editar los datos de los Clientes</p>

<% Cliente cli = (Cliente) request.getSession().getAttribute("cliEditar");%>

<form class="user" action="SvEditClientes" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                                            placeholder="Nombre" value="<%=cli.getNombre() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellido" name="apellido"
                                            placeholder="Apellido" value="<%=cli.getApellido() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id=telefono" name="telefono"
                                            placeholder="Telefono" value="<%=cli.getTelefono() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="direccion" name="direccion"
                                            placeholder="Direccion" value="<%=cli.getDireccion() %>">
                                    </div>
                                </div>
                                <button class="btn btn-primary btn-user btn-block" type ="submit">
                                    Guardar cambios
                                </button>
                            </form>


<%@include file="Componentes/bodyfinal.jsp"%>




                                

                                

