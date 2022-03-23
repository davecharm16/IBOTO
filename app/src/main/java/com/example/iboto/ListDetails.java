package com.example.iboto;

import java.util.ArrayList;

public class ListDetails {
    public static ArrayList<Model> getLists(){
        ArrayList<Model> candidateLists = new ArrayList<>();
        candidateLists.add(new Model(R.drawable.abella_ernie, "1. Abella, Ernie"));
        candidateLists.add(new Model(R.drawable.leody, "2. De Guzman, Leody"));
        candidateLists.add(new Model(R.drawable.isko, "3. Domagoso, Isko Moreno"));
        candidateLists.add(new Model(R.drawable.noberto, "4. Gonzales, Norberto"));
        candidateLists.add(new Model(R.drawable.ping, "5. Lacson, Ping"));
        candidateLists.add(new Model(R.drawable.faisal, "6. Mangondato, Faisal"));
        candidateLists.add(new Model(R.drawable.bbm, "7. Marcos, Ferdinand Jr."));
        candidateLists.add(new Model(R.drawable.jose_m, "8. Montemayor, Jose"));
        candidateLists.add(new Model(R.drawable.pacquiao, "9. Pancquiao, Manny"));
        candidateLists.add(new Model(R.drawable.robredo, "10. Robredo, Leni"));


        return candidateLists;
    }
}
