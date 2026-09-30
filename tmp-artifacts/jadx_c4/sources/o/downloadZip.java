package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import o.DetectFaceInSingleImage;
import o.downloadZip;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class downloadZip implements aq {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int onTransact;
    private final Long IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final ConcurrentLinkedQueue<downloadZip> onExtraCallback = new ConcurrentLinkedQueue<>();
    private static final Lazy<ExecutorService> onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.tracker.entry.BaseAppLog$$ExternalSyntheticLambda1
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            ExecutorService executorService = (ExecutorService) downloadZip.onWarmupCompleted(iOnNavigationEvent2, -407004216, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, 407004217, new Object[0], iOnNavigationEvent3);
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return executorService;
            }
            throw null;
        }
    });

    public static /* synthetic */ Thread onExtraCallbackWithResult(Runnable runnable) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(runnable);
        }
        onExtraCallback(runnable);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i2) | i7 | i4);
        int i9 = ~i4;
        int i10 = (~(i7 | i2)) | (~(i7 | i9)) | (~(i9 | i2));
        int i11 = (~(i9 | i5)) | i2;
        int i12 = i5 + i2 + i + ((-946781377) * i6) + ((-59450693) * i3);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i5) - 346488832) + (357422218 * i2) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i) + ((-1205993472) * i6) + ((-1651113984) * i3) + ((-884408320) * i13);
        int i15 = ((i5 * 358501064) - 1042343473) + (i2 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i * 358500791) + (i6 * (-249165559)) + (i3 * 1905372845) + (i13 * 573505536);
        int i16 = i14 + (i15 * i15 * (-553189376));
        return i16 != 1 ? i16 != 2 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asBinder();
            obj.hashCode();
            throw null;
        }
        ExecutorService executorServiceAsBinder = asBinder();
        int i3 = IAuthTabCallbackStub + 113;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return executorServiceAsBinder;
        }
        obj.hashCode();
        throw null;
    }

    public abstract Map<String, Object> onNavigationEvent();

    public downloadZip() {
        GetMaxDetectableCount getMaxDetectableCount = GetMaxDetectableCount.onWarmupCompleted;
        this.onExtraCallbackWithResult = getMaxDetectableCount.onExtraCallbackWithResult();
        this.onNavigationEvent = getMaxDetectableCount.onWarmupCompleted();
        this.IAuthTabCallback = getMaxDetectableCount.onExtraCallback();
    }

    public static final /* synthetic */ ConcurrentLinkedQueue onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 47;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConcurrentLinkedQueue<downloadZip> concurrentLinkedQueue = onExtraCallback;
        int i4 = i2 + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return concurrentLinkedQueue;
    }

    public static final /* synthetic */ Lazy onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(this, "log", null, null, null, null, 105, null);
        } else {
            onExtraCallback(this, "log", null, null, null, null, 30, null);
        }
    }

    private final boolean access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return Intrinsics.areEqual(onNavigationEvent().get("from_web"), Boolean.TRUE);
        }
        Intrinsics.areEqual(onNavigationEvent().get("from_web"), Boolean.TRUE);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        downloadZip downloadzip = (downloadZip) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = downloadzip.onNavigationEvent().get("from_rn");
        if (i3 != 0) {
            return Boolean.valueOf(Intrinsics.areEqual(obj, Boolean.TRUE));
        }
        Intrinsics.areEqual(obj, Boolean.TRUE);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final boolean asInterface() {
        boolean zAreEqual;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            zAreEqual = Intrinsics.areEqual(onNavigationEvent().get("_immediate"), Boolean.TRUE);
            int i3 = 7 / 0;
        } else {
            zAreEqual = Intrinsics.areEqual(onNavigationEvent().get("_immediate"), Boolean.TRUE);
        }
        int i4 = onTransact + 113;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public static /* synthetic */ void onExtraCallback(downloadZip downloadzip, String str, Object obj, Long l, String str2, Throwable th, int i, Object obj2) {
        Object obj3;
        Long l2;
        String str3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 59;
        int i4 = i3 % 128;
        onTransact = i4;
        Throwable th2 = null;
        if (i3 % 2 != 0) {
            th2.hashCode();
            throw null;
        }
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: printConsoleLog");
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 125;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            obj3 = null;
        } else {
            obj3 = obj;
        }
        if ((i & 4) != 0) {
            int i7 = IAuthTabCallbackStub + 117;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i & 8) != 0) {
            int i9 = onTransact + 59;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i & 16) != 0) {
            int i11 = onTransact + 49;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
        } else {
            th2 = th;
        }
        downloadzip.onNavigationEvent(str, obj3, l2, str3, th2);
    }

    protected final void onNavigationEvent(@NotNull String str, @Nullable Object obj, @Nullable Long l, @Nullable String str2, @Nullable Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback iAuthTabCallback = Companion;
        boolean zAccess000 = access000();
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, iAuthTabCallback.onExtraCallback(zAccess000, ((Boolean) onWarmupCompleted(iOnNavigationEvent2, -2005378573, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, 2005378575, new Object[]{this}, iOnNavigationEvent3)).booleanValue()), str, obj, l, str2, th, onNavigationEvent(), null, 128, null);
        int i4 = IAuthTabCallbackStub + 51;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strAsInterface = GetFeatureExtension.onWarmupCompleted.asInterface();
        int i4 = onTransact + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return strAsInterface;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        downloadZip downloadzip = (downloadZip) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = downloadzip.onWarmupCompleted(false);
        int i4 = IAuthTabCallbackStub + 43;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnWarmupCompleted);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onWarmupCompleted(boolean z) throws Throwable {
        boolean z2;
        int i = 2 % 2;
        GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
        if (getFeatureExtension.ICustomTabsCallbackStub()) {
            if (Companion.IAuthTabCallback()) {
                int i2 = onTransact + 53;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallbackDefault();
            }
            if (!z) {
                int i4 = IAuthTabCallbackStub + 9;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                z2 = asInterface();
            }
            return ((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -77609466, new Object[]{getFeatureExtension, this, Boolean.valueOf(z2)}, 77609475, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
        }
        int i6 = onTransact + 99;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback.offer(this);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if ((r18 & 16) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        r2 = r2 + 47;
        o.downloadZip.onTransact = r2 % 128;
        r2 = r2 % 2;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r11.onExtraCallback(r12, r13, r14, r8, r9, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeLogParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r19 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r19 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if ((r18 & 8) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(downloadZip downloadzip, DetectFaceInSingleImage.onNavigationEvent onnavigationevent, Map map, boolean z, String str, boolean z2, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 61;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        if (i3 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }

    public final Object onExtraCallback(@NotNull DetectFaceInSingleImage.onNavigationEvent onnavigationevent, @Nullable Map<String, ? extends Object> map, boolean z, @Nullable String str, boolean z2, @NotNull access13800<? super Map<String, Object>> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Object objOnExtraCallbackWithResult = getUpdatedDate.onExtraCallbackWithResult(onnavigationevent, map, z, str, z2, this.onExtraCallbackWithResult, this.onNavigationEvent, this.IAuthTabCallback, AFj1oSDK.onExtraCallbackWithResult.onExtraCallbackWithResult(this), access13800Var);
            int i3 = IAuthTabCallbackStub + 103;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }
        getUpdatedDate.onExtraCallbackWithResult(onnavigationevent, map, z, str, z2, this.onExtraCallbackWithResult, this.onNavigationEvent, this.IAuthTabCallback, AFj1oSDK.onExtraCallbackWithResult.onExtraCallbackWithResult(this), access13800Var);
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static char[] onNavigationEvent = {51242, 51240, 51245, 64961, 64987, 51243, 64978, 64976, 64960};
        private static char onExtraCallback = 51242;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = ~((~i2) | i7);
            int i9 = i5 | i8 | (~(i3 | i2));
            int i10 = (~(i2 | i5)) | (~(i7 | i2)) | (~(i7 | i5));
            int i11 = i5 + i3 + i6 + (1351532378 * i4) + (1237199896 * i);
            int i12 = i11 * i11;
            int i13 = ((-211156802) * i5) + 1314914304 + ((-491389116) * i3) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i6) + ((-1818230784) * i4) + ((-914358272) * i) + ((-2051670016) * i12);
            int i14 = ((i5 * 406040238) - 634933780) + (i3 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i6 * 406039561) + (i4 * 1283666474) + (i * 1712827608) + (i12 * (-77201408));
            int i15 = i13 + (i14 * i14 * 1831469056);
            if (i15 != 1) {
                return i15 != 2 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            String str = (String) objArr[1];
            int i16 = 2 % 2;
            int i17 = IAuthTabCallback + 99;
            onWarmupCompleted = i17 % 128;
            int iCharCount = i17 % 2 != 0 ? 0 : 1;
            int iOnExtraCallback = iCharCount;
            while (iCharCount < str.length()) {
                int i18 = IAuthTabCallback + 123;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                int iCodePointAt = str.codePointAt(iCharCount);
                iOnExtraCallback += iAuthTabCallback.onExtraCallback(iCodePointAt);
                if (iOnExtraCallback > 3800) {
                    String strSubstring = str.substring(0, iCharCount);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    return strSubstring + "[+" + (str.length() - iCharCount) + " truncated]";
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            return str;
        }

        private final int onExtraCallback(int i) {
            int i2 = 2 % 2;
            if (i < 128) {
                int i3 = IAuthTabCallback + 91;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return 1;
            }
            if (i < 2048) {
                int i5 = IAuthTabCallback + 47;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 == 0 ? 4 : 2;
            }
            if (i >= 65536) {
                return 4;
            }
            int i6 = onWarmupCompleted + 7;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return 3;
        }

        public static /* synthetic */ void onWarmupCompleted(String str, String str2, Object obj, Long l, String str3, Throwable th, Map map, String str4) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(str, str2, obj, l, str3, th, map, str4);
            if (i3 != 0) {
                int i4 = 77 / 0;
            }
            int i5 = onWarmupCompleted + 77;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 56 / 0;
            }
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 43;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public final boolean onExtraCallback(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            return i3 != 0;
        }

        private IAuthTabCallback() {
        }

        public final String onExtraCallback(boolean z, boolean z2) {
            int i = 2 % 2;
            if (z) {
                int i2 = IAuthTabCallback + 13;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return "web";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (z2) {
                int i3 = IAuthTabCallback + 91;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return "rn";
            }
            int i5 = onWarmupCompleted + 37;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 58 / 0;
            }
            return "native";
        }

        public static /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, String str, String str2, Object obj, Long l, String str3, Throwable th, Map map, String str4, int i, Object obj2) {
            String str5;
            int i2 = 2 % 2;
            if ((i & 128) != 0) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 95;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 43;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                str5 = "TossAppLog";
            } else {
                str5 = str4;
            }
            iAuthTabCallback.onExtraCallbackWithResult(str, str2, obj, l, str3, th, map, str5);
            int i8 = IAuthTabCallback + 53;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
        }

        public final void onExtraCallbackWithResult(@NotNull final String str, @NotNull final String str2, @Nullable final Object obj, @Nullable final Long l, @Nullable final String str3, @Nullable final Throwable th, @Nullable final Map<String, ? extends Object> map, @NotNull final String str4) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            ((ExecutorService) IAuthTabCallback(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 217642431, new Object[]{this}, iOnNavigationEvent3, -217642431, iOnNavigationEvent2)).execute(new Runnable() { // from class: im.toss.core.tracker.entry.BaseAppLog$Companion$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 91;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    downloadZip.IAuthTabCallback.onWarmupCompleted(str, str2, obj, l, str3, th, map, str4);
                    int i5 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            int i2 = onWarmupCompleted + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final void onExtraCallback(String str, String str2, Object obj, Long l, String str3, Throwable th, Map map, String str4) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {downloadZip.Companion, str, str2, obj, l, str3, th, map};
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            switch (str2.hashCode()) {
                case -1408208058:
                    if (str2.equals("assert")) {
                        return;
                    }
                    break;
                case 3237038:
                    if (str2.equals("info")) {
                        return;
                    }
                    break;
                case 3641990:
                    if (str2.equals("warn")) {
                        return;
                    }
                    break;
                case 94921639:
                    Object[] objArr2 = new Object[1];
                    a(new char[]{6, 4, 7, 6, 13884}, (byte) (73 - TextUtils.lastIndexOf("", '0')), 5 - TextUtils.getOffsetAfter("", 0), objArr2);
                    str2.equals(((String) objArr2[0]).intern());
                    return;
                case 96784904:
                    str2.equals("error");
                    return;
                default:
                    return;
            }
            int i4 = IAuthTabCallback + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 81 / 0;
            }
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object value = downloadZip.onWarmupCompleted().getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                return (ExecutorService) value;
            }
            Object value2 = downloadZip.onWarmupCompleted().getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            String string;
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            Object obj = objArr[3];
            Long l = (Long) objArr[4];
            String str3 = (String) objArr[5];
            Throwable th = (Throwable) objArr[6];
            Map<String, ? extends Object> map = (Map) objArr[7];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('/');
            sb.append(str2);
            if (l != null) {
                int i2 = onWarmupCompleted + 103;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                long jLongValue = l.longValue();
                sb.append(" schema=");
                sb.append(jLongValue);
            }
            if (obj != null && (string = obj.toString()) != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    int i4 = onWarmupCompleted + 37;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    sb.append(" name=");
                    sb.append(string);
                }
            }
            if (str3 != null) {
                if (str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 != null) {
                    int i6 = IAuthTabCallback + 7;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    sb.append(" msg=\"");
                    sb.append(downloadZip.Companion.IAuthTabCallback(str3));
                    sb.append('\"');
                }
            }
            if (th != null) {
                sb.append(" err=");
                sb.append(th.getClass().getSimpleName());
                int i8 = IAuthTabCallback + 13;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
            if (map != null) {
                int i10 = IAuthTabCallback + 67;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                if (!map.isEmpty()) {
                    sb.append(" params=");
                    sb.append(downloadZip.Companion.onExtraCallback(map));
                }
            }
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }

        private final String IAuthTabCallback(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            for (int i4 = 0; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\"') {
                    String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, '\n', ' ', false, 4, (Object) null), '\r', ' ', false, 4, (Object) null), '\"', '\'', false, 4, (Object) null);
                    int i5 = IAuthTabCallback + 21;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 87 / 0;
                    }
                    return strReplace$default;
                }
            }
            return str;
        }

        private final String onExtraCallback(Map<String, ? extends Object> map) {
            int i = 2 % 2;
            try {
                StringBuilder sb = new StringBuilder();
                downloadZip.Companion.IAuthTabCallback(sb, map);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                String str = (String) IAuthTabCallback(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -2020920173, new Object[]{this, string}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2020920174, iOnNavigationEvent2);
                int i2 = onWarmupCompleted + 103;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 82 / 0;
                }
                return str;
            } catch (Throwable th) {
                return "<serialization failed: " + th.getClass().getSimpleName() + ">";
            }
        }

        private final void IAuthTabCallback(StringBuilder sb, Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (sb.length() > 25769) {
                    return;
                }
            } else if (sb.length() > 3800) {
                return;
            }
            if (obj == null) {
                int i3 = IAuthTabCallback + 81;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                sb.append("null");
                return;
            }
            if ((obj instanceof Number) || (obj instanceof Boolean)) {
                sb.append(obj.toString());
                return;
            }
            if (obj instanceof JsonElement) {
                int i5 = onWarmupCompleted + 41;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                sb.append(((JsonElement) obj).toString());
                return;
            }
            if (obj instanceof Map) {
                onExtraCallbackWithResult(sb, ((Map) obj).entrySet());
                return;
            }
            if (obj instanceof Iterable) {
                onWarmupCompleted(sb, (Iterable) obj);
                int i7 = onWarmupCompleted + 115;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            if (obj instanceof Object[]) {
                onWarmupCompleted(sb, ArraysKt.asIterable((Object[]) obj));
            } else {
                onExtraCallback(sb, obj.toString());
            }
        }

        private final void onExtraCallbackWithResult(StringBuilder sb, Set<? extends Map.Entry<? extends Object, ? extends Object>> set) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            sb.append('{');
            int i4 = 0;
            for (Object obj : set) {
                int i5 = IAuthTabCallback + 125;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Map.Entry entry = (Map.Entry) obj;
                if (i4 > 0) {
                    sb.append(',');
                }
                IAuthTabCallback iAuthTabCallback = downloadZip.Companion;
                iAuthTabCallback.onExtraCallback(sb, String.valueOf(entry.getKey()));
                sb.append(':');
                iAuthTabCallback.IAuthTabCallback(sb, entry.getValue());
                i4++;
            }
            sb.append('}');
            int i7 = IAuthTabCallback + 55;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }

        private final void onWarmupCompleted(StringBuilder sb, Iterable<? extends Object> iterable) {
            int i = 2 % 2;
            sb.append('[');
            int i2 = 0;
            for (Object obj : iterable) {
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i2 > 0) {
                    int i3 = onWarmupCompleted + 37;
                    IAuthTabCallback = i3 % 128;
                    sb.append(i3 % 2 != 0 ? 'o' : ',');
                }
                downloadZip.Companion.IAuthTabCallback(sb, obj);
                i2++;
                int i4 = onWarmupCompleted + 105;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            sb.append(']');
        }

        private final void onExtraCallback(StringBuilder sb, String str) {
            char cCharAt;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            sb.append('\"');
            for (int i4 = 0; i4 < str.length(); i4++) {
                int i5 = IAuthTabCallback + 87;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0 ? (cCharAt = str.charAt(i4)) == '\t' : (cCharAt = str.charAt(i4)) == '-') {
                    sb.append("\\t");
                } else if (cCharAt == '\n') {
                    sb.append("\\n");
                } else if (cCharAt == '\r') {
                    sb.append("\\r");
                } else if (cCharAt == '\"') {
                    sb.append("\\\"");
                    int i6 = IAuthTabCallback + 65;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                } else if (cCharAt != '\\') {
                    sb.append(cCharAt);
                } else {
                    sb.append("\\\\");
                }
            }
            sb.append('\"');
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            long j;
            int i3 = 2;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onNavigationEvent;
            long j2 = 0;
            if (cArr2 != null) {
                int i5 = $11 + 31;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 83;
                    $11 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26, (KeyEvent.getMaxKeyCode() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        i3 = 2;
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 26 - ExpandableListView.getPackedPositionGroup(0L), Color.green(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        j = j2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24825 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 75 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (Process.myTid() >> 22) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i10 = $11 + 91;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                j = 0;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 30 - TextUtils.getTrimmedLength(""), 19489 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                j = 0;
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            j = 0;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i13 = $11 + 51;
                                $10 = i13 % 128;
                                int i14 = i13 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                            } else {
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    j2 = j;
                }
            }
            for (int i19 = 0; i19 < i; i19++) {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            while (true) {
                downloadZip downloadzip = (downloadZip) downloadZip.onExtraCallback().poll();
                if (downloadzip == null) {
                    int i2 = onWarmupCompleted + 109;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return;
                } else {
                    int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                    int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                    int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                    ((Boolean) downloadZip.onWarmupCompleted(iOnNavigationEvent2, 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, new Object[]{downloadzip}, iOnNavigationEvent3)).booleanValue();
                }
            }
        }

        private final ExecutorService onNavigationEvent() {
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            return (ExecutorService) IAuthTabCallback(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 217642431, new Object[]{this}, iOnNavigationEvent3, -217642431, iOnNavigationEvent2);
        }

        private final String onExtraCallbackWithResult(String str) {
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            return (String) IAuthTabCallback(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -2020920173, new Object[]{this, str}, iOnNavigationEvent3, 2020920174, iOnNavigationEvent2);
        }

        public final String onNavigationEvent(@NotNull String str, @NotNull String str2, @Nullable Object obj, @Nullable Long l, @Nullable String str3, @Nullable Throwable th, @Nullable Map<String, ? extends Object> map) {
            Object[] objArr = {this, str, str2, obj, l, str3, th, map};
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            return (String) IAuthTabCallback(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -530233615, objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 530233617, iOnNavigationEvent2);
        }
    }

    static {
        int i = asBinder + 1;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static final ExecutorService asBinder() {
        int i = 2 % 2;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: im.toss.core.tracker.entry.BaseAppLog$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 61;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return downloadZip.onExtraCallbackWithResult(runnable);
                }
                downloadZip.onExtraCallbackWithResult(runnable);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return executorServiceNewSingleThreadExecutor;
    }

    private static final Thread onExtraCallback(Runnable runnable) {
        int i = 2 % 2;
        Thread thread = new Thread(runnable, "TossAppLogConsole");
        thread.setDaemon(true);
        thread.setPriority(1);
        int i2 = IAuthTabCallbackStub + 63;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return thread;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ExecutorService IAuthTabCallback() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (ExecutorService) onWarmupCompleted(iOnNavigationEvent2, -407004216, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, 407004217, new Object[0], iOnNavigationEvent3);
    }

    private final boolean onTransact() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(iOnNavigationEvent2, -2005378573, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, 2005378575, new Object[]{this}, iOnNavigationEvent3)).booleanValue();
    }

    public final boolean IAuthTabCallbackStub() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(iOnNavigationEvent2, 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, new Object[]{this}, iOnNavigationEvent3)).booleanValue();
    }
}
