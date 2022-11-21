package trainingqt.Snake;

public class SnakeGame {
    public static void main(String[] args) {
        //Initialize what we know
        String moveRight = "Right";
        String moveLeft = "Left";
        String questionText = "Give direction for" + moveRight + " or " + moveLeft;
        String successmsg = "Yes,Yes You WIN!";
        String badmsg = "You've lost!You can try again!";
        //Initialize configs for snake
        char[] map;
        int startPoint, mapLength, snakeLength;
        startPoint = 0;
        mapLength = 10;
        snakeLength = 2;
        char mapStructure, snakeStructure;
        mapStructure = '-';
        snakeStructure = '*';
        //Create Map
        map = new char[mapLength];
        for (int i = 0; i < mapLength; i++) {
            map[i] = mapStructure;
            //System.out.print(map[i] + " ");
        }

        //Snake Position(head)
        int snakeStart = startPoint;
        int snakeEnd = snakeStart + snakeLength;
        //Snake
        for (int i = snakeStart; i < snakeEnd; i++) {
            map[i] = snakeStructure;
        }
        System.out.print(map);
        //Snake e Map i vra
        public static char[] insertSnakeInMap(char[] map, char[] snake,int[] position){
            if(snake.length+position>map.length) System.out.println("PLS, take a look to map borders");
            for (int i=0;i<snake.length;i++){
                map[position]=snake[i];
                position++;
            }
            return map;
        }
        //Snake position gtnenq
        public static int findSnakePosition(char[]map){
            int firstPoint=-1;
            for (int i=0;i<map.length;i++){
                if (map[i]=='*'){
                    firstPoint=i;
                    break;
                }
            }
            return firstPoint;
        }
        //Araj tanenq snake in

        public static void moveForwardSnake(char[] map,int snake)




    }
}


