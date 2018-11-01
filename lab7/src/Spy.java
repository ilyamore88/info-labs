public class Spy {
    public String name;
    private String realName;
    private int squad;

    private String getSpyInfo(){
        return ("\nName: " + this.name+"\nReal name: "+this.realName+"\nSquad: "+this.squad);
    }

    public void print(){
        System.out.println(this.getSpyInfo());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getSquad() {
        return squad;
    }

    public void setSquad(int squad) {
        this.squad = squad;
    }
}
