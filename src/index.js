import React from "react";
import ReactDOM from "react-dom";
// Rotas
import { HashRouter } from "react-router-dom";
import Router from "./Router/routes";

ReactDOM.render(
  <HashRouter>
    <Router />
  </HashRouter>,
  document.getElementById("root")
);
