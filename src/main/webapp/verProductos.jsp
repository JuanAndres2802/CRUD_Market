
<%@page import="java.util.List"%>
<%@page import="Logica.Productos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
<%@include file="Componentes/bodyprimeraparte.jsp"%>


<!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Ver Productos</h1>
                    <p class="mb-4">A continuacion podra visualizar la lista completa de Productos</p>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Productos</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombre de Producto</th>
                                            <th>Precio</th>
                                            <th style="width: 210px">Accíon</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombre de Producto</th>
                                            <th>Precio</th>
                                            <th style="width: 210px">Accíon</th>
                                        </tr>
                                    </tfoot>
                                    
                                    <% 
                                        List<Productos> listaProductos = (List) request.getSession().getAttribute("listaProductos");
                                    %>
                                    
                                    <tbody>
                                        <%for (Productos prod: listaProductos){%>
                                        <tr>
                                            <td><%=prod.getId_producto() %></td>
                                            <td><%=prod.getNombreProducto() %></td>
                                            <td><%=prod.getPrecio() %></td>
                                            
                                            <td style="display:flex; width:230px;">
                                                <form name="eliminar" action="SvElimProductos" method="POST">
                                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right: 5px;">
                                                        <i class="fas fa-trash-alt"></i> Eliminar
                                                    </button>
                                                    <input type="hidden" name="id" value="<%=prod.getId_producto() %>">
                                                </form>
                                                <form name="editar" action="SvEditProductos" method="GET">
                                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left: 5px;">
                                                        <i class="fas fa-pencil-alt"></i> Editar
                                                    </button>
                                                    <input type="hidden" name="id" value="<%=prod.getId_producto() %>">
                                                </form>
                                        </tr>
                                        <%}%>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

<%@include file="Componentes/bodyfinal.jsp"%>
