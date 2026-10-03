package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2SmallView;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ESSCertIDv2 extends isSignaturePolicyImplied implements RequireInput {
    private Function0<Unit> IAuthTabCallback;
    private final CardIssueOverviewViewModel asBinder;
    private final getDigestAlgorithms<?> asInterface;
    private final TypographyKtExternalSyntheticLambda0 onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final createNativeComponentTagApi onWarmupCompleted;
    private static final byte[] $$a = {7, 75, -84, -52};
    private static final int $$b = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private static long IAuthTabCallbackStub = 7798559133331975163L;
    private static int IAuthTabCallbackDefault = -1776194565;
    private static char onTransact = 34092;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, short r8) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r0 = o.ESSCertIDv2.$$a
            int r6 = r6 + 109
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ESSCertIDv2.$$c(byte, int, short):java.lang.String");
    }

    public static /* synthetic */ void IAuthTabCallback(ESSCertIDv2 eSSCertIDv2, View view) {
        int i = 2 % 2;
        int i2 = access100 + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback(eSSCertIDv2, view);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 115;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsAgreementRowV2SmallView tdsAgreementRowV2SmallView, createInMemoryClassLoader createinmemoryclassloader) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tdsAgreementRowV2SmallView, createinmemoryclassloader);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = getInterfaceDescriptor + 41;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ESSCertIDv2 eSSCertIDv2, TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(eSSCertIDv2, tdsCheckBoxV2View, z);
        int i4 = getInterfaceDescriptor + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public ESSCertIDv2(@NotNull createNativeComponentTagApi createnativecomponenttagapi, @NotNull Context context, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull getDigestAlgorithms<?> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(createnativecomponenttagapi, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.onWarmupCompleted = createnativecomponenttagapi;
        this.onExtraCallbackWithResult = context;
        this.onExtraCallback = typographyKtExternalSyntheticLambda0;
        this.asInterface = getdigestalgorithms;
        this.asBinder = cardIssueOverviewViewModel;
    }

    private static final Unit onNavigationEvent(ESSCertIDv2 eSSCertIDv2, TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsCheckBoxV2View, "");
        eSSCertIDv2.onNavigationEvent = z;
        Function0<Unit> function0 = eSSCertIDv2.IAuthTabCallback;
        if (function0 != null) {
            int i2 = access100 + 25;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            int i4 = access100 + 95;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = getInterfaceDescriptor + 73;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final void onExtraCallback(ESSCertIDv2 eSSCertIDv2, View view) {
        CardIssueOverviewViewModel cardIssueOverviewViewModel;
        String str;
        RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
        int i;
        int i2 = 2 % 2;
        createAdSizeApi createadsizeapiOnWarmupCompleted = eSSCertIDv2.onWarmupCompleted.onWarmupCompleted();
        if (createadsizeapiOnWarmupCompleted != null) {
            int i3 = getInterfaceDescriptor + 29;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            getDigestAlgorithms<?> getdigestalgorithms = eSSCertIDv2.asInterface;
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0 = eSSCertIDv2.onExtraCallback;
            if (i4 != 0) {
                cardIssueOverviewViewModel = eSSCertIDv2.asBinder;
                str = null;
                rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 = null;
                i = 19;
            } else {
                cardIssueOverviewViewModel = eSSCertIDv2.asBinder;
                str = null;
                rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 = null;
                i = 16;
            }
            getDigestAlgorithms.onExtraCallbackWithResult(getdigestalgorithms, typographyKtExternalSyntheticLambda0, createadsizeapiOnWarmupCompleted, cardIssueOverviewViewModel, str, rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1, i, (Object) null);
            int i5 = getInterfaceDescriptor + 69;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static final Unit IAuthTabCallback(TdsAgreementRowV2SmallView tdsAgreementRowV2SmallView, createInMemoryClassLoader createinmemoryclassloader) throws Throwable {
        int i = 2 % 2;
        resumeForClick resumeforclick = resumeForClick.asBinder;
        Context context = tdsAgreementRowV2SmallView.getContext();
        String strEncode = URLEncoder.encode(createinmemoryclassloader.onNavigationEvent(), "utf-8");
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0), new char[]{27896, 61896, 26554, 54051, 58977, 54141, 18081, 31784, 50919, 60807, 9804, 58376, 20114, 43923, 2812, 718, 51299, 17678, 38469, 40309}, new char[]{0, 0, 0, 0}, new char[]{39044, 58690, 14248, 59405}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strEncode);
        SessionTrackerb.onExtraCallbackWithResult(resumeforclick, context, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 45;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x020c A[PHI: r1
      0x020c: PHI (r1v3 android.widget.LinearLayout) = (r1v2 android.widget.LinearLayout), (r1v5 android.widget.LinearLayout) binds: [B:37:0x020a, B:34:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.isSignaturePolicyImplied
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onWarmupCompleted() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ESSCertIDv2.onWarmupCompleted():android.view.View");
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public Pair<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, Object> pairIAuthTabCallback = getWrite.IAuthTabCallback(this.onWarmupCompleted.onNavigationEvent(), Boolean.valueOf(this.onNavigationEvent));
        int i4 = getInterfaceDescriptor + 113;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return pairIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 33;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = function0;
        int i4 = access100 + 45;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $10 + 51;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (-b);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 42 - TextUtils.lastIndexOf("", '0', 0), TextUtils.getOffsetBefore("", 0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 49124), TextUtils.getCapsMode("", 0, 0) + 44, View.resolveSizeAndState(0, 0, 0) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, Color.alpha(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, ExpandableListView.getPackedPositionChild(0L) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (IAuthTabCallbackStub ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackDefault ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $11 + 41;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
