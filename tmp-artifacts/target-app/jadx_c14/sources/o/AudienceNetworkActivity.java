package o;

import kotlinx.serialization.json.JsonElement;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AudienceNetworkActivity {
    private static char[] IAuthTabCallback;
    public static final AudienceNetworkActivity onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {86, 117, -27, 75};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            byte[] r0 = o.AudienceNetworkActivity.$$a
            int r6 = r6 * 3
            int r6 = 1 - r6
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = r7 + 97
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
        L27:
            int r7 = r7 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AudienceNetworkActivity.$$c(int, int, int):java.lang.String");
    }

    static {
        onWarmupCompleted = 1;
        onExtraCallbackWithResult();
        onExtraCallbackWithResult = new AudienceNetworkActivity();
        int i = onExtraCallback + 7;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
    }

    private AudienceNetworkActivity() {
    }

    public static /* synthetic */ JsonElement onExtraCallbackWithResult(AudienceNetworkActivity audienceNetworkActivity, String str, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) throws Exception {
        String str6;
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallbackDefault;
            int i4 = i3 + 45;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 83;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        boolean z2 = z;
        String str7 = (i & 8) != 0 ? null : str3;
        String str8 = (i & 16) != 0 ? null : str4;
        if ((i & 32) != 0) {
            int i8 = asBinder + 41;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            str6 = null;
        } else {
            str6 = str5;
        }
        return audienceNetworkActivity.onExtraCallbackWithResult(str, str2, z2, str7, str8, str6);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r28, int r29, char r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AudienceNetworkActivity.a(int, int, char, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066 A[PHI: r7
      0x0066: PHI (r7v19 java.lang.Long) = (r7v18 java.lang.Long), (r7v21 java.lang.Long) binds: [B:10:0x0064, B:7:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.serialization.json.JsonElement onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull java.lang.String r15, boolean r16, @org.jetbrains.annotations.Nullable java.lang.String r17, @org.jetbrains.annotations.Nullable java.lang.String r18, @org.jetbrains.annotations.Nullable java.lang.String r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AudienceNetworkActivity.onExtraCallbackWithResult(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):kotlinx.serialization.json.JsonElement");
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new char[]{8704, 44446, 15625, 35969};
        onNavigationEvent = -2415287548308331950L;
    }
}
