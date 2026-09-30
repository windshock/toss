package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.featurescommon.servicetermsagreement.standardtermsv2.test.StandardTermsV2TestActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesCommonServiceTermsAgreementStandardtermsV2TestKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final byte[] $$a = {5, 64, Byte.MAX_VALUE, 81};
    private static final int $$b = 252;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2;
        int i3 = (s * 3) + 4;
        int i4 = 105 - (b * 3);
        byte[] bArr = $$a;
        int i5 = (b2 * 4) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i4;
            i4 = i5;
            i2 = 0;
            i4 += i6;
            i3++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i4 += i6;
            i3++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ Class $r8$lambda$clY0l4yyRw6vQNV8bItD1Q7fWIE() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onWarmupCompleted + 81;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    static {
        onExtraCallback = 0;
        IAuthTabCallback();
        int i = IAuthTabCallback + 11;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesCommonServiceTermsAgreementStandardtermsV2TestKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(34 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15, new char[]{3, 65484, 19, 4, 17, '\f', 18, 65484, 19, 4, 18, 19, 65484, 21, 65489, 18, 20, 15, 4, 17, 19, 14, 18, 18, 65497, 65486, 65486, 18, 19, 0, '\r', 3, 0, 17}, false, 159 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCommonServiceTermsAgreementStandardtermsV2TestKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                Class cls$r8$lambda$clY0l4yyRw6vQNV8bItD1Q7fWIE;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 71;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    cls$r8$lambda$clY0l4yyRw6vQNV8bItD1Q7fWIE = FeaturesCommonServiceTermsAgreementStandardtermsV2TestKspDeepLinkRegistry.$r8$lambda$clY0l4yyRw6vQNV8bItD1Q7fWIE();
                    int i3 = 31 / 0;
                } else {
                    cls$r8$lambda$clY0l4yyRw6vQNV8bItD1Q7fWIE = FeaturesCommonServiceTermsAgreementStandardtermsV2TestKspDeepLinkRegistry.$r8$lambda$clY0l4yyRw6vQNV8bItD1Q7fWIE();
                }
                int i4 = onWarmupCompleted + 95;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$clY0l4yyRw6vQNV8bItD1Q7fWIE;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
        return StandardTermsV2TestActivity.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - TextUtils.getOffsetAfter("", 0)), View.MeasureSpec.getMode(0) + 23, 10277 - TextUtils.indexOf((CharSequence) "", '0'), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12843), 55 - ExpandableListView.getPackedPositionGroup(0L), 2167 - (ViewConfiguration.getLongPressTimeout() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i7 = $10 + 121;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        if (z) {
            int i9 = $11 + 51;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 12843), View.combineMeasuredStates(0, 0) + 55, 2167 - TextUtils.indexOf("", "", 0, 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            int i10 = $10 + 29;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = 478308884;
    }
}
