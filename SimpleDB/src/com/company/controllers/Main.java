package com.company.controllers;


import com.company.models.Movie;
import com.company.views.CmdLineView;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       DBConnect db = new DBConnect("movies.db");
       db.createNewDatabase();
       db.addTables();

       /*db.addData("Star Wars", "1977", "PG");
       db.addData("CODA", "2021", "PG-13");
       db.addData("The Life of Emile Zola", "1937", "NR");
       db.addData("The Night House", "2021", "R");*/

       CmdLineView cmdLineView = new CmdLineView(db);
       cmdLineView.newEntry();

    }
}
