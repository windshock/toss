package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.horcrux.svg.SvgPackage;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.ComputeLandmarkConfidence;
import o.accesssetNamep;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.user.PasswordMatchLogReq;
import viva.republica.toss.network.model.user.PasswordMatchLogRes;
import viva.republica.toss.password.log.PasswordLog;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accesssetNamep {
    private static final String IAuthTabCallback;
    private static long IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel;
    private static char[] asBinder;
    private static long asInterface;
    private static _get_type_lambda7 onExtraCallback;
    public static final int onExtraCallbackWithResult;
    public static final accesssetNamep onNavigationEvent;
    private static final AppSetIdAndScope1 onTransact;
    private static final Lazy onWarmupCompleted;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = 63;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int getInterfaceDescriptor = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, short r9) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 4
            int r7 = r7 * 2
            int r7 = r7 + 97
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = o.accesssetNamep.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r7]
        L2a:
            int r9 = r9 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accesssetNamep.$$c(int, int, short):java.lang.String");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        _get_type_lambda7 _get_type_lambda7Var = (_get_type_lambda7) objArr[0];
        PasswordLog passwordLog = (PasswordLog) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(_get_type_lambda7Var, passwordLog);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List listOnExtraCallbackWithResult = onExtraCallbackWithResult(_get_type_lambda7Var, passwordLog);
        int i3 = getInterfaceDescriptor + 13;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return listOnExtraCallbackWithResult;
    }

    public static /* synthetic */ JsonReaderErrorInfo IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(function1, obj);
        }
        asInterface(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ List onExtraCallback(_get_type_lambda7 _get_type_lambda7Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        List listOnNavigationEvent = onNavigationEvent(_get_type_lambda7Var);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return listOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = IAuthTabCallbackDefault + 35;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Function0 function0 = (Function0) objArr[0];
        Function0 function02 = (Function0) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, function02, th);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        throw null;
    }

    public static /* synthetic */ JsonReaderErrorInfo onExtraCallbackWithResult(Context context, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(context, list);
        }
        onNavigationEvent(context, list);
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        deserializeIp deserializeipIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1, obj);
        int i3 = IAuthTabCallbackDefault + 15;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return deserializeipIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(_get_type_lambda7 _get_type_lambda7Var, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(_get_type_lambda7Var, list);
        }
        onExtraCallback(_get_type_lambda7Var, list);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 470284354, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, -470284354);
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = (~(i7 | i)) | i8;
        int i10 = ~i4;
        int i11 = ~(i10 | i6);
        int i12 = i8 | i11 | (~(i10 | i));
        int i13 = (~((~i) | i10)) | i8 | i11;
        int i14 = i6 + i4 + i5 + ((-369695973) * i2) + (1794320298 * i3);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i6) + 1478230016 + (776760710 * i4) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i5) + (217841664 * i2) + ((-410517504) * i3) + ((-175177728) * i15);
        int i17 = ((i6 * 1872133577) - 2052485254) + (i4 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i5 * 1872134975) + (i2 * (-1328892763)) + (i3 * (-1296121642)) + (i15 * (-1691287552));
        switch (i16 + (i17 * i17 * (-1729036288))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                Throwable th = (Throwable) objArr[0];
                int i18 = 2 % 2;
                int i19 = IAuthTabCallbackDefault + 75;
                getInterfaceDescriptor = i19 % 128;
                int i20 = i19 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(th);
                int i21 = getInterfaceDescriptor + 43;
                IAuthTabCallbackDefault = i21 % 128;
                int i22 = i21 % 2;
                return unitOnExtraCallbackWithResult;
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                Context context = (Context) objArr[1];
                int i23 = 2 % 2;
                int i24 = getInterfaceDescriptor + 65;
                IAuthTabCallbackDefault = i24 % 128;
                int i25 = i24 % 2;
                if (onExtraCallback == null) {
                    _get_type_lambda7 _get_type_lambda7Var = new _get_type_lambda7(context);
                    onExtraCallback = _get_type_lambda7Var;
                    _get_type_lambda7Var.IAuthTabCallback();
                    int i26 = getInterfaceDescriptor + 49;
                    IAuthTabCallbackDefault = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 4 / 3;
                    }
                }
                _get_type_lambda7 _get_type_lambda7Var2 = onExtraCallback;
                Intrinsics.checkNotNull(_get_type_lambda7Var2);
                return _get_type_lambda7Var2;
            case 6:
                _get_type_lambda7 _get_type_lambda7Var3 = (_get_type_lambda7) objArr[0];
                List list = (List) objArr[1];
                int i28 = 2 % 2;
                int i29 = IAuthTabCallbackDefault + 101;
                getInterfaceDescriptor = i29 % 128;
                int i30 = i29 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(_get_type_lambda7Var3, list);
                int i31 = getInterfaceDescriptor + 65;
                IAuthTabCallbackDefault = i31 % 128;
                int i32 = i31 % 2;
                return unitOnWarmupCompleted;
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, PasswordMatchLogRes passwordMatchLogRes) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(function0, passwordMatchLogRes);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, passwordMatchLogRes);
        int i3 = getInterfaceDescriptor + 113;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(_get_type_lambda7 _get_type_lambda7Var, PasswordLog passwordLog, Context context, List list) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(_get_type_lambda7Var, passwordLog, context, list);
        }
        onExtraCallback(_get_type_lambda7Var, passwordLog, context, list);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -966348546, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, 966348547);
        int i4 = getInterfaceDescriptor + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private accesssetNamep() {
    }

    static {
        IAuthTabCallback_Parcel = 0;
        onWarmupCompleted();
        onNavigationEvent = new accesssetNamep();
        Object[] objArr = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 28 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (62518 - View.MeasureSpec.getSize(0)), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(TextUtils.getOffsetBefore("", 0), TextUtils.getOffsetAfter("", 0) + 27, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62517), objArr2);
        onTransact = ea10.onExtraCallbackWithResult(((String) objArr2[0]).intern());
        onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda0
            public final Object invoke() {
                return accesssetNamep.onExtraCallbackWithResult();
            }
        });
        onExtraCallbackWithResult = 8;
        int i = access100 + 63;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    private final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) onWarmupCompleted.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private static final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            String strOnNavigationEvent = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().onNavigationEvent();
            int i3 = getInterfaceDescriptor + 101;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                return strOnNavigationEvent;
            }
            throw null;
        }
        Response response2 = Response.onNavigationEvent;
        ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().onNavigationEvent();
        throw null;
    }

    private static final List onExtraCallbackWithResult(_get_type_lambda7 _get_type_lambda7Var, PasswordLog passwordLog) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            _get_type_lambda7Var.onNavigationEvent(passwordLog);
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            objOnWarmupCompleted = ComputeLandmarkConfidence.onWarmupCompleted(438504145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{_get_type_lambda7Var, 102400L, 1L, 0, false, 19, null}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3, -438504145);
        } else {
            _get_type_lambda7Var.onNavigationEvent(passwordLog);
            int iOnWarmupCompleted4 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted5 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted6 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            objOnWarmupCompleted = ComputeLandmarkConfidence.onWarmupCompleted(438504145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{_get_type_lambda7Var, 102400L, 0L, 0, false, 14, null}, iOnWarmupCompleted4, iOnWarmupCompleted5, iOnWarmupCompleted6, -438504145);
        }
        return CollectionsKt.flatten(((ComputeLandmarkConfidence.onNavigationEvent) objOnWarmupCompleted).onWarmupCompleted());
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 99;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<PasswordMatchLogRes> apply(writeRaw<BaseApiResponse<PasswordMatchLogRes>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass5 anonymousClass5 = new Function1<BaseApiResponse<PasswordMatchLogRes>, deserializeIp<? extends PasswordMatchLogRes>>() { // from class: o.accesssetNamep.onWarmupCompleted.5
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends PasswordMatchLogRes> invoke(BaseApiResponse<PasswordMatchLogRes> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = PasswordMatchLogRes.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass5) { // from class: o.UtilsKtExternalSyntheticLambda17$r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ
                private final /* synthetic */ Function1 onNavigationEvent;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass5, "");
                    this.onNavigationEvent = anonymousClass5;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onNavigationEvent.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private static final deserializeIp IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 49;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(IAuthTabCallback, th);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackDefault + 107;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 42 / 0;
            }
            return unit;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(IAuthTabCallback, th);
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final writeRaw<PasswordMatchLogRes> onWarmupCompleted(@NotNull final Context context, boolean z, int i) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        final _get_type_lambda7 _get_type_lambda7Var = (_get_type_lambda7) onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1869071847, iOnExtraCallbackWithResult2, new Object[]{this, context}, 1869071852);
        final PasswordLog passwordLog = new PasswordLog(z, i, (String) null, 4, (DefaultConstructorMarker) null);
        Object[] objArr = new Object[1];
        b(new char[]{10639, 54456, 54264, 56843, 56660, 55342, 50928, 50572, 49182, 53027, 51813, 51331, 63455, 62179, 61745, 64542}, TextUtils.getCapsMode("", 0, 0) + 64817, objArr);
        ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new char[]{10711, 9244, 12825, 193, 7812, 28025, 31549, 18892, 18338, 21101, 41041, 48693, 36032, 39573, 59767, 59174, 62897}, ExpandableListView.getPackedPositionChild(0L) + 3528, objArr2);
        ((String) objArr2[0]).intern();
        writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new Callable() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object[] objArr3 = {_get_type_lambda7Var, passwordLog};
                return (List) accesssetNamep.onWarmupCompleted(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1609690563, SvgPackage.21.onExtraCallbackWithResult(), objArr3, -1609690559);
            }
        });
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = SvgPackage.21.onExtraCallbackWithResult();
                return (Unit) accesssetNamep.onWarmupCompleted(iOnExtraCallbackWithResult3, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 902865209, iOnExtraCallbackWithResult4, new Object[]{(Throwable) obj}, -902865206);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda12
            public final void accept(Object obj) {
                accesssetNamep.onNavigationEvent(function1, obj);
            }
        }).onWarmupCompleted(CollectionsKt.emptyList());
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return accesssetNamep.onWarmupCompleted(_get_type_lambda7Var, passwordLog, context, (List) obj);
            }
        };
        writeRaw<PasswordMatchLogRes> writerawOnNavigationEvent2 = writerawOnWarmupCompleted.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda14
            public final Object apply(Object obj) {
                return accesssetNamep.onExtraCallbackWithResult(function12, obj);
            }
        }).onNavigationEvent(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent2, "");
        int i3 = getInterfaceDescriptor + 119;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return writerawOnNavigationEvent2;
    }

    private static final deserializeIp onExtraCallback(_get_type_lambda7 _get_type_lambda7Var, PasswordLog passwordLog, Context context, List list) throws Throwable {
        Object obj;
        long jLongValue;
        JsonObject jsonObject;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        File fileOnExtraCallbackWithResult = _get_type_lambda7Var.onExtraCallbackWithResult(passwordLog);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Long.valueOf(fileOnExtraCallbackWithResult.length()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = null;
        if (Result.onExtraCallback(obj)) {
            int i2 = IAuthTabCallbackDefault + 103;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 42 / 0;
            }
            obj = null;
        }
        Long l = (Long) obj;
        if (l != null) {
            int i4 = IAuthTabCallbackDefault + 21;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (!list.isEmpty()) {
            int i6 = getInterfaceDescriptor + 119;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            if (jLongValue != 0) {
                return onNavigationEvent.IAuthTabCallback(context, (List<? extends File>) list);
            }
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        String str = IAuthTabCallback;
        Object[] objArr = new Object[1];
        b(new char[]{10639, 35824, 28008, 52979, 41076, 1414, 59211, 22726, 14940, 40919, 29025, 53947, 46115, 27057, 51991, 44169, 3599, 58322, 17695, 10089, 39139, 31347, 57277, 45378, 4802, 62531, 43485, 2909, 60579}, 41593 - (Process.myPid() >> 22), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39, 3 - Color.argb(0, 0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr2);
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, str, strIntern, (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), passwordLog)), (String) null, (String) null, true, 52, (Object) null);
        _get_type_lambda7Var.IAuthTabCallback(CollectionsKt.listOf(fileOnExtraCallbackWithResult));
        wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
        wie2VarIAuthTabCallback.onExtraCallback();
        List listListOf = CollectionsKt.listOf(wie2VarIAuthTabCallback.IAuthTabCallback(PasswordLog.Companion.serializer(), passwordLog));
        ArrayList arrayList = new ArrayList();
        Iterator it = listListOf.iterator();
        while (!(!it.hasNext())) {
            JsonObject jsonObject2 = (JsonElement) it.next();
            if (jsonObject2 instanceof JsonObject) {
                int i8 = IAuthTabCallbackDefault + 3;
                getInterfaceDescriptor = i8 % 128;
                if (i8 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                jsonObject = jsonObject2;
            } else {
                jsonObject = null;
            }
            if (jsonObject != null) {
                arrayList.add(jsonObject);
            }
        }
        return onNavigationEvent.onExtraCallback(arrayList);
    }

    private static final List onNavigationEvent(_get_type_lambda7 _get_type_lambda7Var) throws Throwable {
        int i = 2 % 2;
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        List listFlatten = CollectionsKt.flatten(((ComputeLandmarkConfidence.onNavigationEvent) ComputeLandmarkConfidence.onWarmupCompleted(438504145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{_get_type_lambda7Var, 102400L, 0L, 0, false, 14, null}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3, -438504145)).onWarmupCompleted());
        listFlatten.size();
        Object[] objArr = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr);
        ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new char[]{10715, 'B', 31294, 21731, 36572, 63730, 54121, 3405, 26421, 20978}, 10709 - View.MeasureSpec.getSize(0), objArr2);
        ((String) objArr2[0]).intern();
        int i2 = IAuthTabCallbackDefault + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return listFlatten;
    }

    private static final JsonReaderErrorInfo asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (JsonReaderErrorInfo) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        int i3 = 56 / 0;
        return jsonReaderErrorInfo;
    }

    private static final JsonReaderErrorInfo onNavigationEvent(Context context, List list) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            list.isEmpty();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            return onNavigationEvent.IAuthTabCallback(context, (List<? extends File>) list).bI_().onNavigationEvent();
        }
        wasLastName waslastnameIAuthTabCallback = wasLastName.IAuthTabCallback();
        int i3 = IAuthTabCallbackDefault + 115;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return waslastnameIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 5;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 % 5;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 24 - KeyEvent.keyCodeFromString(""), KeyEvent.getDeadChar(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (asInterface ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 60 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 6384 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 7;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "", 0) + 59, 6383 - (Process.myPid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onWarmupCompleted(_get_type_lambda7 _get_type_lambda7Var, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        _get_type_lambda7Var.IAuthTabCallback(list);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 69;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(_get_type_lambda7 _get_type_lambda7Var, List list) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        _get_type_lambda7Var.onWarmupCompleted(list);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 27;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, PasswordMatchLogRes passwordMatchLogRes) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final writeRaw<PasswordMatchLogRes> IAuthTabCallback(Context context, final List<? extends File> list) {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        final _get_type_lambda7 _get_type_lambda7Var = (_get_type_lambda7) onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1869071847, iOnExtraCallbackWithResult2, new Object[]{this, context}, 1869071852);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = getInterfaceDescriptor + 51;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            JsonObject jsonObjectOnWarmupCompleted = _get_type_lambda7Var.onWarmupCompleted((File) it.next());
            if (jsonObjectOnWarmupCompleted != null) {
                int i4 = IAuthTabCallbackDefault + 97;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(jsonObjectOnWarmupCompleted);
            }
        }
        final Function0 function0 = new Function0() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda1
            public final Object invoke() {
                Object[] objArr = {_get_type_lambda7Var, list};
                return (Unit) accesssetNamep.onWarmupCompleted(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 2032358818, SvgPackage.21.onExtraCallbackWithResult(), objArr, -2032358812);
            }
        };
        final Function0 function02 = new Function0() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda2
            public final Object invoke() {
                return accesssetNamep.onNavigationEvent(_get_type_lambda7Var, list);
            }
        };
        writeRaw<PasswordMatchLogRes> writerawOnExtraCallback = onExtraCallback(arrayList);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return accesssetNamep.onWarmupCompleted(function0, (PasswordMatchLogRes) obj);
            }
        };
        writeRaw writerawOnNavigationEvent = writerawOnExtraCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda4
            public final void accept(Object obj) {
                accesssetNamep.onExtraCallback(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                Object[] objArr = {function0, function02, (Throwable) obj};
                return (Unit) accesssetNamep.onWarmupCompleted(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -2134917311, SvgPackage.21.onExtraCallbackWithResult(), objArr, 2134917313);
            }
        };
        writeRaw<PasswordMatchLogRes> writerawOnWarmupCompleted = writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.password.log.BiometricPasswordLogTracker$$ExternalSyntheticLambda6
            public final void accept(Object obj) {
                accesssetNamep.onWarmupCompleted(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        return writerawOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(kotlin.jvm.functions.Function0 r7, kotlin.jvm.functions.Function0 r8, java.lang.Throwable r9) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r9 instanceof im.toss.network.throwable.TossApiCallException.ApiError
            r2 = 1
            if (r1 == r2) goto L9
            goto L52
        L9:
            int r1 = o.accesssetNamep.getInterfaceDescriptor
            int r1 = r1 + 83
            int r3 = r1 % 128
            o.accesssetNamep.IAuthTabCallbackDefault = r3
            int r1 = r1 % r0
            im.toss.network.throwable.TossApiCallException$ApiError r9 = (im.toss.network.throwable.TossApiCallException.ApiError) r9
            java.lang.String r9 = r9.asBinder()
            r1 = 0
            int r3 = android.os.Process.getThreadPriority(r1)
            int r3 = r3 + 20
            int r3 = r3 >> 6
            int r3 = 34 - r3
            int r4 = android.view.ViewConfiguration.getLongPressTimeout()
            int r4 = r4 >> 16
            int r4 = 6 - r4
            r5 = 0
            int r5 = android.widget.ExpandableListView.getPackedPositionType(r5)
            char r5 = (char) r5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            a(r3, r4, r5, r2)
            r1 = r2[r1]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r1)
            if (r9 == 0) goto L52
            r7.invoke()
            int r7 = o.accesssetNamep.IAuthTabCallbackDefault
            int r7 = r7 + 121
            int r8 = r7 % 128
            o.accesssetNamep.getInterfaceDescriptor = r8
            int r7 = r7 % r0
            goto L55
        L52:
            r8.invoke()
        L55:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accesssetNamep.onExtraCallback(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.Throwable):kotlin.Unit");
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 105;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $10 + 115;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(asBinder[i >> i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 59698), 17 - (ViewConfiguration.getTapTimeout() >> 16), 10973 - (ViewConfiguration.getPressedStateDuration() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.lastIndexOf("", '0', 0, 0)), Drawable.resolveOpacity(0, 0) + 31, Color.argb(0, 0, 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetAfter("", 0)), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(asBinder[i + i8])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 59698), ((Process.getThreadPriority(0) + 20) >> 6) + 17, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.alpha(0)), 31 - (Process.myTid() >> 22), 20221 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i8] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback6 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 49123), 44 - (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback6).invoke(null, objArr7);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i9 = $10 + 67;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetBefore("", 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 44, 1494 - View.MeasureSpec.getMode(0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    private final writeRaw<PasswordMatchLogRes> onExtraCallback(List<JsonObject> list) {
        int i = 2 % 2;
        writeRaw<BaseApiResponse<PasswordMatchLogRes>> writerawOnNavigationEvent = AdSettingsIntegrationErrorMode.onNavigationEvent.IAuthTabCallbackStub().onNavigationEvent(new PasswordMatchLogReq(IAuthTabCallback(), list));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        MapConverter mapConverterOnExtraCallback2 = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback2, "");
        writeRaw<PasswordMatchLogRes> writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback2, mapConverterOnExtraCallback));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return writerawIAuthTabCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(_get_type_lambda7 _get_type_lambda7Var, List list) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 2032358818, iOnExtraCallbackWithResult2, new Object[]{_get_type_lambda7Var, list}, -2032358812);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, Function0 function02, Throwable th) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -2134917311, iOnExtraCallbackWithResult2, new Object[]{function0, function02, th}, 2134917313);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 902865209, iOnExtraCallbackWithResult2, new Object[]{th}, -902865206);
    }

    public static /* synthetic */ List onExtraCallback(_get_type_lambda7 _get_type_lambda7Var, PasswordLog passwordLog) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (List) onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1609690563, iOnExtraCallbackWithResult2, new Object[]{_get_type_lambda7Var, passwordLog}, -1609690559);
    }

    private final _get_type_lambda7 onWarmupCompleted(Context context) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (_get_type_lambda7) onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1869071847, iOnExtraCallbackWithResult2, new Object[]{this, context}, 1869071852);
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -966348546, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, 966348547);
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 470284354, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, -470284354);
    }

    static void onWarmupCompleted() {
        asBinder = new char[]{6560, 41864, 28043, 14214, 61835, 48025, 17794, 3998, 51609, 37801, 23965, 59312, 41397, 27570, 13735, 65469, 47542, 17309, 3515, 55228, 37258, 23471, 58817, 44996, 27073, 13260, 64990, 60850, 22459, 39335, 50094, 1456, 20449, 45542, 60800, 22420, 39392, 50156, 1512, 20457, 60856, 22456, 39349};
        IAuthTabCallbackStub = 1438960104477120471L;
        asInterface = -4668046367370007348L;
    }
}
