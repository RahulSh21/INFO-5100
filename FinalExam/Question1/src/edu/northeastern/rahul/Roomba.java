package edu.northeastern.rahul;

public class Roomba implements iRobot {

    int[][] direc = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    int[][] room;
    Direction dir;;
    int x=0;
    int y=0;

    Roomba(int[][] room){
        this.room = room;
        dir = Direction.DOWN;
    }

    @Override
    public boolean move() {
        int dirc = -1;
        if(dir == Direction.UP) dirc = 0;
        else if(dir == Direction.DOWN) dirc = 1;
        else if(dir == Direction.LEFT) dirc = 2;
        else if(dir == Direction.RIGHT) dirc = 3;

        int nextx = x + dir[dirc][0];
        int nexty = y + dir[dirc][1];

        if(nextx >= 0 && nextx < room.length && nexty >= 0 && nexty < room[0].length && room[nextx][nexty] != -1) {
            x = nextx;
            y = nexty;
            return true;
        }
        return false;
    }

    @Override
    public void turnLeft() {
        if(dir == Direction.DOWN) dir = Direction.RIGHT;
        else if(dir == Direction.RIGHT) dir = Direction.UP;
        else if(dir == Direction.UP) dir = Direction.LEFT;
        else if(dir == Direction.LEFT) dir = Direction.DOWN;
    }

    @Override
    public void turnRight() {
        if(dir == Direction.DOWN) dir = Direction.LEFT;
        else if(dir == Direction.LEFT) dir = Direction.UP;
        else if(dir == Direction.UP) dir = Direction.RIGHT;
        else if(dir == Direction.RIGHT) dir = Direction.DOWN;
    }

    @Override
    public void clean() {
        room[x][y] = 1;
    }
}
