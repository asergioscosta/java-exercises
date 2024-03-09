public class EmpregadoTeste {

    public static void main(String[] args) {
        Empregado e1 = new Empregado ("Augusto","Sérgio", 3768.90);
        Empregado e2 = new Empregado ("Marcia", "Costa", 5876.88);

        System.out.println ("O salário total do funcionário " + e1.getNome() + " é " + e1.getSalarioMensal() * 12);
        System.out.println ("O salário total da funcionária " + e2.getNome() + " é " + e2.getSalarioMensal() * 12);

        e1.aumento();
        e2.aumento();

        System.out.println ("O salário total do funcionário " + e1.getNome() + " com aumento é " + e1.getSalarioMensal() * 12);
        System.out.println ("O salário total da funcionária " + e2.getNome() + " com aumento é " + e2.getSalarioMensal() * 12);
    }
}
