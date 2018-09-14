import java.io.DataInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.net.ServerSocket;

import java.net.Socket;



public class MyServer extends Thread {

	

	private ServerSocket ss;

	

	public MyServer(int port) {

		try {

			ss = new ServerSocket(port);

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	

	public void run() {

		while (true) {

			try {

				Socket clientSock = ss.accept();

				saveFile(clientSock);

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

	}



	private void saveFile(Socket clientSock) throws IOException {

		DataInputStream dis = new DataInputStream(clientSock.getInputStream());

		FileOutputStream fos = new FileOutputStream("download2.jpg");

		byte[] buffer = new byte[4096];

		

		int filesize = 15123; // Send file size in separate msg

		int read = 0;

		int totalRead = 0;

		int remaining = filesize;

		while((read = dis.read(buffer, 0, Math.min(buffer.length, remaining))) > 0) {

			totalRead += read;

			remaining -= read;

			System.out.println("read " + totalRead + " bytes.");

			fos.write(buffer, 0, read);

		}

		

		fos.close();

		dis.close();

	}

	

	public static void main(String[] args) {

		MyServer fs = new MyServer(1550);

		fs.start();

	}



}