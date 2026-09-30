package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class syaycx3 extends isNull {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syaycx3(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.isNull, o.getBeforeTimestamp
    public byte onExtraCallback() {
        String interfaceDescriptor = getInterfaceDescriptor();
        int iExtraCallback = extraCallback();
        if (iExtraCallback >= interfaceDescriptor.length() || iExtraCallback == -1) {
            return (byte) 10;
        }
        this.onWarmupCompleted = iExtraCallback + 1;
        return getRunTime.onExtraCallback(interfaceDescriptor.charAt(iExtraCallback));
    }

    @Override // o.isNull, o.getBeforeTimestamp
    public boolean onWarmupCompleted() {
        int iExtraCallback = extraCallback();
        if (iExtraCallback >= getInterfaceDescriptor().length() || iExtraCallback == -1) {
            return false;
        }
        return IAuthTabCallback(getInterfaceDescriptor().charAt(iExtraCallback));
    }

    @Override // o.isNull, o.getBeforeTimestamp
    public void onExtraCallback(char c) {
        String interfaceDescriptor = getInterfaceDescriptor();
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

    @Override // o.getBeforeTimestamp
    public byte IAuthTabCallback_Parcel() {
        String interfaceDescriptor = getInterfaceDescriptor();
        int iExtraCallback = extraCallback();
        if (iExtraCallback >= interfaceDescriptor.length() || iExtraCallback == -1) {
            return (byte) 10;
        }
        this.onWarmupCompleted = iExtraCallback;
        return getRunTime.onExtraCallback(interfaceDescriptor.charAt(iExtraCallback));
    }

    @Override // o.isNull, o.getBeforeTimestamp
    public int extraCallback() {
        int i;
        int iIndexOf$default = this.onWarmupCompleted;
        if (iIndexOf$default == -1) {
            return iIndexOf$default;
        }
        String interfaceDescriptor = getInterfaceDescriptor();
        while (iIndexOf$default < interfaceDescriptor.length()) {
            char cCharAt = interfaceDescriptor.charAt(iIndexOf$default);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i = iIndexOf$default + 1) >= interfaceDescriptor.length()) {
                    break;
                }
                char cCharAt2 = interfaceDescriptor.charAt(i);
                if (cCharAt2 == '*') {
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) interfaceDescriptor, "*/", iIndexOf$default + 2, false, 4, (Object) null);
                    if (iIndexOf$default2 == -1) {
                        this.onWarmupCompleted = interfaceDescriptor.length();
                        getBeforeTimestamp.onExtraCallbackWithResult(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new setWrite();
                    }
                    iIndexOf$default = iIndexOf$default2 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) interfaceDescriptor, '\n', iIndexOf$default + 2, false, 4, (Object) null);
                    if (iIndexOf$default == -1) {
                        iIndexOf$default = interfaceDescriptor.length();
                    }
                }
            }
            iIndexOf$default++;
        }
        this.onWarmupCompleted = iIndexOf$default;
        return iIndexOf$default;
    }
}
