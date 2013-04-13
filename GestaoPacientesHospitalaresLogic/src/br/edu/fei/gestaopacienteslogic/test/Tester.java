package br.edu.fei.gestaopacienteslogic.test;

import java.sql.ResultSet;

import br.com.lett.guteDAO.DAOFactory;
import br.com.lett.guteDAO.DataAccessObject;


public class Tester {
	
	public static void main(String args[]){
		try {
			DataAccessObject dao = DAOFactory.createDAO();
			
			ResultSet rs = dao.executeQuery("SELECT * FROM TAB_AULA3");
			
			while (rs.next()) {
				System.out.println("Nome:"+rs.getString("nome"));
		    }
			 
			dao.closeDao();
			
		} catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
