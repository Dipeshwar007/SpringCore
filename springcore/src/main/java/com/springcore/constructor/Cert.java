package com.springcore.constructor;

public class Cert {
	private String certificate;

	public Cert(String certificate) {
		super();
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Cert [certificate=" + certificate + "]";
	}
}
