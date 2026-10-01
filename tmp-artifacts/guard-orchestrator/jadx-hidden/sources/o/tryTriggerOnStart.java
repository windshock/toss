package o;

import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import o.EngineConfig1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class tryTriggerOnStart {
    private static final byte[] $$a;
    private static final int $$b = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static char[] asBinder;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, byte r7) {
        /*
            byte[] r0 = o.tryTriggerOnStart.$$a
            int r7 = r7 * 3
            int r7 = 102 - r7
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r5 = r5 * 4
            int r1 = 11 - r5
            byte[] r1 = new byte[r1]
            int r5 = 10 - r5
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
        L29:
            int r4 = -r4
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + 2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryTriggerOnStart.$$c(byte, byte, byte):java.lang.String");
    }

    public static native void d(Object obj, Object obj2);

    public static /* synthetic */ tryTriggerOnStart onNavigationEvent(tryTriggerOnStart trytriggeronstart, String str, String str2, String str3, String str4, boolean z, Boolean bool, int i, Object obj) {
        String str5;
        boolean z2;
        Boolean bool2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 3;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        String str6 = (i3 % 2 == 0 && (i & 1) != 0) ? trytriggeronstart.IAuthTabCallback : str;
        if ((i & 2) != 0) {
            str5 = trytriggeronstart.onTransact;
            int i5 = i4 + 53;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str5 = str2;
        }
        String str7 = (i & 4) != 0 ? trytriggeronstart.onExtraCallback : str3;
        String str8 = (i & 8) != 0 ? trytriggeronstart.onWarmupCompleted : str4;
        if ((i & 16) != 0) {
            int i7 = i4 + 63;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 == 0) {
                boolean z3 = trytriggeronstart.onExtraCallbackWithResult;
                throw null;
            }
            z2 = trytriggeronstart.onExtraCallbackWithResult;
        } else {
            z2 = z;
        }
        if ((i & 32) != 0) {
            int i8 = IAuthTabCallbackStub + 89;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            bool2 = trytriggeronstart.onNavigationEvent;
        } else {
            bool2 = bool;
        }
        return trytriggeronstart.onExtraCallback(str6, str5, str7, str8, z2, bool2);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tryTriggerOnStart)) {
            int i2 = IAuthTabCallbackStub + 1;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        tryTriggerOnStart trytriggeronstart = (tryTriggerOnStart) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, trytriggeronstart.IAuthTabCallback)) {
            int i4 = IAuthTabCallbackDefault + 35;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, trytriggeronstart.onTransact)) {
            int i6 = IAuthTabCallbackDefault + 45;
            IAuthTabCallbackStub = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, trytriggeronstart.onExtraCallback)) {
            int i7 = IAuthTabCallbackStub + 35;
            IAuthTabCallbackDefault = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, trytriggeronstart.onWarmupCompleted)) {
            return false;
        }
        if (this.onExtraCallbackWithResult != trytriggeronstart.onExtraCallbackWithResult) {
            int i8 = IAuthTabCallbackStub + 113;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, trytriggeronstart.onNavigationEvent)) {
            return true;
        }
        int i10 = IAuthTabCallbackDefault;
        int i11 = i10 + 57;
        IAuthTabCallbackStub = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 95;
        IAuthTabCallbackStub = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        int iHashCode4 = this.onTransact.hashCode();
        String str = this.onExtraCallback;
        int iHashCode5 = 0;
        if (str == null) {
            int i4 = IAuthTabCallbackStub + 25;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.onWarmupCompleted;
        if (str2 == null) {
            int i6 = IAuthTabCallbackStub + 49;
            IAuthTabCallbackDefault = i6 % 128;
            iHashCode2 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i7 = IAuthTabCallbackStub + 53;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
        }
        int iHashCode6 = Boolean.hashCode(this.onExtraCallbackWithResult);
        Boolean bool = this.onNavigationEvent;
        if (bool != null) {
            int i9 = IAuthTabCallbackDefault + 57;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            iHashCode5 = bool.hashCode();
        }
        return (((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode5;
    }

    public final tryTriggerOnStart onExtraCallback(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable Boolean bool) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        tryTriggerOnStart trytriggeronstart = new tryTriggerOnStart(str, str2, str3, str4, z, bool);
        int i2 = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return trytriggeronstart;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.IAuthTabCallback;
        String str2 = this.onTransact;
        String str3 = this.onExtraCallback;
        String str4 = this.onWarmupCompleted;
        boolean z = this.onExtraCallbackWithResult;
        Boolean bool = this.onNavigationEvent;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 16, 114, 11}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new int[]{16, 8, 137, 2}, true, new byte[]{1, 0, 1, 0, 1, 0, 1, 1}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a(new int[]{24, 11, 24, 0}, false, new byte[]{0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str3);
        Object[] objArr4 = new Object[1];
        a(new int[]{35, 8, 0, 1}, true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str4);
        Object[] objArr5 = new Object[1];
        a(new int[]{43, 11, 182, 0}, false, new byte[]{0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1}, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(z);
        Object[] objArr6 = new Object[1];
        a(new int[]{54, 10, 93, 0}, true, new byte[]{0, 1, 1, 0, 0, 0, 1, 1, 1, 0}, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(bool);
        Object[] objArr7 = new Object[1];
        a(new int[]{64, 1, 0, 0}, true, new byte[]{1}, objArr7);
        sb.append(((String) objArr7[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public tryTriggerOnStart(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = str;
        this.onTransact = str2;
        this.onExtraCallback = str3;
        this.onWarmupCompleted = str4;
        this.onExtraCallbackWithResult = z;
        this.onNavigationEvent = bool;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 17;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 107;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.onTransact;
        int i5 = i3 + 63;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 1;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 97;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 45;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.onWarmupCompleted;
        int i4 = i2 + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 47;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i2 + 87;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = asBinder;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i6]);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i7 = $10 + 101;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                        throw null;
                    }
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i8 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i8, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i8);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i9 = $11 + 7;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        byte[] bArr = {1, Byte.MIN_VALUE, 109, Byte.MIN_VALUE, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
        $$a = bArr;
        ClassLoader parent = tryTriggerOnStart.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[0] - 1);
            byte b2 = b;
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
            declaredMethod.setAccessible(true);
            System.load((String) declaredMethod.invoke(parent, "ea56"));
            IAuthTabCallbackDefault = 0;
            IAuthTabCallbackStub = 1;
            asBinder = new char[]{27181, 27286, 27307, 27292, 27295, 27281, 27311, 27293, 27289, 27281, 27272, 27388, 27276, 27286, 27380, 27380, 27162, 27361, 27379, 27284, 27327, 27319, 27321, 27321, 27244, 27248, 27183, 27330, 27341, 27341, 27336, 27336, 27334, 27342, 27175, 27224, 27258, 27165, 27175, 27170, 27168, 27175, 27148, 27199, 27282, 27316, 27498, 27481, 27484, 27503, 27498, 27473, 27476, 27464, 27139, 27363, 27279, 27275, 27274, 27279, 27277, 27276, 27344, 27341, 27226};
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
