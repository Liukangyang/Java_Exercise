package CoreClass.src.Unchanged_Class;

public record Point (int x,int y){
    //构造检查
    public Point{
        if(x<0||y<0){
            throw new IllegalArgumentException("Illegal Arguments");
        }
    }
    //静态方法
    public static Point of(int x,int y){
        return new Point(x,y);
    }

}
