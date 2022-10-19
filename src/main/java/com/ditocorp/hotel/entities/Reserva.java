package com.ditocorp.hotel.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_reserva")
public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codCliente;
	private String numReserva;
	private Instant dataReserva;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Reserva() {
	}

	public Reserva(Long codCliente, String numReserva, Instant dataReserva, Cliente cliente) {
		super();
		this.codCliente = codCliente;
		this.numReserva = numReserva;
		this.dataReserva = dataReserva;
		this.cliente = cliente;
	}

	public Long getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Long codCliente) {
		this.codCliente = codCliente;
	}

	public String getNumReserva() {
		return numReserva;
	}

	public void setNumReserva(String numReserva) {
		this.numReserva = numReserva;
	}

	public Instant getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Instant dataReserva) {
		this.dataReserva = dataReserva;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(codCliente, other.codCliente);
	}

}
