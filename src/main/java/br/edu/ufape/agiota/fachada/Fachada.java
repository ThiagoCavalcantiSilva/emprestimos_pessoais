package br.edu.ufape.agiota.fachada;

import br.edu.ufape.agiota.dtos.AgiotaDTO;
import br.edu.ufape.agiota.dtos.ClienteDTO;
import br.edu.ufape.agiota.fachada.exceptions.RegistroNaoEncontradoException;
import br.edu.ufape.agiota.fachada.exceptions.SenhaNulaException;
import br.edu.ufape.agiota.negocio.basica.Agiota;
import br.edu.ufape.agiota.negocio.basica.Cliente;
import br.edu.ufape.agiota.negocio.services.interfaces.AgiotaServiceInterface;
import br.edu.ufape.agiota.negocio.services.interfaces.ClienteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Fachada {
    @Autowired
    private ClienteServiceInterface clienteService;

    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    public Cliente buscarCliente(long id) throws RegistroNaoEncontradoException {
        return clienteService.buscarCliente(id);
    }

    public Cliente criarCliente(ClienteDTO clienteDTO) throws RegistroNaoEncontradoException, SenhaNulaException {
        return clienteService.criarCliente(clienteDTO);
    }

    public Cliente atualizarCliente(ClienteDTO clienteDTO, long id) throws RegistroNaoEncontradoException {
        return clienteService.atualizarCliente(clienteDTO, id);
    }

    //Agiota
    @Autowired
    private AgiotaServiceInterface agiotaService;
    public List<Agiota> listarAgiotas() {
        return agiotaService.listarAgiotas();
    }
    public Agiota criarAgiota(AgiotaDTO agiotaDTO) throws RegistroNaoEncontradoException, SenhaNulaException {
        return agiotaService.criarAgiota(agiotaDTO);
    }

    public Agiota buscarAgiota(long id) throws RegistroNaoEncontradoException {
        return agiotaService.buscarAgiota(id);
    }

    public Agiota atualizarAgiota(AgiotaDTO agiotaDTO, long id) throws RegistroNaoEncontradoException {
        return agiotaService.atualizarAgiota(agiotaDTO, id);
    }
}
