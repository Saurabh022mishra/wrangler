public class TimeDuration extends Token {
  private final long millis;

  public TimeDuration(String value) {
    super(value);
    if (value.endsWith("ms")) {
      millis = (long)Double.parseDouble(value.replace("ms", ""));
    } else if (value.endsWith("s")) {
      millis = (long)(Double.parseDouble(value.replace("s", "")) * 1000);
    } else {
      millis = Long.parseLong(value); // default: ms
    }
  }

  public long getMillis() {
    return millis;
  }
}
