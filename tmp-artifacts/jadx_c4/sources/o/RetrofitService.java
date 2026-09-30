package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.RetrofitService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class RetrofitService implements checkValidFaceSize, AssetInfoResponseBody {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private Context IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final String onWarmupCompleted = "";
    private final boolean IAuthTabCallbackStub = true;
    private final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.tracker.dispatcher.DefaultAppLogProcessor$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            DateTimeFormatter dateTimeFormatterOnExtraCallbackWithResult = RetrofitService.onExtraCallbackWithResult();
            if (i3 != 0) {
                int i4 = 28 / 0;
            }
            return dateTimeFormatterOnExtraCallbackWithResult;
        }
    });

    public static /* synthetic */ DateTimeFormatter onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        DateTimeFormatter dateTimeFormatterOnMinimized = onMinimized();
        int i4 = asInterface + 19;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return dateTimeFormatterOnMinimized;
    }

    public String IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        int i5 = asInterface + 77;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 3;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public Long asBinder() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 111;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 1;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return null;
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 25;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 47;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = i2 + 91;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public RetrofitService(@Nullable Context context) {
        this.IAuthTabCallback = context;
    }

    public boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 117;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i2 + 39;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private final String onExtraCallback(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        Object obj = null;
        try {
            packageInfo = (i2 % 2 != 0 ? context.getPackageManager() : context.getPackageManager()).getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (str = packageInfo.versionName) == null) {
            str = "";
        }
        int i3 = asInterface + 39;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private final String onActivityLayout() {
        int i = 2 % 2;
        Context context = this.IAuthTabCallback;
        if (context != null) {
            return onExtraCallbackWithResult(context);
        }
        int i2 = onTransact + 71;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    @Override // o.checkValidFaceSize
    public String bx_() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onActivityLayout();
            throw null;
        }
        String strOnActivityLayout = onActivityLayout();
        int i3 = asInterface + 111;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return strOnActivityLayout;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(System.currentTimeMillis());
            throw null;
        }
        String strOnWarmupCompleted = onWarmupCompleted(System.currentTimeMillis());
        int i3 = asInterface + 75;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return strOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        Context context = this.IAuthTabCallback;
        if (context == null) {
            return "";
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            int i2 = onTransact + 113;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        int i4 = asInterface + 121;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return string;
    }

    public String access100() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 95;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return "";
        }
        throw null;
    }

    public boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onNavigationEvent;
        int i4 = i3 + 101;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return z;
    }

    public String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 63;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        obj.hashCode();
        throw null;
    }

    public String extraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(UUID.randomUUID().toString(), "");
            throw null;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public String access000() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 49;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.checkValidFaceSize
    public String ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        int i4 = asInterface + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return strValueOf;
    }

    public String readTypedObject() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return "";
        }
        throw null;
    }

    public boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.IAuthTabCallbackStub;
        int i4 = i3 + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private final DateTimeFormatter onPostMessage() {
        DateTimeFormatter dateTimeFormatter;
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Object value = this.onExtraCallback.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            dateTimeFormatter = (DateTimeFormatter) value;
            int i3 = 90 / 0;
        } else {
            Object value2 = this.onExtraCallback.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            dateTimeFormatter = (DateTimeFormatter) value2;
        }
        int i4 = asInterface + 81;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return dateTimeFormatter;
    }

    private static final DateTimeFormatter onMinimized() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.US).withZone(ZoneId.systemDefault());
        int i4 = onTransact + 115;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return dateTimeFormatterWithZone;
        }
        throw null;
    }

    public String onWarmupCompleted(long j) {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 37;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            str = onPostMessage().format(Instant.ofEpochMilli(j));
            Intrinsics.checkNotNullExpressionValue(str, "");
            int i3 = 82 / 0;
        } else {
            str = onPostMessage().format(Instant.ofEpochMilli(j));
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        int i4 = onTransact + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    private final String onExtraCallbackWithResult(Context context) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        String strOnExtraCallback = onExtraCallback(context);
        int length = strOnExtraCallback.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = onTransact + 51;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (strOnExtraCallback.charAt(i2) == '-') {
                strOnExtraCallback = strOnExtraCallback.substring(0, i2);
                Intrinsics.checkNotNullExpressionValue(strOnExtraCallback, "");
                break;
            }
            int i5 = onTransact + 67;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            i2++;
        }
        int i7 = onTransact + 49;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            return strOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
