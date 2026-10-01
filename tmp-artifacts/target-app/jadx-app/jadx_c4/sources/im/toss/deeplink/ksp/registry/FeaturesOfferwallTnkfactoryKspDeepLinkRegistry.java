package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.offerwall.tnkfactory.TnkFactoryOfferwallHelpSchemeActivity;
import im.toss.features.offerwall.tnkfactory.TnkFactoryOfferwallSchemeActivity;
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
public final class FeaturesOfferwallTnkfactoryKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 98;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static long IAuthTabCallback = 7798559133331975163L;
    private static int onExtraCallbackWithResult = -1776194565;
    private static char onWarmupCompleted = 6737;

    private static String $$c(short s, short s2, byte b) {
        int i = s2 * 4;
        int i2 = s + 109;
        byte[] bArr = $$a;
        int i3 = (b * 2) + 4;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3++;
            i2 += i;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i3];
            i3++;
            i2 += b2;
        }
    }

    /* renamed from: $r8$lambda$pdCoauvxEcHfn-0J4PB3-T2F4VE, reason: not valid java name */
    public static /* synthetic */ Class m199$r8$lambda$pdCoauvxEcHfn0J4PB3T2F4VE() {
        Class cls_init_$lambda$0;
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$0 = _init_$lambda$0();
            int i3 = 30 / 0;
        } else {
            cls_init_$lambda$0 = _init_$lambda$0();
        }
        int i4 = onNavigationEvent + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    /* renamed from: $r8$lambda$z-lSCFO_dmOLwes6LqrxqN0gieQ, reason: not valid java name */
    public static /* synthetic */ Class m200$r8$lambda$zlSCFO_dmOLwes6LqrxqN0gieQ() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$1();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = onExtraCallback + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$1;
    }

    public FeaturesOfferwallTnkfactoryKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesOfferwallTnkfactoryKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM199$r8$lambda$pdCoauvxEcHfn0J4PB3T2F4VE = FeaturesOfferwallTnkfactoryKspDeepLinkRegistry.m199$r8$lambda$pdCoauvxEcHfn0J4PB3T2F4VE();
                if (i3 != 0) {
                    int i4 = 86 / 0;
                }
                return clsM199$r8$lambda$pdCoauvxEcHfn0J4PB3T2F4VE;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a((char) TextUtils.getTrimmedLength(""), (-47116633) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{35576, 35510, 21368, 30884, 31017, 47832, 23191, 42871, 45883, 54658, 37641, 5965, 49239, 58049, 997, 27378, 13800, 46207, 62674, 30831, 42841, 37919, 30117, 13135, 61087, 31889, 25983, 16568, 31332, 16251, 34448, 46095, 44900, 17660, 38097, 37633, 26267}, new char[]{0, 0, 0, 0}, new char[]{43129, 12558, 19453, 61357}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((char) Color.green(0), 123799618 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{57323, 56356, 48636, 61547, 9203, 44200, 13384, 29522, 8164, 18340, 298, 8285, 63465, 40144, 13943, 14186, 15900, 38296, 15520, 50844, 3590, 56855, 35893, 809, 6509, 55145, 61302, 12455, 61830, 29522, 56760, 4080, 20978, 39591, 27821, 65244, 19028}, new char[]{0, 0, 0, 0}, new char[]{17015, 24840, 60679, 57997}, objArr2);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesOfferwallTnkfactoryKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesOfferwallTnkfactoryKspDeepLinkRegistry.m200$r8$lambda$zlSCFO_dmOLwes6LqrxqN0gieQ();
                    throw null;
                }
                Class clsM200$r8$lambda$zlSCFO_dmOLwes6LqrxqN0gieQ = FeaturesOfferwallTnkfactoryKspDeepLinkRegistry.m200$r8$lambda$zlSCFO_dmOLwes6LqrxqN0gieQ();
                int i3 = onExtraCallback + 55;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return clsM200$r8$lambda$zlSCFO_dmOLwes6LqrxqN0gieQ;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return TnkFactoryOfferwallHelpSchemeActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return TnkFactoryOfferwallSchemeActivity.class;
        }
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i6 = $10 + 119;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $11 + 91;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 43;
                    int i10 = 1450 - (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1));
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, packedPositionType, i10, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i5;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 44 - Color.argb(i5, i5, i5, i5), 1494 - View.getDefaultSize(i5, i5), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 23972), 50 - Drawable.resolveOpacity(0, 0), 22938 - TextUtils.indexOf((CharSequence) "", '0', 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 29 - View.resolveSizeAndState(0, 0, 0), 12577 - Color.red(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
                i5 = 0;
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
