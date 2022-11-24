import React from 'react';

const Footer = () => {
    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <p className="text-light">App desenvolvido por <a href="https://github.com/acenelio" target="_blank"
                                                                  rel="noreferrer">Thiago Silva</a></p>
                <p className="text-light"><small><strong>Dashboard de Vendas</strong><br/>
                    Projeto desenvolvido utilizando React Js e SpringBoot</small></p>
            </div>
        </footer>
    );
}

export default Footer;