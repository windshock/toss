package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n3 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    public static final String IAuthTabCallback;
    private static long ICustomTabsCallback = 0;
    private static int onActivityResized = 1;
    private static final n3 onExtraCallback;
    private static final n3 onExtraCallbackWithResult;
    private static int onMessageChannelReady = 0;
    private static int onMinimized = 0;
    public static final String onNavigationEvent;
    private static int onPostMessage = 1;
    public static final String onWarmupCompleted;
    private final n5 IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final boolean IAuthTabCallbackStubProxy;
    private final hbExternalSyntheticLambda13 IAuthTabCallback_Parcel;
    private final hbExternalSyntheticLambda0 access000;
    private final hbExternalSyntheticLambda7 access100;
    private final boolean asBinder;
    private final onRewardedAdHidden asInterface;
    private final long extraCallback;
    private final String extraCallbackWithResult;
    private final boolean getInterfaceDescriptor;
    private final onRewardedAdLoadFailed onTransact;
    private final setClickableViews readTypedObject;
    private final String writeTypedObject;

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = i7 | i;
        int i9 = ~i8;
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i));
        int i12 = i8 | i10;
        int i13 = (~(i3 | i)) | (~(i7 | (~i)));
        int i14 = i + i2 + i4 + ((-1311665080) * i6) + (1761575915 * i5);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i) + 412680192 + (1917570655 * i2) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i4) + (175112192 * i6) + ((-649461760) * i5) + (1783169024 * i15);
        int i17 = ((i * 1226044109) - 1701849991) + (i2 * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (i4 * 1226043599) + (i6 * (-858626504)) + (i5 * 1069087493) + (i15 * 1627848704);
        int i18 = i16 + (i17 * i17 * 739704832);
        if (i18 == 1) {
            n3 n3Var = (n3) objArr[0];
            int i19 = 2 % 2;
            int i20 = onPostMessage;
            int i21 = i20 + 39;
            onMinimized = i21 % 128;
            int i22 = i21 % 2;
            hbExternalSyntheticLambda0 hbexternalsyntheticlambda0 = n3Var.access000;
            int i23 = i20 + 59;
            onMinimized = i23 % 128;
            int i24 = i23 % 2;
            return hbexternalsyntheticlambda0;
        }
        if (i18 == 2) {
            return onWarmupCompleted(objArr);
        }
        n3 n3Var2 = (n3) objArr[0];
        int i25 = 2 % 2;
        int i26 = onMinimized + 27;
        int i27 = i26 % 128;
        onPostMessage = i27;
        int i28 = i26 % 2;
        long j = n3Var2.extraCallback;
        int i29 = i27 + 93;
        onMinimized = i29 % 128;
        int i30 = i29 % 2;
        return Long.valueOf(j);
    }

    public static /* synthetic */ n3 onWarmupCompleted(n3 n3Var, boolean z, String str, String str2, String str3, long j, hbExternalSyntheticLambda0 hbexternalsyntheticlambda0, n5 n5Var, setClickableViews setclickableviews, onRewardedAdLoadFailed onrewardedadloadfailed, onRewardedAdHidden onrewardedadhidden, hbExternalSyntheticLambda13 hbexternalsyntheticlambda13, boolean z2, boolean z3, hbExternalSyntheticLambda7 hbexternalsyntheticlambda7, int i, Object obj) {
        String str4;
        String str5;
        n5 n5Var2;
        onRewardedAdLoadFailed onrewardedadloadfailed2;
        hbExternalSyntheticLambda13 hbexternalsyntheticlambda132;
        int i2 = 2 % 2;
        int i3 = onMinimized;
        int i4 = i3 + 101;
        onPostMessage = i4 % 128;
        boolean z4 = (i4 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? z : n3Var.asBinder;
        String str6 = (i & 2) != 0 ? n3Var.writeTypedObject : str;
        if ((i & 4) != 0) {
            int i5 = i3 + 85;
            onPostMessage = i5 % 128;
            if (i5 % 2 == 0) {
                str4 = n3Var.extraCallbackWithResult;
                int i6 = 27 / 0;
            } else {
                str4 = n3Var.extraCallbackWithResult;
            }
        } else {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            int i7 = onPostMessage + 81;
            onMinimized = i7 % 128;
            int i8 = i7 % 2;
            str5 = n3Var.IAuthTabCallbackStub;
        } else {
            str5 = str3;
        }
        long j2 = (i & 16) != 0 ? n3Var.extraCallback : j;
        hbExternalSyntheticLambda0 hbexternalsyntheticlambda02 = (i & 32) != 0 ? n3Var.access000 : hbexternalsyntheticlambda0;
        if ((i & 64) != 0) {
            int i9 = onPostMessage + 63;
            onMinimized = i9 % 128;
            int i10 = i9 % 2;
            n5Var2 = n3Var.IAuthTabCallbackDefault;
        } else {
            n5Var2 = n5Var;
        }
        setClickableViews setclickableviews2 = (i & 128) != 0 ? n3Var.readTypedObject : setclickableviews;
        if ((i & 256) != 0) {
            int i11 = onPostMessage + 87;
            onMinimized = i11 % 128;
            int i12 = i11 % 2;
            onrewardedadloadfailed2 = n3Var.onTransact;
        } else {
            onrewardedadloadfailed2 = onrewardedadloadfailed;
        }
        onRewardedAdHidden onrewardedadhidden2 = (i & 512) != 0 ? n3Var.asInterface : onrewardedadhidden;
        if ((i & 1024) != 0) {
            int i13 = onMinimized + 115;
            onPostMessage = i13 % 128;
            int i14 = i13 % 2;
            hbexternalsyntheticlambda132 = n3Var.IAuthTabCallback_Parcel;
        } else {
            hbexternalsyntheticlambda132 = hbexternalsyntheticlambda13;
        }
        return n3Var.onExtraCallbackWithResult(z4, str6, str4, str5, j2, hbexternalsyntheticlambda02, n5Var2, setclickableviews2, onrewardedadloadfailed2, onrewardedadhidden2, hbexternalsyntheticlambda132, (i & 2048) != 0 ? n3Var.IAuthTabCallbackStubProxy : z2, (i & 4096) != 0 ? n3Var.getInterfaceDescriptor : z3, (i & 8192) != 0 ? n3Var.access100 : hbexternalsyntheticlambda7);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 51;
        int i4 = i3 % 128;
        onMinimized = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 59;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof n3)) {
            int i8 = i2 + 19;
            onMinimized = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        n3 n3Var = (n3) obj;
        if (this.asBinder != n3Var.asBinder || !Intrinsics.areEqual(this.writeTypedObject, n3Var.writeTypedObject)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.extraCallbackWithResult, n3Var.extraCallbackWithResult)) {
            int i10 = onPostMessage + 101;
            onMinimized = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, n3Var.IAuthTabCallbackStub) || this.extraCallback != n3Var.extraCallback) {
            return false;
        }
        if (this.access000 != n3Var.access000) {
            int i11 = onPostMessage + 23;
            onMinimized = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, n3Var.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.readTypedObject, n3Var.readTypedObject) || !Intrinsics.areEqual(this.onTransact, n3Var.onTransact)) {
            return false;
        }
        if (Intrinsics.areEqual(this.asInterface, n3Var.asInterface)) {
            return Intrinsics.areEqual(this.IAuthTabCallback_Parcel, n3Var.IAuthTabCallback_Parcel) && this.IAuthTabCallbackStubProxy == n3Var.IAuthTabCallbackStubProxy && this.getInterfaceDescriptor == n3Var.getInterfaceDescriptor && Intrinsics.areEqual(this.access100, n3Var.access100);
        }
        int i13 = onPostMessage + 45;
        onMinimized = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onPostMessage + 73;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((Boolean.hashCode(this.asBinder) * 31) + this.writeTypedObject.hashCode()) * 31) + this.extraCallbackWithResult.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + Long.hashCode(this.extraCallback)) * 31) + this.access000.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.readTypedObject.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.IAuthTabCallback_Parcel.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallbackStubProxy)) * 31) + Boolean.hashCode(this.getInterfaceDescriptor)) * 31) + this.access100.hashCode();
        int i4 = onPostMessage + 79;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final n3 onExtraCallbackWithResult(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull hbExternalSyntheticLambda0 hbexternalsyntheticlambda0, @NotNull n5 n5Var, @NotNull setClickableViews setclickableviews, @NotNull onRewardedAdLoadFailed onrewardedadloadfailed, @NotNull onRewardedAdHidden onrewardedadhidden, @NotNull hbExternalSyntheticLambda13 hbexternalsyntheticlambda13, boolean z2, boolean z3, @NotNull hbExternalSyntheticLambda7 hbexternalsyntheticlambda7) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        Intrinsics.checkNotNullParameter(setclickableviews, "");
        Intrinsics.checkNotNullParameter(onrewardedadloadfailed, "");
        Intrinsics.checkNotNullParameter(onrewardedadhidden, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda13, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda7, "");
        n3 n3Var = new n3(z, str, str2, str3, j, hbexternalsyntheticlambda0, n5Var, setclickableviews, onrewardedadloadfailed, onrewardedadhidden, hbexternalsyntheticlambda13, z2, z3, hbexternalsyntheticlambda7);
        int i2 = onMinimized + 35;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return n3Var;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnWarmupPolicy(enabled=" + this.asBinder + ", sharedBundleName=" + this.writeTypedObject + ", serviceBundleName=" + this.extraCallbackWithResult + ", fallbackRoute=" + this.IAuthTabCallbackStub + ", waitTimeoutMs=" + this.extraCallback + ", loadingView=" + this.access000 + ", initialState=" + this.IAuthTabCallbackDefault + ", warmupEvent=" + this.readTypedObject + ", fragmentPolicy=" + this.onTransact + ", backPressPolicy=" + this.asInterface + ", overlayLifecyclePolicy=" + this.IAuthTabCallback_Parcel + ", serviceBundleImportLazyEnabled=" + this.IAuthTabCallbackStubProxy + ", preloadServiceBundleDuringWarmup=" + this.getInterfaceDescriptor + ", searchEntryFallbackEvent=" + this.access100 + ")";
        int i2 = onMinimized + 101;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r19) != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r19) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0111, code lost:
    
        if ((!kotlin.text.StringsKt.isBlank(r20)) != true) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
    
        if (r26.IAuthTabCallbackDefault() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011d, code lost:
    
        if (r26.IAuthTabCallback() != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0123, code lost:
    
        if (r26.onExtraCallbackWithResult() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
    
        if (r26.onNavigationEvent() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012b, code lost:
    
        if (r29 != true) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012d, code lost:
    
        r1 = o.n3.onPostMessage + 55;
        o.n3.onMinimized = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0137, code lost:
    
        if ((r1 % 2) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
    
        r2 = 48 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0141, code lost:
    
        if (r31.onNavigationEvent() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
    
        if (r31.onNavigationEvent() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
    
        throw new java.lang.IllegalArgumentException("enabled policy must deliver fallback event to search entry target");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:
    
        throw new java.lang.IllegalArgumentException("enabled policy must importLazy service bundle");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0162, code lost:
    
        throw new java.lang.IllegalArgumentException("enabled policy must remove TossReactNativeFragment when leaving shopping tab");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016a, code lost:
    
        throw new java.lang.IllegalArgumentException("enabled policy must not move to another FragmentManager on search entry");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        throw new java.lang.IllegalArgumentException("enabled policy must not create a new Fragment on search entry");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017a, code lost:
    
        throw new java.lang.IllegalArgumentException("enabled policy must show the attached TossReactNativeFragment on search entry");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0182, code lost:
    
        throw new java.lang.IllegalArgumentException("fallbackRoute must not be blank when enabled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018a, code lost:
    
        throw new java.lang.IllegalArgumentException("serviceBundleName must not be blank when enabled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n3(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull hbExternalSyntheticLambda0 hbexternalsyntheticlambda0, @NotNull n5 n5Var, @NotNull setClickableViews setclickableviews, @NotNull onRewardedAdLoadFailed onrewardedadloadfailed, @NotNull onRewardedAdHidden onrewardedadhidden, @NotNull hbExternalSyntheticLambda13 hbexternalsyntheticlambda13, boolean z2, boolean z3, @NotNull hbExternalSyntheticLambda7 hbexternalsyntheticlambda7) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        Intrinsics.checkNotNullParameter(setclickableviews, "");
        Intrinsics.checkNotNullParameter(onrewardedadloadfailed, "");
        Intrinsics.checkNotNullParameter(onrewardedadhidden, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda13, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda7, "");
        this.asBinder = z;
        this.writeTypedObject = str;
        this.extraCallbackWithResult = str2;
        this.IAuthTabCallbackStub = str3;
        this.extraCallback = j;
        this.access000 = hbexternalsyntheticlambda0;
        this.IAuthTabCallbackDefault = n5Var;
        this.readTypedObject = setclickableviews;
        this.onTransact = onrewardedadloadfailed;
        this.asInterface = onrewardedadhidden;
        this.IAuthTabCallback_Parcel = hbexternalsyntheticlambda13;
        this.IAuthTabCallbackStubProxy = z2;
        this.getInterfaceDescriptor = z3;
        this.access100 = hbexternalsyntheticlambda7;
        if (0 > j || j >= 301) {
            throw new IllegalArgumentException("waitTimeoutMs must be in 0..300");
        }
        int i = onPostMessage;
        int i2 = i + 113;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        if (!z && z2) {
            throw new IllegalArgumentException("disabled policy must not importLazy service bundle");
        }
        if (!z && z3) {
            throw new IllegalArgumentException("disabled policy must not preload service bundle during warm-up");
        }
        if (z3) {
            int i4 = i + 119;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            if (!z2) {
                throw new IllegalArgumentException("service bundle preload requires importLazy service bundle");
            }
        }
        if (z2 && !Companion.onExtraCallbackWithResult(str2)) {
            throw new IllegalArgumentException("importLazy service bundle must not be blank");
        }
        if (z2) {
            onNavigationEvent onnavigationevent = Companion;
            if (!Intrinsics.areEqual(str3, onnavigationevent.onExtraCallback(str2))) {
                throw new IllegalArgumentException(("fallbackRoute must match service bundle: " + onnavigationevent.onExtraCallback(str2)).toString());
            }
        }
        if (!z) {
            return;
        }
        if (!(!StringsKt.isBlank(str))) {
            throw new IllegalArgumentException("sharedBundleName must not be blank when enabled");
        }
        int i6 = onPostMessage + 63;
        onMinimized = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 61 / 0;
        }
    }

    public static final /* synthetic */ n3 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 31;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ n3 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onPostMessage + 97;
        int i3 = i2 % 128;
        onMinimized = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        n3 n3Var = onExtraCallback;
        int i4 = i3 + 25;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return n3Var;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 93;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.asBinder;
        int i5 = i2 + 13;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        String str = this.writeTypedObject;
        int i5 = i3 + 109;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onMinimized + 81;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return this.extraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        n3 n3Var = (n3) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 33;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        String str = n3Var.IAuthTabCallbackStub;
        int i5 = i2 + 65;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final n5 asBinder() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 57;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        n5 n5Var = this.IAuthTabCallbackDefault;
        int i5 = i2 + 109;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return n5Var;
    }

    public final setClickableViews IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        setClickableViews setclickableviews = this.readTypedObject;
        int i5 = i3 + 95;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return setclickableviews;
    }

    public final onRewardedAdLoadFailed onTransact() {
        int i = 2 % 2;
        int i2 = onPostMessage + 121;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onRewardedAdLoadFailed onrewardedadloadfailed = this.onTransact;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return onrewardedadloadfailed;
    }

    public final onRewardedAdHidden IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 21;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asInterface;
        }
        throw null;
    }

    public final hbExternalSyntheticLambda13 asInterface() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 41;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        hbExternalSyntheticLambda13 hbexternalsyntheticlambda13 = this.IAuthTabCallback_Parcel;
        int i5 = i2 + 37;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return hbexternalsyntheticlambda13;
    }

    public final hbExternalSyntheticLambda7 IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 79;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        hbExternalSyntheticLambda7 hbexternalsyntheticlambda7 = this.access100;
        int i5 = i2 + 61;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return hbexternalsyntheticlambda7;
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onMinimized + 119;
        int i3 = i2 % 128;
        onPostMessage = i3;
        if (i2 % 2 != 0) {
            if (!this.asBinder) {
                return false;
            }
            int i4 = i3 + 105;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                return this.IAuthTabCallbackStubProxy && Companion.onExtraCallbackWithResult(this.extraCallbackWithResult);
            }
            throw null;
        }
        throw null;
    }

    public final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        if (!this.asBinder) {
            return false;
        }
        int i2 = onMinimized + 75;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        if (!this.getInterfaceDescriptor || !IAuthTabCallback_Parcel()) {
            return false;
        }
        int i4 = onMinimized;
        int i5 = i4 + 73;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 29;
        onPostMessage = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 103;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 24 - TextUtils.getTrimmedLength(""), 19627 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (ICustomTabsCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 59, KeyEvent.normalizeMetaState(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 24 - ExpandableListView.getPackedPositionGroup(0L), Color.alpha(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (ICustomTabsCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 59, TextUtils.indexOf((CharSequence) "", '0', 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 61;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 58, ExpandableListView.getPackedPositionType(0L) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i7 = 42 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), MotionEvent.axisFromString("") + 60, 6384 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr2);
    }

    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onTransact = 1;
        private static char[] onExtraCallbackWithResult = {32492, 32482, 32495, 32498, 32493, 32483, 32488, 32421, 32424, 32490, 32503, 32502, 32489, 32496, 32499, 32508};
        private static int onWarmupCompleted = -1184334177;
        private static boolean onNavigationEvent = true;
        private static boolean onExtraCallback = true;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final boolean onExtraCallbackWithResult(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onTransact + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            boolean z = !StringsKt.isBlank(str);
            int i4 = IAuthTabCallback + 81;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public final String onExtraCallback(@NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (!onExtraCallbackWithResult(str)) {
                throw new IllegalArgumentException("serviceBundleName must not be blank");
            }
            int i2 = IAuthTabCallback + 41;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(str, "shopping")) {
                int i4 = onTransact + 33;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-122, -112, -126, -113, -121, -123, -125, -119, -114, -115, -116, -125, -125, -121, -117, -127, -119, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
                    return ((String) objArr[0]).intern();
                }
                ViewConfiguration.getScrollDefaultDelay();
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-122, -112, -126, -113, -121, -123, -125, -119, -114, -115, -116, -125, -125, -121, -117, -127, -119, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 0, objArr2);
                return ((String) objArr2[0]).intern();
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-119, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - TextUtils.indexOf("", ""), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(str);
            String string = sb.toString();
            int i5 = IAuthTabCallback + 37;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return string;
        }

        public final n3 onWarmupCompleted() {
            n3 n3VarOnExtraCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                n3VarOnExtraCallback = n3.onExtraCallback();
                int i3 = 78 / 0;
            } else {
                n3VarOnExtraCallback = n3.onExtraCallback();
            }
            int i4 = IAuthTabCallback + 93;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return n3VarOnExtraCallback;
            }
            throw null;
        }

        public final n3 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            n3 n3VarOnNavigationEvent = n3.onNavigationEvent();
            int i4 = IAuthTabCallback + 85;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return n3VarOnNavigationEvent;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallbackWithResult;
            float f = 0.0f;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    int i4 = $10 + 111;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 76, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i3])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 77 - TextUtils.indexOf("", "", 0), 20952 - TextUtils.getOffsetBefore("", 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i3++;
                    }
                    f = 0.0f;
                }
                int i5 = $11 + 65;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (Process.myPid() >> 22) + 75, ExpandableListView.getPackedPositionType(0L) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            if (onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 63, 12214 - View.resolveSizeAndState(0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onNavigationEvent) {
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
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (-16777153) - Color.rgb(0, 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr6);
        }
    }

    static {
        readTypedObject();
        Object[] objArr = new Object[1];
        a(new char[]{1532, 31833, 63161, 26883, 58225, 26068, 56370, 22153, 51428, 17166, 50686, 16289, 46662, 10471, 41750, 9578, 40912, 5676, 34953, 767, 34141, 65463, 29090, 59481, 25250, 58629, 24435, 53725, 18483}, 31139 - Color.blue(0), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{1532, 11407, 22293, 31157, 41001, 51890, 64862, 10191, 20052, 28840, 39730, 52647, 62622, 8017, 16794, 26684, 37552, 50490, 61381, 5705, 14533, 25457, 38318, 48252, 59141, 2445, 12297, 23213, 36128, 47034}, 10613 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{1532, 11407, 22293, 31157, 41001, 51890, 64862, 10191, 20052, 28840, 39730, 52647, 62622, 8017, 16794, 26684, 37552, 50490, 61381, 5705, 14533, 25457, 38318, 48252, 59141, 2445, 12297, 23213, 36128, 47034}, (ViewConfiguration.getEdgeSlop() >> 16) + 10613, objArr3);
        onWarmupCompleted = ((String) objArr3[0]).intern();
        Companion = new onNavigationEvent(null);
        hbExternalSyntheticLambda0 hbexternalsyntheticlambda0 = hbExternalSyntheticLambda0.GraniteDefaultLoadingView;
        n6a n6aVar = n6a.NotEntered;
        onRewardedAdLoaded onrewardedadloaded = onRewardedAdLoaded.NotCreated;
        n0a n0aVar = n0a.NotRequested;
        n5 n5Var = new n5(n6aVar, onrewardedadloaded, n0aVar, false, false, hbExternalSyntheticLambda1.Ready);
        setClickableViews setclickableviews = new setClickableViews("ShoppingTabRnWarmupCompleted", "ShoppingTabRnWarmupFailed", true);
        onRewardedAdLoadFailed onrewardedadloadfailed = new onRewardedAdLoadFailed(true, true, false, false, true);
        onRewardedAdHidden onrewardedadhidden = new onRewardedAdHidden(true, true);
        hbExternalSyntheticLambda13 hbexternalsyntheticlambda13 = new hbExternalSyntheticLambda13(true, true);
        hbExternalSyntheticLambda7 hbexternalsyntheticlambda7 = new hbExternalSyntheticLambda7("ShoppingTabRnSearchEntryFallback", true);
        Object[] objArr4 = new Object[1];
        a(new char[]{1532, 26036, 50504, 9476, 33958, 58484}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24659, objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new char[]{1532, 11407, 22293, 31157, 41001, 51890, 64862, 10191, 20052, 28840, 39730, 52647, 62622, 8017, 16794, 26684, 37552, 50490, 61381, 5705, 14533, 25457, 38318, 48252, 59141, 2445, 12297, 23213, 36128, 47034}, TextUtils.indexOf("", "") + 10613, objArr5);
        n3 n3Var = new n3(true, strIntern, "shopping", ((String) objArr5[0]).intern(), 300L, hbexternalsyntheticlambda0, n5Var, setclickableviews, onrewardedadloadfailed, onrewardedadhidden, hbexternalsyntheticlambda13, true, true, hbexternalsyntheticlambda7);
        onExtraCallbackWithResult = n3Var;
        onExtraCallback = onWarmupCompleted(n3Var, false, null, null, null, 0L, hbExternalSyntheticLambda0.None, new n5(n6a.Left, onRewardedAdLoaded.Destroyed, n0aVar, false, false, hbExternalSyntheticLambda1.Fallback), setClickableViews.Companion.onExtraCallbackWithResult(), onRewardedAdLoadFailed.Companion.IAuthTabCallback(), onRewardedAdHidden.Companion.onWarmupCompleted(), hbExternalSyntheticLambda13.Companion.onWarmupCompleted(), false, false, hbExternalSyntheticLambda7.Companion.onExtraCallbackWithResult(), 14, null);
        int i = onActivityResized + 21;
        onMessageChannelReady = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        return (String) IAuthTabCallback(new Object[]{this}, 1769799668, -1769799666, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public final hbExternalSyntheticLambda0 IAuthTabCallbackDefault() {
        return (hbExternalSyntheticLambda0) IAuthTabCallback(new Object[]{this}, -443132950, 443132951, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public final long access100() {
        return ((Long) IAuthTabCallback(new Object[]{this}, 464868553, -464868553, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult())).longValue();
    }

    static void readTypedObject() {
        ICustomTabsCallback = 3503588263165984952L;
    }
}
