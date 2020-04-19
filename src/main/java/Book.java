public class Book {
    private String name;
    private String author;
    private int buyPrice;
    private int yearOfIssue;
/*CONSTRUCTOR
* первый конструктор неполный для использования сеттеров*/

    public Book(String name){
        this.name=name;
    }

    public Book(String name, String author) {
        this.name=name;
        this.author=author;
    }
    public Book(String name, String author, int bp, int er){
        this.author=author;
        this.name=name;
        this.buyPrice=bp;
        this.yearOfIssue=er;
    }
/*из-за приватных методов мы получаем доступ через
сеттеры и геттеры
вся эта длинная хератень называется ИНКАПСУЛЯЦИЯ
* */
    public void setName(String n) {
        name = n;
    }
    public void setAuthor(String a) {
    author=a;
    }
    public void setBuyPrice(int bPrice) {
        if(bPrice<=0) {
            System.out.println("buying price must be positive");
            buyPrice = 1;
        }else {
            buyPrice=bPrice;
        }
    }
    public void setYearOfIssue(int year){
        if(year>2020||year<1950){
            System.out.println("Year is wrong");
            yearOfIssue=1950;
        } else {
            yearOfIssue=year;
        }
    }
    public String getName() {
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getBuyPrice(){
        return buyPrice;
    }
    public int getYearOfIssue(){
        return yearOfIssue;
    }


}


