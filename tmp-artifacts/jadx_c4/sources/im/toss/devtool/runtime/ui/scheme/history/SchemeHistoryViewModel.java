package im.toss.devtool.runtime.ui.scheme.history;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import im.toss.devtool.domain.entity.SchemeHistoryEntity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IAnimation;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.findResAndMsg;
import o.getCornerRadius;
import o.getTileModeY;
import o.setRubIn;
import o.setShine;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SchemeHistoryViewModel extends ViewModel {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final setRubIn<Object> onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private final getCornerRadius<List<Object>> onNavigationEvent;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | i5;
        int i10 = ~(i4 | i3);
        int i11 = i9 | i10;
        int i12 = ~i5;
        int i13 = (~(i12 | i3)) | (~(i12 | i4)) | i10;
        int i14 = (~(i7 | i3)) | (~(i8 | i4));
        int i15 = i4 + i3 + i + (1040777104 * i2) + ((-1861505373) * i6);
        int i16 = i15 * i15;
        int i17 = (i4 * (-1036928585)) + 527892480 + ((-1036928585) * i3) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i) + (1608515584 * i2) + ((-1123418112) * i6) + ((-2114519040) * i16);
        int i18 = (i4 * 1703033811) + 1712528133 + (i3 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i * 1703034565) + (i2 * (-2114876976)) + (i6 * 1880022383) + (i16 * (-720175104));
        int i19 = i17 + (i18 * i18 * (-739180544));
        return i19 != 1 ? i19 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    @Inject
    public SchemeHistoryViewModel(@NotNull Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(obj, "");
        this.onExtraCallbackWithResult = obj;
        getCornerRadius<List<Object>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent((Object) null);
        this.onNavigationEvent = getcornerradiusOnNavigationEvent;
        try {
            Object[] objArr = {getcornerradiusOnNavigationEvent};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-726938750);
            IAnimation iAnimation = (IAnimation) ((Constructor) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (6644 - TextUtils.lastIndexOf("", '0', 0, 0)), 80 - TextUtils.indexOf("", "", 0, 0), 12754 - TextUtils.indexOf("", "", 0, 0), -437570286, false, (String) null, new Class[]{IAnimation.class}) : objOnExtraCallback)).newInstance(objArr);
            findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this);
            getTileModeY gettilemodeyOnExtraCallback = getTileModeY.onWarmupCompleted.onExtraCallback(getTileModeY.Companion, 5000L, 0L, 2, (Object) null);
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1167755143);
            this.onExtraCallback = ycxycx.IAuthTabCallback(iAnimation, findresandmsgIAuthTabCallback, gettilemodeyOnExtraCallback, ((Field) (objOnExtraCallback2 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, 12725 - TextUtils.lastIndexOf("", '0'), 1960474903, false, "IAuthTabCallback", (Class[]) null) : objOnExtraCallback2)).get(null));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SchemeHistoryViewModel schemeHistoryViewModel = (SchemeHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = (i2 & 115) + (i2 | 115);
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Object> setrubin = schemeHistoryViewModel.onExtraCallback;
        if (i4 == 0) {
            return setrubin;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        getCornerRadius<List<Object>> getcornerradius;
        Object objInvoke;
        SchemeHistoryViewModel schemeHistoryViewModel = (SchemeHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = (i2 & (-62)) | ((~i2) & 61);
        int i4 = -(-((i2 & 61) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        IAuthTabCallback = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                getcornerradius = schemeHistoryViewModel.onNavigationEvent;
                Object obj = schemeHistoryViewModel.onExtraCallbackWithResult;
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1656959189);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (11124 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 16, 11102 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1401146949, false, "onWarmupCompleted", new Class[0]);
                }
                objInvoke = ((Method) objOnExtraCallback).invoke(obj, null);
                int i6 = 49 / 0;
            } else {
                getcornerradius = schemeHistoryViewModel.onNavigationEvent;
                Object obj2 = schemeHistoryViewModel.onExtraCallbackWithResult;
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1656959189);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (11122 - Process.getGidForName("")), 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 11103 - View.resolveSize(0, 0), -1401146949, false, "onWarmupCompleted", new Class[0]);
                }
                objInvoke = ((Method) objOnExtraCallback2).invoke(obj2, null);
            }
            Iterable iterable = (Iterable) objInvoke;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            int i7 = onWarmupCompleted;
            int i8 = i7 & 9;
            int i9 = -(-((i7 ^ 9) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                iterable.iterator();
                throw null;
            }
            Iterator it = iterable.iterator();
            int i11 = onWarmupCompleted;
            int i12 = i11 | 3;
            int i13 = (i12 << 1) - ((~(i11 & 3)) & i12);
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            while (it.hasNext()) {
                int i15 = IAuthTabCallback;
                int i16 = i15 ^ 111;
                int i17 = (i15 & 111) << 1;
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                try {
                    Object[] objArr2 = {(SchemeHistoryEntity) it.next()};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2065931098);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 27985), 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 13261 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1248028106, false, "onNavigationEvent", new Class[]{SchemeHistoryEntity.class});
                    }
                    Object objInvoke2 = ((Method) objOnExtraCallback3).invoke(null, objArr2);
                    int i20 = IAuthTabCallback;
                    int i21 = i20 & 97;
                    int i22 = ((i20 ^ 97) | i21) << 1;
                    int i23 = -((i20 | 97) & (~i21));
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    onWarmupCompleted = i24 % 128;
                    int i25 = i24 % 2;
                    arrayList.add(objInvoke2);
                    int i26 = onWarmupCompleted + 125;
                    IAuthTabCallback = i26 % 128;
                    int i27 = i26 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            getcornerradius.onWarmupCompleted(arrayList);
            int i28 = onWarmupCompleted + 57;
            IAuthTabCallback = i28 % 128;
            int i29 = i28 % 2;
            return null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b5, code lost:
    
        r1 = new java.lang.Object[]{(im.toss.devtool.domain.entity.SchemeHistoryEntity) r1.next()};
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2065931098);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bd, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bf, code lost:
    
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 27984), (-16777203) - android.graphics.Color.rgb(0, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0) + 13260, 1248028106, false, "onNavigationEvent", new java.lang.Class[]{im.toss.devtool.domain.entity.SchemeHistoryEntity.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e9, code lost:
    
        ((java.lang.reflect.Method) r3).invoke(null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ee, code lost:
    
        r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        SchemeHistoryViewModel schemeHistoryViewModel = (SchemeHistoryViewModel) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = (i2 ^ 99) + ((i2 & 99) << 1);
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<List<Object>> getcornerradius = schemeHistoryViewModel.onNavigationEvent;
        Object obj = schemeHistoryViewModel.onExtraCallbackWithResult;
        try {
            Object[] objArr2 = {Integer.valueOf(iIntValue)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1195230660);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (11124 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 15 - TextUtils.lastIndexOf("", '0', 0, 0), 11103 - TextUtils.getOffsetAfter("", 0), -1987918676, false, "onExtraCallback", new Class[]{Integer.TYPE});
            }
            Iterable iterable = (Iterable) ((Method) objOnExtraCallback).invoke(obj, objArr2);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            int i5 = IAuthTabCallback + 113;
            onWarmupCompleted = i5 % 128;
            Object obj2 = null;
            if (i5 % 2 == 0) {
                iterable.iterator();
                obj2.hashCode();
                throw null;
            }
            Iterator it = iterable.iterator();
            int i6 = onWarmupCompleted;
            int i7 = i6 ^ 91;
            int i8 = -(-((i6 & 91) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            IAuthTabCallback = i9 % 128;
            while (true) {
                int i10 = i9 % 2;
                if (!it.hasNext()) {
                    getcornerradius.onWarmupCompleted(arrayList);
                    int i11 = onWarmupCompleted + 48;
                    int i12 = (i11 ^ (-1)) + (i11 << 1);
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 68 / 0;
                    }
                    return null;
                }
                int i14 = onWarmupCompleted;
                int i15 = ((i14 | 13) << 1) - (i14 ^ 13);
                IAuthTabCallback = i15 % 128;
                if (i15 % 2 != 0) {
                    break;
                }
                Object[] objArr3 = {(SchemeHistoryEntity) it.next()};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2065931098);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (27983 - Process.getGidForName("")), 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13260, 1248028106, false, "onNavigationEvent", new Class[]{SchemeHistoryEntity.class});
                }
                arrayList.add(((Method) objOnExtraCallback2).invoke(null, objArr3));
                int i16 = onWarmupCompleted;
                int i17 = i16 & 7;
                int i18 = (i16 ^ 7) | i17;
                i9 = (i17 & i18) + (i18 | i17);
                IAuthTabCallback = i9 % 128;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void onWarmupCompleted(int i) {
        IAuthTabCallback(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 2122022868, -2122022866, new Object[]{this, Integer.valueOf(i)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    public final setRubIn<Object> onWarmupCompleted() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (setRubIn) IAuthTabCallback(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1680399750, -1680399749, new Object[]{this}, iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    public final void onExtraCallbackWithResult() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        IAuthTabCallback(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -227019694, 227019694, new Object[]{this}, iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }
}
