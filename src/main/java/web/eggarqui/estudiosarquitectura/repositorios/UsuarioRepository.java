/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.eggarqui.estudiosarquitectura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.eggarqui.estudiosarquitectura.entidades.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String> {
    
}
