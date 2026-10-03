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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class asDouble {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback_Parcel;
    private static char[] access000;
    private static int access100;
    private final String IAuthTabCallback;
    private final isTransient IAuthTabCallbackDefault;
    private final isNumber IAuthTabCallbackStub;
    private final boolean asBinder;
    private final String asInterface;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final String onTransact;
    private final boolean onWarmupCompleted;
    private static final byte[] $$a = {84, -122, 19, 43};
    private static final int $$b = 68;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int extraCallback = 1;
    private static int IAuthTabCallbackStubProxy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, byte r9) {
        /*
            byte[] r0 = o.asDouble.$$a
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r9 = r9 * 4
            int r9 = r9 + 105
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asDouble.$$c(short, short, byte):java.lang.String");
    }

    static {
        access100 = 0;
        IAuthTabCallbackStubProxy();
        Companion = new onExtraCallbackWithResult(null);
        int i = IAuthTabCallbackStubProxy + 79;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i6) | i8)) | i9;
        int i11 = i3 | i2;
        int i12 = (~(i6 | i8)) | i9;
        int i13 = i3 + i2 + i4 + (1258674323 * i) + ((-126594725) * i5);
        int i14 = i13 * i13;
        int i15 = ((-1449289074) * i3) + 1954676736 + ((-212912869) * i2) + (i10 * (-1236376205)) + (i11 * (-1236376205)) + ((-1236376205) * i12) + (1609302016 * i4) + (881065984 * i) + ((-991690752) * i5) + ((-541982720) * i14);
        int i16 = ((i3 * (-1656160718)) - 817430035) + (i2 * (-1656161339)) + (i10 * 621) + (i11 * 621) + (i12 * 621) + (i4 * (-1656160097)) + (i * (-2121497779)) + (i5 * 1378977669) + (i14 * (-275906560));
        return i15 + ((i16 * i16) * (-372375552)) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = extraCallback + 59;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof asDouble)) {
            return false;
        }
        asDouble asdouble = (asDouble) obj;
        if (this.IAuthTabCallbackStub != asdouble.IAuthTabCallbackStub) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, asdouble.IAuthTabCallback)) {
            int i4 = getInterfaceDescriptor + 85;
            extraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        if ((!Intrinsics.areEqual(this.asInterface, asdouble.asInterface)) || !Intrinsics.areEqual(this.onTransact, asdouble.onTransact) || this.onExtraCallback != asdouble.onExtraCallback || this.onNavigationEvent != asdouble.onNavigationEvent) {
            return false;
        }
        if (this.onWarmupCompleted == asdouble.onWarmupCompleted) {
            return this.onExtraCallbackWithResult == asdouble.onExtraCallbackWithResult && this.asBinder == asdouble.asBinder && this.IAuthTabCallbackDefault == asdouble.IAuthTabCallbackDefault;
        }
        int i5 = getInterfaceDescriptor + 75;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.IAuthTabCallbackStub.hashCode();
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        int iHashCode3 = this.asInterface.hashCode();
        int iHashCode4 = this.onTransact.hashCode();
        int iHashCode5 = Boolean.hashCode(this.onExtraCallback);
        int iHashCode6 = Boolean.hashCode(this.onNavigationEvent);
        int iHashCode7 = Boolean.hashCode(this.onWarmupCompleted);
        int iHashCode8 = Boolean.hashCode(this.onExtraCallbackWithResult);
        int iHashCode9 = Boolean.hashCode(this.asBinder);
        isTransient istransient = this.IAuthTabCallbackDefault;
        if (istransient == null) {
            int i3 = getInterfaceDescriptor + 29;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode10 = istransient.hashCode();
            int i5 = extraCallback + 35;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode10;
        }
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + i;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        isNumber isnumber = this.IAuthTabCallbackStub;
        String str = this.IAuthTabCallback;
        String str2 = this.asInterface;
        String str3 = this.onTransact;
        boolean z = this.onExtraCallback;
        boolean z2 = this.onNavigationEvent;
        boolean z3 = this.onWarmupCompleted;
        boolean z4 = this.onExtraCallbackWithResult;
        boolean z5 = this.asBinder;
        isTransient istransient = this.IAuthTabCallbackDefault;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(25 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, new char[]{16, 14, 0, 65517, 3, 15, 16, 65500, 65535, '\r', '\n', 18, 14, 14, 65532, 65515, 65496, 65535, '\n', 3, 15, 0, '\b', 65475, 15, 7}, true, 237 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(isnumber);
        Object[] objArr2 = new Object[1];
        a(19 - View.MeasureSpec.getMode(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, new char[]{20, 24, 16, 19, 5, 65513, 2, 20, '\t', 65502, 65485, 65473, 2, 22, 21, '\t', 65521, 2, 20}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 229, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        b(false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1}, new int[]{0, 20, 0, 16}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str2);
        Object[] objArr4 = new Object[1];
        a(23 - (ViewConfiguration.getPressedStateDuration() >> 16), Process.getGidForName("") + 24, new char[]{65484, 65472, 21, 19, 5, 18, 65523, 1, '\f', 20, 65520, 1, 19, 19, 23, 15, 18, 4, 65512, 1, 19, '\b', 65501}, false, 231 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str3);
        Object[] objArr5 = new Object[1];
        b(true, new byte[]{1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{20, 27, 0, 0}, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(z);
        Object[] objArr6 = new Object[1];
        a(View.getDefaultSize(0, 0) + 31, TextUtils.indexOf("", "", 0, 0) + 14, new char[]{15, 18, 4, 65522, 5, 19, 5, 20, 65507, '\f', '\t', 3, 11, 65501, 65484, 65472, 3, 1, 14, 3, 5, '\f', 5, 4, 65506, 25, 65520, 1, 19, 19, 23}, false, 279 - AndroidCharacter.getMirror('0'), objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(z2);
        Object[] objArr7 = new Object[1];
        a(26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.getDefaultSize(0, 0) + 1, new char[]{65501, 65484, 65472, 2, '\t', 15, '\r', 5, 20, 18, '\t', 3, 65522, 5, 7, '\t', 19, 20, 5, 18, 65505, 7, 18, 5, 5, 4}, false, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 231, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(z3);
        Object[] objArr8 = new Object[1];
        a(24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{4, 15, 65514, 19, 6, 3, 14, 22, 65519, 6, 15, 16, '\t', 65521, 20, '\n', 65473, 65485, 65502, 5, 6, 5, 22, '\r'}, true, ExpandableListView.getPackedPositionChild(0L) + 231, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(z4);
        Object[] objArr9 = new Object[1];
        b(false, new byte[]{1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{47, 23, 119, 17}, objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(z5);
        Object[] objArr10 = new Object[1];
        b(false, new byte[]{0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1}, new int[]{70, 23, 0, 0}, objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(istransient);
        Object[] objArr11 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 1, -ImageFormat.getBitsPerPixel(0), new char[]{0}, true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 176, objArr11);
        sb.append(((String) objArr11[0]).intern());
        String string = sb.toString();
        int i2 = getInterfaceDescriptor + 71;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public asDouble(@NotNull isNumber isnumber, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable isTransient istransient) {
        Intrinsics.checkNotNullParameter(isnumber, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.IAuthTabCallbackStub = isnumber;
        this.IAuthTabCallback = str;
        this.asInterface = str2;
        this.onTransact = str3;
        this.onExtraCallback = z;
        this.onNavigationEvent = z2;
        this.onWarmupCompleted = z3;
        this.onExtraCallbackWithResult = z4;
        this.asBinder = z5;
        this.IAuthTabCallbackDefault = istransient;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ asDouble(isNumber isnumber, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, isTransient istransient, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        boolean z6;
        boolean z7;
        boolean z8;
        isTransient istransient2 = null;
        if ((i & 2) != 0) {
            int i2 = extraCallback + 9;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                istransient2.hashCode();
                throw null;
            }
            str4 = "";
        } else {
            str4 = str;
        }
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) == 0 ? str3 : "";
        boolean z9 = false;
        boolean z10 = (i & 16) != 0 ? false : z;
        if ((i & 32) != 0) {
            int i3 = getInterfaceDescriptor + 25;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i & 64) != 0) {
            int i5 = getInterfaceDescriptor + 125;
            extraCallback = i5 % 128;
            z7 = i5 % 2 == 0;
        } else {
            z7 = z3;
        }
        if ((i & 128) != 0) {
            int i6 = 2 % 2;
            z8 = false;
        } else {
            z8 = z4;
        }
        if ((i & 256) != 0) {
            int i7 = 2 % 2;
        } else {
            z9 = z5;
        }
        if ((i & 512) != 0) {
            int i8 = extraCallback + 111;
            getInterfaceDescriptor = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            int i9 = 2 % 2;
        } else {
            istransient2 = istransient;
        }
        this(isnumber, str4, str5, str6, z10, z6, z7, z8, z9, istransient2);
    }

    public final isNumber IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 117;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        isNumber isnumber = this.IAuthTabCallbackStub;
        int i5 = i2 + 93;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return isnumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 79;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        asDouble asdouble = (asDouble) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 7;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = asdouble.asInterface;
        if (i4 == 0) {
            int i5 = 98 / 0;
        }
        int i6 = i2 + 103;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        asDouble asdouble = (asDouble) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = asdouble.onTransact;
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return str;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 67;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i3 + 87;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return z;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 107;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i2 + 49;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i3 + 57;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asBinder;
        }
        throw null;
    }

    public final isTransient onTransact() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 37;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        isTransient istransient = this.IAuthTabCallbackDefault;
        int i5 = i2 + 121;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return istransient;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        private static char[] onWarmupCompleted = {32472, 32474, 32471, 32411, 32463, 32468, 32412, 32457, 32478, 32456, 32462, 32470, 32473, 32477, 32466, 32469, 32461, 32464, 32460, 32467};
        private static int onExtraCallbackWithResult = -1184333957;
        private static boolean onNavigationEvent = true;
        private static boolean onExtraCallback = true;

        static final class onNavigationEvent extends ContinuationImpl {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            boolean Z$0;
            boolean Z$1;
            boolean Z$2;
            int label;
            /* synthetic */ Object result;

            onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
                super(access13800Var);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return onExtraCallbackWithResult.this.onExtraCallback(null, null, false, false, false, this);
            }
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ Object onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, isNumber isnumber, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, boolean z2, boolean z3, access13800 access13800Var, int i, Object obj) {
            boolean z4;
            boolean z5;
            int i2 = 2 % 2;
            boolean z6 = (i & 4) != 0 ? false : z;
            if ((i & 8) != 0) {
                int i3 = IAuthTabCallbackStub + 101;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                z4 = false;
            } else {
                z4 = z2;
            }
            if ((i & 16) != 0) {
                int i5 = IAuthTabCallback + 71;
                int i6 = i5 % 128;
                IAuthTabCallbackStub = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 97;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                z5 = false;
            } else {
                z5 = z3;
            }
            return onextracallbackwithresult.onExtraCallback(isnumber, graniteBrownfieldModule_closeView, z6, z4, z5, access13800Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0377  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x03e9 A[Catch: all -> 0x0480, TryCatch #0 {all -> 0x0480, blocks: (B:61:0x03c0, B:63:0x03e9, B:64:0x0452, B:50:0x02be, B:52:0x02e0, B:54:0x035b, B:40:0x01c8, B:42:0x01f0, B:43:0x0259, B:31:0x0135, B:33:0x013b, B:34:0x0168), top: B:76:0x0135 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x045c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /* JADX WARN: Type inference failed for: r3v18, types: [int] */
        /* JADX WARN: Type inference failed for: r3v32 */
        /* JADX WARN: Type inference failed for: r3v36 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull o.isNumber r42, @org.jetbrains.annotations.NotNull o.GraniteBrownfieldModule_closeView r43, boolean r44, boolean r45, boolean r46, @org.jetbrains.annotations.NotNull o.access13800<? super o.asDouble> r47) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1190
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.asDouble.onExtraCallbackWithResult.onExtraCallback(o.isNumber, o.GraniteBrownfieldModule_closeView, boolean, boolean, boolean, o.access13800):java.lang.Object");
        }

        private final boolean onWarmupCompleted(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
            int i = 2 % 2;
            int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            String strTakeLast = StringsKt.takeLast((String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()), 8);
            Object obj = null;
            if (StringsKt.contains$default(graniteBrownfieldModule_closeView, StringsKt.take(strTakeLast, 4), false, 2, (Object) null)) {
                return true;
            }
            int i2 = IAuthTabCallbackStub + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strTakeLast2 = StringsKt.takeLast(strTakeLast, 4);
            if (i3 != 0) {
                if (StringsKt.contains$default(graniteBrownfieldModule_closeView, strTakeLast2, false, 5, (Object) null)) {
                    return true;
                }
            } else if (StringsKt.contains$default(graniteBrownfieldModule_closeView, strTakeLast2, false, 2, (Object) null)) {
                return true;
            }
            int i4 = IAuthTabCallback + 47;
            int i5 = i4 % 128;
            IAuthTabCallbackStub = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 31;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onWarmupCompleted;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = $10 + 57;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getCapsMode("", 0, 0) + 77, TextUtils.getOffsetBefore("", 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i7 = $11 + 71;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), Color.alpha(0) + 75, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onExtraCallback) {
                int i9 = $11 + 5;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0') + 64, 12214 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i11 = $11 + 123;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 0) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] / iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted / 0;
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i12 = $11 + 21;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] << iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 1), 63 - Color.alpha(0), 12214 - (ViewConfiguration.getFadingEdgeLength() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 63 - Color.green(0), 12214 - (ViewConfiguration.getTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                j = 0;
            }
            String str = new String(cArr6);
            int i13 = $10 + 23;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asDouble.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = access000;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 101;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Color.argb(0, 0, 0, 0) + 35, 14238 - ExpandableListView.getPackedPositionChild(j), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
                    j = 0;
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            char[] cArr5 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i11 = $10 + 21;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = $11 + 107;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 10935), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 66, View.combineMeasuredStates(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i14] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        int i15 = 36 / 0;
                    } else {
                        int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 66, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i16] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                } else {
                    int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 29, View.MeasureSpec.makeMeasureSpec(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i17] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 70, 12485 - TextUtils.lastIndexOf("", '0', 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i18 = $11 + 89;
                $10 = i18 % 128;
                int i19 = i18 % 2;
            }
            cArr4 = cArr5;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i5];
            System.arraycopy(cArr4, 0, cArr6, 0, i5);
            int i20 = i5 - i7;
            System.arraycopy(cArr6, 0, cArr4, i20, i7);
            System.arraycopy(cArr6, i7, cArr4, 0, i20);
        }
        if (z) {
            int i21 = $11 + 37;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i22 = $10 + 11;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 / trackGroupExternalSyntheticLambda0.onNavigationEvent) + 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent / 0;
                } else {
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            int i23 = $11 + 61;
            $10 = i23 % 128;
            if (i23 % 2 != 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public final String onWarmupCompleted() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1984991568, 1984991568, iOnWarmupCompleted2, new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public final String asBinder() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1020565522, -1020565521, iOnWarmupCompleted2, new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted);
    }

    static void IAuthTabCallbackStubProxy() {
        IAuthTabCallback_Parcel = 478309038;
        access000 = new char[]{27261, 27174, 27173, 27153, 27158, 27172, 27197, 27195, 27197, 27198, 27173, 27160, 27162, 27172, 27171, 27164, 27258, 27240, 27144, 27171, 27216, 27158, 27170, 27170, 27170, 27157, 27157, 27173, 27198, 27197, 27195, 27197, 27172, 27158, 27183, 27198, 27156, 27163, 27178, 27174, 27174, 27178, 27174, 27177, 27180, 27151, 27240, 27152, 27268, 27287, 27285, 27268, 27292, 27301, 27307, 27290, 27292, 27283, 27281, 27307, 27300, 27309, 27308, 27264, 27365, 27347, 27376, 27310, 27282, 27285, 27224, 27240, 27140, 27169, 27159, 27157, 27196, 27173, 27176, 27172, 27176, 27180, 27172, 27168, 27170, 27168, 27182, 27157, 27181, 27172, 27199, 27168, 27163};
    }
}
