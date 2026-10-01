package o;

import j$.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import net.sf.scuba.smartcards.BuildConfig;
import org.xbill.DNS.Rcode;
import org.xbill.DNS.Resolver;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getColumnIndex implements Resolver {
    private static final AppSetIdAndScope1 IAuthTabCallbackDefault = ea10.onWarmupCompleted(getColumnIndex.class);
    protected final dy7 IAuthTabCallback;
    protected String asBinder;
    protected Duration onExtraCallback;
    protected fby10 onExtraCallbackWithResult;
    protected Executor onNavigationEvent;
    protected boolean onTransact;
    protected lt42 onWarmupCompleted;

    protected abstract <T> CompletableFuture<T> onExtraCallbackWithResult(Throwable th);

    long onExtraCallback() {
        return System.nanoTime();
    }

    public void IAuthTabCallback(Duration duration) {
        this.onExtraCallback = duration;
    }

    public Duration onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    protected String onNavigationEvent(byte[] bArr) {
        String str = this.asBinder;
        if (this.onTransact) {
            return str;
        }
        return str + "?dns=" + UST_TRANS_ImportCert.onWarmupCompleted(bArr, true);
    }

    protected onChildViewAdded IAuthTabCallback(onChildViewAdded onchildviewadded) {
        onChildViewAdded onchildviewaddedOnExtraCallbackWithResult = onchildviewadded.onExtraCallbackWithResult();
        onchildviewaddedOnExtraCallbackWithResult.IAuthTabCallback().IAuthTabCallbackDefault(0);
        if (this.onExtraCallbackWithResult != null && onchildviewaddedOnExtraCallbackWithResult.onExtraCallback() == null) {
            onchildviewaddedOnExtraCallbackWithResult.onNavigationEvent(this.onExtraCallbackWithResult, 3);
        }
        lt42 lt42Var = this.onWarmupCompleted;
        if (lt42Var != null) {
            lt42Var.onWarmupCompleted(onchildviewaddedOnExtraCallbackWithResult, (lt46) null);
        }
        return onchildviewaddedOnExtraCallbackWithResult;
    }

    protected void onWarmupCompleted(onChildViewAdded onchildviewadded, onChildViewAdded onchildviewadded2, byte[] bArr, lt42 lt42Var) {
        if (lt42Var == null) {
            return;
        }
        int iOnExtraCallbackWithResult = lt42Var.onExtraCallbackWithResult(onchildviewadded2, bArr, onchildviewadded.onWarmupCompleted());
        int iOnNavigationEvent = onchildviewadded.IAuthTabCallback().onNavigationEvent();
        new Object[]{Integer.valueOf(iOnNavigationEvent), onchildviewadded.onNavigationEvent().access000(), lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()), Rcode.onNavigationEvent(iOnExtraCallbackWithResult)};
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DohResolver {");
        sb.append(this.onTransact ? "POST " : "GET ");
        sb.append(this.asBinder);
        sb.append("}");
        return sb.toString();
    }

    protected final <T> CompletableFuture<T> onExtraCallbackWithResult(onChildViewAdded onchildviewadded, Throwable th) {
        return onNavigationEvent(onchildviewadded, null, th);
    }

    protected final <T> CompletableFuture<T> onNavigationEvent(onChildViewAdded onchildviewadded, String str, Throwable th) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Query ");
        sb.append(onchildviewadded.IAuthTabCallback().onNavigationEvent());
        sb.append(" for ");
        sb.append(onchildviewadded.onNavigationEvent().access000());
        sb.append("/");
        sb.append(lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()));
        sb.append(" timed out");
        String str3 = BuildConfig.FLAVOR;
        if (str != null) {
            str2 = ": " + str;
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        sb.append(str2);
        if (th != null && th.getMessage() != null) {
            str3 = ", " + th.getMessage();
        }
        sb.append(str3);
        return onExtraCallbackWithResult(new TimeoutException(sb.toString()));
    }
}
