abstract class Gift {
    public abstract void buy();

    public abstract void give(String name);
}

class Postcard extends Gift {
    private String wish;

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    @Override
    public void buy() {
        System.out.println("Postcard has been bought");
    }

    @Override
    public void give(String name) {
        System.out.println(this.wish + ", " + name);
    }
}

class Painting extends Gift {
    private String title;
    private String author;

    @Override
    public void buy() {
        System.out.println("Painting has been bought");
    }

    @Override
    public void give(String name) {
        System.out.println("Painting give to " + name);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

public class GiftSharing {
    public static void main(String[] args) {
        Postcard ps = new Postcard();
        ps.buy();
        ps.setWish("With best regards");
        ps.give("Ilya");
        Painting painting = new Painting();
        painting.setAuthor("Ilya Repin");
        painting.setTitle("Ivan the Terrible and His Son Ivan");
        painting.buy();
        painting.give("Ilya");
    }
}
