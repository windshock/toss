package o;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.internal.ads.zzgc;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxFullscreenAdImplExternalSyntheticLambda9 implements MultiParagraphExternalSyntheticLambda0 {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 0;
    private static int extraCallbackWithResult = 1;
    private static int readTypedObject;
    private final String IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String IAuthTabCallback_Parcel;
    private final String access100;
    private final String asBinder;
    private final boolean asInterface;
    private final String getInterfaceDescriptor;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    static {
        int i = IAuthTabCallbackStubProxy + 47;
        access000 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean z = i3 != 0;
        int i4 = readTypedObject + 49;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public MaxFullscreenAdImplExternalSyntheticLambda9(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull String str7) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallbackStub = str2;
        this.onWarmupCompleted = str3;
        this.onNavigationEvent = str4;
        this.IAuthTabCallbackDefault = z;
        this.getInterfaceDescriptor = str5;
        this.access100 = str6;
        this.IAuthTabCallback = str7;
        this.asBinder = "TossModule";
        String str8 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str8, "");
        this.IAuthTabCallback_Parcel = str8;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2005903668);
        Object obj = ((Field) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (11423 - (ViewConfiguration.getTouchSlop() >> 8)), 30 - (ViewConfiguration.getEdgeSlop() >> 16), 24856 - Process.getGidForName(""), -1187993508, false, "onExtraCallbackWithResult", (Class[]) null) : objOnExtraCallback)).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1884379750);
            this.onTransact = (String) ((Method) (objOnExtraCallback2 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 11424), 30 - View.resolveSizeAndState(0, 0, 0), 24858 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1091675382, false, "onWarmupCompleted", new Class[0]) : objOnExtraCallback2)).invoke(obj, null);
            this.asInterface = r8lambdaFyzE0yKmm35fa3xWdPZj6qRV0I.onExtraCallback();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 65;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 33;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 65;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallbackStub;
        int i5 = i2 + 75;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 43;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return str;
    }

    public boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 17;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getInterfaceDescriptor;
        int i5 = i2 + 7;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 79;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String str = this.access100;
        int i5 = i2 + 99;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 97;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 67;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        String str = this.asBinder;
        int i5 = i3 + 55;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 99;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback_Parcel;
        int i5 = i2 + 5;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.onTransact;
        int i5 = i3 + 103;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean access000() {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.asInterface;
        int i5 = i3 + 19;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 97;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 101;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final MaxFullscreenAdImplExternalSyntheticLambda9 IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda9 = new MaxFullscreenAdImplExternalSyntheticLambda9(onWarmupCompleted(), onTransact(), onExtraCallback(), "", IAuthTabCallback_Parcel(), asInterface(), "", "");
        int i2 = readTypedObject + 51;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda9;
        }
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull String str, @NotNull ReadableMap readableMap, @NotNull Function1<? super Object[], Unit> function1, @NotNull Function1<? super RectListDebuggerModifierElement, Unit> function12) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossModuleConstants", "postMessage on constants stub: " + str, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        function12.invoke(new RectListDebuggerModifierElement("TossModule is not ready yet", "NOT_READY"));
        int i2 = readTypedObject + 117;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void IAuthTabCallback(@NotNull ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(readableMap, "");
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossModuleConstants", "eventLog on constants stub", null, null, false, null, 87, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            return;
        }
        Intrinsics.checkNotNullParameter(readableMap, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossModuleConstants", "eventLog on constants stub", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }

    public Object onNavigationEvent(@NotNull ReadableMap readableMap, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossModuleConstants", "domainLog on constants stub", null, null, false, null, 23, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        } else {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossModuleConstants", "domainLog on constants stub", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    public void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossModuleConstants", "setBreadcrumb on constants stub", null, null, true, null, 116, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossModuleConstants", "setBreadcrumb on constants stub", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
        int i3 = readTypedObject + 53;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
