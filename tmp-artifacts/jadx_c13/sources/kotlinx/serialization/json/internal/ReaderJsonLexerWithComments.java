package kotlinx.serialization.json.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.getBeforeTimestamp;
import o.getRunTime;
import o.getSubmitTimestamp;
import o.getWrite;
import o.setOnShakeListener;
import o.setWrite;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReaderJsonLexerWithComments extends ReaderJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderJsonLexerWithComments(@NotNull setOnShakeListener setonshakelistener, @NotNull char[] cArr) {
        super(setonshakelistener, cArr);
        Intrinsics.checkNotNullParameter(setonshakelistener, "");
        Intrinsics.checkNotNullParameter(cArr, "");
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, o.getBeforeTimestamp
    public void onExtraCallback(char c) {
        IAuthTabCallbackStubProxy();
        getSubmitTimestamp interfaceDescriptor = getInterfaceDescriptor();
        int iExtraCallback = extraCallback();
        if (iExtraCallback >= interfaceDescriptor.length() || iExtraCallback == -1) {
            this.onWarmupCompleted = -1;
            onWarmupCompleted(c);
        }
        char cCharAt = interfaceDescriptor.charAt(iExtraCallback);
        this.onWarmupCompleted = iExtraCallback + 1;
        if (cCharAt == c) {
            return;
        }
        onWarmupCompleted(c);
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, o.getBeforeTimestamp
    public boolean onWarmupCompleted() {
        IAuthTabCallbackStubProxy();
        int iExtraCallback = extraCallback();
        if (iExtraCallback >= getInterfaceDescriptor().length() || iExtraCallback == -1) {
            return false;
        }
        return IAuthTabCallback(getInterfaceDescriptor().charAt(iExtraCallback));
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, o.getBeforeTimestamp
    public byte onExtraCallback() {
        IAuthTabCallbackStubProxy();
        getSubmitTimestamp interfaceDescriptor = getInterfaceDescriptor();
        int iExtraCallback = extraCallback();
        if (iExtraCallback >= interfaceDescriptor.length() || iExtraCallback == -1) {
            return (byte) 10;
        }
        this.onWarmupCompleted = iExtraCallback + 1;
        return getRunTime.onExtraCallback(interfaceDescriptor.charAt(iExtraCallback));
    }

    @Override // o.getBeforeTimestamp
    public byte IAuthTabCallback_Parcel() {
        IAuthTabCallbackStubProxy();
        getSubmitTimestamp interfaceDescriptor = getInterfaceDescriptor();
        int iExtraCallback = extraCallback();
        if (iExtraCallback >= interfaceDescriptor.length() || iExtraCallback == -1) {
            return (byte) 10;
        }
        this.onWarmupCompleted = iExtraCallback;
        return getRunTime.onExtraCallback(interfaceDescriptor.charAt(iExtraCallback));
    }

    private final Pair<Integer, Boolean> onWarmupCompleted(int i) {
        int i2 = i + 2;
        char cCharAt = getInterfaceDescriptor().charAt(i + 1);
        if (cCharAt != '*') {
            if (cCharAt == '/') {
                int iOnNavigationEvent = i2;
                while (i != -1) {
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) getInterfaceDescriptor(), '\n', iOnNavigationEvent, false, 4, (Object) null);
                    if (iIndexOf$default == -1) {
                        iOnNavigationEvent = onNavigationEvent(getInterfaceDescriptor().length());
                        i = iOnNavigationEvent;
                    } else {
                        return getWrite.IAuthTabCallback(Integer.valueOf(iIndexOf$default + 1), Boolean.TRUE);
                    }
                }
                return getWrite.IAuthTabCallback(-1, Boolean.TRUE);
            }
            return getWrite.IAuthTabCallback(Integer.valueOf(i), Boolean.FALSE);
        }
        boolean z = false;
        int iOnNavigationEvent2 = i2;
        while (i != -1) {
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) getInterfaceDescriptor(), "*/", iOnNavigationEvent2, false, 4, (Object) null);
            if (iIndexOf$default2 != -1) {
                return getWrite.IAuthTabCallback(Integer.valueOf(iIndexOf$default2 + 2), Boolean.TRUE);
            }
            if (getInterfaceDescriptor().charAt(getInterfaceDescriptor().length() - 1) != '*') {
                iOnNavigationEvent2 = onNavigationEvent(getInterfaceDescriptor().length());
            } else {
                int iIAuthTabCallback = IAuthTabCallback(getInterfaceDescriptor().length() - 1);
                if (z) {
                    break;
                }
                iOnNavigationEvent2 = iIAuthTabCallback;
                z = true;
            }
            i = iOnNavigationEvent2;
        }
        this.onWarmupCompleted = getInterfaceDescriptor().length();
        getBeforeTimestamp.onExtraCallbackWithResult(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new setWrite();
    }

    private final int IAuthTabCallback(int i) {
        if (getInterfaceDescriptor().length() - i > ((ReaderJsonLexer) this).onExtraCallback) {
            return i;
        }
        this.onWarmupCompleted = i;
        IAuthTabCallbackStubProxy();
        return (this.onWarmupCompleted != 0 || getInterfaceDescriptor().length() == 0) ? -1 : 0;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, o.getBeforeTimestamp
    public int extraCallback() {
        int iOnNavigationEvent;
        int i = this.onWarmupCompleted;
        while (true) {
            iOnNavigationEvent = onNavigationEvent(i);
            if (iOnNavigationEvent != -1) {
                char cCharAt = getInterfaceDescriptor().charAt(iOnNavigationEvent);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    if (cCharAt == '/' && iOnNavigationEvent + 1 < getInterfaceDescriptor().length()) {
                        Pair<Integer, Boolean> pairOnWarmupCompleted = onWarmupCompleted(iOnNavigationEvent);
                        int iIntValue = pairOnWarmupCompleted.onExtraCallbackWithResult().intValue();
                        if (!pairOnWarmupCompleted.IAuthTabCallback().booleanValue()) {
                            iOnNavigationEvent = iIntValue;
                            break;
                        }
                        i = iIntValue;
                    } else {
                        break;
                    }
                } else {
                    i = iOnNavigationEvent + 1;
                }
            } else {
                break;
            }
        }
        this.onWarmupCompleted = iOnNavigationEvent;
        return iOnNavigationEvent;
    }
}
