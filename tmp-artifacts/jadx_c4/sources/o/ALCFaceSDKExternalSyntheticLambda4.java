package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceSDKExternalSyntheticLambda4 {
    private static int asBinder = 1;
    private static int onTransact;
    private final long IAuthTabCallback;
    private final Object IAuthTabCallbackDefault;
    private final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg IAuthTabCallbackStub;
    private final ALCFaceSDK3 asInterface;
    private final String onExtraCallback;
    private final trimMetadataStringsTo onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private final Integer onWarmupCompleted;

    public ALCFaceSDKExternalSyntheticLambda4(@NotNull ALCFaceSDK3 aLCFaceSDK3, @NotNull String str, @Nullable Object obj, @Nullable Object obj2, @NotNull r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg, long j, @Nullable Integer num, @Nullable trimMetadataStringsTo trimmetadatastringsto) {
        Intrinsics.checkNotNullParameter(aLCFaceSDK3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(r8lambdaimi1kkyy494wcpjbjziyxabnqtg, "");
        this.asInterface = aLCFaceSDK3;
        this.onExtraCallback = str;
        this.IAuthTabCallbackDefault = obj;
        this.onNavigationEvent = obj2;
        this.IAuthTabCallbackStub = r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
        this.IAuthTabCallback = j;
        this.onWarmupCompleted = num;
        this.onExtraCallbackWithResult = trimmetadatastringsto;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ALCFaceSDKExternalSyntheticLambda4(ALCFaceSDK3 aLCFaceSDK3, String str, Object obj, Object obj2, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg, long j, Integer num, trimMetadataStringsTo trimmetadatastringsto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        trimMetadataStringsTo trimmetadatastringsto2;
        if ((i & 64) != 0) {
            int i2 = asBinder + 17;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 128) != 0) {
            int i5 = onTransact + 55;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            trimmetadatastringsto2 = null;
        } else {
            trimmetadatastringsto2 = trimmetadatastringsto;
        }
        this(aLCFaceSDK3, str, obj, obj2, r8lambdaimi1kkyy494wcpjbjziyxabnqtg, j, num2, trimmetadatastringsto2);
    }

    public final ALCFaceSDK3 IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 105;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 111;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Object asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        int i3 = 2 / 0;
        return this.IAuthTabCallbackDefault;
    }

    public final Object onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg = this.IAuthTabCallbackStub;
        int i4 = i3 + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 83;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i2 + 97;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 5;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.onWarmupCompleted;
        int i5 = i2 + 49;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return num;
    }

    public final trimMetadataStringsTo IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        trimMetadataStringsTo trimmetadatastringsto = this.onExtraCallbackWithResult;
        int i4 = i2 + 91;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return trimmetadatastringsto;
    }
}
