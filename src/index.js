import React from "react";
import ReactDOM from "react-dom";
import reportWebVitals from "./reportWebVitals";
// Rotas
import { BrowserRouter } from "react-router-dom";
import Router from "./Router/routes";

ReactDOM.render(
  <React.StrictMode>
    <BrowserRouter>
      <Router />
    </BrowserRouter>
  </React.StrictMode>,
  document.getElementById("root")
);

reportWebVitals();