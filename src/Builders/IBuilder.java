package Builders;

import Enums.Status;
import Model.Itens;

import java.util.Date;

public interface IBuilder {

    void setId_Pedido(int id_pedido);
    void setCliente_Nome(String cliente_nome);
    void setItens(Itens itens);
    void setData_Pedido(Date data_pedido);
    void setStatus(Status status);

}
