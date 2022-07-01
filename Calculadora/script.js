const caracteres = ["CE", "C", "<", "/", "7", "8", "9", "X", "4", "5", "6", "-", "1", "2", "3", "+", ".", "0", ",", "="];

function createTag() {
  let calculadora = document.querySelector(".fundo");
  calculadora.innerHTML = `
   <div class="calculadora">
    <h1>Calculadora</h1>
    <input id="resultado">
    <table></table>
   </div>`}


function createButton() {
  let button = document.querySelector("table");
  let html = '<tr>';

  let i = 0;
  caracteres.forEach(c => {
    if (i > 3) {
      html += '</tr><tr>';
      i = 0;
    }
    html += `<td><button onclick="${c === 'C' || c === "CE" ? "clean()" : `insert('${c}')`}">${c}</button></td>`;
    i++;
  });

  html += '</tr>'
  button.innerHTML = html;
}


function insert(num) {
  console.log(num);
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