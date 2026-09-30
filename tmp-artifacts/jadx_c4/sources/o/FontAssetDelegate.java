package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.components.tuba.variable.v2.spec.DefaultVar;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import o.AUTextView;
import o.FontAssetDelegate;
import o.adInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FontAssetDelegate implements fromRawRes {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static final wie2 IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static final String onExtraCallback;
    private static long onNavigationEvent;
    private static int onTransact;
    private static final String onWarmupCompleted;
    private final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult;

    public static /* synthetic */ Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(adinfo);
        int i4 = asInterface + 63;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    @Inject
    public FontAssetDelegate(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.onExtraCallbackWithResult = textRoundCornerProgressBarSavedState1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    @Override // o.fromRawRes
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<DefaultVar> IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = this.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{7197, 2865, 7257, 53719, 24622, 54574, 2115, 34795, 30404, 20050, 51880, 32193, 51539, 42187, 24354, 58041, 9190, 4412, 8599, 18473, 46691, 36797, 35347, 48567, 2296}, 0 / TextUtils.getOffsetBefore("", 0), objArr);
            if (textRoundCornerProgressBarSavedState1.onNavigationEvent(((String) objArr[0]).intern())) {
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState12 = this.onExtraCallbackWithResult;
                Object[] objArr2 = new Object[1];
                a(new char[]{7197, 2865, 7257, 53719, 24622, 54574, 2115, 34795, 30404, 20050, 51880, 32193, 51539, 42187, 24354, 58041, 9190, 4412, 8599, 18473, 46691, 36797, 35347, 48567, 2296}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
                String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState12.onExtraCallbackWithResult(((String) objArr2[0]).intern(), "");
                try {
                    wie2 wie2Var = IAuthTabCallback;
                    wie2Var.onExtraCallback();
                    return (List) wie2Var.onExtraCallback(new checkCanOpenLandingPage(DefaultVar.Companion.serializer()), strOnExtraCallbackWithResult);
                } catch (Exception e) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr3 = new Object[1];
                    a(new char[]{11610, 18003, 11534, 40069, 53435, 26015, 28814, 65286, 18304, 797, 31295, 1343, 63533, 59787, 61344, 39531, 4794, 23669, 37121, 12522, 34617, 49903, 15004, 50541, 14725, 43369}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
                    convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr3[0]).intern(), e);
                    TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState13 = this.onExtraCallbackWithResult;
                    Object[] objArr4 = new Object[1];
                    a(new char[]{7197, 2865, 7257, 53719, 24622, 54574, 2115, 34795, 30404, 20050, 51880, 32193, 51539, 42187, 24354, 58041, 9190, 4412, 8599, 18473, 46691, 36797, 35347, 48567, 2296}, Color.rgb(0, 0, 0) + 16777217, objArr4);
                    textRoundCornerProgressBarSavedState13.onTransact(((String) objArr4[0]).intern());
                }
            }
        } else {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState14 = this.onExtraCallbackWithResult;
            Object[] objArr5 = new Object[1];
            a(new char[]{7197, 2865, 7257, 53719, 24622, 54574, 2115, 34795, 30404, 20050, 51880, 32193, 51539, 42187, 24354, 58041, 9190, 4412, 8599, 18473, 46691, 36797, 35347, 48567, 2296}, 1 - TextUtils.getOffsetBefore("", 0), objArr5);
            if (textRoundCornerProgressBarSavedState14.onNavigationEvent(((String) objArr5[0]).intern())) {
            }
        }
        int i3 = asInterface + 77;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.fromRawRes
    public void IAuthTabCallback(@NotNull List<DefaultVar> list) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = this.onExtraCallbackWithResult;
        wie2 wie2Var = IAuthTabCallback;
        wie2Var.onExtraCallback();
        String strOnWarmupCompleted = wie2Var.onWarmupCompleted(new checkCanOpenLandingPage(DefaultVar.Companion.serializer()), list);
        Object[] objArr = new Object[1];
        a(new char[]{7197, 2865, 7257, 53719, 24622, 54574, 2115, 34795, 30404, 20050, 51880, 32193, 51539, 42187, 24354, 58041, 9190, 4412, 8599, 18473, 46691, 36797, 35347, 48567, 2296}, -TextUtils.indexOf((CharSequence) "", '0'), objArr);
        textRoundCornerProgressBarSavedState1.onNavigationEvent(((String) objArr[0]).intern(), strOnWarmupCompleted);
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.fromRawRes
    public String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.onExtraCallbackWithResult.IAuthTabCallback(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult.IAuthTabCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.fromRawRes
    public void onExtraCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallbackWithResult.onNavigationEvent(str, str2);
        int i4 = asInterface + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.fromRawRes
    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult.onTransact(str);
        int i4 = asInterface + 71;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    @Override // o.fromRawRes
    public Map<String, String> onNavigationEvent(@NotNull String... strArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(strArr.length), 16));
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = onTransact + 67;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                String str = strArr[i2];
                linkedHashMap.put(str, onNavigationEvent(str));
                i2 += 80;
            } else {
                String str2 = strArr[i2];
                linkedHashMap.put(str2, onNavigationEvent(str2));
                i2++;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            Pair pairIAuthTabCallback = str4 != null ? getWrite.IAuthTabCallback(str3, str4) : null;
            if (pairIAuthTabCallback != null) {
                int i4 = onTransact + 85;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(pairIAuthTabCallback);
                    int i5 = 94 / 0;
                } else {
                    arrayList.add(pairIAuthTabCallback);
                }
            }
        }
        return access8100.onExtraCallbackWithResult(arrayList);
    }

    @Override // o.fromRawRes
    public void onExtraCallbackWithResult(@NotNull Map<String, String> map) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        int i4 = asInterface + 25;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int i6 = onTransact + 117;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            onExtraCallback(entry.getKey(), entry.getValue());
        }
        int i8 = asInterface + 53;
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 78 / 0;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{11610, 18003, 11534, 40069, 53435, 26015, 28814, 65286, 18304, 797, 31295, 1343, 63533, 59787, 61344, 39531, 4794, 23669, 37121, 12522, 34617, 49903, 15004, 50541, 14725, 43369}, 1 - TextUtils.getTrimmedLength(""), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{7197, 2865, 7257, 53719, 24622, 54574, 2115, 34795, 30404, 20050, 51880, 32193, 51539, 42187, 24354, 58041, 9190, 4412, 8599, 18473, 46691, 36797, 35347, 48567, 2296}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        Companion = new onNavigationEvent(null);
        IAuthTabCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.components.tuba.variable.v2.impl.TubaVariableLocalDataSourceImpl$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 113;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = FontAssetDelegate.onExtraCallbackWithResult((adInfo) obj);
                int i4 = IAuthTabCallback + 31;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 1, (Object) null);
        int i = IAuthTabCallbackDefault + 87;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            int i3 = $10 + 65;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 84 - (ViewConfiguration.getPressedStateDuration() >> 16), 21233 - KeyEvent.normalizeMetaState(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, ExpandableListView.getPackedPositionGroup(0L) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 21;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i8 = $11 + 85;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallbackDefault(true);
        adinfo.IAuthTabCallback(true);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        adinfo.onExtraCallbackWithResult(true);
        adinfo.onNavigationEvent(false);
        adinfo.onNavigationEvent(tnycx.onWarmupCompleted(Reflection.getOrCreateKotlinClass(Object.class), GetMotionInteractionState.onExtraCallback));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 4639049959070540207L;
    }
}
