package viva.republica.toss.password;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import im.toss.network.throwable.TossApiCallException;
import im.toss.utils.RxUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AdSettingsIntegrationErrorMode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EncryptedContentInfoParser;
import o.GraniteBrownfieldModule_closeView;
import o.NetConverter3;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.Rmipmap;
import o.SetDetectableSize;
import o.TrackGroupExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UTF8Decoder;
import o._get_isNull_lambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.asDouble;
import o.asDoublelambda2;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUriCollection;
import o.deserializeUriNullableCollection;
import o.enableCppPropsIteratorSetter;
import o.enableFabricRenderer;
import o.findResAndMsg;
import o.getIconPaddingLeft;
import o.getWrite;
import o.isJacksonCreator;
import o.isNumber;
import o.maybeUpdateAnimatable;
import o.minFresh;
import o.nSetPosition;
import o.noStore;
import o.onTextViewSizeChanged;
import o.setRandomHost;
import o.wasLastName;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import viva.republica.toss.R;
import viva.republica.toss.network.model.user.PasswordMatchLogRes;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordVerifyViewModel extends ViewModel {
    public static final onNavigationEvent Companion;
    private static long ICustomTabsCallbackStubProxy;
    private static char[] onActivityLayout;
    private static final String onExtraCallbackWithResult;
    private static int onMessageChannelReady;
    private static boolean onMinimized;
    private static boolean onPostMessage;
    private static char[] onRelationshipValidationResult;
    private static int onUnminimized;
    public static final int onWarmupCompleted;
    private boolean IAuthTabCallback;
    private final MutableLiveData<Pair<CharSequence, CharSequence>> IAuthTabCallbackDefault;
    private final MutableLiveData<String> IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private UTF8Decoder ICustomTabsCallback;
    private final MutableLiveData<Boolean> access000;
    private boolean access100;
    private long asBinder;
    private final deserializeUriCollection asInterface;
    private final Rmipmap<Unit> extraCallback;
    private boolean extraCallbackWithResult;
    private final Object getInterfaceDescriptor;
    private final MutableLiveData<Boolean> onActivityResized;
    private boolean onExtraCallback;
    private final isJacksonCreator onNavigationEvent;
    private boolean onTransact;
    private final Rmipmap<Unit> readTypedObject;
    private final MutableLiveData<asDouble> writeTypedObject;
    private static final byte[] $$a = {15, -12, 105, 108};
    private static final int $$b = 21;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int isEngagementSignalsApiAvailable = 1;
    private static int ICustomTabsCallbackStub = 0;
    private static int ICustomTabsCallbackDefault = 1;

    static final class IAuthTabCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PasswordVerifyViewModel.onNavigationEvent(1946401911, -1946401896, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), new Object[]{PasswordVerifyViewModel.this, null, false, this}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[UTF8Decoder.values().length];
            try {
                iArr[UTF8Decoder.SETTING_FINGERPRINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UTF8Decoder.MOBILE_ID_NO_FINGER_PRINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UTF8Decoder.SETTING_RECHECK_FOR_MOBILE_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, short r6, int r7) {
        /*
            int r7 = r7 * 3
            int r7 = 97 - r7
            int r6 = r6 + 4
            int r5 = r5 * 4
            int r0 = 1 - r5
            byte[] r1 = viva.republica.toss.password.PasswordVerifyViewModel.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordVerifyViewModel.$$c(short, short, int):java.lang.String");
    }

    static {
        onUnminimized = 0;
        IAuthTabCallbackDefault();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-114, -119, -121, -123, -115, -124, -119, -118, -120, -116, -117, -118, -122, -119, -120, -121, -122, -123, -124, -125, -125, -126, -127}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        onWarmupCompleted = 8;
        int i = isEngagementSignalsApiAvailable + 55;
        onUnminimized = i % 128;
        if (i % 2 != 0) {
            int i2 = 44 / 0;
        }
    }

    public static /* synthetic */ Integer IAuthTabCallback(int i, Throwable th) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 71;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult(i, th);
        if (i4 != 0) {
            int i5 = 57 / 0;
        }
        int i6 = ICustomTabsCallbackDefault + 77;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return numOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Boolean bool, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 37;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(bool, setDetectableSize);
        int i4 = ICustomTabsCallbackStub + 67;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordVerifyViewModel passwordVerifyViewModel, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, boolean z2, Boolean bool) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 15;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(passwordVerifyViewModel, context, graniteBrownfieldModule_closeView, z, z2, bool);
        int i4 = ICustomTabsCallbackDefault + 113;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(Boolean bool) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 39;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallbackDefault = IAuthTabCallbackDefault(bool);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = ICustomTabsCallbackDefault + 35;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return deserializeipIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 101;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = ICustomTabsCallbackDefault + 113;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Integer IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 79;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Integer numOnActivityLayout = onActivityLayout(function1, obj);
        int i4 = ICustomTabsCallbackDefault + 27;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return numOnActivityLayout;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 53;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onPostMessage(function1, obj);
        }
        onPostMessage(function1, obj);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 29;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(function1, obj);
        int i4 = ICustomTabsCallbackStub + 93;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return boolIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 83;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        int i4 = ICustomTabsCallbackDefault + 101;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 63;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        Throwable th = (Throwable) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 21;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(th, setDetectableSize);
        int i4 = ICustomTabsCallbackDefault + 69;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 123;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Boolean onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 119;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolICustomTabsCallback = ICustomTabsCallback(function1, obj);
        int i4 = ICustomTabsCallbackStub + 53;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return boolICustomTabsCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 89;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(35001910, -35001897, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{bool}, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6);
        int i3 = ICustomTabsCallbackStub + 39;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Context context, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 87;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(context, commonModule_setLeftEdgeTouchEnabled);
        int i4 = ICustomTabsCallbackDefault + 63;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 23;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(1983957031, -1983957022, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{th}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
        int i4 = ICustomTabsCallbackDefault + 55;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(Boolean bool) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 87;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(bool);
            throw null;
        }
        deserializeIp deserializeipOnWarmupCompleted = onWarmupCompleted(bool);
        int i3 = ICustomTabsCallbackDefault + 105;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return deserializeipOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, PasswordVerifyViewModel passwordVerifyViewModel, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 5;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(context, passwordVerifyViewModel, th);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(context, passwordVerifyViewModel, th);
        int i3 = ICustomTabsCallbackStub + 89;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 63;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th, setDetectableSize);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 13;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = ICustomTabsCallbackDefault + 95;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = i | i7 | (~i4);
        int i9 = ~i;
        int i10 = (~(i4 | i7)) | (~(i7 | i9));
        int i11 = i2 + i + i5 + ((-92689393) * i6) + (1942122663 * i3);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i2) - 357761024) + ((-674687396) * i) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i5) + ((-1056047104) * i6) + ((-742522880) * i3) + ((-592117760) * i12);
        int i14 = (i2 * 1048061654) + 1366922925 + (i * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i5 * 1048061961) + (i6 * 439444615) + (i3 * (-1279783457)) + (i12 * 173867008);
        switch (i13 + (i14 * i14 * (-1898250240))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                Context context = (Context) objArr[1];
                final int iIntValue = ((Number) objArr[2]).intValue();
                int i15 = 2 % 2;
                writeRaw writerawIAuthTabCallback = asDoublelambda2.IAuthTabCallback.onWarmupCompleted(context, false, iIntValue).IAuthTabCallback(NetConverter3.onExtraCallback());
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj) {
                        return PasswordVerifyViewModel.onWarmupCompleted((PasswordMatchLogRes) obj);
                    }
                };
                writeRaw writerawAsInterface = writerawIAuthTabCallback.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda10
                    public final Object apply(Object obj) {
                        return PasswordVerifyViewModel.IAuthTabCallbackDefault(function1, obj);
                    }
                }).asInterface(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda11
                    public static int onExtraCallback;
                    public static int onNavigationEvent;

                    public static int onNavigationEvent() {
                        int i16 = onExtraCallback;
                        int i17 = i16 % 5851960;
                        onExtraCallback = i16 + 1;
                        if (i17 != 0) {
                            return onNavigationEvent;
                        }
                        int i18 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
                        onNavigationEvent = i18;
                        return i18;
                    }

                    public final Object apply(Object obj) {
                        return PasswordVerifyViewModel.IAuthTabCallback(iIntValue, (Throwable) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(writerawAsInterface, "");
                int i16 = ICustomTabsCallbackStub + 35;
                ICustomTabsCallbackDefault = i16 % 128;
                int i17 = i16 % 2;
                return writerawAsInterface;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) objArr[0];
                Context context2 = (Context) objArr[1];
                int i18 = 2 % 2;
                int i19 = ICustomTabsCallbackStub + 65;
                ICustomTabsCallbackDefault = i19 % 128;
                int i20 = i19 % 2;
                passwordVerifyViewModel.onExtraCallbackWithResult(context2);
                int i21 = ICustomTabsCallbackStub + 43;
                ICustomTabsCallbackDefault = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 9:
                final Throwable th = (Throwable) objArr[0];
                int i23 = 2 % 2;
                Object[] objArr2 = new Object[1];
                b(22 - (Process.myTid() >> 22), (char) (View.getDefaultSize(0, 0) + 9200), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6, objArr2);
                ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr2[0]).intern(), false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda5
                    public final Object invoke(Object obj) {
                        return PasswordVerifyViewModel.onExtraCallbackWithResult(th, (SetDetectableSize) obj);
                    }
                }, 30, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i24 = ICustomTabsCallbackStub + 41;
                ICustomTabsCallbackDefault = i24 % 128;
                int i25 = i24 % 2;
                return unit;
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                return asInterface(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                PasswordVerifyViewModel passwordVerifyViewModel2 = (PasswordVerifyViewModel) objArr[0];
                GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                access13800<? super Unit> access13800Var = (access13800) objArr[3];
                int i26 = 2 % 2;
                int i27 = ICustomTabsCallbackDefault + 95;
                ICustomTabsCallbackStub = i27 % 128;
                int i28 = i27 % 2;
                Object objIAuthTabCallback = passwordVerifyViewModel2.IAuthTabCallback(graniteBrownfieldModule_closeView, zBooleanValue, access13800Var);
                int i29 = ICustomTabsCallbackDefault + 33;
                ICustomTabsCallbackStub = i29 % 128;
                int i30 = i29 % 2;
                return objIAuthTabCallback;
            case 16:
                return getInterfaceDescriptor(objArr);
            case 17:
                return access000(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 97;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(th);
        int i3 = ICustomTabsCallbackStub + 37;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 33;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(bool);
            throw null;
        }
        Unit unitAsInterface = asInterface(bool);
        int i3 = ICustomTabsCallbackStub + 43;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Boolean bool, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 9;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(bool, setDetectableSize);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Response response = (Response) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 31;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnNavigationEvent = onNavigationEvent(response);
        int i4 = ICustomTabsCallbackStub + 55;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return boolOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 79;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        int i4 = ICustomTabsCallbackDefault + 47;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean onWarmupCompleted(Response response) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 27;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallback = onExtraCallback(response);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return boolOnExtraCallback;
    }

    public static /* synthetic */ Integer onWarmupCompleted(PasswordMatchLogRes passwordMatchLogRes) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordMatchLogRes);
        int i4 = ICustomTabsCallbackDefault + 59;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return numOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 9;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            return (deserializeIp) onNavigationEvent(1058970025, -1058970023, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{function1, obj}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        throw null;
    }

    @Inject
    public PasswordVerifyViewModel(@NotNull Object obj, @NotNull isJacksonCreator isjacksoncreator) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(isjacksoncreator, "");
        this.getInterfaceDescriptor = obj;
        this.onNavigationEvent = isjacksoncreator;
        this.ICustomTabsCallback = UTF8Decoder.UNKNOWN;
        this.access000 = new MutableLiveData<>();
        this.onActivityResized = new MutableLiveData<>();
        this.writeTypedObject = new MutableLiveData<>();
        this.IAuthTabCallbackDefault = new MutableLiveData<>();
        this.IAuthTabCallbackStub = new MutableLiveData<>();
        this.asInterface = new deserializeUriCollection();
        this.readTypedObject = new Rmipmap<>();
        this.extraCallback = new Rmipmap<>();
        this.IAuthTabCallback_Parcel = true;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) objArr[0];
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 51;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        passwordVerifyViewModel.onExtraCallback(graniteBrownfieldModule_closeView, zBooleanValue);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ICustomTabsCallbackDefault + 3;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 13;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        Object obj = null;
        passwordVerifyViewModel.onTransact = zBooleanValue;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 69;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 45;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        wasLastName waslastnameOnNavigationEvent = passwordVerifyViewModel.onNavigationEvent(context);
        int i4 = ICustomTabsCallbackStub + 25;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return waslastnameOnNavigationEvent;
    }

    public static final /* synthetic */ void onExtraCallback(PasswordVerifyViewModel passwordVerifyViewModel, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 111;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        passwordVerifyViewModel.onWarmupCompleted(deserializeurinullablecollection);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallbackDefault + 55;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ writeRaw onExtraCallbackWithResult(PasswordVerifyViewModel passwordVerifyViewModel, Context context, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 81;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {passwordVerifyViewModel, context, Integer.valueOf(i)};
        writeRaw writeraw = (writeRaw) onNavigationEvent(-403611783, 403611786, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
        int i5 = ICustomTabsCallbackDefault + 59;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return writeraw;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult$42387a00(PasswordVerifyViewModel passwordVerifyViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 13;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        Object obj = passwordVerifyViewModel.getInterfaceDescriptor;
        int i5 = i3 + 117;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return obj;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 17;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.access100 = z;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 87;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        passwordVerifyViewModel.onExtraCallback = zBooleanValue;
        if (i3 == 0) {
            return null;
        }
        int i4 = 27 / 0;
        return null;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 55;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 85;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final MutableLiveData<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 53;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        MutableLiveData<Boolean> mutableLiveData = this.access000;
        int i4 = i2 + 61;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 59;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        MutableLiveData<Boolean> mutableLiveData = passwordVerifyViewModel.onActivityResized;
        int i5 = i3 + 41;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final MutableLiveData<asDouble> onExtraCallback() {
        MutableLiveData<asDouble> mutableLiveData;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 89;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        if (i2 % 2 != 0) {
            mutableLiveData = this.writeTypedObject;
            int i4 = 10 / 0;
        } else {
            mutableLiveData = this.writeTypedObject;
        }
        int i5 = i3 + 71;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return mutableLiveData;
    }

    public final MutableLiveData<Pair<CharSequence, CharSequence>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 27;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 15;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<String> mutableLiveData = this.IAuthTabCallbackStub;
        int i5 = i2 + 39;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final Rmipmap<Unit> onWarmupCompleted() {
        Rmipmap<Unit> rmipmap;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 55;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            rmipmap = this.readTypedObject;
            int i4 = 45 / 0;
        } else {
            rmipmap = this.readTypedObject;
        }
        int i5 = i2 + 53;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return rmipmap;
    }

    public final Rmipmap<Unit> onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 23;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Rmipmap<Unit> rmipmap = this.extraCallback;
        int i4 = i2 + 17;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return rmipmap;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 25;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback_Parcel = z;
        int i5 = i3 + 117;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) objArr[0];
        UTF8Decoder uTF8Decoder = (UTF8Decoder) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 31;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uTF8Decoder, "");
            passwordVerifyViewModel.ICustomTabsCallback = uTF8Decoder;
            throw null;
        }
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        passwordVerifyViewModel.ICustomTabsCallback = uTF8Decoder;
        int i3 = ICustomTabsCallbackStub + 85;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 5;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder = j;
        int i5 = i2 + 97;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 59;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = 48 / 0;
        return deserializeip;
    }

    private static final Boolean IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 7;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i4 = ICustomTabsCallbackStub + 89;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    private static final Boolean onNavigationEvent(Response response) {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 33;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(response, "");
            boolValueOf = Boolean.valueOf(response.onExtraCallbackWithResult());
            int i3 = 39 / 0;
        } else {
            Intrinsics.checkNotNullParameter(response, "");
            boolValueOf = Boolean.valueOf(response.onExtraCallbackWithResult());
        }
        int i4 = ICustomTabsCallbackDefault + 103;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 89;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r29, char r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordVerifyViewModel.b(int, char, int, java.lang.Object[]):void");
    }

    private static final Unit onExtraCallbackWithResult(Boolean bool, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 19;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 5, (char) (Process.myTid() >> 22), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), bool);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 3;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        final Boolean bool = (Boolean) objArr[0];
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-125, -125, -119, -106, -106, -107, -125, -110, -122, -119, -108, -122, -119, -125, -110, -125, -125, -123, -109, -110, -111, -112, -118, -113}, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, objArr2);
        ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr2[0]).intern(), false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return PasswordVerifyViewModel.IAuthTabCallback(bool, (SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackStub + 9;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 75;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
    }

    private static final Unit onNavigationEvent(Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 109;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        b(Color.red(0) + 7, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), th.getMessage());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 123;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final deserializeIp onWarmupCompleted(Boolean bool) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 25;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            int i4 = ICustomTabsCallbackDefault + 103;
            ICustomTabsCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return writeRaw.onExtraCallback(bool);
            }
            int i5 = 75 / 0;
            return writeRaw.onExtraCallback(bool);
        }
        writeRaw writerawOnWarmupCompleted = AdSettingsIntegrationErrorMode.onNavigationEvent.asBinder().onWarmupCompleted().onWarmupCompleted(1L, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda16
            public final Object invoke(Object obj) {
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                return (Boolean) PasswordVerifyViewModel.onNavigationEvent(344442228, -344442217, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{(Response) obj}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
            }
        };
        writeRaw writerawOnWarmupCompleted2 = writerawOnWarmupCompleted.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda17
            public final Object apply(Object obj) {
                Object[] objArr = {function1, obj};
                return (Boolean) PasswordVerifyViewModel.onNavigationEvent(-1079390680, 1079390694, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                return (Unit) PasswordVerifyViewModel.onNavigationEvent(-1441949974, 1441949974, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{(Boolean) obj}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
            }
        };
        writeRaw writerawOnNavigationEvent = writerawOnWarmupCompleted2.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda19
            public final void accept(Object obj) {
                PasswordVerifyViewModel.getInterfaceDescriptor(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda20
            public final Object invoke(Object obj) {
                return PasswordVerifyViewModel.onExtraCallback((Throwable) obj);
            }
        };
        return writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda21
            public final void accept(Object obj) {
                PasswordVerifyViewModel.IAuthTabCallback(function13, obj);
            }
        }).onWarmupCompleted(Boolean.FALSE);
    }

    private static final deserializeIp onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 99;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = ICustomTabsCallbackDefault + 117;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return deserializeip;
        }
        throw null;
    }

    private static final Boolean ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 101;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i4 = ICustomTabsCallbackStub + 23;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    private static final Boolean onExtraCallback(Response response) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 113;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(response, "");
        Boolean boolValueOf = Boolean.valueOf(response.onExtraCallbackWithResult());
        int i4 = ICustomTabsCallbackDefault + 57;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 41;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackStub + 103;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(Boolean bool, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 105;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        b(6 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), ViewConfiguration.getEdgeSlop() >> 16, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), bool);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStub + 83;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(final Boolean bool) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-125, -125, -119, -106, -106, -107, -125, -110, -122, -119, -108, -122, -119, -125, -110, -119, -114, -111, -123, -123, -111, -110, -111, -112, -118, -113}, 127 - KeyEvent.getDeadChar(0, 0), objArr);
        ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr[0]).intern(), false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return PasswordVerifyViewModel.onNavigationEvent(bool, (SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackStub + 53;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 55;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackDefault + 59;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        final /* synthetic */ boolean $registerBiometricAuth;
        int label;
        private static final byte[] $$a = {70, 83, 77, 1};
        private static final int $$b = 33;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static long onExtraCallback = 7798559133331975163L;
        private static int onNavigationEvent = -1776194565;
        private static char onExtraCallbackWithResult = 19968;

        private static String $$c(int i, short s, int i2) {
            byte[] bArr = $$a;
            int i3 = 4 - (i2 * 4);
            int i4 = s * 3;
            int i5 = i + 109;
            byte[] bArr2 = new byte[1 - i4];
            int i6 = 0 - i4;
            int i7 = -1;
            if (bArr == null) {
                i5 += i3;
                i3++;
                i7 = -1;
            }
            while (true) {
                int i8 = i7 + 1;
                bArr2[i8] = (byte) i5;
                if (i8 == i6) {
                    return new String(bArr2, 0);
                }
                int i9 = i3;
                i5 += bArr[i3];
                i3 = i9 + 1;
                i7 = i8;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.$registerBiometricAuth = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = PasswordVerifyViewModel.this.new onExtraCallback(this.$password, this.$registerBiometricAuth, access13800Var);
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            int i5 = onWarmupCompleted + 19;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i4 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i5 = $11 + 53;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i7 = $11 + 27;
                $10 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i9 = (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 43;
                        int iIndexOf = 1451 - TextUtils.indexOf("", "");
                        byte b = $$a[3];
                        byte b2 = (byte) (b - 1);
                        String str$$c = $$c(b, b2, b2);
                        Class[] clsArr = new Class[1];
                        clsArr[i4] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(doubleTapTimeout, i9, iIndexOf, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char c2 = (char) (49123 - (TypedValue.complexToFloat(i4) > 0.0f ? 1 : (TypedValue.complexToFloat(i4) == 0.0f ? 0 : -1)));
                        int i10 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43;
                        int i11 = 1495 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b3 = (byte) ($$a[3] - 1);
                        byte b4 = b3;
                        String str$$c2 = $$c(b3, b4, b4);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, i10, i11, 1533236389, false, str$$c2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    int i12 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i12);
                    objArr4[i4] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        char size = (char) (View.MeasureSpec.getSize(i4) + 23972);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 50;
                        int iBlue = Color.blue(i4) + 22939;
                        Class[] clsArr3 = new Class[3];
                        clsArr3[i4] = Object.class;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[2] = Integer.TYPE;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(size, fadingEdgeLength, iBlue, 1872485556, false, "k", clsArr3);
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i13 = cArr4[iIntValue2] * 32718;
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                    objArr5[i4] = Integer.valueOf(i13);
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 45848);
                        int iResolveOpacity = 29 - Drawable.resolveOpacity(i4, i4);
                        int mirror = AndroidCharacter.getMirror('0') + 12529;
                        Class[] clsArr4 = new Class[2];
                        clsArr4[i4] = Integer.TYPE;
                        clsArr4[1] = Integer.TYPE;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(tapTimeout, iResolveOpacity, mirror, 1401536470, false, "l", clsArr4);
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onNavigationEvent ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i2 = 2;
                    i4 = 0;
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

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 29;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    Object[] objArr = new Object[1];
                    a((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1621235523, new char[]{65062, 30177, 28434, 38125, 4743, 41313, 62304, 21764, 33191, 44738, 51894, 14560, 60592, 13861, 45174, 43038, 39510, 16998, 34089, 58739, 36726, 59798, 49246, 24755, 19952, 52497, 57259, 27536, 34993, 62787, 64759, 43002, 25553, 59893, 6237, 50178, 4862, 35519, 27838, 49832, 41770, 54096, 33991, 48745, 39369, 46831, 29573}, new char[]{0, 0, 0, 0}, new char[]{48391, 24040, 36511, 61999}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = i4 + 5;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                PasswordVerifyViewModel.onNavigationEvent(1093229847, -1093229837, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), new Object[]{PasswordVerifyViewModel.this, true}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
                PasswordVerifyViewModel passwordVerifyViewModel = PasswordVerifyViewModel.this;
                GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
                boolean z = this.$registerBiometricAuth;
                this.label = 1;
                if (PasswordVerifyViewModel.onNavigationEvent(1946401911, -1946401896, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), new Object[]{passwordVerifyViewModel, graniteBrownfieldModule_closeView, Boolean.valueOf(z), this}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult()) == objOnWarmupCompleted) {
                    int i7 = IAuthTabCallback + 63;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            ((MutableLiveData) PasswordVerifyViewModel.onNavigationEvent(14548670, -14548669, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), new Object[]{PasswordVerifyViewModel.this}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).setValue(access14000.onNavigationEvent(true));
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallback(Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 51;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Color.red(0) + 28, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), th.getMessage());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStub + 71;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(final Throwable th) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-122, -123, -122, -122, -119, -110, -122, -119, -108, -122, -119, -125, -110, -119, -114, -111, -123, -123, -111, -110, -111, -112, -118, -113}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, objArr);
        ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr[0]).intern(), false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                Object[] objArr2 = {th, (SetDetectableSize) obj};
                return (Unit) PasswordVerifyViewModel.onNavigationEvent(-972653899, 972653915, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr2, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
            }
        }, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackStub + 35;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
        }
        return unit;
    }

    private static final deserializeIp IAuthTabCallbackDefault(Boolean bool) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 11;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        if (!(!bool.booleanValue())) {
            int i4 = ICustomTabsCallbackDefault + 43;
            ICustomTabsCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return writeRaw.onExtraCallback(bool);
            }
            int i5 = 43 / 0;
            return writeRaw.onExtraCallback(bool);
        }
        writeRaw writerawOnWarmupCompleted = AdSettingsIntegrationErrorMode.onNavigationEvent.asBinder().IAuthTabCallback().onWarmupCompleted(1L, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda22
            public final Object invoke(Object obj) {
                return PasswordVerifyViewModel.onWarmupCompleted((Response) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted2 = writerawOnWarmupCompleted.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda23
            public final Object apply(Object obj) {
                return PasswordVerifyViewModel.onExtraCallback(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda24
            public final Object invoke(Object obj) {
                return PasswordVerifyViewModel.onNavigationEvent((Boolean) obj);
            }
        };
        writeRaw writerawOnNavigationEvent = writerawOnWarmupCompleted2.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda25
            public final void accept(Object obj) {
                PasswordVerifyViewModel.onExtraCallbackWithResult(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda26
            public final Object invoke(Object obj) {
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                return (Unit) PasswordVerifyViewModel.onNavigationEvent(-1855881062, 1855881066, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{(Throwable) obj}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
            }
        };
        return writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda27
            public final void accept(Object obj) {
                PasswordVerifyViewModel.asInterface(function13, obj);
            }
        }).onWarmupCompleted(Boolean.FALSE);
    }

    public static /* synthetic */ void onNavigationEvent(PasswordVerifyViewModel passwordVerifyViewModel, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, boolean z2, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 103;
        int i4 = i3 % 128;
        ICustomTabsCallbackDefault = i4;
        if (i3 % 2 != 0 ? (i & 8) != 0 : (i & 20) != 0) {
            int i5 = i4 + 81;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        }
        Object[] objArr = {passwordVerifyViewModel, context, graniteBrownfieldModule_closeView, Boolean.valueOf(z), Boolean.valueOf(z2)};
        onNavigationEvent(-2088399815, 2088399822, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
        int i7 = ICustomTabsCallbackStub + 107;
        ICustomTabsCallbackDefault = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 27;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackStub + 107;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 105;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallbackDefault + 67;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(viva.republica.toss.password.PasswordVerifyViewModel r10, android.content.Context r11, o.GraniteBrownfieldModule_closeView r12, boolean r13, boolean r14, java.lang.Boolean r15) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordVerifyViewModel.ICustomTabsCallbackDefault
            int r1 = r1 + 103
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordVerifyViewModel.ICustomTabsCallbackStub = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L1b
            boolean r15 = r15.booleanValue()
            r1 = 20
            int r1 = r1 / 0
            r15 = r15 ^ r2
            if (r15 == 0) goto L3d
            goto L21
        L1b:
            boolean r15 = r15.booleanValue()
            if (r15 == r2) goto L3d
        L21:
            o.noStore$onExtraCallback r12 = o.noStore.Companion
            o.noStore r12 = r12.onWarmupCompleted()
            o.minFresh.onNavigationEvent(r11, r12)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r12 = r10.access000
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r12.setValue(r13)
            androidx.lifecycle.MutableLiveData<java.lang.String> r10 = r10.IAuthTabCallbackStub
            int r12 = viva.republica.toss.R.string.app_password___c704d21a61
            java.lang.String r11 = r11.getString(r12)
            r10.setValue(r11)
            goto L53
        L3d:
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            onExtraCallbackWithResult(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r10 = viva.republica.toss.password.PasswordVerifyViewModel.ICustomTabsCallbackDefault
            int r10 = r10 + 79
            int r11 = r10 % 128
            viva.republica.toss.password.PasswordVerifyViewModel.ICustomTabsCallbackStub = r11
            int r10 = r10 % r0
        L53:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordVerifyViewModel.onNavigationEvent(viva.republica.toss.password.PasswordVerifyViewModel, android.content.Context, o.GraniteBrownfieldModule_closeView, boolean, boolean, java.lang.Boolean):kotlin.Unit");
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        final boolean z;
        final PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) objArr[0];
        final Context context = (Context) objArr[1];
        final GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 123;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
        passwordVerifyViewModel.IAuthTabCallbackStubProxy = zBooleanValue2;
        final boolean zOnExtraCallback = enableFabricRenderer.onExtraCallback.onExtraCallbackWithResult(context).onExtraCallback();
        if (zOnExtraCallback) {
            int i4 = ICustomTabsCallbackStub + 67;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = onWarmupCompleted.IAuthTabCallback[passwordVerifyViewModel.ICustomTabsCallback.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    int i7 = ICustomTabsCallbackStub + 23;
                    ICustomTabsCallbackDefault = i7 % 128;
                    int i8 = i7 % 2;
                    if (i6 != 3 && zBooleanValue) {
                    }
                }
                z = false;
            }
            int i9 = ICustomTabsCallbackDefault + 17;
            ICustomTabsCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        passwordVerifyViewModel.access000.setValue(Boolean.TRUE);
        writeRaw<Boolean> writerawAsBinder = passwordVerifyViewModel.asBinder();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return PasswordVerifyViewModel.IAuthTabCallback(this.f$0, context, graniteBrownfieldModule_closeView, z, zOnExtraCallback, (Boolean) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda13
            public final void accept(Object obj) {
                PasswordVerifyViewModel.asBinder(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda14
            public final Object invoke(Object obj) {
                return PasswordVerifyViewModel.onExtraCallbackWithResult(context, passwordVerifyViewModel, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawAsBinder.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda15
            public final void accept(Object obj) {
                PasswordVerifyViewModel.onTransact(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        passwordVerifyViewModel.onWarmupCompleted(deserializeurinullablecollectionOnNavigationEvent);
        return null;
    }

    private static final Unit onExtraCallback(Context context, PasswordVerifyViewModel passwordVerifyViewModel, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 73;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        minFresh.onNavigationEvent(context, noStore.Companion.onWarmupCompleted());
        passwordVerifyViewModel.access000.setValue(Boolean.FALSE);
        passwordVerifyViewModel.IAuthTabCallbackDefault.setValue(getWrite.IAuthTabCallback(context.getString(R.string.error_retry_message), ""));
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStub + 41;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static /* synthetic */ void onExtraCallbackWithResult(PasswordVerifyViewModel passwordVerifyViewModel, Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault;
        int i4 = i3 + 121;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 16) != 0) {
            int i6 = i3 + 115;
            ICustomTabsCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            str = _get_isNull_lambda0.onExtraCallbackWithResult.IAuthTabCallback();
        }
        String str3 = str;
        if ((i & 32) != 0) {
            int i8 = ICustomTabsCallbackDefault + 41;
            ICustomTabsCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            str2 = _get_isNull_lambda0.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        passwordVerifyViewModel.onExtraCallbackWithResult(context, graniteBrownfieldModule_closeView, z, z2, str3, str2);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onActivityLayout;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 49;
                $11 = i7 % 128;
                if (i7 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 77 - (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777293, (ViewConfiguration.getEdgeSlop() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i4 = 2;
                j = 0;
            }
            int i8 = $11 + 11;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onMessageChannelReady)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        float f = 0.0f;
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 74, 16036 - ExpandableListView.getPackedPositionChild(0L), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onMinimized) {
            int i10 = $11 + 79;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i12 = $11 + 17;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] >>> iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 63 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 63 - KeyEvent.keyCodeFromString(""), 12213 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                f = 0.0f;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onPostMessage) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i13 = $11 + 109;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] - iIntValue);
                    i3 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i3 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i3;
                int i14 = $11 + 33;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i16 = $11 + 53;
        $10 = i16 % 128;
        if (i16 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        }
        char[] cArr6 = new char[i2];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i17 = $10 + 97;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 63 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr6);
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char[] onNavigationEvent = {27260, 27175, 27173, 27168, 27194, 27196, 27198, 27198, 27175, 27151, 27146, 27168, 27168, 27198, 27141, 27245, 27144, 27174, 27171, 27196, 27196, 27173, 27142, 27245, 27148, 27173, 27198, 27172, 27179, 27181, 27151, 27245, 27144, 27175, 27199, 27194, 27170, 27173, 27138, 27245, 27145, 27199, 27140, 27144, 27170, 27176, 27180};
        final /* synthetic */ GraniteBrownfieldModule_closeView $password;
        final /* synthetic */ onTransact $verifyPasswordListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, onTransact ontransact, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$password = graniteBrownfieldModule_closeView;
            this.$verifyPasswordListener = ontransact;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$password, this.$verifyPasswordListener, access13800Var);
            int i2 = onExtraCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = 39 / 0;
            } else {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 17 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 61 / 0;
            }
            return objInvokeSuspend;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr2 = onNavigationEvent;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35283), View.resolveSize(0, 0) + 35, (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i7 = $10 + 75;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr2, i2, cArr4, 0, i3);
            if (bArr != null) {
                int i9 = $10 + 123;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 64 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getEdgeSlop() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) + 29, 17656 - MotionEvent.axisFromString(""), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 49468), 70 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr4 = cArr;
            }
            if (i5 > 0) {
                int i12 = $11 + 29;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    char[] cArr5 = new char[i3];
                    System.arraycopy(cArr4, 0, cArr5, 1, i3);
                    System.arraycopy(cArr5, 1, cArr4, i3 / i5, i5);
                    System.arraycopy(cArr5, i5, cArr4, 1, i3 % i5);
                } else {
                    char[] cArr6 = new char[i3];
                    System.arraycopy(cArr4, 0, cArr6, 0, i3);
                    int i13 = i3 - i5;
                    System.arraycopy(cArr6, 0, cArr4, i13, i5);
                    System.arraycopy(cArr6, i5, cArr4, 0, i13);
                }
            }
            if (z) {
                int i14 = $11 + 109;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                char[] cArr7 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i16 = $10 + 1;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr7;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i18 = $10 + 65;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 31;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 47, 0, 0}, true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 'N' - AndroidCharacter.getMirror('0'), TextUtils.indexOf("", "") + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
                onTransact ontransact = this.$verifyPasswordListener;
                this.label = 1;
                try {
                    Object[] objArr2 = {graniteBrownfieldModule_closeView, ontransact, this};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2100744515);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 30 - KeyEvent.normalizeMetaState(0), (Process.myTid() >> 22) + 24887, -1282813907, false, "onWarmupCompleted", new Class[]{GraniteBrownfieldModule_closeView.class, enableCppPropsIteratorSetter.onExtraCallbackWithResult.class, access13800.class});
                    }
                    if (((Method) objOnExtraCallback2).invoke(obj2, objArr2) == objOnWarmupCompleted) {
                        int i5 = onExtraCallback + 25;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallbackWithResult(Context context, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, boolean z2, String str, String str2) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(graniteBrownfieldModule_closeView, new onTransact(z, context, this, str2, str, graniteBrownfieldModule_closeView, z2, this.onNavigationEvent.IAuthTabCallback(context)), null), 3, (Object) null);
        int i2 = ICustomTabsCallbackStub + 35;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onExtraCallbackWithResult(final Context context) {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return PasswordVerifyViewModel.onExtraCallback(context, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        int i2 = ICustomTabsCallbackDefault + 111;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(Context context, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 95;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(context.getString(R.string.app__1_passowrd_last_chance_for_overseas));
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 51;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final wasLastName onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 93;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        wasLastName waslastnameOnNavigationEvent = asDoublelambda2.IAuthTabCallback.onWarmupCompleted(context, true, 0).IAuthTabCallback(NetConverter3.onExtraCallback()).bI_().onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, "");
        int i4 = ICustomTabsCallbackStub + 1;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return waslastnameOnNavigationEvent;
    }

    private static final Integer onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 47;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Integer) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static final Integer onExtraCallbackWithResult(PasswordMatchLogRes passwordMatchLogRes) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 3;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(passwordMatchLogRes, "");
            Integer.valueOf(passwordMatchLogRes.onExtraCallback());
            throw null;
        }
        Intrinsics.checkNotNullParameter(passwordMatchLogRes, "");
        Integer numValueOf = Integer.valueOf(passwordMatchLogRes.onExtraCallback());
        int i3 = ICustomTabsCallbackStub + 35;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 81 / 0;
        }
        return numValueOf;
    }

    private static final Integer onExtraCallbackWithResult(int i, Throwable th) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 123;
        ICustomTabsCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            boolean z = th instanceof TossApiCallException.ApiError;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        if (!(!(th instanceof TossApiCallException.ApiError))) {
            String strAsBinder = ((TossApiCallException.ApiError) th).asBinder();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-103, -101, -102, -103, -104, -105}, (KeyEvent.getMaxKeyCode() >> 16) + 127, objArr);
            if (Intrinsics.areEqual(strAsBinder, ((String) objArr[0]).intern())) {
                int i4 = ICustomTabsCallbackDefault + 115;
                ICustomTabsCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return 5;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        int i6 = ICustomTabsCallbackDefault + 9;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 35 / 0;
        }
        return numValueOf;
    }

    private final void onExtraCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(graniteBrownfieldModule_closeView, z, null), 3, (Object) null);
        int i2 = ICustomTabsCallbackStub + 47;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
    }

    public void onCleared() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 57;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            super.onCleared();
            this.asInterface.dispose();
            IAuthTabCallbackStub();
            int i3 = 55 / 0;
        } else {
            super.onCleared();
            this.asInterface.dispose();
            IAuthTabCallbackStub();
        }
        int i4 = ICustomTabsCallbackStub + 75;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.GraniteBrownfieldModule_closeView r15, boolean r16, o.access13800<? super kotlin.Unit> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordVerifyViewModel.IAuthTabCallback(o.GraniteBrownfieldModule_closeView, boolean, o.access13800):java.lang.Object");
    }

    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 63;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (this.IAuthTabCallback_Parcel) {
            int i5 = i2 + 1;
            ICustomTabsCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            if ((!this.extraCallbackWithResult) && !this.onTransact) {
                getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new asDouble(isNumber.PASSWORD, null, null, null, this.onExtraCallback, this.IAuthTabCallback, false, false, false, null, 974, null));
                this.extraCallbackWithResult = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNavigationEvent(@org.jetbrains.annotations.NotNull o.isTransient r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 2
            int r2 = r1 % r1
            java.lang.String r2 = ""
            r13 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            boolean r2 = r0.IAuthTabCallback_Parcel
            r15 = 1
            r2 = r2 ^ r15
            if (r2 == 0) goto L13
            goto L52
        L13:
            int r2 = viva.republica.toss.password.PasswordVerifyViewModel.ICustomTabsCallbackStub
            int r2 = r2 + 123
            int r3 = r2 % 128
            viva.republica.toss.password.PasswordVerifyViewModel.ICustomTabsCallbackDefault = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L27
            boolean r2 = r0.extraCallbackWithResult
            r3 = 22
            int r3 = r3 / 0
            if (r2 != 0) goto L52
            goto L2b
        L27:
            boolean r2 = r0.extraCallbackWithResult
            if (r2 != 0) goto L52
        L2b:
            boolean r2 = r0.onTransact
            if (r2 != 0) goto L52
            o.getIconPaddingLeft r2 = o.getIconPaddingLeft.IAuthTabCallback
            o.asDouble r14 = new o.asDouble
            o.isNumber r4 = o.isNumber.PASSWORD
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 510(0x1fe, float:7.15E-43)
            r17 = 0
            r3 = r14
            r13 = r19
            r1 = r14
            r14 = r16
            r15 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.onExtraCallbackWithResult(r1)
            r1 = 1
            r0.extraCallbackWithResult = r1
        L52:
            int r1 = viva.republica.toss.password.PasswordVerifyViewModel.ICustomTabsCallbackDefault
            int r1 = r1 + 15
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordVerifyViewModel.ICustomTabsCallbackStub = r2
            r2 = 2
            int r1 = r1 % r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordVerifyViewModel.onNavigationEvent(o.isTransient):void");
    }

    private final void onWarmupCompleted(deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        if (this.asInterface.isDisposed()) {
            return;
        }
        int i2 = ICustomTabsCallbackStub + 15;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.asInterface.onNavigationEvent(deserializeurinullablecollection);
            throw null;
        }
        this.asInterface.onNavigationEvent(deserializeurinullablecollection);
        int i3 = ICustomTabsCallbackStub + 109;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private final writeRaw<Boolean> asBinder() {
        int i = 2 % 2;
        writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(Boolean.valueOf(onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallback()));
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return PasswordVerifyViewModel.onExtraCallback((Boolean) obj);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = writerawOnExtraCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda2
            public final Object apply(Object obj) {
                return PasswordVerifyViewModel.onWarmupCompleted(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return PasswordVerifyViewModel.IAuthTabCallback((Boolean) obj);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult2 = writerawOnExtraCallbackWithResult.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.PasswordVerifyViewModel$$ExternalSyntheticLambda4
            public final Object apply(Object obj) {
                return PasswordVerifyViewModel.IAuthTabCallbackStub(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult2, "");
        writeRaw<Boolean> writerawIAuthTabCallback = writerawOnExtraCallbackWithResult2.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        int i2 = ICustomTabsCallbackStub + 53;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return writerawIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Boolean bool) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-1441949974, 1441949974, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{bool}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-972653899, 972653915, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{th, setDetectableSize}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Boolean onExtraCallbackWithResult(Response response) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Boolean) onNavigationEvent(344442228, -344442217, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{response}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Boolean onNavigationEvent(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Boolean) onNavigationEvent(-1079390680, 1079390694, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{function1, obj}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-1855881062, 1855881066, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{th}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    public static final /* synthetic */ Object onWarmupCompleted(PasswordVerifyViewModel passwordVerifyViewModel, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, access13800 access13800Var) {
        Object[] objArr = {passwordVerifyViewModel, graniteBrownfieldModule_closeView, Boolean.valueOf(z), access13800Var};
        return onNavigationEvent(1946401911, -1946401896, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void onWarmupCompleted(PasswordVerifyViewModel passwordVerifyViewModel, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z) throws Throwable {
        Object[] objArr = {passwordVerifyViewModel, graniteBrownfieldModule_closeView, Boolean.valueOf(z)};
        onNavigationEvent(1033010783, -1033010777, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void onExtraCallback(PasswordVerifyViewModel passwordVerifyViewModel, boolean z) throws Throwable {
        Object[] objArr = {passwordVerifyViewModel, Boolean.valueOf(z)};
        onNavigationEvent(1093229847, -1093229837, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void onNavigationEvent(PasswordVerifyViewModel passwordVerifyViewModel, Context context) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(1453954950, -1453954942, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{passwordVerifyViewModel, context}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    public static final /* synthetic */ wasLastName onExtraCallbackWithResult(PasswordVerifyViewModel passwordVerifyViewModel, Context context) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (wasLastName) onNavigationEvent(1576964768, -1576964751, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{passwordVerifyViewModel, context}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    private static final Unit asBinder(Boolean bool) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(35001910, -35001897, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{bool}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    private static final Unit onWarmupCompleted(Throwable th) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(1983957031, -1983957022, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{th}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    private static final deserializeIp extraCallbackWithResult(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (deserializeIp) onNavigationEvent(1058970025, -1058970023, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{function1, obj}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    private final writeRaw<Integer> onExtraCallback(Context context, int i) {
        Object[] objArr = {this, context, Integer.valueOf(i)};
        return (writeRaw) onNavigationEvent(-403611783, 403611786, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    public final void onWarmupCompleted(@NotNull Context context, @NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, boolean z2) throws Throwable {
        Object[] objArr = {this, context, graniteBrownfieldModule_closeView, Boolean.valueOf(z), Boolean.valueOf(z2)};
        onNavigationEvent(-2088399815, 2088399822, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    public final MutableLiveData<Boolean> asInterface() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (MutableLiveData) onNavigationEvent(14548670, -14548669, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    public final void onNavigationEvent(boolean z) throws Throwable {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onNavigationEvent(1647653205, -1647653193, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    public final void onNavigationEvent(@NotNull UTF8Decoder uTF8Decoder) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(-1471529929, 1471529934, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this, uTF8Decoder}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    static void IAuthTabCallbackDefault() {
        onActivityLayout = new char[]{32713, 32760, 32750, 32738, 32746, 32751, 32765, 32707, 32764, 32752, 32755, 32736, 32724, 32757, 32745, 32747, 32754, 32762, 32749, 32739, 32748, 32766, 32717, 32734, 32687, 32680, 32681};
        onMessageChannelReady = -1184333927;
        onPostMessage = true;
        onMinimized = true;
        onRelationshipValidationResult = new char[]{60838, 2531, 9475, 16727, 31984, 38970, 52820, 10783, 1774, 25269, 24371, 48074, 38823, 61545, 60615, 51353, 9571, 455, 32142, 22136, 45629, 44696, 35675, 59187, 50066, 15424, 6179, 29932, 60857, 2531, 9475, 16721, 31997, 38953, 46173, 60855, 2535, 9500, 16718, 31932, 38970, 46167, 54218, 53091, 60228, 1669, 8737, 24185, 30099, 37325, 36157, 43220, 50372, 57461, 8100, 15315, 22300, 29373, 28330, 35395, 41407, 56814, 63748, 5443, 12533, 11309, 18461, 26548, 33585, 48985, 55958, 63028, 4654, 2459, 9669, 16758, 31897, 39125, 46182, 54181, 53200, 60173};
        ICustomTabsCallbackStubProxy = 8098601283300952454L;
    }
}
