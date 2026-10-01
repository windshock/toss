package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getCommandLine implements Comparable<getCommandLine>, Serializable {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final getCommandLine onNavigationEvent = new getCommandLine(0, 0);
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    public /* synthetic */ getCommandLine(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private getCommandLine(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    public final long onExtraCallback() {
        return this.mostSignificantBits;
    }

    public final long onNavigationEvent() {
        return this.leastSignificantBits;
    }

    public String toString() {
        return onExtraCallbackWithResult();
    }

    public final String onExtraCallbackWithResult() {
        byte[] bArr = new byte[36];
        getCausesOrBuilderList.onNavigationEvent(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        getCausesOrBuilderList.onNavigationEvent(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        getCausesOrBuilderList.onNavigationEvent(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        getCausesOrBuilderList.onNavigationEvent(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        getCausesOrBuilderList.onNavigationEvent(this.leastSignificantBits, bArr, 24, 2, 8);
        return StringsKt__StringsJVMKt.decodeToString(bArr);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCommandLine)) {
            return false;
        }
        getCommandLine getcommandline = (getCommandLine) obj;
        return this.mostSignificantBits == getcommandline.mostSignificantBits && this.leastSignificantBits == getcommandline.leastSignificantBits;
    }

    @Override // java.lang.Comparable
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull getCommandLine getcommandline) {
        Intrinsics.checkNotNullParameter(getcommandline, "");
        long j = this.mostSignificantBits;
        if (j != getcommandline.mostSignificantBits) {
            return setTypeface.onExtraCallbackWithResult(access13000.onExtraCallback(j), access13000.onExtraCallback(getcommandline.mostSignificantBits));
        }
        return setTypeface.onExtraCallbackWithResult(access13000.onExtraCallback(this.leastSignificantBits), access13000.onExtraCallback(getcommandline.leastSignificantBits));
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    private final Object writeReplace() {
        return getCausesOrBuilderList.onNavigationEvent(this);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final getCommandLine onExtraCallback() {
            return getCommandLine.onNavigationEvent;
        }

        public final getCommandLine onExtraCallback(long j, long j2) {
            if (j == 0 && j2 == 0) {
                return onExtraCallback();
            }
            return new getCommandLine(j, j2, null);
        }

        public final getCommandLine onExtraCallback(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            if (bArr.length != 16) {
                throw new IllegalArgumentException(("Expected exactly 16 bytes, but was " + getCausesOrBuilder.onNavigationEvent(bArr, 32) + " of size " + bArr.length).toString());
            }
            return onExtraCallback(getCausesOrBuilderList.onWarmupCompleted(bArr, 0), getCausesOrBuilderList.onWarmupCompleted(bArr, 8));
        }

        public final getCommandLine onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int length = str.length();
            if (length == 32) {
                return getCausesOrBuilderList.onExtraCallback(str);
            }
            if (length == 36) {
                return getCausesOrBuilderList.IAuthTabCallback(str);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + getCausesOrBuilder.onNavigationEvent(str, 64) + "\" of length " + str.length());
        }

        public final getCommandLine onWarmupCompleted() {
            return onExtraCallbackWithResult();
        }

        public final getCommandLine onExtraCallbackWithResult() {
            return getCausesOrBuilder.onNavigationEvent();
        }
    }
}
