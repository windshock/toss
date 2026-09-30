package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableOverridePendingTransitionNew {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int[] IAuthTabCallback_Parcel = null;
    private static int access000 = 1;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private final Integer IAuthTabCallback;
    private final Integer IAuthTabCallbackDefault;
    private final Integer IAuthTabCallbackStub;
    private final Integer asBinder;
    private final Integer asInterface;
    private final Float onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final String onTransact;
    private final Integer onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[enablePreloadClassOpt.values().length];
            try {
                iArr[enablePreloadClassOpt.KCB.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[enablePreloadClassOpt.NICE.ordinal()] = 2;
                int i2 = onExtraCallback + 85;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[enablePreloadClassOpt.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[enablePreloadClassOpt.NO_CHANGE.ordinal()] = 4;
                int i5 = onExtraCallback + 55;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            onWarmupCompleted = iArr;
        }
    }

    static {
        extraCallback();
        Companion = new IAuthTabCallback(null);
        int i = IAuthTabCallbackStubProxy + 107;
        access000 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Integer num = (Integer) objArr[2];
        Integer num2 = (Integer) objArr[3];
        Integer num3 = (Integer) objArr[4];
        Integer num4 = (Integer) objArr[5];
        Integer num5 = (Integer) objArr[6];
        Integer num6 = (Integer) objArr[7];
        Float f = (Float) objArr[8];
        Integer num7 = (Integer) objArr[9];
        String str = (String) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        Object obj = objArr[12];
        int i = 2 % 2;
        boolean z = (iIntValue & 1) != 0 ? enableoverridependingtransitionnew.onNavigationEvent : zBooleanValue;
        if ((iIntValue & 2) != 0) {
            int i2 = access100 + 93;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            num = enableoverridependingtransitionnew.onWarmupCompleted;
        }
        if ((iIntValue & 4) != 0) {
            int i4 = getInterfaceDescriptor + 125;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            num2 = enableoverridependingtransitionnew.IAuthTabCallbackStub;
        }
        if ((iIntValue & 8) != 0) {
            int i6 = getInterfaceDescriptor + 103;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                Integer num8 = enableoverridependingtransitionnew.IAuthTabCallback;
                throw null;
            }
            num3 = enableoverridependingtransitionnew.IAuthTabCallback;
        }
        if ((iIntValue & 16) != 0) {
            int i7 = access100 + 47;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            num4 = enableoverridependingtransitionnew.asInterface;
        }
        if ((iIntValue & 32) != 0) {
            num5 = enableoverridependingtransitionnew.asBinder;
        }
        if ((iIntValue & 64) != 0) {
            num6 = enableoverridependingtransitionnew.IAuthTabCallbackDefault;
        }
        if ((iIntValue & 128) != 0) {
            f = enableoverridependingtransitionnew.onExtraCallback;
        }
        if ((iIntValue & 256) != 0) {
            num7 = enableoverridependingtransitionnew.onExtraCallbackWithResult;
        }
        if ((iIntValue & 512) != 0) {
            str = enableoverridependingtransitionnew.onTransact;
        }
        return enableoverridependingtransitionnew.onNavigationEvent(z, num, num2, num3, num4, num5, num6, f, num7, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0117 A[PHI: r6
      0x0117: PHI (r6v7 java.lang.Object) = (r6v6 java.lang.Object), (r6v12 java.lang.Object) binds: [B:24:0x0114, B:21:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        Object obj;
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i3 | i2)) | (~(i4 | i2));
        int i10 = ~i4;
        int i11 = (~(i10 | i2)) | i3;
        int i12 = (~(i2 | i3 | i4)) | (~(i8 | i10));
        int i13 = i3 + i4 + i6 + ((-373584967) * i5) + ((-1711780345) * i);
        int i14 = i13 * i13;
        int i15 = (i3 * 1075882953) + 1902575616 + (1075882953 * i4) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i6) + ((-375259136) * i5) + ((-1109524480) * i) + (585564160 * i14);
        int i16 = ((i3 * 235012993) - 778813113) + (i4 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i6 * 235013625) + (i5 * 915899377) + (i * (-1709701169)) + (i14 * 1974403072);
        int i17 = i15 + (i16 * i16 * (-848756736));
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) objArr[0];
        int i18 = 2 % 2;
        int i19 = onWarmupCompleted.onWarmupCompleted[enableoverridependingtransitionnew.getInterfaceDescriptor().ordinal()];
        Object[] objArr2 = new Object[1];
        a(new int[]{494283288, -1138522258}, 1 - Color.blue(0), objArr2);
        Object objIntern = ((String) objArr2[0]).intern();
        if (i19 != 1) {
            int i20 = access100 + 41;
            int i21 = i20 % 128;
            getInterfaceDescriptor = i21;
            int i22 = i20 % 2;
            if (i19 == 2) {
                obj = enableoverridependingtransitionnew.asInterface;
                if (obj == null) {
                    int i23 = i21 + 19;
                    access100 = i23 % 128;
                    int i24 = i23 % 2;
                } else {
                    objIntern = obj;
                }
            } else if (i19 != 3) {
                int i25 = i21 + 105;
                int i26 = i25 % 128;
                access100 = i26;
                int i27 = i25 % 2;
                if (i19 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i28 = i26 + 89;
                getInterfaceDescriptor = i28 % 128;
                int i29 = i28 % 2;
                int i30 = i26 + 93;
                getInterfaceDescriptor = i30 % 128;
                int i31 = i30 % 2;
            } else {
                objIntern = enableoverridependingtransitionnew.IAuthTabCallback + "," + enableoverridependingtransitionnew.asInterface;
            }
        } else {
            obj = enableoverridependingtransitionnew.IAuthTabCallback;
            if (obj != null) {
            }
        }
        return objIntern.toString();
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableOverridePendingTransitionNew)) {
            return false;
        }
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) obj;
        if (this.onNavigationEvent != enableoverridependingtransitionnew.onNavigationEvent) {
            int i2 = access100 + 3;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, enableoverridependingtransitionnew.onWarmupCompleted)) {
            int i4 = access100 + 79;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, enableoverridependingtransitionnew.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.IAuthTabCallback, enableoverridependingtransitionnew.IAuthTabCallback) || !Intrinsics.areEqual(this.asInterface, enableoverridependingtransitionnew.asInterface)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, enableoverridependingtransitionnew.asBinder)) {
            int i6 = access100 + 31;
            getInterfaceDescriptor = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, enableoverridependingtransitionnew.IAuthTabCallbackDefault)) {
            int i7 = getInterfaceDescriptor + 39;
            access100 = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, enableoverridependingtransitionnew.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, enableoverridependingtransitionnew.onExtraCallbackWithResult)) {
            int i8 = getInterfaceDescriptor + 47;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onTransact, enableoverridependingtransitionnew.onTransact)) {
            return true;
        }
        int i10 = access100 + 77;
        getInterfaceDescriptor = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int i = 2 % 2;
        int iHashCode8 = Boolean.hashCode(this.onNavigationEvent);
        Integer num = this.onWarmupCompleted;
        if (num == null) {
            int i2 = access100 + 61;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.IAuthTabCallbackStub;
        if (num2 == null) {
            int i4 = access100 + 125;
            getInterfaceDescriptor = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = num2.hashCode();
        }
        Integer num3 = this.IAuthTabCallback;
        if (num3 == null) {
            int i5 = access100 + 99;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num3.hashCode();
        }
        Integer num4 = this.asInterface;
        if (num4 == null) {
            int i7 = getInterfaceDescriptor + 101;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = num4.hashCode();
        }
        Integer num5 = this.asBinder;
        if (num5 == null) {
            iHashCode5 = 0;
        } else {
            iHashCode5 = num5.hashCode();
            int i9 = getInterfaceDescriptor + 97;
            access100 = i9 % 128;
            int i10 = i9 % 2;
        }
        Integer num6 = this.IAuthTabCallbackDefault;
        if (num6 == null) {
            int i11 = access100 + 25;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = num6.hashCode();
        }
        Float f = this.onExtraCallback;
        if (f == null) {
            int i13 = access100 + 55;
            getInterfaceDescriptor = i13 % 128;
            int i14 = i13 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = f.hashCode();
        }
        Integer num7 = this.onExtraCallbackWithResult;
        return (((((((((((((((((iHashCode8 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num7 != null ? num7.hashCode() : 0)) * 31) + this.onTransact.hashCode();
    }

    public final enableOverridePendingTransitionNew onNavigationEvent(boolean z, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Float f, @Nullable Integer num7, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = new enableOverridePendingTransitionNew(z, num, num2, num3, num4, num5, num6, f, num7, str);
        int i2 = getInterfaceDescriptor + 115;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return enableoverridependingtransitionnew;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScoreDiff(isLoanAdsAvailable=" + this.onNavigationEvent + ", kcbScoreDiff=" + this.onWarmupCompleted + ", niceScoreDiff=" + this.IAuthTabCallbackStub + ", newKcbScore=" + this.IAuthTabCallback + ", newNiceScore=" + this.asInterface + ", originKcbScore=" + this.asBinder + ", originNiceScore=" + this.IAuthTabCallbackDefault + ", lowestInterestRates=" + this.onExtraCallback + ", loanApprovalRates=" + this.onExtraCallbackWithResult + ", tubaVariant=" + this.onTransact + ")";
        int i2 = access100 + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public enableOverridePendingTransitionNew(boolean z, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Float f, @Nullable Integer num7, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = z;
        this.onWarmupCompleted = num;
        this.IAuthTabCallbackStub = num2;
        this.IAuthTabCallback = num3;
        this.asInterface = num4;
        this.asBinder = num5;
        this.IAuthTabCallbackDefault = num6;
        this.onExtraCallback = f;
        this.onExtraCallbackWithResult = num7;
        this.onTransact = str;
    }

    public final boolean readTypedObject() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 45;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i2 + 19;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) objArr[0];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 113;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Integer num = enableoverridependingtransitionnew.onWarmupCompleted;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 75;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Integer num = this.IAuthTabCallbackStub;
        int i5 = i3 + 83;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 99;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.IAuthTabCallback;
        int i5 = i2 + 75;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 113;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.asInterface;
        int i5 = i2 + 13;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer onTransact() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 65;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.asBinder;
        int i5 = i2 + 19;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Integer asInterface() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 105;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.IAuthTabCallbackDefault;
        int i4 = i2 + 65;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 83;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Integer num = enableoverridependingtransitionnew.onExtraCallbackWithResult;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 41;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return num;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (access000()) {
            int i4 = getInterfaceDescriptor + 51;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return "Control";
        }
        String str = this.onTransact;
        int i6 = access100 + 61;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r1 == 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r1 == 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        r3 = o.enableOverridePendingTransitionNew.getInterfaceDescriptor + 59;
        o.enableOverridePendingTransitionNew.access100 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if ((r3 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r1 != 4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r1 != 4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r1 = onActivityResized();
        r2 = o.enableOverridePendingTransitionNew.getInterfaceDescriptor + 97;
        o.enableOverridePendingTransitionNew.access100 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r1 != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean access000() throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        if (StringsKt.isBlank(this.onTransact) || !(!StringsKt.contains$default(this.onTransact, "Control", false, 2, (Object) null))) {
            return true;
        }
        int i3 = getInterfaceDescriptor + 53;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            i = onWarmupCompleted.onWarmupCompleted[getInterfaceDescriptor().ordinal()];
        } else {
            i = onWarmupCompleted.onWarmupCompleted[getInterfaceDescriptor().ordinal()];
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final boolean onActivityResized() {
        float fFloatValue;
        int i = 2 % 2;
        String str = this.onTransact;
        switch (str.hashCode()) {
            case 65:
                if (str.equals("A")) {
                    Integer num = this.onExtraCallbackWithResult;
                    if (num != null) {
                        int i2 = getInterfaceDescriptor + 57;
                        access100 = i2 % 128;
                        int i3 = i2 % 2;
                        if (num.intValue() > 0) {
                            return false;
                        }
                    }
                    int i4 = access100 + 59;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
                return false;
            case 66:
                if (str.equals(LiveCheckConstants.LOAD_PHONE_LOST_ACK)) {
                    Float f = this.onExtraCallback;
                    if ((f != null ? f.floatValue() : 0.0f) > 0.0f) {
                        return false;
                    }
                    int i6 = getInterfaceDescriptor + 89;
                    access100 = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
                return false;
            case 67:
                if (str.equals("C")) {
                    Integer num2 = this.onExtraCallbackWithResult;
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        int i8 = access100 + 43;
                        int i9 = i8 % 128;
                        getInterfaceDescriptor = i9;
                        int i10 = i8 % 2;
                        if (iIntValue > 0) {
                            int i11 = i9 + 31;
                            access100 = i11 % 128;
                            int i12 = i11 % 2;
                            Float f2 = this.onExtraCallback;
                            if (f2 != null) {
                                int i13 = i9 + 111;
                                access100 = i13 % 128;
                                int i14 = i13 % 2;
                                fFloatValue = f2.floatValue();
                            } else {
                                fFloatValue = 0.0f;
                            }
                            if (fFloatValue > 0.0f) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public final enablePreloadClassOpt getInterfaceDescriptor() {
        int i = 2 % 2;
        if (IAuthTabCallbackStubProxy()) {
            int i2 = getInterfaceDescriptor + 51;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            if (ICustomTabsCallback()) {
                int i4 = getInterfaceDescriptor + 113;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                return enablePreloadClassOpt.BOTH;
            }
        }
        if (!IAuthTabCallbackStubProxy()) {
            return ICustomTabsCallback() ? enablePreloadClassOpt.NICE : enablePreloadClassOpt.NO_CHANGE;
        }
        int i6 = access100 + 9;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        enablePreloadClassOpt enablepreloadclassopt = enablePreloadClassOpt.KCB;
        int i8 = access100 + 57;
        getInterfaceDescriptor = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 3 / 0;
        }
        return enablepreloadclassopt;
    }

    public final boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = access100 + 95;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (IAuthTabCallbackStubProxy() || ICustomTabsCallback()) {
            return true;
        }
        int i3 = getInterfaceDescriptor + 91;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !writeTypedObject();
        int i4 = getInterfaceDescriptor + 109;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r2
      0x001b: PHI (r2v3 java.lang.Integer) = (r2v2 java.lang.Integer), (r2v19 java.lang.Integer) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean IAuthTabCallbackStubProxy() {
        Integer num;
        int iIntValue;
        int iIntValue2;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 5;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.asBinder;
            int i4 = 64 / 0;
            if (num != null) {
                int i5 = i2 + 89;
                access100 = i5 % 128;
                if (i5 % 2 != 0) {
                    iIntValue = num.intValue();
                    int i6 = 41 / 0;
                } else {
                    iIntValue = num.intValue();
                }
                if (iIntValue < 1000) {
                    Integer num2 = this.onWarmupCompleted;
                    if (num2 == null) {
                        int i7 = getInterfaceDescriptor + 59;
                        access100 = i7 % 128;
                        int i8 = i7 % 2;
                    } else if (num2.intValue() > 0) {
                        Integer num3 = this.IAuthTabCallback;
                        if (num3 != null) {
                            int i9 = getInterfaceDescriptor + 103;
                            access100 = i9 % 128;
                            int i10 = i9 % 2;
                            iIntValue2 = num3.intValue();
                            int i11 = getInterfaceDescriptor + 15;
                            access100 = i11 % 128;
                            int i12 = i11 % 2;
                        } else {
                            iIntValue2 = 0;
                        }
                        Integer num4 = this.onWarmupCompleted;
                        int iIntValue3 = num4 != null ? num4.intValue() : 0;
                        if (iIntValue3 > 0 && iIntValue3 < iIntValue2) {
                            int i13 = access100 + 47;
                            getInterfaceDescriptor = i13 % 128;
                            return i13 % 2 != 0;
                        }
                    }
                }
            }
        } else {
            num = this.asBinder;
            if (num != null) {
            }
        }
        return false;
    }

    public final boolean ICustomTabsCallback() {
        int iIntValue;
        int iIntValue2;
        int i = 2 % 2;
        int i2 = access100 + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.IAuthTabCallbackDefault;
        if (num == null || num.intValue() < 1000) {
            int i4 = getInterfaceDescriptor + 45;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            Integer num2 = this.IAuthTabCallbackStub;
            if (num2 != null && num2.intValue() > 0) {
                Integer num3 = this.asInterface;
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    int i6 = access100 + 35;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                    iIntValue = 0;
                }
                Integer num4 = this.IAuthTabCallbackStub;
                if (num4 != null) {
                    int i8 = getInterfaceDescriptor + 83;
                    access100 = i8 % 128;
                    if (i8 % 2 != 0) {
                        num4.intValue();
                        throw null;
                    }
                    iIntValue2 = num4.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 0 && iIntValue2 < iIntValue) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 17;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            CollectionsKt.createListBuilder();
            IAuthTabCallbackStubProxy();
            obj.hashCode();
            throw null;
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (IAuthTabCallbackStubProxy()) {
            listCreateListBuilder.add("kcb");
        }
        if (ICustomTabsCallback()) {
            int i3 = access100 + 57;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            listCreateListBuilder.add("nice");
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        int i5 = access100 + 105;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return strJoinToString$default;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String IAuthTabCallback_Parcel() throws Throwable {
        Object obj;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted.onWarmupCompleted[getInterfaceDescriptor().ordinal()];
        Object[] objArr = new Object[1];
        a(new int[]{494283288, -1138522258}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr);
        Object objIntern = ((String) objArr[0]).intern();
        if (i3 != 1) {
            int i4 = access100;
            int i5 = i4 + 51;
            int i6 = i5 % 128;
            getInterfaceDescriptor = i6;
            int i7 = i5 % 2;
            if (i3 != 2) {
                int i8 = i6 + 15;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                if (i3 == 3) {
                    objIntern = this.onWarmupCompleted + "," + this.IAuthTabCallbackStub;
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i10 = i6 + 93;
                    int i11 = i10 % 128;
                    access100 = i11;
                    int i12 = i10 % 2;
                    i = i11 + 17;
                    getInterfaceDescriptor = i % 128;
                    int i13 = i % 2;
                }
            } else {
                obj = this.IAuthTabCallbackStub;
                if (obj == null) {
                    int i14 = i4 + 99;
                    getInterfaceDescriptor = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                } else {
                    objIntern = obj;
                }
            }
        } else {
            obj = this.onWarmupCompleted;
            if (obj == null) {
                i = getInterfaceDescriptor + 125;
                access100 = i % 128;
                int i132 = i % 2;
            }
            objIntern = obj;
        }
        return objIntern.toString();
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback_Parcel;
        float f = 0.0f;
        int i4 = -1469660336;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i5 = $11 + 121;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 4;
            }
            int i7 = 0;
            while (i7 < length2) {
                int i8 = $11 + 113;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (-16777144) - Color.rgb(0, 0, 0), 8849 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i7 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 73, 8848 - Color.green(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                int i9 = $10 + 49;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i2 = 2;
                f = 0.0f;
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = IAuthTabCallback_Parcel;
        if (iArr6 != null) {
            int i11 = $10 + 15;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i12 = 0;
            while (i12 < length) {
                Object[] objArr4 = {Integer.valueOf(iArr6[i12])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 72, 8848 - (ViewConfiguration.getLongPressTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i12++;
                i4 = -1469660336;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $10 + 113;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $10 + 71;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i15];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - ImageFormat.getBitsPerPixel(0)), 39 - (ViewConfiguration.getPressedStateDuration() >> 16), 10301 - (ViewConfiguration.getLongPressTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
            }
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Color.green(0) + 78, 7398 - (ViewConfiguration.getEdgeSlop() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static /* synthetic */ enableOverridePendingTransitionNew IAuthTabCallback(enableOverridePendingTransitionNew enableoverridependingtransitionnew, boolean z, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Float f, Integer num7, String str, int i, Object obj) {
        Object[] objArr = {enableoverridependingtransitionnew, Boolean.valueOf(z), num, num2, num3, num4, num5, num6, f, num7, str, Integer.valueOf(i), obj};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (enableOverridePendingTransitionNew) onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -106999365, 106999368, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback2, objArr);
    }

    public final Integer onExtraCallback() {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Integer) onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -1984884629, 1984884629, iIAuthTabCallback3, iIAuthTabCallback2, new Object[]{this});
    }

    public final Integer onNavigationEvent() {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Integer) onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -1422657423, 1422657424, iIAuthTabCallback3, iIAuthTabCallback2, new Object[]{this});
    }

    public final String access100() {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (String) onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -612393359, 612393361, iIAuthTabCallback3, iIAuthTabCallback2, new Object[]{this});
    }

    static void extraCallback() {
        IAuthTabCallback_Parcel = new int[]{-1004920954, 781401564, 1715773769, 93415910, -775607662, -1526730472, -1167554523, -573052674, -827395944, -123912879, 2123397962, 693927625, 145301754, 2040171730, 1057683823, -1937078043, 1399295527, 417725076};
    }
}
