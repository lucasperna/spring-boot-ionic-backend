package com.giga.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.giga.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
