
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
<%@include file="Componentes/bodyprimeraparte.jsp"%>

<h1>Edicion de Usuarios</h1>
<p>Este es el modulo para editar los datos de los Usuarios</p>

<% Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar");%>

<form class="user" action="SvEditUsuarios" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreUsuario" name="nombreUsuario"
                                            placeholder="Nombre de Usuario" value="<%=usu.getNombreUsuario() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="contrasena" name="contrasena"
                                            placeholder="Contraseña" value="<%=usu.getContrasena() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="rol" name="rol"
                                            placeholder="Rol" value="<%=usu.getRol() %>">
                                    </div>
                                </div>
                                <button class="btn btn-primary btn-user btn-block" type ="submit">
                                    Guardar cambios
                                </button>
                            </form>


<%@include file="Componentes/bodyfinal.jsp"%>
