package Builders;

import Enums.Status;
import Model.Itens;
import Model.Pedidos;

import java.util.Date;

public class PedidosBuilder implements IBuilder{

    private int id_pedido;
    private String cliente_nome;
    private Itens itens;
    private Date data_pedido;
    private Status status;

    public PedidosBuilder(){

    }
    public PedidosBuilder(int id_pedido, String cliente_nome, Itens itens, Date data_pedido, Status status){
        this.id_pedido = id_pedido;
        this.cliente_nome = cliente_nome;
        this.itens = itens;
        this.data_pedido = data_pedido;
        this.status = status;
    }


    @Override
    public void setId_Pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    @Override
    public void setCliente_Nome(String cliente_nome) {
        this.cliente_nome = cliente_nome;
    }


    @Override
    public void setItens(Itens itens) {
        this.itens = itens;
    }

    @Override
    public void setData_Pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    public Pedidos getResult(){
        return new Pedidos(id_pedido, cliente_nome, itens, data_pedido, status);
    }

    public String toString(){
        return "Pedido: " + id_pedido + "Nome Cliente: " + cliente_nome + "Itens: " + itens + "Data: " + data_pedido +
                "Status: " + status;
    }
}
