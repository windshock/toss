package o;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CatalystInstanceImplPendingJSCall;
import o.isNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.password.PasswordFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CatalystInstanceImplPendingJSCall {
    private static final byte[] $$a = {111, -17, 11, -125};
    private static final int $$b = 52;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallback = 1;
    private static char[] onExtraCallbackWithResult = {60920};
    private static long onNavigationEvent = 2001394138585201760L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, short r8, byte r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 97
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r0 = o.CatalystInstanceImplPendingJSCall.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CatalystInstanceImplPendingJSCall.$$c(byte, short, byte):java.lang.String");
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(isNumber isnumber) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(isnumber);
        int i4 = IAuthTabCallback + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return charSequenceOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final CharSequence onExtraCallbackWithResult(isNumber isnumber) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(isnumber, "");
            return isnumber.getEventName();
        }
        Intrinsics.checkNotNullParameter(isnumber, "");
        int i3 = 41 / 0;
        return isnumber.getEventName();
    }

    public static final String onNavigationEvent(@NotNull Set<? extends isNumber> set) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(set, "");
        List listSortedWith = CollectionsKt.sortedWith(set, new onWarmupCompleted());
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getLongPressTimeout() >> 16, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        String strJoinToString$default = CollectionsKt.joinToString$default(listSortedWith, ((String) objArr[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: viva.republica.toss.password.AvailableAuthMethodsKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CatalystInstanceImplPendingJSCall.IAuthTabCallback((isNumber) obj);
            }
        }, 30, (Object) null);
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return strJoinToString$default;
    }

    public static final Set<isNumber> onWarmupCompleted(@Nullable PasswordFragment.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            clearFaultAdjacentMetadata.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Set setOnExtraCallbackWithResult = clearFaultAdjacentMetadata.onExtraCallbackWithResult();
        if (onextracallback != null && onextracallback.IEngagementSignalsCallbackStubProxy()) {
            setOnExtraCallbackWithResult.add(isNumber.TOSS_FACE);
            int i3 = IAuthTabCallback + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        if (onextracallback != null) {
            int i5 = IAuthTabCallback + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (onextracallback.IEngagementSignalsCallbackStub()) {
                setOnExtraCallbackWithResult.add(isNumber.BIOMETRIC);
            }
        }
        setOnExtraCallbackWithResult.add(isNumber.PASSWORD);
        return clearFaultAdjacentMetadata.onExtraCallbackWithResult(setOnExtraCallbackWithResult);
    }

    public static final Set<isNumber> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Set setOnExtraCallbackWithResult = clearFaultAdjacentMetadata.onExtraCallbackWithResult();
        setOnExtraCallbackWithResult.add(isNumber.TOSS_FACE);
        accessMapSafely accessmapsafely = accessMapSafely.onNavigationEvent;
        if (accessmapsafely.IAuthTabCallback() && accessmapsafely.onExtraCallbackWithResult()) {
            setOnExtraCallbackWithResult.add(isNumber.BIOMETRIC);
        }
        setOnExtraCallbackWithResult.add(isNumber.PASSWORD);
        Set<isNumber> setOnExtraCallbackWithResult2 = clearFaultAdjacentMetadata.onExtraCallbackWithResult(setOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return setOnExtraCallbackWithResult2;
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
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 59696), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, 10973 - (ViewConfiguration.getJumpTapTimeout() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 46134), (-16777185) - Color.rgb(0, 0, 0), 20219 - MotionEvent.axisFromString(""), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ((byte) KeyEvent.getModifierMetaStateMask())), 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1494 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        int i5 = $11 + 23;
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $11 + 17;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $11 + 79;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ((byte) KeyEvent.getModifierMetaStateMask())), '\\' - AndroidCharacter.getMirror('0'), AndroidCharacter.getMirror('0') + 1446, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public static final class onWarmupCompleted<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getCodeNameBytes.IAuthTabCallback(Integer.valueOf(((isNumber) t).ordinal()), Integer.valueOf(((isNumber) t2).ordinal()));
        }
    }
}
