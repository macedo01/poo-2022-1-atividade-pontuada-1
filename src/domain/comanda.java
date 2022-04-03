package domain;


//Toda comanda possui um número, uma lista de itens que foram pedidos,
// com a correspondente quantidade solicitada, e a qual mesa a comanda se refere.
// É necessário controlar também a situação da comanda (aberta ou fechada).
// As comandas fechadas não podem mais receber itens. É necessário também armazenar na comanda a quantidade de clientes que estão na mesa, para que,
// ao fechar a comanda, o sistema possa calcular o valor a ser pago por cliente, caso estes desejem ratear o pagamento.

import java.util.ArrayList;

public class comanda {

    private int numero;
    private String situacao;
    ArrayList<item> itensPedidos = new ArrayList<item>();
    
}
