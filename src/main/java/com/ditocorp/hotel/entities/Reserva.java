package com.ditocorp.hotel.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.ditocorp.hotel.entities.enums.ReservaStatus;

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

	private Integer reservaStatus;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Reserva() {
	}

	public Reserva(Long codCliente, String numReserva, Instant dataReserva, Cliente cliente,
			ReservaStatus reservaStatus) {
		super();
		this.codCliente = codCliente;
		this.numReserva = numReserva;
		this.dataReserva = dataReserva;
		this.cliente = cliente;
		setReservaStatus(reservaStatus);
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ReservaStatus getReservaStatus() {
		return ReservaStatus.valueOf(reservaStatus);
	}

	public void setReservaStatus(ReservaStatus reservaStatus) {
		if (reservaStatus != null) {
			this.reservaStatus = reservaStatus.getCode();
		}
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
