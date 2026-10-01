package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.featurescommon.address.search.impl.SearchAddressActivity;
import im.toss.featurescommon.address.search.impl.test.SearchAddressV2TestInputActivity;
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
public final class FeaturesCommonAddressSearchImplKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static long IAuthTabCallback;
    private static int asBinder;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {77, -67, -125, 9};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 1 - (i * 4);
        int i5 = b2 + 109;
        int i6 = b + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            int i9 = i6;
            int i10 = (-i6) + i7;
            i2 = i8;
            int i11 = i9;
            i5 = i10;
            i6 = i11;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            int i12 = i6 + 1;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            int i13 = i5;
            i9 = i12;
            i6 = bArr[i12];
            i8 = i3;
            i7 = i13;
            int i102 = (-i6) + i7;
            i2 = i8;
            int i112 = i9;
            i5 = i102;
            i6 = i112;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            int i122 = i6 + 1;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            int i1222 = i6 + 1;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ Class $r8$lambda$2Mb3fPjVA5qW5II5lHeR1f9XIMs() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onExtraCallbackWithResult + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    /* renamed from: $r8$lambda$QmGeJwIQKdiGaPTIw-Pp0luLf70, reason: not valid java name */
    public static /* synthetic */ Class m114$r8$lambda$QmGeJwIQKdiGaPTIwPp0luLf70() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$1();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = onExtraCallback + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    static {
        asBinder = 1;
        onWarmupCompleted();
        int i = onTransact + 73;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FeaturesCommonAddressSearchImplKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCommonAddressSearchImplKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 37;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesCommonAddressSearchImplKspDeepLinkRegistry.$r8$lambda$2Mb3fPjVA5qW5II5lHeR1f9XIMs();
                }
                FeaturesCommonAddressSearchImplKspDeepLinkRegistry.$r8$lambda$2Mb3fPjVA5qW5II5lHeR1f9XIMs();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a((char) KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0', 0) - 265498453, new char[]{10102, 61957, 9630, 2495, 24130, 6950, 11037, 17062, 56113, 9548, 1972, 3895, 4079, 58631, 54470, 12223, 16854, 32885, 40241, 35749, 44337, 21471, 53823, 43260, 29364}, new char[]{0, 0, 0, 0}, new char[]{43605, 11472, 63472, 48552}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((char) (25457 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{42493, 21366, 15255, 35769, 25879, 20603, 34653, 9385, 25841, 29048, 14312, 26943, 47780, 19351, 50253, 4500, 41051, 38730, 49763, 1586, 28684, 10095, 15414, 32660, 6222, 13143, 48261, 20243, 44803, 61347}, new char[]{0, 0, 0, 0}, new char[]{52899, 40240, 28924, 62563}, objArr2);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCommonAddressSearchImplKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM114$r8$lambda$QmGeJwIQKdiGaPTIwPp0luLf70 = FeaturesCommonAddressSearchImplKspDeepLinkRegistry.m114$r8$lambda$QmGeJwIQKdiGaPTIwPp0luLf70();
                int i4 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return clsM114$r8$lambda$QmGeJwIQKdiGaPTIwPp0luLf70;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return SearchAddressActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
        return SearchAddressV2TestInputActivity.class;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 39;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 1);
                    int iRed = 43 - Color.red(i4);
                    int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1450;
                    byte b = (byte) i4;
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, (byte) (-b2));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iRed, i7, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 49124), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, MotionEvent.axisFromString("") + 1495, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 23973), 50 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getTouchSlop() >> 8)), View.MeasureSpec.makeMeasureSpec(0, 0) + 29, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i8 = $10 + 35;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i2 = 2;
                i4 = 0;
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

    static void onWarmupCompleted() {
        IAuthTabCallback = 7798559133331975163L;
        onNavigationEvent = -1776194565;
        onWarmupCompleted = (char) 11748;
    }
}
