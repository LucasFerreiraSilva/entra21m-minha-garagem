
import dao.CarroDAO;
import database.Utilitarios;
import java.awt.EventQueue;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Carro;
import view.JFrameInicial;

/**
 * @author (Name=Lucas Ferreira Silva Date=08-11-2017)
 */
public class Principal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
            JFrameInicial inicial = new JFrameInicial();
            }
        });
    }
}
/**
 * CarroDAO dao = new CarroDAO(); Carro peugeout308 = new Carro();
 * peugeout308.setNome("308"); peugeout308.setFabricante("Peugeot");
 * peugeout308.setCor("Rose"); peugeout308.setAnoFabricacao((short)2013);
 * peugeout308.setAnoLancamento((short)2014);
 * peugeout308.setEstaFuncional(true);
 * peugeout308.setPermitidaCirculacao(false);
 * peugeout308.setQuantidadeBatidas((byte)13); peugeout308.setPlaca("");
 * peugeout308.setPotencia(146); peugeout308.setDataCompra(new Date(2013,8,24));
 * peugeout308.setTipoPneu((short)17); peugeout308.setRenavam(843751789);
 * peugeout308.setQuilometragem(18654.15f);
 * peugeout308.setQuantidadePortas((byte)4);
 * peugeout308.setChassi("1878-6544-1879-3548-1425");
 * peugeout308.setDescricao("O 308 é um modelo familiar"); int codigoInserir =
 * dao.inserir(peugeout308);
 * if(codigoInserir!=Utilitarios.NAO_FOI_POSSIVEL_INSERIR){
 * peugeout308.setId(codigoInserir); }else{
 * JOptionPane.showMessageDialog(null,"Não foi possível inserir"); }
 * ArrayList<Carro> carros = dao.retornaListagem(); for(Carro carro:carros){
 * System.out.println(carro.getId()+ "-" + carro.getNome()); }
 * peugeout308.setNome("Gol"); peugeout308.setFabricante("VW"); int
 * codigoAlterar = dao.alterar(peugeout308); if(codigoAlterar !=
 * Utilitarios.NAO_FOI_POSSIVEL_ALTERAR){ JOptionPane.showMessageDialog(null,
 * "Alterado com sucesso!"); }else{ JOptionPane.showMessageDialog(null, "Deu
 * ruim mano"); } for(int i=1;i<20;i++){ dao.excluir(i); } }
 */
