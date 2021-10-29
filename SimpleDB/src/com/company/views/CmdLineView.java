package com.company.views;

import com.company.controllers.DBConnect;
import com.company.models.Movie;

import java.util.*;
import java.io.*;

public class CmdLineView {

    DBConnect db;

    public CmdLineView(DBConnect db) {
        this.db = db;
    }

    public void newEntry() {

        boolean continu = true;

        while(continu) {
            String title;
            String releaseYear;
            String rating;

            Scanner in = new Scanner(System.in);

            System.out.println("Enter the title of the movie:");
            title = in.nextLine();
            System.out.println("Enter the release year:");
            releaseYear = in.nextLine();
            System.out.println("Enter the rating:");
            rating = in.nextLine();

            db.addData(title, releaseYear, rating);

            display();

            String cont;
            System.out.println("Continue? Y/N");
            cont = in.nextLine();
            if(cont.equals("N")) {
                continu = false;
            }
        }
    }

    public void display() {
        ArrayList<Movie> theMovies = db.getData();
        System.out.print("\n");
        for(Movie movie : theMovies) {
            System.out.println(movie.toString());
        }
        System.out.print("\n");
    }

}
