package home_work_4.dto;

public class Whatever implements Comparable<Whatever> {
    private String name;
    private int num;

    public Whatever(String name,int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {return name;}
    public int getNum() {return num;}

    public int compareTo (Whatever o){
        if (o == null){
            return 1;
        }
        return this.getName().compareTo(o.getName());
    }
}
