package principal;
import java.util.Date;
public class Reserva {
	public enum StatusReserva {
        CONFIRMADA, PENDENTE
    }
	
	private int idReserva;
	private Date dataDaReserva;
	private Cliente cliente;
	private Viagem viagem;
	private Hotel hotel;
 private double valorTotal;
	 private String status;
	 
	
	 private static int proximoIdReserva = 1;
	
	public Reserva(int idReserva, Date dataDaReserva,
			Cliente cliente, Viagem viagem, Hotel hotel, double valorTotal, String status) {
		super();
		this.idReserva = idReserva;
		this.dataDaReserva = dataDaReserva;		
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.viagem = viagem;
		this.hotel = hotel;
		this.status = status;
	}
	public Reserva(Date dataDaReserva, double preco, double valorTotal, Cliente cliente, Viagem viagem, Hotel hotel, String status) {
		this.idReserva = proximoIdReserva++;
		this.dataDaReserva = dataDaReserva;
	    this.valorTotal = valorTotal;
	    this.cliente = cliente;
	    this.viagem = viagem;
	    this.hotel = hotel;
	    this.status = status;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public Date getDataDaReserva() {
		return dataDaReserva;
	}
	public void setDataDaReserva(Date dataDaReserva) {
		this.dataDaReserva = dataDaReserva;
	}


	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Viagem getViagem() {
		return viagem;
	}
	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}
	public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
 
   

}
