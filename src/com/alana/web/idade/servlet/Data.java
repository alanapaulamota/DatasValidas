package com.alana.web.idade.servlet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	private byte dia;
	private byte mes;
	private short ano;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date hoje = new Date; //sdf.parse(data);
	String str = sdf.format(hoje);

	SimpleDateFormat A = new SimpleDateFormat("D");
	private byte diahj = (byte) Integer.parseInt(A.format(hoje));

	SimpleDateFormat B = new SimpleDateFormat("M");
	private byte meshj = (byte) Integer.parseInt(B.format(hoje));

	SimpleDateFormat C = new SimpleDateFormat("y");
	private short anohj = (short) Integer.parseInt(C.format(hoje));

	public Data(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public void setDia(int dia) {
		if (dia >= 1 && dia <= 31) {
			this.dia = (byte) dia;
		} else {
			throw new RuntimeException("O valor" + dia + "é inválido.");
		}
	}

	public void setMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (this.dia <= 31) {
					this.mes = (byte) mes;
				} else {
					throw new RuntimeException("O valor" + mes + "é inválido.");
				}
				break;
			case 04:
			case 6:
			case 9:
			case 11:
				if (this.dia <= 30) {
					this.mes = (byte) mes;
				} else {
					throw new RuntimeException("O valor" + mes + "é inválido.");
				}
				break;
			case 02:
				if (this.anohj % 4 == 0 && this.anohj % 100 != 0 && this.dia <= 29) {
					this.mes = (byte) mes;
				} else if (this.anohj % 4 != 0 && this.dia <= 28) {
					this.mes = (byte) mes;
				} else {
					throw new RuntimeException("O valor" + mes + "é inválido.");
				}
			}

		}
	}

	public void setAno(int ano) {
		if (ano >= 1900 && ano < this.anohj) {
			this.ano = (short) ano;
		} else if (ano == this.anohj) {
			if (this.mes == this.meshj && this.dia <= this.diahj) {
				this.ano = (short) ano;
			}
		} else {
			throw new RuntimeException("O valor" + ano + "é inválido.");
		}
	}

	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}