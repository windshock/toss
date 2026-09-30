package androidx.media3.datasource.cache;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import o.RecordingInputConnection_androidKt;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ReusableBufferedOutputStream extends BufferedOutputStream {
    private boolean onExtraCallbackWithResult;

    public ReusableBufferedOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public ReusableBufferedOutputStream(OutputStream outputStream, int i2) {
        super(outputStream, i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.onExtraCallbackWithResult = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1592849717, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{th}, -1592849708);
        }
    }

    public void onExtraCallbackWithResult(OutputStream outputStream) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.onExtraCallbackWithResult = false;
    }
}
