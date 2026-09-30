package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
import com.google.android.gms.internal.ads.zzgc;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class filterCreatePageParams {
    private static final byte[] $$a = {102, 12, 98, 84};
    private static final int $$b = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onExtraCallback = {60833, 28663, 59679};
    private static long onExtraCallbackWithResult = -9036119702356594811L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3;
        int i4 = 3 - (s * 2);
        int i5 = (b * 3) + 1;
        int i6 = (i * 3) + 97;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i6 = i5;
            i3 = 0;
            i6 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i6 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
            }
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i7 | i6)) | (~(i8 | i6));
        int i10 = ~(i3 | i7);
        int i11 = i6 | i10 | (~(i8 | i));
        int i12 = i6 + i + i4 + (1997535707 * i5) + (1930545336 * i2);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i6) + 1468203008 + ((-417352845) * i) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i4) + ((-1408630784) * i5) + ((-2070937600) * i2) + (392888320 * i13);
        int i15 = (i6 * (-2054695253)) + 138751921 + (i * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i4 * (-2054694363)) + (i5 * 1502648999) + (i2 * 931574424) + (i13 * (-2139684864));
        int i16 = i14 + (i15 * i15 * (-174260224));
        if (i16 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? i16 != 4 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }
        String str = (String) objArr[0];
        int i17 = 2 % 2;
        int i18 = IAuthTabCallback + 103;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strRemovePrefix = StringsKt.removePrefix(str, "www.");
        int i20 = IAuthTabCallback + 97;
        onWarmupCompleted = i20 % 128;
        int i21 = i20 % 2;
        return strRemovePrefix;
    }

    public static /* synthetic */ String onNavigationEvent(Uri uri, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 55;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            int i5 = i4 + 99;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        return (String) onWarmupCompleted(new Object[]{uri, str, str2}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String strIAuthTabCallback;
        Uri uri = (Uri) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (uri != null) {
            if (str2 == null) {
                int i2 = onWarmupCompleted;
                int i3 = i2 + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 93;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                str2 = "";
            }
            strIAuthTabCallback = IAuthTabCallback(uri, str, str2);
        } else {
            int i7 = onWarmupCompleted + 75;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            strIAuthTabCallback = null;
        }
        return strIAuthTabCallback == null ? "" : strIAuthTabCallback;
    }

    public static final boolean onExtraCallback(@Nullable Uri uri, @NotNull String str, boolean z) {
        String str2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            int i2 = onWarmupCompleted + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            str2 = "true";
        } else {
            str2 = "false";
        }
        boolean zAreEqual = Intrinsics.areEqual((String) onWarmupCompleted(new Object[]{uri, str, str2}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789), "true");
        int i4 = IAuthTabCallback + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return zAreEqual;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[PHI: r7
      0x0037: PHI (r7v10 java.lang.String) = (r7v9 java.lang.String), (r7v14 java.lang.String) binds: [B:10:0x0035, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String queryParameter;
        Uri uri = (Uri) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (uri != null) {
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                queryParameter = uri.getQueryParameter(str);
                int i3 = 25 / 0;
                if (queryParameter != null) {
                    Long longOrNull = StringsKt.toLongOrNull(queryParameter);
                    if (longOrNull != null) {
                        int i4 = onWarmupCompleted + 45;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            return Long.valueOf(longOrNull.longValue());
                        }
                        longOrNull.longValue();
                        throw null;
                    }
                }
            } else {
                queryParameter = uri.getQueryParameter(str);
                if (queryParameter != null) {
                }
            }
        }
        return Long.valueOf(jLongValue);
    }

    public static final String IAuthTabCallback(@NotNull Uri uri, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            uri.getQueryParameter(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            return str2;
        }
        int i3 = onWarmupCompleted + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return queryParameter;
    }

    public static final Uri onExtraCallbackWithResult(@NotNull Uri uri, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            uri.buildUpon().clearQuery();
            uri.getQueryParameterNames().iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str3 : uri.getQueryParameterNames()) {
            int i3 = onWarmupCompleted + 121;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String queryParameter = uri.getQueryParameter(str3);
            if (!StringsKt.equals(str, str3, true)) {
                builderClearQuery.appendQueryParameter(str3, queryParameter);
            }
        }
        builderClearQuery.appendQueryParameter(str, str2);
        Uri uriBuild = builderClearQuery.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "");
        return uriBuild;
    }

    public static final String onExtraCallback(@NotNull Uri uri, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullExpressionValue(onExtraCallbackWithResult(uri, str, str2).toString(), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String string = onExtraCallbackWithResult(uri, str, str2).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = IAuthTabCallback + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static final String onNavigationEvent(@NotNull Uri uri, @NotNull Pair<String, String>... pairArr) {
        int i;
        Pair<String, String> pair;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            int i5 = onWarmupCompleted + 43;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            String next = it.next();
            String queryParameter = uri.getQueryParameter(next);
            int length = pairArr.length;
            while (true) {
                if (i >= length) {
                    pair = null;
                    break;
                }
                pair = pairArr[i];
                if (Intrinsics.areEqual(pair.getFirst(), next)) {
                    break;
                }
                int i7 = IAuthTabCallback + 23;
                onWarmupCompleted = i7 % 128;
                i = i7 % 2 == 0 ? i + 41 : i + 1;
            }
            if (pair == null) {
                builderClearQuery.appendQueryParameter(next, queryParameter);
            }
        }
        int length2 = pairArr.length;
        while (i < length2) {
            Pair<String, String> pair2 = pairArr[i];
            builderClearQuery.appendQueryParameter((String) pair2.getFirst(), (String) pair2.getSecond());
            i++;
        }
        String string = builderClearQuery.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Uri uri = (Uri) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(str, "");
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            uri.buildUpon().clearQuery();
            Intrinsics.checkNotNull(queryParameterNames);
            queryParameterNames.iterator();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Set<String> queryParameterNames2 = uri.getQueryParameterNames();
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        Intrinsics.checkNotNull(queryParameterNames2);
        Iterator<T> it = queryParameterNames2.iterator();
        while (!(!it.hasNext())) {
            int i3 = IAuthTabCallback + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str2 = (String) it.next();
            if (!Intrinsics.areEqual(str2, str)) {
                builderClearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
                int i5 = IAuthTabCallback + 115;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Uri uriBuild = builderClearQuery.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "");
        int i7 = onWarmupCompleted + 97;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return uriBuild;
        }
        throw null;
    }

    public static final Uri onWarmupCompleted(@NotNull Uri uri, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (uri.getQueryParameterNames().contains(str)) {
            return uri;
        }
        Uri uriBuild = uri.buildUpon().appendQueryParameter(str, str2).build();
        Intrinsics.checkNotNull(uriBuild);
        int i4 = IAuthTabCallback + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return uriBuild;
        }
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf("", "", 0, 0)), 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Gravity.getAbsoluteGravity(0, 0)), Color.argb(0, 0, 0, 0) + 31, Color.rgb(0, 0, 0) + 16797436, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49124), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i5 = $11 + 13;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 77;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 49123), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, (ViewConfiguration.getLongPressTimeout() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i9 = $11 + 5;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull Uri uri, @NotNull Uri uri2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(uri2, "");
        if (!Intrinsics.areEqual(uri.getScheme(), uri2.getScheme())) {
            return false;
        }
        if (!Intrinsics.areEqual(uri.getAuthority(), uri2.getAuthority())) {
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(uri.getPathSegments(), uri2.getPathSegments())) {
            int i4 = IAuthTabCallback + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IAuthTabCallback;
        int i7 = i6 + 9;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 119;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public static final boolean onNavigationEvent(@NotNull Uri uri, @NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(str, "");
            Uri uri2 = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri2, "");
            onExtraCallbackWithResult(uri, uri2);
            throw null;
        }
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Uri uri3 = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri3, "");
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(uri, uri3);
        int i3 = IAuthTabCallback + 67;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Intent IAuthTabCallback(Uri uri, String str, Bundle bundle, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = "android.intent.action.VIEW";
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            bundle = null;
        }
        return onNavigationEvent(uri, str, bundle);
    }

    public static final Intent onNavigationEvent(@NotNull Uri uri, @NotNull String str, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intent intent = new Intent(str);
        intent.setData(uri);
        if (bundle != null) {
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            intent.putExtras(bundle);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = IAuthTabCallback + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return intent;
    }

    private static final List<String> IAuthTabCallbackStubProxy(Uri uri) {
        Object objEmptyList;
        String str;
        int i = 2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            String host = uri.getHost();
            if (host != null) {
                int i2 = IAuthTabCallback + 3;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str = (String) onWarmupCompleted(new Object[]{host}, 850240680, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -850240678);
                if (str == null) {
                    str = "";
                }
                objEmptyList = kotlin.Result.constructor-impl(StringsKt.split$default(str, new String[]{"."}, false, 0, 6, (Object) null));
            } else {
                str = "";
                objEmptyList = kotlin.Result.constructor-impl(StringsKt.split$default(str, new String[]{"."}, false, 0, 6, (Object) null));
            }
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            objEmptyList = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.exceptionOrNull-impl(objEmptyList) != null) {
            int i3 = IAuthTabCallback + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            objEmptyList = CollectionsKt.emptyList();
        }
        return (List) objEmptyList;
    }

    public static final String onExtraCallback(@NotNull Uri uri) {
        List<String> listIAuthTabCallbackStubProxy;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        CharSequence charSequence3;
        Function1 function1;
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            listIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(uri);
            str = ".";
            charSequence = null;
            charSequence2 = null;
            i = 1;
            charSequence3 = null;
            function1 = null;
            i2 = 18;
        } else {
            Intrinsics.checkNotNullParameter(uri, "");
            listIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(uri);
            str = ".";
            charSequence = null;
            charSequence2 = null;
            i = 0;
            charSequence3 = null;
            function1 = null;
            i2 = 62;
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(listIAuthTabCallbackStubProxy, str, charSequence, charSequence2, i, charSequence3, function1, i2, (Object) null);
        int i5 = IAuthTabCallback + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return strJoinToString$default;
    }

    public static final boolean onNavigationEvent(@NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (42122 - ((Process.getThreadPriority(0) + 20) >> 6)), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 6934), 3);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2146115061);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Drawable.resolveOpacity(0, 0) + 34, 7094 - ExpandableListView.getPackedPositionType(0L), 1319887717, false, "BANK", (Class[]) null);
        }
        objArr[0] = ((Field) objOnExtraCallback).get(null);
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(953707182);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 34 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 7095 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 160994366, false, "INVEST", (Class[]) null);
        }
        objArr[1] = ((Field) objOnExtraCallback2).get(null);
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1995443614);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 35, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7095, -1202778894, false, "INCOME", (Class[]) null);
        }
        objArr[2] = ((Field) objOnExtraCallback3).get(null);
        boolean zOnExtraCallback$19226060 = onExtraCallback$19226060(uri, objArr);
        int i4 = IAuthTabCallback + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback$19226060;
    }

    public static final boolean onTransact(@NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1906579071);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 34 - View.MeasureSpec.getSize(0), 7093 - TextUtils.lastIndexOf("", '0', 0, 0), -1088743663, false, "Companion", (Class[]) null);
        }
        Object obj = null;
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-663027100);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (63467 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 52, 7128 - ExpandableListView.getPackedPositionType(0L), -381944588, false, "onWarmupCompleted", new Class[0]);
            }
            Object[] objArr = (Object[]) ((Method) objOnExtraCallback2).invoke(obj2, null);
            boolean zOnExtraCallback$19226060 = onExtraCallback$19226060(uri, Arrays.copyOf(objArr, objArr.length));
            int i4 = IAuthTabCallback + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return zOnExtraCallback$19226060;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final boolean IAuthTabCallback(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42121), Gravity.getAbsoluteGravity(0, 0) + 17, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6934), 1);
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-756916776);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, 7095 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -475880632, false, "CORE", (Class[]) null);
            }
            objArr[0] = ((Field) objOnExtraCallback).get(null);
            return onExtraCallback$19226060(uri, objArr);
        }
        Intrinsics.checkNotNullParameter(uri, "");
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 42121), KeyEvent.getDeadChar(0, 0) + 17, Color.blue(0) + 6934), 1);
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-756916776);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 34 - TextUtils.getOffsetAfter("", 0), Color.rgb(0, 0, 0) + 16784310, -475880632, false, "CORE", (Class[]) null);
        }
        objArr2[0] = ((Field) objOnExtraCallback2).get(null);
        return onExtraCallback$19226060(uri, objArr2);
    }

    public static final boolean IAuthTabCallbackStub(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (42122 - View.MeasureSpec.getSize(0)), TextUtils.lastIndexOf("", '0') + 18, Color.alpha(0) + 6934), 1);
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(953707182);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 34 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 7093 - ExpandableListView.getPackedPositionChild(0L), 160994366, false, "INVEST", (Class[]) null);
            }
            objArr[0] = ((Field) objOnExtraCallback).get(null);
            return onExtraCallback$19226060(uri, objArr);
        }
        Intrinsics.checkNotNullParameter(uri, "");
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (42122 - View.resolveSizeAndState(0, 0, 0)), MotionEvent.axisFromString("") + 18, 6934 - (ViewConfiguration.getTouchSlop() >> 8)), 1);
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(953707182);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, (ViewConfiguration.getEdgeSlop() >> 16) + 7094, 160994366, false, "INVEST", (Class[]) null);
        }
        objArr2[0] = ((Field) objOnExtraCallback2).get(null);
        return onExtraCallback$19226060(uri, objArr2);
    }

    public static final boolean onWarmupCompleted(@NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (42122 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 6933 - TextUtils.lastIndexOf("", '0', 0, 0)), 1);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2146115061);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 34, (ViewConfiguration.getEdgeSlop() >> 16) + 7094, 1319887717, false, "BANK", (Class[]) null);
        }
        objArr[0] = ((Field) objOnExtraCallback).get(null);
        boolean zOnExtraCallback$19226060 = onExtraCallback$19226060(uri, objArr);
        int i4 = onWarmupCompleted + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return zOnExtraCallback$19226060;
    }

    public static final boolean asInterface(@NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (42170 - AndroidCharacter.getMirror('0')), (KeyEvent.getMaxKeyCode() >> 16) + 17, (ViewConfiguration.getWindowTouchSlop() >> 8) + 6934), 1);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1199488219);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33, (ViewConfiguration.getWindowTouchSlop() >> 8) + 7094, 1983791691, false, "MOBILE", (Class[]) null);
        }
        objArr[0] = ((Field) objOnExtraCallback).get(null);
        boolean zOnExtraCallback$19226060 = onExtraCallback$19226060(uri, objArr);
        int i4 = onWarmupCompleted + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return zOnExtraCallback$19226060;
    }

    public static final boolean IAuthTabCallbackDefault(@NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42122), 17 - (ViewConfiguration.getTapTimeout() >> 16), 6934 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1995443614);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), View.getDefaultSize(0, 0) + 34, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7094, -1202778894, false, "INCOME", (Class[]) null);
        }
        objArr[0] = ((Field) objOnExtraCallback).get(null);
        boolean zOnExtraCallback$19226060 = onExtraCallback$19226060(uri, objArr);
        int i4 = IAuthTabCallback + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback$19226060;
    }

    public static final boolean onExtraCallback$19226060(@NotNull Uri uri, @NotNull Object... objArr) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        if (Build.VERSION.SDK_INT < 27) {
            String string = uri.toString();
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(new URI(string));
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i2 = IAuthTabCallback + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String message = th2.getMessage();
                Object[] objArr2 = new Object[1];
                a(TextUtils.getOffsetBefore("", 0), 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr2);
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "uri_format_violation", message, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), string)), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return false;
            }
        }
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(947746348);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (42122 - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.indexOf("", "", 0) + 17, TextUtils.lastIndexOf("", '0', 0, 0) + 6935, 155027644, false, "getDomainName", new Class[0]);
                }
                arrayList.add(((Method) objOnExtraCallback).invoke(obj2, null));
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            }
        }
        if (arrayList.isEmpty()) {
            int i4 = onWarmupCompleted + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (onExtraCallbackWithResult(host, (String) onWarmupCompleted(new Object[]{(String) it.next()}, 850240680, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -850240678))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean IAuthTabCallback(@NotNull Uri uri, @NotNull String... strArr) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        if (Build.VERSION.SDK_INT < 27) {
            String string = uri.toString();
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(new URI(string));
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String message = th2.getMessage();
                Object[] objArr = new Object[1];
                a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2, (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr);
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "uri_format_violation", message, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), string)), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return false;
            }
        }
        String host = uri.getHost();
        if (host == null) {
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        for (String str : strArr) {
            int i4 = onWarmupCompleted + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (onExtraCallbackWithResult(host, (String) onWarmupCompleted(new Object[]{str}, 850240680, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -850240678))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (StringsKt.endsWith$default(str, str2, false, 2, (Object) null) && (str.length() == str2.length() || str.charAt((str.length() - str2.length()) - 1) == '.')) {
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 63 / 0;
            }
            return true;
        }
        int i4 = onWarmupCompleted + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return false;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        boolean zOnExtraCallback$19226060;
        Uri uri = (Uri) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(uri, "");
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1778253099);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, KeyEvent.getDeadChar(0, 0) + 6997, -1488782267, false, "Companion", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2072658577);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 39 - KeyEvent.keyCodeFromString(""), 7011 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1254800385, false, "onExtraCallback", new Class[0]);
                }
                Object[] objArr2 = (Object[]) ((Method) objOnExtraCallback2).invoke(obj, null);
                zOnExtraCallback$19226060 = onExtraCallback$19226060(uri, Arrays.copyOf(objArr2, objArr2.length));
                int i3 = 99 / 0;
            } else {
                Intrinsics.checkNotNullParameter(uri, "");
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1778253099);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Process.getGidForName("") + 14, 6997 - TextUtils.getCapsMode("", 0, 0), -1488782267, false, "Companion", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback3).get(null);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2072658577);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 39 - ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7010, -1254800385, false, "onExtraCallback", new Class[0]);
                }
                Object[] objArr3 = (Object[]) ((Method) objOnExtraCallback4).invoke(obj2, null);
                zOnExtraCallback$19226060 = onExtraCallback$19226060(uri, Arrays.copyOf(objArr3, objArr3.length));
            }
            return Boolean.valueOf(zOnExtraCallback$19226060);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final boolean asBinder(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        if (!onTransact(uri)) {
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!((Boolean) onWarmupCompleted(new Object[]{uri}, -374875119, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 374875119)).booleanValue()) {
                int i6 = IAuthTabCallback + 23;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        return true;
    }

    public static final String onWarmupCompleted(@NotNull String str) {
        return (String) onWarmupCompleted(new Object[]{str}, 850240680, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -850240678);
    }

    public static final boolean onExtraCallbackWithResult(@NotNull Uri uri) {
        return ((Boolean) onWarmupCompleted(new Object[]{uri}, -374875119, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 374875119)).booleanValue();
    }

    public static final Uri onWarmupCompleted(@NotNull Uri uri, @NotNull String str) {
        return (Uri) onWarmupCompleted(new Object[]{uri, str}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971);
    }

    public static final long onWarmupCompleted(@Nullable Uri uri, @NotNull String str, long j) {
        return ((Long) onWarmupCompleted(new Object[]{uri, str, Long.valueOf(j)}, -1773045567, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1773045570)).longValue();
    }

    public static final String onNavigationEvent(@Nullable Uri uri, @NotNull String str, @Nullable String str2) {
        return (String) onWarmupCompleted(new Object[]{uri, str, str2}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
    }
}
