package fr.btsciel.td_equations;

public class EqResoudre {
    public EqResoudre() {
    }

    private String pattern = "([-+]?[0-9][xX]? [-+/*] [0-9] [=] ([0-9]|[0-9][0-9]))";
    public String  resoudre (String equation) {

        return "Ok";
    }
    public boolean typeEquationOk (String equation) {
        return equation.matches(pattern);
    }
}

