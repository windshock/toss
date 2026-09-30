package o;

import java.io.Closeable;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface dv81 extends Closeable {
    byte IAuthTabCallback();

    dv7 IAuthTabCallback(int i);

    String IAuthTabCallbackDefault();

    long IAuthTabCallbackStub();

    void asInterface();

    double onExtraCallback();

    int onExtraCallbackWithResult();

    void onExtraCallbackWithResult(int i);

    int onNavigationEvent();

    ObjectId onTransact();

    String onWarmupCompleted();

    void onWarmupCompleted(byte[] bArr);
}
