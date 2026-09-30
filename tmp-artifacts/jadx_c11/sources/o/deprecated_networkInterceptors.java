package o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Telephony;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tds.sharebottomsheet.ImageSaver;
import im.toss.tds.sharebottomsheet.R;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_networkInterceptors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class deprecated_networkInterceptors implements deprecated_readTimeoutMillis {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ deprecated_networkInterceptors[] $VALUES;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final List<deprecated_retryOnConnectionFailure> availableTypes;
    private final String iconUrl;
    private final String id;
    private final int label;
    public static final deprecated_networkInterceptors TEXT_COPY = new onTransact("TEXT_COPY", 0);
    public static final deprecated_networkInterceptors LINK_COPY = new IAuthTabCallback("LINK_COPY", 1);
    public static final deprecated_networkInterceptors IMAGE_SAVE = new onWarmupCompleted("IMAGE_SAVE", 2);
    public static final deprecated_networkInterceptors SMS = new deprecated_networkInterceptors("SMS", 3) { // from class: o.deprecated_networkInterceptors.onNavigationEvent
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static long onNavigationEvent = -4830381058082572188L;

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $11 + 19;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 84, ExpandableListView.getPackedPositionGroup(0L) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - Process.getGidForName("")), 19 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 113;
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
            String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            int i8 = $11 + 21;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            objArr[0] = str;
        }

        {
            EnumEntries<deprecated_retryOnConnectionFailure> enumEntriesOnNavigationEvent = deprecated_retryOnConnectionFailure.Companion.onNavigationEvent();
            int i = R.string.tds_sharebottomsheet_target_sms;
            String str = "os_message";
            Object[] objArr = new Object[1];
            a(new char[]{65188, 26476, 39518, 65228, 14875, 25712, 40186, 12371, 62327, 30302, 36353, 11756, 58775, 31152, 47151, 7959, 54829, 19271, 46528, 2423, 51275, 24311, 42877, 31373, 47853, 8329, 53377, 29738, 44807, 12843, 49824, 24976, 41451, 1492, 64512, 21476, 37771, 5936, 59894, 19724, 33901, 6407, 6977, 48813, 30409, 60583, 5414, 43010, 27440, 65033, 1672, 39530, 23880, 49640, 12320, 38867, 20458, 54147}, Color.argb(0, 0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.deprecated_readTimeoutMillis
        public Intent buildIntent(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable Uri uri, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intent intent = deprecated_pingIntervalMillis.onNavigationEvent(this, str, str2, uri).setPackage(Telephony.Sms.getDefaultSmsPackage(context));
            Intrinsics.checkNotNullExpressionValue(intent, "");
            int i4 = onExtraCallback + 1;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return intent;
            }
            throw null;
        }
    };
    public static final deprecated_networkInterceptors MORE = new deprecated_networkInterceptors("MORE", 4) { // from class: o.deprecated_networkInterceptors.onExtraCallbackWithResult
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onNavigationEvent;
        private static char[] IAuthTabCallback = {32591, 32635, 32583, 32580, 32573, 32512, 32598, 32590, 32596, 32513, 32576, 32578, 32577, 32584, 32571, 32639, 32514, 32587, 32581, 32579, 32586, 32638};
        private static int onExtraCallbackWithResult = -1184333833;
        private static boolean onExtraCallback = true;
        private static boolean onWarmupCompleted = true;

        {
            EnumEntries<deprecated_retryOnConnectionFailure> enumEntriesOnNavigationEvent = deprecated_retryOnConnectionFailure.Companion.onNavigationEvent();
            int i = R.string.tds_sharebottomsheet_target_more;
            String str = "more_action";
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-114, -115, -125, -118, -106, -107, -109, -114, -111, -126, -127, -114, -120, -108, -111, -107, -108, -119, -109, -120, -119, -111, -124, -126, -117, -110, -111, -115, -117, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.deprecated_readTimeoutMillis
        public Intent buildIntent(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable Uri uri, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            IAuthTabCallbackStub = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(function0, "");
                Intrinsics.checkNotNullParameter(function1, "");
                deprecated_pingIntervalMillis.onNavigationEvent(this, str, str2, uri);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intent intentOnNavigationEvent = deprecated_pingIntervalMillis.onNavigationEvent(this, str, str2, uri);
            int i3 = IAuthTabCallbackStub + 71;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return intentOnNavigationEvent;
            }
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = IAuthTabCallback;
            if (cArr2 != null) {
                int i3 = $11 + 117;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $10 + 1;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 77 - Drawable.resolveOpacity(0, 0), (-16756264) - Color.rgb(0, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5++;
                        int i8 = $11 + 113;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 75, 16038 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 63 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12214 - View.MeasureSpec.getMode(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.getSize(0) + 63, 12213 - Process.getGidForName(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        }
    };

    private static final /* synthetic */ deprecated_networkInterceptors[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        deprecated_networkInterceptors[] deprecated_networkinterceptorsArr = {TEXT_COPY, LINK_COPY, IMAGE_SAVE, SMS, MORE};
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_networkinterceptorsArr;
    }

    public /* synthetic */ deprecated_networkInterceptors(String str, int i, String str2, List list, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, list, str3, i2);
    }

    public static EnumEntries<deprecated_networkInterceptors> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<deprecated_networkInterceptors> enumEntries = $ENTRIES;
        int i5 = i3 + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static deprecated_networkInterceptors valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        deprecated_networkInterceptors deprecated_networkinterceptors = (deprecated_networkInterceptors) Enum.valueOf(deprecated_networkInterceptors.class, str);
        int i4 = onWarmupCompleted + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_networkinterceptors;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static deprecated_networkInterceptors[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        deprecated_networkInterceptors[] deprecated_networkinterceptorsArr = (deprecated_networkInterceptors[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_networkinterceptorsArr;
    }

    private deprecated_networkInterceptors(String str, int i, String str2, List list, String str3, int i2) {
        this.id = str2;
        this.availableTypes = list;
        this.iconUrl = str3;
        this.label = i2;
    }

    @Override // o.deprecated_readTimeoutMillis
    public /* bridge */ boolean isAvailable(@NotNull deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.isAvailable(deprecated_retryonconnectionfailure);
        }
        super.isAvailable(deprecated_retryonconnectionfailure);
        throw null;
    }

    @Override // o.deprecated_readTimeoutMillis
    public /* bridge */ void share(@NotNull Context context, @Nullable String str, @Nullable Uri uri, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @Nullable String str2, @Nullable Function1<? super Intent, ? extends Intent> function12) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.share(context, str, uri, function0, function1, str2, function12);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }

    @Override // o.deprecated_readTimeoutMillis
    public /* bridge */ void showErrorToast(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        super.showErrorToast(context, i);
        if (i4 == 0) {
            throw null;
        }
        int i5 = IAuthTabCallback + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.deprecated_readTimeoutMillis
    public /* bridge */ void showSuccessToast(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        super.showSuccessToast(context, i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = onWarmupCompleted + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.deprecated_readTimeoutMillis
    public String getId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // o.deprecated_readTimeoutMillis
    public List<deprecated_retryOnConnectionFailure> getAvailableTypes() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<deprecated_retryOnConnectionFailure> list = this.availableTypes;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return list;
    }

    @Override // o.deprecated_readTimeoutMillis
    public String getIconUrl() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.iconUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.deprecated_readTimeoutMillis
    public int getLabel() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.label;
        int i6 = i3 + 23;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return i5;
    }

    static {
        deprecated_networkInterceptors[] deprecated_networkinterceptorsArr$values = $values();
        $VALUES = deprecated_networkinterceptorsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(deprecated_networkinterceptorsArr$values);
        Companion = new onExtraCallback(null);
        int i = onExtraCallback + 3;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static final class onTransact extends deprecated_networkInterceptors {
        private static final byte[] $$a = {81, 99, 107, 124};
        private static final int $$b = 40;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onExtraCallback = 1;
        private static long IAuthTabCallback = 7798559133331975163L;
        private static int onNavigationEvent = -1776194565;
        private static char onExtraCallbackWithResult = 53312;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, short s, short s2) {
            int i2;
            int i3 = s + 109;
            byte[] bArr = $$a;
            int i4 = i * 3;
            int i5 = (s2 * 4) + 4;
            byte[] bArr2 = new byte[1 - i4];
            int i6 = 0 - i4;
            if (bArr == null) {
                int i7 = i5;
                int i8 = 0;
                i5++;
                i3 += i7;
                i2 = i8;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                int i9 = i2 + 1;
                i7 = i3;
                i3 = bArr[i5];
                i8 = i9;
                i5++;
                i3 += i7;
                i2 = i8;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                }
            }
        }

        public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, onTransact ontransact, Context context, Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(function1, ontransact, context, th);
            if (i3 != 0) {
                int i4 = 4 / 0;
            }
            int i5 = onWarmupCompleted + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unitOnWarmupCompleted;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(function0);
            }
            onWarmupCompleted(function0);
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        onTransact(String str, int i) throws Throwable {
            List listListOf = CollectionsKt.listOf(new deprecated_retryOnConnectionFailure[]{deprecated_retryOnConnectionFailure.TEXT, deprecated_retryOnConnectionFailure.IMAGE_WITH_TEXT});
            int i2 = R.string.tds_sharebottomsheet_target_text_copy;
            Object[] objArr = new Object[1];
            a((char) (TextUtils.indexOf("", "", 0) + 4284), TextUtils.getOffsetAfter("", 0), new char[]{56182, 908, 15138, 42200, 34556, 31186, 25183, 53591, 18328, 14956, 34785, 6365, 8189, 58203, 776, 25876, 4055, 42161, 12132, 46822, 25220, 8534, 20066, 63548, 40193, 26260, 37189, 52230, 57931, 25423, 65500, 36684, 58763, 16028, 63989, 54642, 25892, 55975, 27444, 49031, 26285, 45056, 57605, 39679, 3107, 58721, 8584, 42211, 34921, 49047, 7420, 61454, 34532, 33083}, new char[]{0, 0, 0, 0}, new char[]{7468, 40536, 48354, 44304}, objArr);
            super(str, i, "text_copy", listListOf, ((String) objArr[0]).intern(), i2, null);
        }

        @Override // o.deprecated_readTimeoutMillis
        public Intent buildIntent(@NotNull final Context context, @Nullable String str, @Nullable String str2, @Nullable Uri uri, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Throwable, Unit> function1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallback onextracallback = deprecated_networkInterceptors.Companion;
            if (str2 != null) {
                onExtraCallback.onWarmupCompleted(onextracallback, context, str2, new Function0() { // from class: im.toss.tds.sharebottomsheet.SharableAction$TEXT_COPY$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 115;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnExtraCallbackWithResult = deprecated_networkInterceptors.onTransact.onExtraCallbackWithResult(function0);
                        int i7 = onWarmupCompleted + 119;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 != 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }, new Function1() { // from class: im.toss.tds.sharebottomsheet.SharableAction$TEXT_COPY$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 5;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitIAuthTabCallback = deprecated_networkInterceptors.onTransact.IAuthTabCallback(function1, this, context, (Throwable) obj);
                        int i7 = onExtraCallback + 49;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        return unitIAuthTabCallback;
                    }
                });
                return null;
            }
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }

        private static final Unit onWarmupCompleted(Function0 function0) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                function0.invoke();
                Unit unit = Unit.INSTANCE;
                int i3 = onExtraCallback + 49;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return unit;
            }
            function0.invoke();
            Unit unit2 = Unit.INSTANCE;
            throw null;
        }

        private static final Unit onWarmupCompleted(Function1 function1, onTransact ontransact, Context context, Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            function1.invoke(th);
            ontransact.showErrorToast(context, R.string.tds_sharebottomsheet_failure_text_copy);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 9;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 66 / 0;
            }
            return unit;
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
                int i4 = $10 + 77;
                $11 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), KeyEvent.getDeadChar(0, 0) + 43, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, 1494 - (Process.myPid() >> 22), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.indexOf((CharSequence) "", '0', 0)), 49 - Process.getGidForName(""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 45849), ((Process.getThreadPriority(0) + 20) >> 6) + 29, ImageFormat.getBitsPerPixel(0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i6 = $10 + 121;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }
    }

    public static final class IAuthTabCallback extends deprecated_networkInterceptors {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] onExtraCallback = {27258, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27138, 27176, 27175, 27168, 27198, 27167, 27137, 27169, 27172, 27141, 27263, 27160, 27165, 27138, 27176, 27175, 27168, 27139, 27138, 27172, 27173, 27170, 27138, 27145, 27177, 27198, 27171, 27143, 27143, 27177, 27172, 27170, 27139, 27137, 27169, 27172};
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, IAuthTabCallback iAuthTabCallback, Context context, Throwable th) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                onNavigationEvent(function1, iAuthTabCallback, context, th);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitOnNavigationEvent = onNavigationEvent(function1, iAuthTabCallback, context, th);
            int i3 = onWarmupCompleted + 121;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 57 / 0;
            }
            return unitOnNavigationEvent;
        }

        public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(function0);
            if (i3 != 0) {
                int i4 = 99 / 0;
            }
            int i5 = onWarmupCompleted + 15;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return unitOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        IAuthTabCallback(String str, int i) throws Throwable {
            List listListOf = CollectionsKt.listOf(new deprecated_retryOnConnectionFailure[]{deprecated_retryOnConnectionFailure.LINK, deprecated_retryOnConnectionFailure.IMAGE_WITH_LINK});
            int i2 = R.string.tds_sharebottomsheet_target_link_copy;
            Object[] objArr = new Object[1];
            a(new int[]{0, 59, 0, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1}, objArr);
            super(str, i, "link_copy", listListOf, ((String) objArr[0]).intern(), i2, null);
        }

        @Override // o.deprecated_readTimeoutMillis
        public Intent buildIntent(@NotNull final Context context, @Nullable String str, @Nullable String str2, @Nullable Uri uri, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Throwable, Unit> function1) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallback onextracallback = deprecated_networkInterceptors.Companion;
            if (str2 == null) {
                return null;
            }
            onExtraCallback.onWarmupCompleted(onextracallback, context, str2, new Function0() { // from class: im.toss.tds.sharebottomsheet.SharableAction$LINK_COPY$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 25;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnNavigationEvent = deprecated_networkInterceptors.IAuthTabCallback.onNavigationEvent(function0);
                    if (i6 == 0) {
                        int i7 = 88 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            }, new Function1() { // from class: im.toss.tds.sharebottomsheet.SharableAction$LINK_COPY$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 1;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    Function1 function12 = function1;
                    if (i6 == 0) {
                        return deprecated_networkInterceptors.IAuthTabCallback.onExtraCallbackWithResult(function12, this, context, (Throwable) obj);
                    }
                    Unit unitOnExtraCallbackWithResult = deprecated_networkInterceptors.IAuthTabCallback.onExtraCallbackWithResult(function12, this, context, (Throwable) obj);
                    int i7 = 32 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            });
            int i4 = onWarmupCompleted + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        private static final Unit onExtraCallback(Function0 function0) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                function0.invoke();
                return Unit.INSTANCE;
            }
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit onNavigationEvent(Function1 function1, IAuthTabCallback iAuthTabCallback, Context context, Throwable th) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            function1.invoke(th);
            iAuthTabCallback.showErrorToast(context, R.string.tds_sharebottomsheet_failure_link_copy);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
            return unit;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onExtraCallback;
            long j = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35283), (ViewConfiguration.getScrollBarSize() >> 8) + 35, 14240 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        int i7 = $10 + 101;
                        $11 = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 4 % 4;
                        }
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - TextUtils.lastIndexOf("", '0', 0)), 65 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 69 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12485 - TextUtils.indexOf((CharSequence) "", '0'), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                int i11 = $11 + 75;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    char[] cArr5 = new char[i3];
                    System.arraycopy(cArr3, 0, cArr5, 1, i3);
                    int i12 = i3 << i5;
                    System.arraycopy(cArr5, 1, cArr3, i12, i5);
                    System.arraycopy(cArr5, i5, cArr3, 0, i12);
                } else {
                    char[] cArr6 = new char[i3];
                    System.arraycopy(cArr3, 0, cArr6, 0, i3);
                    int i13 = i3 - i5;
                    System.arraycopy(cArr6, 0, cArr3, i13, i5);
                    System.arraycopy(cArr6, i5, cArr3, 0, i13);
                }
            }
            if (z) {
                char[] cArr7 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr7;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    public static final class onWarmupCompleted extends deprecated_networkInterceptors {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback;
        private static char[] onWarmupCompleted = {32422, 32466, 32478, 32467, 32404, 32415, 32429, 32421, 32419, 32408, 32479, 32473, 32472, 32423, 32402, 32470, 32409, 32418, 32471, 32474, 32416};
        private static int onExtraCallbackWithResult = -1184334002;
        private static boolean onNavigationEvent = true;
        private static boolean IAuthTabCallback = true;

        public static /* synthetic */ Unit onExtraCallback(Function0 function0, onWarmupCompleted onwarmupcompleted, Context context) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(function0, onwarmupcompleted, context);
            int i4 = IAuthTabCallbackStub + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }

        public static /* synthetic */ Unit onExtraCallback(Function1 function1, onWarmupCompleted onwarmupcompleted, Context context, Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(function1, onwarmupcompleted, context, th);
            int i4 = IAuthTabCallbackStub + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        onWarmupCompleted(String str, int i) throws Throwable {
            List listListOf = CollectionsKt.listOf(deprecated_retryOnConnectionFailure.IMAGE);
            int i2 = R.string.tds_sharebottomsheet_target_image_save;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-114, -115, -125, -118, -108, -108, -120, -107, -111, -110, -121, -117, -108, -115, -109, -117, -110, -111, -115, -117, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, AndroidCharacter.getMirror('0') + 'O', objArr);
            super(str, i, "save_image", listListOf, ((String) objArr[0]).intern(), i2, null);
        }

        @Override // o.deprecated_readTimeoutMillis
        public Intent buildIntent(@NotNull final Context context, @Nullable String str, @Nullable String str2, @Nullable Uri uri, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Throwable, Unit> function1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ImageSaver.IAuthTabCallback iAuthTabCallback = ImageSaver.Companion;
            Object obj = null;
            if (uri != null) {
                iAuthTabCallback.onExtraCallbackWithResult(context, uri, new Function0() { // from class: im.toss.tds.sharebottomsheet.SharableAction$IMAGE_SAVE$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 49;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            deprecated_networkInterceptors.onWarmupCompleted.onExtraCallback(function0, this, context);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnExtraCallback = deprecated_networkInterceptors.onWarmupCompleted.onExtraCallback(function0, this, context);
                        int i6 = onExtraCallbackWithResult + 15;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return unitOnExtraCallback;
                    }
                }, new Function1() { // from class: im.toss.tds.sharebottomsheet.SharableAction$IMAGE_SAVE$$ExternalSyntheticLambda1
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2) {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 113;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            deprecated_networkInterceptors.onWarmupCompleted.onExtraCallback(function1, this, context, (Throwable) obj2);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitOnExtraCallback = deprecated_networkInterceptors.onWarmupCompleted.onExtraCallback(function1, this, context, (Throwable) obj2);
                        int i6 = onNavigationEvent + 57;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        return unitOnExtraCallback;
                    }
                });
                return null;
            }
            int i4 = IAuthTabCallbackStub + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        private static final Unit onNavigationEvent(Function0 function0, onWarmupCompleted onwarmupcompleted, Context context) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            onwarmupcompleted.showSuccessToast(context, R.string.tds_sharebottomsheet_success_image_save);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 1;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit onNavigationEvent(Function1 function1, onWarmupCompleted onwarmupcompleted, Context context, Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                function1.invoke(th);
                onwarmupcompleted.showErrorToast(context, R.string.tds_sharebottomsheet_failure_image_save);
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(th, "");
            function1.invoke(th);
            onwarmupcompleted.showErrorToast(context, R.string.tds_sharebottomsheet_failure_image_save);
            Unit unit2 = Unit.INSTANCE;
            int i3 = onExtraCallback + 95;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onWarmupCompleted;
            long j = -1;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 78 - (SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1)), 20952 - View.combineMeasuredStates(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        j = -1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j2 = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 74 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (IAuthTabCallback) {
                int i5 = $11 + 25;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 62 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i7 = $10 + 101;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    j2 = 0;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i9 = $11 + 25;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i11 = $10 + 99;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            }
            char[] cArr6 = new char[i2];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 62, KeyEvent.normalizeMetaState(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        }
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static final /* synthetic */ void onWarmupCompleted(onExtraCallback onextracallback, Context context, String str, Function0 function0, Function1 function1) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onextracallback.IAuthTabCallback(context, str, function0, function1);
            int i4 = onExtraCallback + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
        }

        private final void IAuthTabCallback(Context context, String str, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ClipData clipDataNewPlainText = ClipData.newPlainText("", str);
            Intrinsics.checkNotNullExpressionValue(clipDataNewPlainText, "");
            onExtraCallback(context, clipDataNewPlainText, function0, function1);
            int i4 = onNavigationEvent + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        private final void onExtraCallback(Context context, ClipData clipData, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
            ClipboardManager clipboardManager;
            Object obj;
            int i = 2 % 2;
            Object systemService = context.getSystemService("clipboard");
            if (systemService instanceof ClipboardManager) {
                int i2 = onExtraCallback + 43;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                clipboardManager = (ClipboardManager) systemService;
            } else {
                clipboardManager = null;
            }
            if (clipboardManager == null) {
                function1.invoke(new IllegalStateException("Clipboard cannot be accessed."));
                return;
            }
            try {
                Result.Companion companion = Result.Companion;
                clipboardManager.setPrimaryClip(clipData);
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onNavigationEvent(obj)) {
                function0.invoke();
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i4 = onExtraCallback + 51;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                function1.invoke(th2);
            }
            Result.IAuthTabCallback(obj);
        }
    }
}
