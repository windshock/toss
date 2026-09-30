package kotlinx.serialization.json.internal;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import o.getArbitrageLoadingView;
import o.getBeforeTimestamp;
import o.getRunTime;
import o.getSubmitTimestamp;
import o.setOnShakeListener;
import o.setWrite;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ReaderJsonLexer extends getBeforeTimestamp {
    protected int onExtraCallback;
    private final setOnShakeListener onExtraCallbackWithResult;
    private final char[] onNavigationEvent;
    private final getSubmitTimestamp onTransact;

    @Override // o.getBeforeTimestamp
    public String IAuthTabCallback(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return null;
    }

    public ReaderJsonLexer(@NotNull setOnShakeListener setonshakelistener, @NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(setonshakelistener, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        this.onExtraCallbackWithResult = setonshakelistener;
        this.onNavigationEvent = cArr;
        this.onExtraCallback = 128;
        this.onTransact = new getSubmitTimestamp(cArr);
        onExtraCallback(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getBeforeTimestamp
    /* renamed from: readTypedObject, reason: merged with bridge method [inline-methods] */
    public getSubmitTimestamp getInterfaceDescriptor() {
        return this.onTransact;
    }

    @Override // o.getBeforeTimestamp
    public boolean onWarmupCompleted() {
        IAuthTabCallbackStubProxy();
        int i = this.onWarmupCompleted;
        while (true) {
            int iOnNavigationEvent = onNavigationEvent(i);
            if (iOnNavigationEvent != -1) {
                char cCharAt = getInterfaceDescriptor().charAt(iOnNavigationEvent);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.onWarmupCompleted = iOnNavigationEvent;
                    return IAuthTabCallback(cCharAt);
                }
                i = iOnNavigationEvent + 1;
            } else {
                this.onWarmupCompleted = iOnNavigationEvent;
                return false;
            }
        }
    }

    private final void onExtraCallback(int i) {
        char[] cArrOnExtraCallback = getInterfaceDescriptor().onExtraCallback();
        if (i != 0) {
            int i2 = this.onWarmupCompleted;
            ArraysKt___ArraysJvmKt.copyInto(cArrOnExtraCallback, cArrOnExtraCallback, 0, i2, i2 + i);
        }
        int length = getInterfaceDescriptor().length();
        while (true) {
            if (i == length) {
                break;
            }
            int iIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback(cArrOnExtraCallback, i, length - i);
            if (iIAuthTabCallback == -1) {
                getInterfaceDescriptor().IAuthTabCallback(i);
                this.onExtraCallback = -1;
                break;
            }
            i += iIAuthTabCallback;
        }
        this.onWarmupCompleted = 0;
    }

    @Override // o.getBeforeTimestamp
    public int onNavigationEvent(int i) {
        if (i < getInterfaceDescriptor().length()) {
            return i;
        }
        this.onWarmupCompleted = i;
        IAuthTabCallbackStubProxy();
        return (this.onWarmupCompleted != 0 || getInterfaceDescriptor().length() == 0) ? -1 : 0;
    }

    @Override // o.getBeforeTimestamp
    public byte onExtraCallback() {
        IAuthTabCallbackStubProxy();
        getSubmitTimestamp interfaceDescriptor = getInterfaceDescriptor();
        int i = this.onWarmupCompleted;
        while (true) {
            int iOnNavigationEvent = onNavigationEvent(i);
            if (iOnNavigationEvent != -1) {
                int i2 = iOnNavigationEvent + 1;
                byte bOnExtraCallback = getRunTime.onExtraCallback(interfaceDescriptor.charAt(iOnNavigationEvent));
                if (bOnExtraCallback != 3) {
                    this.onWarmupCompleted = i2;
                    return bOnExtraCallback;
                }
                i = i2;
            } else {
                this.onWarmupCompleted = iOnNavigationEvent;
                return (byte) 10;
            }
        }
    }

    @Override // o.getBeforeTimestamp
    public void onExtraCallback(char c) {
        IAuthTabCallbackStubProxy();
        getSubmitTimestamp interfaceDescriptor = getInterfaceDescriptor();
        int i = this.onWarmupCompleted;
        while (true) {
            int iOnNavigationEvent = onNavigationEvent(i);
            if (iOnNavigationEvent != -1) {
                int i2 = iOnNavigationEvent + 1;
                char cCharAt = interfaceDescriptor.charAt(iOnNavigationEvent);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.onWarmupCompleted = i2;
                    if (cCharAt == c) {
                        return;
                    } else {
                        onWarmupCompleted(c);
                    }
                }
                i = i2;
            } else {
                this.onWarmupCompleted = iOnNavigationEvent;
                onWarmupCompleted(c);
                return;
            }
        }
    }

    @Override // o.getBeforeTimestamp
    public int extraCallback() {
        int iOnNavigationEvent;
        char cCharAt;
        int i = this.onWarmupCompleted;
        while (true) {
            iOnNavigationEvent = onNavigationEvent(i);
            if (iOnNavigationEvent == -1 || !((cCharAt = getInterfaceDescriptor().charAt(iOnNavigationEvent)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i = iOnNavigationEvent + 1;
        }
        this.onWarmupCompleted = iOnNavigationEvent;
        return iOnNavigationEvent;
    }

    @Override // o.getBeforeTimestamp
    public void IAuthTabCallbackStubProxy() {
        int length = getInterfaceDescriptor().length() - this.onWarmupCompleted;
        if (length > this.onExtraCallback) {
            return;
        }
        onExtraCallback(length);
    }

    @Override // o.getBeforeTimestamp
    public String IAuthTabCallback() {
        onExtraCallback('\"');
        int i = this.onWarmupCompleted;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult('\"', i);
        if (iOnExtraCallbackWithResult == -1) {
            int iOnNavigationEvent = onNavigationEvent(i);
            if (iOnNavigationEvent != -1) {
                return IAuthTabCallback(getInterfaceDescriptor(), this.onWarmupCompleted, iOnNavigationEvent);
            }
            String strOnWarmupCompleted = getRunTime.onWarmupCompleted((byte) 1);
            int i2 = this.onWarmupCompleted;
            int i3 = i2 - 1;
            getBeforeTimestamp.onExtraCallbackWithResult(this, "Expected " + strOnWarmupCompleted + ", but had '" + ((i2 == getInterfaceDescriptor().length() || i3 < 0) ? "EOF" : String.valueOf(getInterfaceDescriptor().charAt(i3))) + "' instead", i3, null, 4, null);
            throw new setWrite();
        }
        for (int i4 = i; i4 < iOnExtraCallbackWithResult; i4++) {
            if (getInterfaceDescriptor().charAt(i4) == '\\') {
                return IAuthTabCallback(getInterfaceDescriptor(), this.onWarmupCompleted, i4);
            }
        }
        this.onWarmupCompleted = iOnExtraCallbackWithResult + 1;
        return onWarmupCompleted(i, iOnExtraCallbackWithResult);
    }

    @Override // o.getBeforeTimestamp
    public int onExtraCallbackWithResult(char c, int i) {
        getSubmitTimestamp interfaceDescriptor = getInterfaceDescriptor();
        int length = interfaceDescriptor.length();
        while (i < length) {
            if (interfaceDescriptor.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // o.getBeforeTimestamp
    public String onWarmupCompleted(int i, int i2) {
        return getInterfaceDescriptor().IAuthTabCallback(i, i2);
    }

    @Override // o.getBeforeTimestamp
    public void onNavigationEvent(int i, int i2) {
        StringBuilder sbAccess000 = access000();
        sbAccess000.append(getInterfaceDescriptor().onExtraCallback(), i, i2 - i);
        Intrinsics.checkNotNullExpressionValue(sbAccess000, "");
    }

    public final void writeTypedObject() {
        getArbitrageLoadingView.IAuthTabCallback.IAuthTabCallback(this.onNavigationEvent);
    }
}
