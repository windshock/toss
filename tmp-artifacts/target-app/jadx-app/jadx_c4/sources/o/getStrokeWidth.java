package o;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import o.SessionTrackerb;
import o.getStrokeWidth;
import o.pxToDp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getStrokeWidth {
    private static final Set<String> IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStubProxy;
    private static long asInterface;
    public static final getStrokeWidth onExtraCallback;
    private static final float onExtraCallbackWithResult;
    private static final float onNavigationEvent;
    private static final WeakHashMap<Object, Long> onWarmupCompleted;
    private static final byte[] $$a = {101, 74, 115, 66};
    private static final int $$b = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[deleteProfile.values().length];
            try {
                iArr[deleteProfile.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[deleteProfile.LIGHT.ordinal()] = 2;
                int i = IAuthTabCallback + 71;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[deleteProfile.NIGHT.ordinal()] = 3;
                int i3 = onExtraCallback + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        int i3 = i * 4;
        int i4 = 4 - (s2 * 3);
        int i5 = 97 - (s * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i5 += i4;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            int i8 = i2 + 1;
            i6 = i4;
            i4 = bArr[i4];
            i7 = i8;
            i5 += i4;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    public static /* synthetic */ void IAuthTabCallback(Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, View view, Ref.BooleanRef booleanRef2, Function0 function0, View view2, float f, List list, Function2 function2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(-1950209263, new Object[]{objectRef, booleanRef, view, booleanRef2, function0, view2, Float.valueOf(f), list, function2}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1950209269, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        int i4 = IAuthTabCallbackStub + 125;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(Context context, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(context, str);
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallback = onExtraCallback(context, str);
        int i3 = IAuthTabCallbackStub + 87;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Set set, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(set, str);
        int i4 = onTransact + 59;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public static /* synthetic */ boolean IAuthTabCallback(deleteProfile deleteprofile, boolean z) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {deleteprofile, Boolean.valueOf(z)};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        if (i3 != 0) {
            zBooleanValue = ((Boolean) onExtraCallback(-1768828531, objArr, iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, 1768828534, iOnWarmupCompleted4)).booleanValue();
            int i4 = 55 / 0;
        } else {
            zBooleanValue = ((Boolean) onExtraCallback(-1768828531, objArr, iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, 1768828534, iOnWarmupCompleted4)).booleanValue();
        }
        int i5 = onTransact + 41;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~i4) | i7;
        int i9 = ~i8;
        int i10 = (~(i7 | i5)) | i9;
        int i11 = (~(i7 | (~i5) | i4)) | (~(i8 | i5)) | (~(i | i5 | i4));
        int i12 = (~(i4 | i)) | i5 | i9;
        int i13 = i + i5 + i2 + (5090439 * i3) + ((-1076018391) * i6);
        int i14 = i13 * i13;
        int i15 = ((1425068070 * i) - 1475346432) + (1088368604 * i5) + (i10 * (-168349733)) + ((-168349733) * i11) + (168349733 * i12) + (1256718336 * i2) + (1616379904 * i3) + ((-1222115328) * i6) + (1028194304 * i14);
        int i16 = (i * (-1092730454)) + 799718796 + (i5 * (-1092731068)) + (i10 * (-307)) + (i11 * (-307)) + (i12 * 307) + (i2 * (-1092730761)) + (i3 * 1582232257) + (i6 * 741505039) + (i14 * (-1125187584));
        switch (i15 + (i16 * i16 * (-410583040))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            default:
                Intent intent = (Intent) objArr[1];
                Context context = (Context) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i17 = 2 % 2;
                int i18 = onTransact;
                int i19 = i18 + 117;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
                if (iIntValue != 0) {
                    int i21 = i18 + 97;
                    IAuthTabCallbackStub = i21 % 128;
                    int i22 = i21 % 2;
                    intent.addFlags(iIntValue);
                }
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                return null;
        }
    }

    public static /* synthetic */ Throwable onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Throwable thOnNavigationEvent = onNavigationEvent(th);
        int i4 = IAuthTabCallbackStub + 117;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return thOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Throwable onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Throwable thIAuthTabCallback = IAuthTabCallback(th);
        int i4 = IAuthTabCallbackStub + 97;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return thIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        View view = (View) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        Function1 function1 = (Function1) objArr[3];
        View view2 = (View) objArr[4];
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onWarmupCompleted(str, view, jLongValue, function1, view2);
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(ResolveInfo resolveInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) onExtraCallback(-989822791, new Object[]{resolveInfo}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 989822799, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        int i4 = IAuthTabCallbackStub + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        View view = (View) objArr[1];
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[2];
        Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        View view2 = (View) objArr[5];
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        float fFloatValue = ((Number) objArr[7]).floatValue();
        float fFloatValue2 = ((Number) objArr[8]).floatValue();
        List list = (List) objArr[9];
        Function2 function2 = (Function2) objArr[10];
        Function1 function1 = (Function1) objArr[11];
        boolean zBooleanValue2 = ((Boolean) objArr[12]).booleanValue();
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[13];
        Function0 function0 = (Function0) objArr[14];
        View view3 = (View) objArr[15];
        MotionEvent motionEvent = (MotionEvent) objArr[16];
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(str, view, booleanRef, booleanRef2, jLongValue, view2, zBooleanValue, fFloatValue, fFloatValue2, list, function2, function1, zBooleanValue2, objectRef, function0, view3, motionEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(str, view, booleanRef, booleanRef2, jLongValue, view2, zBooleanValue, fFloatValue, fFloatValue2, list, function2, function1, zBooleanValue2, objectRef, function0, view3, motionEvent);
        int i3 = onTransact + 117;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(zIAuthTabCallback);
        }
        int i4 = 98 / 0;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    private getStrokeWidth() {
    }

    public static final /* synthetic */ WeakHashMap onExtraCallbackWithResult() {
        WeakHashMap<Object, Long> weakHashMap;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            weakHashMap = onWarmupCompleted;
            int i4 = 53 / 0;
        } else {
            weakHashMap = onWarmupCompleted;
        }
        int i5 = i3 + 71;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return weakHashMap;
    }

    static {
        IAuthTabCallbackStubProxy = 1;
        IAuthTabCallback();
        onExtraCallback = new getStrokeWidth();
        IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"http", "https"});
        onWarmupCompleted = new WeakHashMap<>();
        onNavigationEvent = 0.099f;
        onExtraCallbackWithResult = 0.5f;
        int i = asBinder + 109;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final int IAuthTabCallback(@NotNull Context context, @Nullable String str, int i) {
        Object obj;
        Object objValueOf;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 25;
        onTransact = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (str == null || StringsKt.isBlank(str)) {
            return i;
        }
        int i4 = onTransact + 85;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(Integer.valueOf(Color.parseColor(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = kotlin.Result.Companion;
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            objValueOf = kotlin.Result.constructor-impl(Integer.valueOf(setBodyokhttp.IAuthTabCallback(resources, str, 0)));
        } catch (Throwable th2) {
            Result.Companion companion4 = kotlin.Result.Companion;
            objValueOf = kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
        }
        if (!(!kotlin.Result.onExtraCallback(objValueOf))) {
            int i6 = IAuthTabCallbackStub + 93;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            objValueOf = Integer.valueOf(i);
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i8 = onTransact + 3;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            obj = objValueOf;
        }
        int iIntValue = ((Number) obj).intValue();
        int i10 = onTransact + 69;
        IAuthTabCallbackStub = i10 % 128;
        if (i10 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Rect rect = (Rect) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rect, "");
            int i3 = rect.left;
            int i4 = rect.right;
            throw null;
        }
        Intrinsics.checkNotNullParameter(rect, "");
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = (int) fFloatValue;
        if (i5 <= i7 && i7 <= i6) {
            int i8 = rect.top;
            int i9 = rect.bottom;
            int i10 = (int) fFloatValue2;
            if (i8 <= i10) {
                int i11 = onTransact + 85;
                IAuthTabCallbackStub = i11 % 128;
                int i12 = i11 % 2;
                if (i10 <= i9) {
                    return true;
                }
            }
        }
        int i13 = IAuthTabCallbackStub + 93;
        onTransact = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 103;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i / i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 59697), 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0') + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(asInterface), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 46134), 31 - Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ((byte) KeyEvent.getModifierMetaStateMask())), 43 - ImageFormat.getBitsPerPixel(0), ExpandableListView.getPackedPositionGroup(0L) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(IAuthTabCallbackDefault[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - ((byte) KeyEvent.getModifierMetaStateMask())), ((Process.getThreadPriority(0) + 20) >> 6) + 17, 10973 - View.MeasureSpec.getSize(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(asInterface), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46134), 30 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49122), 44 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0') + 1495, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 49123), (Process.myTid() >> 22) + 44, 1493 - Process.getGidForName(""), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                int i7 = $11 + 1;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th5) {
                Throwable cause5 = th5.getCause();
                if (cause5 == null) {
                    throw th5;
                }
                throw cause5;
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[PHI: r3 r7
      0x0031: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:8:0x002f, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r7v2 int) = (r7v1 int), (r7v5 int) binds: [B:8:0x002f, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback(@NotNull View view, float f, float f2) {
        int right;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 61;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int left = view.getLeft();
            right = view.getRight();
            i = (int) f;
            int i4 = 82 / 0;
            if (left <= i) {
                if (i <= right) {
                    int top = view.getTop();
                    int bottom = view.getBottom();
                    int i5 = (int) f2;
                    if (top <= i5 && i5 <= bottom) {
                        int i6 = IAuthTabCallbackStub + 25;
                        onTransact = i6 % 128;
                        int i7 = i6 % 2;
                        return true;
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            int left2 = view.getLeft();
            right = view.getRight();
            i = (int) f;
            if (left2 <= i) {
            }
        }
        return false;
    }

    public static /* synthetic */ void onExtraCallback(getStrokeWidth getstrokewidth, View view, boolean z, Integer num, int i, View view2, List list, float f, float f2, Function2 function2, boolean z2, long j, String str, Function0 function0, Function1 function1, int i2, Object obj) {
        Integer num2;
        int iOnNavigationEvent;
        View view3;
        long j2;
        String str2;
        Function0 function02;
        DisplayMetrics displayMetrics;
        int i3;
        int i4 = 2 % 2;
        boolean z3 = (i2 & 1) != 0 ? true : z;
        if ((i2 & 2) != 0) {
            int i5 = IAuthTabCallbackStub + 15;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 96 / 0;
            }
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i2 & 4) != 0) {
            int i7 = IAuthTabCallbackStub + 93;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                displayMetrics = view.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                i3 = 104;
            } else {
                displayMetrics = view.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                i3 = 20;
            }
            iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(i3), displayMetrics);
        } else {
            iOnNavigationEvent = i;
        }
        if ((i2 & 8) != 0) {
            int i8 = IAuthTabCallbackStub + 23;
            onTransact = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            view3 = view;
        } else {
            view3 = view2;
        }
        List list2 = (i2 & 16) != 0 ? null : list;
        float f3 = (i2 & 32) != 0 ? 1.0f : f;
        float f4 = (i2 & 64) != 0 ? 0.96f : f2;
        Function2 function22 = (i2 & 128) != 0 ? null : function2;
        boolean z4 = (i2 & 256) != 0 ? false : z2;
        if ((i2 & 512) != 0) {
            int i9 = onTransact + 51;
            IAuthTabCallbackStub = i9 % 128;
            j2 = 300;
            if (i9 % 2 != 0) {
                int i10 = 32 / 0;
            }
        } else {
            j2 = j;
        }
        if ((i2 & 1024) != 0) {
            int i11 = onTransact + 67;
            IAuthTabCallbackStub = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 2048) != 0) {
            int i12 = onTransact + 121;
            IAuthTabCallbackStub = i12 % 128;
            int i13 = i12 % 2;
            function02 = null;
        } else {
            function02 = function0;
        }
        getstrokewidth.IAuthTabCallback(view, z3, num2, iOnNavigationEvent, view3, list2, f3, f4, function22, z4, j2, str2, function02, function1);
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ View $this_setOnClickWithAnimListener;
        final /* synthetic */ String $throttleGroupId;
        final /* synthetic */ long $throttleInterval;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(long j, String str, View view, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$throttleInterval = j;
            this.$throttleGroupId = str;
            this.$this_setOnClickWithAnimListener = view;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$throttleInterval, this.$throttleGroupId, this.$this_setOnClickWithAnimListener, access13800Var);
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onextracallbackwithresultCreate.invokeSuspend(unit);
            }
            onextracallbackwithresultCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                long j = this.$throttleInterval;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallback + 65;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            WeakHashMap weakHashMapOnExtraCallbackWithResult = getStrokeWidth.onExtraCallbackWithResult();
            Object obj2 = this.$throttleGroupId;
            if (obj2 == null) {
                int i6 = onExtraCallback + 67;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    obj2 = this.$this_setOnClickWithAnimListener;
                    int i7 = 21 / 0;
                } else {
                    obj2 = this.$this_setOnClickWithAnimListener;
                }
            }
            weakHashMapOnExtraCallbackWithResult.remove(obj2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(String str, View view, long j, Function1 function1, View view2) {
        String str2;
        int i = 2 % 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        WeakHashMap<Object, Long> weakHashMap = onWarmupCompleted;
        if (str == null) {
            int i2 = onTransact + 99;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str2 = view;
        } else {
            str2 = str;
        }
        Long l = weakHashMap.get(str2);
        long jLongValue = l != null ? l.longValue() : 0L;
        if (j != 0) {
            int i3 = onTransact + 47;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            if (jElapsedRealtime - jLongValue < j) {
                return;
            }
        }
        if (str == null) {
            int i5 = IAuthTabCallbackStub + 17;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            str = view;
        }
        weakHashMap.put(str, Long.valueOf(jElapsedRealtime));
        function1.invoke((Object) null);
    }

    private static final void IAuthTabCallback(Ref.ObjectRef<Runnable> objectRef, View view) {
        int i = 2 % 2;
        Runnable runnable = (Runnable) objectRef.element;
        if (runnable != null) {
            int i2 = onTransact + 41;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            view.removeCallbacks(runnable);
            int i4 = IAuthTabCallbackStub + 9;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        objectRef.element = null;
    }

    private static final void IAuthTabCallback(View view, float f, List<? extends View> list, Function2<? super Integer, ? super runOnUiThreadDelayed, Unit> function2, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 1;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Drawable background = view.getBackground();
        if (background != null) {
            background.setState(new int[0]);
        }
        view.setPressed(false);
        List listMutableListOf = CollectionsKt.mutableListOf(new Rally[]{onExtraCallback.onExtraCallback(view, f)});
        if (list != null) {
            int i5 = onTransact + 39;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            Iterator<T> it = list.iterator();
            int i7 = onTransact + 55;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            while (it.hasNext()) {
                int i9 = IAuthTabCallbackStub + 23;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                listMutableListOf.add(onExtraCallback.onExtraCallback((View) it.next(), f));
            }
        }
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, listMutableListOf, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i), runonuithreaddelayedOnExtraCallbackWithResult);
            int i11 = onTransact + 43;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[0];
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[1];
        View view = (View) objArr[2];
        Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) objArr[3];
        Function0 function0 = (Function0) objArr[4];
        View view2 = (View) objArr[5];
        float fFloatValue = ((Number) objArr[6]).floatValue();
        List list = (List) objArr[7];
        Function2 function2 = (Function2) objArr[8];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        objectRef.element = null;
        if (!(!booleanRef.element)) {
            int i4 = onTransact + 11;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                view.isAttachedToWindow();
                obj.hashCode();
                throw null;
            }
            if (view.isAttachedToWindow() && !(!view.isShown())) {
                booleanRef2.element = true;
                booleanRef.element = false;
                IAuthTabCallback(view2, fFloatValue, list, function2, 3);
                function0.invoke();
            }
        }
        return null;
    }

    private static final void onNavigationEvent(final Function0<Unit> function0, final Ref.ObjectRef<Runnable> objectRef, final View view, final Ref.BooleanRef booleanRef, final Ref.BooleanRef booleanRef2, final View view2, final float f, final List<? extends View> list, final Function2<? super Integer, ? super runOnUiThreadDelayed, Unit> function2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(objectRef, view);
            int i3 = 41 / 0;
            if (function0 == null) {
                return;
            }
        } else {
            IAuthTabCallback(objectRef, view);
            if (function0 == null) {
                return;
            }
        }
        Runnable runnable = new Runnable() { // from class: im.toss.ads_sdk.NativeAdsUtils$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 91;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    getStrokeWidth.IAuthTabCallback(objectRef, booleanRef, view, booleanRef2, function0, view2, f, list, function2);
                } else {
                    getStrokeWidth.IAuthTabCallback(objectRef, booleanRef, view, booleanRef2, function0, view2, f, list, function2);
                    throw null;
                }
            }
        };
        objectRef.element = runnable;
        view.postDelayed(runnable, 2000L);
        int i4 = onTransact + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final View view, final boolean z, @Nullable Integer num, int i, @NotNull final View view2, @Nullable final List<? extends View> list, final float f, final float f2, @Nullable final Function2<? super Integer, ? super runOnUiThreadDelayed, Unit> function2, final boolean z2, final long j, @Nullable final String str, @Nullable final Function0<Unit> function0, @NotNull final Function1<? super MotionEvent, Unit> function1) {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 85;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(view);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) != null) {
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(j, str, view, null), 3, (Object) null);
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (varyFields.onWarmupCompleted(context)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: im.toss.ads_sdk.NativeAdsUtils$$ExternalSyntheticLambda5
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 19;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        getStrokeWidth.onExtraCallback(-2095627421, new Object[]{str, view, Long.valueOf(j), function1, view3}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 2095627423, GriverCommonAbilityProxyImpl.onWarmupCompleted());
                        return;
                    }
                    getStrokeWidth.onExtraCallback(-2095627421, new Object[]{str, view, Long.valueOf(j), function1, view3}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 2095627423, GriverCommonAbilityProxyImpl.onWarmupCompleted());
                    throw null;
                }
            });
            int i5 = onTransact + 81;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        if (num != null) {
            int i7 = IAuthTabCallbackStub + 91;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 11 / 0;
                if (z) {
                    Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    Drawable drawableIAuthTabCallback = IAuthTabCallback(context2, i, num.intValue());
                    drawableIAuthTabCallback.setHotspot(view2.getWidth() / 2.0f, view2.getHeight() / 2.0f);
                    view2.setBackground(drawableIAuthTabCallback);
                } else {
                    Context context3 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    Drawable drawableIAuthTabCallback2 = IAuthTabCallback(context3, i, num.intValue());
                    drawableIAuthTabCallback2.setHotspot(view2.getWidth() / 2.0f, view2.getHeight() / 2.0f);
                    view2.setForeground(drawableIAuthTabCallback2);
                }
            } else if (z) {
            }
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.ads_sdk.NativeAdsUtils$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 99;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                String str2 = str;
                View view4 = view;
                Ref.BooleanRef booleanRef3 = booleanRef2;
                Ref.BooleanRef booleanRef4 = booleanRef;
                long j2 = j;
                View view5 = view2;
                boolean z3 = z;
                float f3 = f;
                float f4 = f2;
                List list2 = list;
                Function2 function22 = function2;
                Function1 function12 = function1;
                boolean z4 = z2;
                boolean zBooleanValue = ((Boolean) getStrokeWidth.onExtraCallback(585868643, new Object[]{str2, view4, booleanRef3, booleanRef4, Long.valueOf(j2), view5, Boolean.valueOf(z3), Float.valueOf(f3), Float.valueOf(f4), list2, function22, function12, Boolean.valueOf(z4), objectRef, function0, view3, motionEvent}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -585868639, GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue();
                int i12 = onWarmupCompleted + 117;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    return zBooleanValue;
                }
                throw null;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean IAuthTabCallback(String str, View view, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, long j, View view2, boolean z, float f, float f2, List list, Function2 function2, Function1 function1, boolean z2, Ref.ObjectRef objectRef, Function0 function0, View view3, MotionEvent motionEvent) {
        String str2;
        boolean z3;
        long jLongValue;
        int i = 2 % 2;
        int action = motionEvent.getAction();
        if (action != 0) {
            int i2 = IAuthTabCallbackStub + 121;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (action == 1) {
                booleanRef.element = false;
                IAuthTabCallback((Ref.ObjectRef<Runnable>) objectRef, view);
                float width = view3.getWidth();
                float x = motionEvent.getX();
                if (0.0f <= x) {
                    int i4 = onTransact + 33;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    if (x <= width) {
                        float height = view3.getHeight();
                        float y = motionEvent.getY();
                        if (0.0f <= y && y <= height && !booleanRef2.element) {
                            function1.invoke(motionEvent);
                        }
                        Drawable background = view2.getBackground();
                        if (background != null) {
                            background.setState(new int[0]);
                        }
                        view2.setPressed(false);
                        if (!z2) {
                            List listMutableListOf = CollectionsKt.mutableListOf(new Rally[]{onExtraCallback.onExtraCallback(view2, f)});
                            if (list != null) {
                                int i6 = onTransact + 81;
                                IAuthTabCallbackStub = i6 % 128;
                                int i7 = i6 % 2;
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    listMutableListOf.add(onExtraCallback.onExtraCallback((View) it.next(), f));
                                }
                            }
                            runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, listMutableListOf, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
                            if (function2 != null) {
                                function2.invoke(Integer.valueOf(motionEvent.getAction()), runonuithreaddelayedOnExtraCallbackWithResult);
                            }
                        }
                    }
                }
            } else if (action == 2) {
                onWarmupCompleted.put(str == null ? view : str, Long.valueOf(SystemClock.elapsedRealtime()));
                float width2 = view3.getWidth();
                float x2 = motionEvent.getX();
                if (0.0f > x2 || x2 > width2) {
                    booleanRef.element = false;
                    IAuthTabCallback((Ref.ObjectRef<Runnable>) objectRef, view);
                    IAuthTabCallback(view2, f, list, function2, motionEvent.getAction());
                } else {
                    float height2 = view3.getHeight();
                    float y2 = motionEvent.getY();
                    if (0.0f > y2 || y2 > height2) {
                    }
                }
            } else if (action == 3) {
                booleanRef.element = false;
                IAuthTabCallback((Ref.ObjectRef<Runnable>) objectRef, view);
                IAuthTabCallback(view2, f, list, function2, motionEvent.getAction());
            }
            return true;
        }
        booleanRef2.element = false;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        WeakHashMap<Object, Long> weakHashMap = onWarmupCompleted;
        if (str == null) {
            int i8 = onTransact + 101;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            str2 = view;
        } else {
            str2 = str;
        }
        Long l = weakHashMap.get(str2);
        if (l != null) {
            int i10 = IAuthTabCallbackStub + 13;
            onTransact = i10 % 128;
            if (i10 % 2 == 0) {
                jLongValue = l.longValue();
                z3 = false;
                int i11 = 99 / 0;
            } else {
                z3 = false;
                jLongValue = l.longValue();
            }
        } else {
            z3 = false;
            jLongValue = 0;
        }
        if (j != 0 && jElapsedRealtime - jLongValue < j) {
            return z3;
        }
        weakHashMap.put(str == null ? view : str, Long.valueOf(jElapsedRealtime));
        booleanRef.element = true;
        if (!(!Intrinsics.areEqual(view2, view))) {
            int i12 = onTransact + 55;
            IAuthTabCallbackStub = i12 % 128;
            int i13 = i12 % 2;
            if (z) {
                Drawable background2 = view2.getBackground();
                if (background2 != null) {
                    background2.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
            } else {
                Drawable foreground = view2.getForeground();
                if (foreground != null) {
                    foreground.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
            }
        }
        Drawable background3 = view2.getBackground();
        if (background3 != null) {
            background3.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
        }
        view2.setPressed(true);
        List listMutableListOf2 = CollectionsKt.mutableListOf(new Rally[]{onExtraCallback.onExtraCallbackWithResult(view2, f, f2)});
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int i14 = IAuthTabCallbackStub + 13;
                onTransact = i14 % 128;
                if (i14 % 2 == 0) {
                    listMutableListOf2.add(onExtraCallback.onExtraCallbackWithResult((View) it2.next(), f, f2));
                    int i15 = 89 / 0;
                } else {
                    listMutableListOf2.add(onExtraCallback.onExtraCallbackWithResult((View) it2.next(), f, f2));
                }
            }
        }
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult2 = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, listMutableListOf2, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
        if (function2 != null) {
            int i16 = onTransact + 39;
            IAuthTabCallbackStub = i16 % 128;
            int i17 = i16 % 2;
            function2.invoke(Integer.valueOf(motionEvent.getAction()), runonuithreaddelayedOnExtraCallbackWithResult2);
        }
        onNavigationEvent(function0, objectRef, view, booleanRef, booleanRef2, view2, f, list, function2);
        return true;
    }

    private final Rally onExtraCallback(View view, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(view.getScaleX()), Float.valueOf(f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = onTransact + 65;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return rally;
    }

    private final Rally onExtraCallbackWithResult(View view, float f, float f2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(view.getScaleX()), Float.valueOf(f2 * f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = onTransact + 55;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return rally;
        }
        throw null;
    }

    private final Drawable IAuthTabCallback(Context context, int i, int i2) {
        RippleDrawable rippleDrawable;
        int i3 = 2 % 2;
        RippleDrawable rippleDrawable2 = (deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{M_.onExtraCallback, context, Float.valueOf(i)}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        if (rippleDrawable2 != null) {
            int i4 = IAuthTabCallbackStub + 29;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            rippleDrawable = rippleDrawable2;
        } else {
            rippleDrawable = null;
        }
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ColorStateList.valueOf(i2));
        }
        int i6 = onTransact + 47;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return rippleDrawable2;
        }
        throw null;
    }

    public final int onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        int i3 = IAuthTabCallbackStub + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull String str) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackStub = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(str, "");
                Result.Companion companion = kotlin.Result.Companion;
                IAuthTabCallback(onExtraCallback, context, str, 0, 5, null);
                unit = Unit.INSTANCE;
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(str, "");
                Result.Companion companion2 = kotlin.Result.Companion;
                IAuthTabCallback(onExtraCallback, context, str, 0, 2, null);
                unit = Unit.INSTANCE;
            }
            kotlin.Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion3 = kotlin.Result.Companion;
            kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getStrokeWidth getstrokewidth, Context context, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 3;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 17;
            int i7 = i6 % 128;
            onTransact = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 11;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            str3 = null;
        }
        getstrokewidth.IAuthTabCallback(context, str, str2, str3);
    }

    public final void IAuthTabCallback(@NotNull Context context, @NotNull String str, @NotNull String str2, @Nullable String str3) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Response response = Response.onNavigationEvent;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        SessionTrackerb smallIconId = ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(applicationContext, SessionTrackerb.onExtraCallback.class)).getSmallIconId();
        if (!smallIconId.onExtraCallback(str)) {
            smallIconId.onExtraCallbackWithResult(str, SessionTrackerb.onExtraCallbackWithResult.DIRECT_LAUNCH, str2, str3);
            return;
        }
        int i4 = IAuthTabCallbackStub + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(getStrokeWidth getstrokewidth, Context context, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onTransact;
        int i5 = i4 + 15;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0 ? (i2 & 2) != 0 : (i2 & 3) != 0) {
            int i6 = i4 + 55;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i4 + 119;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        getstrokewidth.onExtraCallback(context, str, i);
        int i10 = IAuthTabCallbackStub + 61;
        onTransact = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0083, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
    
        r0 = new android.content.Intent("android.intent.action.VIEW");
        r0.setData(android.net.Uri.parse(r17));
        onExtraCallback(-993424328, new java.lang.Object[]{o.getStrokeWidth.onExtraCallback, r0, r16, java.lang.Integer.valueOf(r18)}, com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted(), com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted(), com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted(), 993424328, com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted());
        r16.startActivity(r0);
        onExtraCallbackWithResult(r15, r16, r17, "ads_sdk_landing", null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        if (((java.lang.Boolean) onExtraCallback(-2112996633, new java.lang.Object[]{r15, r16, r17, java.lang.Integer.valueOf(r18)}, com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted(), com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted(), com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted(), 2112996634, com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
    
        if (((java.lang.Boolean) onExtraCallback(-2112996633, new java.lang.Object[]{r15, r16, r17, java.lang.Integer.valueOf(r18)}, com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted(), com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted(), com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted(), 2112996634, com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007a, code lost:
    
        r1 = o.getStrokeWidth.IAuthTabCallbackStub + 61;
        o.getStrokeWidth.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull Context context, @NotNull String str, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 43;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = 80 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Uri uri;
        String strIAuthTabCallback;
        Object obj;
        getStrokeWidth getstrokewidth = (getStrokeWidth) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if (!UtilsKtExternalSyntheticLambda11.IAuthTabCallback(UtilsKtExternalSyntheticLambda11.IAuthTabCallback, "ads.nativeRedirector.universalLink.enabled", false, null, 6, null) || (uri = (Uri) onExtraCallback(-1017301268, new Object[]{getstrokewidth, str}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1017301275, GriverCommonAbilityProxyImpl.onWarmupCompleted())) == null || (strIAuthTabCallback = getstrokewidth.IAuthTabCallback(context, uri)) == null) {
            return false;
        }
        try {
            Result.Companion companion = kotlin.Result.Companion;
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setPackage(strIAuthTabCallback);
            onExtraCallback(-993424328, new Object[]{onExtraCallback, intent, context, Integer.valueOf(iIntValue)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 993424328, GriverCommonAbilityProxyImpl.onWarmupCompleted());
            context.startActivity(intent);
            obj = kotlin.Result.constructor-impl(Boolean.TRUE);
            int i2 = onTransact + 99;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.exceptionOrNull-impl(obj) != null) {
            obj = Boolean.FALSE;
            int i4 = onTransact + 45;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            getstrokewidth.IAuthTabCallback(context, string, "ads_sdk_landing", str);
        }
        return Boolean.valueOf(zBooleanValue);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        Object obj;
        Uri uri;
        String lowerCase;
        String str = (String) objArr[1];
        int i = 2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(Uri.parse(str));
            int i2 = onTransact + 25;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = null;
        if (kotlin.Result.onExtraCallback(obj)) {
            obj = null;
        }
        Uri uri2 = (Uri) obj;
        if (uri2 == null) {
            return null;
        }
        String scheme = uri2.getScheme();
        Object[] objArr2 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 1, 8 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        if (!StringsKt.equals(scheme, ((String) objArr2[0]).intern(), true)) {
            int i4 = IAuthTabCallbackStub + 23;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 46 / 0;
            }
            return null;
        }
        if (!StringsKt.equals(uri2.getHost(), "web", true)) {
            int i6 = onTransact + 105;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        if (!StringsKt.equals(uri2.getQueryParameter("external"), "false", true)) {
            return null;
        }
        Object[] objArr3 = new Object[1];
        a(View.getDefaultSize(0, 0) + 9, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr3);
        String queryParameter = uri2.getQueryParameter(((String) objArr3[0]).intern());
        if (queryParameter == null || (uri = Uri.parse(queryParameter)) == null) {
            return null;
        }
        int i8 = onTransact + 47;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 != 0) {
            Set<String> set = IAuthTabCallback;
            uri.getScheme();
            obj2.hashCode();
            throw null;
        }
        Set<String> set2 = IAuthTabCallback;
        String scheme2 = uri.getScheme();
        if (scheme2 != null) {
            lowerCase = scheme2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        if (!CollectionsKt.contains(set2, lowerCase)) {
            return null;
        }
        return uri;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        ResolveInfo resolveInfo = (ResolveInfo) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo == null) {
            return null;
        }
        int i4 = IAuthTabCallbackStub + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        String str = activityInfo.packageName;
        if (i5 == 0) {
            int i6 = 80 / 0;
        }
        return str;
    }

    private static final boolean onExtraCallback(Context context, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        boolean z = !Intrinsics.areEqual(str, context.getPackageName());
        int i4 = IAuthTabCallbackStub + 97;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return z;
    }

    private static final boolean onNavigationEvent(Set set, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
        } else {
            Intrinsics.checkNotNullParameter(str, "");
        }
        return !set.contains(str);
    }

    public final String IAuthTabCallback(@NotNull final Context context, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        final Set<String> setOnNavigationEvent = onNavigationEvent(context);
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        String str = (String) clearRevision.asBinder(clearRevision.onNavigationEvent(clearRevision.onWarmupCompleted(clearRevision.onWarmupCompleted(clearRevision.asInterface(CollectionsKt.asSequence(listQueryIntentActivities), new Function1() { // from class: im.toss.ads_sdk.NativeAdsUtils$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 15;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String strOnNavigationEvent = getStrokeWidth.onNavigationEvent((ResolveInfo) obj);
                int i5 = onExtraCallback + 95;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return strOnNavigationEvent;
            }
        }), new Function1() { // from class: im.toss.ads_sdk.NativeAdsUtils$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 109;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(getStrokeWidth.IAuthTabCallback(context, (String) obj));
                int i5 = onExtraCallback + 117;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        }), new Function1() { // from class: im.toss.ads_sdk.NativeAdsUtils$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 119;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(getStrokeWidth.IAuthTabCallback(setOnNavigationEvent, (String) obj));
                int i5 = onNavigationEvent + 99;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return boolValueOf;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        })));
        int i2 = onTransact + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static final Throwable IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return th.getCause();
        }
        th.getCause();
        throw null;
    }

    private static final Throwable onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            return th.getCause();
        }
        Intrinsics.checkNotNullParameter(th, "");
        th.getCause();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Sequence<Throwable> IAuthTabCallback(@NotNull final Throwable th, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Sequence<Throwable> sequenceOnWarmupCompleted = clearRevision.onWarmupCompleted(clearRevision.onExtraCallback(new Function0() { // from class: im.toss.ads_sdk.NativeAdsUtils$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 79;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Throwable thOnExtraCallbackWithResult = getStrokeWidth.onExtraCallbackWithResult(th);
                int i6 = IAuthTabCallback + 7;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return thOnExtraCallbackWithResult;
            }
        }, new Function1() { // from class: im.toss.ads_sdk.NativeAdsUtils$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 81;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Throwable thOnExtraCallback = getStrokeWidth.onExtraCallback((Throwable) obj);
                int i6 = onWarmupCompleted + 33;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    return thOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), i);
        int i3 = onTransact + 15;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return sequenceOnWarmupCompleted;
    }

    public static /* synthetic */ boolean onWarmupCompleted(getStrokeWidth getstrokewidth, Throwable th, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onTransact + 119;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            i = 2;
        }
        boolean zOnWarmupCompleted = getstrokewidth.onWarmupCompleted(th, i);
        int i5 = IAuthTabCallbackStub + 99;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final boolean onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        String name = th.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        if (StringsKt.startsWith$default(name, "java.net", false, 2, (Object) null)) {
            return true;
        }
        String name2 = th.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        if (StringsKt.startsWith$default(name2, "javax.net", false, 2, (Object) null)) {
            int i2 = IAuthTabCallbackStub + 9;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        String name3 = th.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name3, "");
        if (StringsKt.startsWith$default(name3, "java.io", false, 2, (Object) null)) {
            int i4 = IAuthTabCallbackStub + 5;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (th instanceof IOException) {
            return true;
        }
        if (!(th instanceof HttpException)) {
            return th instanceof MovableContentKtExternalSyntheticLambda9;
        }
        int i6 = IAuthTabCallbackStub + 103;
        onTransact = i6 % 128;
        return i6 % 2 != 0;
    }

    public final boolean onWarmupCompleted(@NotNull Throwable th, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            onWarmupCompleted(th);
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        if (!onWarmupCompleted(th)) {
            Iterator itIAuthTabCallback = IAuthTabCallback(th, i).IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
                int i4 = IAuthTabCallbackStub + 29;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 0;
                    if (onWarmupCompleted((Throwable) itIAuthTabCallback.next())) {
                    }
                } else if (onWarmupCompleted((Throwable) itIAuthTabCallback.next())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult(@NotNull final deleteProfile deleteprofile, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        boolean z = true;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = IAuthTabCallbackStub + 19;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1098495004, i, -1, "im.toss.ads_sdk.NativeAdsUtils.rememberIsDarkTheme (NativeAdsUtils.kt:477)");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1098495004, i, -1, "im.toss.ads_sdk.NativeAdsUtils.rememberIsDarkTheme (NativeAdsUtils.kt:477)");
        }
        final boolean zOnExtraCallbackWithResult = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0);
        Object[] objArr = new Object[0];
        if ((((i & 14) ^ 6) <= 4 || !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(deleteprofile.ordinal())) && (i & 6) != 4) {
            z = false;
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zOnExtraCallbackWithResult);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback | z)) {
            int i4 = onTransact + 109;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.ads_sdk.NativeAdsUtils$$ExternalSyntheticLambda7
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback + 77;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        Boolean boolValueOf = Boolean.valueOf(getStrokeWidth.IAuthTabCallback(deleteprofile, zOnExtraCallbackWithResult));
                        int i9 = onNavigationEvent + 77;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        return boolValueOf;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i6 = IAuthTabCallbackStub + 113;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        boolean zBooleanValue = ((Boolean) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0)).booleanValue();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return zBooleanValue;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        deleteProfile deleteprofile = (deleteProfile) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback.onWarmupCompleted[deleteprofile.ordinal()];
        if (i2 == 1) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i3 = onTransact;
        int i4 = i3 + 21;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0 ? i2 != 2 : i2 != 3) {
            if (i2 == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i5 = i3 + 21;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean onExtraCallbackWithResult(@NotNull Context context, @NotNull deleteProfile deleteprofile) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        boolean zOnExtraCallback = readIntokhttp.onExtraCallback(configuration);
        int i2 = IAuthTabCallback.onWarmupCompleted[deleteprofile.ordinal()];
        if (i2 == 1) {
            return zOnExtraCallback;
        }
        if (i2 == 2) {
            int i3 = IAuthTabCallbackStub + 33;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 5;
            }
            return false;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = IAuthTabCallbackStub + 27;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final Set<String> onNavigationEvent(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object[] objArr = new Object[1];
        a(12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 39585), objArr);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(((String) objArr[0]).intern()));
        intent.addCategory("android.intent.category.BROWSABLE");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            int i2 = onTransact + 37;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                str.hashCode();
                throw null;
            }
            ActivityInfo activityInfo2 = ((ResolveInfo) it.next()).activityInfo;
            str = activityInfo2 != null ? activityInfo2.packageName : null;
            if (str != null) {
                linkedHashSet.add(str);
                int i3 = IAuthTabCallbackStub + 43;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return linkedHashSet;
    }

    private final void onExtraCallback(Intent intent, Context context, int i) {
        onExtraCallback(-993424328, new Object[]{this, intent, context, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 993424328, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private static final String onExtraCallbackWithResult(ResolveInfo resolveInfo) {
        return (String) onExtraCallback(-989822791, new Object[]{resolveInfo}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 989822799, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private final Uri onExtraCallback(String str) {
        return (Uri) onExtraCallback(-1017301268, new Object[]{this, str}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1017301275, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private static final boolean onNavigationEvent(deleteProfile deleteprofile, boolean z) {
        return ((Boolean) onExtraCallback(-1768828531, new Object[]{deleteprofile, Boolean.valueOf(z)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1768828534, GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue();
    }

    private static final void onExtraCallbackWithResult(Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, View view, Ref.BooleanRef booleanRef2, Function0 function0, View view2, float f, List list, Function2 function2) {
        onExtraCallback(-1950209263, new Object[]{objectRef, booleanRef, view, booleanRef2, function0, view2, Float.valueOf(f), list, function2}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1950209269, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private final boolean onWarmupCompleted(Context context, String str, int i) {
        return ((Boolean) onExtraCallback(-2112996633, new Object[]{this, context, str, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 2112996634, GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue();
    }

    public final boolean onNavigationEvent(@NotNull Rect rect, float f, float f2) {
        return ((Boolean) onExtraCallback(1503549074, new Object[]{this, rect, Float.valueOf(f), Float.valueOf(f2)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1503549069, GriverCommonAbilityProxyImpl.onWarmupCompleted())).booleanValue();
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackDefault = new char[]{60839, 28900, 55086, 14974, 39090, 65529, 16933, 41284, 1935, 60833, 28899, 55090, 30492, 59973, 19850, 41163, 531, 25879, 55493, 15288, 40232, 61558, 21429, 46832, 10342, 35740, 61151};
        asInterface = 3818660649933172881L;
    }
}
