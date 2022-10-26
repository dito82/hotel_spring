package com.ditocorp.hotel.entities.enums;

public enum ReservaStatus {

	INDIVIDUAL(1), 
	CASAL(2), 
	GRUPO(3), 
	VIP(4);

	private int code;

	private ReservaStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static ReservaStatus valueOf(int code) {
		for (ReservaStatus value : ReservaStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Status Reserva Inválido");
	}

}
