abstract class MathOperations {

    static Angle add(Angle a1, Angle a2) {
        Angle result = new Angle();
        result.setDegree(a1.getDegree() + a2.getDegree());
        return result;
    }

    static Angle diff(Angle a1, Angle a2) {
        Angle result = new Angle();
        result.setDegree(a1.getDegree() - a2.getDegree());
        return result;
    }

    static Angle mult(Angle a1, Angle a2) {
        Angle result = new Angle();
        result.setDegree(a1.getDegree() * a2.getDegree());
        if (result.getDegree() >= 0 && result.getDegree() <= 360) {
            return result;
        }
        return null;
    }

    static Angle div(Angle a1, Angle a2) {
        Angle result = new Angle();
        result.setDegree(a1.getDegree() / a2.getDegree());
        if (result.getDegree() >= 0 && result.getDegree() <= 360) {
            return result;
        }
        return null;
    }

    static Angle prod(Angle angle, int x) {
        Angle result = new Angle();
        result.setDegree(angle.getDegree() * x);
        if (result.getDegree() > 360) {
            result.setDegree(0);
            System.out.println("Angle greater than 360");
        }
        return result;
    }

    static Angle quot(Angle angle, int x) {
        Angle result = new Angle();
        result.setDegree(angle.getDegree() / x);
        if (result.getDegree() < 0 || result.getDegree() > 360) {
            result.setDegree(0);
            System.out.println("Error with angle");
        }
        return result;
    }

    static Angle compl(Angle angle) {
        Angle result = new Angle();
        result.setDegree(Types.RIGHT_ANGLE.value - angle.getDegree());
        return result;
    }

    static Angle suppl(Angle angle) {
        Angle result = new Angle();

        result.setDegree(Types.HALF_ANGLE.value - angle.getDegree());
        return result;
    }

    static double countAngleAtBase(Angle angle) {
        double result = (180.0 - angle.getDegree()) / 2.0;
        if (result > 0) {
            return result;
        } else {
            return 0.0;
        }
    }

    static double countAngleAtTop(Angle angle) {
        double result = 180.0 - (angle.getDegree() * 2);
        if (result > 0) {
            return result;
        } else {
            return 0.0;
        }
    }


}
