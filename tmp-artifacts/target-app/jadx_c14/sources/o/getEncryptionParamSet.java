package o;

import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getEncryptionParamSet;
import o.getPrivacyDestinationUri;
import o.y1ExternalSyntheticLambda3;
import o.y1a;
import o.y1b;
import viva.republica.toss.R;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getEncryptionParamSet {
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault;
    private static int access100;
    private static long asBinder;
    private static getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    public static final getEncryptionParamSet onNavigationEvent;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static final byte[] $$a = {102, 12, 98, 84};
    private static final int $$b = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 0;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, int r9) {
        /*
            byte[] r0 = o.getEncryptionParamSet.$$a
            int r9 = r9 * 3
            int r9 = r9 + 97
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEncryptionParamSet.$$c(int, short, int):java.lang.String");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 33;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = ~(i2 | i6);
        int i10 = i7 | (~i2);
        int i11 = i9 | (~(i10 | i4));
        int i12 = (~i4) | i10;
        int i13 = i2 + i6 + i3 + (1134938392 * i) + ((-1730424158) * i5);
        int i14 = i13 * i13;
        int i15 = (1345404558 * i2) + 1061748736 + ((-382549644) * i6) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i3) + (1924136960 * i) + (748945408 * i5) + (912850944 * i14);
        int i16 = (i2 * 1914917686) + 639827133 + (i6 * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (i3 * 1914918157) + (i * (-1451741640)) + (i5 * (-1338016710)) + (i14 * (-1605042176));
        return i15 + ((i16 * i16) * (-230752256)) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 1;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 21;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1555011808, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1555011807);
        int i5 = onTransact + 83;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 105;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    public final getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i5 = i3 + 59;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r26, int r27, char r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEncryptionParamSet.a(int, int, char, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r14) throws java.lang.Throwable {
        /*
            r0 = 0
            r1 = r14[r0]
            r2 = r1
            o.AppLovinNativeAdImplExternalSyntheticLambda1 r2 = (o.AppLovinNativeAdImplExternalSyntheticLambda1) r2
            r1 = 1
            r3 = r14[r1]
            r10 = r3
            o.CameraCaptureResultEmptyCameraCaptureResult r10 = (o.CameraCaptureResultEmptyCameraCaptureResult) r10
            r13 = 2
            r14 = r14[r13]
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            int r3 = r13 % r13
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r4 = r14 & 6
            if (r4 != 0) goto L37
            boolean r4 = r10.onNavigationEvent(r2)
            r4 = r4 ^ r1
            if (r4 == 0) goto L29
        L27:
            r4 = r13
            goto L36
        L29:
            int r4 = o.getEncryptionParamSet.asInterface
            int r4 = r4 + 121
            int r5 = r4 % 128
            o.getEncryptionParamSet.onTransact = r5
            int r4 = r4 % r13
            if (r4 == 0) goto L35
            goto L27
        L35:
            r4 = 4
        L36:
            r14 = r14 | r4
        L37:
            r4 = r14 & 19
            r5 = 18
            if (r4 == r5) goto L3f
            r4 = r1
            goto L40
        L3f:
            r4 = r0
        L40:
            r6 = r14 & 1
            boolean r4 = r10.onWarmupCompleted(r4, r6)
            if (r4 == 0) goto La4
            boolean r4 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r4 == 0) goto L57
            r4 = -1
            java.lang.String r6 = "viva.republica.toss.cardrecommend.issuev2.ui.ComposableSingletons$CardIssueSubmitFragmentKt.lambda$1976881566.<anonymous> (CardIssueSubmitFragment.kt:233)"
            r7 = 1976881566(0x75d4d19e, float:5.395598E32)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r7, r14, r4, r6)
        L57:
            int r3 = android.view.MotionEvent.axisFromString(r3)
            int r3 = r3 + r1
            int r4 = android.os.Process.myTid()
            int r4 = r4 >> 22
            int r4 = 50 - r4
            int r6 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r6 = r6 >> 16
            char r6 = (char) r6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            a(r3, r4, r6, r1)
            r0 = r1[r0]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = r0.intern()
            r4 = 0
            r0 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            int r14 = r14 << r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r5
            r11 = r14 | 6
            r12 = 62
            r5 = r0
            r2.IAuthTabCallback(r3, r4, r5, r7, r8, r9, r10, r11, r12)
            boolean r14 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r14 == 0) goto La7
            int r14 = o.getEncryptionParamSet.onTransact
            int r14 = r14 + 79
            int r0 = r14 % 128
            o.getEncryptionParamSet.asInterface = r0
            int r14 = r14 % r13
            if (r14 == 0) goto L9f
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto La7
        L9f:
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            r14 = 0
            throw r14
        La4:
            r10.ICustomTabsCallbackStubProxy()
        La7:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            int r0 = o.getEncryptionParamSet.onTransact
            int r0 = r0 + 31
            int r1 = r0 % 128
            o.getEncryptionParamSet.asInterface = r1
            int r0 = r0 % r13
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEncryptionParamSet.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit IAuthTabCallback(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onTransact + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar)) {
                int i7 = asInterface + 109;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = asInterface;
            int i10 = i9 + 107;
            onTransact = i10 % 128;
            z = i10 % 2 == 0;
            int i11 = i9 + 57;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i13 = asInterface + 17;
            onTransact = i13 % 128;
            if (i13 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1271513068, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.ComposableSingletons$CardIssueSubmitFragmentKt.lambda$-1271513068.<anonymous> (CardIssueSubmitFragment.kt:229)");
            }
            y1bVar.onExtraCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), (Function0) null, onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 199686, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static {
        access100 = 1;
        onNavigationEvent();
        onNavigationEvent = new getEncryptionParamSet();
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(716136967, false, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.ComposableSingletons$CardIssueSubmitFragmentKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return getEncryptionParamSet.onNavigationEvent((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(429087814, false, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.ComposableSingletons$CardIssueSubmitFragmentKt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return getEncryptionParamSet.onExtraCallbackWithResult((y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(1976881566, false, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.ComposableSingletons$CardIssueSubmitFragmentKt$$ExternalSyntheticLambda2
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return getEncryptionParamSet.onNavigationEvent((AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1271513068, false, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.ComposableSingletons$CardIssueSubmitFragmentKt$$ExternalSyntheticLambda3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return getEncryptionParamSet.onExtraCallback((y1b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        int i = IAuthTabCallbackStub + 111;
        access100 = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onWarmupCompleted(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ^ true ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = asInterface + 5;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i6 = onTransact + 93;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = asInterface + 47;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(716136967, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.ComposableSingletons$CardIssueSubmitFragmentKt.lambda$716136967.<anonymous> (CardIssueSubmitFragment.kt:238)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.card_issue_submit_retry_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i4 = asInterface + 57;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3);
                obj.hashCode();
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i5 = onTransact + 83;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i7 = asInterface + 1;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(429087814, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.ComposableSingletons$CardIssueSubmitFragmentKt.lambda$429087814.<anonymous> (CardIssueSubmitFragment.kt:246)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.card_issue_submit_retry_description, cameraCaptureResultEmptyCameraCaptureResult, 0), null, 0L, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 6}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1555011808, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1555011807);
    }

    public final getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (getBacktraceNote) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 61405817, iOnNavigationEvent2, new Object[]{this}, iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -61405817);
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = new char[]{60860, 35624, 8368, 56892, 30599, 60742, 35531, 8259, 55783, 30568, 60645, 35448, 9181, 55647, 30346, 60504, 34107, 8879, 55351, 29154, 61213, 33937, 8779, 56287, 29040, 61105, 33889, 15841, 56155, 28886, 61005, 34783, 15611, 55849, 29685, 59658, 34497, 15437, 54749, 29505, 59622, 34425, 16368, 54649, 29382, 59474, 33162, 16220, 54330, 19899};
        asBinder = -1159519415067440292L;
    }
}
