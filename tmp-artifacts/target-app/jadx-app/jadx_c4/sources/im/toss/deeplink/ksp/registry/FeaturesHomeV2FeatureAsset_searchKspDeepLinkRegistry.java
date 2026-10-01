package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.home.feature.asset_search.AssetSearchActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesHomeV2FeatureAsset_searchKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static final byte[] $$a = {29, -59, -25, -119};
    private static final int $$b = 189;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onExtraCallbackWithResult = {60839, 21633, 40932, 50897, 2342, 28672, 47995, 57927, 9383, 28622, 54971, 6555, 16444, 35611, 62073, 13649, 32763, 42645, 59879, 20679, 39729, 49664, 1339, 19527, 46769, 63893, 8422, 27607, 53820};
    private static long IAuthTabCallback = 6218137664304796916L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        int i5 = 97 - (i2 * 2);
        byte[] bArr = $$a;
        int i6 = i + 4;
        int i7 = (s * 4) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            int i9 = i6;
            int i10 = (-i6) + i8;
            i3 = i4;
            int i11 = i9;
            i5 = i10;
            i6 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            int i12 = i6 + 1;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i5;
            i9 = i12;
            i6 = bArr[i12];
            i8 = i13;
            int i102 = (-i6) + i8;
            i3 = i4;
            int i112 = i9;
            i5 = i102;
            i6 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            int i122 = i6 + 1;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            int i1222 = i6 + 1;
            if (i4 == i7) {
            }
        }
    }

    /* renamed from: $r8$lambda$D9A2YtaU-wiSt30hGvomaBaSVws, reason: not valid java name */
    public static /* synthetic */ Class m173$r8$lambda$D9A2YtaUwiSt30hGvomaBaSVws() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            _init_$lambda$0();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onWarmupCompleted + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesHomeV2FeatureAsset_searchKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", ""), 29 - Color.red(0), (char) Drawable.resolveOpacity(0, 0), objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureAsset_searchKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM173$r8$lambda$D9A2YtaUwiSt30hGvomaBaSVws = FeaturesHomeV2FeatureAsset_searchKspDeepLinkRegistry.m173$r8$lambda$D9A2YtaUwiSt30hGvomaBaSVws();
                int i4 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return clsM173$r8$lambda$D9A2YtaUwiSt30hGvomaBaSVws;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return AssetSearchActivity.class;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 17, 10973 - (ViewConfiguration.getJumpTapTimeout() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf("", "") + 31, 20220 - TextUtils.indexOf("", ""), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 49124), 43 - ImageFormat.getBitsPerPixel(0), 1495 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $10 + 93;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 33;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ExpandableListView.getPackedPositionChild(0L)), View.MeasureSpec.getMode(0) + 44, TextUtils.getTrimmedLength("") + 1494, -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i8 = 54 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - ((Process.getThreadPriority(0) + 20) >> 6)), View.resolveSizeAndState(0, 0, 0) + 44, KeyEvent.getDeadChar(0, 0) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr);
        int i9 = $11 + 69;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
