package o;

import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAnrs<T> implements getLocationStatus<T> {

    @Nullable
    private byte[] IAuthTabCallback;
    private final String onExtraCallback;
    private final checkIsRooted onExtraCallbackWithResult;
    private final int onNavigationEvent;

    private getAnrs(checkIsRooted checkisrooted, String str) {
        if (checkisrooted == null) {
            throw new NullPointerException("Null type");
        }
        this.onExtraCallbackWithResult = checkisrooted;
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.onExtraCallback = str;
        this.onNavigationEvent = onNavigationEvent(checkisrooted, str);
    }

    public static <T> getLocationStatus<T> IAuthTabCallback(@Nullable String str, checkIsRooted checkisrooted) {
        if (str == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return new getAnrs(checkisrooted, str);
    }

    @Override // o.getLocationStatus
    public checkIsRooted onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getLocationStatus
    public String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public byte[] onExtraCallback() {
        byte[] bArr = this.IAuthTabCallback;
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.onExtraCallback.getBytes(StandardCharsets.UTF_8);
        this.IAuthTabCallback = bytes;
        return bytes;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getAnrs)) {
            return false;
        }
        getAnrs getanrs = (getAnrs) obj;
        return this.onExtraCallbackWithResult.equals(getanrs.onNavigationEvent()) && this.onExtraCallback.equals(getanrs.IAuthTabCallback());
    }

    public int hashCode() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return this.onExtraCallback;
    }

    private static int onNavigationEvent(checkIsRooted checkisrooted, String str) {
        return ((checkisrooted.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }
}
