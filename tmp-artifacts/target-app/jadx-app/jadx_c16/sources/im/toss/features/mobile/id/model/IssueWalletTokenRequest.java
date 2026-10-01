package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.IssueWalletTokenRequest$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class IssueWalletTokenRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;
    private final String authCode;
    private final String tempToken;

    static {
        onExtraCallbackWithResult();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onExtraCallbackWithResult + 121;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 95;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof IssueWalletTokenRequest)) {
            return false;
        }
        IssueWalletTokenRequest issueWalletTokenRequest = (IssueWalletTokenRequest) obj;
        if (!Intrinsics.areEqual(this.tempToken, issueWalletTokenRequest.tempToken)) {
            return false;
        }
        if (Intrinsics.areEqual(this.authCode, issueWalletTokenRequest.authCode)) {
            return true;
        }
        int i6 = asBinder + 59;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 1;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.tempToken.hashCode();
        String str = this.authCode;
        if (str == null) {
            int i5 = IAuthTabCallbackStub + 109;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i7 = IAuthTabCallbackStub + 15;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 4;
            }
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.tempToken;
        String str2 = this.authCode;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{44656, 40385, 39667, 42475, 2610, 22718, 18841, 27735, 38920, 49988, 42965, 36700, 2969, 29542, 60588, 10186, 46872, 45832, 9944, 752, 37317, 9170, 44872, 42049, 13655, 17732, 8666, 25063, 42077, 57643, 24124, 49462, 38659, 28237}, 34 - View.getDefaultSize(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new char[]{27743, 13954, 2945, 26649, 36313, 26370, 42727, 15865, 41853, 20660, 61640, 3848}, 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a(new char[]{13697, 31789}, Color.rgb(0, 0, 0) + 16777217, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = asBinder + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ IssueWalletTokenRequest(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = IAuthTabCallbackStub + 19;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, IssueWalletTokenRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.tempToken = str;
        this.authCode = str2;
    }

    public IssueWalletTokenRequest(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tempToken = str;
        this.authCode = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(IssueWalletTokenRequest issueWalletTokenRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, issueWalletTokenRequest.tempToken);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, issueWalletTokenRequest.authCode);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, issueWalletTokenRequest.tempToken);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, issueWalletTokenRequest.authCode);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $10 + 81;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3) + 10;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i3) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), iMakeMeasureSpec, bitsPerPixel, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, ((Process.getThreadPriority(0) + 20) >> 6) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i10 = $10 + 55;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 16014), 13 - ExpandableListView.getPackedPositionChild(0L), 19901 - KeyEvent.keyCodeFromString(""), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = (char) 8468;
        onNavigationEvent = (char) 47277;
        IAuthTabCallback = (char) 55841;
        onExtraCallback = (char) 37451;
    }
}
