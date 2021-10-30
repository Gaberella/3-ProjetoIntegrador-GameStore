/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

/**
 *
 * @author Gabri
 */
import Modelos.Cliente;
import Utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
//import java.util.List;

public class ClienteDAO 
{
    public static void inserir(Cliente c) throws SQLException, Exception
    {
        String sql = "INSERT INTO cliente(cpf, nome, dataNascimento, telefone, email, sexo,rg, endereco,senha)" + " VALUES(?,?,?,?,?,?,?,?,?;";
        
        Connection conn = null;
        // conexão com o banco de dados
        
        PreparedStatement pst = null;  
        //Preparação de comandos SQL
        
        try 
        {
            conn = ConnectionUtils.getConnection();
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, c.getNome());
            pst.setString(2, c.getCpf());
            
            Timestamp t = new Timestamp(c.getDataNascimento().getTime());
            pst.setTimestamp(3, t);
            
            pst.setString(4, c.getTelefone());
            pst.setString(5, c.getEmail());
            pst.setString(6, c.getSexo() + "");
            pst.setString(7, c.getRg());
            pst.setString(8, c.getEndereco());
            pst.setString(9, c.getSenha());
            pst.setInt(10, c.getId());
            
            
            pst.execute();
            
        } 
        finally
        {
            if(pst != null && pst.isClosed())
            {
                pst.close();
            }
            if(conn != null && !conn.isClosed())
            {
                conn.close();
            }
        }
        
    }
    
    
    public static void alterar(Cliente c) throws SQLException, ClassNotFoundException
    {
        String sql = "UPDATE cliente SET cpf = ?, nome = ?, dataNascimento = ?, sexo = ?"
                + ", rg = ?, email = ? , endereco = ? , senha = ?, WHERE id_cliente = ?";
        
        Connection conn = null;
        PreparedStatement pst = null;
        
        try 
        {
            conn = ConnectionUtils.getConnection();
            pst = conn.prepareStatement(sql);
            
            conn = ConnectionUtils.getConnection();
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, c.getNome());
            pst.setString(2, c.getCpf());
            
            Timestamp t = new Timestamp(c.getDataNascimento().getTime());
            pst.setTimestamp(3, t);
            
            pst.setString(4, c.getTelefone());
            pst.setString(5, c.getEmail());
            pst.setString(6, c.getSexo() + "");
            pst.setString(7, c.getRg());
            pst.setString(8, c.getEndereco());
            pst.setString(9, c.getSenha());
            pst.setInt(10, c.getId());
            
            
            pst.execute();

        }
        finally 
        {
            if(pst != null && pst.isClosed())
            {
                pst.close();
            }
            if(conn != null && !conn.isClosed())
            {
                conn.close();
            }
        }
    }
    
    
    public static void excluir (int id) throws SQLException, ClassNotFoundException
    {
        String sql = "DELETE FROM cliente Where id_cliente = ?";
        
        Connection conn = null;
        PreparedStatement pst = null;
        
        try 
        {
            conn = ConnectionUtils.getConnection();
            pst = conn.prepareStatement(sql);
            
            pst.setInt(1, id);
            
            pst.execute();
            
            
        }
        finally 
        {
            if(pst != null && pst.isClosed())
            {
                pst.close();
            }
            if(conn != null && !conn.isClosed())
            {
                conn.close();
            }
        }
    }
    
//    public static List<Cliente> listar (boolean apenasCliente) throws SQLException, ClassNotFoundException
//    {
//        String filtro;
//        
//        if(apenasCliente)
//            
//        try 
//        {
//            
//        } 
//        finally 
//        {
//        }
//    }
    
    
}
