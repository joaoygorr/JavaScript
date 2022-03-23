import React from 'react';
import ReactDOM from 'react-dom';
// Rotas
import { BrowserRouter } from "react-router-dom";
import Router from "./Router/routes";

ReactDOM.render(
  <BrowserRouter>
    <Router />
  </BrowserRouter>,
  document.getElementById("root")
);
