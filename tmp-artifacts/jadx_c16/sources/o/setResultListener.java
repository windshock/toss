package o;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.TypeUtils1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setResultListener {
    private static int IAuthTabCallback = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static int onExtraCallback;
    private static final List<Pair<String, TypeUtils1>> onExtraCallbackWithResult;
    private static final TypeUtils1.onNavigationEvent onNavigationEvent;
    private static final List<Pair<String, String>> onWarmupCompleted;

    public static final /* synthetic */ List IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List<Pair<String, TypeUtils1>> list = onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return list;
    }

    public static final /* synthetic */ String onExtraCallback(Long l) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(l);
        int i4 = asInterface + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static final /* synthetic */ List onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        List<Pair<String, String>> list = onWarmupCompleted;
        int i5 = i2 + 11;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(zzag zzagVar, long j) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(zzagVar, j);
        int i4 = asBinder + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public static final /* synthetic */ TypeUtils1.onNavigationEvent onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TypeUtils1.onNavigationEvent onnavigationevent = onNavigationEvent;
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        return onnavigationevent;
    }

    static {
        TypeUtils1.onNavigationEvent onnavigationevent = new TypeUtils1.onNavigationEvent((String) null, 1, (DefaultConstructorMarker) null);
        onNavigationEvent = onnavigationevent;
        onExtraCallbackWithResult = CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback("[송금]", onnavigationevent), getWrite.IAuthTabCallback("[신용]", new TypeUtils1.onExtraCallbackWithResult((String) null, 1, (DefaultConstructorMarker) null))});
        onWarmupCompleted = CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback("송금 넛지 인터벌", "facepay.faceauth.nudgeIntervals"), getWrite.IAuthTabCallback("송금 패스 넛지 노출 카운트", "facepay.faceauth.nudgeVisibleCount"), getWrite.IAuthTabCallback("신용 넛지 인터벌", "facepay.faceauth.credit.nudgeIntervals"), getWrite.IAuthTabCallback("신용 패스 넛지 노출 카운트", "facepay.faceauth.credit.nudgeVisibleCount")});
        int i = onExtraCallback + 71;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private static final String onNavigationEvent(Long l) {
        int i = 2 % 2;
        if (l == null) {
            int i2 = asInterface + 69;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 16 / 0;
            }
            return "기록 없음 (튜바값 사용)";
        }
        long jLongValue = l.longValue() / 86400;
        long jLongValue2 = (l.longValue() % 86400) / 3600;
        long jLongValue3 = (l.longValue() % 3600) / 60;
        StringBuilder sb = new StringBuilder();
        if (jLongValue > 0) {
            sb.append(jLongValue + "일 ");
        }
        if (jLongValue2 > 0) {
            sb.append(jLongValue2 + "시간 ");
        }
        if (jLongValue3 > 0) {
            sb.append(jLongValue3 + "분 ");
        }
        sb.append("(" + l + "초)");
        String string = sb.toString();
        int i4 = asInterface + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private static final String IAuthTabCallback(zzag zzagVar, long j) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 9;
        asInterface = i3 % 128;
        if (i3 % 2 == 0 ? j == 0 : j == 1) {
            int i4 = i2 + 95;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return "기록 없음";
        }
        long jIAuthTabCallbackDefault = (zzagVar.IAuthTabCallbackDefault() - j) / 1000;
        long j2 = jIAuthTabCallbackDefault / 86400;
        long j3 = (jIAuthTabCallbackDefault % 86400) / 3600;
        long j4 = (jIAuthTabCallbackDefault % 3600) / 60;
        StringBuilder sb = new StringBuilder();
        if (j2 > 0) {
            sb.append(j2 + "일 ");
        }
        sb.append(j3 + "시간 " + j4 + "분 " + (jIAuthTabCallbackDefault % 60) + "초");
        return sb.toString();
    }
}
