package fr.btsciel.td_equations;

public class EqResoudre {
    public EqResoudre() {
    }

    private String pattern = "[-+]?[0-9][xX]? [-+/*] [0-9] [=] [0-9][0-9]?";
    public String  resoudre (String equation) {
        String [] tab =  equation.split(" ");
        double a;
        String ax = tab[0].replaceAll("X","x");
        if (ax.equals("x")) {
            a = 1;
        } else if (ax.equals("-x")) {
            a = -1;
        } else {
            a = Double.parseDouble(ax.replaceAll("x",""));
        }
        String operation = tab[1];
        double b = Double.parseDouble(tab[2]);
        double c = Double.parseDouble(tab[4]);
        double resultat;
        switch (operation) {
            case "+":

        }

        return "ok";
    }
    public boolean typeEquationOk (String equation) {
        return equation.matches(pattern);
    }
}

