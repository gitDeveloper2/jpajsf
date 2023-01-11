/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entityClass.Persons;
import java.util.List;
import javax.faces.bean.*;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author dev
 */
@ManagedBean
@SessionScoped
public class PersonController {
    EntityManager em=Persistence.createEntityManagerFactory("JpaProjectPU").createEntityManager();
     
    public List<Persons> getAll(){
   
    em.getTransaction().begin();
    Query query=em.createNamedQuery("Persons.findAll",Persons.class);
    em.getTransaction().commit();
    
     return query.getResultList();
    }
    
    public static void main(String[] args) {
       // PersonController p=new PersonController();
        System.out.println("d");
        //
    }
}
