package o;

import java.io.IOException;
import okhttp3.Request;
import okio.Timeout;
import retrofit2.Response;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getSignPrikeyCCFBPHFilename<T> extends Cloneable {
    void cancel();

    getSignPrikeyCCFBPHFilename<T> clone();

    void enqueue(getSignPrikeyCCFPHFilename<T> getsignprikeyccfphfilename);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    Timeout timeout();
}
