package springboot.socket.dto;

public class MessageDto {
  String message;
  String user;

  public MessageDto() {
  }

  public MessageDto(String message, String user) {
    this.message = message;
    this.user = user;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }
}
