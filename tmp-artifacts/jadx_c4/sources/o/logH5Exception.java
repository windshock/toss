package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.TossApplication;
import im.toss.facepay.log.model.LogData;
import im.toss.facepay.log.model.LogStatus;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiFunction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.PangleEncryptManager;
import o.addDatas2Performance;
import o.getMtopInstance;
import o.logH5Exception;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class logH5Exception extends manualParseJson {
    private volatile addDatas2Performance IAuthTabCallback;
    private final ConcurrentLinkedQueue<addDatas2Performance> asInterface;
    private volatile setMemoryMappings onExtraCallback;
    private final ConcurrentHashMap<String, Integer> onExtraCallbackWithResult;
    private volatile boolean onNavigationEvent;
    private final AtomicBoolean onWarmupCompleted;
    private static final byte[] $$d = {107, -21, -54, -113};
    private static final int $$e = 20;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact = 478308946;
    private static int[] IAuthTabCallbackDefault = {-284809502, 218616771, -1050822001, 665605390, 2118107662, -219520352, 40374792, 933590997, 663611636, 1675645403, 557274235, 849108297, -607313898, -1443788002, -362743796, 1438685009, 93158657, 749863996};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$f(short s, int i, short s2) {
        int i2;
        int i3;
        int i4 = 3 - (s * 4);
        byte[] bArr = $$d;
        int i5 = (s2 * 3) + 1;
        int i6 = 105 - (i * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 += -i7;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i6 += -i7;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public logH5Exception() {
        String str = null;
        this(str, 1, str);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        logH5Exception logh5exception = (logH5Exception) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        addDatas2Performance adddatas2performanceOnExtraCallbackWithResult = onExtraCallbackWithResult(logh5exception);
        int i4 = IAuthTabCallbackStub + 31;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return adddatas2performanceOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = i7 | i;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i));
        int i11 = (~(i5 | i)) | (~(i7 | i5));
        int i12 = i9 | i8;
        int i13 = i + i3 + i4 + (988256597 * i6) + ((-695401848) * i2);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i) - 1270611968) + ((-1462879173) * i3) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i4) + (479985664 * i6) + (1063256064 * i2) + (1273561088 * i14);
        int i16 = (i * (-1367684995)) + 376186498 + (i3 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i4 * (-1367684709)) + (i6 * 1512018807) + (i2 * 1127043160) + (i14 * (-418185216));
        int i17 = i15 + (i16 * i16 * 1903099904);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(logH5Exception logh5exception, PangleEncryptManager pangleEncryptManager) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(logh5exception, pangleEncryptManager);
        }
        onExtraCallback(logh5exception, pangleEncryptManager);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(logH5Exception logh5exception, List list, PangleEncryptManager pangleEncryptManager) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(logh5exception, list, pangleEncryptManager);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(logh5exception, list, pangleEncryptManager);
        int i3 = IAuthTabCallbackStub + 111;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Integer onExtraCallbackWithResult(Integer num, Integer num2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(num, num2);
        }
        onExtraCallback(num, num2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Integer onNavigationEvent(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        Integer num = (Integer) IAuthTabCallback(new Object[]{function2, obj, obj2}, -449627323, TossApplication.onSessionEnded.onExtraCallback(), 449627324, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback());
        int i4 = asBinder + 21;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return num;
    }

    public static /* synthetic */ Unit onNavigationEvent(logH5Exception logh5exception, List list, PangleEncryptManager pangleEncryptManager) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(logh5exception, list, pangleEncryptManager);
        }
        IAuthTabCallback(logh5exception, list, pangleEncryptManager);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(logH5Exception logh5exception, List list, PangleEncryptManager pangleEncryptManager) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asBinder(logh5exception, list, pangleEncryptManager);
            throw null;
        }
        Unit unitAsBinder = asBinder(logh5exception, list, pangleEncryptManager);
        int i3 = asBinder + 123;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAsBinder;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logH5Exception(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = new ConcurrentHashMap<>();
        this.asInterface = new ConcurrentLinkedQueue<>();
        this.onExtraCallback = needWaitIpc.IAuthTabCallback.IAuthTabCallback();
        this.onWarmupCompleted = new AtomicBoolean(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ logH5Exception(String str, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackStub + 113;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            c(new char[]{65529, 65532, 1, 4, 65529, 14, 65527, 65533, 65531, 65529, 65534, 6, 7, 1, '\f'}, (KeyEvent.getMaxKeyCode() >> 16) + 11, true, 15 - TextUtils.getCapsMode("", 0, 0), Color.green(0) + 227, objArr);
            str = ((String) objArr[0]).intern();
            int i4 = IAuthTabCallbackStub + 47;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this(str);
    }

    public final void IAuthTabCallbackDefault() throws Throwable {
        int i = 2 % 2;
        this.onExtraCallback = needWaitIpc.IAuthTabCallback.IAuthTabCallback();
        this.onWarmupCompleted.set(false);
        this.onExtraCallbackWithResult.clear();
        this.asInterface.clear();
        this.onNavigationEvent = false;
        this.IAuthTabCallback = null;
        LogStatus logStatus = LogStatus.START;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        performance.IAuthTabCallback.onNavigationEvent(pangleEncryptManager);
        Unit unit = Unit.INSTANCE;
        onNavigationEvent(new LogData(logStatus, (LogData.SuccessYn) null, (String) null, (String) null, pangleEncryptManager.onExtraCallbackWithResult(), (JsonObject) null, (JsonObject) null, 110, (DefaultConstructorMarker) null));
        int i2 = asBinder + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Integer onExtraCallback(Integer num, Integer num2) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(num, "");
        Intrinsics.checkNotNullParameter(num2, "");
        Integer numValueOf = Integer.valueOf(num.intValue() + num2.intValue());
        int i4 = asBinder + 113;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return numValueOf;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Integer num = (Integer) function2.invoke(obj, obj2);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = asBinder + 75;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void onNavigationEvent(@NotNull addDatas2Performance adddatas2performance) {
        RVPub rVPubOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adddatas2performance, "");
            this.asInterface.add(adddatas2performance);
            rVPubOnNavigationEvent = adddatas2performance.onNavigationEvent();
            int i3 = 46 / 0;
            if (rVPubOnNavigationEvent == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(adddatas2performance, "");
            this.asInterface.add(adddatas2performance);
            rVPubOnNavigationEvent = adddatas2performance.onNavigationEvent();
            if (rVPubOnNavigationEvent == null) {
                return;
            }
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.onExtraCallbackWithResult;
        String logName = rVPubOnNavigationEvent.getLogName();
        final Function2 function2 = new Function2() { // from class: im.toss.facepay.validation.logger.FaceValidationLogger$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 115;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Integer numOnExtraCallbackWithResult = logH5Exception.onExtraCallbackWithResult((Integer) obj, (Integer) obj2);
                int i7 = onWarmupCompleted + 99;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return numOnExtraCallbackWithResult;
            }
        };
        concurrentHashMap.merge(logName, 1, new BiFunction() { // from class: im.toss.facepay.validation.logger.FaceValidationLogger$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 95;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                Integer numOnNavigationEvent = logH5Exception.onNavigationEvent(function2, obj, obj2);
                int i7 = onExtraCallback + 121;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    return numOnNavigationEvent;
                }
                throw null;
            }
        });
        int i4 = asBinder + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 % 5;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull addDatas2Performance adddatas2performance) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adddatas2performance, "");
        this.IAuthTabCallback = adddatas2performance;
        int i4 = IAuthTabCallbackStub + 123;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final addDatas2Performance onExtraCallbackWithResult(logH5Exception logh5exception) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        addDatas2Performance adddatas2performancePoll = logh5exception.asInterface.poll();
        int i4 = asBinder + 11;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return adddatas2performancePoll;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ee A[LOOP:0: B:51:0x01e8->B:53:0x01ee, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull getMtopInstance getmtopinstance) throws Throwable {
        JsonObject jsonObjectOnExtraCallback;
        String strIntern;
        Object obj;
        String logName;
        String str;
        RVPub rVPubOnNavigationEvent;
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        String strOnWarmupCompleted = "";
        Intrinsics.checkNotNullParameter(getmtopinstance, "");
        if (this.onWarmupCompleted.getAndSet(true)) {
            return;
        }
        long jOnExtraCallback = toStringOptimize.onExtraCallback(this.onExtraCallback);
        List<addDatas2Performance> listAccess000 = clearRevision.access000(clearRevision.onNavigationEvent(new Function0() { // from class: im.toss.facepay.validation.logger.FaceValidationLogger$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 77;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0};
                int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
                addDatas2Performance adddatas2performance = (addDatas2Performance) logH5Exception.IAuthTabCallback(objArr, 474082071, TossApplication.onSessionEnded.onExtraCallback(), -474082069, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback());
                int i5 = onNavigationEvent + 29;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return adddatas2performance;
            }
        }));
        addDatas2Performance adddatas2performance = (addDatas2Performance) CollectionsKt.lastOrNull(listAccess000);
        boolean zIsInstance = Class.forName("o.getMtopInstance$onExtraCallbackWithResult").isInstance(getmtopinstance);
        try {
            getMtopInstance.onExtraCallbackWithResult onextracallbackwithresult = Class.forName("o.getMtopInstance$onExtraCallbackWithResult").isInstance(getmtopinstance) ? (getMtopInstance.onExtraCallbackWithResult) getmtopinstance : null;
            if (onextracallbackwithresult != null) {
                int i2 = IAuthTabCallbackStub + 17;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                zOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
            } else {
                zOnExtraCallbackWithResult = false;
            }
            jsonObjectOnExtraCallback = IAuthTabCallback(jOnExtraCallback, zOnExtraCallbackWithResult, listAccess000);
            int i4 = asBinder + 113;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
            onNavigationEvent();
            TextUtils.indexOf((CharSequence) "", '0');
            jsonObjectOnExtraCallback = manualParseJson.onExtraCallback();
        }
        LogStatus logStatus = LogStatus.END;
        LogData.SuccessYn successYnIAuthTabCallback = setPermission.IAuthTabCallback(Boolean.valueOf(zIsInstance));
        boolean zIsInstance2 = Class.forName("o.getMtopInstance$onExtraCallback").isInstance(getmtopinstance);
        if (zIsInstance2) {
            int i6 = IAuthTabCallbackStub + 31;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            d(new int[]{-982344726, 884778093, -401281236, 993306017}, '6' - AndroidCharacter.getMirror('0'), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else if (Class.forName("o.getMtopInstance$onNavigationEvent").isInstance(getmtopinstance)) {
            Object[] objArr2 = new Object[1];
            c(new char[]{65527, 4, 1, 4, 4}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), true, View.resolveSizeAndState(0, 0, 0) + 5, TextUtils.lastIndexOf("", '0') + 202, objArr2);
            strIntern = ((String) objArr2[0]).intern();
        } else if (zIsInstance) {
            int i8 = IAuthTabCallbackStub + 65;
            asBinder = i8 % 128;
            if (i8 % 2 != 0) {
                Object[] objArr3 = new Object[1];
                d(new int[]{1984133406, 43138855, 384539921, -1940715819}, 123 << (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
                obj = objArr3[0];
            } else {
                Object[] objArr4 = new Object[1];
                d(new int[]{1984133406, 43138855, 384539921, -1940715819}, 8 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                obj = objArr4[0];
            }
            strIntern = ((String) obj).intern();
        } else {
            if (!Class.forName("o.getMtopInstance$onWarmupCompleted").isInstance(getmtopinstance)) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr5 = new Object[1];
            c(new char[]{6, 65531, 65535, 65527, 1, 7, 6}, 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), false, TextUtils.indexOf((CharSequence) "", '0', 0) + 8, Color.green(0) + 201, objArr5);
            strIntern = ((String) objArr5[0]).intern();
        }
        if (zIsInstance2) {
            strOnWarmupCompleted = ((getMtopInstance.onExtraCallback) getmtopinstance).IAuthTabCallback();
        } else {
            if (!Class.forName("o.getMtopInstance$onNavigationEvent").isInstance(getmtopinstance)) {
                if (!zIsInstance) {
                    if (!Class.forName("o.getMtopInstance$onWarmupCompleted").isInstance(getmtopinstance)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (adddatas2performance == null || (rVPubOnNavigationEvent = adddatas2performance.onNavigationEvent()) == null) {
                        logName = null;
                    } else {
                        int i9 = IAuthTabCallbackStub + 125;
                        asBinder = i9 % 128;
                        int i10 = i9 % 2;
                        logName = rVPubOnNavigationEvent.getLogName();
                    }
                    if (logName != null) {
                        str = logName;
                    }
                }
                PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
                int i11 = IAuthTabCallbackStub + 125;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                for (Map.Entry entry : jsonObjectOnExtraCallback.entrySet()) {
                    int i13 = asBinder + 113;
                    IAuthTabCallbackStub = i13 % 128;
                    int i14 = i13 % 2;
                    pangleEncryptManager.onExtraCallbackWithResult((String) entry.getKey(), (JsonElement) entry.getValue());
                }
                Object[] objArr6 = new Object[1];
                c(new char[]{7, 65524, 65528, 4, 65529, 65530, 65524, 65528, 4, '\n', 3, '\t', '\b', 65530, 7, 7, 4}, 13 - ((Process.getThreadPriority(0) + 20) >> 6), false, 17 - View.combineMeasuredStates(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 230, objArr6);
                onNavigationEvent(pangleEncryptManager, ((String) objArr6[0]).intern(), new Function1() { // from class: im.toss.facepay.validation.logger.FaceValidationLogger$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i15 = 2 % 2;
                        int i16 = onNavigationEvent + 93;
                        onExtraCallbackWithResult = i16 % 128;
                        int i17 = i16 % 2;
                        Unit unitIAuthTabCallback = logH5Exception.IAuthTabCallback(this.f$0, (PangleEncryptManager) obj2);
                        int i18 = onExtraCallbackWithResult + 13;
                        onNavigationEvent = i18 % 128;
                        if (i18 % 2 == 0) {
                            return unitIAuthTabCallback;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                });
                Unit unit = Unit.INSTANCE;
                onNavigationEvent(new LogData(logStatus, successYnIAuthTabCallback, strIntern, str, pangleEncryptManager.onExtraCallbackWithResult(), (JsonObject) null, (JsonObject) null, 96, (DefaultConstructorMarker) null));
            }
            int i15 = IAuthTabCallbackStub + 49;
            asBinder = i15 % 128;
            int i16 = i15 % 2;
            strOnWarmupCompleted = ((getMtopInstance.onNavigationEvent) getmtopinstance).onWarmupCompleted();
        }
        str = strOnWarmupCompleted;
        PangleEncryptManager pangleEncryptManager2 = new PangleEncryptManager();
        int i112 = IAuthTabCallbackStub + 125;
        asBinder = i112 % 128;
        int i122 = i112 % 2;
        while (r3.hasNext()) {
        }
        Object[] objArr62 = new Object[1];
        c(new char[]{7, 65524, 65528, 4, 65529, 65530, 65524, 65528, 4, '\n', 3, '\t', '\b', 65530, 7, 7, 4}, 13 - ((Process.getThreadPriority(0) + 20) >> 6), false, 17 - View.combineMeasuredStates(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 230, objArr62);
        onNavigationEvent(pangleEncryptManager2, ((String) objArr62[0]).intern(), new Function1() { // from class: im.toss.facepay.validation.logger.FaceValidationLogger$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2) {
                int i152 = 2 % 2;
                int i162 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i162 % 128;
                int i17 = i162 % 2;
                Unit unitIAuthTabCallback = logH5Exception.IAuthTabCallback(this.f$0, (PangleEncryptManager) obj2);
                int i18 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i18 % 128;
                if (i18 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        Unit unit2 = Unit.INSTANCE;
        onNavigationEvent(new LogData(logStatus, successYnIAuthTabCallback, strIntern, str, pangleEncryptManager2.onExtraCallbackWithResult(), (JsonObject) null, (JsonObject) null, 96, (DefaultConstructorMarker) null));
    }

    private static final Unit onExtraCallback(logH5Exception logh5exception, PangleEncryptManager pangleEncryptManager) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        for (Map.Entry<String, Integer> entry : logh5exception.onExtraCallbackWithResult.entrySet()) {
            dynamicTrack.onNavigationEvent(pangleEncryptManager, entry.getKey(), Integer.valueOf(entry.getValue().intValue()));
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $10 + 91;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onTransact)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 35125), Color.blue(0) + 23, AndroidCharacter.getMirror('0') + 10230, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 12843), 55 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2167, 1298711993, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            int i9 = $11 + 71;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $11 + 47;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 12843), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55, 2166 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1298711993, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallbackDefault;
        int i3 = -1469660336;
        int i4 = 16;
        if (iArr2 != null) {
            int i5 = $11 + 99;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), TextUtils.getCapsMode("", 0, 0) + 72, (ViewConfiguration.getMaximumFlingVelocity() >> i4) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = -1469660336;
                    i4 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackDefault;
        if (iArr5 != null) {
            int i8 = $10 + 81;
            int i9 = i8 % 128;
            $11 = i9;
            int i10 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = i9 + 1;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            for (int i13 = 0; i13 < length3; i13++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i13])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 73 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22253 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 39 - (ViewConfiguration.getLongPressTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 4033), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 77, (ViewConfiguration.getScrollBarSize() >> 8) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void IAuthTabCallback(PangleEncryptManager pangleEncryptManager, final List<addData2Performance> list) throws Throwable {
        int i = 2 % 2;
        List<addData2Performance> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallbackStub + 1;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.add(Long.valueOf(setLogBuffers.asBinder(((addData2Performance) it.next()).onNavigationEvent().onWarmupCompleted())));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            arrayList.add(Long.valueOf(setLogBuffers.asBinder(((addData2Performance) it.next()).onNavigationEvent().onWarmupCompleted())));
        }
        Object[] objArr = new Object[1];
        d(new int[]{-1336920170, 1564338826}, 2 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        onWarmupCompleted(pangleEncryptManager, ((String) objArr[0]).intern(), arrayList, new Function1() { // from class: im.toss.facepay.validation.logger.FaceValidationLogger$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj2) throws Throwable {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 69;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallback = logH5Exception.onExtraCallback(this.f$0, list, (PangleEncryptManager) obj2);
                int i6 = onNavigationEvent + 33;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return unitOnExtraCallback;
            }
        });
        int i3 = asBinder + 47;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(logH5Exception logh5exception, List list, PangleEncryptManager pangleEncryptManager) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        xkz2 xkz2Var = new xkz2();
        List list2 = list;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            StartAction startAction = (StartAction) ((addData2Performance) it.next()).onNavigationEvent().onExtraCallback();
            PangleEncryptManager pangleEncryptManager2 = new PangleEncryptManager();
            Object[] objArr = new Object[1];
            d(new int[]{1431539490, 872739002}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            dynamicTrack.onNavigationEvent(pangleEncryptManager2, ((String) objArr[0]).intern(), Integer.valueOf(startAction.onExtraCallback()));
            Object[] objArr2 = new Object[1];
            d(new int[]{-532266027, 1830924937}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            dynamicTrack.onNavigationEvent(pangleEncryptManager2, ((String) objArr2[0]).intern(), Integer.valueOf(startAction.onNavigationEvent()));
            Object[] objArr3 = new Object[1];
            c(new char[]{65532, 11, 65533, 65528, '\b'}, ((Process.getThreadPriority(0) + 20) >> 6) + 1, false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 5, TextUtils.getCapsMode("", 0, 0) + 231, objArr3);
            dynamicTrack.onNavigationEvent(pangleEncryptManager2, ((String) objArr3[0]).intern(), Integer.valueOf(startAction.asInterface()));
            Object[] objArr4 = new Object[1];
            d(new int[]{-213189089, -2080864915, 111342543, 1749250471}, View.MeasureSpec.getSize(0) + 6, objArr4);
            dynamicTrack.onNavigationEvent(pangleEncryptManager2, ((String) objArr4[0]).intern(), Integer.valueOf(startAction.IAuthTabCallback()));
            xkz2Var.onWarmupCompleted(pangleEncryptManager2.onExtraCallbackWithResult());
        }
        Unit unit = Unit.INSTANCE;
        JsonArray jsonArrayOnNavigationEvent = xkz2Var.onNavigationEvent();
        Object[] objArr5 = new Object[1];
        c(new char[]{4, 11, 5, 65528, 14, 5, 65528, 65525, 65533, 4, 65535, 65530}, KeyEvent.getDeadChar(0, 0) + 4, true, 12 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 229, objArr5);
        pangleEncryptManager.onExtraCallbackWithResult(((String) objArr5[0]).intern(), jsonArrayOnNavigationEvent);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            int i2 = asBinder + 21;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(Integer.valueOf(((Number) ((addData2Performance) it2.next()).IAuthTabCallback().onExtraCallback()).intValue()));
        }
        Object[] objArr6 = new Object[1];
        d(new int[]{1666253141, -1093582764, 1106932889, 1487764146}, 5 - TextUtils.getOffsetAfter("", 0), objArr6);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it3 = list2.iterator();
        while (!(!it3.hasNext())) {
            arrayList2.add(Integer.valueOf(((Number) ((addData2Performance) it3.next()).onWarmupCompleted().onExtraCallback()).intValue()));
        }
        Object[] objArr7 = new Object[1];
        d(new int[]{1074486751, -1309595537}, View.resolveSizeAndState(0, 0, 0) + 4, objArr7);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it4 = list2.iterator();
        int i4 = IAuthTabCallbackStub + 47;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 5;
        }
        while (it4.hasNext()) {
            int i6 = IAuthTabCallbackStub + 73;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            arrayList3.add(Float.valueOf((float) ((Number) ((addData2Performance) it4.next()).onExtraCallback().onExtraCallback()).doubleValue()));
        }
        Object[] objArr8 = new Object[1];
        c(new char[]{0, 65535, 1, 0, 3, 5, 65530}, 2 - Color.green(0), false, 7 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 235, objArr8);
        logh5exception.IAuthTabCallback(pangleEncryptManager, ((String) objArr8[0]).intern(), arrayList3);
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(PangleEncryptManager pangleEncryptManager, final List<track> list) throws Throwable {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getCausesCount<Float> getcausescountAsBinder = ((track) it.next()).asBinder();
            Long lValueOf = null;
            if (getcausescountAsBinder != null) {
                int i2 = asBinder + 49;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    Long.valueOf(setLogBuffers.asBinder(getcausescountAsBinder.onWarmupCompleted()));
                    lValueOf.hashCode();
                    throw null;
                }
                lValueOf = Long.valueOf(setLogBuffers.asBinder(getcausescountAsBinder.onWarmupCompleted()));
            }
            if (lValueOf != null) {
                int i3 = IAuthTabCallbackStub + 27;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                arrayList.add(lValueOf);
                int i5 = asBinder + 17;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Object[] objArr = new Object[1];
        d(new int[]{-932451362, 310507775}, '2' - AndroidCharacter.getMirror('0'), objArr);
        onWarmupCompleted(pangleEncryptManager, ((String) objArr[0]).intern(), arrayList, new Function1() { // from class: im.toss.facepay.validation.logger.FaceValidationLogger$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 99;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnNavigationEvent = logH5Exception.onNavigationEvent(this.f$0, list, (PangleEncryptManager) obj);
                int i10 = onExtraCallback + 5;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[PHI: r7
      0x004c: PHI (r7v64 kotlin.Pair) = (r7v63 kotlin.Pair), (r7v67 kotlin.Pair) binds: [B:13:0x004a, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0234 A[PHI: r7
      0x0234: PHI (r7v44 o.getCausesCount<java.lang.Float>) = (r7v43 o.getCausesCount<java.lang.Float>), (r7v51 o.getCausesCount<java.lang.Float>) binds: [B:69:0x0232, B:66:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(logH5Exception logh5exception, List list, PangleEncryptManager pangleEncryptManager) throws Throwable {
        AnimUtils animUtils;
        AnimUtils animUtils2;
        Float fValueOf;
        AnimUtils animUtils3;
        getCausesCount<Float> getcausescountAsBinder;
        Float f;
        Float f2;
        Float f3;
        Pair pair;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            Float f4 = null;
            if (!it.hasNext()) {
                break;
            }
            getCausesCount<Pair<Float, Float>> getcausescountOnWarmupCompleted = ((track) it.next()).onWarmupCompleted();
            if (getcausescountOnWarmupCompleted != null) {
                int i2 = IAuthTabCallbackStub + 21;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    pair = (Pair) getcausescountOnWarmupCompleted.onExtraCallback();
                    int i3 = 68 / 0;
                    if (pair != null) {
                        f4 = (Float) pair.getFirst();
                    }
                } else {
                    pair = (Pair) getcausescountOnWarmupCompleted.onExtraCallback();
                    if (pair != null) {
                    }
                }
            }
            if (f4 != null) {
                arrayList.add(f4);
            }
        }
        Object[] objArr = new Object[1];
        d(new int[]{538421444, -1409970516, -777451096, 1282943199, 485350375, 2135085634}, 11 - Color.alpha(0), objArr);
        logh5exception.IAuthTabCallback(pangleEncryptManager, ((String) objArr[0]).intern(), arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            getCausesCount<Float> getcausescountIAuthTabCallbackDefault = ((track) it2.next()).IAuthTabCallbackDefault();
            Float f5 = getcausescountIAuthTabCallbackDefault != null ? (Float) getcausescountIAuthTabCallbackDefault.onExtraCallback() : null;
            if (f5 != null) {
                arrayList2.add(f5);
            }
        }
        Object[] objArr2 = new Object[1];
        c(new char[]{2, 3, 65527, 65527, 0, '\t', 7, 65533, 3}, 1 - KeyEvent.normalizeMetaState(0), false, 9 - View.resolveSizeAndState(0, 0, 0), 231 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        logh5exception.IAuthTabCallback(pangleEncryptManager, ((String) objArr2[0]).intern(), arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            int i4 = IAuthTabCallbackStub + 121;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                ((track) it3.next()).IAuthTabCallback();
                throw null;
            }
            getCausesCount<Float> getcausescountIAuthTabCallback = ((track) it3.next()).IAuthTabCallback();
            if (getcausescountIAuthTabCallback != null) {
                int i5 = IAuthTabCallbackStub + 41;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                f3 = (Float) getcausescountIAuthTabCallback.onExtraCallback();
            } else {
                f3 = null;
            }
            if (f3 != null) {
                arrayList3.add(f3);
            }
        }
        Object[] objArr3 = new Object[1];
        d(new int[]{1684436298, -35858154}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, objArr3);
        logh5exception.IAuthTabCallback(pangleEncryptManager, ((String) objArr3[0]).intern(), arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            getCausesCount<Float> getcausescountOnTransact = ((track) it4.next()).onTransact();
            if (getcausescountOnTransact != null) {
                int i7 = IAuthTabCallbackStub + 39;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                f2 = (Float) getcausescountOnTransact.onExtraCallback();
            } else {
                int i9 = asBinder + 123;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                f2 = null;
            }
            if (f2 != null) {
                arrayList4.add(f2);
            }
        }
        Object[] objArr4 = new Object[1];
        c(new char[]{65535, 65524, 6, 6, 65528, 6, 6, '\b', 1, 65530}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, (ViewConfiguration.getWindowTouchSlop() >> 8) + 232, objArr4);
        logh5exception.IAuthTabCallback(pangleEncryptManager, ((String) objArr4[0]).intern(), arrayList4);
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            getCausesCount<Float> getcausescountOnExtraCallbackWithResult = ((track) it5.next()).onExtraCallbackWithResult();
            Float f6 = getcausescountOnExtraCallbackWithResult != null ? (Float) getcausescountOnExtraCallbackWithResult.onExtraCallback() : null;
            if (f6 != null) {
                int i11 = asBinder + 97;
                IAuthTabCallbackStub = i11 % 128;
                if (i11 % 2 == 0) {
                    arrayList5.add(f6);
                    int i12 = 4 / 0;
                } else {
                    arrayList5.add(f6);
                }
            }
        }
        Object[] objArr5 = new Object[1];
        d(new int[]{766626884, 616702374, 1066484873, 774741183, -1206508238, 1552067991, 514012480, -47425654, 1633108742, -446419243}, 18 - Color.green(0), objArr5);
        logh5exception.IAuthTabCallback(pangleEncryptManager, ((String) objArr5[0]).intern(), arrayList5);
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            int i13 = asBinder + 51;
            IAuthTabCallbackStub = i13 % 128;
            if (i13 % 2 == 0) {
                getcausescountAsBinder = ((track) it6.next()).asBinder();
                int i14 = 43 / 0;
                f = getcausescountAsBinder != null ? (Float) getcausescountAsBinder.onExtraCallback() : null;
            } else {
                getcausescountAsBinder = ((track) it6.next()).asBinder();
                if (getcausescountAsBinder != null) {
                }
            }
            if (f != null) {
                arrayList6.add(f);
            }
        }
        Object[] objArr6 = new Object[1];
        d(new int[]{855663760, 1000087722, -852260392, 1517927210, 1185365316, -219298403, -1583074208, 407531861}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13, objArr6);
        logh5exception.IAuthTabCallback(pangleEncryptManager, ((String) objArr6[0]).intern(), arrayList6);
        PangleEncryptManager pangleEncryptManager2 = new PangleEncryptManager();
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            getCausesCount<AnimUtils> getcausescountAsInterface = ((track) it7.next()).asInterface();
            if (getcausescountAsInterface == null || (animUtils3 = (AnimUtils) getcausescountAsInterface.onExtraCallback()) == null) {
                fValueOf = null;
            } else {
                int i15 = IAuthTabCallbackStub + 125;
                asBinder = i15 % 128;
                int i16 = i15 % 2;
                fValueOf = Float.valueOf((float) animUtils3.onWarmupCompleted());
            }
            if (fValueOf != null) {
                int i17 = asBinder + 15;
                IAuthTabCallbackStub = i17 % 128;
                int i18 = i17 % 2;
                arrayList7.add(fValueOf);
            }
        }
        Object[] objArr7 = new Object[1];
        d(new int[]{-1945153108, -1589335326}, 3 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr7);
        logh5exception.IAuthTabCallback(pangleEncryptManager2, ((String) objArr7[0]).intern(), arrayList7);
        ArrayList arrayList8 = new ArrayList();
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            getCausesCount<AnimUtils> getcausescountAsInterface2 = ((track) it8.next()).asInterface();
            Float fValueOf2 = (getcausescountAsInterface2 == null || (animUtils2 = (AnimUtils) getcausescountAsInterface2.onExtraCallback()) == null) ? null : Float.valueOf((float) animUtils2.IAuthTabCallback());
            if (fValueOf2 != null) {
                int i19 = IAuthTabCallbackStub + 125;
                asBinder = i19 % 128;
                if (i19 % 2 != 0) {
                    arrayList8.add(fValueOf2);
                    throw null;
                }
                arrayList8.add(fValueOf2);
            }
        }
        Object[] objArr8 = new Object[1];
        d(new int[]{-541891048, -1470566605, 1111855501, 838575978}, 5 - TextUtils.indexOf("", "", 0, 0), objArr8);
        logh5exception.IAuthTabCallback(pangleEncryptManager2, ((String) objArr8[0]).intern(), arrayList8);
        ArrayList arrayList9 = new ArrayList();
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            getCausesCount<AnimUtils> getcausescountAsInterface3 = ((track) it9.next()).asInterface();
            Float fValueOf3 = (getcausescountAsInterface3 == null || (animUtils = (AnimUtils) getcausescountAsInterface3.onExtraCallback()) == null) ? null : Float.valueOf((float) animUtils.onExtraCallbackWithResult());
            if (fValueOf3 != null) {
                arrayList9.add(fValueOf3);
            }
        }
        Object[] objArr9 = new Object[1];
        c(new char[]{65534, 65534, 1, 4}, ImageFormat.getBitsPerPixel(0) + 5, true, (ViewConfiguration.getLongPressTimeout() >> 16) + 4, 233 - (ViewConfiguration.getTapTimeout() >> 16), objArr9);
        logh5exception.IAuthTabCallback(pangleEncryptManager2, ((String) objArr9[0]).intern(), arrayList9);
        Unit unit = Unit.INSTANCE;
        JsonObject jsonObjectOnExtraCallbackWithResult = pangleEncryptManager2.onExtraCallbackWithResult();
        Object[] objArr10 = new Object[1];
        c(new char[]{3, 65528, 6, 2}, 1 - (ViewConfiguration.getLongPressTimeout() >> 16), true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, 280 - AndroidCharacter.getMirror('0'), objArr10);
        pangleEncryptManager.onExtraCallbackWithResult(((String) objArr10[0]).intern(), jsonObjectOnExtraCallbackWithResult);
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        final logH5Exception logh5exception = (logH5Exception) objArr[0];
        PangleEncryptManager pangleEncryptManager = (PangleEncryptManager) objArr[1];
        String str = (String) objArr[2];
        final List list = (List) objArr[3];
        int i = 2 % 2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        int i2 = asBinder + 109;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 % 3;
        }
        while (!(!it.hasNext())) {
            int i4 = IAuthTabCallbackStub + 7;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                arrayList.add(Long.valueOf(setLogBuffers.asBinder(((getCausesCount) it.next()).onWarmupCompleted())));
                int i5 = 66 / 0;
            } else {
                arrayList.add(Long.valueOf(setLogBuffers.asBinder(((getCausesCount) it.next()).onWarmupCompleted())));
            }
        }
        logh5exception.onWarmupCompleted(pangleEncryptManager, str, arrayList, new Function1() { // from class: im.toss.facepay.validation.logger.FaceValidationLogger$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 95;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    logH5Exception.onWarmupCompleted(this.f$0, list, (PangleEncryptManager) obj);
                    throw null;
                }
                Unit unitOnWarmupCompleted = logH5Exception.onWarmupCompleted(this.f$0, list, (PangleEncryptManager) obj);
                int i8 = IAuthTabCallback + 43;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return unitOnWarmupCompleted;
            }
        });
        return null;
    }

    private static final Unit asBinder(logH5Exception logh5exception, List list, PangleEncryptManager pangleEncryptManager) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            arrayList.add(Float.valueOf((float) ((Number) ((getCausesCount) it.next()).onExtraCallback()).doubleValue()));
        }
        Object[] objArr = new Object[1];
        c(new char[]{6, 65528, '\b', 65535, 65524, '\t'}, (ViewConfiguration.getTouchSlop() >> 8) + 6, true, (ViewConfiguration.getEdgeSlop() >> 16) + 6, Gravity.getAbsoluteGravity(0, 0) + 232, objArr);
        logh5exception.IAuthTabCallback(pangleEncryptManager, ((String) objArr[0]).intern(), arrayList);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 119;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        addEvent2Performance addevent2performanceOnExtraCallbackWithResult;
        addData2Performance adddata2performanceOnExtraCallback;
        Float f;
        Float f2;
        Float f3;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        getCausesCount<Double> getcausescountOnNavigationEvent;
        getCausesCount<Double> getcausescountOnExtraCallbackWithResult;
        getCausesCount<Double> getcausescountOnExtraCallback;
        AnimUtils animUtils;
        Pair pair;
        logH5Exception logh5exception = (logH5Exception) objArr[0];
        PangleEncryptManager pangleEncryptManager = (PangleEncryptManager) objArr[1];
        addDatas2Performance adddatas2performance = (addDatas2Performance) objArr[2];
        int i = 2 % 2;
        if (adddatas2performance != null && (adddata2performanceOnExtraCallback = (addevent2performanceOnExtraCallbackWithResult = adddatas2performance.onExtraCallbackWithResult()).onExtraCallback()) != null) {
            int i2 = IAuthTabCallbackStub + 15;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                addevent2performanceOnExtraCallbackWithResult.onWarmupCompleted();
                throw null;
            }
            track trackVarOnWarmupCompleted = addevent2performanceOnExtraCallbackWithResult.onWarmupCompleted();
            if (trackVarOnWarmupCompleted != null) {
                PangleEncryptManager pangleEncryptManager2 = new PangleEncryptManager();
                PangleEncryptManager pangleEncryptManager3 = new PangleEncryptManager();
                StartAction startAction = (StartAction) adddata2performanceOnExtraCallback.onNavigationEvent().onExtraCallback();
                PangleEncryptManager pangleEncryptManager4 = new PangleEncryptManager();
                Object[] objArr2 = new Object[1];
                d(new int[]{1431539490, 872739002}, 1 - View.MeasureSpec.getSize(0), objArr2);
                dynamicTrack.onNavigationEvent(pangleEncryptManager4, ((String) objArr2[0]).intern(), Integer.valueOf(startAction.onExtraCallback()));
                Object[] objArr3 = new Object[1];
                d(new int[]{-532266027, 1830924937}, (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr3);
                dynamicTrack.onNavigationEvent(pangleEncryptManager4, ((String) objArr3[0]).intern(), Integer.valueOf(startAction.onNavigationEvent()));
                Object[] objArr4 = new Object[1];
                c(new char[]{65532, 11, 65533, 65528, '\b'}, ExpandableListView.getPackedPositionGroup(0L) + 1, false, 5 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 231 - (KeyEvent.getMaxKeyCode() >> 16), objArr4);
                dynamicTrack.onNavigationEvent(pangleEncryptManager4, ((String) objArr4[0]).intern(), Integer.valueOf(startAction.asInterface()));
                Object[] objArr5 = new Object[1];
                d(new int[]{-213189089, -2080864915, 111342543, 1749250471}, 5 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
                dynamicTrack.onNavigationEvent(pangleEncryptManager4, ((String) objArr5[0]).intern(), Integer.valueOf(startAction.IAuthTabCallback()));
                Unit unit = Unit.INSTANCE;
                JsonObject jsonObjectOnExtraCallbackWithResult = pangleEncryptManager4.onExtraCallbackWithResult();
                Object[] objArr6 = new Object[1];
                c(new char[]{4, 11, 5, 65528, 14, 5, 65528, 65525, 65533, 4, 65535, 65530}, 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), true, MotionEvent.axisFromString("") + 13, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 229, objArr6);
                pangleEncryptManager3.onExtraCallbackWithResult(((String) objArr6[0]).intern(), jsonObjectOnExtraCallbackWithResult);
                Object[] objArr7 = new Object[1];
                d(new int[]{1666253141, -1093582764, 1106932889, 1487764146}, View.combineMeasuredStates(0, 0) + 5, objArr7);
                dynamicTrack.onNavigationEvent(pangleEncryptManager3, ((String) objArr7[0]).intern(), (Number) adddata2performanceOnExtraCallback.IAuthTabCallback().onExtraCallback());
                Object[] objArr8 = new Object[1];
                d(new int[]{1074486751, -1309595537}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr8);
                dynamicTrack.onNavigationEvent(pangleEncryptManager3, ((String) objArr8[0]).intern(), (Number) adddata2performanceOnExtraCallback.onWarmupCompleted().onExtraCallback());
                Object[] objArr9 = new Object[1];
                c(new char[]{0, 65535, 1, 0, 3, 5, 65530}, TextUtils.getOffsetAfter("", 0) + 2, false, ((byte) KeyEvent.getModifierMetaStateMask()) + 8, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 234, objArr9);
                dynamicTrack.onNavigationEvent(pangleEncryptManager3, ((String) objArr9[0]).intern(), Float.valueOf((float) ((Number) adddata2performanceOnExtraCallback.onExtraCallback().onExtraCallback()).doubleValue()));
                JsonObject jsonObjectOnExtraCallbackWithResult2 = pangleEncryptManager3.onExtraCallbackWithResult();
                Object[] objArr10 = new Object[1];
                d(new int[]{-1336920170, 1564338826}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, objArr10);
                pangleEncryptManager2.onExtraCallbackWithResult(((String) objArr10[0]).intern(), jsonObjectOnExtraCallbackWithResult2);
                PangleEncryptManager pangleEncryptManager5 = new PangleEncryptManager();
                getCausesCount<Pair<Float, Float>> getcausescountOnWarmupCompleted = trackVarOnWarmupCompleted.onWarmupCompleted();
                if (getcausescountOnWarmupCompleted == null || (pair = (Pair) getcausescountOnWarmupCompleted.onExtraCallback()) == null) {
                    f = null;
                } else {
                    int i3 = IAuthTabCallbackStub + 101;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    f = (Float) pair.getFirst();
                }
                Object[] objArr11 = new Object[1];
                d(new int[]{538421444, -1409970516, -777451096, 1282943199, 485350375, 2135085634}, TextUtils.indexOf("", "", 0, 0) + 11, objArr11);
                logh5exception.onWarmupCompleted(pangleEncryptManager5, ((String) objArr11[0]).intern(), f);
                getCausesCount<Float> getcausescountIAuthTabCallbackDefault = trackVarOnWarmupCompleted.IAuthTabCallbackDefault();
                if (getcausescountIAuthTabCallbackDefault != null) {
                    int i5 = asBinder + 39;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    f2 = (Float) getcausescountIAuthTabCallbackDefault.onExtraCallback();
                } else {
                    f2 = null;
                }
                Object[] objArr12 = new Object[1];
                c(new char[]{2, 3, 65527, 65527, 0, '\t', 7, 65533, 3}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), false, TextUtils.lastIndexOf("", '0', 0, 0) + 10, (-16776985) - Color.rgb(0, 0, 0), objArr12);
                logh5exception.onWarmupCompleted(pangleEncryptManager5, ((String) objArr12[0]).intern(), f2);
                getCausesCount<Float> getcausescountIAuthTabCallback = trackVarOnWarmupCompleted.IAuthTabCallback();
                Float f4 = getcausescountIAuthTabCallback != null ? (Float) getcausescountIAuthTabCallback.onExtraCallback() : null;
                Object[] objArr13 = new Object[1];
                d(new int[]{1684436298, -35858154}, 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr13);
                logh5exception.onWarmupCompleted(pangleEncryptManager5, ((String) objArr13[0]).intern(), f4);
                getCausesCount<Float> getcausescountOnTransact = trackVarOnWarmupCompleted.onTransact();
                if (getcausescountOnTransact != null) {
                    int i7 = asBinder + 95;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    f3 = (Float) getcausescountOnTransact.onExtraCallback();
                } else {
                    f3 = null;
                }
                Object[] objArr14 = new Object[1];
                c(new char[]{65535, 65524, 6, 6, 65528, 6, 6, '\b', 1, 65530}, 6 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 232 - (Process.myPid() >> 22), objArr14);
                logh5exception.onWarmupCompleted(pangleEncryptManager5, ((String) objArr14[0]).intern(), f3);
                getCausesCount<Float> getcausescountOnExtraCallbackWithResult2 = trackVarOnWarmupCompleted.onExtraCallbackWithResult();
                Float f5 = getcausescountOnExtraCallbackWithResult2 != null ? (Float) getcausescountOnExtraCallbackWithResult2.onExtraCallback() : null;
                Object[] objArr15 = new Object[1];
                d(new int[]{766626884, 616702374, 1066484873, 774741183, -1206508238, 1552067991, 514012480, -47425654, 1633108742, -446419243}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18, objArr15);
                logh5exception.onWarmupCompleted(pangleEncryptManager5, ((String) objArr15[0]).intern(), f5);
                getCausesCount<Float> getcausescountAsBinder = trackVarOnWarmupCompleted.asBinder();
                Float f6 = getcausescountAsBinder != null ? (Float) getcausescountAsBinder.onExtraCallback() : null;
                Object[] objArr16 = new Object[1];
                d(new int[]{855663760, 1000087722, -852260392, 1517927210, 1185365316, -219298403, -1583074208, 407531861}, 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr16);
                logh5exception.onWarmupCompleted(pangleEncryptManager5, ((String) objArr16[0]).intern(), f6);
                getCausesCount<AnimUtils> getcausescountAsInterface = trackVarOnWarmupCompleted.asInterface();
                if (getcausescountAsInterface != null && (animUtils = (AnimUtils) getcausescountAsInterface.onExtraCallback()) != null) {
                    PangleEncryptManager pangleEncryptManager6 = new PangleEncryptManager();
                    Object[] objArr17 = new Object[1];
                    d(new int[]{-1945153108, -1589335326}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, objArr17);
                    dynamicTrack.onNavigationEvent(pangleEncryptManager6, ((String) objArr17[0]).intern(), Float.valueOf((float) animUtils.onWarmupCompleted()));
                    Object[] objArr18 = new Object[1];
                    d(new int[]{-541891048, -1470566605, 1111855501, 838575978}, TextUtils.indexOf("", "", 0, 0) + 5, objArr18);
                    dynamicTrack.onNavigationEvent(pangleEncryptManager6, ((String) objArr18[0]).intern(), Float.valueOf((float) animUtils.IAuthTabCallback()));
                    Object[] objArr19 = new Object[1];
                    c(new char[]{65534, 65534, 1, 4}, TextUtils.indexOf("", "", 0) + 4, true, KeyEvent.getDeadChar(0, 0) + 4, 233 - ExpandableListView.getPackedPositionType(0L), objArr19);
                    dynamicTrack.onNavigationEvent(pangleEncryptManager6, ((String) objArr19[0]).intern(), Float.valueOf((float) animUtils.onExtraCallbackWithResult()));
                    JsonObject jsonObjectOnExtraCallbackWithResult3 = pangleEncryptManager6.onExtraCallbackWithResult();
                    Object[] objArr20 = new Object[1];
                    c(new char[]{3, 65528, 6, 2}, 1 - TextUtils.getOffsetAfter("", 0), true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, Color.rgb(0, 0, 0) + 16777448, objArr20);
                    pangleEncryptManager5.onExtraCallbackWithResult(((String) objArr20[0]).intern(), jsonObjectOnExtraCallbackWithResult3);
                }
                JsonObject jsonObjectOnExtraCallbackWithResult4 = pangleEncryptManager5.onExtraCallbackWithResult();
                Object[] objArr21 = new Object[1];
                d(new int[]{-932451362, 310507775}, TextUtils.indexOf((CharSequence) "", '0') + 3, objArr21);
                pangleEncryptManager2.onExtraCallbackWithResult(((String) objArr21[0]).intern(), jsonObjectOnExtraCallbackWithResult4);
                PangleEncryptManager pangleEncryptManager7 = new PangleEncryptManager();
                getCausesCount<Double> getcausescountOnExtraCallback2 = trackVarOnWarmupCompleted.onExtraCallback();
                Float fValueOf4 = getcausescountOnExtraCallback2 != null ? Float.valueOf((float) ((Number) getcausescountOnExtraCallback2.onExtraCallback()).doubleValue()) : null;
                Object[] objArr22 = new Object[1];
                d(new int[]{-1725490266, -1923895618}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, objArr22);
                logh5exception.onWarmupCompleted(pangleEncryptManager7, ((String) objArr22[0]).intern(), fValueOf4);
                getCausesCount<Double> getcausescountOnNavigationEvent2 = trackVarOnWarmupCompleted.onNavigationEvent();
                Float fValueOf5 = getcausescountOnNavigationEvent2 != null ? Float.valueOf((float) ((Number) getcausescountOnNavigationEvent2.onExtraCallback()).doubleValue()) : null;
                Object[] objArr23 = new Object[1];
                c(new char[]{65532, 65531, 65533, 6, 65526, 7, 7, 65529, 2, '\b'}, 5 - Color.green(0), true, ((byte) KeyEvent.getModifierMetaStateMask()) + 11, Process.getGidForName("") + 232, objArr23);
                logh5exception.onWarmupCompleted(pangleEncryptManager7, ((String) objArr23[0]).intern(), fValueOf5);
                addStage2Performance addstage2performanceIAuthTabCallback = addevent2performanceOnExtraCallbackWithResult.IAuthTabCallback();
                if (addstage2performanceIAuthTabCallback == null || (getcausescountOnExtraCallback = addstage2performanceIAuthTabCallback.onExtraCallback()) == null) {
                    fValueOf = null;
                } else {
                    int i9 = asBinder + 125;
                    IAuthTabCallbackStub = i9 % 128;
                    if (i9 % 2 == 0) {
                        Float.valueOf((float) ((Number) getcausescountOnExtraCallback.onExtraCallback()).doubleValue());
                        throw null;
                    }
                    fValueOf = Float.valueOf((float) ((Number) getcausescountOnExtraCallback.onExtraCallback()).doubleValue());
                }
                Object[] objArr24 = new Object[1];
                c(new char[]{4, 3, 7, 65533, '\b', 65533, 3, 2, 65523, 7, '\b', 65525, 65526, 65533, 0, 65533, '\b', '\r'}, 18 - Color.red(0), false, 18 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 231, objArr24);
                logh5exception.onWarmupCompleted(pangleEncryptManager7, ((String) objArr24[0]).intern(), fValueOf);
                addStage2Performance addstage2performanceIAuthTabCallback2 = addevent2performanceOnExtraCallbackWithResult.IAuthTabCallback();
                if (addstage2performanceIAuthTabCallback2 == null || (getcausescountOnExtraCallbackWithResult = addstage2performanceIAuthTabCallback2.onExtraCallbackWithResult()) == null) {
                    fValueOf2 = null;
                } else {
                    int i10 = IAuthTabCallbackStub + 73;
                    asBinder = i10 % 128;
                    if (i10 % 2 != 0) {
                        Float.valueOf((float) ((Number) getcausescountOnExtraCallbackWithResult.onExtraCallback()).doubleValue());
                        throw null;
                    }
                    fValueOf2 = Float.valueOf((float) ((Number) getcausescountOnExtraCallbackWithResult.onExtraCallback()).doubleValue());
                }
                Object[] objArr25 = new Object[1];
                c(new char[]{7, 65533, 14, 65529, 65523, 7, '\b', 65525, 65526, 65533, 0, 65533, '\b', '\r'}, 14 - View.MeasureSpec.getSize(0), false, KeyEvent.normalizeMetaState(0) + 14, 232 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr25);
                logh5exception.onWarmupCompleted(pangleEncryptManager7, ((String) objArr25[0]).intern(), fValueOf2);
                addStage2Performance addstage2performanceIAuthTabCallback3 = addevent2performanceOnExtraCallbackWithResult.IAuthTabCallback();
                if (addstage2performanceIAuthTabCallback3 == null || (getcausescountOnNavigationEvent = addstage2performanceIAuthTabCallback3.onNavigationEvent()) == null) {
                    fValueOf3 = null;
                } else {
                    int i11 = IAuthTabCallbackStub + 5;
                    asBinder = i11 % 128;
                    if (i11 % 2 != 0) {
                        Float.valueOf((float) ((Number) getcausescountOnNavigationEvent.onExtraCallback()).doubleValue());
                        throw null;
                    }
                    fValueOf3 = Float.valueOf((float) ((Number) getcausescountOnNavigationEvent.onExtraCallback()).doubleValue());
                }
                Object[] objArr26 = new Object[1];
                c(new char[]{65529, 7, 3, 4, '\r', '\b', 65533, 0, 65533, 65526, 65525, '\b', 7, 65523}, View.MeasureSpec.getMode(0) + 4, true, 14 - (Process.myTid() >> 22), 231 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr26);
                logh5exception.onWarmupCompleted(pangleEncryptManager7, ((String) objArr26[0]).intern(), fValueOf3);
                JsonObject jsonObjectOnExtraCallbackWithResult5 = pangleEncryptManager7.onExtraCallbackWithResult();
                Object[] objArr27 = new Object[1];
                c(new char[]{6, 3, 5, 2, 65526, 65528, 6}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, false, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, 232 - (Process.myPid() >> 22), objArr27);
                pangleEncryptManager2.onExtraCallbackWithResult(((String) objArr27[0]).intern(), jsonObjectOnExtraCallbackWithResult5);
                Object[] objArr28 = new Object[1];
                d(new int[]{-311099316, 256445730, -1857946434, -1381462089, -404628721, 1921729401, -1819457733, -1090728609, 1720614225, 1613974002}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, objArr28);
                dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager2, ((String) objArr28[0]).intern(), Boolean.valueOf(adddatas2performance.onExtraCallback()));
                JsonObject jsonObjectOnExtraCallbackWithResult6 = pangleEncryptManager2.onExtraCallbackWithResult();
                Object[] objArr29 = new Object[1];
                c(new char[]{11, 65528, 3, 65535, '\n', '\n', 65531, 65530, 65525, 65532, '\b', 65527, 3, 65531, '\t'}, 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, TextUtils.indexOf((CharSequence) "", '0', 0) + 16, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 229, objArr29);
                pangleEncryptManager.onExtraCallbackWithResult(((String) objArr29[0]).intern(), jsonObjectOnExtraCallbackWithResult6);
                return null;
            }
        }
        int i12 = IAuthTabCallbackStub + 69;
        asBinder = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    private final void onWarmupCompleted(PangleEncryptManager pangleEncryptManager, String str, List<Long> list, Function1<? super PangleEncryptManager, Unit> function1) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (list.isEmpty()) {
            int i4 = IAuthTabCallbackStub + 51;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        PangleEncryptManager pangleEncryptManager2 = new PangleEncryptManager();
        Object[] objArr = new Object[1];
        c(new char[]{65533, 3, 2, 65523, 65527, 3, '\t', 2, '\b', 65529, '\f', 65529, 65527, '\t', '\b'}, View.MeasureSpec.getSize(0) + 9, false, KeyEvent.keyCodeFromString("") + 15, 231 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        dynamicTrack.onNavigationEvent(pangleEncryptManager2, ((String) objArr[0]).intern(), Integer.valueOf(list.size()));
        List<Long> list2 = list;
        Object[] objArr2 = new Object[1];
        d(new int[]{1493861436, 2126120280, -904314903, 553509270, 1266373618, 1503241167, 321460376, 166163802}, TextUtils.indexOf((CharSequence) "", '0') + 14, objArr2);
        dynamicTrack.onNavigationEvent(pangleEncryptManager2, ((String) objArr2[0]).intern(), Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(CollectionsKt.averageOfLong(list2))));
        Object[] objArr3 = new Object[1];
        c(new char[]{65526, 2, 3, 4, 65534, '\t', 65526, 7, '\n', 65529, 65524, '\r'}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1, true, (ViewConfiguration.getTapTimeout() >> 16) + 12, View.getDefaultSize(0, 0) + 230, objArr3);
        dynamicTrack.onNavigationEvent(pangleEncryptManager2, ((String) objArr3[0]).intern(), (Number) CollectionsKt.maxOrThrow(list2));
        Object[] objArr4 = new Object[1];
        d(new int[]{-144712843, -1060190451, 1379517443, 1148136078, 36731227, -735913573}, 12 - KeyEvent.normalizeMetaState(0), objArr4);
        dynamicTrack.onNavigationEvent(pangleEncryptManager2, ((String) objArr4[0]).intern(), (Number) CollectionsKt.minOrThrow(list2));
        function1.invoke(pangleEncryptManager2);
        Unit unit = Unit.INSTANCE;
        pangleEncryptManager.onExtraCallbackWithResult(str, pangleEncryptManager2.onExtraCallbackWithResult());
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PangleEncryptManager pangleEncryptManager = (PangleEncryptManager) objArr[1];
        String str = (String) objArr[2];
        List list = (List) objArr[3];
        int i = 2 % 2;
        xkz2 xkz2Var = new xkz2();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallbackStub + 3;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            dynamicTrack.onExtraCallback(xkz2Var, Integer.valueOf(((Number) it.next()).intValue()));
            int i4 = IAuthTabCallbackStub + 53;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        return pangleEncryptManager.onExtraCallbackWithResult(str, xkz2Var.onNavigationEvent());
    }

    private final JsonElement IAuthTabCallback(PangleEncryptManager pangleEncryptManager, String str, List<Float> list) {
        int i = 2 % 2;
        xkz2 xkz2Var = new xkz2();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = asBinder + 11;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                dynamicTrack.onExtraCallback(xkz2Var, Float.valueOf(((Number) it.next()).floatValue()));
                throw null;
            }
            dynamicTrack.onExtraCallback(xkz2Var, Float.valueOf(((Number) it.next()).floatValue()));
        }
        Unit unit = Unit.INSTANCE;
        return pangleEncryptManager.onExtraCallbackWithResult(str, xkz2Var.onNavigationEvent());
    }

    private final JsonObject IAuthTabCallback(long j, boolean z, List<addDatas2Performance> list) throws Throwable {
        int i = 2 % 2;
        List<addDatas2Performance> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            addData2Performance adddata2performanceOnExtraCallback = ((addDatas2Performance) it.next()).onExtraCallbackWithResult().onExtraCallback();
            if (adddata2performanceOnExtraCallback != null) {
                arrayList.add(adddata2performanceOnExtraCallback);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            int i2 = IAuthTabCallbackStub + 95;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                ((addDatas2Performance) it2.next()).onExtraCallbackWithResult().onWarmupCompleted();
                throw null;
            }
            track trackVarOnWarmupCompleted = ((addDatas2Performance) it2.next()).onExtraCallbackWithResult().onWarmupCompleted();
            if (trackVarOnWarmupCompleted != null) {
                arrayList2.add(trackVarOnWarmupCompleted);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            addStage2Performance addstage2performanceIAuthTabCallback = ((addDatas2Performance) it3.next()).onExtraCallbackWithResult().IAuthTabCallback();
            if (addstage2performanceIAuthTabCallback != null) {
                arrayList3.add(addstage2performanceIAuthTabCallback);
            }
        }
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Object[] objArr = new Object[1];
        c(new char[]{'\b', 65533, 3, 2, 65528, '\t', 6, 65525}, (ViewConfiguration.getEdgeSlop() >> 16) + 4, false, 8 - Gravity.getAbsoluteGravity(0, 0), 231 - View.resolveSize(0, 0), objArr);
        dynamicTrack.onNavigationEvent(pangleEncryptManager, ((String) objArr[0]).intern(), Long.valueOf(j));
        Object[] objArr2 = new Object[1];
        c(new char[]{'\t', 5, 65529, 6, 65523, 65529, 6, '\t', 7, 3, 4, '\f', 65529, 65523, 3, '\b', '\t', 65525, 65528, 65529, '\b', 7, 65529}, Color.argb(0, 0, 0, 0) + 18, true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23, 231 - View.MeasureSpec.getMode(0), objArr2);
        dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager, ((String) objArr2[0]).intern(), Boolean.valueOf(this.onNavigationEvent));
        Object[] objArr3 = new Object[1];
        d(new int[]{-311099316, 256445730, -1857946434, -1381462089, -404628721, 1921729401, -1819457733, -1090728609, 1720614225, 1613974002}, 17 - TextUtils.lastIndexOf("", '0'), objArr3);
        dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager, ((String) objArr3[0]).intern(), Boolean.valueOf(z));
        IAuthTabCallback(pangleEncryptManager, arrayList);
        onExtraCallbackWithResult(pangleEncryptManager, arrayList2);
        Object[] objArr4 = {this, pangleEncryptManager, this.IAuthTabCallback};
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(objArr4, 646555797, TossApplication.onSessionEnded.onExtraCallback(), -646555794, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback());
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            getCausesCount<Double> getcausescountOnExtraCallback = ((track) it4.next()).onExtraCallback();
            if (getcausescountOnExtraCallback != null) {
                arrayList4.add(getcausescountOnExtraCallback);
            }
        }
        Object[] objArr5 = new Object[1];
        d(new int[]{-1725490266, -1923895618}, 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
        Object[] objArr6 = {this, pangleEncryptManager, ((String) objArr5[0]).intern(), arrayList4};
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(objArr6, 1958702150, TossApplication.onSessionEnded.onExtraCallback(), -1958702150, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, TossApplication.onSessionEnded.onExtraCallback());
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            getCausesCount<Double> getcausescountOnNavigationEvent = ((track) it5.next()).onNavigationEvent();
            if (getcausescountOnNavigationEvent != null) {
                int i3 = asBinder + 9;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                arrayList5.add(getcausescountOnNavigationEvent);
            }
        }
        Object[] objArr7 = new Object[1];
        c(new char[]{65532, 65531, 65533, 6, 65526, 7, 7, 65529, 2, '\b'}, View.MeasureSpec.getSize(0) + 5, true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10, 230 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr7);
        Object[] objArr8 = {this, pangleEncryptManager, ((String) objArr7[0]).intern(), arrayList5};
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(objArr8, 1958702150, TossApplication.onSessionEnded.onExtraCallback(), -1958702150, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback3, TossApplication.onSessionEnded.onExtraCallback());
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            getCausesCount<Double> getcausescountOnExtraCallback2 = ((addStage2Performance) it6.next()).onExtraCallback();
            if (getcausescountOnExtraCallback2 != null) {
                arrayList6.add(getcausescountOnExtraCallback2);
            }
        }
        Object[] objArr9 = new Object[1];
        c(new char[]{4, 3, 7, 65533, '\b', 65533, 3, 2, 65523, 7, '\b', 65525, 65526, 65533, 0, 65533, '\b', '\r'}, Color.blue(0) + 18, false, ((Process.getThreadPriority(0) + 20) >> 6) + 18, 232 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr9);
        Object[] objArr10 = {this, pangleEncryptManager, ((String) objArr9[0]).intern(), arrayList6};
        int iOnExtraCallback4 = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(objArr10, 1958702150, TossApplication.onSessionEnded.onExtraCallback(), -1958702150, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback4, TossApplication.onSessionEnded.onExtraCallback());
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            getCausesCount<Double> getcausescountOnExtraCallbackWithResult = ((addStage2Performance) it7.next()).onExtraCallbackWithResult();
            if (getcausescountOnExtraCallbackWithResult != null) {
                int i5 = IAuthTabCallbackStub + 33;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                arrayList7.add(getcausescountOnExtraCallbackWithResult);
            }
        }
        Object[] objArr11 = new Object[1];
        c(new char[]{7, 65533, 14, 65529, 65523, 7, '\b', 65525, 65526, 65533, 0, 65533, '\b', '\r'}, 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), false, (ViewConfiguration.getPressedStateDuration() >> 16) + 14, (ViewConfiguration.getScrollBarSize() >> 8) + 231, objArr11);
        Object[] objArr12 = {this, pangleEncryptManager, ((String) objArr11[0]).intern(), arrayList7};
        int iOnExtraCallback5 = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(objArr12, 1958702150, TossApplication.onSessionEnded.onExtraCallback(), -1958702150, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback5, TossApplication.onSessionEnded.onExtraCallback());
        ArrayList arrayList8 = new ArrayList();
        Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            int i7 = IAuthTabCallbackStub + 115;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            getCausesCount<Double> getcausescountOnNavigationEvent2 = ((addStage2Performance) it8.next()).onNavigationEvent();
            if (getcausescountOnNavigationEvent2 != null) {
                int i9 = IAuthTabCallbackStub + 51;
                asBinder = i9 % 128;
                if (i9 % 2 != 0) {
                    arrayList8.add(getcausescountOnNavigationEvent2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                arrayList8.add(getcausescountOnNavigationEvent2);
            }
        }
        Object[] objArr13 = new Object[1];
        c(new char[]{65529, 7, 3, 4, '\r', '\b', 65533, 0, 65533, 65526, 65525, '\b', 7, 65523}, 4 - Color.red(0), true, KeyEvent.normalizeMetaState(0) + 14, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 230, objArr13);
        Object[] objArr14 = {this, pangleEncryptManager, ((String) objArr13[0]).intern(), arrayList8};
        int iOnExtraCallback6 = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(objArr14, 1958702150, TossApplication.onSessionEnded.onExtraCallback(), -1958702150, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback6, TossApplication.onSessionEnded.onExtraCallback());
        return pangleEncryptManager.onExtraCallbackWithResult();
    }

    public static /* synthetic */ addDatas2Performance onNavigationEvent(logH5Exception logh5exception) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return (addDatas2Performance) IAuthTabCallback(new Object[]{logh5exception}, 474082071, TossApplication.onSessionEnded.onExtraCallback(), -474082069, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback());
    }

    private static final Integer IAuthTabCallback(Function2 function2, Object obj, Object obj2) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return (Integer) IAuthTabCallback(new Object[]{function2, obj, obj2}, -449627323, TossApplication.onSessionEnded.onExtraCallback(), 449627324, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback());
    }

    private final JsonElement onExtraCallback(PangleEncryptManager pangleEncryptManager, String str, List<Integer> list) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return (JsonElement) IAuthTabCallback(new Object[]{this, pangleEncryptManager, str, list}, 42381511, TossApplication.onSessionEnded.onExtraCallback(), -42381507, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback());
    }

    private final void onWarmupCompleted(PangleEncryptManager pangleEncryptManager, String str, List<getCausesCount<Double>> list) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(new Object[]{this, pangleEncryptManager, str, list}, 1958702150, TossApplication.onSessionEnded.onExtraCallback(), -1958702150, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback());
    }

    private final void onExtraCallbackWithResult(PangleEncryptManager pangleEncryptManager, addDatas2Performance adddatas2performance) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(new Object[]{this, pangleEncryptManager, adddatas2performance}, 646555797, TossApplication.onSessionEnded.onExtraCallback(), -646555794, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback());
    }
}
