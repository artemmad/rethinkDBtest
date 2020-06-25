package ru.realityfamily;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;


public class Main {

    public static final RethinkDB r = RethinkDB.r;

    public static void main(String[] args) {
	// write your code here

        Connection conn = r.connection().hostname("77.50.7.230").port(32769).connect();


        Cursor cursor = r.table("authors").changes().run(conn);
        for (Object doc : cursor) {
            System.out.println(doc);
        }
    }
}
