package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.global.features.kyc.au.main.GlobalKycAuSchemeActivity;
import im.toss.global.features.kyc.test.GlobalKycTestActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GlobalFeaturesKycKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static char IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static int onExtraCallbackWithResult;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {80, 83, -21, -55};
    private static final int $$b = 200;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    private static String $$c(int i, int i2, byte b) {
        int i3 = b * 2;
        int i4 = 110 - i;
        int i5 = 3 - (i2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 += i5;
            i5 = i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            int i8 = i5 + 1;
            if (i7 == i3) {
                return new String(bArr2, 0);
            }
            i4 = bArr[i8] + i4;
            i5 = i8;
            i6 = i7;
        }
    }

    /* renamed from: $r8$lambda$QeS3rlrd0-7u9XdLV9vygi4IRIk, reason: not valid java name */
    public static /* synthetic */ Class m267$r8$lambda$QeS3rlrd07u9XdLV9vygi4IRIk() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$0();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onNavigationEvent + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$XcUJh6rN_wpNtUQTa-T-MTb7guE, reason: not valid java name */
    public static /* synthetic */ Class m268$r8$lambda$XcUJh6rN_wpNtUQTaTMTb7guE() {
        Class cls_init_$lambda$1;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$1 = _init_$lambda$1();
            int i3 = 70 / 0;
        } else {
            cls_init_$lambda$1 = _init_$lambda$1();
        }
        int i4 = onNavigationEvent + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$1;
    }

    static {
        IAuthTabCallbackStub = 1;
        onExtraCallback();
        int i = asInterface + 41;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GlobalFeaturesKycKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2095736835, new char[]{62022, 36545, 26069, 25552, 54401, 43123, 13847, 57360, 55984, 6859, 39430, 14828, 48207, 20140, 51421, 38871, 49977, 60778, 37958, 47641, 11292, 58526, 44440, 35888, 25098}, new char[]{0, 0, 0, 0}, new char[]{1206, 60008, 38524, 43898}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesKycKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM267$r8$lambda$QeS3rlrd07u9XdLV9vygi4IRIk = GlobalFeaturesKycKspDeepLinkRegistry.m267$r8$lambda$QeS3rlrd07u9XdLV9vygi4IRIk();
                int i4 = onExtraCallbackWithResult + 29;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return clsM267$r8$lambda$QeS3rlrd07u9XdLV9vygi4IRIk;
                }
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.AU)));
        Object[] objArr2 = new Object[1];
        a((char) (Process.getGidForName("") + 16547), TextUtils.getOffsetBefore("", 0) - 1500079519, new char[]{7438, 28584, 4402, 44878, 60869, 49592, 2544, 61757, 10603, 60698, 54920, 9595, 23086, 21478, 27674, 9914, 11391, 29261, 35060, 17237, 40219, 62022, 16988, 37489, 27050, 39533, 51740}, new char[]{0, 0, 0, 0}, new char[]{24937, 38554, 41638, 1088}, objArr2);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesKycKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    GlobalFeaturesKycKspDeepLinkRegistry.m268$r8$lambda$XcUJh6rN_wpNtUQTaTMTb7guE();
                    obj.hashCode();
                    throw null;
                }
                Class clsM268$r8$lambda$XcUJh6rN_wpNtUQTaTMTb7guE = GlobalFeaturesKycKspDeepLinkRegistry.m268$r8$lambda$XcUJh6rN_wpNtUQTaTMTb7guE();
                int i3 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return clsM268$r8$lambda$XcUJh6rN_wpNtUQTaTMTb7guE;
                }
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.GLOBAL)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return GlobalKycAuSchemeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return GlobalKycTestActivity.class;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 45;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 43 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') + 1403, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49123), Drawable.resolveOpacity(0, 0) + 44, TextUtils.getTrimmedLength("") + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 50 - Color.green(0), 22939 - TextUtils.indexOf("", ""), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 45849), 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0', 0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 77;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onWarmupCompleted = 7798559133331975163L;
        onExtraCallbackWithResult = -1776194565;
        IAuthTabCallback = (char) 59164;
    }
}
