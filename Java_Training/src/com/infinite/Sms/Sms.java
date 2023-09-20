package com.infinite.Sms;
import java.io.*;
import java.util.*;
import javax.comm.*;


public class Sms {
	 private Enumeration portList;
	    private CommPortIdentifier portId;
	    private String messageString = "Hello, World!";
	    private SerialPort serialPort;
	    private OutputStream outputStream;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   
		    public static void main(String[] args) {
		        SMS sms = new SMS();
		        sms.sendSMS("+1234567890", "Hello, World!");
		    }

		    public void sendSMS(String phoneNumber, String message) {
		        try {
		            portList = CommPortIdentifier.getPortIdentifiers();

		            while (portList.hasMoreElements()) {
		                portId = (CommPortIdentifier) portList.nextElement();
		                if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
		                    if (portId.getName().equals("COM1")) {
		                        serialPort = (SerialPort) portId.open("SMS", 2000);
		                        outputStream = serialPort.getOutputStream();
		                        serialPort.setSerialPortParams(115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

		                        String initCommand = "ATZ\r\n";
		                        String connectCommand = "AT+CMGF=1\r\n";
		                        String phoneNumberCommand = "AT+CMGS=\"" + phoneNumber + "\"\r\n";

		                        outputStream.write(initCommand.getBytes());
		                        Thread.sleep(1000);
		                        outputStream.write(connectCommand.getBytes());
		                        Thread.sleep(1000);
		                        outputStream.write(phoneNumberCommand.getBytes());
		                        Thread.sleep(1000);
		                        outputStream.write(message.getBytes());
		                        outputStream.write(26);
		                        Thread.sleep(5000);

		                        outputStream.close();
		                        serialPort.close();
		                        break;
		                    }
		                }
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		}           


