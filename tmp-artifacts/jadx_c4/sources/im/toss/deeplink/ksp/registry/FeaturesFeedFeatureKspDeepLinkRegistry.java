package im.toss.deeplink.ksp.registry;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.feed.FeedActivity;
import im.toss.features.feed.settings.NotificationAllSettingActivity;
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
public final class FeaturesFeedFeatureKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static char IAuthTabCallback;
    private static int asBinder;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static final byte[] $$a = {93, 49, 76, -114};
    private static final int $$b = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        byte[] bArr = $$a;
        int i2 = 110 - s;
        int i3 = 4 - (b * 3);
        int i4 = b2 * 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            int i7 = 0;
            int i8 = i5 + 1;
            int i9 = (-i3) + i6;
            i = i7;
            i2 = i9;
            i3 = i8;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            int i10 = i2;
            i5 = i3;
            i3 = bArr[i3];
            i7 = i + 1;
            i6 = i10;
            int i82 = i5 + 1;
            int i92 = (-i3) + i6;
            i = i7;
            i2 = i92;
            i3 = i82;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    /* renamed from: $r8$lambda$-r_ajGKter3yiwmp5JtkP0DvvhY, reason: not valid java name */
    public static /* synthetic */ Class m141$r8$lambda$r_ajGKter3yiwmp5JtkP0DvvhY() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    /* renamed from: $r8$lambda$jQ8NwgAz2fy1--tmpv00CvNuvR0, reason: not valid java name */
    public static /* synthetic */ Class m142$r8$lambda$jQ8NwgAz2fy1tmpv00CvNuvR0() {
        Class cls_init_$lambda$1;
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$1 = _init_$lambda$1();
            int i3 = 31 / 0;
        } else {
            cls_init_$lambda$1 = _init_$lambda$1();
        }
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$qMatmZNc6sUX__HI1ljakhULb3k() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        throw null;
    }

    static {
        asBinder = 0;
        onExtraCallback();
        int i = IAuthTabCallbackDefault + 37;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FeaturesFeedFeatureKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesFeedFeatureKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 1;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$qMatmZNc6sUX__HI1ljakhULb3k = FeaturesFeedFeatureKspDeepLinkRegistry.$r8$lambda$qMatmZNc6sUX__HI1ljakhULb3k();
                int i4 = IAuthTabCallback + 45;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$qMatmZNc6sUX__HI1ljakhULb3k;
            }
        };
        TargetRegion targetRegion = TargetRegion.ALL;
        Object[] objArr = new Object[1];
        a((char) (46029 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf("", ""), new char[]{17295, 25822, 65458, 19064, 52865, 41425, 2398, 30840, 61272, 37766, 54806, 59874, 9890, 1878, 6519, 22645}, new char[]{59457, 45785, 41178, 8389}, new char[]{34957, 44886, 52327, 59571}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 989331635 - View.resolveSizeAndState(0, 0, 0), new char[]{59509, 54411, 38186, 1585, 5176, 42855, 32059, 59926, 51264, 49746, 21965, 60466, 45609, 3372, 54644, 39511, 20700, 15601, 48232, 45937, 63595, 59166, 44270, 31017, 21947, 21750, 4262, 4706, 44484, 42805, 4763, 4189, 56910}, new char[]{59457, 45785, 41178, 8389}, new char[]{45848, 63488, 30266, 25092}, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesFeedFeatureKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 71;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM142$r8$lambda$jQ8NwgAz2fy1tmpv00CvNuvR0 = FeaturesFeedFeatureKspDeepLinkRegistry.m142$r8$lambda$jQ8NwgAz2fy1tmpv00CvNuvR0();
                int i4 = onExtraCallback + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return clsM142$r8$lambda$jQ8NwgAz2fy1tmpv00CvNuvR0;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a((char) (36305 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{62783, 1684, 50804, 42733, 44004, 29717, 21274, 37064, 7988, 1872, 492, 29171, 38228, 48295, 43867, 56694, 40292, 56550, 46484, 39763, 36289, 62653, 41772, 60777, 23409, 23029, 60624, 8123, 18511, 35745, 4264, 38091, 53828, 43846, 25444, 22640, 43571, 17304, 57608, 5900}, new char[]{59457, 45785, 41178, 8389}, new char[]{28273, 55800, 53306, 10381}, objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesFeedFeatureKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM141$r8$lambda$r_ajGKter3yiwmp5JtkP0DvvhY = FeaturesFeedFeatureKspDeepLinkRegistry.m141$r8$lambda$r_ajGKter3yiwmp5JtkP0DvvhY();
                int i4 = onExtraCallback + 67;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM141$r8$lambda$r_ajGKter3yiwmp5JtkP0DvvhY;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return FeedActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return NotificationAllSettingActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return NotificationAllSettingActivity.class;
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
            int i5 = $11 + 75;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 43;
                    int iResolveOpacity = 1451 - Drawable.resolveOpacity(i4, i4);
                    byte b = (byte) ($$b - i2);
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, jumpTapTimeout, iResolveOpacity, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char c3 = (char) ((ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 49124);
                    int packedPositionGroup = 44 - ExpandableListView.getPackedPositionGroup(0L);
                    int i7 = 1494 - (ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1));
                    byte b3 = (byte) ($$b - 2);
                    byte b4 = (byte) (b3 + 1);
                    String str$$c2 = $$c(b3, b4, (byte) (b4 - 1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, packedPositionGroup, i7, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i4] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char edgeSlop = (char) (23972 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50;
                    int keyRepeatDelay = 22939 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i4] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(edgeSlop, minimumFlingVelocity, keyRepeatDelay, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i4] = Integer.valueOf(i9);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char cIndexOf = (char) (45848 - TextUtils.indexOf("", "", i4));
                    int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29;
                    int gidForName = Process.getGidForName("") + 12578;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i4] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, minimumFlingVelocity2, gidForName, 1401536470, false, "l", clsArr4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i10 = $10 + 57;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 2 % 3;
                }
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

    static void onExtraCallback() {
        onNavigationEvent = 5548343396176266170L;
        onExtraCallbackWithResult = -1776194565;
        IAuthTabCallback = (char) 27643;
    }
}
