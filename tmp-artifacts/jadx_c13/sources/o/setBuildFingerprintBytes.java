package o;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setBuildFingerprintBytes {
    public static final String onNavigationEvent(int i, int i2) {
        return access6100.onExtraCallbackWithResult(i & 4294967295L, CharsKt__CharJVMKt.checkRadix(i2));
    }

    public static final String onExtraCallbackWithResult(long j, int i) {
        return access6100.onExtraCallbackWithResult(j, CharsKt__CharJVMKt.checkRadix(i));
    }

    public static final byte onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        UByte uByteOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        if (uByteOnExtraCallbackWithResult != null) {
            return uByteOnExtraCallbackWithResult.onWarmupCompleted();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new setWrite();
    }

    public static final short asBinder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getU64 getu64IAuthTabCallbackDefault = IAuthTabCallbackDefault(str);
        if (getu64IAuthTabCallbackDefault != null) {
            return getu64IAuthTabCallbackDefault.onExtraCallbackWithResult();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new setWrite();
    }

    public static final int IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        UInt uIntOnExtraCallback = onExtraCallback(str);
        if (uIntOnExtraCallback != null) {
            return uIntOnExtraCallback.IAuthTabCallback();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new setWrite();
    }

    public static final long onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        access13000 access13000VarIAuthTabCallbackStub = IAuthTabCallbackStub(str);
        if (access13000VarIAuthTabCallbackStub != null) {
            return access13000VarIAuthTabCallbackStub.onExtraCallback();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new setWrite();
    }

    public static final UByte onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return onNavigationEvent(str, 10);
    }

    public static final UByte onNavigationEvent(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        UInt uIntOnExtraCallbackWithResult = onExtraCallbackWithResult(str, i);
        if (uIntOnExtraCallbackWithResult == null) {
            return null;
        }
        int iIAuthTabCallback = uIntOnExtraCallbackWithResult.IAuthTabCallback();
        if (forceToEnd.onNavigationEvent(iIAuthTabCallback, UInt.m35constructorimpl(255)) > 0) {
            return null;
        }
        return UByte.m33boximpl(UByte.m34constructorimpl((byte) iIAuthTabCallback));
    }

    public static final getU64 IAuthTabCallbackDefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return IAuthTabCallback(str, 10);
    }

    public static final getU64 IAuthTabCallback(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        UInt uIntOnExtraCallbackWithResult = onExtraCallbackWithResult(str, i);
        if (uIntOnExtraCallbackWithResult == null) {
            return null;
        }
        int iIAuthTabCallback = uIntOnExtraCallbackWithResult.IAuthTabCallback();
        if (forceToEnd.onNavigationEvent(iIAuthTabCallback, UInt.m35constructorimpl(Settings.DEFAULT_INITIAL_WINDOW_SIZE)) > 0) {
            return null;
        }
        return getU64.onExtraCallback(getU64.onNavigationEvent((short) iIAuthTabCallback));
    }

    public static final UInt onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return onExtraCallbackWithResult(str, 10);
    }

    public static final UInt onExtraCallbackWithResult(@NotNull String str, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int iM35constructorimpl = UInt.m35constructorimpl(i);
        int iOnWarmupCompleted = 119304647;
        while (i2 < length) {
            int iOnExtraCallback = CharsKt__CharJVMKt.onExtraCallback(str.charAt(i2), i);
            if (iOnExtraCallback < 0) {
                return null;
            }
            if (forceToEnd.onNavigationEvent(i3, iOnWarmupCompleted) > 0) {
                if (iOnWarmupCompleted == 119304647) {
                    iOnWarmupCompleted = getDuration.onWarmupCompleted(-1, iM35constructorimpl);
                    if (forceToEnd.onNavigationEvent(i3, iOnWarmupCompleted) > 0) {
                    }
                }
                return null;
            }
            int iM35constructorimpl2 = UInt.m35constructorimpl(i3 * iM35constructorimpl);
            int iM35constructorimpl3 = UInt.m35constructorimpl(UInt.m35constructorimpl(iOnExtraCallback) + iM35constructorimpl2);
            if (forceToEnd.onNavigationEvent(iM35constructorimpl3, iM35constructorimpl2) < 0) {
                return null;
            }
            i2++;
            i3 = iM35constructorimpl3;
        }
        return UInt.onNavigationEvent(i3);
    }

    public static final access13000 IAuthTabCallbackStub(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return onWarmupCompleted(str, 10);
    }

    public static final access13000 onWarmupCompleted(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jOnExtraCallback = access13000.onExtraCallback(i);
        long j = 0;
        long jOnExtraCallback2 = 512409557603043100L;
        while (i2 < length) {
            if (CharsKt__CharJVMKt.onExtraCallback(str.charAt(i2), i) < 0) {
                return null;
            }
            if (setTypeface.onExtraCallbackWithResult(j, jOnExtraCallback2) > 0) {
                if (jOnExtraCallback2 == 512409557603043100L) {
                    jOnExtraCallback2 = access13300.onExtraCallback(-1L, jOnExtraCallback);
                    if (setTypeface.onExtraCallbackWithResult(j, jOnExtraCallback2) > 0) {
                    }
                }
                return null;
            }
            long jOnExtraCallback3 = access13000.onExtraCallback(j * jOnExtraCallback);
            long jOnExtraCallback4 = access13000.onExtraCallback(access13000.onExtraCallback(UInt.m35constructorimpl(r13) & 4294967295L) + jOnExtraCallback3);
            if (setTypeface.onExtraCallbackWithResult(jOnExtraCallback4, jOnExtraCallback3) < 0) {
                return null;
            }
            i2++;
            j = jOnExtraCallback4;
        }
        return access13000.onNavigationEvent(j);
    }
}
