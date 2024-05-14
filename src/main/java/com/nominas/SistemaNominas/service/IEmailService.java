package com.nominas.SistemaNominas.service;

import com.nominas.SistemaNominas.model.EmailDTO;

public interface IEmailService {
    void enviarCorreo(EmailDTO correoRequest);
}
