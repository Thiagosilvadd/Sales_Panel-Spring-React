import React from 'react';
import {BrowserRouter, Route, Switch} from 'react-router-dom';
import Home from "./assets/pages/Home";
import Dashboard from "./assets/pages/Dashboard";


const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact >
                    <Home/>
                </Route>

                <Route path="/dashboard" >
                    <Dashboard/>
                </Route>
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;