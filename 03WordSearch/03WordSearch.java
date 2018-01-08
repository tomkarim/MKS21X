import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] data;
    private ArrayList<String> wordsToAdd = new ArrayList<string>();
    private ArrayList<String> wordsAdded = new ArrayList<String>();
    private int rows;
    private int cols;
    private Random rng;
    private char[][] solution;

    public WordSearch(int rows, int cols, String fileName) {
        data = new char[rows][cols];
        clear();
        wordsToAdd = new ArrayList<String>();
        int seed = (int) (Math.random() * 1000);
        rng = new Random(seed);
        try {
            Scanner in = new Scanner(new File(fileName));
            while (in.hasNext()) {
                String caps = in.next().toUpperCase();
                wordsToAdd.add(caps);
            }
        } catch (fileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        }
        addWords();
        fill();
    }

    private boolean addWords() {
        for int(i = 0; i<wordsToAdd.size (); i++){
            String word = wordsToAdd.get(i);
            boolean stop = false;
        }
    }


    }
