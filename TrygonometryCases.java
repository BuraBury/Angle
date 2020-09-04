public interface TrygonometryCases {

    static double sin(Angle angle) { return Math.sin(Math.toRadians(angle.getDegree())); }

    static double cos(Angle angle) { return Math.cos(Math.toRadians(angle.getDegree())); }

    static double tan(Angle angle) { return Math.tan(Math.toRadians(angle.getDegree())); }

    static double cotan(Angle angle) { return 1.0 / Math.tan(Math.toRadians(angle.getDegree())); }

    static double secans(Angle angle) { return 1.0 / cos(angle); }

    static double cosecans(Angle angle) { return 1.0 / sin(angle); }

}
