// src\pages\Lista\index.js

import logo from '../../assets/images/logo.png'
import { useNavigate } from 'react-router-dom'
import './styles.css'

export default function PaginaInicial() {
    const navigate = useNavigate();

    const irParaCadastro = () => {
        navigate('/cadastro');

    };

    return (
        <div className="pagina-inicial">
            <img src={logo} alt="Logo" />
            <h1>Bem-vindo ao nosso site</h1>
            <button onClick={irParaCadastro} className='link-cadastro'>Ir para Cadastro de Jogadores</button>
            <button onClick={() => navigate('/usuarios')} className='link-lista'>Ir para Lista de Jogadores</button>
        </div>
    );
}