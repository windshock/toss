package im.toss.facepay.log.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.nc;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LogAction {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogAction[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int[] IAuthTabCallback = null;

    @nc(IAuthTabCallback = "identify")
    public static final LogAction IDENTIFY;

    @nc(IAuthTabCallback = "register")
    public static final LogAction REGISTER;

    @nc(IAuthTabCallback = "verify")
    public static final LogAction VERIFY;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String value;

    public static /* synthetic */ KSerializer $r8$lambda$guKTzKZfSbGf7z0ojAZEnKOW0MM() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ LogAction[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        LogAction[] logActionArr = {REGISTER, VERIFY, IDENTIFY};
        int i5 = i2 + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return logActionArr;
    }

    public static EnumEntries<LogAction> getEntries() {
        EnumEntries<LogAction> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 16 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 27;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return enumEntries;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) LogAction.access$get$cachedSerializer$delegate$cp().getValue();
            int i4 = onWarmupCompleted + 33;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializer;
            }
            throw null;
        }

        public final KSerializer<LogAction> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<LogAction> kSerializerOnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LogAction[] logActionArrValues = values();
        Object[] objArr = new Object[1];
        a(new int[]{788031027, 710491664, 759708738, 361800744}, 8 - Gravity.getAbsoluteGravity(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{-826554652, -1665029119, -469915811, 463169239}, 6 - View.resolveSize(0, 0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{1758021449, -1337596683, -935490817, -1438821616}, 8 - View.resolveSizeAndState(0, 0, 0), objArr3);
        String[] strArr = {strIntern, strIntern2, ((String) objArr3[0]).intern()};
        Object obj = null;
        Object[] objArr4 = new Object[1];
        a(new int[]{1147277553, 445229751, 1536199027, -380663483, -408106248, -916102194, 715444514, -1057063401, 1224278961, 1413547172, -1069137316, -809992512, 1087414557, 364096097, 2035718465, 1381461388, -534208753, 183956020}, 35 - TextUtils.getOffsetBefore("", 0), objArr4);
        KSerializer kSerializerOnNavigationEvent = updateRenderInfoForVideo.onNavigationEvent(((String) objArr4[0]).intern(), logActionArrValues, strArr, new Annotation[][]{null, null, null}, (Annotation[]) null);
        int i4 = onNavigationEvent + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $cachedSerializer$delegate;
        }
        throw null;
    }

    private LogAction(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{630565937, 410789701, 1274133356, 387191051}, Color.red(0) + 8, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{788031027, 710491664, 759708738, 361800744}, ExpandableListView.getPackedPositionChild(0L) + 9, objArr2);
        REGISTER = new LogAction(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new int[]{2010583764, -1938102607, -529538976, 1996957187}, View.resolveSize(0, 0) + 6, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{-826554652, -1665029119, -469915811, 463169239}, ExpandableListView.getPackedPositionGroup(0L) + 6, objArr4);
        VERIFY = new LogAction(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(new int[]{-1268879374, -756696173, -1222848870, -923054116}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new int[]{1758021449, -1337596683, -935490817, -1438821616}, 8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
        IDENTIFY = new LogAction(strIntern3, 2, ((String) objArr6[0]).intern());
        LogAction[] logActionArr$values = $values();
        $VALUES = logActionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(logActionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.facepay.log.model.LogAction$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 17;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer$r8$lambda$guKTzKZfSbGf7z0ojAZEnKOW0MM = LogAction.$r8$lambda$guKTzKZfSbGf7z0ojAZEnKOW0MM();
                int i4 = onExtraCallback + 101;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer$r8$lambda$guKTzKZfSbGf7z0ojAZEnKOW0MM;
            }
        });
        int i = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static LogAction valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        LogAction logAction = (LogAction) Enum.valueOf(LogAction.class, str);
        int i3 = onNavigationEvent + 107;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return logAction;
        }
        throw null;
    }

    public static LogAction[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return (LogAction[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        char c = '0';
        int i3 = -1469660336;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 69;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 71 - TextUtils.indexOf("", c, 0), Color.red(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i6 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 72 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf("", "", 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i6++;
                }
                c = '0';
                i3 = -1469660336;
            }
            int i8 = $11 + 29;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 19;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    Object[] objArr4 = new Object[i4];
                    objArr4[i5] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int edgeSlop = 72 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int capsMode = TextUtils.getCapsMode("", i5, i5) + 8848;
                        Class[] clsArr = new Class[i4];
                        clsArr[0] = Integer.TYPE;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarFadeDuration, edgeSlop, capsMode, -1725547072, false, "h", clsArr);
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = new Object[i4];
                    objArr5[0] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + i4), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 72, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i10++;
                    i4 = 1;
                }
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i5;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $10 + 121;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22253 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 39 - KeyEvent.getDeadChar(0, 0), Drawable.resolveOpacity(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 4033), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 78, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i20 = $11 + 39;
            $10 = i20 % 128;
            int i21 = i20 % 2;
        }
        String str = new String(cArr2, 0, i);
        int i22 = $11 + 97;
        $10 = i22 % 128;
        int i23 = i22 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new int[]{728156550, -1468090881, 449609056, -1680556967, -1833230571, -105632171, 2012799110, -203048035, -89113481, 747182087, 685835473, -684128167, 1027320945, -1176625448, -251234787, -2054559835, -1552277488, 63819728};
    }
}
