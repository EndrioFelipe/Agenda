/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author endrio
 */
public class TestContato {
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato[] contatos1 = new Contato[3];
        Contato contato = new Contato();
        contato.setNome("João Pedro");
        contato.setTelefone("31 1111-1111");
        contato.setEmail("joaopedro@joao.com");    
        
        /*contatos1[1].setNome("faafa");
        contatos1[1].setTelefone("adfadfdda");
        contatos1[1].setEmail("fddafas"); 
        
        contatos1[2].setNome("Pd!");
        contatos1[2].setTelefone("6d6");
        contatos1[2].setEmail("fdf");*/ 
        contatos1[0]=contato;
        
       agenda.setContatos(contatos1);
       if (agenda!=null && agenda.getContatos()!=null){
            for(Contato c : agenda.getContatos()){
        System.out.println(c.getNome()+c.getTelefone()+c.getEmail());
            }
        }
    }
   
}
