function createTag() {
  let calculadora = document.querySelector(".fundo");
  calculadora.innerHTML = `
   <div class="calculadora">
            <h1>Calculadora</h1>
            <p id="resultado"><strong>0</strong></p>
            <table>
              
            </table>
        </div>
`
}

let caracteres = ["7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "C", "0", "=", "/"];

function createButton() {
  let button = document.querySelector("table");
  let count = 0
  let html = '';

  for (let i = 0; i < 4; i++) {
    html = html + `
      <tr>
      </tr>
    `
    for (let i = 0; i < 4; i++) {
      html = html + `
      <td><button onclick="insert(${caracteres[count]})" >${caracteres[count]}</button></td>
      `
      count++;
    }
  }
  button.innerHTML = html;
}

function insert(num) {
  document.querySelector("#resultado").innerHTML = num;

}