import Builders.PedidosBuilder;
import Director.Director;
import Model.Pedidos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        PedidosBuilder builder = new PedidosBuilder();
        director.ConstructPedido(builder);

        Pedidos pedidos = builder.getResult();
        System.out.println(pedidos.toString() + " - Pedido realizado com sucesso");

    }
}