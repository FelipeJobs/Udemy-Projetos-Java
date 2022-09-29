import java.util.*;
class Cliente{
    public String cpf;
    public String nome;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf) && Objects.equals(nome, cliente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome);
    }

    @Override
    public String toString() {
        return cpf + " | " + nome;
    }}
public class TestandoCole {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("754.856.869-88", "Valdinei Santos");
        Cliente c2 = new Cliente("828.929.222.12", "Claire Moura");
        Cliente c3 = new Cliente("156.565.556-88", "Vagner Seller");

        Object Hashtable;
        Hashtable<Integer,Cliente> ht = new Hashtable<>();
        ht.put(1,c1);
        ht.put(2, c2);
        ht.put(3, c3);

        System.out.println("CPF \t\t        Cliente");
        for (int i = 1; i <= ht.size(); i++) {
            System.out.println(ht.get(i));
        }

    }}












