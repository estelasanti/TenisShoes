public class TestPaciente {
    public static void main(String[] args){
        double imc=0;
        paciente Mipasiente=new paciente(
                "Estela",
                46,
                1.49,
                60,
                'F');
        imc=Mipasiente.imc(Mipasiente.getWeinght(),Mipasiente.getHeight());
        System.out.println("hola " + Mipasiente.getName()+ "Tu IMC es: "+ imc);
        String compoticion = Mipasiente.compoticion(imc);
        System.out.println("compotition corporal es de: " + compoticion);
    }
}
