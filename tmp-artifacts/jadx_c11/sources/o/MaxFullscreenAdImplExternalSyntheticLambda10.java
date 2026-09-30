package o;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.auth;
import o.setAdReviewListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxFullscreenAdImplExternalSyntheticLambda10 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int ICustomTabsCallback = 1;
    private static char[] access000 = null;
    private static boolean access100 = false;
    private static int extraCallback = 0;
    private static boolean extraCallbackWithResult = false;
    private static int getInterfaceDescriptor = 0;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private final String IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final boolean IAuthTabCallbackStubProxy;
    private final String IAuthTabCallback_Parcel;
    private final boolean asBinder;
    private final Long asInterface;
    private final String onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Date onTransact;
    private final String onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = MaxFullscreenAdImplExternalSyntheticLambda10.this.IAuthTabCallback(null, null, this);
            int i4 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 92 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    static {
        onNavigationEvent();
        Companion = new onWarmupCompleted(null);
        int i = writeTypedObject + 49;
        readTypedObject = i % 128;
        int i2 = i % 2;
    }

    public MaxFullscreenAdImplExternalSyntheticLambda10(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable Date date, @Nullable Long l, boolean z, boolean z2, boolean z3, boolean z4, @Nullable String str5, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onWarmupCompleted = str;
        this.onExtraCallback = str2;
        this.IAuthTabCallback_Parcel = str3;
        this.onNavigationEvent = str4;
        this.onTransact = date;
        this.asInterface = l;
        this.asBinder = z;
        this.IAuthTabCallbackDefault = z2;
        this.onExtraCallbackWithResult = z3;
        this.IAuthTabCallbackStub = z4;
        this.IAuthTabCallback = str5;
        this.IAuthTabCallbackStubProxy = z5;
    }

    public interface IAuthTabCallback {

        public static final class onWarmupCompleted implements IAuthTabCallback {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            private final setRequestListener onExtraCallbackWithResult;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 41;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                if (this != obj) {
                    return !((obj instanceof onWarmupCompleted) ^ true) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onWarmupCompleted) obj).onExtraCallbackWithResult);
                }
                int i5 = i3 + 53;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 17;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                setRequestListener setrequestlistener = this.onExtraCallbackWithResult;
                if (i3 != 0) {
                    return setrequestlistener.hashCode();
                }
                setrequestlistener.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Fetched(bundle=" + this.onExtraCallbackWithResult + ")";
                int i2 = onExtraCallback + 21;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public onWarmupCompleted(@NotNull setRequestListener setrequestlistener) {
                Intrinsics.checkNotNullParameter(setrequestlistener, "");
                this.onExtraCallbackWithResult = setrequestlistener;
            }

            public final setRequestListener IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 121;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                setRequestListener setrequestlistener = this.onExtraCallbackWithResult;
                int i5 = i3 + 41;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return setrequestlistener;
            }
        }

        public static final class onExtraCallbackWithResult implements IAuthTabCallback {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            private final String IAuthTabCallback;
            private final int onExtraCallbackWithResult;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 91;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    int i5 = i2 + 75;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
                if (Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                    return this.onExtraCallbackWithResult == onextracallbackwithresult.onExtraCallbackWithResult;
                }
                int i7 = onExtraCallback + 119;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.IAuthTabCallback.hashCode();
                return i3 != 0 ? (iHashCode << 116) * Integer.hashCode(this.onExtraCallbackWithResult) : (iHashCode * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "MetroConnected(host=" + this.IAuthTabCallback + ", port=" + this.onExtraCallbackWithResult + ")";
                int i2 = onExtraCallback + 123;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onExtraCallbackWithResult(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                this.IAuthTabCallback = str;
                this.onExtraCallbackWithResult = i;
            }

            public final String onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 109;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.IAuthTabCallback;
                int i5 = i3 + 45;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 31;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i4 = this.onExtraCallbackWithResult;
                int i5 = i2 + 9;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return i4;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull logApiCall logapicall, @NotNull String str, @NotNull access13800<? super IAuthTabCallback> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        String str2;
        char c;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = extraCallback + 69;
                ICustomTabsCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    onextracallbackwithresult.label = i2 % Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i2 - 2147483648;
                }
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = onextracallbackwithresult.label;
        if (i4 != 0) {
            int i5 = ICustomTabsCallback + 63;
            extraCallback = i5 % 128;
            if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) onextracallbackwithresult.L$1;
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            String str3 = this.onWarmupCompleted;
            String str4 = this.onExtraCallback;
            String str5 = this.IAuthTabCallback_Parcel;
            String str6 = this.onNavigationEvent;
            boolean z = this.asBinder;
            boolean z2 = this.IAuthTabCallbackDefault;
            boolean z3 = this.IAuthTabCallbackStub;
            Long l = this.asInterface;
            Date date = this.onTransact;
            boolean z4 = this.onExtraCallbackWithResult;
            String str7 = this.IAuthTabCallback;
            boolean z5 = this.IAuthTabCallbackStubProxy;
            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(logapicall);
            onextracallbackwithresult.L$1 = str;
            onextracallbackwithresult.label = 1;
            Object objOnNavigationEvent = logapicall.onNavigationEvent(str3, str4, str5, str6, z, z2, z3, false, l, date, z4, str7, z5, onextracallbackwithresult);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                int i6 = extraCallback + 33;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
            str2 = str;
            obj = objOnNavigationEvent;
        }
        setAdReviewListener setadreviewlistener = (setAdReviewListener) obj;
        if (setadreviewlistener instanceof setAdReviewListener.onExtraCallback) {
            setAdReviewListener.onExtraCallback onextracallback = (setAdReviewListener.onExtraCallback) setadreviewlistener;
            return new IAuthTabCallback.onExtraCallbackWithResult(onextracallback.onExtraCallbackWithResult(), onextracallback.onNavigationEvent());
        }
        if (setadreviewlistener instanceof setAdReviewListener.IAuthTabCallback) {
            setRequestListener setrequestlistenerIAuthTabCallback = ((setAdReviewListener.IAuthTabCallback) setadreviewlistener).IAuthTabCallback();
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "service_bundle_loaded", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", str2), getWrite.IAuthTabCallback("bundleName", this.onWarmupCompleted), getWrite.IAuthTabCallback("filePath", setrequestlistenerIAuthTabCallback.onWarmupCompleted()), getWrite.IAuthTabCallback("sharedMinDeployedAt", setrequestlistenerIAuthTabCallback.onTransact())}), (String) null, false, (String) null, 56, (Object) null);
            auth authVar = auth.onNavigationEvent;
            String str8 = str2 + ": service-bundle result=success";
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("bundleName", this.onWarmupCompleted);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("source", "service-bundle");
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-122, -123, -124, -125, -126, -127}, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, objArr);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "success");
            String strOnExtraCallback = setrequestlistenerIAuthTabCallback.onExtraCallback();
            if (strOnExtraCallback == null) {
                int i8 = extraCallback + 93;
                ICustomTabsCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                strOnExtraCallback = "";
            }
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("deploymentId", strOnExtraCallback);
            String strOnTransact = setrequestlistenerIAuthTabCallback.onTransact();
            if (strOnTransact == null) {
                int i9 = extraCallback + 87;
                ICustomTabsCallback = i9 % 128;
                c = 2;
                int i10 = i9 % 2;
                strOnTransact = "";
            } else {
                c = 2;
            }
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("sharedMinDeployedAt", strOnTransact);
            Pair[] pairArr = new Pair[5];
            pairArr[0] = pairIAuthTabCallback;
            pairArr[1] = pairIAuthTabCallback2;
            pairArr[c] = pairIAuthTabCallback3;
            pairArr[3] = pairIAuthTabCallback4;
            pairArr[4] = pairIAuthTabCallback5;
            auth.IAuthTabCallback(authVar, str8, access8100.onWarmupCompleted(pairArr), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
            return new IAuthTabCallback.onWarmupCompleted(setrequestlistenerIAuthTabCallback);
        }
        if (setadreviewlistener instanceof setAdReviewListener.onWarmupCompleted) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("from", str2);
            Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("bundleName", this.onWarmupCompleted);
            setAdReviewListener.onWarmupCompleted onwarmupcompleted = (setAdReviewListener.onWarmupCompleted) setadreviewlistener;
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-121, -119, -125, -117, -126, -127}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "react_native_debug", "service_bundle_incorrect_version", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback6, pairIAuthTabCallback7, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), onwarmupcompleted.onNavigationEvent())}), 4, (Object) null);
            throw new IllegalStateException("Service bundle version mismatch: " + onwarmupcompleted.onNavigationEvent());
        }
        if (!(setadreviewlistener instanceof setAdReviewListener.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        setAdReviewListener.onNavigationEvent onnavigationevent = (setAdReviewListener.onNavigationEvent) setadreviewlistener;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "service_bundle_load_failed", onnavigationevent.onExtraCallbackWithResult(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", str2), getWrite.IAuthTabCallback("bundleName", this.onWarmupCompleted), getWrite.IAuthTabCallback("error", onnavigationevent.onExtraCallbackWithResult().getMessage())}));
        auth authVar2 = auth.onNavigationEvent;
        String str9 = str2 + ": service-bundle result=error";
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("bundleName", this.onWarmupCompleted);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback("source", "service-bundle");
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-122, -123, -124, -125, -126, -127}, 127 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "error");
        String message = onnavigationevent.onExtraCallbackWithResult().getMessage();
        if (message == null) {
            int i11 = ICustomTabsCallback + 65;
            extraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                Object[] objArr4 = new Object[1];
                a(null, null, new byte[]{-121, -118, -119, -121, -120, -121, -124}, 76 >>> (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
                message = ((String) objArr4[0]).intern();
            } else {
                Object[] objArr5 = new Object[1];
                a(null, null, new byte[]{-121, -118, -119, -121, -120, -121, -124}, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr5);
                message = ((String) objArr5[0]).intern();
            }
        }
        auth.IAuthTabCallback(authVar2, str9, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, getWrite.IAuthTabCallback("error", message), getWrite.IAuthTabCallback("errorType", onnavigationevent.onExtraCallbackWithResult().getClass().getSimpleName())}), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
        throw onnavigationevent.onExtraCallbackWithResult();
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = access000;
        if (cArr3 != null) {
            int i3 = $10 + 103;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 113;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getOffsetAfter("", 0) + 77, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 77, MotionEvent.axisFromString("") + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5++;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(getInterfaceDescriptor)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 74, 16038 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            int i7 = 1052772399;
            if (!(!extraCallbackWithResult)) {
                int i8 = $11 + 67;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 63 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12214 - View.MeasureSpec.getSize(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (!access100) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 37;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 63 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i7 = 1052772399;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onNavigationEvent() {
        access000 = new char[]{32399, 32412, 32398, 32396, 32405, 32397, 32395, 32406, 32394, 32386, 32408};
        getInterfaceDescriptor = -1184334023;
        access100 = true;
        extraCallbackWithResult = true;
    }
}
