import java.lang.*;
import java.util.Objects;

class Angle extends MathOperations implements TrigonometricCases {

    //parametr wymagany
    private double degree;

    //parametry opcjonalne
    private int minutes;
    private int seconds;

    private Angle(AngleBuilder builder) {
        this.degree = builder.degree;
        this.minutes = builder.minutes;
        this.seconds = builder.seconds;
    }

    public Angle(String input) {
        input = input.replace("°", " ");
        input = input.replace("'", " ");
        input = input.replace("\"", " ");

        String[] a = input.split(" ");
        double degree = Integer.parseInt(a[0]);
        int minutes = Integer.parseInt(a[1]);
        int seconds = Integer.parseInt(a[2]);

        if (checkValues(degree, minutes, seconds)) {
            this.degree = degree;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            setAllDefault();
        }
    }

    public Angle(Point point) {
        this.degree = Math.toDegrees(Math.atan2(point.getX(), point.getY()));
    }

    double getDegree() {
        return degree;
    }

    void setDegree(double degree) {
        if (checkValues(degree)) {
            this.degree = degree;
        } else {
            setAllDefault();
        }
    }

    private boolean checkValues(double degree, int minutes, int seconds) {
        return degree >= Types.MIN_DEGREE.value && degree <= Types.MAX_DEGREE.value
                && minutes >= Types.MIN_DEGREE.value && minutes <= Types.MAX_MIN_SEC_VALUE.value
                && seconds >= Types.MIN_DEGREE.value && seconds <= Types.MAX_MIN_SEC_VALUE.value;
    }

    private boolean checkValues(double degree, int minutes) {
        return degree >= Types.MIN_DEGREE.value && degree <= Types.MAX_DEGREE.value
                && minutes >= Types.MIN_DEGREE.value && minutes <= Types.MAX_MIN_SEC_VALUE.value;
    }

    private boolean checkValues(double degree) {
        return degree >= Types.MIN_DEGREE.value && degree <= Types.MAX_DEGREE.value;
    }

    private void setAllDefault() {
        this.degree = Types.MIN_DEGREE.value;
        this.minutes = Types.MIN_DEGREE.value;
        this.seconds = Types.MIN_DEGREE.value;
    }

    int getMinutes() {
        return minutes;
    }

    int getSeconds() {
        return seconds;
    }

    double getRadian() {
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

    static Angle valueOf(double degree) {
        return new Angle.AngleBuilder(degree).build();
    }

    static Angle valueOf(double degree, int minutes) {
        return new Angle.AngleBuilder(degree).setMinutes(minutes).build();
    }

    static Angle valueOf(double degree, int minutes, int seconds) {
        return new Angle.AngleBuilder(degree).setMinutes(minutes).setSeconds(seconds).build();
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

    static class AngleBuilder {
        private double degree;
        private int minutes;
        private int seconds;

        public AngleBuilder(double degree) {
            if (checkValues(degree)) {
                this.degree = degree;
            } else {
                setAllDefault();
            }
        }

        public AngleBuilder setMinutes(int minutes) {
            if (checkValues(minutes)) {
                this.minutes = minutes;
            } else {
                setAllDefault();
            }
            return this;
        }

        public AngleBuilder setSeconds(int seconds) {
            if (checkValues(seconds)) {
                this.seconds = seconds;
            } else {
                setAllDefault();
            }
            return this;
        }

        public Angle build() {
            return new Angle(this);
        }

        private boolean checkValues(int value) {
            return value >= Types.MIN_DEGREE.value && value <= Types.MAX_MIN_SEC_VALUE.value;
        }

        private boolean checkValues(double degree) {
            return degree >= Types.MIN_DEGREE.value && degree <= Types.MAX_DEGREE.value;
        }

        private void setAllDefault() {
            this.degree = Types.MIN_DEGREE.value;
            this.minutes = Types.MIN_DEGREE.value;
            this.seconds = Types.MIN_DEGREE.value;
        }
    }
}


