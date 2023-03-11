import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Obstacle.Obstacle;
import Obstacle.Track;
import Obstacle.Wall;
import Runners.Cat;
import Runners.Human;
import Runners.Opponent;
import Runners.Robot;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Участники соревнований
        Human men1 = new Human("Петя   ", 1, 35, 4);
        Human men2 = new Human("Вася   ", 2, 25, 3);
        Cat cat1 = new Cat("Барсик ", 3, 10, 4);
        Cat cat2 = new Cat("Пушок  ", 4, 30, 4);
        Robot bot1 = new Robot("Алиса  ", 5, 15, 2);
        Robot bot2 = new Robot("Вертер ", 6, 40, 3);
        Robot bot3 = new Robot("Пылесос", 7, 5, 0);
        int run = 7;

        // Массив участников
        Opponent[] runners = new Opponent[run];
        runners[0] = men1;
        runners[1] = men2;
        runners[2] = cat1;
        runners[3] = cat2;
        runners[4] = bot1;
        runners[5] = bot2;
        runners[6] = bot3;

        // Препятствия
        Track track1 = new Track("Трасса 10 км/ч", 1, 10);
        Track track2 = new Track("Трасса 20 км/ч", 2, 20);
        Track track3 = new Track("Трасса 30 км/ч", 3, 30);
        Wall wall1 = new Wall("Барьер 1м", 1, 1);
        Wall wall2 = new Wall("Забор 2м ", 2, 2);
        Wall wall3 = new Wall("Стена 3м ", 3, 3);
        int wall = 6;

        // Массив препяствий 
        Obstacle[] warning = new Obstacle[wall];
        warning[0] = track1;
        warning[1] = track2;
        warning[2] = track3;
        warning[3] = wall1;
        warning[4] = wall2;
        warning[5] = wall3;

        Map<Opponent, StringBuilder> finish = new HashMap<Opponent, StringBuilder>();
        for (Opponent r : runners)
            finish.put(r, new StringBuilder());
        for (Opponent r : runners)
            finish.get(r).append(r.getName()).append("\t | ");

        StringBuilder sb = new StringBuilder();
        for (Opponent r : runners)
            sb.append(r.getName()).append(r.getNumber()).append("; ");



        ArrayList<Opponent> winners = new ArrayList<>();
        for(int i = 0; i < run; i++){
            winners.add(runners[i]);
        }


        ArrayList<Opponent> tempWinners = new ArrayList<>();


        for (Obstacle o : warning) {
            for (Opponent r : winners) {
                System.out.println((String.format("К препядствию №%s  %s  подошел %s.", o.getNumber(), o.getName(), r.getName())));                        
                boolean success = false;                
                success = o.done(r);               
                if (success) {
                    System.out.println(String.format("%s  %s", r.getName(), o.Good()));
                    tempWinners.add(r);
                    finish.get(r).append(" -> ").append(o.getName());
                } 
                else {
                    System.out.println(String.format("%s  %s", r.getName(), o.Bad())); 
                    finish.get(r).append(" -> ").append(" X ");
                }

            }
            winners = tempWinners;
            tempWinners = new ArrayList<Opponent>();
        }




        sb = new StringBuilder();
        for (Opponent w : winners)
            sb.append(w.getName()).append("; ");
        System.out.println("\nПобедители соревнования " +  ": " + sb);
            
        for (Opponent w : winners)
            finish.get(w).append("    ");
        System.out.println("\nФиниш ");
        for (Opponent m : runners) {
            System.out.println(finish.get(m).toString());
        }
        System.out.println("\n");
    }
}
