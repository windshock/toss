package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getUseDynamicPlugins {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallbackStubProxy = 32617;
    private static char access000 = 42818;
    private static char getInterfaceDescriptor = 18614;
    private static int onActivityLayout = 1;
    private static int onActivityResized = 0;
    private static char writeTypedObject = 26684;
    private final String IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final long IAuthTabCallback_Parcel;
    private final String access100;
    private final String asBinder;
    private final long asInterface;
    private final String onExtraCallback;
    private final JsonObject onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final float onWarmupCompleted;
    private static char[] extraCallbackWithResult = {32763, 32719, 32570, 32514, 32573, 32524, 32519, 32526, 32569, 32563, 32742, 32515, 32746, 32568, 32572, 32529, 32518, 32575, 32571, 32516, 32537, 32562, 32538, 32710};
    private static int ICustomTabsCallback = -1184333905;
    private static boolean readTypedObject = true;
    private static boolean extraCallback = true;

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i));
        int i12 = (~(i | i7)) | (~(i8 | i10));
        int i13 = ~(i4 | i6);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i4 + i6 + i5 + ((-1585779005) * i3) + (640148872 * i2);
        int i17 = i16 * i16;
        int i18 = (i4 * 308833806) + 153878528 + (308833806 * i6) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i5) + (1159200768 * i3) + ((-734003200) * i2) + (2089549824 * i17);
        int i19 = (i4 * (-1291220770)) + 263398195 + (i6 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i5 * (-1291221671)) + (i3 * (-1079815989)) + (i2 * 669414472) + (i17 * 145489920);
        return i18 + ((i19 * i19) * (-1699479552)) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onActivityLayout + 51;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getUseDynamicPlugins)) {
            int i4 = onActivityLayout + 25;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        getUseDynamicPlugins getusedynamicplugins = (getUseDynamicPlugins) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, getusedynamicplugins.onExtraCallback)) {
            int i6 = onActivityLayout + 25;
            onActivityResized = i6 % 128;
            return i6 % 2 != 0;
        }
        if (this.asInterface != getusedynamicplugins.asInterface) {
            int i7 = onActivityResized + 107;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, getusedynamicplugins.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.onTransact, getusedynamicplugins.onTransact)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, getusedynamicplugins.onNavigationEvent)) {
            int i9 = onActivityResized + 125;
            onActivityLayout = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, getusedynamicplugins.IAuthTabCallback) || (!Intrinsics.areEqual(this.access100, getusedynamicplugins.access100))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, getusedynamicplugins.asBinder)) {
            int i11 = onActivityResized + 97;
            onActivityLayout = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Float.compare(this.onWarmupCompleted, getusedynamicplugins.onWarmupCompleted) != 0) {
            return false;
        }
        if (this.IAuthTabCallback_Parcel == getusedynamicplugins.IAuthTabCallback_Parcel) {
            return this.IAuthTabCallbackDefault == getusedynamicplugins.IAuthTabCallbackDefault && !(Intrinsics.areEqual(this.onExtraCallbackWithResult, getusedynamicplugins.onExtraCallbackWithResult) ^ true);
        }
        int i13 = onActivityLayout + 43;
        onActivityResized = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 29;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((this.onExtraCallback.hashCode() * 31) + Long.hashCode(this.asInterface)) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.access100.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Long.hashCode(this.IAuthTabCallback_Parcel)) * 31) + Boolean.hashCode(this.IAuthTabCallbackDefault)) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = onActivityLayout + 57;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.onExtraCallback;
        long j = this.asInterface;
        String str2 = this.IAuthTabCallbackStub;
        String str3 = this.onTransact;
        String str4 = this.onNavigationEvent;
        String str5 = this.IAuthTabCallback;
        String str6 = this.access100;
        String str7 = this.asBinder;
        float f = this.onWarmupCompleted;
        long j2 = this.IAuthTabCallback_Parcel;
        boolean z = this.IAuthTabCallbackDefault;
        JsonObject jsonObject = this.onExtraCallbackWithResult;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{62317, 33371, 63892, 11020, 22248, 1036, 633, 16629, 22015, 53589, 37496, 31908, 25578, 21386, 52114, 40737, 64844, 38474, 30046, 5682}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        b(null, new byte[]{-115, -116, -117, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(j);
        Object[] objArr3 = new Object[1];
        a(new char[]{2, 64114, 11835, 64403, 22270, 53327, 30703, 10341, 17573, 8008, 11835, 64403, 28736, 9925, 44961, 3909, 18814, 39760}, 18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str2);
        Object[] objArr4 = new Object[1];
        b(null, new byte[]{-115, -119, -114, -111, -113, -123, -124, -112, -113, -114, -126, -127}, null, 127 - TextUtils.getCapsMode("", 0, 0), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str3);
        Object[] objArr5 = new Object[1];
        b(null, new byte[]{-115, -116, -117, -119, -114, -111, -118, -120, -122, -111, -109, -110, -110, -120, -126, -127}, null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(str4);
        Object[] objArr6 = new Object[1];
        a(new char[]{2, 64114, 15262, 62853, 46866, 26688, 25386, 10439, 3361, 29970, 22248, 1036, 36119, 18104}, ExpandableListView.getPackedPositionChild(0L) + 14, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(str5);
        Object[] objArr7 = new Object[1];
        b(null, new byte[]{-115, -119, -114, -111, -113, -123, -124, -112, -108, -116, -113, -126, -127}, null, ExpandableListView.getPackedPositionType(0L) + 127, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(str6);
        Object[] objArr8 = new Object[1];
        b(null, new byte[]{-115, -124, -125, -120, -107, -113, -114, -126, -127}, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(str7);
        Object[] objArr9 = new Object[1];
        a(new char[]{2, 64114, 17218, 24556, 52088, 47109, 5098, 55404, 8580, 61598, 38157, 41983, 36119, 18104}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(f);
        Object[] objArr10 = new Object[1];
        b(null, new byte[]{-115, -113, -111, -109, -109, -111, -105, -124, -125, -111, -118, -110, -106, -126, -127}, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(j2);
        Object[] objArr11 = new Object[1];
        a(new char[]{2, 64114, 8451, 56122, 33221, 38176, 10646, 28877, 30765, 60359, 6387, 18108, 9659, 56448, 27134, 32065, 15823, 43746, 245, 16814, 36119, 18104}, (ViewConfiguration.getEdgeSlop() >> 16) + 21, objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(z);
        Object[] objArr12 = new Object[1];
        a(new char[]{2, 64114, 24770, 43135, 9357, 48181, 29078, 19881, 46166, 55863, 20171, 61089, 27452, 54071, 20171, 61089, 36119, 18104}, 16 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr12);
        sb.append(((String) objArr12[0]).intern());
        sb.append(jsonObject);
        Object[] objArr13 = new Object[1];
        b(null, new byte[]{-104}, null, Color.argb(0, 0, 0, 0) + 127, objArr13);
        sb.append(((String) objArr13[0]).intern());
        String string = sb.toString();
        int i2 = onActivityLayout + 115;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public getUseDynamicPlugins(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, float f, long j2, boolean z, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.onExtraCallback = str;
        this.asInterface = j;
        this.IAuthTabCallbackStub = str2;
        this.onTransact = str3;
        this.onNavigationEvent = str4;
        this.IAuthTabCallback = str5;
        this.access100 = str6;
        this.asBinder = str7;
        this.onWarmupCompleted = f;
        this.IAuthTabCallback_Parcel = j2;
        this.IAuthTabCallbackDefault = z;
        this.onExtraCallbackWithResult = jsonObject;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getUseDynamicPlugins getusedynamicplugins = (getUseDynamicPlugins) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 71;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        String str = getusedynamicplugins.onExtraCallback;
        int i5 = i2 + 29;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 81;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        long j = this.asInterface;
        int i5 = i2 + 101;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return j;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 99;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallbackStub;
        int i5 = i2 + 13;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getUseDynamicPlugins getusedynamicplugins = (getUseDynamicPlugins) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 43;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String str = getusedynamicplugins.onTransact;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 47;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i2 + 123;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 115;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String str = this.access100;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 21;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asBinder;
        int i5 = i2 + 35;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onActivityResized + 103;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        float f = this.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return f;
    }

    public final long IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onActivityResized + 65;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback_Parcel;
        }
        throw null;
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 109;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    public final JsonObject onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 99;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        JsonObject jsonObject = this.onExtraCallbackWithResult;
        int i5 = i2 + 1;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return jsonObject;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 1;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (access000 ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(writeTypedObject);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iArgb = Color.argb(i3, i3, i3, i3) + 10;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iArgb, touchSlop, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStubProxy ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getInterfaceDescriptor)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 10, KeyEvent.normalizeMetaState(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16014), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, 19901 - (ViewConfiguration.getEdgeSlop() >> 16), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i10 = $11 + 51;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = extraCallbackWithResult;
        char c = '0';
        if (cArr3 != null) {
            int i3 = $11 + 125;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", c, 0, 0) + 78, KeyEvent.getDeadChar(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(ICustomTabsCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), '{' - AndroidCharacter.getMirror('0'), 16037 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (extraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $11 + 47;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(j) + 1), 63 - KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0') + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    j = 0;
                }
                String str = new String(cArr5);
                int i8 = $10 + 113;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                objArr[0] = str;
                return;
            }
            if (!readTypedObject) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i10 = $10 + 49;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i12 = $10 + 37;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            int i13 = $10 + 109;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 3 % 5;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i15 = $11 + 13;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] * iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), TextUtils.lastIndexOf("", '0') + 64, View.resolveSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 63, KeyEvent.normalizeMetaState(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final String IAuthTabCallback() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (String) onNavigationEvent(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, -1980299177, iOnWarmupCompleted2, 1980299177);
    }

    public final String IAuthTabCallbackStub() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (String) onNavigationEvent(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, 835988058, iOnWarmupCompleted2, -835988057);
    }
}
