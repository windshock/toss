package o;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.webkit.TossCoreWebView;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.convertUserbugsnag_android_core_release;
import o.setByType;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class convertUserbugsnag_android_core_release implements surfaceChanged {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 1;
    private static int[] onTransact;
    private final findResAndMsg IAuthTabCallback;
    private final getTextProgressSize IAuthTabCallbackStub;
    private final findAppByToken asBinder;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 asInterface;
    private final findApp onExtraCallback;
    private final setTextProgressColor onExtraCallbackWithResult;
    private GeckoHubImp1<Result<Unit>> onNavigationEvent;
    private final getAppStack onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = convertUserbugsnag_android_core_release.this.onNavigationEvent(null, this);
            int i4 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static {
        onExtraCallbackWithResult();
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallback_Parcel + 53;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(Map map, Unit unit, String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(map, unit, str, str2);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public convertUserbugsnag_android_core_release(@NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0, @NotNull getTextProgressSize gettextprogresssize, @NotNull setTextProgressColor settextprogresscolor, @NotNull findAppByToken findappbytoken, @NotNull findApp findapp, @NotNull getAppStack getappstack) {
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(gettextprogresssize, "");
        Intrinsics.checkNotNullParameter(settextprogresscolor, "");
        Intrinsics.checkNotNullParameter(findappbytoken, "");
        Intrinsics.checkNotNullParameter(findapp, "");
        Intrinsics.checkNotNullParameter(getappstack, "");
        this.asInterface = constraintsSizeResolverExternalSyntheticLambda0;
        this.IAuthTabCallbackStub = gettextprogresssize;
        this.onExtraCallbackWithResult = settextprogresscolor;
        this.asBinder = findappbytoken;
        this.onExtraCallback = findapp;
        this.onWarmupCompleted = getappstack;
        this.IAuthTabCallback = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult(null, 1, null).plus(putChannelInfo.onExtraCallback().onWarmupCompleted()));
    }

    public static final /* synthetic */ findAppByToken onWarmupCompleted(convertUserbugsnag_android_core_release convertuserbugsnag_android_core_release) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        findAppByToken findappbytoken = convertuserbugsnag_android_core_release.asBinder;
        if (i4 == 0) {
            int i5 = 95 / 0;
        }
        int i6 = i3 + 111;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
        return findappbytoken;
    }

    public /* bridge */ void IAuthTabCallback(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(tossCoreWebView);
        int i4 = access100 + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallbackWithResult(@NotNull setLensFacing setlensfacing) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(setlensfacing);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = access100 + 13;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void onWarmupCompleted(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
        this.onNavigationEvent = onLoadStarted.onWarmupCompleted(this.IAuthTabCallback, null, null, new IAuthTabCallback(null), 3, null);
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
    }

    private static final void onWarmupCompleted(Map map, Unit unit, String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        map.put(str, str2);
        int i4 = IAuthTabCallbackDefault + 45;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull setByType setbytype, @NotNull access13800<? super setByType.onWarmupCompleted> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        String strOnExtraCallback;
        Map mapAccess100;
        setByType setbytype2;
        final Map map;
        String str;
        setByType setbytype3;
        Object objOnNavigationEvent;
        Throwable thM32exceptionOrNullimpl;
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = access13800Var instanceof onWarmupCompleted;
            throw null;
        }
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i3 = onwarmupcompleted.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i3 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object objIAuthTabCallback = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i4 = onwarmupcompleted.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            strOnExtraCallback = setbytype.onExtraCallback();
            mapAccess100 = access8000.access100(setbytype.onNavigationEvent());
            if (zzaj.onNavigationEvent().ITrustedWebActivityService_Parcel()) {
                int i5 = IAuthTabCallbackDefault + 99;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                setTextProgressColor settextprogresscolor = this.onExtraCallbackWithResult;
                setbytype2 = setbytype;
                onwarmupcompleted.L$0 = setbytype2;
                onwarmupcompleted.L$1 = strOnExtraCallback;
                onwarmupcompleted.L$2 = mapAccess100;
                onwarmupcompleted.label = 1;
                if (settextprogresscolor.onNavigationEvent(onwarmupcompleted) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            setbytype2 = setbytype;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    int i7 = IAuthTabCallbackDefault + 11;
                    int i8 = i7 % 128;
                    access100 = i8;
                    int i9 = i7 % 2;
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i10 = i8 + 57;
                    IAuthTabCallbackDefault = i10 % 128;
                    int i11 = i10 % 2;
                    map = (Map) onwarmupcompleted.L$2;
                    str = (String) onwarmupcompleted.L$1;
                    setbytype3 = (setByType) onwarmupcompleted.L$0;
                    ResultKt.onNavigationEvent(objIAuthTabCallback);
                    objOnNavigationEvent = ((Result) objIAuthTabCallback).onNavigationEvent();
                    if (Result.onNavigationEvent(objOnNavigationEvent)) {
                        try {
                            map.put("Authorization", ConstraintTrackingWorkerExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback());
                            map.put("X-TossExt-Device-ID", this.asInterface.onNavigationEvent());
                            getTextProgressSize.IAuthTabCallback(this.IAuthTabCallbackStub, (trimMetadataStringsTo) null, Unit.INSTANCE, new accessgetConfigp() { // from class: im.toss.webview.plugin.JwtHeaderInterceptor$$ExternalSyntheticLambda0
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallback;

                                @Override // o.accessgetConfigp
                                public final void set(Object obj, String str2, String str3) {
                                    int i12 = 2 % 2;
                                    int i13 = IAuthTabCallback + 77;
                                    onExtraCallback = i13 % 128;
                                    int i14 = i13 % 2;
                                    convertUserbugsnag_android_core_release.IAuthTabCallback(map, (Unit) obj, str2, str3);
                                    int i15 = onExtraCallback + 85;
                                    IAuthTabCallback = i15 % 128;
                                    int i16 = i15 % 2;
                                }
                            }, 1, (Object) null);
                        } catch (Throwable th) {
                            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                            Object[] objArr = new Object[1];
                            a(new int[]{1676655074, -1489985796}, 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
                            convertFloatArrayToByteArray.onExtraCallbackWithResult("JwtHeaderInterceptor", "Error while injecting Web JWT", th, access8200.IAuthTabCallback(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)));
                        }
                    }
                    thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objOnNavigationEvent);
                    if (thM32exceptionOrNullimpl != null) {
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        Object[] objArr2 = new Object[1];
                        a(new int[]{1676655074, -1489985796}, 2 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), objArr2);
                        convertFloatArrayToByteArray2.onExtraCallbackWithResult("JwtHeaderInterceptor", "Error while waiting for issueWebKeyDeferred", thM32exceptionOrNullimpl, access8200.IAuthTabCallback(getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str)));
                    }
                    Result.IAuthTabCallback(objOnNavigationEvent);
                    setbytype2 = setbytype3;
                    strOnExtraCallback = str;
                    mapAccess100 = map;
                    return setbytype2.onExtraCallbackWithResult(strOnExtraCallback, mapAccess100);
                }
                mapAccess100 = (Map) onwarmupcompleted.L$2;
                strOnExtraCallback = (String) onwarmupcompleted.L$1;
                setbytype2 = (setByType) onwarmupcompleted.L$0;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                if (!this.onWarmupCompleted.onExtraCallback(strOnExtraCallback)) {
                    GeckoHubImp1<Result<Unit>> geckoHubImp1 = this.onNavigationEvent;
                    if (geckoHubImp1 != null) {
                        onwarmupcompleted.L$0 = setbytype2;
                        onwarmupcompleted.L$1 = strOnExtraCallback;
                        onwarmupcompleted.L$2 = mapAccess100;
                        onwarmupcompleted.L$3 = access15400.onNavigationEvent(geckoHubImp1);
                        onwarmupcompleted.I$0 = 0;
                        onwarmupcompleted.label = 3;
                        objIAuthTabCallback = geckoHubImp1.IAuthTabCallback(onwarmupcompleted);
                        if (objIAuthTabCallback != objOnExtraCallback) {
                            map = mapAccess100;
                            str = strOnExtraCallback;
                            setbytype3 = setbytype2;
                            objOnNavigationEvent = ((Result) objIAuthTabCallback).onNavigationEvent();
                            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                            }
                            thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objOnNavigationEvent);
                            if (thM32exceptionOrNullimpl != null) {
                            }
                            Result.IAuthTabCallback(objOnNavigationEvent);
                            setbytype2 = setbytype3;
                            strOnExtraCallback = str;
                            mapAccess100 = map;
                        }
                        return objOnExtraCallback;
                    }
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr3 = new Object[1];
                    a(new int[]{1676655074, -1489985796}, ExpandableListView.getPackedPositionType(0L) + 3, objArr3);
                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray3, "JwtHeaderInterceptor", "issueWebKeyDeferred is null in loadUrl", access8200.IAuthTabCallback(getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), strOnExtraCallback)), (String) null, false, (String) null, 56, (Object) null);
                } else if (!(!this.onWarmupCompleted.onExtraCallbackWithResult(strOnExtraCallback))) {
                    String strOnExtraCallback2 = this.onExtraCallback.onExtraCallback();
                    if (strOnExtraCallback2 != null) {
                        mapAccess100.put("Authorization", "Bearer " + strOnExtraCallback2);
                        int i12 = access100 + 7;
                        IAuthTabCallbackDefault = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 3 / 4;
                        }
                    }
                    mapAccess100.put("X-TossExt-Device-ID", this.asInterface.onNavigationEvent());
                }
                return setbytype2.onExtraCallbackWithResult(strOnExtraCallback, mapAccess100);
            }
            mapAccess100 = (Map) onwarmupcompleted.L$2;
            strOnExtraCallback = (String) onwarmupcompleted.L$1;
            setbytype2 = (setByType) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        setTextProgressColor settextprogresscolor2 = this.onExtraCallbackWithResult;
        onwarmupcompleted.L$0 = setbytype2;
        onwarmupcompleted.L$1 = strOnExtraCallback;
        onwarmupcompleted.L$2 = mapAccess100;
        onwarmupcompleted.label = 2;
        if (settextprogresscolor2.IAuthTabCallback(strOnExtraCallback, onwarmupcompleted) != objOnExtraCallback) {
            if (!this.onWarmupCompleted.onExtraCallback(strOnExtraCallback)) {
            }
            return setbytype2.onExtraCallbackWithResult(strOnExtraCallback, mapAccess100);
        }
        return objOnExtraCallback;
    }

    public void IAuthTabCallback() {
        findResAndMsg findresandmsg;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 67;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            findresandmsg = this.IAuthTabCallback;
            i = 0;
        } else {
            findresandmsg = this.IAuthTabCallback;
            i = 1;
        }
        findRes.onExtraCallbackWithResult(findresandmsg, null, i, null);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Unit>>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = convertUserbugsnag_android_core_release.this.new IAuthTabCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends Unit>> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i4 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Result<Unit>> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                iAuthTabCallback.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallback.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM31constructorimpl;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                access14100.onExtraCallback();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            try {
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    convertUserbugsnag_android_core_release convertuserbugsnag_android_core_release = convertUserbugsnag_android_core_release.this;
                    Result.Companion companion = Result.Companion;
                    if (convertUserbugsnag_android_core_release.onWarmupCompleted(convertuserbugsnag_android_core_release).onNavigationEvent()) {
                        int i5 = IAuthTabCallback + 103;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        findAppByToken findappbytokenOnWarmupCompleted = convertUserbugsnag_android_core_release.onWarmupCompleted(convertuserbugsnag_android_core_release);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        if (findappbytokenOnWarmupCompleted.onNavigationEvent(this) == objOnExtraCallback) {
                            int i7 = onExtraCallbackWithResult + 73;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return objOnExtraCallback;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i9 = IAuthTabCallback + 47;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                }
                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                i = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i % 128;
                int i11 = i % 2;
                return Result.IAuthTabCallback(objM31constructorimpl);
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
                i = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i % 128;
                int i112 = i % 2;
                return Result.IAuthTabCallback(objM31constructorimpl);
            }
            return Result.IAuthTabCallback(objM31constructorimpl);
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onTransact;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 72 - (ViewConfiguration.getWindowTouchSlop() >> 8), 8848 - View.combineMeasuredStates(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i3 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onTransact;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                int i7 = $11 + 25;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i6]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 72, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i6++;
                    i4 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i9 = i4;
        System.arraycopy(iArr5, i9, iArr4, i9, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i9;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $11 + 95;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = $10 + 87;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            for (int i14 = 0; i14 < 16; i14++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 22252), (ViewConfiguration.getScrollBarSize() >> 8) + 39, 10301 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 78, 7398 - Color.alpha(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onTransact = new int[]{-1086241823, -161083199, -1773254459, 233631763, -1642753369, 2051663354, 643766762, -265784449, -403645691, 735527877, 260478673, 1695954757, -1682696758, 861441003, 421528782, 1518215180, 1981628871, 1116437824};
    }
}
