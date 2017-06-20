package io.vos.stun.protocol;

import java.net.InetAddress;

public interface ResponseHandler {

  void onQuest(byte[] messageData, InetAddress destAddress, int destPort);
  void onResponse(byte[] messageData, InetAddress destAddress, int destPort);
  void onIndication(byte[] messageData, InetAddress destAddress, int destPort);
  void onGet(byte[] messageData, InetAddress destAddress, int destPort);
  void onPut(byte[] messageData, InetAddress destAddress, int destPort);
  void onData(byte[] messageData, InetAddress destAddress, int destPort);

}
