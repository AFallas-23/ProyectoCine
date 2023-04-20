
package com.proyecto.service;


import com.proyecto.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */

@Service
public class UserService implements UserDetailsService {
    @Autowired
    public IClienteService clienteService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Cliente cliente = this.clienteService.findByNombre(username);
        Userprincipal userPrincipal = new Userprincipal(cliente);
        return userPrincipal;
    }
    
}
