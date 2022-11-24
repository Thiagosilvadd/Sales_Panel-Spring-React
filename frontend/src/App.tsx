import React from 'react';
import NavBar from "./assets/components/NavBar";
import Footer from "./assets/components/Footer";
import DataTable from "./assets/components/DataTable";


function App() {
    return (
        <>
            <NavBar/>
            <div className="container">
                <h1 className="text-primary">Olá mundo!</h1>
            </div>
            <DataTable/>
            <Footer/>
        </>
    );
}

export default App;
