class EquilateralPyramid extends Shape implements Volume{
    private double baseSide, height;
    public EquilateralPyramid(double baseSide, double height){
        super("EquilateralPyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

}
