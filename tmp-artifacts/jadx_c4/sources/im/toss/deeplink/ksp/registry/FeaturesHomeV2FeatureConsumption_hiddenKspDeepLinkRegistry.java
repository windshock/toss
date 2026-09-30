package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.home.feature.consumption_hidden.ConsumptionHiddenActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesHomeV2FeatureConsumption_hiddenKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$EQ26Y8kNGadbvOt2T3pyFMw2_Ek() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = asInterface + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        int i = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesHomeV2FeatureConsumption_hiddenKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{8325, 38074, 56771, 52446, 14378, 58536, 5521, 26079, 33256, 8293, 13154, 11965, 4903, 50706, 57888, 64126, 57314, 50655, 57729, 51459, 8325, 38074, 4959, 34388, 42332, 25687, 57729, 51459, 37756, 53274, 35214, 39466, 65471, 13073, 46351, 43254}, View.resolveSizeAndState(0, 0, 0) + 35, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureConsumption_hiddenKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 25;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesHomeV2FeatureConsumption_hiddenKspDeepLinkRegistry.$r8$lambda$EQ26Y8kNGadbvOt2T3pyFMw2_Ek();
                }
                FeaturesHomeV2FeatureConsumption_hiddenKspDeepLinkRegistry.$r8$lambda$EQ26Y8kNGadbvOt2T3pyFMw2_Ek();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 59;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return ConsumptionHiddenActivity.class;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 35;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $11 + 49;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i3, i3));
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', i3);
                        int minimumFlingVelocity = 12434 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iLastIndexOf, minimumFlingVelocity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), 10 - Color.red(0), Gravity.getAbsoluteGravity(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 16014), 14 - View.combineMeasuredStates(0, 0), 19901 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onExtraCallback = (char) 8582;
        onExtraCallbackWithResult = (char) 37663;
        IAuthTabCallback = (char) 50050;
        onWarmupCompleted = (char) 36255;
    }
}
