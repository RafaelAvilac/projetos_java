package program.prj_bancodedados_poo1.util;
// ^ Pacote da classe: pertence à camada "util" (utilitários) do projeto.

// Imports necessários para trabalhar com JDBC:
import java.sql.Connection;      // Interface que representa a conexão com o banco
import java.sql.DriverManager;   // Classe que gerencia os drivers JDBC e cria conexões
import java.sql.SQLException;    // Exceção lançada em erros de acesso ao banco

/**
 * Classe responsável por abrir conexões com o banco de dados MySQL.
 * Centraliza as informações de acesso (driver, URL, usuário e senha),
 * evitando que essas configurações fiquem espalhadas pelo projeto.
 */
public class Conexao {

    // ===== Atributos de configuração da conexão =====
    // "final"  -> valor não pode ser alterado após a inicialização
    // "private" -> encapsulamento: só a própria classe acessa

    /** Nome completo da classe do driver JDBC do MySQL (Connector/J 8+). */
    final private String driver = "com.mysql.cj.jdbc.Driver";

    /** URL de conexão JDBC: protocolo:subprotocolo//host:porta/banco. */
    final private String url = "jdbc:mysql://localhost:3306/bd_pessoas";

    /** Usuário do banco de dados. */
    final private String usuario = "root";

    /** Senha do usuário do banco de dados. */
    final private String senha = "123456";

    /**
     * Abre e retorna uma conexão com o banco de dados.
     *
     * @return um objeto Connection já conectado, ou null caso ocorra
     *         algum erro (driver ausente ou falha na conexão).
     */
    public Connection conectar() {

        // Declara a variável que guardará a conexão.
        // Começa como null porque ainda não sabemos se a conexão vai dar certo.
        Connection conn = null;

        // Bloco try: tenta executar as operações que podem lançar exceções.
        try {

            // 1) Carrega dinamicamente a classe do driver JDBC na memória da JVM.
            //    Isso registra o driver no DriverManager, permitindo que ele
            //    reconheça URLs do tipo "jdbc:mysql://...".
            //    Se a classe não existir (JAR do MySQL ausente), lança ClassNotFoundException.
            Class.forName(driver);

            // 2) Solicita ao DriverManager uma conexão usando a URL, o usuário e a senha.
            //    Se o banco estiver offline, a senha estiver errada, o banco não existir, etc.,
            //    lança SQLException.
            conn = DriverManager.getConnection(url, usuario, senha);

        // Captura o erro quando a classe do driver não é encontrada.
        } catch (ClassNotFoundException ex) {

            // Imprime a pilha de erros no console (útil para depuração, mas não ideal em produção).
            ex.printStackTrace();

        // Captura o erro quando ocorre falha na comunicação com o banco.
        } catch (SQLException ex) {

            // Imprime a pilha de erros no console.
            ex.printStackTrace();
        }

        // Retorna a conexão criada (ou null, se houve algum erro acima).
        // Observação: quem chamou este método deve testar se o retorno é null
        // e, ao terminar de usar, deve chamar conn.close() para liberar recursos.
        return conn;
    }
}