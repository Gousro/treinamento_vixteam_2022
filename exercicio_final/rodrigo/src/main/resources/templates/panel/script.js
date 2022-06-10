function searchClient() {
  let nome = document.getElementById("search").value;
  const xhttp = new XMLHttpRequest();

  xhttp.onload = function () {
    if (this.responseText == "null") {
      document.getElementById("searchResult").textContent =
        "Cliente não encontrado.";
    } else {
      let r = JSON.parse(this.responseText);
      document.getElementById("searchResult").textContent = r.nome;
    }
  };

  xhttp.open("GET", "/search?fname=" + nome);
  xhttp.send();
}
