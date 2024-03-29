package com.timbuchalka;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("jaws");
    }

    public String plot() {
        return "A shark eat lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attemp to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("start Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
    // NO plot method
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #"+i+
                       " : "+movie.getName()+"\n"+
                        "Plot: "+movie.plot()+"\n");
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random()*5)+1;
        System.out.println("Random Number generated was: "+randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
/*            default:
                return null;*/
        }
        return null;
    }
}
