public class TenisShoes {

    //se definen los atributos
    private String name;
    private int age;
    private char sex;
    private String mark;
    private byte size; 
    private String color;
    private int amount;

    //se define el constructor parametrizado
    public TenisShoes(String name, int age, char sex, String mark, byte size, String color, int amount) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mark = mark;
        this.size = size;
        this.color = color;
        this.amount = amount;
    }
    //se definen los getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public byte getSize() {
        return size;
                                                                    }
    public void setSize(byte size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String toString(){
        System.out.println("los datos de la persona son");
        System.out.println("nombre: " + getName());
        System.out.println("sexo " + getSex());
        System.out.println("edad:"+ getAge());
        System.out.println("talla:"+getSize());
        System.out.println("cantidad:" + getAmount());
        System.out.println("marca:" + getMark());
        System.out.println("color: " + getColor());
        return "";
    }
}
