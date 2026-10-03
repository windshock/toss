package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
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
import o.asDoublelambda2;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.user.PasswordMatchLogReq;
import viva.republica.toss.network.model.user.PasswordMatchLogRes;
import viva.republica.toss.password.log.PasswordLog;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class asDoublelambda2 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final asDoublelambda2 IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static final AppSetIdAndScope1 IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static long access000 = 0;
    private static int access100 = 1;
    private static char[] asBinder;
    private static boolean asInterface;
    private static int getInterfaceDescriptor;
    private static asBooleanlambda1 onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static boolean onTransact;
    private static final Lazy onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent();
        int i4 = getInterfaceDescriptor + 99;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(asBooleanlambda1 asbooleanlambda1, List list) {
        int i = 2 % 2;
        int i2 = access100 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(asbooleanlambda1, list);
        int i4 = access100 + 45;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1, obj);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = access100 + 25;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return deserializeipIAuthTabCallbackDefault;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = access100 + 99;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(asBooleanlambda1 asbooleanlambda1, List list) {
        int i = 2 % 2;
        int i2 = access100 + 51;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onNavigationEvent(new Object[]{asbooleanlambda1, list}, zzmr.onExtraCallbackWithResult(), 1360383259, zzmr.onExtraCallbackWithResult(), -1360383254, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ JsonReaderErrorInfo onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoAsInterface = asInterface(function1, obj);
        int i4 = getInterfaceDescriptor + 31;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonReaderErrorInfoAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(asBooleanlambda1 asbooleanlambda1, PasswordLog passwordLog, Context context, List list) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeip = (deserializeIp) onNavigationEvent(new Object[]{asbooleanlambda1, passwordLog, context, list}, zzmr.onExtraCallbackWithResult(), 1853145344, zzmr.onExtraCallbackWithResult(), -1853145341, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        int i4 = access100 + 15;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public static /* synthetic */ List onExtraCallbackWithResult(asBooleanlambda1 asbooleanlambda1) {
        int i = 2 % 2;
        int i2 = access100 + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        List list = (List) onNavigationEvent(new Object[]{asbooleanlambda1}, zzmr.onExtraCallbackWithResult(), 224711438, zzmr.onExtraCallbackWithResult(), -224711432, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        int i4 = access100 + 15;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ List onExtraCallbackWithResult(asBooleanlambda1 asbooleanlambda1, PasswordLog passwordLog) {
        int i = 2 % 2;
        int i2 = access100 + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        List listIAuthTabCallback = IAuthTabCallback(asbooleanlambda1, passwordLog);
        int i4 = getInterfaceDescriptor + 97;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return listIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(th);
        int i4 = access100 + 63;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        Function0 function0 = (Function0) objArr[0];
        Function0 function02 = (Function0) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 67;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(function0, function02, th);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, function02, th);
        int i3 = getInterfaceDescriptor + 107;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i2));
        int i11 = ~(i9 | i4);
        int i12 = i10 | i11;
        int i13 = ~i2;
        int i14 = i11 | (~(i13 | i4));
        int i15 = (~(i5 | i7 | i13)) | (~(i13 | i9 | i4));
        int i16 = i2 + i4 + i + ((-1369571145) * i3) + ((-720088171) * i6);
        int i17 = i16 * i16;
        int i18 = ((i2 * (-1931095572)) - 2087550970) + (i4 * (-1931094842)) + (i12 * (-365)) + (i14 * 365) + (i15 * 365) + ((-1931095207) * i) + ((-789048161) * i3) + (356376013 * i6) + (i17 * 423362560);
        switch ((((-954023988) * i2) - 252706816) + ((-260227018) * i4) + ((-346898485) * i12) + (i14 * 346898485) + (346898485 * i15) + ((-607125504) * i) + (565182464 * i3) + (1611661312 * i6) + ((-409206784) * i17) + (i18 * i18 * (-1901854720))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                int i19 = 2 % 2;
                List listFlatten = CollectionsKt.flatten(((ComputeLandmarkConfidence.onNavigationEvent) ComputeLandmarkConfidence.onWarmupCompleted(438504145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{(asBooleanlambda1) objArr[0], 102400L, 0L, 0, false, 14, null}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -438504145)).onWarmupCompleted());
                listFlatten.size();
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-109, -110, -111, -125, -112, -113, -114}, Gravity.getAbsoluteGravity(0, 0) + 127, objArr2);
                ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                a(null, null, new byte[]{-108, -114, -115, -113, -109, -125, -119, -123, -113, -109}, 127 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
                ((String) objArr3[0]).intern();
                int i20 = access100 + 79;
                getInterfaceDescriptor = i20 % 128;
                int i21 = i20 % 2;
                return listFlatten;
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ JsonReaderErrorInfo onNavigationEvent(Context context, List list) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoIAuthTabCallback = IAuthTabCallback(context, list);
        int i4 = getInterfaceDescriptor + 117;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonReaderErrorInfoIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallbackStub(function1, obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 21;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, PasswordMatchLogRes passwordMatchLogRes) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, passwordMatchLogRes);
        int i4 = getInterfaceDescriptor + 93;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private asDoublelambda2() {
    }

    static {
        onExtraCallbackWithResult();
        IAuthTabCallback = new asDoublelambda2();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-122, -115, -116, -117, -126, -122, -118, -119, -123, -120, -121, -122, -123, -124, -125, -125, -126, -127}, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-122, -115, -116, -117, -126, -122, -118, -119, -123, -120, -121, -122, -123, -124, -125, -125, -126, -127}, 127 - ExpandableListView.getPackedPositionType(0L), objArr2);
        IAuthTabCallbackStub = ea10.onExtraCallbackWithResult(((String) objArr2[0]).intern());
        onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda8
            public final Object invoke() {
                return asDoublelambda2.IAuthTabCallback();
            }
        });
        onExtraCallbackWithResult = 8;
        int i = IAuthTabCallback_Parcel + 13;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 != 0) {
            int i2 = 34 / 0;
        }
    }

    private final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) onWarmupCompleted.getValue();
        int i4 = getInterfaceDescriptor + 113;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 97;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            String strOnNavigationEvent = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().onNavigationEvent();
            int i3 = access100 + 67;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return strOnNavigationEvent;
        }
        Response response2 = Response.onNavigationEvent;
        ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().onNavigationEvent();
        throw null;
    }

    private final asBooleanlambda1 onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            if (onExtraCallback == null) {
                asBooleanlambda1 asbooleanlambda1 = new asBooleanlambda1(context);
                onExtraCallback = asbooleanlambda1;
                asbooleanlambda1.IAuthTabCallback();
                int i3 = getInterfaceDescriptor + 101;
                access100 = i3 % 128;
                int i4 = i3 % 2;
            }
            asBooleanlambda1 asbooleanlambda12 = onExtraCallback;
            Intrinsics.checkNotNull(asbooleanlambda12);
            return asbooleanlambda12;
        }
        throw null;
    }

    private static final List IAuthTabCallback(asBooleanlambda1 asbooleanlambda1, PasswordLog passwordLog) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        asbooleanlambda1.onNavigationEvent(passwordLog);
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        List listFlatten = CollectionsKt.flatten(((ComputeLandmarkConfidence.onNavigationEvent) ComputeLandmarkConfidence.onWarmupCompleted(438504145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{asbooleanlambda1, 102400L, 0L, 0, false, 14, null}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3, -438504145)).onWarmupCompleted());
        int i4 = access100 + 49;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return listFlatten;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 109;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<PasswordMatchLogRes> apply(writeRaw<BaseApiResponse<PasswordMatchLogRes>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass4 anonymousClass4 = new Function1<BaseApiResponse<PasswordMatchLogRes>, deserializeIp<? extends PasswordMatchLogRes>>() { // from class: o.asDoublelambda2.onNavigationEvent.4
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
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass4) { // from class: o.UtilsKtExternalSyntheticLambda17$ComponentActivityactivityResultRegistry1ExternalSyntheticLambda1
                private final /* synthetic */ Function1 onNavigationEvent;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass4, "");
                    this.onNavigationEvent = anonymousClass4;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onNavigationEvent.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
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
        int i2 = access100 + 89;
        getInterfaceDescriptor = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = access100 + 51;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return deserializeip;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(onNavigationEvent, th);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 45;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final writeRaw<PasswordMatchLogRes> onWarmupCompleted(@NotNull final Context context, boolean z, int i) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        final asBooleanlambda1 asbooleanlambda1OnWarmupCompleted = onWarmupCompleted(context);
        final PasswordLog passwordLog = new PasswordLog(z, i, (String) null, 4, (DefaultConstructorMarker) null);
        Object[] objArr = new Object[1];
        b(new char[]{7208, 6827, 4407, 4016, 1571, 15589, 15215, 12767, 10265, 9872, 23834, 23432, 21000, 18680, 18302, 32173}, 1670 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-110, -108, -107, -112, -123, -103, -113, -104, -126, -106, -113, -126, -117, -123, -113, -109, -99}, TextUtils.indexOf("", "", 0) + 127, objArr2);
        ((String) objArr2[0]).intern();
        writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new Callable() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return asDoublelambda2.onExtraCallbackWithResult(asbooleanlambda1OnWarmupCompleted, passwordLog);
            }
        });
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return asDoublelambda2.onExtraCallbackWithResult((Throwable) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda5
            public final void accept(Object obj) throws Throwable {
                asDoublelambda2.onNavigationEvent(new Object[]{function1, obj}, zzmr.onExtraCallbackWithResult(), 168673685, zzmr.onExtraCallbackWithResult(), -168673681, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
            }
        }).onWarmupCompleted(CollectionsKt.emptyList());
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return asDoublelambda2.onExtraCallback(asbooleanlambda1OnWarmupCompleted, passwordLog, context, (List) obj);
            }
        };
        writeRaw<PasswordMatchLogRes> writerawOnNavigationEvent2 = writerawOnWarmupCompleted.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda7
            public final Object apply(Object obj) {
                return asDoublelambda2.IAuthTabCallback(function12, obj);
            }
        }).onNavigationEvent(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent2, "");
        int i3 = getInterfaceDescriptor + 117;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return writerawOnNavigationEvent2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Object obj;
        asBooleanlambda1 asbooleanlambda1 = (asBooleanlambda1) objArr[0];
        PasswordLog passwordLog = (PasswordLog) objArr[1];
        Context context = (Context) objArr[2];
        List<? extends File> list = (List) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        File fileOnExtraCallbackWithResult = asbooleanlambda1.onExtraCallbackWithResult(passwordLog);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Long.valueOf(fileOnExtraCallbackWithResult.length()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = null;
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Long l = (Long) obj;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (!list.isEmpty() && jLongValue != 0) {
            writeRaw<PasswordMatchLogRes> writerawOnExtraCallback = IAuthTabCallback.onExtraCallback(context, list);
            int i2 = getInterfaceDescriptor + 15;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return writerawOnExtraCallback;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        String str = onNavigationEvent;
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-121, -115, -113, -104, -126, -114, -109, -115, -113, -104, -114, -109, -121, -115, -122, -123, -108, -125, -109, -105, -123, -122, -114, -109, -116, -117, -126, -122, -108}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(new char[]{7216, 48198, 23761}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41076, objArr3);
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, str, strIntern, (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), passwordLog)), (String) null, (String) null, true, 52, (Object) null);
        asbooleanlambda1.IAuthTabCallback(CollectionsKt.listOf(fileOnExtraCallbackWithResult));
        wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
        wie2VarIAuthTabCallback.onExtraCallback();
        List listListOf = CollectionsKt.listOf(wie2VarIAuthTabCallback.IAuthTabCallback(PasswordLog.Companion.serializer(), passwordLog));
        ArrayList arrayList = new ArrayList();
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            int i4 = getInterfaceDescriptor + 21;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = ((JsonElement) it.next()) instanceof JsonObject;
                obj2.hashCode();
                throw null;
            }
            JsonObject jsonObject = (JsonElement) it.next();
            JsonObject jsonObject2 = jsonObject instanceof JsonObject ? jsonObject : null;
            if (jsonObject2 != null) {
                int i5 = access100 + 77;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 != 0) {
                    arrayList.add(jsonObject2);
                    obj2.hashCode();
                    throw null;
                }
                arrayList.add(jsonObject2);
            }
        }
        return IAuthTabCallback.IAuthTabCallback(arrayList);
    }

    private static final JsonReaderErrorInfo asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        int i3 = access100 + 117;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return jsonReaderErrorInfo;
    }

    public final wasLastName onExtraCallback(@NotNull final Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        final asBooleanlambda1 asbooleanlambda1OnWarmupCompleted = onWarmupCompleted(context);
        writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new Callable() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return asDoublelambda2.onExtraCallbackWithResult(asbooleanlambda1OnWarmupCompleted);
            }
        });
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return asDoublelambda2.onNavigationEvent(context, (List) obj);
            }
        };
        wasLastName waslastnameOnWarmupCompleted = writerawOnNavigationEvent.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda2
            public final Object apply(Object obj) {
                return asDoublelambda2.onExtraCallback(function1, obj);
            }
        }).onWarmupCompleted(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(waslastnameOnWarmupCompleted, "");
        int i2 = getInterfaceDescriptor + 45;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return waslastnameOnWarmupCompleted;
        }
        throw null;
    }

    private static final JsonReaderErrorInfo IAuthTabCallback(Context context, List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return wasLastName.IAuthTabCallback();
        }
        int i2 = getInterfaceDescriptor + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        wasLastName waslastnameOnNavigationEvent = IAuthTabCallback.onExtraCallback(context, (List<? extends File>) list).bI_().onNavigationEvent();
        int i4 = access100 + 83;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return waslastnameOnNavigationEvent;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 31;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23, View.resolveSize(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (access000 / 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 58, 6383 - (ViewConfiguration.getTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, 19627 - (ViewConfiguration.getScrollBarSize() >> 8), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (access000 ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 59 - View.getDefaultSize(0, 0), 6382 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 107;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 6383 - Color.red(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        asBooleanlambda1 asbooleanlambda1 = (asBooleanlambda1) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        asbooleanlambda1.IAuthTabCallback(list);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(asBooleanlambda1 asbooleanlambda1, List list) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        asbooleanlambda1.onWarmupCompleted(list);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 105;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 73;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(Function0 function0, PasswordMatchLogRes passwordMatchLogRes) {
        int i = 2 % 2;
        int i2 = access100 + 97;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            int i3 = getInterfaceDescriptor + 49;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private final writeRaw<PasswordMatchLogRes> onExtraCallback(Context context, final List<? extends File> list) {
        int i = 2 % 2;
        final asBooleanlambda1 asbooleanlambda1OnWarmupCompleted = onWarmupCompleted(context);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = getInterfaceDescriptor + 103;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                asbooleanlambda1OnWarmupCompleted.onWarmupCompleted((File) it.next());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            JsonObject jsonObjectOnWarmupCompleted = asbooleanlambda1OnWarmupCompleted.onWarmupCompleted((File) it.next());
            if (jsonObjectOnWarmupCompleted != null) {
                arrayList.add(jsonObjectOnWarmupCompleted);
            }
        }
        final Function0 function0 = new Function0() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda9
            public final Object invoke() {
                return asDoublelambda2.onExtraCallback(asbooleanlambda1OnWarmupCompleted, list);
            }
        };
        final Function0 function02 = new Function0() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda10
            public final Object invoke() {
                return asDoublelambda2.IAuthTabCallback(asbooleanlambda1OnWarmupCompleted, list);
            }
        };
        writeRaw<PasswordMatchLogRes> writerawIAuthTabCallback = IAuthTabCallback(arrayList);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda11
            public final Object invoke(Object obj2) {
                return asDoublelambda2.onWarmupCompleted(function0, (PasswordMatchLogRes) obj2);
            }
        };
        writeRaw writerawOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda12
            public final void accept(Object obj2) throws Throwable {
                asDoublelambda2.onNavigationEvent(new Object[]{function1, obj2}, zzmr.onExtraCallbackWithResult(), 2133658531, zzmr.onExtraCallbackWithResult(), -2133658529, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda13
            public final Object invoke(Object obj2) {
                return (Unit) asDoublelambda2.onNavigationEvent(new Object[]{function0, function02, (Throwable) obj2}, zzmr.onExtraCallbackWithResult(), 1230737146, zzmr.onExtraCallbackWithResult(), -1230737146, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
            }
        };
        writeRaw<PasswordMatchLogRes> writerawOnWarmupCompleted = writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.password.log.PasswordLogTracker$$ExternalSyntheticLambda14
            public final void accept(Object obj2) throws Throwable {
                asDoublelambda2.onNavigationEvent(new Object[]{function12, obj2}, zzmr.onExtraCallbackWithResult(), -12216048, zzmr.onExtraCallbackWithResult(), 12216049, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        int i3 = access100 + 61;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return writerawOnWarmupCompleted;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 75;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(kotlin.jvm.functions.Function0 r13, kotlin.jvm.functions.Function0 r14, java.lang.Throwable r15) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            o.ConvertFloatArrayToByteArray r2 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r3 = o.asDoublelambda2.onNavigationEvent
            r1 = 22
            byte[] r1 = new byte[r1]
            r1 = {x007a: FILL_ARRAY_DATA , data: [-121, -115, -113, -104, -126, -106, -109, -115, -113, -104, -106, -105, -123, -122, -106, -119, -123, -120, -121, -107, -115, -125} // fill-array
            java.lang.String r9 = ""
            r10 = 0
            int r4 = android.text.TextUtils.getOffsetBefore(r9, r10)
            int r4 = 127 - r4
            r11 = 1
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r12 = 0
            a(r12, r12, r1, r4, r5)
            r1 = r5[r10]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = r1.intern()
            r6 = 0
            r7 = 8
            r8 = 0
            r5 = r15
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = r15 instanceof im.toss.network.throwable.TossApiCallException.ApiError
            if (r1 == 0) goto L66
            im.toss.network.throwable.TossApiCallException$ApiError r15 = (im.toss.network.throwable.TossApiCallException.ApiError) r15
            java.lang.String r15 = r15.asBinder()
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x008a: FILL_ARRAY_DATA , data: [-102, -100, -101, -102, -103, -118} // fill-array
            r2 = 48
            int r2 = android.text.TextUtils.lastIndexOf(r9, r2, r10)
            int r2 = r2 + 128
            java.lang.Object[] r3 = new java.lang.Object[r11]
            a(r12, r12, r1, r2, r3)
            r1 = r3[r10]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r1)
            if (r15 == 0) goto L66
            int r14 = o.asDoublelambda2.getInterfaceDescriptor
            int r14 = r14 + 23
            int r15 = r14 % 128
            o.asDoublelambda2.access100 = r15
            int r14 = r14 % r0
            r13.invoke()
            goto L76
        L66:
            r14.invoke()
            int r13 = o.asDoublelambda2.access100
            int r13 = r13 + 25
            int r14 = r13 % 128
            o.asDoublelambda2.getInterfaceDescriptor = r14
            int r13 = r13 % r0
            if (r13 == 0) goto L76
            int r0 = r0 % 4
        L76:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asDoublelambda2.IAuthTabCallback(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.Throwable):kotlin.Unit");
    }

    private final writeRaw<PasswordMatchLogRes> IAuthTabCallback(List<JsonObject> list) {
        int i = 2 % 2;
        writeRaw<BaseApiResponse<PasswordMatchLogRes>> writerawOnWarmupCompleted = AdSettingsIntegrationErrorMode.onNavigationEvent.IAuthTabCallbackStub().onWarmupCompleted(new PasswordMatchLogReq(onWarmupCompleted(), list));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        MapConverter mapConverterOnExtraCallback2 = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback2, "");
        writeRaw<PasswordMatchLogRes> writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback2, mapConverterOnExtraCallback));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        int i2 = access100 + 51;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return writerawIAuthTabCallback;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = asBinder;
        long j = 0;
        if (cArr3 != null) {
            int i5 = $11 + 25;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 76 - ExpandableListView.getPackedPositionChild(j), 20951 - ImageFormat.getBitsPerPixel(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i6 = $10 + 87;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $10 + 65;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 75 - View.combineMeasuredStates(0, 0), 16037 - View.getDefaultSize(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i10 = 1052772399;
        if (asInterface) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $10 + 93;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), KeyEvent.getDeadChar(0, 0) + 63, ((Process.getThreadPriority(0) + 20) >> 6) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onTransact) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i13 = $10 + 101;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] / iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted / 0;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i14 = $11 + 65;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i10);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 62, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i10 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, Function0 function02, Throwable th) {
        return (Unit) onNavigationEvent(new Object[]{function0, function02, th}, zzmr.onExtraCallbackWithResult(), 1230737146, zzmr.onExtraCallbackWithResult(), -1230737146, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
    }

    private static final List onNavigationEvent(asBooleanlambda1 asbooleanlambda1) {
        return (List) onNavigationEvent(new Object[]{asbooleanlambda1}, zzmr.onExtraCallbackWithResult(), 224711438, zzmr.onExtraCallbackWithResult(), -224711432, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(asBooleanlambda1 asbooleanlambda1, List list) {
        return (Unit) onNavigationEvent(new Object[]{asbooleanlambda1, list}, zzmr.onExtraCallbackWithResult(), 1360383259, zzmr.onExtraCallbackWithResult(), -1360383254, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
    }

    private static final deserializeIp IAuthTabCallback(asBooleanlambda1 asbooleanlambda1, PasswordLog passwordLog, Context context, List list) {
        return (deserializeIp) onNavigationEvent(new Object[]{asbooleanlambda1, passwordLog, context, list}, zzmr.onExtraCallbackWithResult(), 1853145344, zzmr.onExtraCallbackWithResult(), -1853145341, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
    }

    static void onExtraCallbackWithResult() {
        asBinder = new char[]{32576, 32631, 32613, 32409, 32609, 32614, 32628, 32588, 32617, 32580, 32629, 32621, 32619, 32618, 32620, 32411, 32616, 32606, 32560, 32612, 32610, 32586, 32611, 32623, 32597, 32550, 32551, 32544, 32556};
        IAuthTabCallbackDefault = -1184334064;
        onTransact = true;
        asInterface = true;
        access000 = 1586527939475118443L;
    }
}
