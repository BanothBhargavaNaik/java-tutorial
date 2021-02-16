/*
 bits and bytes computers hanmakonda.
faculty: p.sadashiv, ph: 9866129388 
*/
public class ChainedException extends Exception {
  private Throwable cause = null;

  public ChainedException() {
    super();
  }

  public ChainedException(String message) {
    super(message);
  }

  public ChainedException(String message, Throwable cause) {
      super(message);
      this.cause = cause;
  }
}
 