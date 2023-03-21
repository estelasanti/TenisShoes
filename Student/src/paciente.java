public class paciente {
    private String name;
    private int age;
    private double height;
    private double weinght;
    private char sex;
    private String compoticion;
    public paciente(String name, int age, double height, double weuinght, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weinght = weuinght;
        this.sex = sex;
    }

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
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeinght() {
        return weinght;
    }
    public void setWeuinght(double weuinght) {
        this.weinght = weinght;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getCompoticion() {
        return compoticion;
    }

    public void setCompoticion(String compoticion) {
        this.compoticion = compoticion;
    }

    double imc(double weuinght, double height) {
        return  weuinght/(height * height);
    }
        public String compoticion(double imc) {
            if (imc < 18.5) {
                return "underweight";
            }
            if (imc >=18.5 && imc < 25){
                return "normal";
            }
            if (imc>=25&& imc<30){
                return "overweight";
            }
            else
            return "Obesity";
        }

    }


