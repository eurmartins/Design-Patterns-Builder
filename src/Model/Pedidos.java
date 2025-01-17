package Model;

import Enums.Status;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedidos {

    private int id_pedido;
    private String cliente_nome;
    private Itens itens;
    private Date data_pedido;
    private Status status;

    public Pedidos(){
    }

    public Pedidos(int id_pedido, String cliente_nome, Itens itens, Date data_pedido, Status status){
        this.id_pedido = id_pedido;
        this.cliente_nome = cliente_nome;
        this.itens = itens;
        this.data_pedido = data_pedido;
        this.status = status;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public String getCliente_nome() {
        return cliente_nome;
    }

    public Itens getItens() {
        return itens;
    }

    public Date getData_pedido() {
        return data_pedido;
    }

    public Status getStatus() {
        return status;
    }

    public String getDataPedidoFormatado() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return data_pedido != null ? sdf.format(data_pedido) : "Data não definida";
    }

    public String toString(){
        return "Pedido: " + id_pedido + " Nome Cliente: " + cliente_nome + " Itens: " + itens + " Data: " + data_pedido +
                " Status: " + status;
    }
}
