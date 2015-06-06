package ro.neghina.parse.app;

import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseObject;
import org.parse4j.ParseQuery;
import org.parse4j.callback.FindCallback;
import org.parse4j.callback.GetCallback;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Parse.initialize(
                "23tYNTlSXx6fiW5OOOYUkbGK5SmYFUOhTc3w643c",
                "5MMA211zrPhgODDh1DbJIY8dPPTwMQkiW56cPfLZ"
        );

//        ParsePush push = new ParsePush();
//        push.setMessage("Mesaj din java");
//        push.setChannel("test");
//        try {
//            push.send();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

//        ParseObject gameScore = new ParseObject("GameScore");
//        gameScore.put("score", 1337);
//        gameScore.put("playerName", "Sean Plott");
//        gameScore.put("cheatMode", false);
//        try {
//            gameScore.save();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        ParseQuery<ParseObject> query = ParseQuery.getQuery("GameScore");
//        query.getInBackground("xWMyZ4YEGZ", new GetCallback<ParseObject>() {
//            public void done(ParseObject object, ParseException e) {
//                if (e == null) {
//                    System.out.printf(object.toString());
//                    // object will be your game score
//                } else {
//                    // something went wrong
//                    System.out.println(e.getMessage());
//                }
//            }
//        });

        ParseQuery<ParseObject> query = ParseQuery.getQuery("GameScore");
        query.whereEqualTo("channels", "e_lucianneghinaassistro");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> object, ParseException e) {
                if (e == null) {
                    // object will be your game score
                    System.out.println();
                } else {
                    // something went wrong
                    System.out.println(e.getMessage());
                }
            }
        });

        System.out.println("DONE");

    }

}
