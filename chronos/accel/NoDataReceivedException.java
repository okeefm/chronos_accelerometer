package chronos.accel;

import java.io.IOException;

public class NoDataReceivedException extends IOException {
    public NoDataReceivedException(String s) {
        super(s);
    }
}