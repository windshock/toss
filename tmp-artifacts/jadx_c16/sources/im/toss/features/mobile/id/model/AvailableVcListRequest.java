package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.AvailableVcListRequest$;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AvailableVcListRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static char[] IAuthTabCallback = null;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final String authToken;
    private final String txId;
    private final List<String> vcTypeCodes;

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableVcListRequest)) {
            return false;
        }
        AvailableVcListRequest availableVcListRequest = (AvailableVcListRequest) obj;
        if (!Intrinsics.areEqual(this.txId, availableVcListRequest.txId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.authToken, availableVcListRequest.authToken)) {
            int i4 = onExtraCallback + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.vcTypeCodes, availableVcListRequest.vcTypeCodes)) {
            return false;
        }
        int i6 = onWarmupCompleted + 85;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            this.txId.hashCode();
            this.authToken.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.txId.hashCode();
        int iHashCode2 = this.authToken.hashCode();
        List<String> list = this.vcTypeCodes;
        if (list == null) {
            int i4 = onWarmupCompleted + 71;
            onExtraCallback = i4 % 128;
            i = i4 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode3 = list.hashCode();
            int i5 = onExtraCallback + 79;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 3;
            }
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.txId;
        String str2 = this.authToken;
        List<String> list = this.vcTypeCodes;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{1, 16, 26, 30, 6, 29, 23, '\n', 15, 2, 31, '\n', '#', 20, 3, 1, 15, '\f', ' ', '\r', 20, 5, 2, 3, 14, 21, 22, 25}, (byte) (TextUtils.lastIndexOf("", '0', 0) + 124), TextUtils.lastIndexOf("", '0', 0, 0) + 29, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new char[]{3, 27, 25, 30, 3, 26, 20, 24, '\b', 15, '\n', 26}, (byte) (92 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.getTrimmedLength("") + 12, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a(new char[]{3, 27, 16, 31, 24, '\f', '\r', 15, 26, 27, 20, '\r', 22, 29}, (byte) (ExpandableListView.getPackedPositionChild(0L) + 6), 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(list);
        Object[] objArr4 = new Object[1];
        a(new char[]{13803}, (byte) (55 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1 - KeyEvent.keyCodeFromString(""), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static {
        IAuthTabCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AvailableVcListRequest$.ExternalSyntheticLambda0())};
        int i = onTransact + 81;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AvailableVcListRequest(int i, String str, String str2, List list, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallback + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 2, AvailableVcListRequest$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, AvailableVcListRequest$.serializer.INSTANCE.getDescriptor());
            }
        }
        this.txId = str;
        this.authToken = str2;
        if ((i & 4) != 0) {
            this.vcTypeCodes = list;
            int i3 = onWarmupCompleted + 125;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.vcTypeCodes = null;
        int i5 = onExtraCallback + 43;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
    }

    public AvailableVcListRequest(@NotNull String str, @NotNull String str2, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.txId = str;
        this.authToken = str2;
        this.vcTypeCodes = list;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AvailableVcListRequest availableVcListRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, availableVcListRequest.txId);
        vylVar.onExtraCallback(serialDescriptor, 1, availableVcListRequest.authToken);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onWarmupCompleted + 81;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                List<String> list = availableVcListRequest.vcTypeCodes;
                throw null;
            }
            if (availableVcListRequest.vcTypeCodes == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), availableVcListRequest.vcTypeCodes);
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return lazyArr;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        int i4 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + i4;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, 23138 - Process.getGidForName(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 27, (ViewConfiguration.getFadingEdgeLength() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i4 = 3;
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 26, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i7 = $10 + 59;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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
                        obj = obj2;
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 24824), Color.green(0) + 74, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i10 = $11 + 47;
                                $10 = i10 % 128;
                                int i11 = i10 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            } else {
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            String str = new String(cArr4);
            int i17 = $11 + 85;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            objArr[0] = str;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{64993, 64923, 64967, 64997, 65010, 64992, 64970, 65023, 64989, 64984, 64998, 64991, 64963, 64965, 64982, 64971, 64995, 64962, 64999, 64983, 65018, 64915, 64977, 64960, 64978, 65008, 64988, 64987, 64910, 64996, 64994, 64966, 64986, 64927, 64976, 64922};
        onNavigationEvent = (char) 51247;
    }
}
