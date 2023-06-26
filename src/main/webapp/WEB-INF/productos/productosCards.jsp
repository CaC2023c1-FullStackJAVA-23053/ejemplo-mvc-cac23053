<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:forEach items="${listaProductos}" var="producto">
    <div class="col mb-5">
        <div class="card h-100">
           <img class="card-img-top" src="assets/productos/${producto.foto}" alt="...">                            
           <div class="card-body p-4">
              <div class="text-center">
                 <h5 class="fw-bolder">${producto.nombre}</h5>
                 <div id="contenedorStars" class="d-flex justify-content-center small text-warning mb-2"></div>
                 $ ${producto.precio}
              </div>
           </div>
           <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
              <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Añadir al carrito</a></div>
           </div>
        </div>
     </div>
    
</c:forEach>
           


