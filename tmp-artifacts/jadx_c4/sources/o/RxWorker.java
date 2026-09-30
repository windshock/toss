package o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import o.RxWorker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RxWorker {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;
    private static final String onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final Regex onWarmupCompleted = new Regex("([0-9A-Fa-f]{2}:){5}[0-9A-Fa-f]{2}");

    public static /* synthetic */ CharSequence onExtraCallback(byte b) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnNavigationEvent = onNavigationEvent(b);
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return charSequenceOnNavigationEvent;
    }

    public static /* synthetic */ CharSequence onExtraCallbackWithResult(MatchResult matchResult) throws NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(matchResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CharSequence charSequenceOnWarmupCompleted = onWarmupCompleted(matchResult);
        int i3 = IAuthTabCallback + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return charSequenceOnWarmupCompleted;
    }

    static {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        onExtraCallbackWithResult = string;
        int i = onNavigationEvent + 83;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnNavigationEvent = onWarmupCompleted.onNavigationEvent(str, new Function1() { // from class: im.toss.ble.DeviceAddressMaskingKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) throws NoSuchAlgorithmException {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 19;
                onExtraCallback = i3 % 128;
                MatchResult matchResult = (MatchResult) obj;
                if (i3 % 2 == 0) {
                    RxWorker.onExtraCallbackWithResult(matchResult);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                CharSequence charSequenceOnExtraCallbackWithResult = RxWorker.onExtraCallbackWithResult(matchResult);
                int i4 = IAuthTabCallback + 119;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 55 / 0;
                }
                return charSequenceOnExtraCallbackWithResult;
            }
        });
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return strOnNavigationEvent;
    }

    private static final CharSequence onWarmupCompleted(MatchResult matchResult) throws NoSuchAlgorithmException {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(matchResult, "");
            strOnWarmupCompleted = onWarmupCompleted(matchResult.onExtraCallbackWithResult());
            int i3 = 61 / 0;
        } else {
            Intrinsics.checkNotNullParameter(matchResult, "");
            strOnWarmupCompleted = onWarmupCompleted(matchResult.onExtraCallbackWithResult());
        }
        int i4 = onExtraCallback + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }

    private static final CharSequence onNavigationEvent(byte b) {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = Byte.valueOf(b);
            str = String.format("%02x", Arrays.copyOf(objArr, 1));
        } else {
            str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i3 = IAuthTabCallback + 61;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static final String onWarmupCompleted(String str) throws NoSuchAlgorithmException {
        int i = 2 % 2;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = (onExtraCallbackWithResult + str).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strJoinToString$default = CollectionsKt.joinToString$default(ArraysKt.take(bArrDigest, 3), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.ble.DeviceAddressMaskingKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 95;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CharSequence charSequenceOnExtraCallback = RxWorker.onExtraCallback(((Byte) obj).byteValue());
                int i5 = IAuthTabCallback + 1;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return charSequenceOnExtraCallback;
            }
        }, 30, (Object) null);
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return strJoinToString$default;
    }
}
