package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.tuba.Trigger;
import im.toss.core.tuba.TriggerFrequencyByPeriod;
import im.toss.core.tuba.TriggerInactiveHour;
import im.toss.core.tuba.TriggerLimit;
import im.toss.core.tuba.TriggerWhen;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceSDKExternalSyntheticLambda3;
import o.WebSocketFactory;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceSDKExternalSyntheticLambda3 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static char[] IAuthTabCallbackDefault = null;
    private static boolean IAuthTabCallbackStub = false;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static boolean asBinder;
    private static int getInterfaceDescriptor;
    private static int onTransact;
    private final Object IAuthTabCallback;
    private final ALCFaceSDK1 asInterface;
    private final Map<Trigger, Long> onExtraCallback;
    private final getFaceSDK onExtraCallbackWithResult;
    private final ALCFaceSDK11 onNavigationEvent;
    private final AppSetIdAndScope1 onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[ALCFaceSDK4ExternalSyntheticLambda0.values().length];
            try {
                iArr[ALCFaceSDK4ExternalSyntheticLambda0.EVERY.ordinal()] = 1;
                int i = onExtraCallback + 97;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ALCFaceSDK4ExternalSyntheticLambda0.EXACTLY.ordinal()] = 2;
                int i4 = IAuthTabCallback + 45;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 % 5;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    static {
        onNavigationEvent();
        Companion = new onWarmupCompleted(null);
        int i = getInterfaceDescriptor + 53;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i3) | i2);
        int i11 = i9 | i10 | (~(i2 | i));
        int i12 = (~(i | i3)) | (~(i7 | i3));
        int i13 = i8 | i10;
        int i14 = i3 + i2 + i4 + (793188503 * i6) + (2090109681 * i5);
        int i15 = i14 * i14;
        int i16 = (837707615 * i3) + 1286602752 + ((-1676358574) * i2) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i4) + (1186463744 * i6) + (1166540800 * i5) + ((-1956446208) * i15);
        int i17 = ((i3 * 1389925299) - 652765764) + (i2 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i4 * 1389926445) + (i6 * (-1551828341)) + (i5 * (-2047638435)) + (i15 * 1214709760);
        return i16 + ((i17 * i17) * 445972480) != 1 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r5 > r9) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 > r9) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 2 % 2;
        int i8 = access100;
        int i9 = i8 + 15;
        access000 = i9 % 128;
        int i10 = i9 % 2;
        if (i > i3 || (i == i3 && i2 >= i4)) {
            if (i >= i5) {
                if (i == i5) {
                    int i11 = i8 + 89;
                    access000 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 96 / 0;
                    }
                }
            }
            int i13 = i8 + 67;
            access000 = i13 % 128;
            int i14 = i13 % 2;
            return true;
        }
        int i15 = i8 + 117;
        access000 = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ALCFaceSDKExternalSyntheticLambda3 aLCFaceSDKExternalSyntheticLambda3, List list) {
        int i = 2 % 2;
        int i2 = access000 + 83;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, -1973756965, 1973756966, iIAuthTabCallback2, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{aLCFaceSDKExternalSyntheticLambda3, list}, iIAuthTabCallback3);
        }
        int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback5 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback6 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        throw null;
    }

    public ALCFaceSDKExternalSyntheticLambda3(@NotNull ALCFaceSDK1 aLCFaceSDK1, @NotNull ALCFaceSDK11 aLCFaceSDK11, @NotNull AppSetIdAndScope1 appSetIdAndScope1, @NotNull getFaceSDK getfacesdk) {
        Intrinsics.checkNotNullParameter(aLCFaceSDK1, "");
        Intrinsics.checkNotNullParameter(aLCFaceSDK11, "");
        Intrinsics.checkNotNullParameter(appSetIdAndScope1, "");
        Intrinsics.checkNotNullParameter(getfacesdk, "");
        this.asInterface = aLCFaceSDK1;
        this.onNavigationEvent = aLCFaceSDK11;
        this.onWarmupCompleted = appSetIdAndScope1;
        this.onExtraCallbackWithResult = getfacesdk;
        this.IAuthTabCallback = new Object();
        this.onExtraCallback = new LinkedHashMap();
        aLCFaceSDK1.onWarmupCompleted(new Function1() { // from class: im.toss.core.tuba.TubaTriggerController$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                ALCFaceSDKExternalSyntheticLambda3 aLCFaceSDKExternalSyntheticLambda3 = this.f$0;
                List list = (List) obj;
                if (i3 == 0) {
                    return ALCFaceSDKExternalSyntheticLambda3.onWarmupCompleted(aLCFaceSDKExternalSyntheticLambda3, list);
                }
                Unit unitOnWarmupCompleted = ALCFaceSDKExternalSyntheticLambda3.onWarmupCompleted(aLCFaceSDKExternalSyntheticLambda3, list);
                int i4 = 44 / 0;
                return unitOnWarmupCompleted;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ALCFaceSDKExternalSyntheticLambda3(ALCFaceSDK1 aLCFaceSDK1, ALCFaceSDK11 aLCFaceSDK11, AppSetIdAndScope1 appSetIdAndScope1, getFaceSDK getfacesdk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = access100 + 121;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                getfacesdk = ALCFaceSDKExternalSyntheticBackport0.IAuthTabCallback();
                int i3 = 87 / 0;
            } else {
                getfacesdk = ALCFaceSDKExternalSyntheticBackport0.IAuthTabCallback();
            }
            int i4 = 2 % 2;
        }
        this(aLCFaceSDK1, aLCFaceSDK11, appSetIdAndScope1, getfacesdk);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ALCFaceSDKExternalSyntheticLambda3 aLCFaceSDKExternalSyntheticLambda3 = (ALCFaceSDKExternalSyntheticLambda3) objArr[0];
        List<Trigger> list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 33;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 != 0) {
            int i4 = 65 / 0;
            if (list != null) {
                int i5 = i3 + 41;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                aLCFaceSDKExternalSyntheticLambda3.onWarmupCompleted(list);
            }
        } else if (list != null) {
        }
        return Unit.INSTANCE;
    }

    public final boolean onExtraCallbackWithResult(@NotNull Trigger trigger) {
        boolean z;
        C0062getAttributeExtension c0062getAttributeExtensionOnNavigationEvent;
        Intrinsics.checkNotNullParameter(trigger, "");
        synchronized (this.IAuthTabCallback) {
            Date dateOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback();
            C0063getFeatureExtension c0063getFeatureExtensionOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onNavigationEvent, trigger.onNavigationEvent());
            boolean z2 = false;
            if (c0063getFeatureExtensionOnExtraCallbackWithResult.onExtraCallbackWithResult(dateOnExtraCallback)) {
                trigger.onNavigationEvent();
                return false;
            }
            String str = (String) Trigger.onWarmupCompleted(new Object[]{trigger}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1524330962, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1524330962, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
            if (str != null && (c0062getAttributeExtensionOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(str)) != null && c0062getAttributeExtensionOnNavigationEvent.onExtraCallback(dateOnExtraCallback)) {
                return false;
            }
            TriggerLimit triggerLimitIAuthTabCallbackStub = trigger.IAuthTabCallbackStub();
            int iOnExtraCallbackWithResult = triggerLimitIAuthTabCallbackStub != null ? triggerLimitIAuthTabCallbackStub.onExtraCallbackWithResult() : -1;
            if (iOnExtraCallbackWithResult > 0 && iOnExtraCallbackWithResult <= c0063getFeatureExtensionOnExtraCallbackWithResult.IAuthTabCallback()) {
                return false;
            }
            Long l = this.onExtraCallback.get(trigger);
            if (l != null && dateOnExtraCallback.getTime() - l.longValue() < 1000) {
                return false;
            }
            if (((Boolean) onExtraCallbackWithResult(WebSocketFactory.onExtraCallback.IAuthTabCallback(), -529083009, 529083009, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this, dateOnExtraCallback, trigger.IAuthTabCallbackDefault()}, WebSocketFactory.onExtraCallback.IAuthTabCallback())).booleanValue()) {
                return false;
            }
            this.onExtraCallback.put(trigger, Long.valueOf(dateOnExtraCallback.getTime()));
            C0063getFeatureExtension c0063getFeatureExtensionOnTransact = c0063getFeatureExtensionOnExtraCallbackWithResult.onTransact();
            Objects.toString(c0063getFeatureExtensionOnTransact);
            this.onNavigationEvent.IAuthTabCallback(c0063getFeatureExtensionOnTransact);
            TriggerWhen triggerWhen = (TriggerWhen) Trigger.onWarmupCompleted(new Object[]{trigger}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -940316692, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 940316693, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
            if (triggerWhen == null) {
                z = true;
            } else {
                ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda0OnWarmupCompleted = triggerWhen.onWarmupCompleted();
                int i = aLCFaceSDK4ExternalSyntheticLambda0OnWarmupCompleted == null ? -1 : onNavigationEvent.onNavigationEvent[aLCFaceSDK4ExternalSyntheticLambda0OnWarmupCompleted.ordinal()];
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (c0063getFeatureExtensionOnTransact.onNavigationEvent() == triggerWhen.onExtraCallback()) {
                            z = true;
                        }
                    } else if (triggerWhen.onExtraCallback() > 0 && c0063getFeatureExtensionOnTransact.onNavigationEvent() > 0 && c0063getFeatureExtensionOnTransact.onNavigationEvent() % triggerWhen.onExtraCallback() == 0) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                extractFaceQuality extractfacequalityOnExtraCallbackWithResult = c0063getFeatureExtensionOnTransact.onExtraCallbackWithResult();
                TriggerFrequencyByPeriod triggerFrequencyByPeriod = (TriggerFrequencyByPeriod) Trigger.onWarmupCompleted(new Object[]{trigger}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -219465618, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 219465620, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
                if (triggerFrequencyByPeriod != null) {
                    if (extractfacequalityOnExtraCallbackWithResult != null && extractfacequalityOnExtraCallbackWithResult.onExtraCallbackWithResult(dateOnExtraCallback)) {
                        if (extractfacequalityOnExtraCallbackWithResult.IAuthTabCallback() <= 0) {
                        }
                        z = z2;
                    } else {
                        c0063getFeatureExtensionOnTransact = (C0063getFeatureExtension) C0063getFeatureExtension.IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{c0063getFeatureExtensionOnTransact, dateOnExtraCallback, Integer.valueOf(triggerFrequencyByPeriod.onExtraCallbackWithResult()), Integer.valueOf(triggerFrequencyByPeriod.IAuthTabCallback())}, 396314821, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -396314820, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
                    }
                    z2 = z;
                    z = z2;
                }
            }
            if (z) {
                C0063getFeatureExtension c0063getFeatureExtensionIAuthTabCallbackStub = c0063getFeatureExtensionOnTransact.IAuthTabCallbackStub();
                Objects.toString(c0063getFeatureExtensionIAuthTabCallbackStub);
                this.onNavigationEvent.IAuthTabCallback(c0063getFeatureExtensionIAuthTabCallbackStub);
            }
            return z;
        }
    }

    public final void onExtraCallback(@NotNull Trigger trigger, int i, @NotNull TimeUnit timeUnit) {
        Collection collectionListOf;
        Intrinsics.checkNotNullParameter(trigger, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (i <= 0) {
            return;
        }
        Date dateOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback();
        String str = (String) Trigger.onWarmupCompleted(new Object[]{trigger}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1524330962, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1524330962, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
        if (str != null) {
            List<Trigger> listOnExtraCallback = this.asInterface.onExtraCallback();
            if (listOnExtraCallback == null) {
                listOnExtraCallback = CollectionsKt.emptyList();
            }
            collectionListOf = new ArrayList();
            for (Object obj : listOnExtraCallback) {
                if (Intrinsics.areEqual((String) Trigger.onWarmupCompleted(new Object[]{(Trigger) obj}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1524330962, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1524330962, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()), str)) {
                    collectionListOf.add(obj);
                }
            }
        } else {
            collectionListOf = CollectionsKt.listOf(trigger);
        }
        synchronized (this.IAuthTabCallback) {
            Iterator it = collectionListOf.iterator();
            while (it.hasNext()) {
                C0063getFeatureExtension c0063getFeatureExtensionOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onNavigationEvent, ((Trigger) it.next()).onNavigationEvent());
                C0063getFeatureExtension c0063getFeatureExtensionOnWarmupCompleted = c0063getFeatureExtensionOnExtraCallbackWithResult.onWarmupCompleted(dateOnExtraCallback, i, timeUnit);
                if (c0063getFeatureExtensionOnWarmupCompleted.onWarmupCompleted() > c0063getFeatureExtensionOnExtraCallbackWithResult.onWarmupCompleted()) {
                    this.onNavigationEvent.IAuthTabCallback(c0063getFeatureExtensionOnWarmupCompleted);
                }
            }
            if (str != null) {
                C0062getAttributeExtension c0062getAttributeExtensionIAuthTabCallback = IAuthTabCallback(this.onNavigationEvent, str);
                C0062getAttributeExtension c0062getAttributeExtensionOnNavigationEvent = c0062getAttributeExtensionIAuthTabCallback.onNavigationEvent(dateOnExtraCallback, i, timeUnit);
                if (c0062getAttributeExtensionOnNavigationEvent.onExtraCallback() > c0062getAttributeExtensionIAuthTabCallback.onExtraCallback()) {
                    this.onNavigationEvent.onExtraCallbackWithResult(c0062getAttributeExtensionOnNavigationEvent);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        Date date = (Date) objArr[1];
        TriggerInactiveHour triggerInactiveHour = (TriggerInactiveHour) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 111;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (triggerInactiveHour == null) {
            return false;
        }
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, TextUtils.getOffsetBefore("", 0) + 127, objArr2);
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone(((String) objArr2[0]).intern()));
        calendar.setTime(date);
        int i3 = calendar.get(11);
        int i4 = calendar.get(12);
        if (triggerInactiveHour.onNavigationEvent() > triggerInactiveHour.onExtraCallbackWithResult()) {
            if (!onNavigationEvent(i3, i4, triggerInactiveHour.onNavigationEvent(), triggerInactiveHour.IAuthTabCallback(), 24, 0)) {
                int i5 = access000 + 87;
                access100 = i5 % 128;
                if (i5 % 2 != 0 ? !onNavigationEvent(i3, i4, 0, 0, triggerInactiveHour.onExtraCallbackWithResult(), triggerInactiveHour.onExtraCallback()) : !onNavigationEvent(i3, i4, 1, 0, triggerInactiveHour.onExtraCallbackWithResult(), triggerInactiveHour.onExtraCallback())) {
                    int i6 = access100 + 71;
                    access000 = i6 % 128;
                    if (i6 % 2 == 0) {
                        return false;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            int i7 = access000 + 121;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        return Boolean.valueOf(onNavigationEvent(i3, i4, triggerInactiveHour.onNavigationEvent(), triggerInactiveHour.IAuthTabCallback(), triggerInactiveHour.onExtraCallbackWithResult(), triggerInactiveHour.onExtraCallback()));
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = IAuthTabCallbackDefault;
        if (cArr4 != null) {
            int i4 = $11 + 51;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 77, MotionEvent.axisFromString("") + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $11 + 85;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onTransact)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionChild(0L) + 76, 16038 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i7 = 1052772399;
        if (IAuthTabCallbackStub) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 63 - ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i8 = $11 + 13;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $10 + 23;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 63 - (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.keyCodeFromString("") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i7 = 1052772399;
        }
        objArr[0] = new String(cArr2);
    }

    private final void onWarmupCompleted(List<Trigger> list) {
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = access100 + 77;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            linkedHashSet.add(((Trigger) it.next()).onNavigationEvent());
        }
        Date dateOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback();
        Collection<String> collectionIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionIAuthTabCallback.iterator();
        while (it2.hasNext()) {
            int i4 = access100 + 25;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                linkedHashSet.contains((String) it2.next());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next = it2.next();
            String str = (String) next;
            if (!linkedHashSet.contains(str)) {
                int i5 = access100 + 1;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                C0063getFeatureExtension c0063getFeatureExtensionOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(str);
                if (c0063getFeatureExtensionOnWarmupCompleted == null || !c0063getFeatureExtensionOnWarmupCompleted.onExtraCallbackWithResult(dateOnExtraCallback)) {
                    arrayList.add(next);
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            this.onNavigationEvent.onExtraCallback((String) it3.next());
        }
        Collection<String> collectionOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collectionOnNavigationEvent) {
            int i7 = access000 + 21;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            C0062getAttributeExtension c0062getAttributeExtensionOnNavigationEvent = this.onNavigationEvent.onNavigationEvent((String) obj2);
            if (c0062getAttributeExtensionOnNavigationEvent != null) {
                int i9 = access000 + 1;
                access100 = i9 % 128;
                int i10 = i9 % 2;
                if (!c0062getAttributeExtensionOnNavigationEvent.onExtraCallback(dateOnExtraCallback)) {
                }
            }
            arrayList2.add(obj2);
            int i11 = access100 + 97;
            access000 = i11 % 128;
            int i12 = i11 % 2;
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            this.onNavigationEvent.onExtraCallbackWithResult((String) it4.next());
        }
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onWarmupCompleted(z);
        int i4 = access100 + 25;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r14 = o.ALCFaceSDKExternalSyntheticLambda3.access000 + 13;
        o.ALCFaceSDKExternalSyntheticLambda3.access100 = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if ((r14 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r13 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r13 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r13 = new o.C0063getFeatureExtension(r14, 0, 0, null, 0, 30, null);
        r14 = o.ALCFaceSDKExternalSyntheticLambda3.access000 + 51;
        o.ALCFaceSDKExternalSyntheticLambda3.access100 = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if ((r14 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C0063getFeatureExtension onExtraCallbackWithResult(ALCFaceSDK11 aLCFaceSDK11, String str) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        C0063getFeatureExtension c0063getFeatureExtensionOnWarmupCompleted = aLCFaceSDK11.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
    }

    private final C0062getAttributeExtension IAuthTabCallback(ALCFaceSDK11 aLCFaceSDK11, String str) {
        int i = 2 % 2;
        int i2 = access100 + 11;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        C0062getAttributeExtension c0062getAttributeExtensionOnNavigationEvent = aLCFaceSDK11.onNavigationEvent(str);
        if (i3 != 0) {
            int i4 = 49 / 0;
            if (c0062getAttributeExtensionOnNavigationEvent != null) {
                return c0062getAttributeExtensionOnNavigationEvent;
            }
        } else if (c0062getAttributeExtensionOnNavigationEvent != null) {
            return c0062getAttributeExtensionOnNavigationEvent;
        }
        C0062getAttributeExtension c0062getAttributeExtension = new C0062getAttributeExtension(str, 0L, 2, null);
        int i5 = access000 + 11;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return c0062getAttributeExtension;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static final Unit onExtraCallbackWithResult(ALCFaceSDKExternalSyntheticLambda3 aLCFaceSDKExternalSyntheticLambda3, List list) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, -1973756965, 1973756966, iIAuthTabCallback2, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{aLCFaceSDKExternalSyntheticLambda3, list}, iIAuthTabCallback3);
    }

    private final boolean onNavigationEvent(Date date, TriggerInactiveHour triggerInactiveHour) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(iIAuthTabCallback, -529083009, 529083009, iIAuthTabCallback2, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this, date, triggerInactiveHour}, iIAuthTabCallback3)).booleanValue();
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = new char[]{32583, 32405, 32415, 32615, 32593, 32629, 32411, 32401, 32395, 32412};
        onTransact = -1184334080;
        asBinder = true;
        IAuthTabCallbackStub = true;
    }
}
