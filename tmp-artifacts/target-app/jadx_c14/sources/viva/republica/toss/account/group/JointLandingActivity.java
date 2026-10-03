package viva.republica.toss.account.group;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_GetSignatureAlgorithmType;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.JsonReaderUnknownNumberParsing;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.SessionTrackerb;
import o.TombstoneProtosMemoryMappingBuilder;
import o.deserializeUriNullableCollection;
import o.setMessageBytes;
import o.varyFields;
import o.varyMatches;
import o.zzck;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import viva.republica.toss.R;
import viva.republica.toss.account.group.JointLandingActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JointLandingActivity extends Hilt_JointLandingActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 1;
    public static final int asInterface;
    private static int getInterfaceDescriptor;
    private static long onTransact;
    private deserializeUriNullableCollection IAuthTabCallbackStub;

    @Inject
    public SessionTrackerb tossRouter;
    private String asBinder = "";
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new asBinder(this));

    static {
        onNavigationEvent();
        Companion = new onNavigationEvent(null);
        asInterface = 8;
        int i = IAuthTabCallbackStubProxy + 105;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 89;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(th);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        int i3 = access100 + 35;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SparseArray sparseArray, AppMsgReceiver2 appMsgReceiver2, onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 115;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(sparseArray, appMsgReceiver2, onextracallback);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(sparseArray, appMsgReceiver2, onextracallback);
        int i3 = getInterfaceDescriptor + 119;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(JointLandingActivity jointLandingActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(jointLandingActivity, view);
        }
        onWarmupCompleted(jointLandingActivity, view);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(JointLandingActivity jointLandingActivity, Long l) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(jointLandingActivity, l);
        }
        onExtraCallback(jointLandingActivity, l);
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i3;
        int i10 = ~(i | i2);
        int i11 = i9 | i10;
        int i12 = ~i3;
        int i13 = (~(i12 | i2)) | (~(i12 | i)) | i10;
        int i14 = (~(i7 | i2)) | (~(i8 | i));
        int i15 = i + i2 + i5 + (1040777104 * i4) + ((-1861505373) * i6);
        int i16 = i15 * i15;
        int i17 = (i * (-1036928585)) + 527892480 + ((-1036928585) * i2) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i5) + (1608515584 * i4) + ((-1123418112) * i6) + ((-2114519040) * i16);
        int i18 = (i * 1703033811) + 1712528133 + (i2 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i5 * 1703034565) + (i4 * (-2114876976)) + (i6 * 1880022383) + (i16 * (-720175104));
        int i19 = i17 + (i18 * i18 * (-739180544));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        AppMsgReceiver2 appMsgReceiver2 = (AppMsgReceiver2) objArr[0];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(appMsgReceiver2, iAuthTabCallback);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        int i5 = getInterfaceDescriptor + 15;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 41;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements Function1<Object, Boolean> {
        public static final IAuthTabCallbackDefault onWarmupCompleted = new IAuthTabCallbackDefault();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onExtraCallback);
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<Object, Boolean> {
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallback);
        }
    }

    public static final class asBinder implements Function0<CERT_GetSignatureAlgorithmType> {
        final /* synthetic */ Activity onExtraCallback;

        public asBinder(Activity activity) {
            this.onExtraCallback = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CERT_GetSignatureAlgorithmType invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetSignatureAlgorithmType.onWarmupCompleted(layoutInflater);
        }
    }

    public static final /* synthetic */ void onExtraCallback(JointLandingActivity jointLandingActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        jointLandingActivity.validateRelationship();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(JointLandingActivity jointLandingActivity) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {jointLandingActivity};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        if (i3 != 0) {
            onNavigationEvent(348547668, -348547665, iOnWarmupCompleted, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted4, objArr);
            obj.hashCode();
            throw null;
        }
        onNavigationEvent(348547668, -348547665, iOnWarmupCompleted, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted4, objArr);
        int i4 = access100 + 47;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.account.group.JointLandingActivity.access100 + 79;
        viva.republica.toss.account.group.JointLandingActivity.getInterfaceDescriptor = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.SessionTrackerb IAuthTabCallback() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.group.JointLandingActivity.access100
            int r1 = r1 + 83
            int r2 = r1 % 128
            viva.republica.toss.account.group.JointLandingActivity.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            o.SessionTrackerb r1 = r3.tossRouter
            r2 = 69
            int r2 = r2 / 0
            if (r1 == 0) goto L1c
            goto L1b
        L17:
            o.SessionTrackerb r1 = r3.tossRouter
            if (r1 == 0) goto L1c
        L1b:
            return r1
        L1c:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.account.group.JointLandingActivity.access100
            int r1 = r1 + 79
            int r2 = r1 % 128
            viva.republica.toss.account.group.JointLandingActivity.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            r0 = 0
            if (r1 != 0) goto L2e
            return r0
        L2e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.group.JointLandingActivity.IAuthTabCallback():o.SessionTrackerb");
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        JointLandingActivity jointLandingActivity = (JointLandingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 103;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object value = jointLandingActivity.IAuthTabCallbackDefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CERT_GetSignatureAlgorithmType cERT_GetSignatureAlgorithmType = (CERT_GetSignatureAlgorithmType) value;
        if (i3 == 0) {
            return cERT_GetSignatureAlgorithmType;
        }
        throw null;
    }

    private final RecyclerView ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        RecyclerView recyclerView = ((CERT_GetSignatureAlgorithmType) onNavigationEvent(-641242725, 641242726, iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{this})).onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        int i4 = access100 + 41;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return recyclerView;
    }

    private final TdsBottomCtaV1View ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access100 + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        TdsBottomCtaV1View tdsBottomCtaV1View = ((CERT_GetSignatureAlgorithmType) onNavigationEvent(-641242725, 641242726, iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{this})).onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        int i4 = getInterfaceDescriptor + 53;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsBottomCtaV1View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ScrollingPagerIndicator updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        if (i3 == 0) {
            Intrinsics.checkNotNullExpressionValue(((CERT_GetSignatureAlgorithmType) onNavigationEvent(-641242725, 641242726, iOnWarmupCompleted, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted4, objArr)).onExtraCallbackWithResult, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScrollingPagerIndicator scrollingPagerIndicator = ((CERT_GetSignatureAlgorithmType) onNavigationEvent(-641242725, 641242726, iOnWarmupCompleted, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted4, objArr)).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(scrollingPagerIndicator, "");
        int i4 = access100 + 111;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return scrollingPagerIndicator;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return "s77_accntjoint_landing";
        }
        int i3 = 44 / 0;
        return "s77_accntjoint_landing";
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 113;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onTransact ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 58 - TextUtils.indexOf((CharSequence) "", '0', 0), (-16770833) - Color.rgb(0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, 6383 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onExtraCallback(AppMsgReceiver2 appMsgReceiver2, IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        TdsImageView tdsImageViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.imageView);
        Intrinsics.checkNotNullExpressionValue(tdsImageViewFindViewById, "");
        Object[] objArr = new Object[1];
        a(new char[]{41294, 36737, 64756, 11567, 6681, 19203, 47611, 59084, 55245, 1081, 30073, 41539, 37035, 49650, 11906, 7951, 19577, 48470, 60291, 55457, 2355, 30212, 42795, 38322, 49821, 13262, 24621, 20755, 48705, 60654, 56830, 2762, 31528, 43134, 39181, 51100, 13560, 25916, 21013, 33655, 61879, 56987, 4061, 31864, 44299, 39516, 51371, 14788, 26332, 22314, 33913, 62785, 9102, 4310, 16845, 44573, 40826, 52655, 14983, 27591, 22630, 35097, 62994, 9403, 5512, 17106}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11986, objArr);
        TdsImageView.setImage$default(tdsImageViewFindViewById, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 81;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(SparseArray sparseArray, AppMsgReceiver2 appMsgReceiver2, onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.lottieTitleView).setText(onextracallback.onNavigationEvent());
        LottieAnimationView lottieAnimationViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.lottieView);
        Intrinsics.checkNotNull(lottieAnimationViewFindViewById);
        Object obj = null;
        zzck.onExtraCallback(lottieAnimationViewFindViewById, onextracallback.IAuthTabCallback(), (ManagedRetainedValuesStoreKtExternalSyntheticLambda0) null, 2, (Object) null);
        lottieAnimationViewFindViewById.setProgress(0.0f);
        sparseArray.put(appMsgReceiver2.getBindingAdapterPosition(), lottieAnimationViewFindViewById);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted extends RecyclerView.OnScrollListener {
        final /* synthetic */ JointLandingActivity IAuthTabCallback;
        final /* synthetic */ SparseArray<LottieAnimationView> onNavigationEvent;

        onWarmupCompleted(SparseArray<LottieAnimationView> sparseArray, JointLandingActivity jointLandingActivity) {
            this.onNavigationEvent = sparseArray;
            this.IAuthTabCallback = jointLandingActivity;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            LottieAnimationView lottieAnimationView;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "");
                int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
                recyclerView.setTag(Integer.valueOf(iFindFirstVisibleItemPosition));
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                Intrinsics.checkNotNull(adapter);
                int itemCount = adapter.getItemCount();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                    Intrinsics.checkNotNull(adapter2);
                    if (adapter2.getItemViewType(i2) == 1) {
                        if (iFindFirstVisibleItemPosition == i2) {
                            LottieAnimationView lottieAnimationView2 = this.onNavigationEvent.get(i2);
                            if (Intrinsics.areEqual(lottieAnimationView2 != null ? Float.valueOf(lottieAnimationView2.getProgress()) : null, 0.0f) && (lottieAnimationView = this.onNavigationEvent.get(i2)) != null) {
                                lottieAnimationView.playAnimation();
                            }
                        } else {
                            LottieAnimationView lottieAnimationView3 = this.onNavigationEvent.get(i2);
                            if (lottieAnimationView3 != null) {
                                lottieAnimationView3.pauseAnimation();
                            }
                            LottieAnimationView lottieAnimationView4 = this.onNavigationEvent.get(i2);
                            if (lottieAnimationView4 != null) {
                                lottieAnimationView4.setProgress(0.0f);
                            }
                        }
                    }
                }
                JointLandingActivity.onExtraCallback(this.IAuthTabCallback);
            }
            if (i == 1) {
                JointLandingActivity.onNavigationEvent(this.IAuthTabCallback);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0637  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v47, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v52, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v56, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r10v57, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r10v58, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r10v59, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r10v60, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r10v61, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r10v62, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r10v63, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v68, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.app.Activity, android.content.Context, androidx.appcompat.app.AppCompatActivity, im.toss.base.BaseActivity, java.lang.Object, viva.republica.toss.account.group.JointLandingActivity] */
    @Override // viva.republica.toss.account.group.Hilt_JointLandingActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.group.JointLandingActivity.onCreate(android.os.Bundle):void");
    }

    private static final Unit onWarmupCompleted(JointLandingActivity jointLandingActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            jointLandingActivity.ICustomTabsServiceStubProxy();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        jointLandingActivity.ICustomTabsServiceStubProxy();
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 59;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStubProxy() throws Throwable {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerbIAuthTabCallback = IAuthTabCallback();
        String str = this.asBinder;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{41301, 9764, 44984, 14118, 48264, 1025, 36227, 5396, 39661, 25139, 60335, 29460, 63699, 16462, 51655, 20144, 54819, 24495, 9996, 44252, 13312, 48522, 1397, 35577, 4730, 39830, 25427, 59609, 28743, 63804, 32416, 50730, 20473, 55043, 23693, 9221, 44543, 13671, 47870, 610, 35788, 4884}, 34678 - Process.getGidForName(""), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        finish();
        int i2 = access100 + 35;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onWarmupCompleted(androidx.recyclerview.widget.RecyclerView r11, int r12, float r13) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.group.JointLandingActivity.getInterfaceDescriptor
            int r1 = r1 + 115
            int r2 = r1 % 128
            viva.republica.toss.account.group.JointLandingActivity.access100 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L20
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r11.getAdapter()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.getItemCount()
            r2 = 65
            int r2 = r2 / 0
            if (r1 == 0) goto L7f
            goto L2d
        L20:
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r11.getAdapter()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.getItemCount()
            if (r1 == 0) goto L7f
        L2d:
            android.content.Context r1 = r11.getContext()
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            o.accessgetMethodDescriptorsFromModule r2 = new o.accessgetMethodDescriptorsFromModule
            r2.<init>(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r13)
            java.lang.Object[] r7 = new java.lang.Object[]{r2, r1}
            int r5 = o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted()
            int r6 = o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted()
            int r8 = o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted()
            int r4 = o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted()
            r3 = -613837104(0xffffffffdb6996d0, float:-6.574949E16)
            r9 = 613837105(0x24966931, float:6.523033E-17)
            java.lang.Object r1 = o.accessgetMethodDescriptorsFromModule.onExtraCallback(r3, r4, r5, r6, r7, r8, r9)
            o.accessgetMethodDescriptorsFromModule r1 = (o.accessgetMethodDescriptorsFromModule) r1
            r2.onNavigationEvent(r13)
            r2.setTargetPosition(r12)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r11 = r11.getLayoutManager()
            if (r11 == 0) goto L7f
            int r12 = viva.republica.toss.account.group.JointLandingActivity.getInterfaceDescriptor
            int r12 = r12 + 95
            int r13 = r12 % 128
            viva.republica.toss.account.group.JointLandingActivity.access100 = r13
            int r12 = r12 % r0
            r11.startSmoothScroll(r2)
            if (r12 == 0) goto L7a
            goto L7f
        L7a:
            r11 = 0
            r11.hashCode()
            throw r11
        L7f:
            int r11 = viva.republica.toss.account.group.JointLandingActivity.access100
            int r11 = r11 + 99
            int r12 = r11 % 128
            viva.republica.toss.account.group.JointLandingActivity.getInterfaceDescriptor = r12
            int r11 = r11 % r0
            if (r11 == 0) goto L8e
            r11 = 21
            int r11 = r11 / 0
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.group.JointLandingActivity.onWarmupCompleted(androidx.recyclerview.widget.RecyclerView, int, float):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(JointLandingActivity jointLandingActivity, Long l) {
        Integer num;
        int iIntValue;
        int i = 2 % 2;
        if (varyFields.onWarmupCompleted(jointLandingActivity)) {
            int i2 = getInterfaceDescriptor + 43;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return Unit.INSTANCE;
        }
        RecyclerView recyclerViewICustomTabsServiceDefault = jointLandingActivity.ICustomTabsServiceDefault();
        Object tag = jointLandingActivity.ICustomTabsServiceDefault().getTag();
        if (tag instanceof Integer) {
            int i4 = access100 + 81;
            int i5 = i4 % 128;
            getInterfaceDescriptor = i5;
            int i6 = i4 % 2;
            num = (Integer) tag;
            int i7 = i5 + 93;
            access100 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            num = null;
        }
        if (num != null) {
            iIntValue = num.intValue();
            int i9 = access100 + 49;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
        } else {
            iIntValue = 0;
        }
        RecyclerView.Adapter adapter = jointLandingActivity.ICustomTabsServiceDefault().getAdapter();
        Intrinsics.checkNotNull(adapter);
        int itemCount = adapter.getItemCount();
        Intrinsics.checkNotNullExpressionValue(jointLandingActivity.getResources().getDisplayMetrics(), "");
        jointLandingActivity.onWarmupCompleted(recyclerViewICustomTabsServiceDefault, (iIntValue + 1) % itemCount, 600.0f / varyMatches.onNavigationEvent(1600, r2));
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 47;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void validateRelationship() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        if (this.IAuthTabCallbackStub == null) {
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = JsonReaderUnknownNumberParsing.onWarmupCompleted(4500L, 4500L, TimeUnit.MILLISECONDS);
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted2 = jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted2, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted2, new JointLandingActivity$.ExternalSyntheticLambda3(), (Function0) null, new JointLandingActivity$.ExternalSyntheticLambda4(this), 2, (Object) null);
            this.IAuthTabCallbackStub = deserializeurinullablecollectionOnNavigationEvent;
            Intrinsics.checkNotNull(deserializeurinullablecollectionOnNavigationEvent);
            onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
            return;
        }
        int i5 = i3 + 73;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        JointLandingActivity jointLandingActivity = (JointLandingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollection = jointLandingActivity.IAuthTabCallbackStub;
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
            int i4 = access100 + 5;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        jointLandingActivity.IAuthTabCallbackStub = null;
        return null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-563044009, 563044009, iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{th});
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppMsgReceiver2 appMsgReceiver2, IAuthTabCallback iAuthTabCallback) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(1062864620, -1062864618, iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{appMsgReceiver2, iAuthTabCallback});
    }

    private final CERT_GetSignatureAlgorithmType setEngagementSignalsCallback() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (CERT_GetSignatureAlgorithmType) onNavigationEvent(-641242725, 641242726, iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{this});
    }

    private final void access200() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onNavigationEvent(348547668, -348547665, iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{this});
    }

    @Override // viva.republica.toss.account.group.Hilt_JointLandingActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access100 + 47;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.group.Hilt_JointLandingActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = access100 + 107;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    @Override // viva.republica.toss.account.group.Hilt_JointLandingActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access100 + 97;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.group.Hilt_JointLandingActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    static void onNavigationEvent() {
        onTransact = 2058929088888120337L;
    }
}
