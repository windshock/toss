package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.components.tuba.variable.v2.spec.DefaultVar;
import im.toss.components.tuba.variable.v2.spec.VarsResult;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFontPath implements clearComposition {
    public static final onExtraCallback Companion;
    private static char IAuthTabCallbackDefault;
    private static long IAuthTabCallbackStub;
    private static int asInterface;
    private static final String onNavigationEvent;
    private static int onTransact;
    private final RoundedCornersTransformation IAuthTabCallback;
    private final ImageViewTarget onExtraCallback;
    private final getCacheDir onExtraCallbackWithResult;
    private final setAdUnitIds onWarmupCompleted;
    private static final byte[] $$a = {94, -53, 28, -60};
    private static final int $$b = 149;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 1;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = getFontPath.this.IAuthTabCallback(null, this);
            if (objIAuthTabCallback == access14300.onWarmupCompleted()) {
                return objIAuthTabCallback;
            }
            kotlin.Result resultIAuthTabCallback = kotlin.Result.IAuthTabCallback(objIAuthTabCallback);
            int i4 = onNavigationEvent + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return resultIAuthTabCallback;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = getFontPath.this.onExtraCallbackWithResult((access13800<? super List<DefaultVar>>) this);
            int i4 = onNavigationEvent + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = (b2 * 4) + 1;
        int i4 = 3 - (b3 * 3);
        int i5 = b + 109;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            i5 = i3;
            int i6 = i4;
            i2 = 0;
            i5 += -i4;
            i4 = i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            int i7 = i4 + 1;
            i6 = i7;
            i4 = bArr[i7];
            i5 += -i4;
            i4 = i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    static {
        onTransact = 0;
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a((char) (43474 - TextUtils.getCapsMode("", 0, 0)), View.resolveSizeAndState(0, 0, 0), new char[]{13814, 57018, 45987, 27281, 15716, 31922, 5639, 48610, 24047, 7251, 184, 24079, 16015, 36367, 56877, 10188, 14791, 43504, 53567, 16678, 30565, 6066, 7576, 36678, 28867, 24705, 4256, 23355, 40092, 32547, 13911, 343}, new char[]{0, 0, 0, 0}, new char[]{58090, 28846, 53881, 54185}, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new onExtraCallback(null);
        int i = asBinder + 51;
        onTransact = i % 128;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }

    @Inject
    public getFontPath(@NotNull getCacheDir getcachedir, @NotNull RoundedCornersTransformation roundedCornersTransformation, @NotNull ImageViewTarget imageViewTarget, @NotNull setAdUnitIds setadunitids) {
        Intrinsics.checkNotNullParameter(getcachedir, "");
        Intrinsics.checkNotNullParameter(roundedCornersTransformation, "");
        Intrinsics.checkNotNullParameter(imageViewTarget, "");
        Intrinsics.checkNotNullParameter(setadunitids, "");
        this.onExtraCallbackWithResult = getcachedir;
        this.IAuthTabCallback = roundedCornersTransformation;
        this.onExtraCallback = imageViewTarget;
        this.onWarmupCompleted = setadunitids;
    }

    public static final /* synthetic */ RoundedCornersTransformation onExtraCallback(getFontPath getfontpath) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        RoundedCornersTransformation roundedCornersTransformation = getfontpath.IAuthTabCallback;
        if (i4 == 0) {
            int i5 = 77 / 0;
        }
        int i6 = i3 + 113;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return roundedCornersTransformation;
    }

    public static final /* synthetic */ ImageViewTarget onExtraCallbackWithResult(getFontPath getfontpath) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 75;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        ImageViewTarget imageViewTarget = getfontpath.onExtraCallback;
        int i5 = i2 + 11;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return imageViewTarget;
        }
        throw null;
    }

    public static final /* synthetic */ setAdUnitIds onNavigationEvent(getFontPath getfontpath) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 107;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        setAdUnitIds setadunitids = getfontpath.onWarmupCompleted;
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        int i6 = i2 + 7;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return setadunitids;
    }

    public static final /* synthetic */ getCacheDir onWarmupCompleted(getFontPath getfontpath) {
        int i = 2 % 2;
        int i2 = access100 + 29;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        getCacheDir getcachedir = getfontpath.onExtraCallbackWithResult;
        int i5 = i3 + 71;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return getcachedir;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        if (r14 != r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
    
        if (r14 == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // o.clearComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull access13800<? super List<DefaultVar>> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        Object obj;
        Object obj2;
        int i = 2 % 2;
        int i2 = access100 + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IAuthTabCallback_Parcel + 29;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                onextracallbackwithresult.label = i4 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnNavigationEvent = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallbackwithresult.label;
        Object obj3 = null;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion = kotlin.Result.Companion;
                obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (Exception e3) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
            }
        } catch (Exception e4) {
            Result.Companion companion3 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e4));
        } catch (WebResourceResponseModel e5) {
            Result.Companion companion4 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e5));
        } catch (CancellationException e6) {
            throw e6;
        }
        if (i7 != 0) {
            int i8 = access100;
            int i9 = i8 + 29;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            if (i7 != 1) {
                if (i7 != 2) {
                    Object[] objArr = new Object[1];
                    a((char) (Process.myTid() >> 22), (-734286132) - TextUtils.lastIndexOf("", '0', 0), new char[]{50390, 35807, 17847, 2769, 9428, 4575, 35383, 37507, 53276, 8050, 31805, 6758, 61742, 43453, 52998, 16951, 57856, 36983, 6121, 32045, 52895, 19599, 63144, 40377, 13360, 63242, 7627, 62923, 27243, 5104, 12958, 4946, 7751, 62032, 32437, 35711, 50841, 5175, 360, 39973, 44267, 39138, 39282, 27917, 5932, 59126, 40007}, new char[]{0, 0, 0, 0}, new char[]{52509, 15278, 7124, 43429}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i11 = i8 + 5;
                IAuthTabCallback_Parcel = i11 % 128;
                if (i11 % 2 == 0) {
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    int i12 = 94 / 0;
                } else {
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                }
                obj2 = kotlin.Result.constructor-impl(objOnNavigationEvent);
                if (kotlin.Result.onExtraCallback(obj2)) {
                    int i13 = IAuthTabCallback_Parcel + 105;
                    access100 = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                } else {
                    obj3 = obj2;
                }
                return (List) obj3;
            }
            ResultKt.onNavigationEvent(objOnNavigationEvent);
        } else {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            Result.Companion companion5 = kotlin.Result.Companion;
            ImageViewTarget imageViewTargetOnExtraCallbackWithResult = onExtraCallbackWithResult(this);
            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
            onextracallbackwithresult.I$0 = 0;
            onextracallbackwithresult.I$1 = 0;
            onextracallbackwithresult.label = 1;
            objOnNavigationEvent = imageViewTargetOnExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult);
        }
        obj = kotlin.Result.constructor-impl(objOnNavigationEvent);
        if (kotlin.Result.onExtraCallback(obj)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            return list;
        }
        int i14 = access100 + 95;
        IAuthTabCallback_Parcel = i14 % 128;
        int i15 = i14 % 2;
        Result.Companion companion6 = kotlin.Result.Companion;
        RoundedCornersTransformation roundedCornersTransformationOnExtraCallback = onExtraCallback(this);
        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
        onextracallbackwithresult.I$0 = 0;
        onextracallbackwithresult.I$1 = 0;
        onextracallbackwithresult.label = 2;
        objOnNavigationEvent = roundedCornersTransformationOnExtraCallback.onNavigationEvent(onextracallbackwithresult);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // o.clearComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(@NotNull String[] strArr, @NotNull access13800<? super kotlin.Result<? extends Map<String, String>>> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        Object objOnExtraCallbackWithResult;
        JsonPrimitive jsonPrimitive;
        String strOnNavigationEvent;
        String[] strArr2 = strArr;
        int i = 2 % 2;
        if (!(access13800Var instanceof IAuthTabCallback)) {
            iAuthTabCallback = new IAuthTabCallback(access13800Var);
        } else {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i2 - 2147483648;
            }
        }
        Object objOnExtraCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = iAuthTabCallback.label;
        try {
            if (i3 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = kotlin.Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(null, this, strArr2);
                iAuthTabCallback.L$0 = strArr2;
                iAuthTabCallback.L$1 = access15400.onNavigationEvent(iAuthTabCallback);
                iAuthTabCallback.I$0 = 0;
                iAuthTabCallback.I$1 = 0;
                iAuthTabCallback.I$2 = 0;
                iAuthTabCallback.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onwarmupcompleted, iAuthTabCallback);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    Object[] objArr = new Object[1];
                    a((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getTapTimeout() >> 16) - 734286131, new char[]{50390, 35807, 17847, 2769, 9428, 4575, 35383, 37507, 53276, 8050, 31805, 6758, 61742, 43453, 52998, 16951, 57856, 36983, 6121, 32045, 52895, 19599, 63144, 40377, 13360, 63242, 7627, 62923, 27243, 5104, 12958, 4946, 7751, 62032, 32437, 35711, 50841, 5175, 360, 39973, 44267, 39138, 39282, 27917, 5932, 59126, 40007}, new char[]{0, 0, 0, 0}, new char[]{52509, 15278, 7124, 43429}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                strArr2 = (String[]) iAuthTabCallback.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback);
            }
            objOnExtraCallbackWithResult = kotlin.Result.constructor-impl(objOnExtraCallback);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = kotlin.Result.Companion;
            objOnExtraCallbackWithResult = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = kotlin.Result.Companion;
            objOnExtraCallbackWithResult = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
        }
        String[] strArr3 = strArr2;
        if (kotlin.Result.onNavigationEvent(objOnExtraCallbackWithResult)) {
            int i4 = IAuthTabCallback_Parcel + 101;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            Result.Companion companion4 = kotlin.Result.Companion;
            Map mapOnExtraCallback = access8100.onExtraCallback();
            for (Map.Entry entry : ((VarsResult) objOnExtraCallbackWithResult).onNavigationEvent().entrySet()) {
                int i6 = IAuthTabCallback_Parcel + 31;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                String str = (String) entry.getKey();
                JsonPrimitive jsonPrimitive2 = (JsonElement) entry.getValue();
                if (jsonPrimitive2 instanceof JsonPrimitive) {
                    jsonPrimitive = jsonPrimitive2;
                    int i8 = IAuthTabCallback_Parcel + 9;
                    access100 = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    jsonPrimitive = null;
                }
                if (jsonPrimitive != null) {
                    strOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonPrimitive);
                    int i10 = access100 + 51;
                    IAuthTabCallback_Parcel = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    strOnNavigationEvent = null;
                }
                if (strOnNavigationEvent != null) {
                    mapOnExtraCallback.put(str, strOnNavigationEvent);
                }
            }
            objOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(mapOnExtraCallback);
        }
        Object obj = kotlin.Result.constructor-impl(objOnExtraCallbackWithResult);
        if (kotlin.Result.exceptionOrNull-impl(obj) != null) {
            Object[] objArr2 = new Object[1];
            a((char) (KeyEvent.getDeadChar(0, 0) + 18836), 1710957124 - (Process.myPid() >> 22), new char[]{51311}, new char[]{0, 0, 0, 0}, new char[]{17658, 64290, 37989, 44617}, objArr2);
            ArraysKt.joinToString$default(strArr3, ((String) objArr2[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            Object[] objArr3 = new Object[1];
            a((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40526), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{28039, 22950, 22475, 29581, 4701, 65004, 29711, 16200, 24959, 6626, 48520, 42308, 55736, 27750, 21969, 14470, 29554, 37841, 51612, 39368, 18384, 26406, 47621, 13707, 48226, 43344}, new char[]{0, 0, 0, 0}, new char[]{26532, 49248, 20388, 38814}, objArr3);
            ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a((char) (TextUtils.lastIndexOf("", '0', 0) + 62143), (-158220608) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{32412}, new char[]{0, 0, 0, 0}, new char[]{48945, 37310, 48886, 42226}, objArr4);
            ((String) objArr4[0]).intern();
            SystemClock.elapsedRealtime();
            View.MeasureSpec.getMode(0);
        }
        return obj;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
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
        int i6 = $11 + 89;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $11 + 3;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cBlue = (char) Color.blue(i5);
                    int iResolveSize = View.resolveSize(i5, i5) + 43;
                    int capsMode = TextUtils.getCapsMode("", i5, i5) + 1451;
                    byte b = (byte) ($$b & 3);
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cBlue, iResolveSize, capsMode, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i5, i5) + 49124);
                    int i10 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1495;
                    byte b3 = (byte) i5;
                    byte b4 = b3;
                    String str$$c2 = $$c(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, i10, iIndexOf, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i11 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i11);
                objArr4[i5] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char cArgb = (char) (Color.argb(i5, i5, i5, i5) + 23972);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 50;
                    int windowTouchSlop = 22939 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i5] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cArgb, packedPositionGroup, windowTouchSlop, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i5] = Integer.valueOf(i12);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45847);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5) + 29;
                    int mirror = 12625 - AndroidCharacter.getMirror('0');
                    i2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i5] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iMakeMeasureSpec, mirror, 1401536470, false, "l", clsArr4);
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (asInterface ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackDefault ^ 7798559133331975163L)));
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

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStub = 7798559133331975163L;
        asInterface = -1776194565;
        IAuthTabCallbackDefault = (char) 10948;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super VarsResult>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] onExtraCallback = {-1988593054, -1368154499, -46335790, 812051971, 1515486710, 1369050897, 1268238107, 582897992, -1140953797, 559026289, 1680630727, -1397156145, 1553456639, 1083922731, -733467818, -232377842, -199853085, -1243322153};
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String[] $keys$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ getFontPath this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(access13800 access13800Var, getFontPath getfontpath, String[] strArr) {
            super(2, access13800Var);
            this.this$0 = getfontpath;
            this.$keys$inlined = strArr;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super VarsResult> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 87 / 0;
            } else {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var, this.this$0, this.$keys$inlined);
            int i2 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b2, code lost:
        
            if (r3 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00f0, code lost:
        
            if (r3 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00f2, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0177, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(im.toss.components.tuba.variable.v2.spec.VarsResult.class, kotlin.Unit.class) != false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0182, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(im.toss.components.tuba.variable.v2.spec.VarsResult.class, kotlin.Unit.class) != false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0185, code lost:
        
            r4 = o.getFontPath.onWarmupCompleted.onExtraCallbackWithResult + 125;
            o.getFontPath.onWarmupCompleted.onNavigationEvent = r4 % 128;
            r4 = r4 % 2;
            r0 = im.toss.network.throwable.TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(r0);
            r0.onWarmupCompleted(r3.IAuthTabCallback_Parcel());
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x019b, code lost:
        
            throw r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    int i3 = onExtraCallbackWithResult + 89;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 2 : i2 != 4) {
                        Object[] objArr = new Object[1];
                        a(new int[]{1567977504, 766117891, -337830229, 828890873, 1437155863, -695612007, -845344840, -457541617, 890821253, -1971109431, 629621374, 1042753535, -424794004, -636428757, 227442254, -1516020999, 1785206988, -942330462, -1201776129, 915903745, -977273988, -1892764837, -1546810991, -704060486}, 47 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                objIAuthTabCallback = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                if (!(!getFontPath.onNavigationEvent(this.this$0).IAuthTabCallback())) {
                    int i6 = onNavigationEvent + 25;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    getCacheDir getcachedirOnWarmupCompleted = getFontPath.onWarmupCompleted(this.this$0);
                    String[] strArr = this.$keys$inlined;
                    Object[] objArr2 = new Object[1];
                    a(new int[]{1721429826, 850143413}, 1 - Color.red(0), objArr2);
                    String strJoinToString$default = ArraysKt.joinToString$default(strArr, ((String) objArr2[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    objIAuthTabCallback = getcachedirOnWarmupCompleted.onExtraCallbackWithResult(strJoinToString$default, this);
                } else {
                    getCacheDir getcachedirOnWarmupCompleted2 = getFontPath.onWarmupCompleted(this.this$0);
                    String[] strArr2 = this.$keys$inlined;
                    Object[] objArr3 = new Object[1];
                    a(new int[]{1721429826, 850143413}, (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr3);
                    String strJoinToString$default2 = ArraysKt.joinToString$default(strArr2, ((String) objArr3[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 2;
                    objIAuthTabCallback = getcachedirOnWarmupCompleted2.IAuthTabCallback(strJoinToString$default2, this);
                }
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) objIAuthTabCallback;
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            int i8 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i8 % 128;
            try {
                if (i8 % 2 != 0) {
                    baseApiResponse.onTransact();
                    throw null;
                }
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact != null) {
                    return (VarsResult) objOnTransact;
                }
                Object[] objArr4 = new Object[1];
                a(new int[]{1697729147, -413714958, -1720909507, 409500279, -1169411652, 1669506176, -1185361457, -1045938486, -295125116, 1552995797, 134808054, -1876068332, 155585140, 1286716144, 351228241, -1306593380, 920062562, 951501452, 1694073086, 392407792, -1560768785, 1250681843, 832969460, 1593263386, -937158864, 1672322272, -945037247, 1759587398, 2109347230, -1362068753, -1623261853, 270911481, -549536599, -776353672, -1872528586, 639744136, 921477394, 1498149557, 1147462585, 41032818, 1364862277, 1342477333, 1232947440, 842191543}, 88 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
                throw new NullPointerException(((String) objArr4[0]).intern());
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(VarsResult.class, Object.class)) {
                    int i9 = onNavigationEvent + 23;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 78 / 0;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallback;
            int i3 = -1469660336;
            float f = 0.0f;
            int i4 = 16;
            if (iArr2 != null) {
                int i5 = $11 + 91;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 57;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> i4), 72 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 72 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            i7++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    f = 0.0f;
                    i4 = 16;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.green(0) + 72, 8848 - (ViewConfiguration.getPressedStateDuration() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i9++;
                    i3 = -1469660336;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i10 = 0;
                for (int i11 = 16; i10 < i11; i11 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22253 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39, 10301 - View.getDefaultSize(0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i10++;
                    int i12 = $11 + 61;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                }
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 79 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 7398 - View.MeasureSpec.getSize(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }
}
