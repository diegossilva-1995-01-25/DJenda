package Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import beans.MBUsuario;
import control.CtrlUsuario;
import model.Usuario;

public class UC01_ManterUsuario {

	static MBUsuario mb;
	static Usuario u;
	static CtrlUsuario ctU;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mb = new MBUsuario();
		ctU = new CtrlUsuario();
		u = new Usuario();
		
		u.setEmailUsuario("diego@gmail.com");
		u.setNome("Diego");
		u.setSenhaUsuario("123");
		u.setDataNascimentoUsuario("1995-01-25");
		u.setNickUsuario("d");
		u.setFraseDeDicaUsuario("123");
		
	}

	@After
	public void tearDown() throws Exception {
		//mb.excluir();
	}

	@Test
	public void UC01_CT01_CadastrarUsuario() {
		mb.setUltUsr(u);
		assertEquals(1, mb.adicionar());
	}

}
