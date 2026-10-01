package im.toss.securities.widget.overview.ui.small.model;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.securities.widget.data.model.overview.WidgetOverview;
import im.toss.securities.widget.data.model.overview.WidgetOverview$Overview$$serializer;
import im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.HostnamesKt;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewSmallWidgetState$Success$$serializer implements aeu2<OverviewSmallWidgetState.Success> {
    public static final int $stable;
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final OverviewSmallWidgetState$Success$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {34, -66, 77, 18};
    private static final int $$b = 184;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = (i2 * 2) + 1;
        int i6 = 115 - (s * 3);
        int i7 = i + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i6 += i7;
            i7 = i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i9 = i7 + 1;
            if (i4 == i5) {
                return new String(bArr2, 0);
            }
            i8 = i9;
            i7 = bArr[i9];
            i6 += i7;
            i7 = i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i92 = i7 + 1;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i922 = i7 + 1;
            if (i4 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 39;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 21;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallbackDefault = 0;
        onNavigationEvent();
        OverviewSmallWidgetState$Success$$serializer overviewSmallWidgetState$Success$$serializer = new OverviewSmallWidgetState$Success$$serializer();
        INSTANCE = overviewSmallWidgetState$Success$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("Success", overviewSmallWidgetState$Success$$serializer, 11);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a((short) ((-94) - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) ((-1) - KeyEvent.keyCodeFromString("")), 454389909 - Color.rgb(0, 0, 0), (-561302426) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-51) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("accountKey", false);
        setanimationsloop.onWarmupCompleted("overview", false);
        setanimationsloop.onWarmupCompleted("formattedTime", false);
        setanimationsloop.onWarmupCompleted("bitmaps", false);
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 112), (byte) (18 - TextUtils.lastIndexOf("", '0', 0, 0)), 454389913 - Color.rgb(0, 0, 0), (-561302424) - Color.argb(0, 0, 0, 0), (-49) - ExpandableListView.getPackedPositionChild(0L), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("includeExpense", false);
        setanimationsloop.onWarmupCompleted("showAmount", false);
        setanimationsloop.onWarmupCompleted("userName", false);
        setanimationsloop.onWarmupCompleted("userMode", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 117;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private OverviewSmallWidgetState$Success$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        Lazy[] lazyArr = (Lazy[]) OverviewSmallWidgetState.Success.onExtraCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 462844251, PushInfo.Companion.onExtraCallback(), -462844250, iOnExtraCallback, new Object[0]);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {lazyArr[0].getValue(), dj3.onWarmupCompleted, sp.IAuthTabCallback(getwrigglelayout), WidgetOverview$Overview$$serializer.INSTANCE, getwrigglelayout, lazyArr[5].getValue(), lazyArr[6].getValue(), getbgcolor, getbgcolor, sp.IAuthTabCallback(getwrigglelayout), lazyArr[10].getValue()};
        int i4 = asInterface + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewSmallWidgetState.Success deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        boolean zOnExtraCallbackWithResult2;
        String str;
        String str2;
        HostnamesKt hostnamesKt;
        float f;
        WidgetOverview.Overview overview;
        List list;
        Currency currency;
        int i;
        String str3;
        DisplaySetting displaySetting;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        Lazy[] lazyArr = (Lazy[]) OverviewSmallWidgetState.Success.onExtraCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 462844251, PushInfo.Companion.onExtraCallback(), -462844250, iOnExtraCallback, new Object[0]);
        int i3 = 9;
        int i4 = 8;
        int i5 = 10;
        String str4 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            float fOnWarmupCompleted = 0.0f;
            int i6 = 0;
            zOnExtraCallbackWithResult = false;
            zOnExtraCallbackWithResult2 = false;
            boolean z = true;
            WidgetOverview.Overview overview2 = null;
            List list2 = null;
            HostnamesKt hostnamesKt2 = null;
            Currency currency2 = null;
            String str5 = null;
            String strAsInterface = null;
            DisplaySetting displaySetting2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        i4 = 8;
                        z = false;
                    case 0:
                        displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr[0].getValue(), displaySetting2);
                        i6 |= 1;
                        int i7 = asBinder + 81;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        str5 = str5;
                        i3 = 9;
                        i4 = 8;
                        i5 = 10;
                    case 1:
                        i6 |= 2;
                        fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i3 = 9;
                        i5 = 10;
                    case 2:
                        i6 |= 4;
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                        i3 = 9;
                        i5 = 10;
                    case 3:
                        overview2 = (WidgetOverview.Overview) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, WidgetOverview$Overview$$serializer.INSTANCE, overview2);
                        i6 |= 8;
                        i5 = 10;
                    case 4:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i6 |= 16;
                        i5 = 10;
                    case 5:
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArr[5].getValue(), list2);
                        i6 |= 32;
                        i5 = 10;
                    case 6:
                        currency2 = (Currency) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArr[6].getValue(), currency2);
                        i6 |= 64;
                    case 7:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7);
                        i6 |= 128;
                    case 8:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4);
                        i6 |= 256;
                    case 9:
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str4);
                        i6 |= 512;
                    case 10:
                        hostnamesKt2 = (HostnamesKt) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i5, (jp) lazyArr[i5].getValue(), hostnamesKt2);
                        i6 |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            overview = overview2;
            list = list2;
            f = fOnWarmupCompleted;
            hostnamesKt = hostnamesKt2;
            currency = currency2;
            displaySetting = displaySetting2;
            i = i6;
            str2 = str5;
            str = str4;
            str3 = strAsInterface;
        } else {
            int i9 = asBinder + 53;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            DisplaySetting displaySetting3 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr[0].getValue(), (Object) null);
            float fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            WidgetOverview.Overview overview3 = (WidgetOverview.Overview) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, WidgetOverview$Overview$$serializer.INSTANCE, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            List list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArr[5].getValue(), (Object) null);
            Currency currency3 = (Currency) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArr[6].getValue(), (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7);
            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            str2 = str6;
            hostnamesKt = (HostnamesKt) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 10, (jp) lazyArr[10].getValue(), (Object) null);
            f = fOnWarmupCompleted2;
            overview = overview3;
            list = list3;
            currency = currency3;
            i = 2047;
            str3 = strAsInterface2;
            displaySetting = displaySetting3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewSmallWidgetState.Success(i, displaySetting, f, str2, overview, str3, list, currency, zOnExtraCallbackWithResult, zOnExtraCallbackWithResult2, str, hostnamesKt, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m81deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewSmallWidgetState.Success success) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(success, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
            OverviewSmallWidgetState.Success.onExtraCallback(iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), -2027997339, iOnExtraCallback3, 2027997341, iOnExtraCallback, new Object[]{success, vylVarOnExtraCallback, serialDescriptor});
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(success, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        int iOnExtraCallback4 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback5 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback6 = PushInfo.Companion.onExtraCallback();
        OverviewSmallWidgetState.Success.onExtraCallback(iOnExtraCallback5, PushInfo.Companion.onExtraCallback(), -2027997339, iOnExtraCallback6, 2027997341, iOnExtraCallback4, new Object[]{success, vylVarOnExtraCallback2, serialDescriptor2});
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewSmallWidgetState.Success) obj);
        int i4 = asBinder + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = asInterface + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int length;
        byte[] bArr;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j2 = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - ExpandableListView.getPackedPositionGroup(0L)), 42 - View.combineMeasuredStates(0, 0), 22439 - View.MeasureSpec.getSize(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr2 = onWarmupCompleted;
                if (bArr2 != null) {
                    int i6 = $10 + 107;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 12843);
                                int iRgb = Color.rgb(0, 0, 0) + 16777271;
                                int i8 = (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 2168;
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 - 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cCombineMeasuredStates, iRgb, i8, -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i7++;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 43424), View.MeasureSpec.getMode(0) + 42, 22438 - TextUtils.lastIndexOf("", '0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j)) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 86 - KeyEvent.getDeadChar(0, 0), 9567 - ExpandableListView.getPackedPositionType(0L), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int i9 = $10 + 101;
                    int i10 = i9 % 128;
                    $11 = i10;
                    int i11 = i9 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i12 = i10 + 97;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 3 / 4;
                    }
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    int i15 = $11 + 43;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onNavigationEvent() {
        onNavigationEvent = 1202542435;
        onExtraCallback = -1538795472;
        onExtraCallbackWithResult = -2060250125;
        onWarmupCompleted = new byte[]{107, 108, 80, 89, -99, 126, -94, 120, -85, 118, -103, 8, 8};
    }
}
