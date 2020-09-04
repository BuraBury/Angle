enum Types {
    STRAIGHT_ANGLE(90),
    FULL_ANGLE(360),
    MAX_DEGREE(360),
    MAX_MIN_SEC_VALUE(60),
    HALF_ANGLE(180),
    SUM_TRIANGLE_ANGLES(180),
    MIN_DEGREE(0);

    int value;

    Types(int value) {
        this.value = value;
    }
}
