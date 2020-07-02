package br.edu.unoesc.projetofinal.qchat.server;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class QServico {
	private ServerSocket socketServidor;
	private Socket socket;
	private Map<String, ObjectOutputStream> mapOnlines = new HashMap<String, ObjectOutputStream>();

}
