package com.sda.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

       /* Configuration for all user*/

        http.authorizeRequests()
                .antMatchers("/**").permitAll();
//        http.authorizeRequests()
//                .antMatchers("/user-form","user-form","user-form/submit");

       /* Configuration for logged user*/





        http.formLogin()
                .loginProcessingUrl("/login")
                .usernameParameter("uname")
                .passwordParameter("psw")
                .loginPage("/login")
                .defaultSuccessUrl("/home");
        http.logout()
                .logoutUrl("/logout")
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth, PasswordEncoder passwordEncoder, DataSource dataSource) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder);
    }//am configurat springul sa foloseasca DB pt autentificare "jdbcauthentication", "datasource" este un obiect creat automat de spring si se conetc automat
    //la baza de date
}
