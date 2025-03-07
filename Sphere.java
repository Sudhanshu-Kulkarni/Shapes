class Sphere extends Shape implements Volume{
    private double radius;
    public Sphere(double radius){
        super("Sphere");
        this.radius = radius;
    }

    public double calculateArea(){
        return (4 * Math.PI * radius * radius);
    }

    public double calculatePerimeter(){
        return(0);
    }
    public double calculateVolume(){
        return((4.0/3.0) * Math.PI * Math.pow(radius, 3));
    }

}
