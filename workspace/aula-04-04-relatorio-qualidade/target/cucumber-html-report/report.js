$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("br/com/tt/calcular.feature");
formatter.feature({
  "id": "calcular",
  "description": "",
  "name": "Calcular",
  "keyword": "Funcionalidade",
  "line": 2,
  "comments": [
    {
      "value": "# language: pt",
      "line": 1
    }
  ]
});
formatter.before({
  "duration": 224700,
  "status": "passed"
});
formatter.scenario({
  "id": "calcular;soma",
  "description": "",
  "name": "Soma",
  "keyword": "Cenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "o primeiro valor \"5\" e o segundo valor \"3\"",
  "keyword": "Dado ",
  "line": 4
});
formatter.step({
  "name": "eu realizo a soma",
  "keyword": "Quando ",
  "line": 5
});
formatter.step({
  "name": "o resultado da soma \"8\"",
  "keyword": "Entao ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 18
    },
    {
      "val": "3",
      "offset": 40
    }
  ],
  "location": "CalcularTest.o_primeiro_valor_e_o_segundo_valor(Integer,Integer)"
});
formatter.result({
  "duration": 403636573,
  "status": "passed"
});
formatter.match({
  "location": "CalcularTest.eu_realizo_a_soma()"
});
formatter.result({
  "duration": 49933,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 21
    }
  ],
  "location": "CalcularTest.o_resultado_da_soma_(Integer)"
});
formatter.result({
  "duration": 3883081,
  "status": "passed"
});
});