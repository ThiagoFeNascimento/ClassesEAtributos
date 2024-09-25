
import java.util;

// Veículo
class Veículo {
    private String placa;
    private String modelo;
    private String cor;
}

// Entidade Cliente
class Cliente {
    private String nome;
    private String telefone;
}

// Entidade Pátio
class Pátio {
    private String nome;
    private List<Veículo> veículos;
}

// Repositório de Veículos
class RepositórioDeVeículos {
    private Map<String, Veículo> veículos;
}

// Repositório de Clientes
class RepositórioDeClientes {
    private Map<String, Cliente> clientes;
}

// Serviço de Estacionamento
class ServiçoDeEstacionamento {
    private RepositórioDeVeículos repositórioDeVeículos;
    private Pátio pátio;
}

// Serviço de Monitoramento
class ServiçoDeMonitoramento {
    private Pátio pátio;
}

public class SistemaDeControleDePátio {
    public static void main(String[] args) {
        // O código principal seria implementado aqui
    }
}
