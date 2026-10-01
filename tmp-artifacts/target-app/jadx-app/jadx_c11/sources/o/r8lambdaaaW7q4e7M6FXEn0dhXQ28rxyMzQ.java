package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.ContextCompat;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tds.R;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listfooter.TdsListFooterV1View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GraphicDeviceInfo;
import o.QuirksExternalSyntheticBackport0;
import o.lExternalSyntheticLambda3;
import o.r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int asBinder = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[lExternalSyntheticLambda3.onExtraCallback.values().length];
            try {
                iArr[lExternalSyntheticLambda3.onExtraCallback.BLUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lExternalSyntheticLambda3.onExtraCallback.GREY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[lExternalSyntheticLambda3.IAuthTabCallback.values().length];
            try {
                iArr2[lExternalSyntheticLambda3.IAuthTabCallback.ARROW_DOWN.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[lExternalSyntheticLambda3.IAuthTabCallback.ARROW_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[lExternalSyntheticLambda3.IAuthTabCallback.ARROW_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[lExternalSyntheticLambda3.IAuthTabCallback.PLUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            onNavigationEvent = iArr2;
            int[] iArr3 = new int[lExternalSyntheticLambda3.onWarmupCompleted.values().length];
            try {
                iArr3[lExternalSyntheticLambda3.onWarmupCompleted.LEFT24.ordinal()] = 1;
                int i2 = asBinder + 39;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[lExternalSyntheticLambda3.onWarmupCompleted.FULL.ordinal()] = 2;
                int i4 = asBinder + 99;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            onExtraCallback = iArr3;
            int[] iArr4 = new int[lExternalSyntheticLambda3.onExtraCallbackWithResult.values().length];
            try {
                iArr4[lExternalSyntheticLambda3.onExtraCallbackWithResult.TYPE1.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[lExternalSyntheticLambda3.onExtraCallbackWithResult.TYPE2.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[lExternalSyntheticLambda3.onExtraCallbackWithResult.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            onExtraCallbackWithResult = iArr4;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i8 | i));
        int i10 = ~((~i) | i2 | i4);
        int i11 = i9 | i10;
        int i12 = (~(i | i8 | i2)) | i10;
        int i13 = i2 | i4;
        int i14 = i2 + i4 + i3 + ((-1865910757) * i5) + ((-1665280692) * i6);
        int i15 = i14 * i14;
        int i16 = ((i2 * (-906343980)) - 215482368) + ((-906343980) * i4) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i3) + ((-1540882432) * i5) + ((-912261120) * i6) + (1566179328 * i15);
        int i17 = (i2 * (-52584228)) + 761582770 + (i4 * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i3 * (-52583813)) + (i5 * (-195242759)) + (i6 * 1657508740) + (i15 * (-834797568));
        return i16 + ((i17 * i17) * 1251344384) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ TdsListFooterV1View onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsListFooterV1View tdsListFooterV1ViewOnWarmupCompleted = onWarmupCompleted(context);
        int i4 = onExtraCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return tdsListFooterV1ViewOnWarmupCompleted;
    }

    private static final Unit onExtraCallbackWithResult(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, Function0 function0, String str2, GraphicDeviceInfo graphicDeviceInfo, long j2, boolean z, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, boolean z2, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2, lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult, Drawable drawable, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 83;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        IAuthTabCallback(str, quirksExternalSyntheticBackport0, j, function0, str2, graphicDeviceInfo, j2, z, onwarmupcompleted, z2, onwarmupcompleted2, onextracallbackwithresult, drawable, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 101;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, String str2, lExternalSyntheticLambda3.onExtraCallback onextracallback, GraphicDeviceInfo graphicDeviceInfo, long j, boolean z, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, boolean z2, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2, lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult, boolean z3, lExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 61;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            onExtraCallback(str, quirksExternalSyntheticBackport0, function0, str2, onextracallback, graphicDeviceInfo, j, z, onwarmupcompleted, z2, onwarmupcompleted2, onextracallbackwithresult, z3, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        } else {
            onExtraCallback(str, quirksExternalSyntheticBackport0, function0, str2, onextracallback, graphicDeviceInfo, j, z, onwarmupcompleted, z2, onwarmupcompleted2, onextracallbackwithresult, z3, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        String str2 = (String) objArr[3];
        lExternalSyntheticLambda3.onExtraCallback onextracallback = (lExternalSyntheticLambda3.onExtraCallback) objArr[4];
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted = (lExternalSyntheticLambda3.onWarmupCompleted) objArr[8];
        boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
        lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2 = (lExternalSyntheticLambda3.onWarmupCompleted) objArr[10];
        lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult = (lExternalSyntheticLambda3.onExtraCallbackWithResult) objArr[11];
        boolean zBooleanValue3 = ((Boolean) objArr[12]).booleanValue();
        lExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback = (lExternalSyntheticLambda3.IAuthTabCallback) objArr[13];
        int iIntValue = ((Number) objArr[14]).intValue();
        int iIntValue2 = ((Number) objArr[15]).intValue();
        int iIntValue3 = ((Number) objArr[16]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
        int iIntValue4 = ((Number) objArr[18]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(str, quirksExternalSyntheticBackport0, function0, str2, onextracallback, graphicDeviceInfo, jLongValue, zBooleanValue, onwarmupcompleted, zBooleanValue2, onwarmupcompleted2, onextracallbackwithresult, zBooleanValue3, iAuthTabCallback, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, quirksExternalSyntheticBackport0, function0, str2, onextracallback, graphicDeviceInfo, jLongValue, zBooleanValue, onwarmupcompleted, zBooleanValue2, onwarmupcompleted2, onextracallbackwithresult, zBooleanValue3, iAuthTabCallback, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i3 = onExtraCallback + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onNavigationEvent(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function0, view);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = onExtraCallback + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, long j, response responseVar, boolean z, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, boolean z2, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2, lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult, String str2, long j2, Drawable drawable, Function0 function0, long j3, TdsListFooterV1View tdsListFooterV1View) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, j, responseVar, z, onwarmupcompleted, z2, onwarmupcompleted2, onextracallbackwithresult, str2, j2, drawable, function0, j3, tdsListFooterV1View);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, Function0 function0, String str2, GraphicDeviceInfo graphicDeviceInfo, long j2, boolean z, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, boolean z2, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2, lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult, Drawable drawable, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 113;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, quirksExternalSyntheticBackport0, j, function0, str2, graphicDeviceInfo, j2, z, onwarmupcompleted, z2, onwarmupcompleted2, onextracallbackwithresult, drawable, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallbackWithResult + 13;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, @Nullable String str2, @Nullable lExternalSyntheticLambda3.onExtraCallback onextracallback, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j, boolean z, @Nullable lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, boolean z2, @Nullable lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2, @Nullable lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult, boolean z3, @Nullable lExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final Function0<Unit> function02;
        final String str3;
        final lExternalSyntheticLambda3.onExtraCallback onextracallback2;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final long j2;
        final boolean z4;
        final lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted3;
        final boolean z5;
        final lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted4;
        final lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult2;
        final boolean z6;
        final lExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i23;
        boolean z7;
        lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted5;
        boolean z8;
        long jLongValue;
        Drawable drawable;
        int i24;
        int i25 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1257724300);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i26 = i3 & 2;
        if (i26 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                        int i27 = onExtraCallbackWithResult + 81;
                        onExtraCallback = i27 % 128;
                        int i28 = i27 % 2;
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                int i29 = 1024;
                if (i7 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        int i30 = onExtraCallback + 31;
                        onExtraCallbackWithResult = i30 % 128;
                        int i31 = i30 % 2;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 2048 : 1024;
                    }
                    i8 = i3 & 16;
                    if (i8 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback == null ? -1 : onextracallback.ordinal()) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        int i32 = onExtraCallback + 21;
                        onExtraCallbackWithResult = i32 % 128;
                        int i33 = i32 % 2;
                        i4 |= 196608;
                    } else {
                        if ((i & 196608) == 0) {
                            int i34 = onExtraCallbackWithResult + 111;
                            onExtraCallback = i34 % 128;
                            int i35 = i34 % 2;
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 131072 : 65536;
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 1048576 : 524288;
                        }
                        i11 = i3 & 128;
                        if (i11 != 0) {
                            i4 |= 12582912;
                        } else {
                            if ((12582912 & i) == 0) {
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 8388608 : 4194304;
                            }
                            i12 = i3 & 256;
                            if (i12 == 0) {
                                i4 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 67108864 : 33554432;
                            }
                            i13 = i3 & 512;
                            if (i13 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 536870912 : 268435456;
                            }
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i15 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i15 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted2 == null ? -1 : onwarmupcompleted2.ordinal()) ? 4 : 2);
                            } else {
                                i15 = i2;
                            }
                            i16 = i3 & 2048;
                            if (i16 == 0) {
                                i15 |= 48;
                                int i36 = onExtraCallback + 41;
                                i17 = i16;
                                onExtraCallbackWithResult = i36 % 128;
                                int i37 = i36 % 2;
                            } else {
                                i17 = i16;
                                if ((i2 & 48) == 0) {
                                    i18 = i15 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 32 : 16);
                                }
                                i19 = i3 & 4096;
                                if (i19 == 0) {
                                    i20 = i19;
                                    if ((i2 & 384) == 0) {
                                        i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 256 : 128;
                                    }
                                    i21 = i3 & 8192;
                                    if (i21 == 0) {
                                        int i38 = onExtraCallbackWithResult + 21;
                                        i22 = i21;
                                        onExtraCallback = i38 % 128;
                                        int i39 = i38 % 2;
                                        i18 |= 3072;
                                    } else {
                                        i22 = i21;
                                        if ((i2 & 3072) == 0) {
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback != null ? iAuthTabCallback.ordinal() : -1)) {
                                                int i40 = onExtraCallback + 55;
                                                onExtraCallbackWithResult = i40 % 128;
                                                int i41 = i40 % 2;
                                                i29 = 2048;
                                            }
                                            i18 |= i29;
                                        }
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                        function02 = function0;
                                        str3 = str2;
                                        onextracallback2 = onextracallback;
                                        graphicDeviceInfo2 = graphicDeviceInfo;
                                        j2 = j;
                                        z4 = z;
                                        onwarmupcompleted3 = onwarmupcompleted;
                                        z5 = z2;
                                        onwarmupcompleted4 = onwarmupcompleted2;
                                        onextracallbackwithresult2 = onextracallbackwithresult;
                                        z6 = z3;
                                        iAuthTabCallback2 = iAuthTabCallback;
                                    } else {
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i26 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                        Object obj = null;
                                        Function0<Unit> function03 = i5 != 0 ? null : function0;
                                        String str4 = i7 != 0 ? null : str2;
                                        lExternalSyntheticLambda3.onExtraCallback onextracallback3 = i8 != 0 ? lExternalSyntheticLambda3.onExtraCallback.GREY : onextracallback;
                                        GraphicDeviceInfo graphicDeviceInfo3 = i9 != 0 ? null : graphicDeviceInfo;
                                        long jOnNavigationEvent = i10 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j;
                                        boolean z9 = i11 != 0 ? false : z;
                                        lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted6 = i12 != 0 ? lExternalSyntheticLambda3.onWarmupCompleted.LEFT24 : onwarmupcompleted;
                                        if (i13 != 0) {
                                            int i42 = onExtraCallback + 47;
                                            onExtraCallbackWithResult = i42 % 128;
                                            i23 = 2;
                                            int i43 = i42 % 2;
                                            z7 = false;
                                        } else {
                                            i23 = 2;
                                            z7 = z2;
                                        }
                                        if (i14 != 0) {
                                            int i44 = onExtraCallback + 49;
                                            onExtraCallbackWithResult = i44 % 128;
                                            if (i44 % i23 == 0) {
                                                lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted7 = lExternalSyntheticLambda3.onWarmupCompleted.LEFT24;
                                                obj.hashCode();
                                                throw null;
                                            }
                                            onwarmupcompleted5 = lExternalSyntheticLambda3.onWarmupCompleted.LEFT24;
                                        } else {
                                            onwarmupcompleted5 = onwarmupcompleted2;
                                        }
                                        lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult3 = i17 != 0 ? lExternalSyntheticLambda3.onExtraCallbackWithResult.TYPE1 : onextracallbackwithresult;
                                        if (i20 != 0) {
                                            int i45 = onExtraCallback + 5;
                                            onExtraCallbackWithResult = i45 % 128;
                                            int i46 = i45 % 2;
                                            z8 = false;
                                        } else {
                                            z8 = z3;
                                        }
                                        lExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback3 = i22 != 0 ? lExternalSyntheticLambda3.IAuthTabCallback.ARROW_RIGHT : iAuthTabCallback;
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1257724300, i4, i18, "im.toss.tds.compose.compat.component.compound.listfooter.TdsListFooterV1 (TdsListFooterV1.kt:67)");
                                        }
                                        int i47 = onNavigationEvent.IAuthTabCallback[onextracallback3.ordinal()];
                                        if (i47 == 1) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1787211811);
                                            jLongValue = ((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -320693169, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 320693189, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        } else {
                                            if (i47 != 2) {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1787214387);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1787209344);
                                            jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).RatingCompat1();
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                        long j3 = jLongValue;
                                        if (z8) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(431377516);
                                            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                                            int i48 = onNavigationEvent.onNavigationEvent[iAuthTabCallback3.ordinal()];
                                            if (i48 == 1) {
                                                i24 = R.drawable.icn_arrow_downwards;
                                            } else if (i48 == 2) {
                                                i24 = R.drawable.icn_arrow_rightwards;
                                            } else if (i48 == 3) {
                                                i24 = R.drawable.icn_arrow_upwards;
                                            } else {
                                                if (i48 != 4) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                i24 = R.drawable.icon_plus_small;
                                            }
                                            Drawable drawable2 = ContextCompat.getDrawable(context, i24);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            drawable = drawable2;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(431847538);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            drawable = null;
                                        }
                                        int i49 = i4 << 3;
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        IAuthTabCallback(str, quirksExternalSyntheticBackport03, j3, function03, str4, graphicDeviceInfo3, jOnNavigationEvent, z9, onwarmupcompleted6, z7, onwarmupcompleted5, onextracallbackwithresult3, drawable, cameraCaptureResultEmptyCameraCaptureResult2, (i49 & 57344) | (i4 & 126) | (i49 & 7168) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (1879048192 & i4), i18 & 126, 0);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                        function02 = function03;
                                        str3 = str4;
                                        onextracallback2 = onextracallback3;
                                        onextracallbackwithresult2 = onextracallbackwithresult3;
                                        graphicDeviceInfo2 = graphicDeviceInfo3;
                                        j2 = jOnNavigationEvent;
                                        z4 = z9;
                                        onwarmupcompleted3 = onwarmupcompleted6;
                                        z5 = z7;
                                        onwarmupcompleted4 = onwarmupcompleted5;
                                        z6 = z8;
                                        iAuthTabCallback2 = iAuthTabCallback3;
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.compat.component.compound.listfooter.TdsListFooterV1Kt$$ExternalSyntheticLambda0
                                            private static int IAuthTabCallback = 1;
                                            private static int onNavigationEvent;

                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i50 = 2 % 2;
                                                int i51 = IAuthTabCallback + 63;
                                                onNavigationEvent = i51 % 128;
                                                int i52 = i51 % 2;
                                                String str5 = str;
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                                Function0 function04 = function02;
                                                String str6 = str3;
                                                lExternalSyntheticLambda3.onExtraCallback onextracallback4 = onextracallback2;
                                                GraphicDeviceInfo graphicDeviceInfo4 = graphicDeviceInfo2;
                                                long j4 = j2;
                                                boolean z10 = z4;
                                                lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted8 = onwarmupcompleted3;
                                                boolean z11 = z5;
                                                lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted9 = onwarmupcompleted4;
                                                lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult2;
                                                boolean z12 = z6;
                                                lExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback2;
                                                int i53 = i;
                                                int i54 = i2;
                                                int i55 = i3;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                Unit unit = (Unit) r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.IAuthTabCallback(TransactionFilterLocal.Companion.onNavigationEvent(), new Object[]{str5, quirksExternalSyntheticBackport04, function04, str6, onextracallback4, graphicDeviceInfo4, Long.valueOf(j4), Boolean.valueOf(z10), onwarmupcompleted8, Boolean.valueOf(z11), onwarmupcompleted9, onextracallbackwithresult4, Boolean.valueOf(z12), iAuthTabCallback4, Integer.valueOf(i53), Integer.valueOf(i54), Integer.valueOf(i55), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)}, -785447220, TransactionFilterLocal.Companion.onNavigationEvent(), 785447220, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
                                                int i56 = onNavigationEvent + 17;
                                                IAuthTabCallback = i56 % 128;
                                                int i57 = i56 % 2;
                                                return unit;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i18 |= 384;
                                i20 = i19;
                                i21 = i3 & 8192;
                                if (i21 == 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                            i18 = i15;
                            i19 = i3 & 4096;
                            if (i19 == 0) {
                            }
                            i21 = i3 & 8192;
                            if (i21 == 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i12 = i3 & 256;
                        if (i12 == 0) {
                        }
                        i13 = i3 & 512;
                        if (i13 == 0) {
                        }
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        i16 = i3 & 2048;
                        if (i16 == 0) {
                        }
                        i18 = i15;
                        i19 = i3 & 4096;
                        if (i19 == 0) {
                        }
                        i21 = i3 & 8192;
                        if (i21 == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 256;
                    if (i12 == 0) {
                    }
                    i13 = i3 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 == 0) {
                    }
                    i18 = i15;
                    i19 = i3 & 4096;
                    if (i19 == 0) {
                    }
                    i21 = i3 & 8192;
                    if (i21 == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                }
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                }
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                i16 = i3 & 2048;
                if (i16 == 0) {
                }
                i18 = i15;
                i19 = i3 & 4096;
                if (i19 == 0) {
                }
                i21 = i3 & 8192;
                if (i21 == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i3 & 8;
            int i292 = 1024;
            if (i7 != 0) {
            }
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            i11 = i3 & 128;
            if (i11 != 0) {
            }
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            i16 = i3 & 2048;
            if (i16 == 0) {
            }
            i18 = i15;
            i19 = i3 & 4096;
            if (i19 == 0) {
            }
            i21 = i3 & 8192;
            if (i21 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i7 = i3 & 8;
        int i2922 = 1024;
        if (i7 != 0) {
        }
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        i11 = i3 & 128;
        if (i11 != 0) {
        }
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        i16 = i3 & 2048;
        if (i16 == 0) {
        }
        i18 = i15;
        i19 = i3 & 4096;
        if (i19 == 0) {
        }
        i21 = i3 & 8192;
        if (i21 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i4) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final TdsListFooterV1View onWarmupCompleted(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TdsListFooterV1View tdsListFooterV1View = new TdsListFooterV1View(context, null, 0, 6, null);
        int i2 = onExtraCallbackWithResult + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return tdsListFooterV1View;
    }

    private static final void onExtraCallbackWithResult(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        int i4 = onExtraCallbackWithResult + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(String str, long j, response responseVar, boolean z, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, boolean z2, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2, lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult, String str2, long j2, Drawable drawable, final Function0 function0, long j3, TdsListFooterV1View tdsListFooterV1View) throws NoWhenBranchMatchedException {
        Drawable drawable2;
        BaseTextView baseTextViewOnMinimized;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tdsListFooterV1View, "");
        tdsListFooterV1View.setTitle(str);
        tdsListFooterV1View.setTitleColor(ByteOrderedDataOutputStream.onNavigationEvent(j));
        tdsListFooterV1View.setTitleFont(responseVar.getResId());
        tdsListFooterV1View.setBorder(z);
        tdsListFooterV1View.setBorderType(onNavigationEvent(onwarmupcompleted));
        tdsListFooterV1View.setTopBorder(z2);
        tdsListFooterV1View.setTopBorderType(onNavigationEvent(onwarmupcompleted2));
        tdsListFooterV1View.setDisabledType((getTagsokhttp) IAuthTabCallback(TransactionFilterLocal.Companion.onNavigationEvent(), new Object[]{onextracallbackwithresult}, 2029192077, TransactionFilterLocal.Companion.onNavigationEvent(), -2029192076, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent()));
        if (str2 != null) {
            int i5 = onExtraCallback + 55;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            tdsListFooterV1View.setContentDescription(str2);
        }
        if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(j2) != 0) {
            int i7 = onExtraCallback + 21;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                baseTextViewOnMinimized = tdsListFooterV1View.onMinimized();
                i = 3;
            } else {
                baseTextViewOnMinimized = tdsListFooterV1View.onMinimized();
            }
            baseTextViewOnMinimized.setTextSize(i, AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j2));
        }
        if (drawable != null) {
            drawable.setTint(ByteOrderedDataOutputStream.onNavigationEvent(j3));
            drawable2 = drawable;
        } else {
            drawable2 = null;
        }
        tdsListFooterV1View.setIcon(drawable2);
        if (function0 != null) {
            tdsListFooterV1View.setOnClickListener(new View.OnClickListener() { // from class: im.toss.tds.compose.compat.component.compound.listfooter.TdsListFooterV1Kt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 31;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.onNavigationEvent(function0, view);
                    if (i10 == 0) {
                        int i11 = 94 / 0;
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7 A[PHI: r1
      0x00f7: PHI (r1v44 int) = (r1v6 int), (r1v9 int), (r1v12 int) binds: [B:78:0x00f5, B:85:0x0111, B:84:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable Function0<Unit> function0, @Nullable String str2, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, boolean z, @Nullable lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, boolean z2, @Nullable lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2, @Nullable lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult, @Nullable Drawable drawable, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iOrdinal;
        int i16;
        int i17;
        int i18;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final long j3;
        final Function0<Unit> function02;
        final String str3;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final long j4;
        final boolean z3;
        final lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted3;
        final boolean z4;
        final lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted4;
        final lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult2;
        final Drawable drawable2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long jRatingCompat1;
        Function0<Unit> function03;
        String str4;
        GraphicDeviceInfo graphicDeviceInfo3;
        int i19;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long jOnNavigationEvent;
        boolean z5;
        lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted5;
        boolean z6;
        lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted6;
        lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult3;
        int i20;
        boolean z7;
        lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted7;
        lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult4;
        Function0<Unit> function04;
        String str5;
        GraphicDeviceInfo graphicDeviceInfo4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        long j5;
        Drawable drawable3;
        lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted8;
        boolean z8;
        int i21;
        boolean zOnNavigationEvent;
        boolean z9;
        Object objOnMinimized;
        GraphicDeviceInfo interfaceDescriptor;
        final response responseVar;
        final long jOnExtraCallbackWithResult;
        Object objOnMinimized2;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted9;
        boolean z10;
        boolean z11;
        boolean zOnExtraCallback;
        boolean z12;
        boolean z13;
        boolean z14;
        final long j6;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean zOnExtraCallback2;
        boolean zOnWarmupCompleted;
        boolean z19;
        Object objOnMinimized3;
        final Drawable drawable4;
        long j7;
        int i22;
        int i23 = 2 % 2;
        int i24 = onExtraCallback + 101;
        onExtraCallbackWithResult = i24 % 128;
        int i25 = i24 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(332533581);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i26 = i3 & 2;
        if (i26 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                    int i27 = onExtraCallbackWithResult + 51;
                    onExtraCallback = i27 % 128;
                    i5 = i27 % 2 != 0 ? 38 : 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                    int i28 = onExtraCallbackWithResult + 109;
                    onExtraCallback = i28 % 128;
                    int i29 = i28 % 2;
                    i22 = 256;
                } else {
                    i22 = 128;
                }
                i4 |= i22;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i4 |= 1572864;
                    } else {
                        if ((i & 1572864) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 1048576 : 524288;
                        }
                        i10 = i3 & 128;
                        int i30 = 12582912;
                        if (i10 != 0) {
                            i4 |= i30;
                        } else if ((12582912 & i) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                                int i31 = onExtraCallback + 73;
                                onExtraCallbackWithResult = i31 % 128;
                                int i32 = i31 % 2;
                                i30 = 8388608;
                            } else {
                                i30 = 4194304;
                            }
                            i4 |= i30;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            int i33 = onExtraCallbackWithResult + 113;
                            onExtraCallback = i33 % 128;
                            int i34 = i33 % 2;
                            i12 = 100663296;
                        } else {
                            if ((100663296 & i) == 0) {
                                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal())) {
                                    i12 = 33554432;
                                } else {
                                    int i35 = onExtraCallbackWithResult + 111;
                                    onExtraCallback = i35 % 128;
                                    int i36 = i35 % 2;
                                    i12 = 67108864;
                                }
                            }
                            i13 = i3 & 512;
                            if (i13 == 0) {
                                i4 |= 805306368;
                            } else {
                                if ((805306368 & i) == 0) {
                                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 536870912 : 268435456;
                                }
                                i14 = i3 & 1024;
                                if (i14 != 0) {
                                    i15 = i2 | 6;
                                } else if ((i2 & 6) == 0) {
                                    if (onwarmupcompleted2 == null) {
                                        int i37 = onExtraCallback + 113;
                                        onExtraCallbackWithResult = i37 % 128;
                                        if (i37 % 2 == 0) {
                                            int i38 = 6 / 0;
                                        }
                                        iOrdinal = -1;
                                    } else {
                                        iOrdinal = onwarmupcompleted2.ordinal();
                                    }
                                    i15 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 4 : 2);
                                } else {
                                    i15 = i2;
                                }
                                i16 = i3 & 2048;
                                if (i16 != 0) {
                                    i15 |= 48;
                                } else {
                                    if ((i2 & 48) == 0) {
                                        i17 = i15 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 32 : 16);
                                    }
                                    i18 = i3 & 4096;
                                    if (i18 != 0) {
                                        if ((i2 & 384) == 0) {
                                            i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(drawable) ? 256 : 128;
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true, i4 & 1)) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i26 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                if ((i3 & 4) != 0) {
                                                    int i39 = onExtraCallback + 117;
                                                    onExtraCallbackWithResult = i39 % 128;
                                                    if (i39 % 2 == 0) {
                                                        jRatingCompat1 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 97).RatingCompat1();
                                                        i4 &= 19217;
                                                    } else {
                                                        jRatingCompat1 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).RatingCompat1();
                                                        i4 &= -897;
                                                    }
                                                } else {
                                                    jRatingCompat1 = j;
                                                }
                                                function03 = i6 != 0 ? null : function0;
                                                str4 = i7 != 0 ? null : str2;
                                                graphicDeviceInfo3 = i8 != 0 ? null : graphicDeviceInfo;
                                                if (i9 != 0) {
                                                    i19 = i4;
                                                    int i40 = onExtraCallback + 119;
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                    onExtraCallbackWithResult = i40 % 128;
                                                    if (i40 % 2 == 0) {
                                                        AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                                                        Object obj = null;
                                                        obj.hashCode();
                                                        throw null;
                                                    }
                                                    jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                                                } else {
                                                    i19 = i4;
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                    jOnNavigationEvent = j2;
                                                }
                                                z5 = i10 != 0 ? false : z;
                                                onwarmupcompleted5 = i11 != 0 ? lExternalSyntheticLambda3.onWarmupCompleted.LEFT24 : onwarmupcompleted;
                                                z6 = i13 != 0 ? false : z2;
                                                onwarmupcompleted6 = i14 != 0 ? lExternalSyntheticLambda3.onWarmupCompleted.LEFT24 : onwarmupcompleted2;
                                                onextracallbackwithresult3 = i16 != 0 ? lExternalSyntheticLambda3.onExtraCallbackWithResult.TYPE1 : onextracallbackwithresult;
                                                if (i18 != 0) {
                                                    z7 = z5;
                                                    onwarmupcompleted7 = onwarmupcompleted6;
                                                    onextracallbackwithresult4 = onextracallbackwithresult3;
                                                    function04 = function03;
                                                    str5 = str4;
                                                    graphicDeviceInfo4 = graphicDeviceInfo3;
                                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                    j5 = jRatingCompat1;
                                                    drawable3 = null;
                                                    onwarmupcompleted8 = onwarmupcompleted5;
                                                    z8 = z6;
                                                    i21 = i19;
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(332533581, i21, i17, "im.toss.tds.compose.compat.component.compound.listfooter.TdsListFooterV1 (TdsListFooterV1.kt:115)");
                                                    }
                                                    getHumanReadableName gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename);
                                                    z9 = (458752 & i21) != 131072;
                                                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    if (!(zOnNavigationEvent | z9) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        if (graphicDeviceInfo4 != null) {
                                                            interfaceDescriptor = gethumanreadablename.getInterfaceDescriptor();
                                                            if (interfaceDescriptor == null) {
                                                                interfaceDescriptor = isRepeatingEnabled.onExtraCallback.onTransact();
                                                            }
                                                        } else {
                                                            interfaceDescriptor = graphicDeviceInfo4;
                                                        }
                                                        objOnMinimized = response.Companion.onNavigationEvent(CacheEntry.Companion.IAuthTabCallback(interfaceDescriptor.IAuthTabCallbackStub()));
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                    }
                                                    responseVar = (response) objOnMinimized;
                                                    jOnExtraCallbackWithResult = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult(j5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i21 >> 6) & 14) | 48);
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null).onExtraCallback(quirksExternalSyntheticBackport04);
                                                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    onwarmupcompleted9 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                                    if (objOnMinimized2 == onwarmupcompleted9.onExtraCallback()) {
                                                        objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.compat.component.compound.listfooter.TdsListFooterV1Kt$$ExternalSyntheticLambda2
                                                            private static int onExtraCallbackWithResult = 1;
                                                            private static int onNavigationEvent;

                                                            public final Object invoke(Object obj2) {
                                                                int i41 = 2 % 2;
                                                                int i42 = onNavigationEvent + 41;
                                                                onExtraCallbackWithResult = i42 % 128;
                                                                Context context = (Context) obj2;
                                                                if (i42 % 2 != 0) {
                                                                    return r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.onExtraCallback(context);
                                                                }
                                                                r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.onExtraCallback(context);
                                                                throw null;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                                    }
                                                    Function1 function1 = (Function1) objOnMinimized2;
                                                    z10 = (i21 & 14) != 4;
                                                    z11 = (((i21 & 896) ^ 384) <= 256 && !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j5) ^ true)) || (i21 & 384) == 256;
                                                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(responseVar.ordinal());
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                                    z12 = (i21 & 29360128) == 8388608;
                                                    z13 = (234881024 & i21) == 67108864;
                                                    if ((1879048192 & i21) == 536870912) {
                                                        int i41 = onExtraCallback + 27;
                                                        onExtraCallbackWithResult = i41 % 128;
                                                        int i42 = i41 % 2;
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    j6 = j5;
                                                    z15 = (i17 & 14) == 4;
                                                    z16 = (i17 & 112) == 32;
                                                    z17 = (57344 & i21) == 16384;
                                                    z18 = (3670016 & i21) == 1048576;
                                                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(drawable3);
                                                    zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnExtraCallbackWithResult);
                                                    z19 = (i21 & 7168) == 2048;
                                                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    if (((z10 | z11 | zOnExtraCallback | z12 | z13 | z14 | z15 | z16 | z17 | z18 | zOnExtraCallback2 | zOnWarmupCompleted) || z19) || objOnMinimized3 == onwarmupcompleted9.onExtraCallback()) {
                                                        final boolean z20 = z7;
                                                        final lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted10 = onwarmupcompleted8;
                                                        final boolean z21 = z8;
                                                        drawable4 = drawable3;
                                                        final lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted11 = onwarmupcompleted7;
                                                        j7 = j6;
                                                        final lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresult4;
                                                        final String str6 = str5;
                                                        final long j8 = jOnNavigationEvent;
                                                        final Function0<Unit> function05 = function04;
                                                        Function1 function12 = new Function1() { // from class: im.toss.tds.compose.compat.component.compound.listfooter.TdsListFooterV1Kt$$ExternalSyntheticLambda3
                                                            private static int IAuthTabCallback = 1;
                                                            private static int onWarmupCompleted;

                                                            public final Object invoke(Object obj2) throws NoWhenBranchMatchedException {
                                                                int i43 = 2 % 2;
                                                                int i44 = IAuthTabCallback + 45;
                                                                onWarmupCompleted = i44 % 128;
                                                                int i45 = i44 % 2;
                                                                Unit unitOnWarmupCompleted = r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.onWarmupCompleted(str, j6, responseVar, z20, onwarmupcompleted10, z21, onwarmupcompleted11, onextracallbackwithresult5, str6, j8, drawable4, function05, jOnExtraCallbackWithResult, (TdsListFooterV1View) obj2);
                                                                int i46 = IAuthTabCallback + 103;
                                                                onWarmupCompleted = i46 % 128;
                                                                int i47 = i46 % 2;
                                                                return unitOnWarmupCompleted;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function12);
                                                        objOnMinimized3 = function12;
                                                    } else {
                                                        j7 = j6;
                                                        drawable4 = drawable3;
                                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                    }
                                                    setThreadList.onExtraCallback(function1, quirksExternalSyntheticBackport0OnExtraCallback, (Function1) null, (Function1) null, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, 6, 12);
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                                    }
                                                    drawable2 = drawable4;
                                                    function02 = function04;
                                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                                                    str3 = str5;
                                                    graphicDeviceInfo2 = graphicDeviceInfo4;
                                                    z3 = z7;
                                                    j3 = j7;
                                                    onwarmupcompleted3 = onwarmupcompleted8;
                                                    z4 = z8;
                                                    j4 = jOnNavigationEvent;
                                                    onwarmupcompleted4 = onwarmupcompleted7;
                                                    onextracallbackwithresult2 = onextracallbackwithresult4;
                                                } else {
                                                    i20 = i19;
                                                }
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                if ((i3 & 4) != 0) {
                                                    i4 &= -897;
                                                }
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                                jRatingCompat1 = j;
                                                function03 = function0;
                                                str4 = str2;
                                                graphicDeviceInfo3 = graphicDeviceInfo;
                                                jOnNavigationEvent = j2;
                                                z5 = z;
                                                onwarmupcompleted5 = onwarmupcompleted;
                                                onwarmupcompleted6 = onwarmupcompleted2;
                                                onextracallbackwithresult3 = onextracallbackwithresult;
                                                i20 = i4;
                                                z6 = z2;
                                            }
                                            z7 = z5;
                                            onwarmupcompleted7 = onwarmupcompleted6;
                                            onextracallbackwithresult4 = onextracallbackwithresult3;
                                            function04 = function03;
                                            str5 = str4;
                                            graphicDeviceInfo4 = graphicDeviceInfo3;
                                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                            j5 = jRatingCompat1;
                                            drawable3 = drawable;
                                            onwarmupcompleted8 = onwarmupcompleted5;
                                            z8 = z6;
                                            i21 = i20;
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            }
                                            getHumanReadableName gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename2);
                                            if ((458752 & i21) != 131072) {
                                            }
                                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (!(zOnNavigationEvent | z9)) {
                                                if (graphicDeviceInfo4 != null) {
                                                }
                                                objOnMinimized = response.Companion.onNavigationEvent(CacheEntry.Companion.IAuthTabCallback(interfaceDescriptor.IAuthTabCallbackStub()));
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                responseVar = (response) objOnMinimized;
                                                jOnExtraCallbackWithResult = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult(j5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i21 >> 6) & 14) | 48);
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null).onExtraCallback(quirksExternalSyntheticBackport04);
                                                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                onwarmupcompleted9 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                                if (objOnMinimized2 == onwarmupcompleted9.onExtraCallback()) {
                                                }
                                                Function1 function13 = (Function1) objOnMinimized2;
                                                if ((i21 & 14) != 4) {
                                                }
                                                if (((i21 & 896) ^ 384) <= 256) {
                                                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(responseVar.ordinal());
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                                                    if ((i21 & 29360128) == 8388608) {
                                                    }
                                                    if ((234881024 & i21) == 67108864) {
                                                    }
                                                    if ((1879048192 & i21) == 536870912) {
                                                    }
                                                    j6 = j5;
                                                    if ((i17 & 14) == 4) {
                                                    }
                                                    if ((i17 & 112) == 32) {
                                                    }
                                                    if ((57344 & i21) == 16384) {
                                                    }
                                                    if ((3670016 & i21) == 1048576) {
                                                    }
                                                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(drawable3);
                                                    zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnExtraCallbackWithResult);
                                                    if ((i21 & 7168) == 2048) {
                                                    }
                                                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    if (z10 | z11 | zOnExtraCallback | z12 | z13 | z14 | z15 | z16 | z17 | z18 | zOnExtraCallback2 | zOnWarmupCompleted | z19) {
                                                        final boolean z202 = z7;
                                                        final lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted102 = onwarmupcompleted8;
                                                        final boolean z212 = z8;
                                                        drawable4 = drawable3;
                                                        final lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted112 = onwarmupcompleted7;
                                                        j7 = j6;
                                                        final lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult52 = onextracallbackwithresult4;
                                                        final String str62 = str5;
                                                        final long j82 = jOnNavigationEvent;
                                                        final Function0 function052 = function04;
                                                        Function1 function122 = new Function1() { // from class: im.toss.tds.compose.compat.component.compound.listfooter.TdsListFooterV1Kt$$ExternalSyntheticLambda3
                                                            private static int IAuthTabCallback = 1;
                                                            private static int onWarmupCompleted;

                                                            public final Object invoke(Object obj2) throws NoWhenBranchMatchedException {
                                                                int i43 = 2 % 2;
                                                                int i44 = IAuthTabCallback + 45;
                                                                onWarmupCompleted = i44 % 128;
                                                                int i45 = i44 % 2;
                                                                Unit unitOnWarmupCompleted = r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.onWarmupCompleted(str, j6, responseVar, z202, onwarmupcompleted102, z212, onwarmupcompleted112, onextracallbackwithresult52, str62, j82, drawable4, function052, jOnExtraCallbackWithResult, (TdsListFooterV1View) obj2);
                                                                int i46 = IAuthTabCallback + 103;
                                                                onWarmupCompleted = i46 % 128;
                                                                int i47 = i46 % 2;
                                                                return unitOnWarmupCompleted;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function122);
                                                        objOnMinimized3 = function122;
                                                        setThreadList.onExtraCallback(function13, quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) null, (Function1) null, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, 6, 12);
                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                        }
                                                        drawable2 = drawable4;
                                                        function02 = function04;
                                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport062;
                                                        str3 = str5;
                                                        graphicDeviceInfo2 = graphicDeviceInfo4;
                                                        z3 = z7;
                                                        j3 = j7;
                                                        onwarmupcompleted3 = onwarmupcompleted8;
                                                        z4 = z8;
                                                        j4 = jOnNavigationEvent;
                                                        onwarmupcompleted4 = onwarmupcompleted7;
                                                        onextracallbackwithresult2 = onextracallbackwithresult4;
                                                    }
                                                } else {
                                                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(responseVar.ordinal());
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0622 = quirksExternalSyntheticBackport04;
                                                    if ((i21 & 29360128) == 8388608) {
                                                    }
                                                    if ((234881024 & i21) == 67108864) {
                                                    }
                                                    if ((1879048192 & i21) == 536870912) {
                                                    }
                                                    j6 = j5;
                                                    if ((i17 & 14) == 4) {
                                                    }
                                                    if ((i17 & 112) == 32) {
                                                    }
                                                    if ((57344 & i21) == 16384) {
                                                    }
                                                    if ((3670016 & i21) == 1048576) {
                                                    }
                                                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(drawable3);
                                                    zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnExtraCallbackWithResult);
                                                    if ((i21 & 7168) == 2048) {
                                                    }
                                                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    if (z10 | z11 | zOnExtraCallback | z12 | z13 | z14 | z15 | z16 | z17 | z18 | zOnExtraCallback2 | zOnWarmupCompleted | z19) {
                                                    }
                                                }
                                            }
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                            j3 = j;
                                            function02 = function0;
                                            str3 = str2;
                                            graphicDeviceInfo2 = graphicDeviceInfo;
                                            j4 = j2;
                                            z3 = z;
                                            onwarmupcompleted3 = onwarmupcompleted;
                                            z4 = z2;
                                            onwarmupcompleted4 = onwarmupcompleted2;
                                            onextracallbackwithresult2 = onextracallbackwithresult;
                                            drawable2 = drawable;
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.compat.component.compound.listfooter.TdsListFooterV1Kt$$ExternalSyntheticLambda4
                                                private static int onExtraCallbackWithResult = 0;
                                                private static int onNavigationEvent = 1;

                                                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                                    int i43 = 2 % 2;
                                                    int i44 = onNavigationEvent + 73;
                                                    onExtraCallbackWithResult = i44 % 128;
                                                    int i45 = i44 % 2;
                                                    Unit unitOnWarmupCompleted = r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.onWarmupCompleted(str, quirksExternalSyntheticBackport02, j3, function02, str3, graphicDeviceInfo2, j4, z3, onwarmupcompleted3, z4, onwarmupcompleted4, onextracallbackwithresult2, drawable2, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                    int i46 = onNavigationEvent + 77;
                                                    onExtraCallbackWithResult = i46 % 128;
                                                    if (i46 % 2 == 0) {
                                                        return unitOnWarmupCompleted;
                                                    }
                                                    throw null;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i17 |= 384;
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true, i4 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    }
                                }
                                i17 = i15;
                                i18 = i3 & 4096;
                                if (i18 != 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true, i4 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i14 = i3 & 1024;
                            if (i14 != 0) {
                            }
                            i16 = i3 & 2048;
                            if (i16 != 0) {
                            }
                            i17 = i15;
                            i18 = i3 & 4096;
                            if (i18 != 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true, i4 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i4 |= i12;
                        i13 = i3 & 512;
                        if (i13 == 0) {
                        }
                        i14 = i3 & 1024;
                        if (i14 != 0) {
                        }
                        i16 = i3 & 2048;
                        if (i16 != 0) {
                        }
                        i17 = i15;
                        i18 = i3 & 4096;
                        if (i18 != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true, i4 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i10 = i3 & 128;
                    int i302 = 12582912;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i4 |= i12;
                    i13 = i3 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i3 & 1024;
                    if (i14 != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                    }
                    i17 = i15;
                    i18 = i3 & 4096;
                    if (i18 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                int i3022 = 12582912;
                if (i10 != 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i4 |= i12;
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                i14 = i3 & 1024;
                if (i14 != 0) {
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                }
                i17 = i15;
                i18 = i3 & 4096;
                if (i18 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            int i30222 = 12582912;
            if (i10 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i4 |= i12;
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i3 & 1024;
            if (i14 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            i17 = i15;
            i18 = i3 & 4096;
            if (i18 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i & 384) == 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        int i302222 = 12582912;
        if (i10 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i4 |= i12;
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i3 & 1024;
        if (i14 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        i17 = i15;
        i18 = i3 & 4096;
        if (i18 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final ProtocolCompanion onNavigationEvent(lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent.onExtraCallback[onwarmupcompleted.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = onExtraCallbackWithResult + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return ProtocolCompanion.FULL;
        }
        ProtocolCompanion protocolCompanion = ProtocolCompanion.LEFT24;
        int i5 = onExtraCallback + 31;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return protocolCompanion;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult = (lExternalSyntheticLambda3.onExtraCallbackWithResult) objArr[0];
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0 ? (i = onNavigationEvent.onExtraCallbackWithResult[onextracallbackwithresult.ordinal()]) == 1 : (i = onNavigationEvent.onExtraCallbackWithResult[onextracallbackwithresult.ordinal()]) == 0) {
            getTagsokhttp gettagsokhttp = getTagsokhttp.TYPE1;
            int i4 = onExtraCallback + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return gettagsokhttp;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return getTagsokhttp.NONE;
        }
        getTagsokhttp gettagsokhttp2 = getTagsokhttp.TYPE2;
        int i6 = onExtraCallbackWithResult + 77;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 26 / 0;
        }
        return gettagsokhttp2;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, String str2, lExternalSyntheticLambda3.onExtraCallback onextracallback, GraphicDeviceInfo graphicDeviceInfo, long j, boolean z, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, boolean z2, lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2, lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult, boolean z3, lExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) IAuthTabCallback(TransactionFilterLocal.Companion.onNavigationEvent(), new Object[]{str, quirksExternalSyntheticBackport0, function0, str2, onextracallback, graphicDeviceInfo, Long.valueOf(j), Boolean.valueOf(z), onwarmupcompleted, Boolean.valueOf(z2), onwarmupcompleted2, onextracallbackwithresult, Boolean.valueOf(z3), iAuthTabCallback, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, -785447220, TransactionFilterLocal.Companion.onNavigationEvent(), 785447220, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
    }

    private static final getTagsokhttp onNavigationEvent(lExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        return (getTagsokhttp) IAuthTabCallback(TransactionFilterLocal.Companion.onNavigationEvent(), new Object[]{onextracallbackwithresult}, 2029192077, TransactionFilterLocal.Companion.onNavigationEvent(), -2029192076, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
    }
}
