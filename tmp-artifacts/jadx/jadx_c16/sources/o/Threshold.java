package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.tracker.entry.CustomizableLog;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tracker.entry.TrackLog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class Threshold {
    private static int IAuthTabCallback;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    public static final Threshold onWarmupCompleted;
    private static final byte[] $$a = {41, -64, -63, -4};
    private static final int $$b = 58;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3;
        int i4 = 4 - (s * 3);
        int i5 = s2 * 2;
        byte[] bArr = $$a;
        int i6 = i + 109;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            i6 = i5;
            i2 = 0;
            int i8 = i4;
            i6 += -i7;
            i3 = i8 + 1;
            bArr2[i2] = (byte) i6;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i3];
            i8 = i3;
            i6 += -i7;
            i3 = i8 + 1;
            bArr2[i2] = (byte) i6;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            bArr2[i2] = (byte) i6;
            if (i2 == i5) {
            }
        }
    }

    static {
        onExtraCallbackWithResult = 0;
        IAuthTabCallback();
        onWarmupCompleted = new Threshold();
        int i = IAuthTabCallbackDefault + 11;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Threshold() {
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static long onExtraCallbackWithResult = 454193446867851520L;
        private static int onTransact;
        private final Map<String, Object> IAuthTabCallback;
        private final String onExtraCallback;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public onWarmupCompleted() {
            this(null, null, null, null, 15, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 41;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if ((!Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) || !Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                int i4 = IAuthTabCallbackStub + 113;
                onTransact = i4 % 128;
                return i4 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                int i5 = IAuthTabCallbackStub + 123;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            int i7 = IAuthTabCallbackStub + 29;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 7;
            onTransact = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((((this.onNavigationEvent.hashCode() >> 116) >>> this.onExtraCallback.hashCode()) / 98) - this.onWarmupCompleted.hashCode()) / 100) >> this.IAuthTabCallback.hashCode() : (((((this.onNavigationEvent.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
            int i3 = IAuthTabCallbackStub + 77;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Options(logNameKey=" + this.onNavigationEvent + ", defaultService=" + this.onExtraCallback + ", defaultCompany=" + this.onWarmupCompleted + ", extraParams=" + this.IAuthTabCallback + ")";
            int i2 = onTransact + 51;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.onNavigationEvent = str;
            this.onExtraCallback = str2;
            this.onWarmupCompleted = str3;
            this.IAuthTabCallback = map;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 77;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 59;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
            Object obj;
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallbackStub + 57;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{11140, 40639, 11240, 48348, 56102, 24637, 40793, 1606, 41946, 13538, 5891, 36364}, (ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)), objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{11140, 40639, 11240, 48348, 56102, 24637, 40793, 1606, 41946, 13538, 5891, 36364}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
                    obj = objArr2[0];
                }
                str = ((String) obj).intern();
            }
            if ((i & 2) != 0) {
                int i3 = IAuthTabCallbackStub + 103;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str2 = "common";
            }
            if ((i & 4) != 0) {
                int i4 = onTransact + 39;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                str3 = GetFeatureExtension.onWarmupCompleted.asBinder();
                int i6 = 2 % 2;
            }
            this(str, str2, str3, (i & 8) != 0 ? access8100.onNavigationEvent() : map);
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 117;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 93 / 0;
            }
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 63;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.onWarmupCompleted;
            int i4 = i2 + 57;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final Map<String, Object> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 99;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            Map<String, Object> map = this.IAuthTabCallback;
            int i5 = i2 + 101;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return map;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $10 + 23;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), View.resolveSizeAndState(0, 0, 0) + 84, 21232 - TextUtils.lastIndexOf("", '0', 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 14185), 19 - View.MeasureSpec.getMode(0), TextUtils.lastIndexOf("", '0', 0) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 13;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }
    }

    public final BaseResponseBody IAuthTabCallback(@NotNull Map<String, ? extends Object> map, @NotNull onWarmupCompleted onwarmupcompleted) {
        Map linkedHashMap;
        String str;
        long jLongValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object obj = map.get("params");
        Object obj2 = null;
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 == null || (linkedHashMap = access8100.onWarmupCompleted(map2)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(access8100.onWarmupCompleted(linkedHashMap, onwarmupcompleted.onWarmupCompleted()));
        Object obj3 = map.get("_domainLog");
        if (obj3 == null) {
            int i2 = IAuthTabCallbackStub + 113;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                obj3 = mapOnWarmupCompleted.get("_domainLog");
                int i3 = 91 / 0;
            } else {
                obj3 = mapOnWarmupCompleted.get("_domainLog");
            }
        }
        Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
        if (map3 == null) {
            return null;
        }
        Object obj4 = map3.get("domain");
        if (obj4 instanceof String) {
            int i4 = asInterface + 19;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            str = (String) obj4;
        } else {
            str = null;
        }
        if (str != null) {
            int i6 = asInterface + 91;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            if (StringsKt.isBlank(str)) {
                int i8 = asInterface + 89;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                str = null;
            }
            if (str != null) {
                Object obj5 = map.get("schema_id");
                Number number = obj5 instanceof Number ? (Number) obj5 : null;
                if (number != null) {
                    int i10 = asInterface + 69;
                    IAuthTabCallbackStub = i10 % 128;
                    if (i10 % 2 == 0) {
                        number.longValue();
                        obj2.hashCode();
                        throw null;
                    }
                    jLongValue = number.longValue();
                } else {
                    Object obj6 = mapOnWarmupCompleted.get("schema_id");
                    Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
                    if (number2 != null) {
                        jLongValue = number2.longValue();
                    }
                }
                Object obj7 = map.get("company");
                String strOnExtraCallback = obj7 instanceof String ? (String) obj7 : null;
                if (strOnExtraCallback == null) {
                    strOnExtraCallback = onwarmupcompleted.onExtraCallback();
                }
                mapOnWarmupCompleted.remove("_domainLog");
                mapOnWarmupCompleted.remove("schema_id");
                BaseResponseBody baseResponseBody = new BaseResponseBody(str, mapOnWarmupCompleted, Long.valueOf(jLongValue), map3.get("extra"), strOnExtraCallback);
                int i11 = asInterface + 21;
                IAuthTabCallbackStub = i11 % 128;
                if (i11 % 2 != 0) {
                    return baseResponseBody;
                }
                throw null;
            }
        }
        return null;
    }

    public final downloadZip onExtraCallbackWithResult(@NotNull Map<String, ? extends Object> map, @NotNull onWarmupCompleted onwarmupcompleted) throws Throwable {
        Map map2;
        Map linkedHashMap;
        List list;
        ArrayList arrayList;
        String strOnExtraCallback;
        Number number;
        Long lValueOf;
        String str;
        String str2;
        String strIntern;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object obj = map.get("params");
        String str3 = null;
        if (obj instanceof Map) {
            int i2 = IAuthTabCallbackStub + 49;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                map2 = (Map) obj;
                int i3 = 48 / 0;
            } else {
                map2 = (Map) obj;
            }
        } else {
            map2 = null;
        }
        if (map2 == null || (linkedHashMap = access8100.onWarmupCompleted(map2)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(access8100.onWarmupCompleted(linkedHashMap, onwarmupcompleted.onWarmupCompleted()));
        mapOnWarmupCompleted.remove("_domainLog");
        Object obj2 = map.get("_trackers");
        if (obj2 instanceof List) {
            int i4 = IAuthTabCallbackStub + 3;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            list = (List) obj2;
        } else {
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof String) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = null;
        }
        Object obj4 = map.get("company");
        if (obj4 instanceof String) {
            int i6 = IAuthTabCallbackStub + 43;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            strOnExtraCallback = (String) obj4;
        } else {
            strOnExtraCallback = null;
        }
        if (strOnExtraCallback == null) {
            strOnExtraCallback = onwarmupcompleted.onExtraCallback();
        }
        String str4 = strOnExtraCallback;
        Object obj5 = map.get("schema_id");
        if (obj5 instanceof Number) {
            int i8 = IAuthTabCallbackStub + 93;
            asInterface = i8 % 128;
            if (i8 % 2 != 0) {
                number = (Number) obj5;
                int i9 = 24 / 0;
            } else {
                number = (Number) obj5;
            }
        } else {
            number = null;
        }
        if (number != null) {
            lValueOf = Long.valueOf(number.longValue());
        } else {
            Object obj6 = linkedHashMap.get("schema_id");
            Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
            if (number2 != null) {
                int i10 = asInterface + 77;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                lValueOf = Long.valueOf(number2.longValue());
            } else {
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            return new TrackLog(lValueOf.longValue(), mapOnWarmupCompleted, str4, (String) null, 8, (DefaultConstructorMarker) null);
        }
        Object obj7 = map.get("log_type");
        String str5 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = map.get(onwarmupcompleted.onNavigationEvent());
        if (obj8 instanceof String) {
            int i12 = IAuthTabCallbackStub + 3;
            asInterface = i12 % 128;
            int i13 = i12 % 2;
            str = (String) obj8;
        } else {
            str = null;
        }
        if (str5 != null) {
            int i14 = IAuthTabCallbackStub + 1;
            asInterface = i14 % 128;
            if (i14 % 2 != 0) {
                str3.hashCode();
                throw null;
            }
            if (str != null) {
                Object objRemove = mapOnWarmupCompleted.remove("log_version");
                if (objRemove instanceof String) {
                    int i15 = IAuthTabCallbackStub + 19;
                    asInterface = i15 % 128;
                    if (i15 % 2 != 0) {
                        str3.hashCode();
                        throw null;
                    }
                    str3 = (String) objRemove;
                }
                if (str3 == null) {
                    int i16 = IAuthTabCallbackStub + 101;
                    asInterface = i16 % 128;
                    if (i16 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        a((char) (57358 << TextUtils.indexOf((CharSequence) "", ';', 0, 0)), (-412080293) << Color.rgb(0, 0, 1), new char[]{12928}, new char[]{0, 0, 0, 0}, new char[]{23543, 28711, 3560, 12512}, objArr);
                        strIntern = ((String) objArr[0]).intern();
                    } else {
                        Object[] objArr2 = new Object[1];
                        a((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 57358), (-412080293) - Color.rgb(0, 0, 0), new char[]{12928}, new char[]{0, 0, 0, 0}, new char[]{23543, 28711, 3560, 12512}, objArr2);
                        strIntern = ((String) objArr2[0]).intern();
                    }
                    str2 = strIntern;
                } else {
                    str2 = str3;
                }
                return new CustomizableLog(str, str5, onwarmupcompleted.IAuthTabCallback(), mapOnWarmupCompleted, str2, str4);
            }
        }
        Object obj9 = map.get("event");
        String str6 = obj9 instanceof String ? (String) obj9 : null;
        if (str6 != null) {
            int i17 = IAuthTabCallbackStub + 9;
            asInterface = i17 % 128;
            int i18 = i17 % 2;
            if (arrayList != null && !arrayList.isEmpty()) {
                return new TrackEvent(str6, mapOnWarmupCompleted, arrayList, str4);
            }
        }
        return null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
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
            int i3 = $10 + 35;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 43 - TextUtils.getOffsetBefore("", 0), View.MeasureSpec.getSize(0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (Process.myPid() >> 22)), 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1493 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 23973), 49 - ((byte) KeyEvent.getModifierMetaStateMask()), 22938 - TextUtils.lastIndexOf("", '0'), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    c2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 45848), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $10 + 89;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = 7798559133331975163L;
        IAuthTabCallback = -1776194565;
        onExtraCallback = (char) 38677;
    }
}
