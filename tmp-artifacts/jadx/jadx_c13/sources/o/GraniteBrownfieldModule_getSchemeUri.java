package o;

import android.content.Context;
import android.text.Annotation;
import android.text.SpannedString;
import im.toss.uikit.utils.StringUtilsKt$;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.GraniteBrownfieldModule_getSchemeUri;
import o.hasProvider;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class GraniteBrownfieldModule_getSchemeUri {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ String onExtraCallback(Object[] objArr, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(objArr, str);
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Context context, Map map, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(context, map, str);
        int i4 = onNavigationEvent + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = i7 | i6;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i6));
        int i11 = (~(i2 | i6)) | (~(i7 | i2));
        int i12 = i9 | i8;
        int i13 = i6 + i5 + i3 + (988256597 * i4) + ((-695401848) * i);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i6) - 1270611968) + ((-1462879173) * i5) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i3) + (479985664 * i4) + (1063256064 * i) + (1273561088 * i14);
        int i16 = (i6 * (-1367684995)) + 376186498 + (i5 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i3 * (-1367684709)) + (i4 * 1512018807) + (i * 1127043160) + (i14 * (-418185216));
        return i15 + ((i16 * i16) * 1903099904) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ String onNavigationEvent(Context context, Map map, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        String str2 = (String) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1619855794, new Object[]{context, map, str}, -1619855794);
        int i4 = onExtraCallback + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static /* synthetic */ String onWarmupCompleted(Context context, Object[] objArr, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            return (String) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1002405121, new Object[]{context, objArr, str}, -1002405120);
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        String str2 = (String) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, 1002405121, new Object[]{context, objArr, str}, -1002405120);
        int i3 = 63 / 0;
        return str2;
    }

    public static final hasProvider onExtraCallbackWithResult(@NotNull Context context, int i, @NotNull final Object... objArr) {
        SpannedString spannedString;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        CharSequence text = context.getText(i);
        if (!(text instanceof SpannedString)) {
            spannedString = null;
        } else {
            int i3 = onExtraCallback + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            spannedString = (SpannedString) text;
        }
        if (spannedString != null) {
            String string = spannedString.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return onWarmupCompleted(context, spannedString, WorkForegroundRunnableExternalSyntheticLambda0.onExtraCallback(string, Arrays.copyOf(objArr, objArr.length)), new Function1() { // from class: im.toss.uikit.utils.StringUtilsKt$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 113;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    String strOnExtraCallback = GraniteBrownfieldModule_getSchemeUri.onExtraCallback(objArr, (String) obj);
                    int i8 = onWarmupCompleted + 111;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        return strOnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
        }
        hasProvider hasprovider = new hasProvider(WorkForegroundRunnableExternalSyntheticLambda0.onExtraCallbackWithResult(context, i, Arrays.copyOf(objArr, objArr.length)), (List) null, 2, (DefaultConstructorMarker) null);
        int i5 = onExtraCallback + 49;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return hasprovider;
    }

    private static final String IAuthTabCallback(Object[] objArr, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnExtraCallback = WorkForegroundRunnableExternalSyntheticLambda0.onExtraCallback(str, Arrays.copyOf(objArr, objArr.length));
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Context context = (Context) objArr[0];
        Object[] objArr2 = (Object[]) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ComputeExpression.IAuthTabCallback.onExtraCallbackWithResult(context, str, Arrays.copyOf(objArr2, objArr2.length));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String strOnExtraCallbackWithResult = ComputeExpression.IAuthTabCallback.onExtraCallbackWithResult(context, str, Arrays.copyOf(objArr2, objArr2.length));
        int i3 = onNavigationEvent + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static final hasProvider onExtraCallback(@NotNull Context context, int i, @NotNull Pair<String, ? extends Object>... pairArr) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        CharSequence text = context.getText(i);
        SpannedString spannedString = text instanceof SpannedString ? (SpannedString) text : null;
        if (spannedString != null) {
            return onWarmupCompleted(context, spannedString, ComputeExpression.IAuthTabCallback.onNavigationEvent(context, i, (Pair[]) Arrays.copyOf(pairArr, pairArr.length)), new StringUtilsKt$.ExternalSyntheticLambda1(context, access8000.access000(pairArr)));
        }
        hasProvider hasprovider = new hasProvider(ComputeExpression.IAuthTabCallback.onNavigationEvent(context, i, (Pair[]) Arrays.copyOf(pairArr, pairArr.length)), (List) null, 2, (DefaultConstructorMarker) null);
        int i5 = onExtraCallback + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return hasprovider;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Context context = (Context) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ComputeExpression.IAuthTabCallback.IAuthTabCallback(context, str, map);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String strIAuthTabCallback = ComputeExpression.IAuthTabCallback.IAuthTabCallback(context, str, map);
        int i3 = onExtraCallback + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 10 / 0;
        }
        return strIAuthTabCallback;
    }

    private static final String onExtraCallback(Context context, Map map, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strIAuthTabCallback = ComputeExpression.IAuthTabCallback.IAuthTabCallback(context, str, map);
        int i4 = onNavigationEvent + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final hasProvider onWarmupCompleted(Context context, SpannedString spannedString, String str, Function1<? super String, String> function1) {
        int i = 2 % 2;
        hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(str);
        try {
            Result.Companion companion = Result.Companion;
            Annotation[] annotationArr = (Annotation[]) spannedString.getSpans(0, spannedString.length(), Annotation.class);
            Intrinsics.checkNotNull(annotationArr);
            for (Annotation annotation : annotationArr) {
                int i2 = onNavigationEvent + 49;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                String string = spannedString.subSequence(spannedString.getSpanStart(annotation), spannedString.getSpanEnd(annotation)).toString();
                String key = annotation.getKey();
                String value = annotation.getValue();
                String strInvoke = function1.invoke(string);
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, strInvoke, 0, false, 6, (Object) null);
                int length = strInvoke.length() + iIndexOf$default;
                if (key != null) {
                    int i4 = onNavigationEvent + 7;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    switch (key.hashCode()) {
                        case -810698576:
                            if (key.equals("decoration")) {
                                if (Intrinsics.areEqual(value, "underline")) {
                                    iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindChildren.Companion.IAuthTabCallback(), (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 61439, (DefaultConstructorMarker) null), iIndexOf$default, length);
                                    break;
                                } else if (!Intrinsics.areEqual(value, "lineThrough")) {
                                    break;
                                } else {
                                    iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindChildren.Companion.onExtraCallback(), (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 61439, (DefaultConstructorMarker) null), iIndexOf$default, length);
                                    continue;
                                }
                            } else {
                                break;
                            }
                        case -734428249:
                            if (key.equals("fontWeight")) {
                                iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, Intrinsics.areEqual(value, "bold") ? isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult() : Intrinsics.areEqual(value, "medium") ? isRepeatingEnabled.onExtraCallback.onTransact() : isRepeatingEnabled.onExtraCallback.asBinder(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65531, (DefaultConstructorMarker) null), iIndexOf$default, length);
                                break;
                            } else {
                                continue;
                            }
                        case 3530753:
                            if (key.equals("size")) {
                                Intrinsics.checkNotNull(value);
                                AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirkOnWarmupCompleted = onWarmupCompleted(value);
                                if (avoidCaptureProcessProgressAvailabilityCheckQuirkOnWarmupCompleted != null) {
                                    iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, avoidCaptureProcessProgressAvailabilityCheckQuirkOnWarmupCompleted.IAuthTabCallback(), (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65533, (DefaultConstructorMarker) null), iIndexOf$default, length);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                int i6 = onNavigationEvent + 25;
                                onExtraCallback = i6 % 128;
                                int i7 = i6 % 2;
                                continue;
                            }
                        case 94842723:
                            if (key.equals("color")) {
                                Intrinsics.checkNotNull(value);
                                Integer numOnExtraCallback = onIconClick.onExtraCallback(context, StringsKt__StringsJVMKt.replace$default(value, "-", "_", false, 4, (Object) null));
                                if (numOnExtraCallback != null) {
                                    iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(ByteOrderedDataOutputStream.onExtraCallback(numOnExtraCallback.intValue()), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65534, (DefaultConstructorMarker) null), iIndexOf$default, length);
                                    break;
                                } else {
                                    break;
                                }
                            }
                            break;
                    }
                }
            }
            Result.m31constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        return iAuthTabCallback.onExtraCallbackWithResult();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[PHI: r1
      0x006e: PHI (r1v9 float) = (r1v7 float), (r1v10 float) binds: [B:17:0x006c, B:14:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[PHI: r1
      0x0079: PHI (r1v8 float) = (r1v7 float), (r1v10 float) binds: [B:17:0x006c, B:14:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final AvoidCaptureProcessProgressAvailabilityCheckQuirk onWarmupCompleted(String str) {
        float fFloatValue;
        long jOnNavigationEvent;
        int i = 2 % 2;
        Object obj = null;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("^(\\d+)(sp)?$"), str, 0, 2, null);
        if (matchResultFind$default == null) {
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        MatchResult.Destructured destructured = matchResultFind$default.getDestructured();
        String str2 = destructured.getMatch().getGroupValues().get(1);
        String str3 = destructured.getMatch().getGroupValues().get(2);
        Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str2);
        if (floatOrNull == null) {
            return null;
        }
        int i3 = onExtraCallback + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            fFloatValue = floatOrNull.floatValue();
            int i4 = 97 / 0;
            jOnNavigationEvent = Intrinsics.areEqual(str3, "sp") ? RequestOptionConfigBuilderExternalSyntheticLambda0.onNavigationEvent(fFloatValue) : RequestOptionConfigBuilderExternalSyntheticLambda0.onWarmupCompleted(fFloatValue, AvoidPostviewAvailabilityCheckQuirk.Companion.onWarmupCompleted());
        } else {
            fFloatValue = floatOrNull.floatValue();
            if (!Intrinsics.areEqual(str3, "sp")) {
            }
        }
        return AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(jOnNavigationEvent);
    }

    private static final String onNavigationEvent(Context context, Object[] objArr, String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (String) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1002405121, new Object[]{context, objArr, str}, -1002405120);
    }

    private static final String onWarmupCompleted(Context context, Map map, String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (String) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1619855794, new Object[]{context, map, str}, -1619855794);
    }
}
