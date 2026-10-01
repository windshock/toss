package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.text.Annotation;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.widget.Toast;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.util.Arrays;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.onIconClick;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onIconClick {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = ~(i8 | i10);
        int i12 = i9 | i11;
        int i13 = (~(i3 | i8 | i5)) | (~(i7 | i6)) | (~(i10 | i7));
        int i14 = i5 + i6 + i4 + ((-1336646162) * i2) + (1706069763 * i);
        int i15 = i14 * i14;
        int i16 = ((i5 * (-1709230891)) - 203685888) + ((-1709230891) * i6) + ((-1137600936) * i12) + (568800468 * i11) + ((-568800468) * i13) + (2016935936 * i4) + ((-602931200) * i2) + ((-1331167232) * i) + ((-1604583424) * i15);
        int i17 = ((i5 * 112646815) - 831444653) + (i6 * 112646815) + (i12 * 520) + (i11 * (-260)) + (i13 * 260) + (i4 * 112647075) + (i2 * (-2078048118)) + (i * (-2015059991)) + (i15 * (-829161472));
        return i16 + ((i17 * i17) * (-1266417664)) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(Context context, String str, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(context, str, i);
        int i5 = onNavigationEvent + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final String IAuthTabCallback(@NotNull Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        String str;
        PackageManager packageManager;
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                packageManager = context.getPackageManager();
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                packageManager = context.getPackageManager();
            }
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null && (str = packageInfo.versionName) != null) {
            return str;
        }
        int i3 = onNavigationEvent + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return "";
    }

    public static final String onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            int i3 = context.getApplicationInfo().labelRes;
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        int i4 = context.getApplicationInfo().labelRes;
        if (i4 == 0) {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        }
        String string = context.getString(i4);
        Intrinsics.checkNotNull(string);
        int i5 = onNavigationEvent + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Context context, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i4 + 123;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        Object[] objArr = {context, str, Integer.valueOf(i)};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, objArr, 8843442, -8843441);
        int i9 = onNavigationEvent + 81;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final Context context = (Context) objArr[0];
        final String str = (String) objArr[1];
        final int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (str != null) {
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                int i4 = onNavigationEvent + 9;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    Toast.makeText(context.getApplicationContext(), str, iIntValue).show();
                    int i5 = 5 / 0;
                } else {
                    Toast.makeText(context.getApplicationContext(), str, iIntValue).show();
                }
                return null;
            }
            Intrinsics.checkNotNull(NetConverter3.onExtraCallback().onExtraCallback(new Runnable() { // from class: im.toss.core.extensions.ContextsKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 69;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Context context2 = context;
                    if (i8 == 0) {
                        onIconClick.onWarmupCompleted(context2, str, iIntValue);
                    } else {
                        onIconClick.onWarmupCompleted(context2, str, iIntValue);
                        int i9 = 40 / 0;
                    }
                }
            }));
            int i6 = onExtraCallback + 105;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return null;
    }

    private static final void IAuthTabCallback(Context context, String str, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Toast.makeText(context.getApplicationContext(), str, i).show();
        int i5 = onExtraCallback + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 0;
        Context context = (Context) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0 ? (iIntValue3 & 2) == 0 : (3 & iIntValue3) == 0) {
            i = iIntValue2;
        } else {
            int i5 = i3 + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        onExtraCallback(context, iIntValue, i);
        return null;
    }

    public static final void onExtraCallback(@NotNull Context context, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Object[] objArr = {context, context.getString(i), Integer.valueOf(i2)};
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, objArr, 8843442, -8843441);
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Object[] objArr2 = {context, context.getString(i), Integer.valueOf(i2)};
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback4 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback4, objArr2, 8843442, -8843441);
        int i5 = onExtraCallback + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final Integer onExtraCallback(@NotNull Context context, @NotNull String str) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(Integer.valueOf(context.getColor(context.getResources().getIdentifier(str, "color", context.getPackageName()))));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 11;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 25;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            obj = null;
        }
        return (Integer) obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final SpannedString onNavigationEvent(@NotNull Context context, int i, @NotNull Object... objArr) {
        response responseVar;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        CharSequence text = context.getText(i);
        SpannedString spannedString = text instanceof SpannedString ? (SpannedString) text : null;
        if (spannedString == null) {
            return new SpannedString(WorkForegroundRunnableExternalSyntheticLambda0.onExtraCallbackWithResult(context, i, Arrays.copyOf(objArr, objArr.length)));
        }
        String string = spannedString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strOnExtraCallback = WorkForegroundRunnableExternalSyntheticLambda0.onExtraCallback(string, Arrays.copyOf(objArr, objArr.length));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOnExtraCallback);
        try {
            Result.Companion companion = kotlin.Result.Companion;
            Annotation[] annotationArr = (Annotation[]) spannedString.getSpans(0, spannedString.length(), Annotation.class);
            Intrinsics.checkNotNull(annotationArr);
            int length = annotationArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = onNavigationEvent + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Annotation annotation = annotationArr[i3];
                String string2 = spannedString.subSequence(spannedString.getSpanStart(annotation), spannedString.getSpanEnd(annotation)).toString();
                String key = annotation.getKey();
                String value = annotation.getValue();
                String strOnExtraCallback2 = WorkForegroundRunnableExternalSyntheticLambda0.onExtraCallback(string2, Arrays.copyOf(objArr, objArr.length));
                int i6 = i3;
                int iIndexOf$default = StringsKt.indexOf$default(strOnExtraCallback, strOnExtraCallback2, 0, false, 6, (Object) null);
                int length2 = strOnExtraCallback2.length() + iIndexOf$default;
                if (key != null) {
                    switch (key.hashCode()) {
                        case -810698576:
                            if (!key.equals("decoration")) {
                                continue;
                            } else if (!Intrinsics.areEqual(value, "underline")) {
                                if (!Intrinsics.areEqual(value, "lineThrough")) {
                                    break;
                                } else {
                                    spannableStringBuilder.setSpan(new StrikethroughSpan(), iIndexOf$default, length2, 33);
                                    break;
                                }
                            } else {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), iIndexOf$default, length2, 33);
                                break;
                            }
                        case -734428249:
                            if (!key.equals("fontWeight")) {
                                break;
                            } else {
                                if (!(!Intrinsics.areEqual(value, "bold"))) {
                                    responseVar = response.Bold;
                                } else if (Intrinsics.areEqual(value, "medium")) {
                                    int i7 = onNavigationEvent + 97;
                                    onExtraCallback = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        response responseVar2 = response.Medium;
                                        throw null;
                                    }
                                    responseVar = response.Medium;
                                } else {
                                    responseVar = response.Regular;
                                }
                                spannableStringBuilder.setSpan(new setCookieJarokhttp(response.toTypeface$default(responseVar, context, (setDone) null, 2, (Object) null)), iIndexOf$default, length2, 33);
                                break;
                            }
                        case 3530753:
                            if (!key.equals("size")) {
                                break;
                            } else {
                                Intrinsics.checkNotNull(value);
                                Integer numOnWarmupCompleted = onWarmupCompleted(context, value);
                                if (numOnWarmupCompleted != null) {
                                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(numOnWarmupCompleted.intValue(), false), iIndexOf$default, length2, 33);
                                    break;
                                }
                            }
                            break;
                        case 94842723:
                            if (!key.equals("color")) {
                                break;
                            } else {
                                Intrinsics.checkNotNull(value);
                                Integer numOnExtraCallback = onExtraCallback(context, StringsKt.replace$default(value, "-", "_", false, 4, (Object) null));
                                if (numOnExtraCallback != null) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(numOnExtraCallback.intValue()), iIndexOf$default, length2, 33);
                                    break;
                                }
                            }
                            break;
                    }
                }
                i3 = i6 + 1;
            }
            kotlin.Result.constructor-impl(Unit.INSTANCE);
            int i8 = onExtraCallback + 31;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private static final Integer onWarmupCompleted(Context context, String str) {
        int i = 2 % 2;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("^(\\d+)(sp)?$"), str, 0, 2, (Object) null);
        if (matchResultFind$default == null) {
            return null;
        }
        MatchResult.Destructured destructured = matchResultFind$default.getDestructured();
        String str2 = (String) destructured.getMatch().getGroupValues().get(1);
        String str3 = (String) destructured.getMatch().getGroupValues().get(2);
        Float floatOrNull = StringsKt.toFloatOrNull(str2);
        if (floatOrNull == null) {
            return null;
        }
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = floatOrNull.floatValue();
        if (Intrinsics.areEqual(str3, "sp")) {
            Integer numValueOf = Integer.valueOf((int) TypedValue.applyDimension(2, fFloatValue, context.getResources().getDisplayMetrics()));
            int i4 = onNavigationEvent + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            return numValueOf;
        }
        Integer numValueOf2 = Integer.valueOf((int) fFloatValue);
        int i6 = onExtraCallback + 9;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return numValueOf2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onExtraCallback(@NotNull Context context) throws PackageManager.NameNotFoundException {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String strIAuthTabCallback = IAuthTabCallback(context);
        int length = strIAuthTabCallback.length();
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = onExtraCallback + 29;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                if (strIAuthTabCallback.charAt(i5) == '}') {
                    strIAuthTabCallback = strIAuthTabCallback.substring(0, i5);
                    Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback, "");
                    i = onNavigationEvent + 49;
                    onExtraCallback = i % 128;
                    if (i % 2 != 0) {
                        int i7 = 5 / 2;
                    }
                }
            } else if (strIAuthTabCallback.charAt(i5) == '-') {
                strIAuthTabCallback = strIAuthTabCallback.substring(0, i5);
                Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback, "");
                i = onNavigationEvent + 49;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                }
            }
            return strIAuthTabCallback;
        }
        return strIAuthTabCallback;
    }

    public static final void onExtraCallbackWithResult(@NotNull Context context, @Nullable String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, objArr, 8843442, -8843441);
    }

    public static /* synthetic */ void IAuthTabCallback(Context context, int i, int i2, int i3, Object obj) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, objArr, -2063899930, 2063899930);
    }
}
