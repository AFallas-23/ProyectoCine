
package com.proyecto;

import com.proyecto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 *
 * @author Fernando
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserService userDetailsService;
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public UserService getUserService(){
        return new UserService();
    }
    
    @Bean
    DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        daoAuthenticationProvider.setUserDetailsService(getUserService());
        return daoAuthenticationProvider;
    }
    
    @Bean
    public AuthenticationSuccessHandler appAuthenticationSuccessHandler(){
        return new AppAuthenticationSuccessHandler();
    }
            
    public SecurityConfig(UserService userPrincipalDetailsService){
        this.userDetailsService = userPrincipalDetailsService;
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth){
        auth.authenticationProvider(authenticationProvider());
    }
    
    @Override
    protected void configure(HttpSecurity http)  throws Exception{
        http.authorizeRequests()
                .antMatchers("/factura", "/login")
                .hasRole("ADMIN")
                .antMatchers("/facturaC", "/factura", "/", "/login")
                .hasAnyRole("USER", "ADMIN") //Borrando acá tambien se pueden restringir accesos
//                .anyRequest().authenticated() Quitar esto hace que podamos acceder a la pagina sin tener que hacer login
                .and()
                .formLogin() //Esto crea un login por defecto de spring
                //Apartir de aca se le dice al programa cual va a ser el login que debe usar(el nuestro)
                .loginPage("/login").permitAll().defaultSuccessUrl("/PInicio", true).and().logout() //Todas las personas pueden entrar y al logear lo lleva a persona
                .logoutUrl("/logout")
                .logoutSuccessUrl("/");
    }
}
