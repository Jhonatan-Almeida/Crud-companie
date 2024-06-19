package com.cds.nicroservicio.companiescrud.repositories;
/**
 * <p> Proyecto companies-crud.
 * <p> Clase WebSiteRepository 14/5/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */


import com.cds.nicroservicio.companiescrud.entities.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DE LA INTERFACE --.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - jhonatan.almeida - 14/5/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author jhonatan.almeida
 * @version 1.0.0
 * @since 14/5/2024
 */

public interface WebSiteRepository extends JpaRepository<WebSite, Long> {

}
