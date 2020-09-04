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
        return result;
    }

    static Angle div(Angle a1, Angle a2) {
        Angle result = new Angle();
        result.setDegree(a1.getDegree() / a2.getDegree());
        return result;
    }

    static Angle prod(Angle angle, int x) {
        Angle result = new Angle();
        result.setDegree(angle.getDegree() * x);
        return result;
    }

    static Angle quot(Angle angle, int x) {
        Angle result = new Angle();
        result.setDegree(angle.getDegree() / x);
        return result;
    }

    static Angle compl(Angle angle) {
        Angle result = new Angle();
        result.setDegree(Types.STRAIGHT_ANGLE.value - angle.getDegree());
        return result;
    }

    static Angle suppl(Angle angle) {
        Angle result = new Angle();
        result.setDegree(Types.HALF_ANGLE.value - angle.getDegree());
        return result;
    }

    static double getBaseAngle(Angle topAngle) {
        double result = (Types.SUM_TRIANGLE_ANGLES.value - topAngle.getDegree()) / 2.0;
        if (result > Types.MIN_DEGREE.value && result <= Types.FULL_ANGLE.value) {
            return result;
        } else {
            System.out.println("Wrong topAngle " + topAngle.getDegree());
            return 0.0;
        }
    }

    static double getTopAngle(Angle baseAngle) {
        double result = Types.SUM_TRIANGLE_ANGLES.value - (2.0 * baseAngle.getDegree());
        if (result > Types.MIN_DEGREE.value && result <= Types.FULL_ANGLE.value) {
            return result;
        } else {
            System.out.println("Wrong baseAngle " + baseAngle.getDegree());
            return 0.0;
        }
    }

    static String getAngles_isoscelesTriangle(double basis, double side) {
        Angle angle = new Angle();
        Angle angle2 = new Angle();
        angle.setOfSin(Math.sin(basis / side));
        angle2.setDegree((Types.SUM_TRIANGLE_ANGLES.value - angle.getDegree()) / 2.0);

        return angle.getDegree() + " " + angle2.getDegree();
    }


}
