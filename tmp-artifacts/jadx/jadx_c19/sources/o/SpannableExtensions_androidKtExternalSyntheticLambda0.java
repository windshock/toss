package o;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SpannableExtensions_androidKtExternalSyntheticLambda0 implements SaversKtExternalSyntheticLambda26 {
    private final String IAuthTabCallbackStub;
    private URL asInterface;
    private int onExtraCallback;
    private final AndroidTextPaintExternalSyntheticLambda0 onExtraCallbackWithResult;
    private String onNavigationEvent;
    private final URL onTransact;
    private volatile byte[] onWarmupCompleted;

    public SpannableExtensions_androidKtExternalSyntheticLambda0(URL url) {
        this(url, AndroidTextPaintExternalSyntheticLambda0.IAuthTabCallback);
    }

    public SpannableExtensions_androidKtExternalSyntheticLambda0(String str) {
        this(str, AndroidTextPaintExternalSyntheticLambda0.IAuthTabCallback);
    }

    public SpannableExtensions_androidKtExternalSyntheticLambda0(URL url, AndroidTextPaintExternalSyntheticLambda0 androidTextPaintExternalSyntheticLambda0) {
        this.onTransact = (URL) markHierarchyDirty.onExtraCallbackWithResult(url);
        this.IAuthTabCallbackStub = null;
        this.onExtraCallbackWithResult = (AndroidTextPaintExternalSyntheticLambda0) markHierarchyDirty.onExtraCallbackWithResult(androidTextPaintExternalSyntheticLambda0);
    }

    public SpannableExtensions_androidKtExternalSyntheticLambda0(String str, AndroidTextPaintExternalSyntheticLambda0 androidTextPaintExternalSyntheticLambda0) {
        this.onTransact = null;
        this.IAuthTabCallbackStub = markHierarchyDirty.onExtraCallbackWithResult(str);
        this.onExtraCallbackWithResult = (AndroidTextPaintExternalSyntheticLambda0) markHierarchyDirty.onExtraCallbackWithResult(androidTextPaintExternalSyntheticLambda0);
    }

    public URL onExtraCallback() throws MalformedURLException {
        return asInterface();
    }

    private URL asInterface() throws MalformedURLException {
        if (this.asInterface == null) {
            this.asInterface = new URL(onWarmupCompleted());
        }
        return this.asInterface;
    }

    private String onWarmupCompleted() {
        if (TextUtils.isEmpty(this.onNavigationEvent)) {
            String string = this.IAuthTabCallbackStub;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) markHierarchyDirty.onExtraCallbackWithResult(this.onTransact)).toString();
            }
            this.onNavigationEvent = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.onNavigationEvent;
    }

    public Map<String, String> IAuthTabCallback() {
        return this.onExtraCallbackWithResult.onNavigationEvent();
    }

    public String onNavigationEvent() {
        String str = this.IAuthTabCallbackStub;
        return str != null ? str : ((URL) markHierarchyDirty.onExtraCallbackWithResult(this.onTransact)).toString();
    }

    public String toString() {
        return onNavigationEvent();
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(onExtraCallbackWithResult());
    }

    private byte[] onExtraCallbackWithResult() {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = onNavigationEvent().getBytes(SaversKtExternalSyntheticLambda26.IAuthTabCallback);
        }
        return this.onWarmupCompleted;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public boolean equals(Object obj) {
        if (!(obj instanceof SpannableExtensions_androidKtExternalSyntheticLambda0)) {
            return false;
        }
        SpannableExtensions_androidKtExternalSyntheticLambda0 spannableExtensions_androidKtExternalSyntheticLambda0 = (SpannableExtensions_androidKtExternalSyntheticLambda0) obj;
        return onNavigationEvent().equals(spannableExtensions_androidKtExternalSyntheticLambda0.onNavigationEvent()) && this.onExtraCallbackWithResult.equals(spannableExtensions_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult);
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public int hashCode() {
        if (this.onExtraCallback == 0) {
            int iHashCode = onNavigationEvent().hashCode();
            this.onExtraCallback = iHashCode;
            this.onExtraCallback = (iHashCode * 31) + this.onExtraCallbackWithResult.hashCode();
        }
        return this.onExtraCallback;
    }
}
