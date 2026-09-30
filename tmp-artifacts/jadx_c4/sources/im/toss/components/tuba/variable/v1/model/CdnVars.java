package im.toss.components.tuba.variable.v1.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.components.tuba.variable.v1.model.CdnVars$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.checkCanOpenLandingPage;
import o.getWrite;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CdnVars {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static long IAuthTabCallback;
    private static char[] onExtraCallback;
    private static int onWarmupCompleted;
    private final String etag;
    private final List<CdnVar> vars;
    private static final byte[] $$a = {50, -82, -81, 124};
    private static final int $$b = 200;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;

    private static String $$c(short s, byte b, short s2) {
        byte[] bArr = $$a;
        int i = (b * 3) + 4;
        int i2 = (s2 * 3) + 97;
        int i3 = s * 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = (-i) + i2;
            i++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            int i6 = i2;
            i4 = i5;
            i2 = (-bArr[i]) + i6;
            i++;
        }
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerAsInterface;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerAsInterface = asInterface();
            int i3 = 31 / 0;
        } else {
            kSerializerAsInterface = asInterface();
        }
        int i4 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsInterface;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CdnVar$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CdnVars)) {
            int i2 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CdnVars cdnVars = (CdnVars) obj;
        if (!Intrinsics.areEqual(this.etag, cdnVars.etag)) {
            int i4 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.vars, cdnVars.vars)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.etag.hashCode();
        List<CdnVar> list = this.vars;
        if (list == null) {
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.etag;
        List<CdnVar> list = this.vars;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, 13 - TextUtils.indexOf("", "", 0, 0), (char) ((-1) - MotionEvent.axisFromString("")), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 13, 7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (34531 - TextUtils.lastIndexOf("", '0')), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(list);
        Object[] objArr3 = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 21, 1 - Gravity.getAbsoluteGravity(0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2563), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return string;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CdnVars> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            CdnVars$.serializer serializerVar = CdnVars$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        onWarmupCompleted = 0;
        onWarmupCompleted();
        Companion = new Companion(null);
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.components.tuba.variable.v1.model.CdnVars$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = CdnVars.IAuthTabCallback();
                int i4 = IAuthTabCallback + 67;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        })};
        int i = onTransact + 37;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ CdnVars(int i, String str, List list, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, CdnVars$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 2;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.etag = str;
        this.vars = list;
    }

    public CdnVars(@NotNull String str, @Nullable List<CdnVar> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.etag = str;
        this.vars = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(CdnVars cdnVars, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, cdnVars.etag);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), cdnVars.vars);
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 43 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.etag;
        int i5 = i3 + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JsonObject onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            List<CdnVar> list = this.vars;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (!(!it.hasNext())) {
                CdnVar cdnVar = (CdnVar) it.next();
                JsonPrimitive jsonPrimitiveOnExtraCallbackWithResult = cdnVar.onExtraCallbackWithResult();
                Pair pairIAuthTabCallback = jsonPrimitiveOnExtraCallbackWithResult != null ? getWrite.IAuthTabCallback(cdnVar.onExtraCallback(), jsonPrimitiveOnExtraCallbackWithResult) : null;
                if (pairIAuthTabCallback != null) {
                    arrayList.add(pairIAuthTabCallback);
                    int i3 = onExtraCallbackWithResult + 115;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            return new JsonObject(access8100.onExtraCallbackWithResult(arrayList));
        }
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 13;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 4;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $11 + 17;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i * i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 18 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 30 - ExpandableListView.getPackedPositionChild(0L), 20220 - (ViewConfiguration.getTouchSlop() >> 8), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 44 - TextUtils.getOffsetBefore("", 0), View.MeasureSpec.getMode(0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onExtraCallback[i + i8])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 59697), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Gravity.getAbsoluteGravity(0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 31, 20220 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.resolveSizeAndState(0, 0, 0)), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1494 - Color.green(0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.argb(0, 0, 0, 0)), 44 - (Process.myPid() >> 22), (ViewConfiguration.getScrollBarSize() >> 8) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i9 = $11 + 25;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i10 = 96 / 0;
            objArr[0] = str;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{60823, 23684, 36818, 65054, 10597, 39842, 51871, 13712, 25617, 55156, 445, 28815, 41881, 27420, 55844, 2350, 30925, 44946, 7495, 19509, 59390};
        IAuthTabCallback = -2812087745059398432L;
    }
}
