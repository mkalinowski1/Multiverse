class WalkParameters {
    public int startX;
    public int startY;
    public char startOrientation;
    public String moves;

    public WalkParameters(final int startX, final int startY, final char startOrientation, final String moves) {
        this.startX = startX;
        this.startY = startY;
        this.startOrientation = startOrientation;
        this.moves = moves;
    }
};