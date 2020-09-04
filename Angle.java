import java.lang.*;
import java.util.Objects;

class Angle extends MathOperations implements TrygonometryCases {

    private final double MAX_DEGREE = Types.FULL_ANGLE.value;
    private final int MAX_MIN_SEC_VALUE = 60 * Types.ARCMINUTE.value;
    private final int MIN_DEGREE = 0;

    private double degree;
    private int minutes;
    private int seconds;

    public Angle() {
        this.degree = MIN_DEGREE;
    }

    public Angle(double degree) {
        if (degree >= MIN_DEGREE && degree <= MAX_DEGREE) {
            this.degree = degree;
        } else {
            this.degree = MIN_DEGREE;
        }
    }

    public Angle(double degree, int minutes) {
        if (degree >= MIN_DEGREE && degree <= MAX_DEGREE
                && minutes >= MIN_DEGREE && minutes <= MAX_MIN_SEC_VALUE) {
            this.degree = degree;
            this.minutes = minutes;
        } else {
            this.degree = MIN_DEGREE;
            this.minutes = MIN_DEGREE;
        }
    }

    public Angle(double degree, int minutes, int seconds) {
        if (degree >= MIN_DEGREE && degree <= MAX_DEGREE
                && minutes >= MIN_DEGREE && minutes <= MAX_MIN_SEC_VALUE
                && seconds >= MIN_DEGREE && seconds <= MAX_MIN_SEC_VALUE) {
            this.degree = degree;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            this.degree = MIN_DEGREE;
            this.minutes = MIN_DEGREE;
            this.seconds = MIN_DEGREE;
        }
    }

    public Angle(String input) {
        input = input.replace("°", " ");
        input = input.replace("'", " ");
        input = input.replace("\"", " ");

        String[] a = input.split(" ");
        this.degree = Integer.parseInt(a[0]);
        this.minutes = Integer.parseInt(a[1]);
        this.seconds = Integer.parseInt(a[2]);
    }

    public Angle(Point point) {
        this.degree = Math.toDegrees(Math.atan2(point.getX(), point.getY()));
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public double getRadian() {
        return Math.toRadians(degree);
    }

    void setOfSin(double sinValue) {
        this.degree = Math.toDegrees(Math.asin(sinValue));
    }

    void setOfCos(double cosValue) {
        this.degree = Math.toDegrees(Math.acos(cosValue));
    }

    void setOfTan(double tanValue) {
        this.degree = Math.toDegrees(Math.atan(tanValue));
    }

    void setOfCotan(double cotanValue) {
        this.degree = Math.toDegrees(Math.atan(1.0 / cotanValue));
    }

    void setOfPoint(int x, int y) {
        Point point = new Point(x, y);
        this.degree = Math.toDegrees(Math.atan2(point.getY(), point.getX()));
    }

    static Angle valueOf(double degree) { return new Angle(degree); }

    static Angle valueOf(double degree, int minutes) {
        return new Angle(degree, minutes);
    }

    static Angle valueOf(double degree, int minutes, int seconds) {
        return new Angle(degree, minutes, seconds);
    }

    static Angle valueOf(String input) {
        return new Angle(input);
    }

    @Override
    public String toString() {
        return String.format("%s%s", String.format("%d", (int) degree), "°" + minutes + "'" + seconds + "\"");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Angle angle = (Angle) o;
        return Double.compare(angle.getDegree(), getDegree()) == 0 &&
                getMinutes() == angle.getMinutes() &&
                getSeconds() == angle.getSeconds();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDegree(), getMinutes(), getSeconds());
    }
}
