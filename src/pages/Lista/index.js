// src\pages\Lista\index.js

import PaginaInicial from '../PaginaInicial'
import ListaDeUsuarios from '../../components/ListaDeUsuarios'
import { useNavigate } from 'react-router-dom'
import './styles.css'

function PaginaListaUsuarios() {
    const navigate = useNavigate()

    // Função para excluir todos os jogadores
    const deleteAllPlayers = () => {
        if (window.confirm("Tem certeza que deseja excluir todos os jogadores?")) {
            fetch('http://localhost:8080/usuarios/delete-all-players', { // Certifique-se de usar o endpoint correto
                method: 'DELETE',
            })
                .then(response => {
                    if (response.ok) {
                        alert('Todos os jogadores foram excluídos com sucesso!')
                        window.location.reload() // Atualiza a página
                    } else {
                        alert('Erro ao excluir os jogadores.')
                    }
                })
                .catch(error => {
                    console.error('Erro:', error)
                    alert('Erro ao excluir os jogadores.')
                })
        }
    }

    return (
        <div className='pagina-lista-usuarios'>
            <div className='container'>
                <h2>Lista de Jogadores</h2>
                <ListaDeUsuarios />
                <button onClick={() => navigate('/cadastro')} className='link-voltar'>
                    Cadastrar jogadores
                </button>
                <button onClick={() => navigate('/')}>
                    Voltar ao início
                </button>
                {/* Botão para excluir todos os jogadores */}
                <button onClick={deleteAllPlayers} className='link-excluir'>
                    Excluir todos os jogadores
                </button>
            </div>
        </div>
    )
}

export default PaginaListaUsuarios