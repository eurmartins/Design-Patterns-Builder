package Director;

import Builders.IBuilder;
import Enums.Status;
import Model.Itens;

import java.util.Date;

public class Director {

    public void ConstructPedido(IBuilder iBuilder){
        iBuilder.setId_Pedido(1);
        iBuilder.setCliente_Nome("Victor Martins");
        iBuilder.setItens( new Itens("Maquina de cortar o cabelo", 20, 25.90));
        iBuilder.setData_Pedido(new Date("17/01/2024"));
        iBuilder.setStatus(Status.NOVO);
    }
}
