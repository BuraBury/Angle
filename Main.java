public class Main {
    public static void main(String[] args) {

        Angle angle1 = new Angle(45);
        Angle angle2 = new Angle(56, 5);
        Angle angle3 = new Angle(4, 5, 1);

        System.out.println("Metoda toString dla kąta 45: " + angle1.toString());
        System.out.println(angle1.getDegree() + " degrees");
        System.out.println(angle1.getRadian() + " radians");
        System.out.println();
        System.out.println("Wartości funkcji trygonometrycznych dla kąta 45");
        System.out.println(
                        "cos = " + TrygonometryCases.cos(angle1) + "\n" +
                        "sin = " + TrygonometryCases.sin(angle1) + "\n" +
                        "tan = " + TrygonometryCases.tan(angle1) + "\n" +
                        "cotan = " + TrygonometryCases.cotan(angle1) + "\n" +
                        "secans = " + TrygonometryCases.secans(angle1) + "\n" +
                        "cosecans = " + TrygonometryCases.cosecans(angle1));
        System.out.println();

        Angle angle4 = new Angle("105°30'15");
        System.out.println("Parametry kąta: " + angle4.toString());
        System.out.println(angle4.getDegree() + " degrees");
        System.out.println(angle4.getMinutes() + " minutes");
        System.out.println(angle4.getSeconds() + " seconds");
        System.out.println();

        angle1.setOfSin(0.7314);
        System.out.println("kąt dla sin 0.7314 = " + angle1.getDegree());
        angle1.setOfCos(0.6947);
        System.out.println("kąt dla cos 0.6947 = " + angle1.getDegree());
        angle1.setOfCotan(0.9004);
        System.out.println("kąt dla cotangens 0.9004 = " + angle1.getDegree());
        angle1.setOfTan(1);
        System.out.println("kąt dla tangens 1 = " + angle1.getDegree());

        System.out.println();
        Angle angle5 = new Angle(new Point(1, 2));
        System.out.println("kąt między osią OX, a punktem (1, 2) = " + angle5.toString());
        System.out.println();

        Angle angle6 = new Angle();
        angle6.setOfPoint(3, 0);
        System.out.println("kąt między osią OX, a pkt (3, 0) = " + angle6.toString());

        Angle angle7 = Angle.valueOf("100°20'5");
        System.out.println("obiek Angle utworzony za pomocą konstruktora z parametrem typu String = " + angle7.toString());

        System.out.println();
        Angle a = MathOperations.add(angle1, angle1);
        System.out.println("suma kątów " + angle1.getDegree() + " i " + angle1.getDegree() + " = " + a.toString());
        Angle b = MathOperations.diff(angle1, angle1);
        System.out.println("różnica kątów " + angle1.getDegree() + " i " + angle1.getDegree() + " = " + b.toString());

        try {
            Angle c = MathOperations.mult(angle1, angle3);
            assert c != null;
            System.out.println("iloczyn kątów " + angle1.getDegree() + " i " + angle3.getDegree() + " = " + c.toString());
        } catch (NullPointerException e) {
            System.out.println("Angle bigger than 360 or smaller than 0 degrees");
        }

        try {
            Angle d = MathOperations.div(angle1, angle3);
            assert d != null;
            System.out.println("iloraz kątów " + angle1.getDegree() + " i " + angle3.getDegree() + " = " + d.toString());
        } catch (NullPointerException e) {
            System.out.println("Angle bigger than 360 or smaller than 0 degrees");
        }

        System.out.println("Czy angle1(45) == angle2(56)? " + angle1.equals(angle2));
        Angle zet = new Angle(45);
        System.out.println("Czy angle1(45) == angle zet(45)? " + angle1.equals(zet));

        System.out.println("Iloraz " + angle1.getDegree() + " i " + zet.getDegree() + " = " + MathOperations.div(angle1, zet));
        System.out.println();

        Angle no = MathOperations.prod(angle1, 2);
        System.out.println("miara kąta na podstawie wartości " + angle1.getDegree() + " * " + 2 + " = " + no.toString());

        Angle on = MathOperations.quot(angle1, 1);
        System.out.println("miara kąta na podstawie " + angle1.getDegree() + " / " + 1 + " = " + on.toString());
        System.out.println();

        Angle right_angle = new Angle(Types.RIGHT_ANGLE.value);
        Angle full_angle = new Angle(Types.FULL_ANGLE.value);
        System.out.println("miara kąta prostego = " + right_angle.toString());
        System.out.println("miara kąta pełnego = " + full_angle.toString());
        System.out.println();

        Angle complAngle = MathOperations.compl(angle1);
        System.out.println("kąt uzupełniający do kąta " + angle1.getDegree() + " = " + complAngle.toString());
        System.out.println();

        Angle supplAngle = MathOperations.suppl(angle1);
        System.out.println("kąt przyległy do kąta " + angle1.getDegree() + " = " + supplAngle.toString());

        Angle angle = new Angle(90);
        System.out.println(TrygonometryCases.sin(angle));

        System.out.println(MathOperations.countAngleAtBase(angle));
        System.out.println(MathOperations.countAngleAtTop(angle));

    }


}
