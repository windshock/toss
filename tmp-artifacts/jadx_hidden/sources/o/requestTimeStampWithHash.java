package o;

import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;

/* loaded from: classes.dex */
public final class requestTimeStampWithHash {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static long onNavigationEvent = -2415743633491202069L;

    public static final /* synthetic */ String IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(str);
        int i4 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 7;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onNavigationEvent);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i5 = $11 + 89;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String onNavigationEvent(java.lang.String r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            if (r4 == 0) goto L17
            boolean r1 = kotlin.text.StringsKt.isBlank(r4)
            if (r1 == 0) goto Lc
            goto L17
        Lc:
            int r1 = o.requestTimeStampWithHash.onExtraCallbackWithResult
            int r1 = r1 + 115
            int r2 = r1 % 128
            o.requestTimeStampWithHash.IAuthTabCallback = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L21
        L17:
            int r4 = o.requestTimeStampWithHash.IAuthTabCallback
            int r4 = r4 + 71
            int r1 = r4 % 128
            o.requestTimeStampWithHash.onExtraCallbackWithResult = r1
            int r4 = r4 % r0
            r4 = 0
        L21:
            if (r4 != 0) goto L62
            int r4 = o.requestTimeStampWithHash.onExtraCallbackWithResult
            int r4 = r4 + 77
            int r1 = r4 % 128
            o.requestTimeStampWithHash.IAuthTabCallback = r1
            int r4 = r4 % r0
            r0 = 0
            r1 = 1
            java.lang.String r2 = ""
            r3 = 11
            if (r4 != 0) goto L4e
            char[] r4 = new char[r3]
            r4 = {x0064: FILL_ARRAY_DATA , data: [-7641, 10812, -4356, -7598, 16053, -13135, -14503, -3478, -20012, 17096, -27656} // fill-array
            r3 = 64
            int r2 = android.text.TextUtils.lastIndexOf(r2, r3)
            int r2 = -r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            a(r4, r2, r1)
            r4 = r1[r0]
        L47:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            goto L62
        L4e:
            char[] r4 = new char[r3]
            r4 = {x0074: FILL_ARRAY_DATA , data: [-7641, 10812, -4356, -7598, 16053, -13135, -14503, -3478, -20012, 17096, -27656} // fill-array
            r3 = 48
            int r2 = android.text.TextUtils.lastIndexOf(r2, r3)
            int r2 = -r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            a(r4, r2, r1)
            r4 = r1[r0]
            goto L47
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requestTimeStampWithHash.onNavigationEvent(java.lang.String):java.lang.String");
    }
}
