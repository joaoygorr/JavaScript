function createTag() {
  let calculadora = document.querySelector(".fundo");
  calculadora.innerHTML = `
   <div class="calculadora">
            <h1>Calculadora</h1>
            <input id="resultado" value="0">
            <table></table>
   </div>
`
}

let caracteres = ["7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "C", "0", "=", "/"];

function createButton() {
  let button = document.querySelector("table");
  let html = '<tr>';

  let i = 0;
  caracteres.forEach(c => {
    if (i > 3) {
      html += '</tr><tr>';
      i = 0;
    }
    html += `<td><button onclick="${c === 'C' ? "clean()" : `insert('${c}')`}">${c}</button></td>`;
    i++;
  });
  html += '</tr>'


  button.innerHTML = html;
}

function insert(num) {
  document.querySelector("#resultado").value += num;
}

function clean() {
  document.querySelector("#resultado").value = "";
}

function operacao() {
  let resultado = document.querySelector("#resultado");
  if (resultado) {
    document.querySelector("#resultado").value = eval(resultado);
  } else {
    alert("Faça alguma operação!!");
  }
}