enum Types {
    RIGHT_ANGLE(90),
    STRAIGHT_ANGLE(90),
    FULL_ANGLE(360),
    HALF_ANGLE(180),
    RADIAN(1),
    DEGREE(1),
    ARCMINUTE(1),
    ARCSECOND(1);

    int value;

    Types(int value) {
        this.value = value;
    }
}
