package im.toss.deeplink.ksp.registry;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.home.presentation.consumption_income_transactions.HomeConsumptionIncomeTransactionsActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesHomePresentationConsumption_income_transactionsKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 18655;
    private static int IAuthTabCallbackDefault = 1;
    private static char onExtraCallback = 52589;
    private static char onExtraCallbackWithResult = 54665;
    private static char onNavigationEvent = 38330;
    private static int onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$phlusJJgbqPcv0b3JRmwuglmFTY() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesHomePresentationConsumption_income_transactionsKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{34769, 11600, 6350, 32759, 8347, 34763, 13520, 34655, 29663, 19041, 44499, 50934, 56351, 64735, 45903, 58729, 61513, 21120, 29486, 49350, 34769, 11600, 27404, 49871, 4744, 4904, 29486, 49350, 65074, 11037, 23771, 13597, 28751, 20805, 18236, 22321, 43241, 58354, 22097, 14749, 14307, 35001, 24993, 3797}, '[' - AndroidCharacter.getMirror('0'), objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomePresentationConsumption_income_transactionsKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesHomePresentationConsumption_income_transactionsKspDeepLinkRegistry.$r8$lambda$phlusJJgbqPcv0b3JRmwuglmFTY();
                }
                FeaturesHomePresentationConsumption_income_transactionsKspDeepLinkRegistry.$r8$lambda$phlusJJgbqPcv0b3JRmwuglmFTY();
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return HomeConsumptionIncomeTransactionsActivity.class;
        }
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
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 105;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', i3);
                        int iIndexOf2 = 12434 - TextUtils.indexOf("", "", i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyTid, iIndexOf, iIndexOf2, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 9 - TextUtils.indexOf((CharSequence) "", '0'), KeyEvent.getDeadChar(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $11 + 105;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 5 % 5;
                    }
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.indexOf("", "", 0)), 13 - ImageFormat.getBitsPerPixel(0), AndroidCharacter.getMirror('0') + 19853, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
