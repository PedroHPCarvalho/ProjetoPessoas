/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Julio");
        p2.setNome("Oliver");
        p3.setNome("Joao");
        p4.setNome("Jonas");
        
        p1.setIdade(20);
        p2.setIdade(50);
        p3.setIdade(40);
        p4.setIdade(70);
        
        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("M");
        p4.setSexo("M");
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.64f);
        p4.setSetor("Estoque");
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
