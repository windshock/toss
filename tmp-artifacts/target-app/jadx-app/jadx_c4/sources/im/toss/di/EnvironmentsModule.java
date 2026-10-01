package im.toss.di;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CombineContinuationsWorker;
import o.ConstraintTrackingWorker;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.IdGeneratorExternalSyntheticLambda0;
import o.QueryProductDetailsParamsProductBuilder;
import o.QueryProductDetailsResult;
import o.RawWorkInfoDao;
import o.RawWorkInfoDao_Impl;
import o.UnfetchedProductStatusCode;
import o.WorkSpecExternalSyntheticLambda0;
import o.getPricingPhaseList;
import o.getSerializedDocid;
import o.setDynamicProductToken;
import o.setProductList;
import o.setProductType;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EnvironmentsModule {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private static char[] IAuthTabCallback = {64986, 64966, 64989, 64976, 64961, 64977, 64982, 64960, 64990, 64967, 64978, 64963, 64965, 64988, 64991, 64925};
    private static char onNavigationEvent = 51245;

    @Singleton
    public final RawWorkInfoDao_Impl onExtraCallbackWithResult(@NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        QueryProductDetailsParamsProductBuilder queryProductDetailsParamsProductBuilder = new QueryProductDetailsParamsProductBuilder(constraintsSizeResolverExternalSyntheticLambda0);
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return queryProductDetailsParamsProductBuilder;
    }

    @Singleton
    @Named("appIdSuffix")
    public final String IAuthTabCallback(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNull(packageName);
        Object[] objArr = new Object[1];
        a(new char[]{0, 4, 14, '\b', '\f', 7, 7, '\n', 5, '\t', '\f', 2, 2, 11, '\r', 11, 15, 5, 13895}, (byte) (94 - KeyEvent.keyCodeFromString("")), 20 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        if (!StringsKt.startsWith$default(packageName, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
            int i2 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr2 = new Object[1];
        a(new char[]{0, 4, 14, '\b', '\f', 7, 7, '\n', 5, '\t', '\f', 2, 2, 11, '\r', 11, 15, 5, 13895}, (byte) (94 - ExpandableListView.getPackedPositionType(0L)), TextUtils.indexOf((CharSequence) "", '0') + 20, objArr2);
        String strRemovePrefix = StringsKt.removePrefix(packageName, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{13765}, (byte) (17 - KeyEvent.normalizeMetaState(0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
        String strRemovePrefix2 = StringsKt.removePrefix(strRemovePrefix, ((String) objArr3[0]).intern());
        int i6 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return strRemovePrefix2;
    }

    @Singleton
    public final RawWorkInfoDao onExtraCallbackWithResult(@NotNull getPricingPhaseList getpricingphaselist) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getpricingphaselist, "");
        setProductList setproductlist = new setProductList(getpricingphaselist);
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return setproductlist;
    }

    @Singleton
    public final IdGeneratorExternalSyntheticLambda0 onExtraCallbackWithResult() {
        int i = 2 % 2;
        setDynamicProductToken setdynamicproducttoken = new setDynamicProductToken();
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return setdynamicproducttoken;
    }

    @Singleton
    public final ConstraintTrackingWorker onWarmupCompleted(@NotNull getPricingPhaseList getpricingphaselist) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getpricingphaselist, "");
        UnfetchedProductStatusCode unfetchedProductStatusCode = new UnfetchedProductStatusCode(getpricingphaselist);
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return unfetchedProductStatusCode;
    }

    @Singleton
    public final WorkSpecExternalSyntheticLambda0 onExtraCallback() {
        int i = 2 % 2;
        QueryProductDetailsResult queryProductDetailsResult = new QueryProductDetailsResult();
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return queryProductDetailsResult;
        }
        throw null;
    }

    @Singleton
    public final CombineContinuationsWorker onExtraCallback(@NotNull getPricingPhaseList getpricingphaselist) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getpricingphaselist, "");
        getSerializedDocid getserializeddocid = new getSerializedDocid(getpricingphaselist);
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return getserializeddocid;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final zzad onExtraCallback(@NotNull Context context, @NotNull RawWorkInfoDao_Impl rawWorkInfoDao_Impl, @NotNull getPricingPhaseList getpricingphaselist, @NotNull RawWorkInfoDao rawWorkInfoDao, @NotNull IdGeneratorExternalSyntheticLambda0 idGeneratorExternalSyntheticLambda0, @NotNull ConstraintTrackingWorker constraintTrackingWorker, @NotNull WorkSpecExternalSyntheticLambda0 workSpecExternalSyntheticLambda0, @NotNull CombineContinuationsWorker combineContinuationsWorker) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(rawWorkInfoDao_Impl, "");
        Intrinsics.checkNotNullParameter(getpricingphaselist, "");
        Intrinsics.checkNotNullParameter(rawWorkInfoDao, "");
        Intrinsics.checkNotNullParameter(idGeneratorExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(constraintTrackingWorker, "");
        Intrinsics.checkNotNullParameter(workSpecExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(combineContinuationsWorker, "");
        setProductType setproducttype = new setProductType(context, rawWorkInfoDao_Impl, getpricingphaselist, rawWorkInfoDao, idGeneratorExternalSyntheticLambda0, constraintTrackingWorker, workSpecExternalSyntheticLambda0, combineContinuationsWorker);
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        return setproducttype;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 21;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0) + 26, 23139 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 26, View.resolveSizeAndState(0, 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 25 - TextUtils.indexOf((CharSequence) "", '0', 0), (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 7;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 24824), 74 - Color.blue(0), 8088 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 30 - (ViewConfiguration.getTapTimeout() >> 16), 19488 - (ViewConfiguration.getScrollBarSize() >> 8), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i9 = $11 + 117;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = $11 + 51;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                cArr4[i15] = (char) (cArr4[i15] ^ 12931);
                i15 += 94;
            } else {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                i15++;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
