package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.home.feature.asset_home.activity.AssetHomeEditNavActivity;
import im.toss.features.home.feature.asset_home.activity.AssetHomeMydataIntroActivity;
import im.toss.features.home.feature.asset_home.activity.home.AssetInvestmentHomeActivity;
import im.toss.features.home.feature.asset_home.activity.home.AssetOtherDetailActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static long IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Class $r8$lambda$BmZEWdie0khql2Z6m5KQow7n5Yk() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i4 = onNavigationEvent + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$4;
    }

    public static /* synthetic */ Class $r8$lambda$HGtfes_DpI0iLtDsKsoskPcQM98() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$6 = _init_$lambda$6();
        int i4 = onExtraCallback + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$6;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$Ido3e0uuw-H8eVJs5DwoYC3DgcI, reason: not valid java name */
    public static /* synthetic */ Class m172$r8$lambda$Ido3e0uuwH8eVJs5DwoYC3DgcI() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$MQnlfmlC9xvw4H6f5OZH7pnWT0Y() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i4 = onExtraCallback + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$3;
    }

    public static /* synthetic */ Class $r8$lambda$QSEnlVjnNiL_BUhQzpq27a8JybY() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$7 = _init_$lambda$7();
        int i4 = onExtraCallback + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return cls_init_$lambda$7;
    }

    public static /* synthetic */ Class $r8$lambda$bBpW1hwu9LOL6X4j5MDgTcR9HSA() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$5 = _init_$lambda$5();
        int i4 = onExtraCallback + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$wCc7Q9_2MYOz2fZhHZOO8NK23Eg() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$xGFR135AcTCNq7StSGh4XfHGn2M() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$2();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i3 = onExtraCallback + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$2;
    }

    static {
        onWarmupCompleted();
        int i = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 93;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$wCc7Q9_2MYOz2fZhHZOO8NK23Eg = FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.$r8$lambda$wCc7Q9_2MYOz2fZhHZOO8NK23Eg();
                int i4 = onWarmupCompleted + 93;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$wCc7Q9_2MYOz2fZhHZOO8NK23Eg;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.ALL;
        Object[] objArr = new Object[1];
        a(new char[]{7898, 7849, 51478, 57413, 48567, 61323, 61939, 35556, 47664, 11663, 19260, 53642, 22425, 37417, 9956, 13694, 62330, 63172, 64974, 39084, 35989, 23458, 22888, 64594, 10311, 32815, 13532, 17387, 50479, 58516, 36866, 42626, 40582, 18798, 28593, 2628, 14967, 44506, 51935, 20896, 55286, 4698, 42558, 46416, 29508, 30503, 32249, 6398}, TextUtils.indexOf("", "", 0), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{22294, 22373, 16590, 27037, 36250, 57254, 18430, 15593, 62460, 42071, 31505, 26503, 7765, 7153, 5833, 33651, 47798, 32540, 52707, 11937, 50521, 53882, 26949, 19039, 24971, 2551, 1265, 62973, 36072, 27997, 40995, 4239, 55114, 49342, 24459, 48138, 29602, 9302, 64254, 59299, 40483, 39814}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                Class clsM172$r8$lambda$Ido3e0uuwH8eVJs5DwoYC3DgcI;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 87;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM172$r8$lambda$Ido3e0uuwH8eVJs5DwoYC3DgcI = FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.m172$r8$lambda$Ido3e0uuwH8eVJs5DwoYC3DgcI();
                    int i3 = 17 / 0;
                } else {
                    clsM172$r8$lambda$Ido3e0uuwH8eVJs5DwoYC3DgcI = FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.m172$r8$lambda$Ido3e0uuwH8eVJs5DwoYC3DgcI();
                }
                int i4 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return clsM172$r8$lambda$Ido3e0uuwH8eVJs5DwoYC3DgcI;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{59652, 59767, 43069, 33134, 29448, 8500, 63805, 33322, 19950, 19620, 34179, 55620, 41031, 62210, 59483, 15792, 1188, 38895, 13169, 36962, 31563, 14985, 38871, 62620, 57241, 57604, 64099, 19256, 13024, 34224, 24241, 44621, 26881, 10305, 41231, 724, 52641, 52476, 1065, 22887, 8243, 29565, 26825}, ViewConfiguration.getTouchSlop() >> 8, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 83;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$xGFR135AcTCNq7StSGh4XfHGn2M = FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.$r8$lambda$xGFR135AcTCNq7StSGh4XfHGn2M();
                int i4 = onWarmupCompleted + 97;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$xGFR135AcTCNq7StSGh4XfHGn2M;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new char[]{53481, 53402, 33974, 44517, 49713, 36877, 29336, 2447, 29699, 24623, 13498, 21217, 39338, 57225, 22882, 46613, 15689, 47972, 33352, 7111, 17062, 5634, 9966, 32569, 58996, 52623, 19290, 49303, 2845, 43322, 61337, 9653, 20645, 1230, 4149, 35181, 62554, 57450, 46409}, View.combineMeasuredStates(0, 0), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$MQnlfmlC9xvw4H6f5OZH7pnWT0Y = FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.$r8$lambda$MQnlfmlC9xvw4H6f5OZH7pnWT0Y();
                int i4 = onNavigationEvent + 79;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$MQnlfmlC9xvw4H6f5OZH7pnWT0Y;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(new char[]{20951, 20900, 57123, 63088, 52786, 39950, 38509, 60794, 62781, 15290, 14521, 46612, 6292, 33820, 21857, 21216, 48247, 57585, 36427, 65330, 50072, 19863, 10989, 39884, 26442, 38426, 18265, 9314, 35363, 62127, 58266, 49472, 53660, 24415, 7220, 28051}, Gravity.getAbsoluteGravity(0, 0), objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$BmZEWdie0khql2Z6m5KQow7n5Yk = FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.$r8$lambda$BmZEWdie0khql2Z6m5KQow7n5Yk();
                int i4 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$BmZEWdie0khql2Z6m5KQow7n5Yk;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        a(new char[]{18014, 17965, 49708, 60287, 15958, 27754, 3327, 30696, 58036, 9909, 51421, 11398, 3869, 39187, 42245, 51314, 44030, 65022, 32303, 26016, 54289, 20632, 55945, 350, 28867, 35605, 46909, 48880, 40362, 61344, 5118, 23506, 50714, 16990, 60483, 63243}, ViewConfiguration.getLongPressTimeout() >> 16, objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.$r8$lambda$bBpW1hwu9LOL6X4j5MDgTcR9HSA();
                }
                FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.$r8$lambda$bBpW1hwu9LOL6X4j5MDgTcR9HSA();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr7 = new Object[1];
        a(new char[]{10177, 10162, 4773, 15350, 30618, 9638, 9014, 22561, 33579, 63036, 33041, 847, 28290, 18842, 60617, 59323, 51809, 11639, 14307, 19049, 46478, 32785, 37701, 11927, 4444, 23452, 65265, 37177, 64565, 16169, 23090, 29723, 42880, 37590, 42392, 55497, 882, 30308, 251, 33633, 61175, 51708}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$HGtfes_DpI0iLtDsKsoskPcQM98 = FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.$r8$lambda$HGtfes_DpI0iLtDsKsoskPcQM98();
                int i4 = onWarmupCompleted + 109;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$HGtfes_DpI0iLtDsKsoskPcQM98;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr8 = new Object[1];
        a(new char[]{40516, 40503, 42698, 36761, 56371, 36367, 36934, 60241, 15022, 16979, 10936, 45119, 55047, 65013, 18272, 21707, 29668, 39192, 40010, 63769, 3083, 13438, 14572, 40423, 43225, 61427, 21848, 8777, 17840, 35654, 61851, 51051, 7683, 9891, 3631, 27577, 47862, 49746, 43870, 12295, 22383, 32130, 51171}, (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr8);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.$r8$lambda$QSEnlVjnNiL_BUhQzpq27a8JybY();
                }
                FeaturesHomeV2FeatureAsset_homeKspDeepLinkRegistry.$r8$lambda$QSEnlVjnNiL_BUhQzpq27a8JybY();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return AssetHomeMydataIntroActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return AssetInvestmentHomeActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return AssetOtherDetailActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return AssetHomeEditNavActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$4() {
        Class<AssetHomeEditNavActivity> cls;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            cls = AssetHomeEditNavActivity.class;
            int i4 = 32 / 0;
        } else {
            cls = AssetHomeEditNavActivity.class;
        }
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return AssetHomeEditNavActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$6() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return AssetHomeEditNavActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$7() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return AssetHomeEditNavActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 81;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45812), 84 - KeyEvent.getDeadChar(0, 0), Color.green(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, (KeyEvent.getMaxKeyCode() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 45;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 1919172608126833194L;
    }
}
