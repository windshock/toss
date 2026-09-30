package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.tmoney.LiveCheckConstants;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.SetDetectableSize;
import o.getTrimPathStart;
import o.setStrokeAlpha;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTrimPathStart {
    private static final Set<Character> IAuthTabCallback;
    private static final jni_YGNodeStyleGetFlexBasisJNI IAuthTabCallbackDefault;
    private static volatile long IAuthTabCallbackStub;
    private static volatile setFillAlpha IAuthTabCallback_Parcel;
    private static int access000;
    private static volatile pauseMyRequest<setStrokeAlpha> asBinder;
    private static final Object asInterface;
    private static int getInterfaceDescriptor;
    private static final jni_YGNodeStyleGetFlexBasisJNI onExtraCallback;
    public static final getTrimPathStart onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static final findResAndMsg onTransact;
    private static final AtomicLong onWarmupCompleted;
    private static final byte[] $$a = {51, -39, 98, -44};
    private static final int $$b = 5;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 1;
    private static int access100 = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = getTrimPathStart.this.onNavigationEvent((Activity) null, (access13800<? super getFillColor>) this);
            int i4 = IAuthTabCallback + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class IAuthTabCallbackStubProxy extends ContinuationImpl {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = getTrimPathStart.IAuthTabCallback(getTrimPathStart.this, null, this);
            if (i3 == 0) {
                int i4 = 92 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    static final class asInterface extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {getTrimPathStart.this, null, null, false, this};
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            return i3 != 0 ? getTrimPathStart.onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, 134571277, -134571277, objArr, iOnExtraCallback3, iOnExtraCallback4) : getTrimPathStart.onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, 134571277, -134571277, objArr, iOnExtraCallback3, iOnExtraCallback4);
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnNavigationEvent = getTrimPathStart.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -344520983, 344520985, new Object[]{getTrimPathStart.this, null, this}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
            int i4 = onNavigationEvent + 55;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = getTrimPathStart.this.IAuthTabCallback((Context) null, (access13800<? super getFillColor>) this);
            int i4 = IAuthTabCallback + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = getTrimPathStart.this.onExtraCallbackWithResult((Activity) null, i3 != 0, (access13800<? super setStrokeAlpha>) this);
            int i4 = IAuthTabCallback + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    static final class onTransact extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = getTrimPathStart.this.onWarmupCompleted((Activity) null, (String) null, (access13800<? super setStrokeAlpha>) this);
            int i4 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[setFillColor.values().length];
            try {
                iArr[setFillColor.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setFillColor.UNKNOWN.ordinal()] = 2;
                int i = onExtraCallback + 117;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setFillColor.NOT_REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setFillColor.ENABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[ConsentInformation.PrivacyOptionsRequirementStatus.values().length];
            try {
                iArr2[ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED.ordinal()] = 2;
                int i3 = onNavigationEvent + 95;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            onWarmupCompleted = iArr2;
            int i6 = onNavigationEvent + 89;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static String $$c(short s, int i, int i2) {
        byte[] bArr = $$a;
        int i3 = s * 3;
        int i4 = (i2 * 2) + 105;
        int i5 = i + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + (-i4);
            i5 = i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            int i7 = i5 + 1;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i7];
            i5 = i7;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, setFillAlpha setfillalpha, Context context, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, setfillalpha, context, setDetectableSize);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i4 | i2);
        int i12 = (~(i2 | i4)) | (~(i7 | i9)) | i8;
        int i13 = i3 + i4 + i + (62936680 * i5) + ((-2032430997) * i6);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i3) + 797966336 + (1756943451 * i4) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i) + ((-264241152) * i5) + ((-222822400) * i6) + (2040594432 * i14);
        int i16 = ((i3 * 1175661207) - 43826732) + (i4 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i * 1175660433) + (i5 * 1188219112) + (i6 * (-816965221)) + (i14 * 1798373376);
        switch (i15 + (i16 * i16 * 914292736)) {
            case 1:
                getTrimPathStart gettrimpathstart = (getTrimPathStart) objArr[0];
                final Context context = (Context) objArr[1];
                final String str = (String) objArr[2];
                int i17 = 2 % 2;
                final setFillAlpha setfillalphaOnExtraCallback = gettrimpathstart.onExtraCallback(context);
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5199130L, false, null, null, new Function1() { // from class: im.toss.ads_sdk.admob.AdMobPrivacyConsentManager$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) throws Throwable {
                        int i18 = 2 % 2;
                        int i19 = IAuthTabCallback + 95;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        String str2 = str;
                        if (i20 != 0) {
                            return getTrimPathStart.IAuthTabCallback(str2, setfillalphaOnExtraCallback, context, (SetDetectableSize) obj);
                        }
                        Unit unitIAuthTabCallback = getTrimPathStart.IAuthTabCallback(str2, setfillalphaOnExtraCallback, context, (SetDetectableSize) obj);
                        int i21 = 62 / 0;
                        return unitIAuthTabCallback;
                    }
                }, 14, null);
                int i18 = IAuthTabCallbackStubProxy + 9;
                access100 = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, setStrokeAlpha setstrokealpha, Context context, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, setstrokealpha, context, setDetectableSize);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = access100 + 45;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return unitIAuthTabCallback;
    }

    private getTrimPathStart() {
    }

    public static final /* synthetic */ Object IAuthTabCallback(getTrimPathStart gettrimpathstart, Activity activity, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Object objOnNavigationEvent = onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -438862408, 438862411, new Object[]{gettrimpathstart, activity, access13800Var}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        int i4 = IAuthTabCallbackStubProxy + 21;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ setFillAlpha onExtraCallback(getTrimPathStart gettrimpathstart, ConsentInformation consentInformation, setFillColor setfillcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setFillAlpha setfillalphaIAuthTabCallback = gettrimpathstart.IAuthTabCallback(consentInformation, setfillcolor);
        int i4 = IAuthTabCallbackStubProxy + 65;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return setfillalphaIAuthTabCallback;
    }

    public static final /* synthetic */ void onExtraCallback(getTrimPathStart gettrimpathstart, Context context, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -1651647824, 1651647825, new Object[]{gettrimpathstart, context, str}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        int i4 = access100 + 3;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getTrimPathStart gettrimpathstart = (getTrimPathStart) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return gettrimpathstart.onExtraCallbackWithResult(context);
        }
        gettrimpathstart.onExtraCallbackWithResult(context);
        throw null;
    }

    public static final /* synthetic */ String onWarmupCompleted(getTrimPathStart gettrimpathstart, setFillAlpha setfillalpha, Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = gettrimpathstart.onWarmupCompleted(setfillalpha, context);
        int i4 = access100 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ setStrokeAlpha onWarmupCompleted(getTrimPathStart gettrimpathstart, long j, setStrokeAlpha setstrokealpha, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        setStrokeAlpha setstrokealphaOnWarmupCompleted = gettrimpathstart.onWarmupCompleted(j, setstrokealpha, str);
        int i4 = IAuthTabCallbackStubProxy + 15;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return setstrokealphaOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        access000 = 0;
        onExtraCallback();
        onExtraCallbackWithResult = new getTrimPathStart();
        onTransact = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onExtraCallback().onExtraCallback()));
        IAuthTabCallbackDefault = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
        onExtraCallback = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
        IAuthTabCallbackStub = -1L;
        onWarmupCompleted = new AtomicLong();
        asInterface = new Object();
        IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback(new Character[]{'0', '1'});
        onNavigationEvent = 8;
        int i = writeTypedObject + 41;
        access000 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        setFillAlpha setfillalpha = IAuthTabCallback_Parcel;
        if (setfillalpha == null) {
            return false;
        }
        int i3 = access100 + 89;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnNavigationEvent = setfillalpha.onNavigationEvent();
        if (i4 == 0) {
            if (!zOnNavigationEvent) {
                return false;
            }
        } else if (!zOnNavigationEvent) {
            return false;
        }
        return true;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Activity activity = (Activity) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        maybeUpdateAnimatable.onNavigationEvent(onTransact, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(activity, null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 109;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(Activity activity, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$activity = activity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(this.$activity, access13800Var);
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStub;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 44 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                getTrimPathStart gettrimpathstart = getTrimPathStart.onExtraCallbackWithResult;
                Activity activity = this.$activity;
                this.label = 1;
                if (getTrimPathStart.onExtraCallbackWithResult(gettrimpathstart, activity, false, this, 2, null) == objOnWarmupCompleted) {
                    int i5 = onExtraCallback + 41;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 74 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = onWarmupCompleted + 15;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(getTrimPathStart gettrimpathstart, Activity activity, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100 + 11;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            z = false;
        }
        Object objOnExtraCallbackWithResult = gettrimpathstart.onExtraCallbackWithResult(activity, z, (access13800<? super setStrokeAlpha>) access13800Var);
        int i4 = IAuthTabCallbackStubProxy + 59;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137 A[PHI: r0 r13
      0x0137: PHI (r0v7 boolean) = (r0v2 boolean), (r0v10 boolean) binds: [B:58:0x0135, B:47:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r13v2 android.app.Activity) = (r13v0 android.app.Activity), (r13v3 android.app.Activity) binds: [B:58:0x0135, B:47:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152 A[Catch: all -> 0x01db, TRY_LEAVE, TryCatch #0 {all -> 0x01db, blocks: (B:62:0x014a, B:64:0x0152, B:66:0x016a, B:70:0x017d, B:77:0x018d, B:83:0x01a1, B:73:0x0184, B:82:0x019b), top: B:99:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a A[Catch: all -> 0x01db, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01db, blocks: (B:62:0x014a, B:64:0x0152, B:66:0x016a, B:70:0x017d, B:77:0x018d, B:83:0x01a1, B:73:0x0184, B:82:0x019b), top: B:99:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(@NotNull Activity activity, boolean z, @NotNull access13800<? super setStrokeAlpha> access13800Var) {
        onNavigationEvent onnavigationevent;
        boolean z2;
        Activity activity2;
        boolean z3;
        long j;
        Activity activity3;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        Pair pairIAuthTabCallback;
        boolean z4;
        Activity activity4;
        pauseMyRequest<setStrokeAlpha> pausemyrequest;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2;
        Activity activity5 = activity;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IAuthTabCallbackStubProxy + 25;
                access100 = i3 % 128;
                if (i3 % 2 != 0) {
                    onnavigationevent.label = i2 / Integer.MIN_VALUE;
                } else {
                    onnavigationevent.label = i2 - 2147483648;
                }
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = onnavigationevent.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            getTrimPathOffset gettrimpathoffset = getTrimPathOffset.onWarmupCompleted;
            onnavigationevent.L$0 = activity5;
            z2 = z;
            onnavigationevent.Z$0 = z2;
            onnavigationevent.label = 1;
            objOnExtraCallbackWithResult = gettrimpathoffset.onExtraCallbackWithResult(activity5, onnavigationevent);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        int i5 = IAuthTabCallbackStubProxy;
        int i6 = i5 + 93;
        access100 = i6 % 128;
        if (i6 % 2 == 0 ? i4 != 1 : i4 != 0) {
            if (i4 == 2) {
                z3 = onnavigationevent.Z$0;
                jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) onnavigationevent.L$1;
                activity2 = (Activity) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                try {
                    pausemyrequest = asBinder;
                    if (pausemyrequest == null) {
                        int i7 = access100 + 49;
                        IAuthTabCallbackStubProxy = i7 % 128;
                        int i8 = i7 % 2;
                        onnavigationevent.L$0 = activity2;
                        onnavigationevent.L$1 = null;
                        onnavigationevent.Z$0 = z3;
                        onnavigationevent.label = 3;
                        objOnExtraCallbackWithResult = pausemyrequest.IAuthTabCallback(onnavigationevent);
                        if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                            int i9 = access100 + 21;
                            IAuthTabCallbackStubProxy = i9 % 128;
                            if (i9 % 2 == 0) {
                                throw null;
                            }
                            activity4 = activity2;
                            Activity activity6 = activity4;
                            z2 = z3;
                            activity5 = activity6;
                            activity2 = activity5;
                            z3 = z2;
                            jni_ygnodestylegetflexbasisjni = IAuthTabCallbackDefault;
                            onnavigationevent.L$0 = activity2;
                            onnavigationevent.L$1 = jni_ygnodestylegetflexbasisjni;
                            onnavigationevent.Z$0 = z3;
                            onnavigationevent.I$0 = 0;
                            onnavigationevent.label = 4;
                            if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, onnavigationevent) != objOnWarmupCompleted) {
                            }
                        }
                    } else {
                        jni_ygnodestylegetflexbasisjni = IAuthTabCallbackDefault;
                        onnavigationevent.L$0 = activity2;
                        onnavigationevent.L$1 = jni_ygnodestylegetflexbasisjni;
                        onnavigationevent.Z$0 = z3;
                        onnavigationevent.I$0 = 0;
                        onnavigationevent.label = 4;
                        if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, onnavigationevent) != objOnWarmupCompleted) {
                        }
                    }
                    return objOnWarmupCompleted;
                } finally {
                }
            }
            if (i4 == 3) {
                z3 = onnavigationevent.Z$0;
                activity4 = (Activity) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                Activity activity62 = activity4;
                z2 = z3;
                activity5 = activity62;
                activity2 = activity5;
                z3 = z2;
                jni_ygnodestylegetflexbasisjni = IAuthTabCallbackDefault;
                onnavigationevent.L$0 = activity2;
                onnavigationevent.L$1 = jni_ygnodestylegetflexbasisjni;
                onnavigationevent.Z$0 = z3;
                onnavigationevent.I$0 = 0;
                onnavigationevent.label = 4;
                if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, onnavigationevent) != objOnWarmupCompleted) {
                    activity3 = activity2;
                    long j2 = onWarmupCompleted.get();
                    if (z3) {
                    }
                    jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                    long jLongValue = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).longValue();
                    pauseMyRequest pausemyrequest2 = (pauseMyRequest) pairIAuthTabCallback.IAuthTabCallback();
                    onnavigationevent.L$0 = access15400.onNavigationEvent(activity3);
                    onnavigationevent.L$1 = access15400.onNavigationEvent(pausemyrequest2);
                    onnavigationevent.Z$0 = z3;
                    onnavigationevent.J$0 = jLongValue;
                    onnavigationevent.label = 5;
                    objOnExtraCallbackWithResult = pausemyrequest2.IAuthTabCallback(onnavigationevent);
                    if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                    }
                }
                return objOnWarmupCompleted;
            }
            int i10 = i5 + 7;
            access100 = i10 % 128;
            if (i10 % 2 == 0 ? i4 != 4 : i4 != 2) {
                if (i4 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = onnavigationevent.J$0;
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                return onNavigationEvent(j, (setStrokeAlpha) objOnExtraCallbackWithResult, "CONSENT_INFO_UPDATE_FAILED");
            }
            z3 = onnavigationevent.Z$0;
            jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) onnavigationevent.L$1;
            activity3 = (Activity) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            try {
                long j22 = onWarmupCompleted.get();
                if (z3) {
                    Long lOnExtraCallback = access14000.onExtraCallback(j22);
                    pauseMyRequest<setStrokeAlpha> pausemyrequestOnExtraCallback = asBinder;
                    if (pausemyrequestOnExtraCallback != null) {
                        int i11 = access100 + 83;
                        IAuthTabCallbackStubProxy = i11 % 128;
                        if (i11 % 2 == 0) {
                            z4 = IAuthTabCallbackStub == j22;
                        } else if (IAuthTabCallbackStub == j22) {
                        }
                        if (!access14000.onNavigationEvent(z4).booleanValue()) {
                            pausemyrequestOnExtraCallback = null;
                        }
                        if (pausemyrequestOnExtraCallback == null) {
                        }
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(lOnExtraCallback, pausemyrequestOnExtraCallback);
                    }
                    pausemyrequestOnExtraCallback = onExtraCallbackWithResult.onExtraCallback(activity3, j22);
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(lOnExtraCallback, pausemyrequestOnExtraCallback);
                } else {
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(access14000.onExtraCallback(j22), onExtraCallbackWithResult.onExtraCallback(activity3, j22));
                    int i12 = IAuthTabCallbackStubProxy + 109;
                    access100 = i12 % 128;
                    int i13 = i12 % 2;
                }
                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                long jLongValue2 = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).longValue();
                pauseMyRequest pausemyrequest22 = (pauseMyRequest) pairIAuthTabCallback.IAuthTabCallback();
                onnavigationevent.L$0 = access15400.onNavigationEvent(activity3);
                onnavigationevent.L$1 = access15400.onNavigationEvent(pausemyrequest22);
                onnavigationevent.Z$0 = z3;
                onnavigationevent.J$0 = jLongValue2;
                onnavigationevent.label = 5;
                objOnExtraCallbackWithResult = pausemyrequest22.IAuthTabCallback(onnavigationevent);
                if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                    j = jLongValue2;
                    return onNavigationEvent(j, (setStrokeAlpha) objOnExtraCallbackWithResult, "CONSENT_INFO_UPDATE_FAILED");
                }
                return objOnWarmupCompleted;
            } finally {
            }
        }
        boolean z5 = onnavigationevent.Z$0;
        Activity activity7 = (Activity) onnavigationevent.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        z2 = z5;
        activity5 = activity7;
        int i14 = onWarmupCompleted.onExtraCallbackWithResult[((setFillColor) objOnExtraCallbackWithResult).ordinal()];
        if (i14 == 1) {
            setStrokeAlpha.onExtraCallbackWithResult onextracallbackwithresult = new setStrokeAlpha.onExtraCallbackWithResult("ADMOB_DISABLED_BY_PRIVACY_RIGHTS", "개인정보 수집 반대권 설정으로 AdMob을 사용할 수 없어요.");
            int i15 = access100 + 65;
            IAuthTabCallbackStubProxy = i15 % 128;
            int i16 = i15 % 2;
            return onextracallbackwithresult;
        }
        int i17 = IAuthTabCallbackStubProxy + 31;
        int i18 = i17 % 128;
        access100 = i18;
        int i19 = i17 % 2;
        if (i14 == 2) {
            return new setStrokeAlpha.onExtraCallbackWithResult("ADMOB_STATUS_UNAVAILABLE", "AdMob 사용 가능 상태를 확인할 수 없어요.");
        }
        int i20 = i18 + 99;
        IAuthTabCallbackStubProxy = i20 % 128;
        if (i20 % 2 == 0) {
            throw null;
        }
        if (z2) {
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni3 = IAuthTabCallbackDefault;
            onnavigationevent.L$0 = activity5;
            onnavigationevent.L$1 = jni_ygnodestylegetflexbasisjni3;
            onnavigationevent.Z$0 = z2;
            onnavigationevent.I$0 = 0;
            onnavigationevent.label = 2;
            if (jni_ygnodestylegetflexbasisjni3.IAuthTabCallback((Object) null, onnavigationevent) != objOnWarmupCompleted) {
                activity2 = activity5;
                z3 = z2;
                jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni3;
                pausemyrequest = asBinder;
                if (pausemyrequest == null) {
                }
            }
            return objOnWarmupCompleted;
        }
        activity2 = activity5;
        z3 = z2;
        jni_ygnodestylegetflexbasisjni = IAuthTabCallbackDefault;
        onnavigationevent.L$0 = activity2;
        onnavigationevent.L$1 = jni_ygnodestylegetflexbasisjni;
        onnavigationevent.Z$0 = z3;
        onnavigationevent.I$0 = 0;
        onnavigationevent.label = 4;
        if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, onnavigationevent) != objOnWarmupCompleted) {
        }
        return objOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 47;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(getInterfaceDescriptor)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (Process.myTid() >> 22)), 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 10278 - TextUtils.getOffsetBefore("", 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) ($$b - 5);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 12844), (ViewConfiguration.getWindowTouchSlop() >> 8) + 55, TextUtils.getTrimmedLength("") + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i9 = $11 + 1;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i11 = $11 + 65;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843);
                    int iAxisFromString = 54 - MotionEvent.axisFromString("");
                    int i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 2168;
                    byte b3 = (byte) ($$b - 5);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, iAxisFromString, i13, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        onExtraCallback onextracallback;
        long j;
        setStrokeAlpha setstrokealpha;
        Context context;
        long j2;
        boolean zOnNavigationEvent = false;
        getTrimPathStart gettrimpathstart = (getTrimPathStart) objArr[0];
        Context context2 = (Context) objArr[1];
        onExtraCallback onextracallback2 = (access13800) objArr[2];
        if (onextracallback2 instanceof onExtraCallback) {
            onextracallback = onextracallback2;
            int i = onextracallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i - 2147483648;
            } else {
                onextracallback = gettrimpathstart.new onExtraCallback(onextracallback2);
            }
        }
        Object objOnExtraCallbackWithResult = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = onextracallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            getTrimPathOffset gettrimpathoffset = getTrimPathOffset.onWarmupCompleted;
            onextracallback.L$0 = context2;
            onextracallback.label = 1;
            objOnExtraCallbackWithResult = gettrimpathoffset.onExtraCallbackWithResult(context2, onextracallback);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = onextracallback.J$0;
            context = (Context) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            setstrokealpha = (setStrokeAlpha) objOnExtraCallbackWithResult;
            j = j2;
            context2 = context;
            if (!(setstrokealpha instanceof setStrokeAlpha.onNavigationEvent)) {
                if (((setStrokeAlpha.onNavigationEvent) setstrokealpha).onExtraCallbackWithResult().onNavigationEvent() && onWarmupCompleted.get() == j) {
                    zOnNavigationEvent = true;
                }
            } else {
                setFillAlpha setfillalphaOnExtraCallback = gettrimpathstart.onExtraCallback(context2);
                synchronized (asInterface) {
                    if (onWarmupCompleted.get() == j) {
                        IAuthTabCallback_Parcel = setfillalphaOnExtraCallback;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                zOnNavigationEvent = setfillalphaOnExtraCallback.onNavigationEvent();
            }
            return access14000.onNavigationEvent(zOnNavigationEvent);
        }
        context2 = (Context) onextracallback.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        if (!((setFillColor) objOnExtraCallbackWithResult).getCanUseAdMob()) {
            return access14000.onNavigationEvent(false);
        }
        j = onWarmupCompleted.get();
        GeckoHubImp1 geckoHubImp1 = asBinder;
        setstrokealpha = null;
        if (geckoHubImp1 == null || IAuthTabCallbackStub != j) {
            geckoHubImp1 = null;
        }
        if (geckoHubImp1 != null) {
            onextracallback.L$0 = context2;
            onextracallback.L$1 = access15400.onNavigationEvent(geckoHubImp1);
            onextracallback.J$0 = j;
            onextracallback.label = 2;
            objOnExtraCallbackWithResult = geckoHubImp1.IAuthTabCallback(onextracallback);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                context = context2;
                j2 = j;
                setstrokealpha = (setStrokeAlpha) objOnExtraCallbackWithResult;
                j = j2;
                context2 = context;
            }
            return objOnWarmupCompleted;
        }
        if (!(setstrokealpha instanceof setStrokeAlpha.onNavigationEvent)) {
        }
        return access14000.onNavigationEvent(zOnNavigationEvent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r14 == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (r14 == r2) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull Context context, @NotNull access13800<? super getFillColor> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i2 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onextracallbackwithresult.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            getTrimPathOffset gettrimpathoffset = getTrimPathOffset.onWarmupCompleted;
            onextracallbackwithresult.L$0 = context;
            onextracallbackwithresult.label = 1;
            objOnExtraCallbackWithResult = gettrimpathoffset.onExtraCallbackWithResult(context, onextracallbackwithresult);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
            }
            int i4 = IAuthTabCallbackStubProxy + 29;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
        int i6 = IAuthTabCallbackStubProxy + 109;
        access100 = i6 % 128;
        if (i6 % 2 == 0 ? i3 != 1 : i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            if (!((Boolean) objOnExtraCallbackWithResult).booleanValue()) {
                getFillColor getfillcolor = getFillColor.PRIVACY_CONSENT_NOT_READY;
                int i7 = IAuthTabCallbackStubProxy + 119;
                access100 = i7 % 128;
                if (i7 % 2 == 0) {
                    return getfillcolor;
                }
                throw null;
            }
            int i8 = IAuthTabCallbackStubProxy + 15;
            access100 = i8 % 128;
            if (i8 % 2 == 0) {
                return getFillColor.AVAILABLE;
            }
            getFillColor getfillcolor2 = getFillColor.AVAILABLE;
            throw null;
        }
        context = (Context) onextracallbackwithresult.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        int i9 = onWarmupCompleted.onExtraCallbackWithResult[((setFillColor) objOnExtraCallbackWithResult).ordinal()];
        if (i9 == 1) {
            return getFillColor.DISABLED_BY_PRIVACY_RIGHTS;
        }
        if (i9 == 2) {
            getFillColor getfillcolor3 = getFillColor.STATUS_UNAVAILABLE;
            int i10 = access100 + 7;
            IAuthTabCallbackStubProxy = i10 % 128;
            int i11 = i10 % 2;
            return getfillcolor3;
        }
        if (i9 == 3) {
            return getFillColor.AVAILABLE;
        }
        if (i9 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i12 = access100 + 9;
        IAuthTabCallbackStubProxy = i12 % 128;
        if (i12 % 2 == 0) {
            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context);
            onextracallbackwithresult.label = 4;
            objOnExtraCallbackWithResult = onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -344520983, 344520985, new Object[]{this, context, onextracallbackwithresult}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        } else {
            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context);
            onextracallbackwithresult.label = 2;
            objOnExtraCallbackWithResult = onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -344520983, 344520985, new Object[]{this, context, onextracallbackwithresult}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull Activity activity, @NotNull access13800<? super getFillColor> access13800Var) throws NoWhenBranchMatchedException {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (!(access13800Var instanceof IAuthTabCallback)) {
            iAuthTabCallback = new IAuthTabCallback(access13800Var);
        } else {
            int i2 = IAuthTabCallbackStubProxy + 69;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object objOnExtraCallbackWithResult = iAuthTabCallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback2.label;
        Object obj = null;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            getTrimPathOffset gettrimpathoffset = getTrimPathOffset.onWarmupCompleted;
            iAuthTabCallback2.L$0 = activity;
            iAuthTabCallback2.label = 1;
            objOnExtraCallbackWithResult = gettrimpathoffset.onExtraCallbackWithResult(activity, iAuthTabCallback2);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = IAuthTabCallbackStubProxy + 39;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                throw null;
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            setStrokeAlpha setstrokealpha = (setStrokeAlpha) objOnExtraCallbackWithResult;
            if (!(!(setstrokealpha instanceof setStrokeAlpha.onNavigationEvent))) {
                if (!(!((setStrokeAlpha.onNavigationEvent) setstrokealpha).onExtraCallbackWithResult().onNavigationEvent())) {
                    return getFillColor.AVAILABLE;
                }
                getFillColor getfillcolor = getFillColor.PRIVACY_CONSENT_NOT_READY;
                int i7 = access100 + 75;
                IAuthTabCallbackStubProxy = i7 % 128;
                if (i7 % 2 != 0) {
                    return getfillcolor;
                }
                obj.hashCode();
                throw null;
            }
            if (!(setstrokealpha instanceof setStrokeAlpha.onExtraCallbackWithResult)) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual(((setStrokeAlpha.onExtraCallbackWithResult) setstrokealpha).onNavigationEvent(), "ADMOB_DISABLED_BY_PRIVACY_RIGHTS")) {
                return getFillColor.DISABLED_BY_PRIVACY_RIGHTS;
            }
            if (!Intrinsics.areEqual(r11, "ADMOB_STATUS_UNAVAILABLE")) {
                return getFillColor.PRIVACY_CONSENT_NOT_READY;
            }
            int i8 = access100 + 15;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            return getFillColor.STATUS_UNAVAILABLE;
        }
        activity = (Activity) iAuthTabCallback2.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        Activity activity2 = activity;
        int i10 = onWarmupCompleted.onExtraCallbackWithResult[((setFillColor) objOnExtraCallbackWithResult).ordinal()];
        if (i10 == 1) {
            return getFillColor.DISABLED_BY_PRIVACY_RIGHTS;
        }
        if (i10 == 2) {
            return getFillColor.STATUS_UNAVAILABLE;
        }
        if (i10 == 3) {
            return getFillColor.AVAILABLE;
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        iAuthTabCallback2.L$0 = access15400.onNavigationEvent(activity2);
        iAuthTabCallback2.label = 2;
        objOnExtraCallbackWithResult = onExtraCallbackWithResult(this, activity2, false, iAuthTabCallback2, 2, null);
    }

    public final setFillAlpha onExtraCallback(@NotNull Context context) throws Throwable {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        setFillColor setfillcolorOnExtraCallback = getTrimPathOffset.onWarmupCompleted.onExtraCallback(context);
        try {
            Result.Companion companion = kotlin.Result.Companion;
            ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(context.getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(consentInformation, "");
            objOnExtraCallback = kotlin.Result.constructor-impl(IAuthTabCallback(consentInformation, setfillcolorOnExtraCallback));
            int i4 = IAuthTabCallbackStubProxy + 65;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            objOnExtraCallback = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.exceptionOrNull-impl(objOnExtraCallback) != null) {
            objOnExtraCallback = onExtraCallbackWithResult.onExtraCallback(setfillcolorOnExtraCallback);
        }
        return (setFillAlpha) objOnExtraCallback;
    }

    public final Object onExtraCallbackWithResult(@NotNull Context context, @NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(onExtraCallback(context).IAuthTabCallback(), "REQUIRED");
        if (i3 == 0) {
            access14000.onNavigationEvent(zAreEqual);
            throw null;
        }
        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(zAreEqual);
        int i4 = IAuthTabCallbackStubProxy + 31;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return boolOnNavigationEvent;
    }

    public static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super setStrokeAlpha>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private static char[] onWarmupCompleted = {27239, 27166, 27166, 27164, 27141, 27164, 27160, 27164, 27165, 27136, 27138, 27138, 27167};
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(Activity activity, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$activity = activity;
        }

        public static /* synthetic */ void onExtraCallback(findResAndMsg findresandmsg, pauseMyRequest pausemyrequest, ConsentInformation consentInformation, Activity activity) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(findresandmsg, pausemyrequest, consentInformation, activity);
            int i4 = IAuthTabCallback + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ void onNavigationEvent(pauseMyRequest pausemyrequest, FormError formError) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(pausemyrequest, formError);
            if (i3 != 0) {
                int i4 = 95 / 0;
            }
            int i5 = onExtraCallback + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super setStrokeAlpha> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            access000 access000VarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                access000VarCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = access000VarCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = new access000(this.$activity, access13800Var);
            access000Var.L$0 = obj;
            int i2 = onExtraCallback + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return access000Var;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super setStrokeAlpha> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 45;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objIAuthTabCallback;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int length;
            char[] cArr;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr2 = onWarmupCompleted;
            if (cArr2 != null) {
                int i6 = $11 + 75;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                for (int i7 = 0; i7 < length; i7++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.getOffsetBefore("", 0) + 35, TextUtils.getTrimmedLength("") + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i8 = $10 + 23;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10983 - AndroidCharacter.getMirror('0')), 65 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 16718 - KeyEvent.keyCodeFromString(""), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 70 - TextUtils.getTrimmedLength(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i12 = $11 + 27;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i14 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i14, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i14);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private static final void IAuthTabCallback(findResAndMsg findresandmsg, pauseMyRequest pausemyrequest, ConsentInformation consentInformation, Activity activity) throws Throwable {
            Object onextracallbackwithresult;
            int i = 2 % 2;
            try {
                Result.Companion companion = kotlin.Result.Companion;
                getTrimPathStart gettrimpathstart = getTrimPathStart.onExtraCallbackWithResult;
                Intrinsics.checkNotNull(consentInformation);
                onextracallbackwithresult = kotlin.Result.constructor-impl(new setStrokeAlpha.onNavigationEvent(getTrimPathStart.onExtraCallback(gettrimpathstart, consentInformation, getTrimPathOffset.onWarmupCompleted.onExtraCallback(activity)), false));
                int i2 = onExtraCallback + 23;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                onextracallbackwithresult = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = kotlin.Result.exceptionOrNull-impl(onextracallbackwithresult);
            if (th2 != null) {
                int i4 = onExtraCallback + 65;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                String message = th2.getMessage();
                if (message == null) {
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 13, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1}, objArr);
                    message = ((String) objArr[0]).intern();
                    int i6 = IAuthTabCallback + 63;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 13, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1}, objArr2);
                onextracallbackwithresult = new setStrokeAlpha.onExtraCallbackWithResult(((String) objArr2[0]).intern(), message);
            }
            pausemyrequest.IAuthTabCallback((setStrokeAlpha) onextracallbackwithresult);
        }

        private static final void onExtraCallback(pauseMyRequest pausemyrequest, FormError formError) {
            int i = 2 % 2;
            String message = formError.getMessage();
            Intrinsics.checkNotNullExpressionValue(message, "");
            pausemyrequest.IAuthTabCallback(new setStrokeAlpha.onExtraCallbackWithResult("CONSENT_INFO_UPDATE_FAILED", message));
            int i2 = IAuthTabCallback + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        /* renamed from: o.getTrimPathStart$access000$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super setStrokeAlpha>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ pauseMyRequest<setStrokeAlpha> $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(pauseMyRequest<setStrokeAlpha> pausemyrequest, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$result = pausemyrequest;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$result, access13800Var);
                int i2 = onNavigationEvent + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 125;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super setStrokeAlpha> access13800Var) {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 107;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                    int i4 = 11 / 0;
                } else {
                    objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = onNavigationEvent + 25;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 92 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = onNavigationEvent + 25;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                pauseMyRequest<setStrokeAlpha> pausemyrequest = this.$result;
                this.label = 1;
                Object objIAuthTabCallback = pausemyrequest.IAuthTabCallback(this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                int i5 = onNavigationEvent + 1;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            final findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                final ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(this.$activity.getApplicationContext());
                final pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
                Activity activity = this.$activity;
                Object[] objArr = {getTrimPathStart.onExtraCallbackWithResult, activity};
                ConsentRequestParameters consentRequestParameters = (ConsentRequestParameters) getTrimPathStart.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1522361074, 1522361078, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
                final Activity activity2 = this.$activity;
                consentInformation.requestConsentInfoUpdate(activity, consentRequestParameters, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: im.toss.ads_sdk.admob.AdMobPrivacyConsentManager$updateConsentInfo$2$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final void onConsentInfoUpdateSuccess() throws Throwable {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 91;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        getTrimPathStart.access000.onExtraCallback(findresandmsg, pausemyrequestOnExtraCallback, consentInformation, activity2);
                        int i6 = onNavigationEvent + 69;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: im.toss.ads_sdk.admob.AdMobPrivacyConsentManager$updateConsentInfo$2$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final void onConsentInfoUpdateFailure(FormError formError) {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallback + 63;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        getTrimPathStart.access000.onNavigationEvent(pausemyrequestOnExtraCallback, formError);
                        int i6 = onNavigationEvent + 59;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                    }
                });
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(pausemyrequestOnExtraCallback, null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(consentInformation);
                this.L$2 = access15400.onNavigationEvent(pausemyrequestOnExtraCallback);
                this.label = 1;
                objOnWarmupCompleted = doGet.onWarmupCompleted(10000L, anonymousClass4, this);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    int i3 = IAuthTabCallback + 71;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = obj;
            }
            Object onextracallbackwithresult = (setStrokeAlpha) objOnWarmupCompleted;
            if (onextracallbackwithresult == null) {
                onextracallbackwithresult = new setStrokeAlpha.onExtraCallbackWithResult("CONSENT_INFO_UPDATE_FAILED", "Consent info update timed out.");
            }
            int i5 = onExtraCallback + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult;
        }
    }

    public static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super setStrokeAlpha>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {64993, 64992, 64996, 65020, 65021, 65016, 64998, 65004, 65014};
        private static char onExtraCallback = 51242;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ long $generation;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(Activity activity, long j, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$activity = activity;
            this.$generation = j;
        }

        public static /* synthetic */ void IAuthTabCallback(Function1 function1, FormError formError) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(function1, formError);
            int i4 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ Unit onNavigationEvent(findResAndMsg findresandmsg, pauseMyRequest pausemyrequest, ConsentInformation consentInformation, Activity activity, boolean z, FormError formError) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, pausemyrequest, consentInformation, activity, z, formError);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitOnWarmupCompleted = onWarmupCompleted(findresandmsg, pausemyrequest, consentInformation, activity, z, formError);
            int i3 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 26 / 0;
            }
            return unitOnWarmupCompleted;
        }

        public static /* synthetic */ void onNavigationEvent(Function1 function1, FormError formError) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(function1, formError);
            int i4 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$activity, this.$generation, access13800Var);
            iAuthTabCallbackDefault.L$0 = obj;
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 84 / 0;
            }
            int i5 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super setStrokeAlpha> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
        
            if (r18.$activity.isDestroyed() == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        
            if (r18.$activity.isDestroyed() == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
        
            r3 = o.getTrimPathStart.IAuthTabCallbackDefault.onExtraCallbackWithResult + 45;
            o.getTrimPathStart.IAuthTabCallbackDefault.onWarmupCompleted = r3 % 128;
            r3 = r3 % 2;
            r12 = com.google.android.ump.UserMessagingPlatform.getConsentInformation(r18.$activity.getApplicationContext());
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
        
            if (r12.getConsentStatus() != 2) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
        
            r13 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
        
            r13 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
        
            r14 = o.getTrimPathStart.onExtraCallbackWithResult;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12);
            r15 = kotlin.jvm.internal.Intrinsics.areEqual(o.getTrimPathStart.onWarmupCompleted(r14, o.getTrimPathStart.onExtraCallback(r14, r12, o.getTrimPathOffset.onWarmupCompleted.onExtraCallback(r18.$activity)), r18.$activity), "GRANTED");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
        
            if (r12.getPrivacyOptionsRequirementStatus() != com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
        
            r3 = o.getTrimPathStart.IAuthTabCallbackDefault.onWarmupCompleted + 75;
            o.getTrimPathStart.IAuthTabCallbackDefault.onExtraCallbackWithResult = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
        
            if ((r3 % 2) == 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
        
            r3 = 55 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
        
            if ((!r15) == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
        
            if (r15 == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
        
            r8 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
        
            r8 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        
            if (r13 == 0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
        
            r3 = o.getTrimPathStart.IAuthTabCallbackDefault.onWarmupCompleted + 111;
            o.getTrimPathStart.IAuthTabCallbackDefault.onExtraCallbackWithResult = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
        
            if (r12.isConsentFormAvailable() != false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
        
            if (r13 != 0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
        
            if (r8 == 0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
        
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
        
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00df, code lost:
        
            r5 = o.getResRootDir.onExtraCallback((o.getPackageType) null, 1, (java.lang.Object) null);
            r3 = r18.$activity;
            r17 = r7;
            r1 = r8;
            r4 = new im.toss.ads_sdk.admob.AdMobPrivacyConsentManager$requestConsentForm$2$result$1$$ExternalSyntheticLambda0(r2, r5, r12, r3, r17);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
        
            if (r13 == 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
        
            com.google.android.ump.UserMessagingPlatform.loadAndShowConsentFormIfRequired(r18.$activity, new im.toss.ads_sdk.admob.AdMobPrivacyConsentManager$requestConsentForm$2$result$1$$ExternalSyntheticLambda1(r4));
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
        
            if (r1 == 0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0109, code lost:
        
            com.google.android.ump.UserMessagingPlatform.showPrivacyOptionsForm(r18.$activity, new im.toss.ads_sdk.admob.AdMobPrivacyConsentManager$requestConsentForm$2$result$1$$ExternalSyntheticLambda2(r4));
            r3 = o.getTrimPathStart.IAuthTabCallbackDefault.onWarmupCompleted + 59;
            o.getTrimPathStart.IAuthTabCallbackDefault.onExtraCallbackWithResult = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x011e, code lost:
        
            r4.invoke((java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0122, code lost:
        
            r3 = r18.$generation;
            r18.L$0 = o.access15400.onNavigationEvent(r2);
            r18.L$1 = o.access15400.onNavigationEvent(r12);
            r18.L$2 = o.access15400.onNavigationEvent(r5);
            r18.L$3 = o.access15400.onNavigationEvent(r4);
            r18.L$4 = r14;
            r18.I$0 = r13;
            r18.Z$0 = r15;
            r18.I$1 = r1;
            r18.I$2 = r17 ? 1 : 0;
            r18.J$0 = r3;
            r18.label = 1;
            r1 = r5.IAuthTabCallback(r18);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0153, code lost:
        
            if (r1 != r9) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0155, code lost:
        
            r1 = o.getTrimPathStart.IAuthTabCallbackDefault.onExtraCallbackWithResult + 19;
            o.getTrimPathStart.IAuthTabCallbackDefault.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x015f, code lost:
        
            return r9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            getTrimPathStart gettrimpathstart;
            long j;
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            final findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!this.$activity.isFinishing()) {
                    int i5 = onWarmupCompleted + 57;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 13 / 0;
                    }
                }
                return new setStrokeAlpha.onExtraCallbackWithResult("CONSENT_FORM_FAILED", "Activity is not available.");
            }
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.J$0;
            getTrimPathStart gettrimpathstart2 = (getTrimPathStart) this.L$4;
            ResultKt.onNavigationEvent(obj);
            gettrimpathstart = gettrimpathstart2;
            j = j2;
            objIAuthTabCallback = obj;
            return getTrimPathStart.onWarmupCompleted(gettrimpathstart, j, (setStrokeAlpha) objIAuthTabCallback, "CONSENT_FORM_FAILED");
        }

        private static final Unit onWarmupCompleted(findResAndMsg findresandmsg, pauseMyRequest pausemyrequest, ConsentInformation consentInformation, Activity activity, boolean z, FormError formError) throws Throwable {
            Object obj;
            Object onextracallbackwithresult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (formError != null) {
                String message = formError.getMessage();
                Intrinsics.checkNotNullExpressionValue(message, "");
                onextracallbackwithresult = new setStrokeAlpha.onExtraCallbackWithResult("CONSENT_FORM_FAILED", message);
            } else {
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    getTrimPathStart gettrimpathstart = getTrimPathStart.onExtraCallbackWithResult;
                    Intrinsics.checkNotNull(consentInformation);
                    obj = kotlin.Result.constructor-impl(new setStrokeAlpha.onNavigationEvent(getTrimPathStart.onExtraCallback(gettrimpathstart, consentInformation, getTrimPathOffset.onWarmupCompleted.onExtraCallback(activity)), z));
                } catch (Throwable th) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    int i4 = onWarmupCompleted + 13;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        th2.getMessage();
                        throw null;
                    }
                    String message2 = th2.getMessage();
                    if (message2 == null) {
                        Object[] objArr = new Object[1];
                        a(new char[]{7, 3, 3, 5, 5, 0, 7, 1, 6, 2, 3, 6, 13890}, (byte) (122 - (Process.myTid() >> 22)), ImageFormat.getBitsPerPixel(0) + 14, objArr);
                        message2 = ((String) objArr[0]).intern();
                        int i5 = onWarmupCompleted + 5;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    Object[] objArr2 = new Object[1];
                    a(new char[]{7, 3, 3, 5, 5, 0, 7, 1, 6, 2, 3, 6, 13890}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 122), 13 - Gravity.getAbsoluteGravity(0, 0), objArr2);
                    setStrokeAlpha.onExtraCallbackWithResult onextracallbackwithresult2 = new setStrokeAlpha.onExtraCallbackWithResult(((String) objArr2[0]).intern(), message2);
                    int i7 = onExtraCallbackWithResult + 49;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    obj = onextracallbackwithresult2;
                }
                onextracallbackwithresult = (setStrokeAlpha) obj;
            }
            pausemyrequest.IAuthTabCallback(onextracallbackwithresult);
            Unit unit = Unit.INSTANCE;
            int i9 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }

        private static final void onWarmupCompleted(Function1 function1, FormError formError) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(formError);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final void onExtraCallbackWithResult(Function1 function1, FormError formError) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(formError);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            int i4 = -1310771303;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 26 - View.MeasureSpec.makeMeasureSpec(0, 0), 23140 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5++;
                        i4 = -1310771303;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i6 = $11 + 79;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 26 - (ViewConfiguration.getLongPressTimeout() >> 16), View.MeasureSpec.getSize(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i8 = $11 + 87;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent - 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            try {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - TextUtils.getOffsetBefore("", 0)), Process.getGidForName("") + 75, ExpandableListView.getPackedPositionType(0L) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    int i9 = $11 + 85;
                                    $10 = i9 % 128;
                                    int i10 = i9 % 2;
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 30 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19487, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                                } else {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                    } else {
                                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                                    }
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super setStrokeAlpha>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ long $generation;
        final /* synthetic */ String $referrer;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private static char[] onExtraCallbackWithResult = {65014, 65021, 64993, 65004, 64998, 64969, 65020, 64996, 65016};
        private static char onWarmupCompleted = 51242;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(Activity activity, String str, long j, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$activity = activity;
            this.$referrer = str;
            this.$generation = j;
        }

        public static /* synthetic */ void onNavigationEvent(findResAndMsg findresandmsg, pauseMyRequest pausemyrequest, ConsentInformation consentInformation, Activity activity, FormError formError) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(findresandmsg, pausemyrequest, consentInformation, activity, formError);
            int i4 = onNavigationEvent + 55;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$activity, this.$referrer, this.$generation, access13800Var);
            asbinder.L$0 = obj;
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return asbinder;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super setStrokeAlpha> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super setStrokeAlpha> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return asbinderCreate.invokeSuspend(unit);
            }
            asbinderCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallbackWithResult;
            Object obj2 = null;
            if (cArr2 != null) {
                int i4 = $11 + 33;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 27, 23139 - TextUtils.getTrimmedLength(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 26 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                    int i7 = $11 + 21;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        int i9 = $10 + 9;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i11 = $10 + 31;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 24824), TextUtils.lastIndexOf("", '0', 0) + 75, 8087 - MotionEvent.axisFromString(""), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getOffsetAfter("", 0) + 30, 19488 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                int i14 = $11 + 51;
                                $10 = i14 % 128;
                                int i15 = i14 % 2;
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i16 = $10 + 31;
                                    $11 = i16 % 128;
                                    int i17 = i16 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                                } else {
                                    int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                                }
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                for (int i22 = 0; i22 < i; i22++) {
                    cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            final findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$activity.isFinishing() || this.$activity.isDestroyed()) {
                    return new setStrokeAlpha.onExtraCallbackWithResult("CONSENT_FORM_FAILED", "Activity is not available.");
                }
                int i5 = IAuthTabCallback + 81;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                final ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(this.$activity.getApplicationContext());
                if (consentInformation.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED) {
                    getTrimPathStart gettrimpathstart = getTrimPathStart.onExtraCallbackWithResult;
                    Intrinsics.checkNotNull(consentInformation);
                    return new setStrokeAlpha.onNavigationEvent(getTrimPathStart.onExtraCallback(gettrimpathstart, consentInformation, getTrimPathOffset.onWarmupCompleted.onExtraCallback(this.$activity)), false);
                }
                final pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
                getTrimPathStart.onExtraCallback(getTrimPathStart.onExtraCallbackWithResult, this.$activity, this.$referrer);
                final Activity activity = this.$activity;
                UserMessagingPlatform.showPrivacyOptionsForm(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: im.toss.ads_sdk.admob.AdMobPrivacyConsentManager$showPrivacyOptionsForm$2$result$1$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final void onConsentFormDismissed(FormError formError) throws Throwable {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 111;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 != 0) {
                            getTrimPathStart.asBinder.onNavigationEvent(findresandmsg, pausemyrequestOnExtraCallback, consentInformation, activity, formError);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        getTrimPathStart.asBinder.onNavigationEvent(findresandmsg, pausemyrequestOnExtraCallback, consentInformation, activity, formError);
                        int i9 = onNavigationEvent + 101;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                    }
                });
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(consentInformation);
                this.L$2 = access15400.onNavigationEvent(pausemyrequestOnExtraCallback);
                this.label = 1;
                obj = pausemyrequestOnExtraCallback.IAuthTabCallback(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            setStrokeAlpha setstrokealphaOnWarmupCompleted = getTrimPathStart.onWarmupCompleted(getTrimPathStart.onExtraCallbackWithResult, this.$generation, (setStrokeAlpha) obj, "CONSENT_FORM_FAILED");
            int i7 = onNavigationEvent + 75;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return setstrokealphaOnWarmupCompleted;
        }

        private static final void onExtraCallbackWithResult(findResAndMsg findresandmsg, pauseMyRequest pausemyrequest, ConsentInformation consentInformation, Activity activity, FormError formError) throws Throwable {
            Object onextracallbackwithresult;
            Object onextracallbackwithresult2;
            String strIntern;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (formError != null) {
                String message = formError.getMessage();
                Intrinsics.checkNotNullExpressionValue(message, "");
                onextracallbackwithresult2 = new setStrokeAlpha.onExtraCallbackWithResult("CONSENT_FORM_FAILED", message);
            } else {
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    getTrimPathStart gettrimpathstart = getTrimPathStart.onExtraCallbackWithResult;
                    Intrinsics.checkNotNull(consentInformation);
                    onextracallbackwithresult = kotlin.Result.constructor-impl(new setStrokeAlpha.onNavigationEvent(getTrimPathStart.onExtraCallback(gettrimpathstart, consentInformation, getTrimPathOffset.onWarmupCompleted.onExtraCallback(activity)), true));
                } catch (Throwable th) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    onextracallbackwithresult = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = kotlin.Result.exceptionOrNull-impl(onextracallbackwithresult);
                if (th2 != null) {
                    String message2 = th2.getMessage();
                    if (message2 == null) {
                        int i4 = IAuthTabCallback + 87;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 != 0) {
                            Object[] objArr = new Object[1];
                            a(new char[]{7, 4, 7, 2, 7, '\b', 0, 4, 1, 0, 0, '\b', 13803}, (byte) (73 % View.MeasureSpec.getMode(1)), 32 << (ViewConfiguration.getMinimumFlingVelocity() / 117), objArr);
                            strIntern = ((String) objArr[0]).intern();
                        } else {
                            Object[] objArr2 = new Object[1];
                            a(new char[]{7, 4, 7, 2, 7, '\b', 0, 4, 1, 0, 0, '\b', 13803}, (byte) (35 - View.MeasureSpec.getMode(0)), 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                            strIntern = ((String) objArr2[0]).intern();
                        }
                        message2 = strIntern;
                    }
                    Object[] objArr3 = new Object[1];
                    a(new char[]{7, 4, 7, 2, 7, '\b', 0, 4, 1, 0, 0, '\b', 13803}, (byte) (36 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 13 - TextUtils.getTrimmedLength(""), objArr3);
                    onextracallbackwithresult = new setStrokeAlpha.onExtraCallbackWithResult(((String) objArr3[0]).intern(), message2);
                }
                onextracallbackwithresult2 = (setStrokeAlpha) onextracallbackwithresult;
            }
            pausemyrequest.IAuthTabCallback(onextracallbackwithresult2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[Catch: all -> 0x0155, TRY_ENTER, TryCatch #3 {all -> 0x0155, blocks: (B:61:0x0145, B:63:0x014e, B:78:0x0177, B:79:0x017c, B:80:0x017d, B:81:0x0182), top: B:98:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull Activity activity, @NotNull String str, @NotNull access13800<? super setStrokeAlpha> access13800Var) throws Throwable {
        onTransact ontransact;
        String str2;
        String str3;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        Activity activity2;
        int i;
        String str4;
        Throwable th;
        String message;
        Activity activity3;
        setStrokeAlpha onextracallbackwithresult;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2;
        String str5;
        String str6;
        Object objOnExtraCallback;
        Activity activity4 = activity;
        int i2 = 2 % 2;
        if (access13800Var instanceof onTransact) {
            ontransact = (onTransact) access13800Var;
            int i3 = ontransact.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ontransact.label = i3 - 2147483648;
            } else {
                ontransact = new onTransact(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = ontransact.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni3 = ontransact.label;
        try {
            if (jni_ygnodestylegetflexbasisjni3 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                getTrimPathOffset gettrimpathoffset = getTrimPathOffset.onWarmupCompleted;
                ontransact.L$0 = activity4;
                str2 = str;
                ontransact.L$1 = str2;
                ontransact.label = 1;
                objOnExtraCallbackWithResult = gettrimpathoffset.onExtraCallbackWithResult(activity4, ontransact);
                if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (jni_ygnodestylegetflexbasisjni3 != 1) {
                int i4 = access100;
                int i5 = i4 + 65;
                IAuthTabCallbackStubProxy = i5 % 128;
                if (i5 % 2 != 0 ? jni_ygnodestylegetflexbasisjni3 != 2 : jni_ygnodestylegetflexbasisjni3 != 3) {
                    int i6 = i4 + 89;
                    IAuthTabCallbackStubProxy = i6 % 128;
                    int i7 = i6 % 2;
                    if (jni_ygnodestylegetflexbasisjni3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = i4 + 25;
                    IAuthTabCallbackStubProxy = i8 % 128;
                    int i9 = i8 % 2;
                    jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) ontransact.L$2;
                    str5 = (String) ontransact.L$1;
                    activity3 = (Activity) ontransact.L$0;
                    try {
                        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                        onextracallbackwithresult = (setStrokeAlpha) objOnExtraCallbackWithResult;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        activity2 = activity3;
                        str4 = str5;
                        jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
                        message = th.getMessage();
                        if (message == null) {
                        }
                        activity3 = activity2;
                        onextracallbackwithresult = new setStrokeAlpha.onExtraCallbackWithResult("CONSENT_FORM_FAILED", message);
                        jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni;
                        str5 = str4;
                        if (onextracallbackwithresult instanceof setStrokeAlpha.onNavigationEvent) {
                        }
                        jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                        return onextracallbackwithresult;
                    }
                    if (onextracallbackwithresult instanceof setStrokeAlpha.onNavigationEvent) {
                    }
                    jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                    return onextracallbackwithresult;
                }
                i = ontransact.I$0;
                jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) ontransact.L$2;
                String str7 = (String) ontransact.L$1;
                Activity activity5 = (Activity) ontransact.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                str3 = str7;
                activity2 = activity5;
                long j = onWarmupCompleted.get();
                try {
                    try {
                        setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                        str6 = str3;
                        try {
                            asBinder asbinder = new asBinder(activity2, str3, j, null);
                            ontransact.L$0 = activity2;
                            ontransact.L$1 = str6;
                            ontransact.L$2 = jni_ygnodestylegetflexbasisjni;
                            ontransact.I$0 = i;
                            ontransact.I$1 = 0;
                            ontransact.J$0 = j;
                            ontransact.label = 3;
                            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, asbinder, ontransact);
                        } catch (Throwable th3) {
                            th = th3;
                            str4 = str6;
                            message = th.getMessage();
                            if (message == null) {
                                int i10 = access100 + 23;
                                IAuthTabCallbackStubProxy = i10 % 128;
                                int i11 = i10 % 2;
                                message = "CONSENT_FORM_FAILED";
                            }
                            activity3 = activity2;
                            onextracallbackwithresult = new setStrokeAlpha.onExtraCallbackWithResult("CONSENT_FORM_FAILED", message);
                            jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni;
                            str5 = str4;
                            try {
                                if (onextracallbackwithresult instanceof setStrokeAlpha.onNavigationEvent) {
                                }
                                jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                                return onextracallbackwithresult;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str6 = str3;
                    }
                    if (objOnExtraCallback != objOnWarmupCompleted) {
                        activity3 = activity2;
                        jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni;
                        str5 = str6;
                        objOnExtraCallbackWithResult = objOnExtraCallback;
                        onextracallbackwithresult = (setStrokeAlpha) objOnExtraCallbackWithResult;
                        if (onextracallbackwithresult instanceof setStrokeAlpha.onNavigationEvent) {
                            if (!(onextracallbackwithresult instanceof setStrokeAlpha.onExtraCallbackWithResult)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i12 = IAuthTabCallbackStubProxy + 65;
                            access100 = i12 % 128;
                            if (i12 % 2 != 0) {
                                onExtraCallbackWithResult.onExtraCallbackWithResult(activity3, str5, onextracallbackwithresult);
                                throw null;
                            }
                            try {
                                onExtraCallbackWithResult.onExtraCallbackWithResult(activity3, str5, onextracallbackwithresult);
                            } catch (Throwable th6) {
                                th = th6;
                                jni_ygnodestylegetflexbasisjni3 = jni_ygnodestylegetflexbasisjni2;
                                jni_ygnodestylegetflexbasisjni3.onWarmupCompleted((Object) null);
                                throw th;
                            }
                        } else if (((setStrokeAlpha.onNavigationEvent) onextracallbackwithresult).onWarmupCompleted()) {
                            onExtraCallbackWithResult.onExtraCallbackWithResult(activity3, str5, onextracallbackwithresult);
                        }
                        jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                        return onextracallbackwithresult;
                    }
                    return objOnWarmupCompleted;
                } catch (CancellationException e2) {
                    throw e2;
                }
            }
            String str8 = (String) ontransact.L$1;
            Activity activity6 = (Activity) ontransact.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            str2 = str8;
            activity4 = activity6;
            int i13 = onWarmupCompleted.onExtraCallbackWithResult[((setFillColor) objOnExtraCallbackWithResult).ordinal()];
            if (i13 == 1) {
                return new setStrokeAlpha.onExtraCallbackWithResult("ADMOB_DISABLED_BY_PRIVACY_RIGHTS", "개인정보 수집 반대권 설정으로 AdMob을 사용할 수 없어요.");
            }
            if (i13 == 2) {
                return new setStrokeAlpha.onExtraCallbackWithResult("ADMOB_STATUS_UNAVAILABLE", "AdMob 사용 가능 상태를 확인할 수 없어요.");
            }
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni4 = onExtraCallback;
            ontransact.L$0 = activity4;
            ontransact.L$1 = str2;
            ontransact.L$2 = jni_ygnodestylegetflexbasisjni4;
            ontransact.I$0 = 0;
            ontransact.label = 2;
            if (jni_ygnodestylegetflexbasisjni4.IAuthTabCallback((Object) null, ontransact) != objOnWarmupCompleted) {
                int i14 = access100 + 47;
                IAuthTabCallbackStubProxy = i14 % 128;
                int i15 = i14 % 2;
                str3 = str2;
                jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni4;
                activity2 = activity4;
                i = 0;
                long j2 = onWarmupCompleted.get();
                setPatch setpatchOnExtraCallback2 = putChannelInfo.onExtraCallback().onExtraCallback();
                str6 = str3;
                asBinder asbinder2 = new asBinder(activity2, str3, j2, null);
                ontransact.L$0 = activity2;
                ontransact.L$1 = str6;
                ontransact.L$2 = jni_ygnodestylegetflexbasisjni;
                ontransact.I$0 = i;
                ontransact.I$1 = 0;
                ontransact.J$0 = j2;
                ontransact.label = 3;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback2, asbinder2, ontransact);
                if (objOnExtraCallback != objOnWarmupCompleted) {
                }
            }
            return objOnWarmupCompleted;
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            UserMessagingPlatform.getConsentInformation(context.getApplicationContext()).reset();
            IAuthTabCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        UserMessagingPlatform.getConsentInformation(context.getApplicationContext()).reset();
        IAuthTabCallback();
        int i3 = access100 + 103;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getTrimPathStart gettrimpathstart = (getTrimPathStart) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        boolean zOnExtraCallback = gettrimpathstart.IAuthTabCallback(context).onExtraCallback("debug_geography_enabled", false);
        int i4 = access100 + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zOnExtraCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull Context context, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        IAuthTabCallback(context).onNavigationEvent("debug_geography_enabled", z);
        IAuthTabCallback();
        int i4 = access100 + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final TextRoundCornerProgressBarSavedState1 IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnTransact = ((RealInterceptorChain) Response.onExtraCallback(applicationContext, RealInterceptorChain.class)).extraCallback().onTransact();
        int i4 = IAuthTabCallbackStubProxy + 61;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnTransact;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy;
        getTrimPathStart gettrimpathstart = (getTrimPathStart) objArr[0];
        Activity activity = (Activity) objArr[1];
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2 = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = iAuthTabCallbackStubProxy2 instanceof IAuthTabCallbackStubProxy;
            throw null;
        }
        if (!(iAuthTabCallbackStubProxy2 instanceof IAuthTabCallbackStubProxy)) {
            iAuthTabCallbackStubProxy = gettrimpathstart.new IAuthTabCallbackStubProxy(iAuthTabCallbackStubProxy2);
        } else {
            iAuthTabCallbackStubProxy = iAuthTabCallbackStubProxy2;
            int i3 = iAuthTabCallbackStubProxy.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStubProxy.label = i3 - 2147483648;
            }
        }
        Object objOnExtraCallback = iAuthTabCallbackStubProxy.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = iAuthTabCallbackStubProxy.label;
        try {
            if (i4 != 0) {
                int i5 = access100 + 117;
                int i6 = i5 % 128;
                IAuthTabCallbackStubProxy = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 19;
                access100 = i8 % 128;
                if (i8 % 2 != 0) {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    throw null;
                }
                ResultKt.onNavigationEvent(objOnExtraCallback);
            } else {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                access000 access000Var = new access000(activity, null);
                iAuthTabCallbackStubProxy.L$0 = access15400.onNavigationEvent(activity);
                iAuthTabCallbackStubProxy.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, access000Var, iAuthTabCallbackStubProxy);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return (setStrokeAlpha) objOnExtraCallback;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "CONSENT_INFO_UPDATE_FAILED";
            }
            return new setStrokeAlpha.onExtraCallbackWithResult("CONSENT_INFO_UPDATE_FAILED", message);
        }
    }

    private final pauseMyRequest<setStrokeAlpha> onExtraCallback(Activity activity, long j) {
        int i = 2 % 2;
        Object obj = null;
        pauseMyRequest<setStrokeAlpha> pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        asBinder = pausemyrequestOnExtraCallback;
        IAuthTabCallbackStub = j;
        maybeUpdateAnimatable.onNavigationEvent(onTransact, (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(pausemyrequestOnExtraCallback, activity, null), 3, (Object) null);
        int i2 = access100 + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return pausemyrequestOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ pauseMyRequest<setStrokeAlpha> $deferred;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(pauseMyRequest<setStrokeAlpha> pausemyrequest, Activity activity, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$deferred = pausemyrequest;
            this.$activity = activity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = new getInterfaceDescriptor(this.$deferred, this.$activity, access13800Var);
            int i2 = onExtraCallback + 85;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return getinterfacedescriptor;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 121;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            pauseMyRequest<setStrokeAlpha> pausemyrequest;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                pauseMyRequest<setStrokeAlpha> pausemyrequest2 = this.$deferred;
                getTrimPathStart gettrimpathstart = getTrimPathStart.onExtraCallbackWithResult;
                Activity activity = this.$activity;
                this.L$0 = pausemyrequest2;
                this.label = 1;
                Object objIAuthTabCallback = getTrimPathStart.IAuthTabCallback(gettrimpathstart, activity, this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    int i3 = onExtraCallback + 55;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
                pausemyrequest = pausemyrequest2;
                obj = objIAuthTabCallback;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 55;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                pausemyrequest = (pauseMyRequest) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            pausemyrequest.IAuthTabCallback(obj);
            return Unit.INSTANCE;
        }
    }

    private final void IAuthTabCallback() {
        synchronized (asInterface) {
            onWarmupCompleted.incrementAndGet();
            asBinder = null;
            IAuthTabCallbackStub = -1L;
            IAuthTabCallback_Parcel = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final setStrokeAlpha onNavigationEvent(long j, setStrokeAlpha setstrokealpha, String str) {
        synchronized (asInterface) {
            if (onWarmupCompleted.get() != j) {
                setstrokealpha = new setStrokeAlpha.onExtraCallbackWithResult(str, "Consent info was reset.");
            } else {
                setStrokeAlpha.onNavigationEvent onnavigationevent = setstrokealpha instanceof setStrokeAlpha.onNavigationEvent ? (setStrokeAlpha.onNavigationEvent) setstrokealpha : null;
                IAuthTabCallback_Parcel = onnavigationevent != null ? onnavigationevent.onExtraCallbackWithResult() : null;
            }
        }
        return setstrokealpha;
    }

    private final setStrokeAlpha onWarmupCompleted(long j, setStrokeAlpha setstrokealpha, String str) {
        synchronized (asInterface) {
            AtomicLong atomicLong = onWarmupCompleted;
            if (atomicLong.get() != j) {
                setstrokealpha = new setStrokeAlpha.onExtraCallbackWithResult(str, "Consent info was reset.");
            } else {
                setStrokeAlpha.onNavigationEvent onnavigationevent = setstrokealpha instanceof setStrokeAlpha.onNavigationEvent ? (setStrokeAlpha.onNavigationEvent) setstrokealpha : null;
                IAuthTabCallback_Parcel = onnavigationevent != null ? onnavigationevent.onExtraCallbackWithResult() : null;
                if (setstrokealpha instanceof setStrokeAlpha.onNavigationEvent) {
                    long jIncrementAndGet = atomicLong.incrementAndGet();
                    pauseMyRequest<setStrokeAlpha> pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
                    pausemyrequestOnExtraCallback.IAuthTabCallback(setstrokealpha);
                    asBinder = pausemyrequestOnExtraCallback;
                    IAuthTabCallbackStub = jIncrementAndGet;
                }
            }
        }
        return setstrokealpha;
    }

    private final ConsentRequestParameters onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        Object[] objArr = {onExtraCallbackWithResult, context};
        if (((Boolean) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 48762646, -48762640, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback())).booleanValue()) {
            Response response = Response.onNavigationEvent;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            String upperCase = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(applicationContext, LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().onNavigationEvent().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(context).setDebugGeography(1).addTestDeviceHashedId(upperCase).build());
            int i2 = access100 + 101;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
        }
        ConsentRequestParameters consentRequestParametersBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(consentRequestParametersBuild, "");
        int i4 = access100 + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return consentRequestParametersBuild;
    }

    private static final Unit onNavigationEvent(String str, setFillAlpha setfillalpha, Context context, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(8 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 5, new char[]{7, 65530, 65531, 65530, 7, 7, 65530, 7}, true, 213 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("consent_status", setfillalpha.onExtraCallback());
        setDetectableSize.onExtraCallback("personalization_consent_status", onExtraCallbackWithResult.onWarmupCompleted(setfillalpha, context));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(final Context context, final String str, final setStrokeAlpha setstrokealpha) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5199192L, false, null, null, new Function1() { // from class: im.toss.ads_sdk.admob.AdMobPrivacyConsentManager$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 77;
                onExtraCallback = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    getTrimPathStart.onNavigationEvent(str, setstrokealpha, context, (SetDetectableSize) obj);
                    throw null;
                }
                Unit unitOnNavigationEvent = getTrimPathStart.onNavigationEvent(str, setstrokealpha, context, (SetDetectableSize) obj);
                int i4 = onExtraCallback + 105;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                obj2.hashCode();
                throw null;
            }
        }, 14, null);
        int i2 = IAuthTabCallbackStubProxy + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit IAuthTabCallback(String str, setStrokeAlpha setstrokealpha, Context context, SetDetectableSize setDetectableSize) throws Throwable {
        setFillAlpha setfillalphaOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(Color.red(0) + 8, 5 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{7, 65530, 65531, 65530, 7, 7, 65530, 7}, true, Color.red(0) + 214, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        if (setstrokealpha instanceof setStrokeAlpha.onNavigationEvent) {
            setfillalphaOnExtraCallback = ((setStrokeAlpha.onNavigationEvent) setstrokealpha).onExtraCallbackWithResult();
        } else {
            if (!(setstrokealpha instanceof setStrokeAlpha.onExtraCallbackWithResult)) {
                throw new NoWhenBranchMatchedException();
            }
            setfillalphaOnExtraCallback = onExtraCallbackWithResult.onExtraCallback(context);
        }
        setDetectableSize.onExtraCallback("consent_status", setfillalphaOnExtraCallback.onExtraCallback());
        setDetectableSize.onExtraCallback("personalization_consent_status", onExtraCallbackWithResult.onWarmupCompleted(setfillalphaOnExtraCallback, context));
        if (setstrokealpha instanceof setStrokeAlpha.onExtraCallbackWithResult) {
            int i2 = access100 + 89;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                setStrokeAlpha.onExtraCallbackWithResult onextracallbackwithresult = (setStrokeAlpha.onExtraCallbackWithResult) setstrokealpha;
                setDetectableSize.onExtraCallback("error_code", onextracallbackwithresult.onNavigationEvent());
                setDetectableSize.onExtraCallback("error_message", onextracallbackwithresult.onWarmupCompleted());
                int i3 = 19 / 0;
            } else {
                setStrokeAlpha.onExtraCallbackWithResult onextracallbackwithresult2 = (setStrokeAlpha.onExtraCallbackWithResult) setstrokealpha;
                setDetectableSize.onExtraCallback("error_code", onextracallbackwithresult2.onNavigationEvent());
                setDetectableSize.onExtraCallback("error_message", onextracallbackwithresult2.onWarmupCompleted());
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 81;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final String onWarmupCompleted(setFillAlpha setfillalpha, Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = setfillalpha.onExtraCallback();
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getSize(0) + 12, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, new char[]{0, 1, 6, 17, 4, 65527, 3, 7, 65531, 4, 65527, 65526}, false, 186 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        if (Intrinsics.areEqual(strOnExtraCallback, ((String) objArr[0]).intern())) {
            Object[] objArr2 = new Object[1];
            a(Color.alpha(0) + 12, 12 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{0, 1, 6, 17, 4, 65527, 3, 7, 65531, 4, 65527, 65526}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 184, objArr2);
            return ((String) objArr2[0]).intern();
        }
        if (!Intrinsics.areEqual(setfillalpha.onExtraCallback(), "OBTAINED")) {
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getTouchSlop() >> 8) + 7, 1 - Color.green(0), new char[]{5, 65534, 7, 65535, 65534, 65531, 65534}, true, 188 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
            return ((String) objArr3[0]).intern();
        }
        Context applicationContext = context.getApplicationContext();
        String string = applicationContext.getSharedPreferences(applicationContext.getPackageName() + "_preferences", 0).getString("IABTCF_PurposeConsents", null);
        Character orNull = string != null ? StringsKt.getOrNull(string, 2) : null;
        Character orNull2 = string != null ? StringsKt.getOrNull(string, 3) : null;
        if (orNull != null && orNull.charValue() == '1') {
            int i4 = IAuthTabCallbackStubProxy + 117;
            int i5 = i4 % 128;
            access100 = i5;
            int i6 = i4 % 2;
            if (orNull2 != null) {
                int i7 = i5 + 55;
                IAuthTabCallbackStubProxy = i7 % 128;
                if (i7 % 2 == 0) {
                    if (orNull2.charValue() == 22) {
                        return "GRANTED";
                    }
                } else if (orNull2.charValue() == '1') {
                    return "GRANTED";
                }
            }
        }
        Set<Character> set = IAuthTabCallback;
        if (CollectionsKt.contains(set, orNull)) {
            int i8 = access100 + 49;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            if (CollectionsKt.contains(set, orNull2)) {
                int i10 = access100 + 81;
                IAuthTabCallbackStubProxy = i10 % 128;
                if (i10 % 2 != 0) {
                    return "NOT_GRANTED";
                }
                throw null;
            }
        }
        Object[] objArr4 = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, (ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{5, 65534, 7, 65535, 65534, 65531, 65534}, true, 187 - ExpandableListView.getPackedPositionType(0L), objArr4);
        return ((String) objArr4[0]).intern();
    }

    private final setFillAlpha onExtraCallback(setFillColor setfillcolor) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(6 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{5, 65534, 7, 65535, 65534, 65531, 65534}, true, Gravity.getAbsoluteGravity(0, 0) + 187, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777223, TextUtils.getCapsMode("", 0, 0) + 1, new char[]{5, 65534, 7, 65535, 65534, 65531, 65534}, true, 187 - TextUtils.indexOf("", "", 0), objArr2);
        setFillAlpha setfillalpha = new setFillAlpha(strIntern, ((String) objArr2[0]).intern(), false, false, setfillcolor, false);
        int i2 = IAuthTabCallbackStubProxy + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return setfillalpha;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final setFillAlpha IAuthTabCallback(ConsentInformation consentInformation, setFillColor setfillcolor) throws Throwable {
        String strIntern;
        String str;
        ConsentInformation.PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus;
        int i;
        String strIntern2;
        int i2 = 2 % 2;
        boolean zCanRequestAds = consentInformation.canRequestAds();
        int consentStatus = consentInformation.getConsentStatus();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{0, 1, 6, 17, 4, 65527, 3, 7, 65531, 4, 65527, 65526}, false, KeyEvent.normalizeMetaState(0) + 185, objArr);
        String strIntern3 = ((String) objArr[0]).intern();
        if (consentStatus != 1) {
            int i3 = access100 + 1;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            if (consentStatus == 2) {
                str = "REQUIRED";
                privacyOptionsRequirementStatus = consentInformation.getPrivacyOptionsRequirementStatus();
                if (privacyOptionsRequirementStatus != null) {
                    int i5 = IAuthTabCallbackStubProxy + 45;
                    access100 = i5 % 128;
                    int i6 = i5 % 2;
                    i = -1;
                } else {
                    i = onWarmupCompleted.onWarmupCompleted[privacyOptionsRequirementStatus.ordinal()];
                    int i7 = IAuthTabCallbackStubProxy + 105;
                    access100 = i7 % 128;
                    int i8 = i7 % 2;
                }
                if (i == 1) {
                    int i9 = access100 + 23;
                    IAuthTabCallbackStubProxy = i9 % 128;
                    int i10 = i9 % 2;
                    if (i != 2) {
                        Object[] objArr2 = new Object[1];
                        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{5, 65534, 7, 65535, 65534, 65531, 65534}, true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 188, objArr2);
                        strIntern2 = ((String) objArr2[0]).intern();
                    } else {
                        strIntern2 = strIntern3;
                    }
                } else {
                    int i11 = IAuthTabCallbackStubProxy + 73;
                    access100 = i11 % 128;
                    int i12 = i11 % 2;
                    strIntern2 = "REQUIRED";
                }
                return new setFillAlpha(str, strIntern2, zCanRequestAds, !zCanRequestAds && setfillcolor.getCanUseAdMob(), setfillcolor, consentInformation.isConsentFormAvailable());
            }
            if (consentStatus != 3) {
                Object[] objArr3 = new Object[1];
                a(TextUtils.getTrimmedLength("") + 7, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{5, 65534, 7, 65535, 65534, 65531, 65534}, true, MotionEvent.axisFromString("") + 188, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                int i13 = IAuthTabCallbackStubProxy + 63;
                access100 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 2 % 5;
                }
            } else {
                strIntern = "OBTAINED";
            }
        } else {
            Object[] objArr4 = new Object[1];
            a(12 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, new char[]{0, 1, 6, 17, 4, 65527, 3, 7, 65531, 4, 65527, 65526}, false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 185, objArr4);
            strIntern = ((String) objArr4[0]).intern();
        }
        str = strIntern;
        privacyOptionsRequirementStatus = consentInformation.getPrivacyOptionsRequirementStatus();
        if (privacyOptionsRequirementStatus != null) {
        }
        if (i == 1) {
        }
        return new setFillAlpha(str, strIntern2, zCanRequestAds, !zCanRequestAds && setfillcolor.getCanUseAdMob(), setfillcolor, consentInformation.isConsentFormAvailable());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        asInterface asinterface;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2;
        setStrokeAlpha onextracallbackwithresult;
        int i;
        boolean z;
        int i2;
        Activity activity;
        String str;
        boolean z2;
        boolean z3;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni3;
        int i3 = 0;
        getTrimPathStart gettrimpathstart = (getTrimPathStart) objArr[0];
        Activity activity2 = (Activity) objArr[1];
        String str2 = (String) objArr[2];
        ?? BooleanValue = ((Boolean) objArr[3]).booleanValue();
        asInterface asinterface2 = (access13800) objArr[4];
        int i4 = 2 % 2;
        if (asinterface2 instanceof asInterface) {
            int i5 = access100 + 55;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            asinterface = asinterface2;
            int i7 = asinterface.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                asinterface.label = i7 - 2147483648;
            } else {
                asinterface = gettrimpathstart.new asInterface(asinterface2);
            }
        }
        Object objOnExtraCallback = asinterface.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = asinterface.label;
        Object obj = null;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                jni_ygnodestylegetflexbasisjni2 = BooleanValue;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            th = th2;
            jni_ygnodestylegetflexbasisjni = 1;
        }
        if (i8 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni4 = onExtraCallback;
            asinterface.L$0 = activity2;
            asinterface.L$1 = access15400.onNavigationEvent(str2);
            asinterface.L$2 = jni_ygnodestylegetflexbasisjni4;
            asinterface.Z$0 = BooleanValue;
            asinterface.I$0 = 0;
            asinterface.label = 1;
            if (jni_ygnodestylegetflexbasisjni4.IAuthTabCallback((Object) null, asinterface) != objOnWarmupCompleted) {
                int i9 = IAuthTabCallbackStubProxy + 63;
                access100 = i9 % 128;
                int i10 = i9 % 2;
                jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni4;
                i = 0;
                z = BooleanValue;
            }
            return objOnWarmupCompleted;
        }
        if (i8 != 1) {
            int i11 = access100 + 77;
            int i12 = i11 % 128;
            IAuthTabCallbackStubProxy = i12;
            if (i11 % 2 != 0 ? i8 != 2 : i8 != 3) {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = i12 + 21;
                access100 = i13 % 128;
                if (i13 % 2 != 0) {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    throw null;
                }
                jni_ygnodestylegetflexbasisjni3 = (jni_YGNodeStyleGetFlexBasisJNI) asinterface.L$2;
                ResultKt.onNavigationEvent(objOnExtraCallback);
                onextracallbackwithresult = (setStrokeAlpha) objOnExtraCallback;
                jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni3;
                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                return onextracallbackwithresult;
            }
            i3 = asinterface.I$1;
            i2 = asinterface.I$0;
            z2 = asinterface.Z$0;
            jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) asinterface.L$2;
            str = (String) asinterface.L$1;
            activity = (Activity) asinterface.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
            int i14 = IAuthTabCallbackStubProxy + 51;
            access100 = i14 % 128;
            int i15 = i14 % 2;
            onextracallbackwithresult = (setStrokeAlpha) objOnExtraCallback;
            if (!(onextracallbackwithresult instanceof setStrokeAlpha.onExtraCallbackWithResult)) {
                if (!(onextracallbackwithresult instanceof setStrokeAlpha.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i16 = access100 + 1;
                IAuthTabCallbackStubProxy = i16 % 128;
                if (i16 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i = i2;
                z3 = z2;
                str2 = str;
                activity2 = activity;
                long j = onWarmupCompleted.get();
                try {
                    setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                    IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(activity2, j, null);
                    asinterface.L$0 = access15400.onNavigationEvent(activity2);
                    asinterface.L$1 = access15400.onNavigationEvent(str2);
                    asinterface.L$2 = jni_ygnodestylegetflexbasisjni;
                    asinterface.Z$0 = z3;
                    asinterface.I$0 = i;
                    asinterface.I$1 = i3;
                    asinterface.J$0 = j;
                    asinterface.label = 3;
                    objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, iAuthTabCallbackDefault, asinterface);
                    if (objOnExtraCallback != objOnWarmupCompleted) {
                        jni_ygnodestylegetflexbasisjni3 = jni_ygnodestylegetflexbasisjni;
                        onextracallbackwithresult = (setStrokeAlpha) objOnExtraCallback;
                        jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni3;
                    }
                    return objOnWarmupCompleted;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th3) {
                    th = th3;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "CONSENT_FORM_FAILED";
                    }
                    onextracallbackwithresult = new setStrokeAlpha.onExtraCallbackWithResult("CONSENT_FORM_FAILED", message);
                    jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                    return onextracallbackwithresult;
                }
            }
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
            return onextracallbackwithresult;
        }
        int i17 = asinterface.I$0;
        boolean z4 = asinterface.Z$0;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni5 = (jni_YGNodeStyleGetFlexBasisJNI) asinterface.L$2;
        String str3 = (String) asinterface.L$1;
        Activity activity3 = (Activity) asinterface.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallback);
        i = i17;
        activity2 = activity3;
        jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni5;
        str2 = str3;
        z = z4;
        if (!z) {
            int i18 = access100 + 61;
            IAuthTabCallbackStubProxy = i18 % 128;
            int i19 = i18 % 2;
            z3 = z;
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
            long j2 = onWarmupCompleted.get();
            setPatch setpatchOnExtraCallback2 = putChannelInfo.onExtraCallback().onExtraCallback();
            IAuthTabCallbackDefault iAuthTabCallbackDefault2 = new IAuthTabCallbackDefault(activity2, j2, null);
            asinterface.L$0 = access15400.onNavigationEvent(activity2);
            asinterface.L$1 = access15400.onNavigationEvent(str2);
            asinterface.L$2 = jni_ygnodestylegetflexbasisjni;
            asinterface.Z$0 = z3;
            asinterface.I$0 = i;
            asinterface.I$1 = i3;
            asinterface.J$0 = j2;
            asinterface.label = 3;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback2, iAuthTabCallbackDefault2, asinterface);
            if (objOnExtraCallback != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        try {
            getTrimPathStart gettrimpathstart2 = onExtraCallbackWithResult;
            asinterface.L$0 = activity2;
            asinterface.L$1 = access15400.onNavigationEvent(str2);
            asinterface.L$2 = jni_ygnodestylegetflexbasisjni2;
            asinterface.Z$0 = z;
            asinterface.I$0 = i;
            asinterface.I$1 = 0;
            asinterface.label = 2;
            Object objOnExtraCallbackWithResult = gettrimpathstart2.onExtraCallbackWithResult(activity2, true, (access13800<? super setStrokeAlpha>) asinterface);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                Activity activity4 = activity2;
                i2 = i;
                objOnExtraCallback = objOnExtraCallbackWithResult;
                activity = activity4;
                jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni6 = jni_ygnodestylegetflexbasisjni2;
                str = str2;
                z2 = z;
                jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni6;
                onextracallbackwithresult = (setStrokeAlpha) objOnExtraCallback;
                if (!(onextracallbackwithresult instanceof setStrokeAlpha.onExtraCallbackWithResult)) {
                }
                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                return onextracallbackwithresult;
            }
            return objOnWarmupCompleted;
        } catch (Throwable th4) {
            th = th4;
            jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
            throw th;
        }
    }

    public static final /* synthetic */ ConsentRequestParameters IAuthTabCallback(getTrimPathStart gettrimpathstart, Context context) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (ConsentRequestParameters) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -1522361074, 1522361078, new Object[]{gettrimpathstart, context}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    private final void onWarmupCompleted(Context context, String str) throws Throwable {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -1651647824, 1651647825, new Object[]{this, context, str}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    private final Object onExtraCallback(Activity activity, access13800<? super setStrokeAlpha> access13800Var) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -438862408, 438862411, new Object[]{this, activity, access13800Var}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    public final Object onNavigationEvent(@NotNull Context context, @NotNull access13800<? super Boolean> access13800Var) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -344520983, 344520985, new Object[]{this, context, access13800Var}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    public final boolean onNavigationEvent(@NotNull Context context) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return ((Boolean) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, 48762646, -48762640, new Object[]{this, context}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback())).booleanValue();
    }

    public final void onExtraCallbackWithResult(@NotNull Activity activity) throws Throwable {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -1511883745, 1511883750, new Object[]{this, activity}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    public final Object onExtraCallbackWithResult(@NotNull Activity activity, @NotNull String str, boolean z, @NotNull access13800<? super setStrokeAlpha> access13800Var) {
        Object[] objArr = {this, activity, str, Boolean.valueOf(z), access13800Var};
        return onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 134571277, -134571277, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    static void onExtraCallback() {
        getInterfaceDescriptor = 478308930;
    }
}
