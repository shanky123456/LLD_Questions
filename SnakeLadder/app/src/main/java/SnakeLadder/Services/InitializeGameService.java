package SnakeLadder.Services;

import SnakeLadder.Entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitializeGameService {


    private Integer noOfPlayers;
    private Integer diceCapacity;
    private Integer sizeOfBoard;
    private Integer noOfSnake;
    private Integer noOfLadder;
    private Board board;
    private List <Player> players;
    private List <Snake> snakes;
    private List <Ladder> ladders;
    private RandomDiceStrategy dice;
    private List <Cell> cells;
    private Scanner sc;
    private Player winner;


    public InitializeGameService(Integer noOfPlayers, Integer diceCapacity, Integer sizeOfBoard, Integer noOfSnake, Integer noOfLadder, Scanner sc) {
        this.noOfPlayers = noOfPlayers;
        this.diceCapacity = diceCapacity;
        this.sizeOfBoard = sizeOfBoard;
        this.noOfSnake = noOfSnake;
        this.noOfLadder = noOfLadder;
        this.sc = sc;
    }

    public GameData initializeGame() {
        players = new ArrayList<Player>();
        snakes = new ArrayList<Snake>();
        ladders = new ArrayList<Ladder>();

//        dice = new RandomDiceStrategy(diceCapacity);
        DiceStrategy diceStrategy = new RandomDiceStrategy(diceCapacity);
        Dice dice = new Dice(diceStrategy);





        cells = new ArrayList<Cell>(sizeOfBoard + 1);
        for(int i = 0; i <= sizeOfBoard; i++) {
            Cell tempCell = new Cell(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
            cells.add(tempCell);
        }
        for (int i = 0; i < noOfPlayers; i++) {
            Player tempPlayer = new Player();
            System.out.println("Enter the name of the player");

            String tempPlayerName = sc.next();
            tempPlayer.setPlayerName(tempPlayerName);
            tempPlayer.setPlayerId(i + 1);
            tempPlayer.setCurrentCellNo(1);
            players.add(tempPlayer);
        }
        System.out.println("reached here");

        for (int i = 0; i < noOfSnake; i++) {
            System.out.println("Enter the head coordinate of the snake");

            Integer tempSnakeHead= sc.nextInt();
            System.out.println("Enter the tail coordinate of the snake");

            Integer tempSnakeTail = sc.nextInt();
            Snake snake = new Snake(tempSnakeHead, tempSnakeTail);

            cells.get(tempSnakeHead).getSnake().add(snake);
            snakes.add(snake);
        }

        for (int i = 0; i < noOfLadder; i++) {
            System.out.println("Enter the head coordinate of the ladder");

            Integer tempLadderHead= sc.nextInt();
            System.out.println("Enter the tail coordinate of the lader");

            Integer tempLadderTail = sc.nextInt();
            Ladder ladder = new Ladder(tempLadderHead, tempLadderTail);
            cells.get(tempLadderTail).getLadder().add(ladder);
            ladders.add(ladder);
        }

        board = new Board(sizeOfBoard, cells);
        GameData gameData = new GameData();
        gameData.setBoard(board);
        gameData.setDice(dice);
        gameData.setPlayers(players);
        return  gameData;
    }
}
