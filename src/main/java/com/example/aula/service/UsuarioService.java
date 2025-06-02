package com.example.aula.service;

import com.example.aula.model.Usuario;
import com.example.aula.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public void salvar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void atualizar(Usuario usuario) {
        if (usuario.getId() == null) {
            throw new IllegalArgumentException("ID do jogador é obrigatório para atualização.");
        }
        usuarioRepository.save(usuario);
    }

    public void excluir(Long id) {
        usuarioRepository.deleteById(id);
    }

    public void excluirTodos() {
        usuarioRepository.deleteAll();
    }
}