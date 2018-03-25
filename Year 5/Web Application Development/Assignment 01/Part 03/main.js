window.onload = function() {
  log("Player 1, it's your turn!");
  turn = 1;
  var tbl = document.getElementById("table");
      for (var i = 0; i < tbl.rows.length; i++) {
          for (var j = 0; j < tbl.rows[i].cells.length; j++) {
            tbl.rows[i].cells[j].onclick = (function (i, j) {
                return function () {

                  if (turn == 1){
                    turn = 2;
                    if (turnX(i,j)){
                      clear();
                    }
                } else {
                    turn = 1;
                    if (turnO(i,j)){
                      clear();
                    }
                  }
                }

            }(i, j));
  }
}
};

function turnX(i,j){
  var tbl = document.getElementById("table");
  tbl.rows[i].cells[j].innerHTML = "X";
  tbl.rows[i].cells[j].onclick = false;
  if(check()){
    log("Player 1 Wins!")
    return 1;
  } else {
    log("Player 2, it's your turn!")
  }
};

function turnO(i,j){
  var tbl = document.getElementById("table");
  tbl.rows[i].cells[j].innerHTML = "O";
  tbl.rows[i].cells[j].onclick = false;
  if(check()){
    log("Player 2 Wins!")
    return 1;
  } else {
    log("Player 1, it's your turn!")
  }

};

//MAKE BETTER IF TIME PERMITS

function check(){
  var tbl = document.getElementById("table");
  if (tbl.rows[0].cells[0].innerHTML == "X" && tbl.rows[0].cells[1].innerHTML == "X" && tbl.rows[0].cells[2].innerHTML == "X"
|| tbl.rows[1].cells[0].innerHTML == "X" && tbl.rows[1].cells[1].innerHTML == "X" && tbl.rows[1].cells[2].innerHTML == "X"
|| tbl.rows[2].cells[0].innerHTML == "X" && tbl.rows[2].cells[1].innerHTML == "X" && tbl.rows[2].cells[2].innerHTML == "X"
|| tbl.rows[0].cells[0].innerHTML == "X" && tbl.rows[1].cells[0].innerHTML == "X" && tbl.rows[2].cells[0].innerHTML == "X"
|| tbl.rows[0].cells[1].innerHTML == "X" && tbl.rows[1].cells[1].innerHTML == "X" && tbl.rows[2].cells[1].innerHTML == "X"
|| tbl.rows[0].cells[2].innerHTML == "X" && tbl.rows[1].cells[2].innerHTML == "X" && tbl.rows[2].cells[2].innerHTML == "X"
|| tbl.rows[0].cells[0].innerHTML == "X" && tbl.rows[1].cells[1].innerHTML == "X" && tbl.rows[2].cells[2].innerHTML == "X"
|| tbl.rows[0].cells[2].innerHTML == "X" && tbl.rows[1].cells[1].innerHTML == "X" && tbl.rows[2].cells[0].innerHTML == "X"
)
{
  return 1;
}
else if(tbl.rows[0].cells[0].innerHTML == "O" && tbl.rows[0].cells[1].innerHTML == "O" && tbl.rows[0].cells[2].innerHTML == "O"
|| tbl.rows[1].cells[0].innerHTML == "O" && tbl.rows[1].cells[1].innerHTML == "O" && tbl.rows[1].cells[2].innerHTML == "O"
|| tbl.rows[2].cells[0].innerHTML == "O" && tbl.rows[2].cells[1].innerHTML == "O" && tbl.rows[2].cells[2].innerHTML == "O"
|| tbl.rows[0].cells[0].innerHTML == "O" && tbl.rows[1].cells[0].innerHTML == "O" && tbl.rows[2].cells[0].innerHTML == "O"
|| tbl.rows[0].cells[1].innerHTML == "O" && tbl.rows[1].cells[1].innerHTML == "O" && tbl.rows[2].cells[1].innerHTML == "O"
|| tbl.rows[0].cells[2].innerHTML == "O" && tbl.rows[1].cells[2].innerHTML == "O" && tbl.rows[2].cells[2].innerHTML == "O"
|| tbl.rows[0].cells[0].innerHTML == "O" && tbl.rows[1].cells[1].innerHTML == "O" && tbl.rows[2].cells[2].innerHTML == "O"
|| tbl.rows[0].cells[2].innerHTML == "O" && tbl.rows[1].cells[1].innerHTML == "O" && tbl.rows[2].cells[0].innerHTML == "O"
)
{
  return 1;
}

};

function clear(){
  var tbl = document.getElementById("table");
  tbl.style.display = 'none';

}

function log(message) {
  var div = document.getElementById('messages');
  div.innerHTML = '<div>' + message + '</div>';
};
