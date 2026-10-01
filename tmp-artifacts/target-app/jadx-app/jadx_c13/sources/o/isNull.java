package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class isNull extends getBeforeTimestamp {
    private final String onExtraCallbackWithResult;

    public isNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getBeforeTimestamp
    /* renamed from: writeTypedObject, reason: merged with bridge method [inline-methods] */
    public String getInterfaceDescriptor() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getBeforeTimestamp
    public int onNavigationEvent(int i) {
        if (i < getInterfaceDescriptor().length()) {
            return i;
        }
        return -1;
    }

    @Override // o.getBeforeTimestamp
    public byte onExtraCallback() {
        String interfaceDescriptor = getInterfaceDescriptor();
        int i = this.onWarmupCompleted;
        while (i != -1 && i < interfaceDescriptor.length()) {
            int i2 = i + 1;
            char cCharAt = interfaceDescriptor.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.onWarmupCompleted = i2;
                return getRunTime.onExtraCallback(cCharAt);
            }
            i = i2;
        }
        this.onWarmupCompleted = interfaceDescriptor.length();
        return (byte) 10;
    }

    @Override // o.getBeforeTimestamp
    public boolean onWarmupCompleted() {
        int i = this.onWarmupCompleted;
        if (i == -1) {
            return false;
        }
        String interfaceDescriptor = getInterfaceDescriptor();
        while (i < interfaceDescriptor.length()) {
            char cCharAt = interfaceDescriptor.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.onWarmupCompleted = i;
                return IAuthTabCallback(cCharAt);
            }
            i++;
        }
        this.onWarmupCompleted = i;
        return false;
    }

    @Override // o.getBeforeTimestamp
    public int extraCallback() {
        char cCharAt;
        int i = this.onWarmupCompleted;
        if (i == -1) {
            return i;
        }
        String interfaceDescriptor = getInterfaceDescriptor();
        while (i < interfaceDescriptor.length() && ((cCharAt = interfaceDescriptor.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.onWarmupCompleted = i;
        return i;
    }

    @Override // o.getBeforeTimestamp
    public void onExtraCallback(char c) {
        if (this.onWarmupCompleted == -1) {
            onWarmupCompleted(c);
        }
        String interfaceDescriptor = getInterfaceDescriptor();
        int i = this.onWarmupCompleted;
        while (i < interfaceDescriptor.length()) {
            int i2 = i + 1;
            char cCharAt = interfaceDescriptor.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.onWarmupCompleted = i2;
                if (cCharAt == c) {
                    return;
                } else {
                    onWarmupCompleted(c);
                }
            }
            i = i2;
        }
        this.onWarmupCompleted = -1;
        onWarmupCompleted(c);
    }

    @Override // o.getBeforeTimestamp
    public String IAuthTabCallback() {
        onExtraCallback('\"');
        int i = this.onWarmupCompleted;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) getInterfaceDescriptor(), '\"', i, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            onTransact();
            String strOnWarmupCompleted = getRunTime.onWarmupCompleted((byte) 1);
            int i2 = this.onWarmupCompleted;
            getBeforeTimestamp.onExtraCallbackWithResult(this, "Expected " + strOnWarmupCompleted + ", but had '" + ((i2 == getInterfaceDescriptor().length() || i2 < 0) ? "EOF" : String.valueOf(getInterfaceDescriptor().charAt(i2))) + "' instead", i2, null, 4, null);
            throw new setWrite();
        }
        for (int i3 = i; i3 < iIndexOf$default; i3++) {
            if (getInterfaceDescriptor().charAt(i3) == '\\') {
                return IAuthTabCallback(getInterfaceDescriptor(), this.onWarmupCompleted, i3);
            }
        }
        this.onWarmupCompleted = iIndexOf$default + 1;
        String strSubstring = getInterfaceDescriptor().substring(i, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    @Override // o.getBeforeTimestamp
    public String IAuthTabCallback(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = this.onWarmupCompleted;
        try {
            if (onExtraCallback() == 6 && Intrinsics.areEqual(onWarmupCompleted(z), str)) {
                asInterface();
                if (onExtraCallback() == 5) {
                    return onWarmupCompleted(z);
                }
            }
            this.onWarmupCompleted = i;
            asInterface();
            return null;
        } finally {
            this.onWarmupCompleted = i;
            asInterface();
        }
    }
}
