public enum Commands {
  A("-a"),
  B("-b"),
  C("-c");

  private String value;

  Commands(String cmd) {
    this.value = cmd;
  }

  public String getValue() {
    return value;
  }
}
