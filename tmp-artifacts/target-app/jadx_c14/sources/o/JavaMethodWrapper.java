package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.JavaMethodWrapper;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.pedometer.recognition.ActivityTransitionReceiver;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JavaMethodWrapper {
    public static final int IAuthTabCallback;
    private static char IAuthTabCallbackStub;
    private static int access100;
    private static int asBinder;
    private static boolean onExtraCallback;
    public static final JavaMethodWrapper onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static final Set<Integer> onWarmupCompleted;
    private static final byte[] $$a = {87, -2, 11, -41};
    private static final int $$b = 255;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, short r8, short r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = o.JavaMethodWrapper.$$a
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r8 = r8 + 109
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2b:
            int r3 = -r3
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JavaMethodWrapper.$$c(byte, short, short):java.lang.String");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Exception exc = (Exception) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(exc);
        int i4 = onTransact + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Void r4 = (Void) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(r4);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 7;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Void r3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(r3);
        int i4 = onTransact + 9;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = i3 | i7;
        int i9 = ~i5;
        int i10 = ~((~i3) | i7);
        int i11 = i4 + i5 + i6 + (1977613057 * i) + (454551927 * i2);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i4) + 473956352 + (953991674 * i5) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i6) + ((-981467136) * i) + ((-830472192) * i2) + ((-499122176) * i12);
        int i14 = (i4 * (-1131120504)) + 246467939 + (i5 * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i6 * (-1131119791)) + (i * (-1039407535)) + (i2 * 1820920743) + (i12 * 1447034880);
        int i15 = i13 + (i14 * i14 * 1170210816);
        if (i15 == 1) {
            return onExtraCallback(objArr);
        }
        if (i15 != 2) {
            return IAuthTabCallback(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i16 = 2 % 2;
        int i17 = IAuthTabCallbackDefault + 113;
        onTransact = i17 % 128;
        int i18 = i17 % 2;
        onExtraCallback(function1, obj);
        int i19 = onTransact + 91;
        IAuthTabCallbackDefault = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        int i4 = onTransact + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(Exception exc) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(exc);
        int i4 = IAuthTabCallbackDefault + 77;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private JavaMethodWrapper() {
    }

    static {
        access100 = 1;
        onExtraCallbackWithResult();
        onExtraCallbackWithResult = new JavaMethodWrapper();
        onWarmupCompleted = clearFaultAdjacentMetadata.onExtraCallback(new Integer[]{0, 1, 2, 3, 7, 8});
        IAuthTabCallback = 8;
        int i = asInterface + 123;
        access100 = i % 128;
        int i2 = i % 2;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 57;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(Void r2) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackDefault = i2 % 128;
        onExtraCallback = i2 % 2 != 0;
        return Unit.INSTANCE;
    }

    public final void onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (!onExtraCallback) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext);
            if (IAuthTabCallback(applicationContext)) {
                Set<Integer> set = onWarmupCompleted;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ActivityTransition.Builder().setActivityType(((Number) it.next()).intValue()).setActivityTransition(0).build());
                    int i3 = onTransact + 25;
                    IAuthTabCallbackDefault = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 5 % 5;
                    }
                }
                Task taskRequestActivityTransitionUpdates = onExtraCallbackWithResult(applicationContext).requestActivityTransitionUpdates(new ActivityTransitionRequest(arrayList), onNavigationEvent(applicationContext));
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.pedometer.recognition.ActivityTransitionManager$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj) {
                        return JavaMethodWrapper.onExtraCallbackWithResult((Void) obj);
                    }
                };
                taskRequestActivityTransitionUpdates.addOnSuccessListener(new OnSuccessListener() { // from class: viva.republica.toss.pedometer.recognition.ActivityTransitionManager$$ExternalSyntheticLambda4
                    public final void onSuccess(Object obj) {
                        JavaMethodWrapper.onNavigationEvent(function1, obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: viva.republica.toss.pedometer.recognition.ActivityTransitionManager$$ExternalSyntheticLambda5
                    public final void onFailure(Exception exc) {
                        JavaMethodWrapper.onWarmupCompleted(exc);
                    }
                });
                return;
            }
        }
        int i5 = onTransact + 115;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void onExtraCallback(Exception exc) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ActivityTransitionManager", "error on requestActivityTransitionUpdates", exc, (Map) null, 8, (Object) null);
        int i4 = onTransact + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 53;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(Void r4) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback = false;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 111;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    public final void onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (onExtraCallback) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext);
            if (!IAuthTabCallback(applicationContext)) {
                int i3 = IAuthTabCallbackDefault + 81;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallback = false;
                return;
            }
            if (!IAuthTabCallbackStub(applicationContext)) {
                Task taskRemoveActivityTransitionUpdates = onExtraCallbackWithResult(applicationContext).removeActivityTransitionUpdates(onNavigationEvent(applicationContext));
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.pedometer.recognition.ActivityTransitionManager$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                        return (Unit) JavaMethodWrapper.onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{(Void) obj}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -471605755, 471605756, iOnExtraCallback2);
                    }
                };
                taskRemoveActivityTransitionUpdates.addOnSuccessListener(new OnSuccessListener() { // from class: viva.republica.toss.pedometer.recognition.ActivityTransitionManager$$ExternalSyntheticLambda1
                    public final void onSuccess(Object obj) {
                        JavaMethodWrapper.onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1195428364, -1195428362, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: viva.republica.toss.pedometer.recognition.ActivityTransitionManager$$ExternalSyntheticLambda2
                    public final void onFailure(Exception exc) {
                        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                        JavaMethodWrapper.onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{exc}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, 435862306, -435862306, iOnExtraCallback2);
                    }
                });
                return;
            }
        }
        int i5 = IAuthTabCallbackDefault + 35;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallback(Exception exc) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ActivityTransitionManager", "error on removeActivityTransitionUpdates", exc, (Map) null, 8, (Object) null);
        int i4 = onTransact + 77;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
    }

    private final PendingIntent onNavigationEvent(Context context) {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 23;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT >= 31) {
            int i5 = onTransact + 123;
            IAuthTabCallbackDefault = i5 % 128;
            i = 301989888;
            if (i5 % 2 == 0) {
                int i6 = 99 / 0;
            }
        } else {
            i = 268435456;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) ActivityTransitionReceiver.class), i);
        Intrinsics.checkNotNullExpressionValue(broadcast, "");
        int i7 = IAuthTabCallbackDefault + 49;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return broadcast;
        }
        throw null;
    }

    private final boolean IAuthTabCallbackStub(Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackDefault(context);
            throw null;
        }
        boolean zIAuthTabCallbackDefault = GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackDefault(context);
        int i3 = onTransact + 115;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallbackDefault;
    }

    private final boolean IAuthTabCallback(Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onTransact = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT < 29 : Build.VERSION.SDK_INT < 98) {
            return true;
        }
        Object[] objArr = new Object[1];
        a((char) (KeyEvent.keyCodeFromString("") + 28723), 1706084760 + (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{27981, 24069, 760, 24213, 12302, 31375, 11578, 64551, 17247, 37980, 49990, 47839, 7464, 34828, 62852, 29444, 22939, 16183, 44629, 21964, 47837, 53202, 13989, 2444, 11092, 39273, 49955, 28264, 3472, 35452, 16658, 61494, 50522, 9622, 9364, 44406, 26763, 41385, 47510}, new char[]{0, 0, 0, 0}, new char[]{38966, 45257, 13157, 7280}, objArr);
        if (ContextCompat.checkSelfPermission(context, ((String) objArr[0]).intern()) != 0) {
            return false;
        }
        int i3 = IAuthTabCallbackDefault + 39;
        onTransact = i3 % 128;
        return i3 % 2 == 0;
    }

    private final ActivityRecognitionClient onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityRecognitionClient client = ActivityRecognition.getClient(context);
        Intrinsics.checkNotNullExpressionValue(client, "");
        if (i3 != 0) {
            return client;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 11;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43, 1451 - ExpandableListView.getPackedPositionType(0L), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "")), (ViewConfiguration.getLongPressTimeout() >> 16) + 44, 1494 - (ViewConfiguration.getTouchSlop() >> 8), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23972), TextUtils.getCapsMode("", 0, 0) + 50, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 45847), Color.rgb(0, 0, 0) + 16777245, 12577 - KeyEvent.getDeadChar(0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackStub ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i6 = $11 + 13;
                            $10 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, 1195428364, -1195428362, iOnExtraCallback2);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Exception exc) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{exc}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, 435862306, -435862306, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onNavigationEvent(Void r7) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{r7}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -471605755, 471605756, iOnExtraCallback2);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 7798559133331975163L;
        asBinder = -1776194565;
        IAuthTabCallbackStub = (char) 27299;
    }
}
