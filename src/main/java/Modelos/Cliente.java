
package Modelos;

/**
 *
 * @author Gabri
 */
import java.util.Date;
import java.text.SimpleDateFormat;


public class Cliente 
{
    private int id;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;
    private String endereco;
    private String senha;
    private char sexo;
   
    /**
     *
     * @param id
     * @param nome
     * @param dataNascimento
     * @param cpf
     * @param rg
     * @param sexo
     * @param telefone
     * @param email
     * @param endereco
     * @param senha
     */
    
  
    public Cliente(int id, String nome, Date dataNascimento, String cpf,String rg, char sexo, String telefone, String email, String endereco, String senha)
   {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;      
   }

    public Cliente() 
    {
        
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public Date getDataNascimento() 
    {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) 
    {
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public String getRg() 
    {
        return rg;
    }

    public void setRg(String rg) 
    {
        this.rg = rg;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }

    public char getSexo() 
    {
        return sexo;
    }

    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }
       
   
}
