package snakeWithConfigFile.snakes;

public class CreateNewMap {

    public char[] createNewMap(char[] map, int mapLength ,char[] gameSnakes,int index){
        char[] newMap = new char[mapLength];
        int count=0;
        for (char element: map) {
            newMap[count] =element;
            count++;
        }
        for (char element: gameSnakes) {
            newMap[index] =element;
            index++;
        }
        return newMap;
    }
}
