package im.toss.features.home.core.local.model.dst.element;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.HomeListHeaderLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.BadgeLocal;
import im.toss.features.home.core.local.model.dst.widget.BadgeLocal$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ExtHubNodeBinder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListHeaderLocal$$serializer implements aeu2<HomeListHeaderLocal> {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final HomeListHeaderLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = i * 2;
        int i5 = 3 - (b * 3);
        int i6 = 115 - (s * 3);
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            i5 += -i6;
            i3 = i8;
            i2 = i9;
            bArr2[i2] = (byte) i5;
            if (i2 == i7) {
                return new String(bArr2, 0);
            }
            int i10 = i3 + 1;
            int i11 = i2 + 1;
            i8 = i10;
            i6 = bArr[i10];
            i9 = i11;
            i5 += -i6;
            i3 = i8;
            i2 = i9;
            bArr2[i2] = (byte) i5;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i3 = i5;
            i5 = i6;
            bArr2[i2] = (byte) i5;
            if (i2 == i7) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 33;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallbackDefault = 0;
        onWarmupCompleted();
        HomeListHeaderLocal$$serializer homeListHeaderLocal$$serializer = new HomeListHeaderLocal$$serializer();
        INSTANCE = homeListHeaderLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeListHeaderLocal", homeListHeaderLocal$$serializer, 12);
        setanimationsloop.onWarmupCompleted("titleType", false);
        Object[] objArr = new Object[1];
        a((short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) (TextUtils.getOffsetBefore("", 0) + 37), 1009491419 + TextUtils.lastIndexOf("", '0', 0, 0), (KeyEvent.getMaxKeyCode() >> 16) - 274181085, (-94) - MotionEvent.axisFromString(""), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("titleAlt", false);
        setanimationsloop.onWarmupCompleted("logTitleAlt", false);
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.indexOf("", "", 0, 0), (byte) (115 - Process.getGidForName("")), 1009491422 - View.resolveSize(0, 0), 21586 - AndroidCharacter.getMirror('0'), ImageFormat.getBitsPerPixel(0) - 89, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("subtitleAlt", false);
        setanimationsloop.onWarmupCompleted("logSubtitleAlt", false);
        setanimationsloop.onWarmupCompleted("right", false);
        setanimationsloop.onWarmupCompleted("arrow", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("titleBadge", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private HomeListHeaderLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {HomeListHeaderLocal.onWarmupCompleted()[0].getValue(), getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(ExtHubNodeBinder.onExtraCallback), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), sp.IAuthTabCallback(BadgeLocal$.serializer.INSTANCE), PaddingLocal$$serializer.INSTANCE};
        int i4 = onTransact + 37;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeListHeaderLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HomeListHeaderLocal.onNavigationEvent onnavigationevent;
        String str;
        String str2;
        HandlerLocal handlerLocal;
        HomeListHeaderLocal.Right right;
        BadgeLocal badgeLocal;
        PaddingLocal paddingLocal;
        String str3;
        String str4;
        boolean z;
        String str5;
        int i;
        String str6;
        int i2;
        int i3 = 2 % 2;
        int i4 = onTransact + 15;
        asBinder = i4 % 128;
        String str7 = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            HomeListHeaderLocal.onWarmupCompleted();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            str7.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = HomeListHeaderLocal.onWarmupCompleted();
        int i5 = 9;
        int i6 = 8;
        int i7 = 0;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            int i8 = asBinder + 5;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            HomeListHeaderLocal.onNavigationEvent onnavigationevent2 = (HomeListHeaderLocal.onNavigationEvent) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 1);
            String strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str8 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str9 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str10 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            HomeListHeaderLocal.Right right2 = (HomeListHeaderLocal.Right) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, ExtHubNodeBinder.onExtraCallback, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 9, setAppxVersionInWorker.onExtraCallback, (Object) null);
            BadgeLocal badgeLocal2 = (BadgeLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 10, BadgeLocal$.serializer.INSTANCE, (Object) null);
            PaddingLocal paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 11, PaddingLocal$$serializer.INSTANCE, (Object) null);
            int i10 = asBinder + 25;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            paddingLocal = paddingLocal2;
            str3 = str11;
            handlerLocal = handlerLocal2;
            right = right2;
            z = zOnExtraCallbackWithResult;
            str5 = str8;
            badgeLocal = badgeLocal2;
            str = str9;
            str2 = str10;
            onnavigationevent = onnavigationevent2;
            i = 4095;
            str4 = strAsInterface;
            str6 = strAsInterface2;
        } else {
            String str12 = null;
            String str13 = null;
            String strAsInterface3 = null;
            HandlerLocal handlerLocal3 = null;
            HomeListHeaderLocal.Right right3 = null;
            BadgeLocal badgeLocal3 = null;
            PaddingLocal paddingLocal3 = null;
            HomeListHeaderLocal.onNavigationEvent onnavigationevent3 = null;
            String strAsInterface4 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z2 = true;
            String str14 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i6 = 8;
                    case 0:
                        onnavigationevent3 = (HomeListHeaderLocal.onNavigationEvent) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), onnavigationevent3);
                        i7 |= 1;
                        i5 = 9;
                        i6 = 8;
                    case 1:
                        strAsInterface4 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 1);
                        i7 |= 2;
                        i5 = 9;
                        i6 = 8;
                    case 2:
                        strAsInterface3 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
                        i7 |= 4;
                        int i12 = asBinder + 51;
                        onTransact = i12 % 128;
                        int i13 = i12 % 2;
                        i5 = 9;
                        i6 = 8;
                    case 3:
                        i2 = i6;
                        str13 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str13);
                        i7 |= 8;
                        i6 = i2;
                        i5 = 9;
                    case 4:
                        i2 = i6;
                        str12 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str12);
                        i7 |= 16;
                        i6 = i2;
                        i5 = 9;
                    case 5:
                        i2 = i6;
                        str7 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str7);
                        i7 |= 32;
                        i6 = i2;
                        i5 = 9;
                    case 6:
                        i2 = i6;
                        str14 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str14);
                        i7 |= 64;
                        i6 = i2;
                        i5 = 9;
                    case 7:
                        right3 = (HomeListHeaderLocal.Right) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, ExtHubNodeBinder.onExtraCallback, right3);
                        i7 |= 128;
                        i5 = 9;
                        i6 = i6;
                    case 8:
                        int i14 = i6;
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i14);
                        i7 |= 256;
                        i6 = i14;
                    case 9:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i5, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i7 |= 512;
                        i6 = 8;
                    case 10:
                        badgeLocal3 = (BadgeLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 10, BadgeLocal$.serializer.INSTANCE, badgeLocal3);
                        i7 |= 1024;
                        i6 = 8;
                    case 11:
                        paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 11, PaddingLocal$$serializer.INSTANCE, paddingLocal3);
                        i7 |= 2048;
                        i6 = 8;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            onnavigationevent = onnavigationevent3;
            str = str12;
            str2 = str7;
            handlerLocal = handlerLocal3;
            right = right3;
            badgeLocal = badgeLocal3;
            paddingLocal = paddingLocal3;
            str3 = str14;
            str4 = strAsInterface4;
            z = zOnExtraCallbackWithResult2;
            str5 = str13;
            i = i7;
            str6 = strAsInterface3;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListHeaderLocal(i, onnavigationevent, str4, str6, str5, str, str2, str3, right, z, handlerLocal, badgeLocal, paddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m388deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        HomeListHeaderLocal homeListHeaderLocalDeserialize = deserialize(decoder);
        int i3 = asBinder + 73;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 75 / 0;
        }
        return homeListHeaderLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListHeaderLocal homeListHeaderLocal) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeListHeaderLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListHeaderLocal.onWarmupCompleted(homeListHeaderLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 121;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListHeaderLocal) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = asBinder + 97;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43424), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, View.MeasureSpec.getSize(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 43;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                int i8 = $11 + 121;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                z = false;
            }
            if (z) {
                int i10 = $10 + 69;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, (Process.myPid() >> 22) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, 22438 - TextUtils.lastIndexOf("", '0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i13 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j));
                if (z) {
                    int i14 = $10 + 89;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 86 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                int i17 = $11 + 5;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 1737734702;
        onExtraCallbackWithResult = -1538795414;
        IAuthTabCallback = -1273990055;
        onExtraCallback = new byte[]{-44, -43, 38, -40, -123, -124, 119, -119, 110, -111, 126, 8, 8};
    }
}
