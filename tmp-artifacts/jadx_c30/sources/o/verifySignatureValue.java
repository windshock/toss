package o;

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
import im.toss.core.cache.RxSharedApiCall;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.setApTextSize;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class verifySignatureValue {
    public static final verifySignatureValue IAuthTabCallback;
    private static long IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static char[] asBinder;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int[] onTransact;
    private static final String onWarmupCompleted;
    private static final byte[] $$a = {119, ISO7816.INS_LOAD_KEY_FILE, ISO7816.CLA_COMMAND_CHAINING, 123};
    private static final int $$b = CertificateHolderAuthorization.CVCA;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;

    public interface onExtraCallback {
        String onExtraCallback();

        removeAt onWarmupCompleted();
    }

    private static String $$c(byte b, int i, short s) {
        int i2 = 3 - (i * 2);
        int i3 = b * 2;
        byte[] bArr = $$a;
        int i4 = (s * 3) + 97;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i4 = (-i2) + i3;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i4;
            int i7 = i2 + 1;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i5 = i6;
            i4 = (-bArr[i7]) + i4;
            i2 = i7;
        }
    }

    static {
        IAuthTabCallbackStubProxy = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0), 18 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new int[]{2047677480, -1854082471, -476011709, 1095793186, -2124188284, 650278077, 1837898337, -1788347569}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14, objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(19 - Color.red(0), 20 - Color.blue(0), (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 62341), objArr3);
        onExtraCallback = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 39, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
        onNavigationEvent = ((String) objArr4[0]).intern();
        IAuthTabCallback = new verifySignatureValue();
        int i = access000 + 71;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ String IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strOnTransact = onTransact(function1, obj);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return strOnTransact;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        int i4 = IAuthTabCallbackDefault + 25;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    public static /* synthetic */ String onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, ArgumentsmakeNativeArray1$onExtraCallbackWithResult argumentsmakeNativeArray1$onExtraCallbackWithResult) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(iAuthTabCallback, argumentsmakeNativeArray1$onExtraCallbackWithResult);
        int i4 = asInterface + 101;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public static /* synthetic */ String onNavigationEvent(String str, ArgumentsmakeNativeArray1$onExtraCallbackWithResult argumentsmakeNativeArray1$onExtraCallbackWithResult) {
        String str2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            str2 = (String) onWarmupCompleted(-1785195152, iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{str, argumentsmakeNativeArray1$onExtraCallbackWithResult}, 1785195153);
            int i3 = 50 / 0;
        } else {
            int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback4 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            str2 = (String) onWarmupCompleted(-1785195152, iOnExtraCallback3, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback4, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{str, argumentsmakeNativeArray1$onExtraCallbackWithResult}, 1785195153);
        }
        int i4 = asInterface + 107;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = asInterface + 23;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i6);
        int i9 = (~(i | i2)) | i8;
        int i10 = (~(i2 | (~i6))) | (~((~i) | i7)) | i8;
        int i11 = i7 | i | i6;
        int i12 = i + i6 + i4 + (1050315579 * i3) + (2086215248 * i5);
        int i13 = i12 * i12;
        int i14 = (i * (-1156115713)) + 1671168000 + ((-1156115713) * i6) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i4) + ((-1303117824) * i3) + (314572800 * i5) + (431423488 * i13);
        int i15 = ((i * (-961373039)) - 1316831794) + (i6 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i4 * (-961372049)) + (i3 * 755842709) + (i5 * (-1858722640)) + (i13 * (-2040987648));
        int i16 = i14 + (i15 * i15 * 1361641472);
        return i16 != 1 ? i16 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
        BaseApiResponse baseApiResponse = (BaseApiResponse) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onnavigationevent, baseApiResponse);
        int i4 = IAuthTabCallbackDefault + 63;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ String onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(IAuthTabCallback iAuthTabCallback, BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            return (Unit) onWarmupCompleted(1315407085, iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{iAuthTabCallback, baseApiResponse}, -1315407083);
        }
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback4 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        throw null;
    }

    private verifySignatureValue() {
    }

    static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int[] onExtraCallbackWithResult;
        public static final onExtraCallbackWithResult onNavigationEvent;
        private static final Map<onExtraCallback, RxSharedApiCall<ArgumentsmakeNativeArray1$onExtraCallbackWithResult>> onWarmupCompleted;

        private onExtraCallbackWithResult() {
        }

        static {
            onNavigationEvent();
            onNavigationEvent = new onExtraCallbackWithResult();
            onWarmupCompleted = new LinkedHashMap();
            int i = onExtraCallback + 107;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 13 / 0;
            }
        }

        public final RxSharedApiCall<ArgumentsmakeNativeArray1$onExtraCallbackWithResult> onExtraCallbackWithResult(@NotNull onExtraCallback onextracallback) {
            RxSharedApiCall<ArgumentsmakeNativeArray1$onExtraCallbackWithResult> rxSharedApiCallOnWarmupCompleted;
            synchronized (this) {
                Intrinsics.checkNotNullParameter(onextracallback, BuildConfig.FLAVOR);
                Map<onExtraCallback, RxSharedApiCall<ArgumentsmakeNativeArray1$onExtraCallbackWithResult>> map = onWarmupCompleted;
                rxSharedApiCallOnWarmupCompleted = map.get(onextracallback);
                if (rxSharedApiCallOnWarmupCompleted == null) {
                    removeAt removeatOnWarmupCompleted = onextracallback.onWarmupCompleted();
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 24734 - View.getDefaultSize(0, 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
                    }
                    Object obj = ((Field) objOnExtraCallback).get(null);
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 29426), View.resolveSize(0, 0) + 22, Color.alpha(0) + 24734, -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
                        }
                        writeRaw writerawOnWarmupCompleted = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).onWarmupCompleted(removeatOnWarmupCompleted);
                        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, BuildConfig.FLAVOR);
                        writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new C0005onExtraCallbackWithResult(mapConverterOnExtraCallback, null));
                        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
                        RxSharedApiCall.Companion companion = RxSharedApiCall.Companion;
                        String strOnExtraCallback = onextracallback.onExtraCallback();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr = new Object[1];
                        a(new int[]{529441074, 311889043, -1535720535, 110418124}, AndroidCharacter.getMirror('0') - ')', objArr);
                        sb.append(((String) objArr[0]).intern());
                        sb.append(strOnExtraCallback);
                        rxSharedApiCallOnWarmupCompleted = RxSharedApiCall.Companion.onWarmupCompleted(companion, sb.toString(), writerawIAuthTabCallback, (Object) null, (setLogBuffers) null, 12, (Object) null);
                        map.put(onextracallback, rxSharedApiCallOnWarmupCompleted);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            return rxSharedApiCallOnWarmupCompleted;
        }

        /* renamed from: o.verifySignatureValue$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0005onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
            final /* synthetic */ MapConverter IAuthTabCallback;
            final /* synthetic */ MapConverter onExtraCallbackWithResult;

            public C0005onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
                this.onExtraCallbackWithResult = mapConverter;
                this.IAuthTabCallback = mapConverter2;
            }

            public final deserializeIp<ArgumentsmakeNativeArray1$onExtraCallbackWithResult> apply(writeRaw<BaseApiResponse<ArgumentsmakeNativeArray1$onExtraCallbackWithResult>> writeraw) {
                Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
                writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(new Function1<BaseApiResponse<ArgumentsmakeNativeArray1$onExtraCallbackWithResult>, deserializeIp<? extends ArgumentsmakeNativeArray1$onExtraCallbackWithResult>>() { // from class: o.verifySignatureValue.onExtraCallbackWithResult.onExtraCallbackWithResult.5
                    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                    public final deserializeIp<? extends ArgumentsmakeNativeArray1$onExtraCallbackWithResult> invoke(BaseApiResponse<ArgumentsmakeNativeArray1$onExtraCallbackWithResult> baseApiResponse) throws IllegalAccessException, InstantiationException {
                        Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                            Object objOnTransact = baseApiResponse.onTransact();
                            if (objOnTransact == null) {
                                objOnTransact = ArgumentsmakeNativeArray1$onExtraCallbackWithResult.class.newInstance();
                            }
                            return writeRaw.onExtraCallback(objOnTransact);
                        }
                        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                        if (apiErrorExtraCallbackWithResult == null) {
                            apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        }
                        return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                    }
                }) { // from class: o.UtilsKtExternalSyntheticLambda17.setContentView
                    private final /* synthetic */ Function1 onExtraCallback;

                    public setContentView(Function1 function1) {
                        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
                        this.onExtraCallback = function1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        return this.onExtraCallback.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
                MapConverter mapConverter = this.onExtraCallbackWithResult;
                if (mapConverter != null) {
                    writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                    Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
                }
                MapConverter mapConverter2 = this.IAuthTabCallback;
                if (mapConverter2 == null) {
                    return writerawOnExtraCallbackWithResult;
                }
                writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
                return writerawIAuthTabCallback;
            }
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onExtraCallbackWithResult;
            int i4 = -1469660336;
            long j = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i5 = 0;
                while (i5 < length2) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 71, 8849 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i5++;
                        int i6 = $10 + 59;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        i4 = -1469660336;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = onExtraCallbackWithResult;
            if (iArr6 != null) {
                int i8 = $10 + 43;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    int i9 = $11 + 57;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr6[i2])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 71 - ImageFormat.getBitsPerPixel(0), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr2[i2] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        try {
                            Object[] objArr4 = {Integer.valueOf(iArr6[i2])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 73, ExpandableListView.getPackedPositionType(0L) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr2[i2] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    i2++;
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                int i10 = $10 + 101;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 % 2;
                }
                for (int i12 = 0; i12 < 16; i12++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i12];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22251), (ViewConfiguration.getScrollBarSize() >> 8) + 39, (ViewConfiguration.getWindowTouchSlop() >> 8) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                }
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 78 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i16 = $11 + 87;
                $10 = i16 % 128;
                int i17 = i16 % 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        static void onNavigationEvent() {
            onExtraCallbackWithResult = new int[]{1574122369, 193825813, -717364269, 2094439067, -694820159, 2140098084, -371890135, 417761090, 132492633, 1168421441, 1071437453, -1304959372, 318502761, 2101813528, -2103188346, -1336809093, -1841825240, 1810775643};
        }
    }

    public static final class onNavigationEvent implements onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int[] onExtraCallbackWithResult = {414000991, 1305287941, -372559125, -1603424227, 1207838412, 906811500, -242239788, -1922775553, -885031689, 376371882, -149442196, 1558665472, 1540274635, 1362446253, -1383384878, -681946203, -507032298, 1911923744};
        private static int onWarmupCompleted = 1;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, ((onNavigationEvent) obj).onNavigationEvent)) {
                return true;
            }
            int i3 = IAuthTabCallback + 63;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = onWarmupCompleted + 87;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.onNavigationEvent;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{1865809201, -1543719280, 1869950424, -1981316938, -636641502, -200035868, 555567522, 1785753791, 789562657, -570344255, 1805533425, 1451935655, 1891927301, 768553699}, 24 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(new int[]{862393299, -1764898856}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = IAuthTabCallback + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.verifySignatureValue.onExtraCallback
        public removeAt onWarmupCompleted() {
            int i = 2 % 2;
            removeAt removeat = new removeAt((ArrayList) null, 1, (DefaultConstructorMarker) null);
            removeat.onWarmupCompleted(this.onNavigationEvent);
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return removeat;
            }
            throw null;
        }

        @Override // o.verifySignatureValue.onExtraCallback
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 1;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onExtraCallbackWithResult;
            int i3 = -1469660336;
            int i4 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i5 = 0;
                while (i5 < length2) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1), 72 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
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
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = onExtraCallbackWithResult;
            if (iArr6 != null) {
                int i6 = $11 + 59;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                }
                int i7 = 0;
                while (i7 < length) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr6[i7]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, i4, i4), 72 - Color.blue(i4), 8848 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                    i4 = 0;
                }
                iArr6 = iArr2;
            }
            int i8 = i4;
            System.arraycopy(iArr6, i8, iArr5, i8, length3);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i8;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i8] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                int i9 = 0;
                for (int i10 = 16; i9 < i10; i10 = 16) {
                    int i11 = $11 + 123;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i9];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 22252), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 39, 10301 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i9++;
                }
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 78 - (ViewConfiguration.getEdgeSlop() >> 16), 7397 - ExpandableListView.getPackedPositionChild(0L), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i8 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public static final class IAuthTabCallback implements onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static long onExtraCallback = 5779324513239682073L;
        private static int onNavigationEvent;
        private final verifySign onExtraCallbackWithResult;
        private final checkNavigationBarBySystemProperties onWarmupCompleted;

        public static final /* synthetic */ class onExtraCallbackWithResult {
            public static final /* synthetic */ int[] onExtraCallback;

            static {
                int[] iArr = new int[verifySign.values().length];
                try {
                    iArr[verifySign.ID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[verifySign.CERT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                onExtraCallback = iArr;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if ((r8 instanceof o.verifySignatureValue.IAuthTabCallback) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            r1 = r1 + 27;
            o.verifySignatureValue.IAuthTabCallback.onNavigationEvent = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        
            if ((r1 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        
            r8 = (o.verifySignatureValue.IAuthTabCallback) r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            if (r7.onExtraCallbackWithResult == r8.onExtraCallbackWithResult) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        
            r3 = r3 + 47;
            o.verifySignatureValue.IAuthTabCallback.IAuthTabCallback = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        
            if ((r3 % 2) == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r7.onWarmupCompleted, r8.onWarmupCompleted) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r7 == r8) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r7 == r8) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 49;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            if (i3 % 2 != 0) {
                int i5 = 69 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            IAuthTabCallback = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (this.onExtraCallbackWithResult.hashCode() - 45) % this.onWarmupCompleted.hashCode() : (this.onExtraCallbackWithResult.hashCode() * 31) + this.onWarmupCompleted.hashCode();
            int i3 = IAuthTabCallback + 81;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            verifySign verifysign = this.onExtraCallbackWithResult;
            checkNavigationBarBySystemProperties checknavigationbarbysystemproperties = this.onWarmupCompleted;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{17842, 17892, 59402, 24442, 2467, 26599, 62170, 39305, 55169, 31505, 17297, 54909, 64893, 34782, 12063, 2605, 53547, 42082, 2733, 28119, 13447, 49179, 54961, 16737, 2162, 60558}, Color.red(0) + 1, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(verifysign);
            Object[] objArr2 = new Object[1];
            a(new char[]{64328, 64356, 44179, 7078, 57131, 45411, 23089, 10098, 32623, 16273, 38248}, 1 - View.resolveSize(0, 0), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(checknavigationbarbysystemproperties);
            Object[] objArr3 = new Object[1];
            a(new char[]{37828, 37869, 21381, 34790, 65015}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
            sb.append(((String) objArr3[0]).intern());
            String string = sb.toString();
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $11 + 113;
            $10 = i3 % 128;
            while (true) {
                int i4 = i3 % 2;
                if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                    objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                    return;
                }
                int i5 = $11 + 113;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45812), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 83, 21233 - View.MeasureSpec.getSize(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14233 - AndroidCharacter.getMirror('0')), 19 - View.getDefaultSize(0, 0), 8808 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    i3 = $10 + 121;
                    $11 = i3 % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // o.verifySignatureValue.onExtraCallback
        public String onExtraCallback() throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult.onExtraCallback[this.onExtraCallbackWithResult.ordinal()];
            if (i2 == 1) {
                String strExtraCallbackWithResult = this.onWarmupCompleted.extraCallbackWithResult();
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a(new char[]{27255, 27162, 25438, 54306, 24917, 3852, 44164, 46666, 35272, 61529, 11084, 34827, 53942, 3206, 18404, 21578, 65218, 12075}, 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(strExtraCallbackWithResult);
                return sb.toString();
            }
            int i3 = IAuthTabCallback + 79;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0 ? i2 != 2 : i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (!getLastTrimMemoryLevel.Companion.onNavigationEvent().onExtraCallbackWithResult()) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                int iIAuthTabCallbackStub = this.onWarmupCompleted.IAuthTabCallbackStub();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a(new char[]{48329, 48299, 45400, 1580, 22721, 13957, 25639, 24798, 16755, 8798, 4827, 16517, 1089, 57055, 32307}, 1 - Color.blue(0), objArr2);
                sb2.append(((String) objArr2[0]).intern());
                sb2.append(iIAuthTabCallbackStub);
                Object[] objArr3 = new Object[1];
                a(new char[]{56088, 56149, 15361, 35709, 3928, 24833, 56641, 1829, 63501, 44806, 17729, 63950, 25561, 21465, 10729, 9615, 20393, 28785, 3088, 16983, 43567, 5121, 53328}, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 1, objArr3);
                convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr3[0]).intern(), new ReactFeatureFlags(sb2.toString(), null, 2, null));
                Object[] objArr4 = new Object[1];
                a(new char[]{704, 685, 58756, 21240, 14262, 23023, 36367, 57085, 43843, 30339, 32175, 43648, 47617, 35420, 4359, 30401, 38527, 43504, 13538, 4364}, (Process.myPid() >> 22) + 1, objArr4);
                return ((String) objArr4[0]).intern();
            }
            int i4 = onNavigationEvent + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!SafeBag.onExtraCallbackWithResult(this.onWarmupCompleted)) {
                Object[] objArr5 = new Object[1];
                a(new char[]{704, 685, 58756, 21240, 14262, 23023, 36367, 57085, 43843, 30339, 32175, 43648, 47617, 35420, 4359, 30401, 38527, 43504, 13538, 4364}, 1 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr5);
                return ((String) objArr5[0]).intern();
            }
            String strExtraCallbackWithResult2 = this.onWarmupCompleted.extraCallbackWithResult();
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(new char[]{704, 685, 58756, 21240, 14262, 23023, 36367, 57085, 43843, 30339, 32175, 43648, 47617, 35420, 4359, 30401, 38527, 43504, 13538, 4364}, 1 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(strExtraCallbackWithResult2);
            String string = sb3.toString();
            int i6 = onNavigationEvent + 83;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return string;
            }
            throw null;
        }

        @Override // o.verifySignatureValue.onExtraCallback
        public removeAt onWarmupCompleted() throws Throwable {
            Object obj;
            int i = 2 % 2;
            Object obj2 = null;
            removeAt removeat = new removeAt((ArrayList) null, 1, (DefaultConstructorMarker) null);
            removeat.onWarmupCompleted(onExtraCallback());
            Object[] objArr = new Object[1];
            a(new char[]{27858, 27839, 28497, 55341, 28459, 370, 40420, 45295, 47272, 64598, 9522, 47467, 54291, 137, 18842, 25898, 63597, 8997, 27775, 743, 7662, 18261, 45090, 11859}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            removeat.onWarmupCompleted(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a(new char[]{704, 685, 58756, 21240, 14262, 23023, 36367, 57085, 43843, 30339, 32175, 43648, 47617, 35420, 4359, 30401, 38527, 43504, 13538, 4364}, 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
            if (!removeat.onNavigationEvent(((String) objArr2[0]).intern())) {
                int i2 = onNavigationEvent + 17;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{704, 685, 58756, 21240, 14262, 23023, 36367, 57085, 43843, 30339, 32175, 43648, 47617, 35420, 4359, 30401, 38527, 43504, 13538, 4364}, -(ExpandableListView.getPackedPositionForChild(0, 1) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 1) == 1L ? 0 : -1)), objArr3);
                    obj = objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    a(new char[]{704, 685, 58756, 21240, 14262, 23023, 36367, 57085, 43843, 30339, 32175, 43648, 47617, 35420, 4359, 30401, 38527, 43504, 13538, 4364}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
                    obj = objArr4[0];
                }
                removeat.onWarmupCompleted(((String) obj).intern());
            }
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return removeat;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 39;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(asBinder[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - ((byte) KeyEvent.getModifierMetaStateMask())), 17 - View.combineMeasuredStates(0, 0), 10973 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - View.getDefaultSize(0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTouchSlop() >> 8)), 44 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 3;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 49123), 44 - KeyEvent.getDeadChar(0, 0), 1494 - (ViewConfiguration.getTouchSlop() >> 8), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static final String onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
            return (String) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
        throw null;
    }

    private static final String IAuthTabCallback(IAuthTabCallback iAuthTabCallback, ArgumentsmakeNativeArray1$onExtraCallbackWithResult argumentsmakeNativeArray1$onExtraCallbackWithResult) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(argumentsmakeNativeArray1$onExtraCallbackWithResult, BuildConfig.FLAVOR);
        String strOnNavigationEvent = argumentsmakeNativeArray1$onExtraCallbackWithResult.onNavigationEvent(iAuthTabCallback.onExtraCallback());
        if (strOnNavigationEvent != null && strOnNavigationEvent.length() != 0) {
            return strOnNavigationEvent;
        }
        Object[] objArr = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 40, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, (char) View.resolveSizeAndState(0, 0, 0), objArr);
        String strOnNavigationEvent2 = argumentsmakeNativeArray1$onExtraCallbackWithResult.onNavigationEvent(((String) objArr[0]).intern());
        if (strOnNavigationEvent2 != null) {
            int i2 = IAuthTabCallbackDefault + 89;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (strOnNavigationEvent2.length() != 0) {
                return strOnNavigationEvent2;
            }
        }
        Object[] objArr2 = new Object[1];
        a(18 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 19 - ImageFormat.getBitsPerPixel(0), (char) (62341 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr2);
        String strOnNavigationEvent3 = argumentsmakeNativeArray1$onExtraCallbackWithResult.onNavigationEvent(((String) objArr2[0]).intern());
        if (strOnNavigationEvent3 != null) {
            int i4 = asInterface + 53;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (strOnNavigationEvent3.length() != 0) {
                int i6 = asInterface + 93;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return strOnNavigationEvent3;
                }
                throw null;
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr3 = {iAuthTabCallback.onExtraCallback()};
        Object[] objArr4 = new Object[1];
        a(54 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), Color.alpha(0) + 12, (char) View.MeasureSpec.getMode(0), objArr4);
        String str = String.format(((String) objArr4[0]).intern(), Arrays.copyOf(objArr3, 1));
        Intrinsics.checkNotNullExpressionValue(str, BuildConfig.FLAVOR);
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr5 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr5);
        convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr5[0]).intern(), new DefaultReactHostDelegateExternalSyntheticLambda0(str, null, 2, null));
        return BuildConfig.FLAVOR;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 13;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
        BaseApiResponse baseApiResponse = (BaseApiResponse) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                int i3 = IAuthTabCallbackDefault + 123;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                RxSharedApiCall<ArgumentsmakeNativeArray1$onExtraCallbackWithResult> rxSharedApiCallOnExtraCallbackWithResult = onExtraCallbackWithResult.onNavigationEvent.onExtraCallbackWithResult(iAuthTabCallback);
                Object[] objArr2 = new Object[1];
                a(67 - (ViewConfiguration.getTouchSlop() >> 8), 8 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (37544 - Color.argb(0, 0, 0, 0)), objArr2);
                Object[] objArr3 = {rxSharedApiCallOnExtraCallbackWithResult, ((String) objArr2[0]).intern()};
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 237696428, -237696426, objArr3, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            }
            return Unit.INSTANCE;
        }
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback4 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        ((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback3, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback4)).booleanValue();
        throw null;
    }

    private static final String onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
        String str = (String) function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onTransact;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 72 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onTransact;
        if (iArr6 != null) {
            int i8 = $10 + 1;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr6[i3]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(i6), 72 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Gravity.getAbsoluteGravity(i6, i6) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i3++;
                i6 = 0;
            }
            int i9 = $10 + 37;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            iArr6 = iArr2;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                int i13 = $10 + 29;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i11];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 39, Color.blue(0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i11++;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - Color.argb(0, 0, 0, 0)), 78 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.alpha(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i18 = $10 + 15;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        ArgumentsmakeNativeArray1$onExtraCallbackWithResult argumentsmakeNativeArray1$onExtraCallbackWithResult = (ArgumentsmakeNativeArray1$onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(argumentsmakeNativeArray1$onExtraCallbackWithResult, BuildConfig.FLAVOR);
        String strOnNavigationEvent = argumentsmakeNativeArray1$onExtraCallbackWithResult.onNavigationEvent(str);
        if (strOnNavigationEvent != null) {
            return strOnNavigationEvent;
        }
        int i4 = asInterface + 33;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return BuildConfig.FLAVOR;
        }
        int i5 = 73 / 0;
        return BuildConfig.FLAVOR;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 115;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(onNavigationEvent onnavigationevent, BaseApiResponse baseApiResponse) throws Throwable {
        int i = 2 % 2;
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
            int i2 = IAuthTabCallbackDefault + 95;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            RxSharedApiCall<ArgumentsmakeNativeArray1$onExtraCallbackWithResult> rxSharedApiCallOnExtraCallbackWithResult = onExtraCallbackWithResult.onNavigationEvent.onExtraCallbackWithResult(onnavigationevent);
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 67, 6 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), (char) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 37544), objArr);
            Object[] objArr2 = {rxSharedApiCallOnExtraCallbackWithResult, ((String) objArr[0]).intern()};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 237696428, -237696426, objArr2, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            int i4 = asInterface + 125;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onNavigationEvent onnavigationevent, BaseApiResponse baseApiResponse) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (Unit) onWarmupCompleted(-1648822063, iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{onnavigationevent, baseApiResponse}, 1648822063);
    }

    private static final String onWarmupCompleted(String str, ArgumentsmakeNativeArray1$onExtraCallbackWithResult argumentsmakeNativeArray1$onExtraCallbackWithResult) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (String) onWarmupCompleted(-1785195152, iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{str, argumentsmakeNativeArray1$onExtraCallbackWithResult}, 1785195153);
    }

    private static final Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, BaseApiResponse baseApiResponse) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (Unit) onWarmupCompleted(1315407085, iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{iAuthTabCallback, baseApiResponse}, -1315407083);
    }

    static void onWarmupCompleted() {
        asBinder = new char[]{60825, 20714, 38665, 54690, 6369, 24329, 40377, 49381, 1797, 17854, 35025, 53004, 3469, 28894, 46968, 62892, 14531, 32630, 48568, 7740, 41839, 25740, 9767, 60260, 44172, 28220, 13152, 62592, 46651, 31572, 15497, 65030, 33631, 17633, 1596, 52045, 36087, 20028, 4944, 60857, 20714, 38665, 54690, 6369, 24329, 40377, 49381, 1797, 17854, 35025, 53004, 3459, 28890, 46948, 62905, 60839, 20710, 38664, 54695, 6381, 24341, 40341, 49360, 1813, 17894, 34967, 53018, 32521, 49755, 1462, 18200, 35412, 52650, 3858};
        IAuthTabCallbackStub = -6691392323601477501L;
        onTransact = new int[]{956452600, 627622023, 1777890025, 11836574, 591500195, 866221951, -2028209217, -547660942, 1692455139, 787969104, 384718569, -352699426, -239389455, 298216847, 1208441213, 446319622, -1575964523, 1738342535};
    }
}
