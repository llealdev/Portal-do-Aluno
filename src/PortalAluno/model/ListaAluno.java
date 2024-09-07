/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PortalAluno.model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Matheus Leal
 */
public class ListaAluno {
    
    private static final List<Aluno>  lista = new ArrayList<>();   
    
    public static List<Aluno> Listar(){
        return lista;
    }
    
    public static void Adicionar(Aluno aluno){ 
        lista.add(aluno);
    }

}
