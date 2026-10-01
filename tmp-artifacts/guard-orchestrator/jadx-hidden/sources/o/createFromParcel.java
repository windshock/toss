package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.core.guard.AbsAppGuard$;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.bindContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class createFromParcel {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private static char[] onExtraCallback = {32561, 32592, 32581, 32598, 32576, 32604, 32579, 32593, 32550, 32589, 32596, 32577, 32557, 32585, 32591, 32594, 32597, 32560, 32578, 32559, 32590, 32599, 32595, 32606, 32584};
    private static int onNavigationEvent = -1184333827;
    private static boolean IAuthTabCallbackDefault = true;
    private static boolean asBinder = true;
    private static int asInterface = 478309023;
    private final Set<IconRoundCornerProgressBarOnIconClickListener> onExtraCallbackWithResult = new LinkedHashSet();
    private int onWarmupCompleted = -1;
    private final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new AbsAppGuard$.ExternalSyntheticLambda2());

    public static final /* synthetic */ class onExtraCallback {
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallback.class);
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[RoundCornerProgressBar.values().length];
            try {
                int iOrdinal = RoundCornerProgressBar.EXIT.ordinal();
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
                iArr[iOrdinal] = 1;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoundCornerProgressBar.CLEAR.ordinal()] = 2;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4560);
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RoundCornerProgressBar.NONE.ordinal()] = 3;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2947);
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3949);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) objArr[0];
        String str = (String) objArr[1];
        createFromParcel createfromparcel = (createFromParcel) objArr[2];
        Context context = (Context) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(roundCornerProgressBar, str, createfromparcel, context);
        int i4 = onTransact + 79;
        IAuthTabCallbackStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i5) | i4)) | i3;
        int i8 = ~i3;
        int i9 = (~(i8 | i4)) | (~(i8 | i5)) | (~(i4 | i5));
        int i10 = (~(i5 | (~i4))) | i8;
        int i11 = i3 + i4 + i2 + ((-2137991558) * i6) + (111092868 * i);
        int i12 = i11 * i11;
        int i13 = (((-431794203) * i3) - 566755328) + (427185167 * i4) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i2) + ((-1247805440) * i6) + ((-1807745024) * i) + ((-591921152) * i12);
        int i14 = (i3 * (-1469267343)) + 1003592187 + (i4 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i2 * (-1469268067)) + (i6 * 1951436498) + (i * (-746069772)) + (i12 * (-1529348096));
        return i13 + ((i14 * i14) * 1762131968) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(createFromParcel createfromparcel, Context context, startRearDisplaySession startreardisplaysession, Class cls) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(createfromparcel, context, startreardisplaysession, cls);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Handler onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    public abstract newArray IAuthTabCallback();

    public abstract void IAuthTabCallback(@NotNull Context context);

    public abstract RoundCornerProgressBar onExtraCallback(@NotNull IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener);

    public void onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i4 = onTransact + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract void onExtraCallback(@NotNull Context context, @NotNull RoundCornerProgressBar roundCornerProgressBar, @NotNull String str);

    public abstract void onExtraCallbackWithResult(@NotNull Context context, @NotNull RoundCornerProgressBar roundCornerProgressBar, @NotNull String str);

    public void onExtraCallbackWithResult(@NotNull Context context, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        int i5 = onTransact + 23;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public abstract void onNavigationEvent(@NotNull Context context);

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = IconRoundCornerProgressBarOnIconClickListener.Companion.onExtraCallback(this.onExtraCallbackWithResult);
        int i4 = onTransact + 111;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    private final Handler onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Handler handler = (Handler) this.IAuthTabCallback.getValue();
        int i4 = IAuthTabCallbackStub + 97;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return handler;
    }

    private static final Handler onWarmupCompleted() {
        int i = 2 % 2;
        Handler handler = new Handler(Looper.getMainLooper());
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return handler;
    }

    public void onNavigationEvent(@NotNull Context context, @NotNull Class<?> cls) {
        startRearDisplaySession startreardisplaysessionOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Annotation[] annotations = cls.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "");
        ArrayList arrayList = new ArrayList();
        int i2 = IAuthTabCallbackStub + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        for (Annotation annotation : annotations) {
            int i4 = onTransact + 71;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (annotation instanceof ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0) {
                arrayList.add(annotation);
            }
        }
        ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0 activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0 = (ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0) CollectionsKt.firstOrNull(arrayList);
        if (activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0 == null || (startreardisplaysessionOnExtraCallback = activityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0.onExtraCallback()) == null) {
            startreardisplaysessionOnExtraCallback = startRearDisplaySession.LOW;
        }
        clearTid.onExtraCallback().onExtraCallback(new AbsAppGuard$.ExternalSyntheticLambda1(this, context, startreardisplaysessionOnExtraCallback, cls));
    }

    private static final void onExtraCallback(createFromParcel createfromparcel, Context context, startRearDisplaySession startreardisplaysession, Class cls) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        newArray newarrayIAuthTabCallback = createfromparcel.IAuthTabCallback();
        String simpleName = cls.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        Set<IconRoundCornerProgressBarOnIconClickListener> setOnNavigationEvent = newarrayIAuthTabCallback.onNavigationEvent(context, startreardisplaysession, simpleName);
        String simpleName2 = cls.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName2, "");
        createfromparcel.onWarmupCompleted(context, setOnNavigationEvent, simpleName2);
        int i4 = onTransact + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(Context context, Set<? extends IconRoundCornerProgressBarOnIconClickListener> set, String str) {
        Set<IconRoundCornerProgressBarOnIconClickListener> set2;
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Set set3 = CollectionsKt.toSet(this.onExtraCallbackWithResult);
            this.onExtraCallbackWithResult.addAll(set);
            boolean zAreEqual = Intrinsics.areEqual(set3, this.onExtraCallbackWithResult);
            int i3 = 44 / 0;
            if (zAreEqual) {
                return;
            }
        } else {
            Set set4 = CollectionsKt.toSet(this.onExtraCallbackWithResult);
            this.onExtraCallbackWithResult.addAll(set);
            if (Intrinsics.areEqual(set4, this.onExtraCallbackWithResult)) {
                return;
            }
        }
        int i4 = IAuthTabCallbackStub + 21;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            set2 = this.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-121, -126, -118, -118, -122, -121, -119, -120, -121, -122, -123, -124, -125, -126, -127}, 81 / (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            set2 = this.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-121, -126, -118, -118, -122, -121, -119, -120, -121, -122, -123, -124, -125, -126, -127}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, objArr2);
            obj = objArr2[0];
        }
        IAuthTabCallback(context, set2, str, ((String) obj).intern());
    }

    public final void IAuthTabCallback(@NotNull Context context, @NotNull Set<? extends IconRoundCornerProgressBarOnIconClickListener> set, @NotNull String str, @NotNull String str2) {
        Object next;
        RoundCornerProgressBar roundCornerProgressBar;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Set<? extends IconRoundCornerProgressBarOnIconClickListener> set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        Iterator<T> it = set2.iterator();
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            arrayList.add(onExtraCallback((IconRoundCornerProgressBarOnIconClickListener) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int i4 = onTransact + 61;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                int priority = ((RoundCornerProgressBar) next).getPriority();
                do {
                    Object next2 = it2.next();
                    int priority2 = ((RoundCornerProgressBar) next2).getPriority();
                    if (priority < priority2) {
                        next = next2;
                        priority = priority2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        RoundCornerProgressBar roundCornerProgressBar2 = (RoundCornerProgressBar) next;
        if (roundCornerProgressBar2 == null) {
            int i6 = IAuthTabCallbackStub + 75;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            roundCornerProgressBar = RoundCornerProgressBar.NONE;
        } else {
            roundCornerProgressBar = roundCornerProgressBar2;
        }
        if (set.isEmpty()) {
            return;
        }
        boolean zOnWarmupCompleted = EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(context).onWarmupCompleted();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        Iterator<T> it3 = set2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((IconRoundCornerProgressBarOnIconClickListener) it3.next()).onExtraCallbackWithResult());
            int i8 = onTransact + 55;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
        }
        String string = arrayList2.toString();
        auth authVar = auth.onNavigationEvent;
        Object[] objArr = new Object[1];
        b(-Process.getGidForName(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, new char[]{65533, '\n', 65531}, 286 - ExpandableListView.getPackedPositionChild(0L), true, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), string);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-120, -126, -114, -105, -122, -113, -110, -113, -107, -117, -116, -122, -112, -117, -106, -117, -116, -107, -108, -109, -117}, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        Pair[] pairArr = {pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), Boolean.valueOf(zOnWarmupCompleted))};
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-120, -126, -116, -112, -126, -116, -126, -120, -104, -109, -120, -106}, (ViewConfiguration.getScrollBarSize() >> 8) + 127, objArr3);
        authVar.IAuthTabCallback(((String) objArr3[0]).intern(), string, access8100.onWarmupCompleted(pairArr));
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr4 = new Object[1];
        b(TextUtils.getCapsMode("", 0, 0) + 1, (ViewConfiguration.getTouchSlop() >> 8) + 6, new char[]{3, 5, 65533, 6, 4, 65526}, ((Process.getThreadPriority(0) + 20) >> 6) + 293, true, objArr4);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), string);
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-103, -107, -121, -106}, 127 - KeyEvent.keyCodeFromString(""), objArr5);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), str);
        Object[] objArr6 = new Object[1];
        a(null, null, new byte[]{-120, -126, -114, -105, -122, -113, -110, -113, -107, -117, -116, -122, -112, -117, -106, -117, -116, -107, -108, -109, -117}, 127 - (ViewConfiguration.getScrollBarSize() >> 8), objArr6);
        Pair[] pairArr2 = {pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), Boolean.valueOf(zOnWarmupCompleted))};
        Object[] objArr7 = new Object[1];
        a(null, null, new byte[]{-120, -126, -116, -112, -126, -116, -126, -120, -104, -109, -120, -106}, (ViewConfiguration.getEdgeSlop() >> 16) + 127, objArr7);
        ConvertFloatArrayToByteArray.IAuthTabCallback(1167879055, zzgc.onExtraCallbackWithResult(), -1167879050, new Object[]{convertFloatArrayToByteArray, ((String) objArr7[0]).intern(), pairArr2}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        GetFeatureExtension.onExtraCallbackWithResult(GetFeatureExtension.onWarmupCompleted, (deserializeDecimalCollection) null, 1, (Object) null);
        if (roundCornerProgressBar != RoundCornerProgressBar.NONE && (!(set2 instanceof Collection) || !set2.isEmpty())) {
            Iterator<T> it4 = set2.iterator();
            while (it4.hasNext()) {
                int i10 = IAuthTabCallbackStub + 23;
                onTransact = i10 % 128;
                if (i10 % 2 != 0) {
                    ((IconRoundCornerProgressBarOnIconClickListener) it4.next()).onExtraCallbackWithResult();
                    IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = IconRoundCornerProgressBarSavedState1.ROOT;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (((IconRoundCornerProgressBarOnIconClickListener) it4.next()).onExtraCallbackWithResult() == IconRoundCornerProgressBarSavedState1.ROOT) {
                    onExtraCallback(context, roundCornerProgressBar, str2);
                    return;
                }
            }
        }
        if (roundCornerProgressBar == RoundCornerProgressBar.NONE) {
            onExtraCallbackWithResult(this, context, roundCornerProgressBar, 0L, str2, 4, (Object) null);
            return;
        }
        int i11 = IAuthTabCallbackStub + 25;
        onTransact = i11 % 128;
        int i12 = i11 % 2;
        onExtraCallbackWithResult(context, roundCornerProgressBar, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r2 = r2 + 67;
        o.createFromParcel.onTransact = r2 % 128;
        r2 = r2 % 2;
        r9 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r6.IAuthTabCallback(r7, r8, r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r7 = new java.lang.Object[1];
        b(33 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 88, new char[]{20, 14, 5, '\r', 21, 7, 18, 1, 65472, 20, '\f', 21, 1, 6, 5, 4, 65472, '\b', 20, '\t', 23, 65472, 19, '\f', '\f', 1, 3, 65472, 18, 5, 16, 21, 65523, 14, 1, '\f', 65520, 20, '\t', 24, 65509, 5, '\f', 4, 14, 1, '\b', 65472, 65498, 14, 15, '\t', 20, 3, 14, 21, 6, 65472, 65484, 20, 5, 7, 18, 1, 20, 65472, 19, '\t', '\b', 20, 65472, 14, '\t', 65472, 4, 5, 20, 18, 15, 16, 16, 21, 19, 65472, 20, 15, 14, 65472, 19}, android.graphics.ImageFormat.getBitsPerPixel(0) + 279, true, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        throw new java.lang.UnsupportedOperationException(((java.lang.String) r7[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r13 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r13 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if ((r12 & 4) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void onExtraCallbackWithResult(o.createFromParcel r6, android.content.Context r7, o.RoundCornerProgressBar r8, long r9, java.lang.String r11, int r12, java.lang.Object r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.createFromParcel.onTransact
            int r1 = r1 + 103
            int r2 = r1 % 128
            o.createFromParcel.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L15
            r1 = 79
            int r1 = r1 / r3
            if (r13 != 0) goto L2d
            goto L17
        L15:
            if (r13 != 0) goto L2d
        L17:
            r12 = r12 & 4
            if (r12 == 0) goto L24
            int r2 = r2 + 67
            int r9 = r2 % 128
            o.createFromParcel.onTransact = r9
            int r2 = r2 % r0
            r9 = 5
        L24:
            r3 = r9
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.IAuthTabCallback(r1, r2, r3, r5)
            return
        L2d:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            int r7 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r7 = r7 >> 16
            int r8 = 33 - r7
            long r9 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            int r9 = r7 + 88
            r7 = 89
            char[] r10 = new char[r7]
            r10 = {x0062: FILL_ARRAY_DATA , data: [20, 14, 5, 13, 21, 7, 18, 1, -64, 20, 12, 21, 1, 6, 5, 4, -64, 8, 20, 9, 23, -64, 19, 12, 12, 1, 3, -64, 18, 5, 16, 21, -13, 14, 1, 12, -16, 20, 9, 24, -27, 5, 12, 4, 14, 1, 8, -64, -38, 14, 15, 9, 20, 3, 14, 21, 6, -64, -52, 20, 5, 7, 18, 1, 20, -64, 19, 9, 8, 20, -64, 14, 9, -64, 4, 5, 20, 18, 15, 16, 16, 21, 19, -64, 20, 15, 14, -64, 19} // fill-array
            int r7 = android.graphics.ImageFormat.getBitsPerPixel(r3)
            int r11 = r7 + 279
            r12 = 1
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r13 = r7
            b(r8, r9, r10, r11, r12, r13)
            r7 = r7[r3]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r7.intern()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createFromParcel.onExtraCallbackWithResult(o.createFromParcel, android.content.Context, o.RoundCornerProgressBar, long, java.lang.String, int, java.lang.Object):void");
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        createFromParcel createfromparcel = (createFromParcel) objArr[0];
        Context context = (Context) objArr[1];
        RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        String str = (String) objArr[4];
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(roundCornerProgressBar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (roundCornerProgressBar != RoundCornerProgressBar.NONE) {
            createfromparcel.onExtraCallbackWithResult().postDelayed(new AbsAppGuard$.ExternalSyntheticLambda0(roundCornerProgressBar, str, createfromparcel, context), jLongValue * 1000);
            return null;
        }
        int i4 = IAuthTabCallbackStub + 29;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void onNavigationEvent(RoundCornerProgressBar roundCornerProgressBar, String str, createFromParcel createfromparcel, Context context) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-113, -122, -114, -115, -116, -117, -125, -126}, 127 - Color.green(0), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), roundCornerProgressBar.name());
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-121, -126, -114, -114, -122, -112}, (Process.myTid() >> 22) + 127, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        b(17 - ((byte) KeyEvent.getModifierMetaStateMask()), 23 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{2, 11, 65513, 7, 65530, 5, 65513, '\r', 2, 17, 65502, 65533, 65534, 5, 65533, 7, 65530, 1, 18, '\r', 2, 11, '\b'}, 285 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), true, objArr3);
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), Integer.valueOf(createfromparcel.onWarmupCompleted))});
        Object[] objArr4 = new Object[1];
        b(7 - Color.argb(0, 0, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, new char[]{'\r', 65534, 65533, 65528, '\f', 65533, 65535, 0, 14, 65531, 65534, 65533, 65528, 65533, 65534, '\r', 65532, 65534}, ((Process.getThreadPriority(0) + 20) >> 6) + 285, true, objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-113, -122, -114, -115, -116, -117, -125, -110, -126, -114, -120, -113, -122, -111}, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr5[0]).intern(), mapOnWarmupCompleted, (String) null, false, (String) null, 56, (Object) null);
        if (roundCornerProgressBar.getPriority() <= createfromparcel.onWarmupCompleted) {
            return;
        }
        int i4 = onExtraCallback.onWarmupCompleted[roundCornerProgressBar.ordinal()];
        if (i4 == 1) {
            createfromparcel.onNavigationEvent(context);
        } else {
            int i5 = onTransact + 13;
            int i6 = i5 % 128;
            IAuthTabCallbackStub = i6;
            if (i5 % 2 != 0 ? i4 == 2 : i4 == 2) {
                createfromparcel.IAuthTabCallback(context);
            } else {
                int i7 = i6 + 9;
                onTransact = i7 % 128;
                if (i7 % 2 == 0 ? i4 != 3 : i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        createfromparcel.onWarmupCompleted = roundCornerProgressBar.getPriority();
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
            int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            cArr2[i5] = bindContext.access000.g(cArr2[i5], asInterface);
            LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
        }
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i6 = $11 + 81;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i8 = $10 + 31;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallback;
        if (cArr3 != null) {
            int i3 = $10 + 55;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 105;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr2[i4] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr3[i4]);
                } else {
                    cArr2[i4] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr3[i4]);
                    i4++;
                }
            }
            cArr3 = cArr2;
        }
        int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onNavigationEvent);
        if (!(!asBinder)) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i6 = $10 + 25;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i8 = $10 + 15;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $10 + 105;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
            Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ void IAuthTabCallback(RoundCornerProgressBar roundCornerProgressBar, String str, createFromParcel createfromparcel, Context context) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallbackWithResult(new Object[]{roundCornerProgressBar, str, createfromparcel, context}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 102155282, -102155281, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final void IAuthTabCallback(@NotNull Context context, @NotNull RoundCornerProgressBar roundCornerProgressBar, long j, @NotNull String str) {
        Object[] objArr = {this, context, roundCornerProgressBar, Long.valueOf(j), str};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallbackWithResult(objArr, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -964262320, 964262320, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }
}
