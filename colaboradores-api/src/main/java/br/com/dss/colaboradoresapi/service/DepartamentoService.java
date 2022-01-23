package br.com.dss.colaboradoresapi.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dss.colaboradoresapi.model.Departamento;
import br.com.dss.colaboradoresapi.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	
	@Autowired
	DepartamentoRepository departamentoRepository;
	
	
	//Negocial
//	public Colaborador cadastrar(Colaborador colaborador) {
//		return colaboradorRepository.save(colaborador);
//	}
	
	public Collection<Departamento> buscarTodos(){
		return departamentoRepository.findAll();
	}
	
//	public Colaborador buscarPorId(Long id) {
//		return colaboradorRepository.getOne(id);
//	}
	
	
//	public void excluir(Colaborador colaborador) {
//		colaboradorRepository.deleteById(colaborador.getIdColaborador());
//	}
	
//	public Colaborador alterar(Colaborador colaborador) {
//		return colaboradorRepository.save(colaborador);
//	}
}
