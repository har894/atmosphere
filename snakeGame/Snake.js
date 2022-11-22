import fs from "fs";

class Snake {
  static config = {};
  static init() {
    const text = fs.readFileSync("config.txt", "utf8");
    text.split("\n").forEach((v) => {
      const [key, value] = v.split("=");
      Snake.config[key] = value;
    });
  }

  static draw() {
    let board = Array(Number(Snake.config.board))
      .fill(" ")
      .map((_, i) => ({ value: " ", x: i, isSnake: false, isBoard: false }));

    board[0].isBoard = true;
    board[board.length - 1].isBoard = true;

    let centerIndex = Math.floor(board.length / 2);

    for (let i = 0; i < Snake.config.snake; i++) {
      if (board[centerIndex].x === centerIndex) {
        board[centerIndex].isSnake = true;
      }
      centerIndex++;
    }
    const snake = board.map(v => v.isSnake && v).filter(v=>v)
    
    process.stdin.on("keypress", (str, key) => {
      if ([Snake.config.right, Snake.config.left].includes(key.name)) {
        const index = board.map((v) => v.value).indexOf("*");
        if (key.name === Snake.config.left) {
            snake.forEach((v) => {
            v.x--
          });
          for(let i = 0;i<snake.length;i++) {
            
                // console.log(cell,snake[i])
                const coor=snake[i].x
                board[coor].isSnake = true
               
            
          }
          
        } else if (key.name === Snake.config.right) {
        //   console.log(index);
        }
      } else {
        console.log(Snake.config.warning);
      }
    });
    return board
      .map((v) => {
        if (v.isSnake) {
          return "*";
        } else if (v.isBoard) {
          return "|";
        } else {
          return " ";
        }
      })
      .join("");
  }
}

export default Snake;
