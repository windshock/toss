package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BleConfig {
    public static final Companion Companion;
    private static char IAuthTabCallback;
    private static int asInterface;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;
    private final AdvertiserConfig advertiser;
    private final boolean isEnabled;
    private final double proximityAndroidPathLossExponent;
    private final double proximityAndroidReferenceRssiAtOneMeter;
    private final double proximityApproachThresholdMeters;
    private final double proximityDistanceUnitMeters;
    private final double proximityFinalThresholdMeters;
    private final double proximityIosPathLossExponent;
    private final double proximityIosReferenceRssiAtOneMeter;
    private final boolean proximityThresholdEnabled;
    private final ScannerConfig scanner;
    private static final byte[] $$a = {23, -38, -83, 70};
    private static final int $$b = 192;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    private static String $$c(short s, byte b, byte b2) {
        ?? r7 = 105 - (b2 * 4);
        int i = s * 2;
        byte[] bArr = $$a;
        int i2 = 3 - (b * 2);
        byte[] bArr2 = new byte[i + 1];
        int i3 = -1;
        byte b3 = r7;
        if (bArr == null) {
            b3 = i2 + r7;
            i2 = i2;
        }
        while (true) {
            i3++;
            int i4 = i2 + 1;
            bArr2[i3] = b3;
            if (i3 == i) {
                return new String(bArr2, 0);
            }
            b3 += bArr[i4];
            i2 = i4;
        }
    }

    static {
        asInterface = 0;
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        int i = IAuthTabCallbackStub + 71;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public BleConfig() {
        this((ScannerConfig) null, (AdvertiserConfig) null, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 2047, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleConfig)) {
            return false;
        }
        BleConfig bleConfig = (BleConfig) obj;
        if (!Intrinsics.areEqual(this.scanner, bleConfig.scanner)) {
            int i2 = IAuthTabCallbackDefault + 41;
            asBinder = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.advertiser, bleConfig.advertiser) || this.isEnabled != bleConfig.isEnabled || Double.compare(this.proximityApproachThresholdMeters, bleConfig.proximityApproachThresholdMeters) != 0 || Double.compare(this.proximityDistanceUnitMeters, bleConfig.proximityDistanceUnitMeters) != 0) {
            return false;
        }
        if (Double.compare(this.proximityFinalThresholdMeters, bleConfig.proximityFinalThresholdMeters) != 0) {
            int i3 = asBinder + 79;
            IAuthTabCallbackDefault = i3 % 128;
            return i3 % 2 == 0;
        }
        if (this.proximityThresholdEnabled != bleConfig.proximityThresholdEnabled || Double.compare(this.proximityIosReferenceRssiAtOneMeter, bleConfig.proximityIosReferenceRssiAtOneMeter) != 0) {
            return false;
        }
        if (Double.compare(this.proximityIosPathLossExponent, bleConfig.proximityIosPathLossExponent) != 0) {
            int i4 = asBinder + 1;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Double.compare(this.proximityAndroidReferenceRssiAtOneMeter, bleConfig.proximityAndroidReferenceRssiAtOneMeter) != 0) {
            return false;
        }
        if (Double.compare(this.proximityAndroidPathLossExponent, bleConfig.proximityAndroidPathLossExponent) == 0) {
            return true;
        }
        int i6 = IAuthTabCallbackDefault + 75;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((this.scanner.hashCode() * 31) + this.advertiser.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Double.hashCode(this.proximityApproachThresholdMeters)) * 31) + Double.hashCode(this.proximityDistanceUnitMeters)) * 31) + Double.hashCode(this.proximityFinalThresholdMeters)) * 31) + Boolean.hashCode(this.proximityThresholdEnabled)) * 31) + Double.hashCode(this.proximityIosReferenceRssiAtOneMeter)) * 31) + Double.hashCode(this.proximityIosPathLossExponent)) * 31) + Double.hashCode(this.proximityAndroidReferenceRssiAtOneMeter)) * 31) + Double.hashCode(this.proximityAndroidPathLossExponent);
        int i4 = IAuthTabCallbackDefault + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        ScannerConfig scannerConfig = this.scanner;
        AdvertiserConfig advertiserConfig = this.advertiser;
        boolean z = this.isEnabled;
        double d = this.proximityApproachThresholdMeters;
        double d2 = this.proximityDistanceUnitMeters;
        double d3 = this.proximityFinalThresholdMeters;
        boolean z2 = this.proximityThresholdEnabled;
        double d4 = this.proximityIosReferenceRssiAtOneMeter;
        double d5 = this.proximityIosPathLossExponent;
        double d6 = this.proximityAndroidReferenceRssiAtOneMeter;
        double d7 = this.proximityAndroidPathLossExponent;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{58088, 18731, 39879, 32763, 3686, 57449, 3419, 62395, 4664, 23726, 60649, 38438, 41542, 42791, 38075, 50747, 64169, 62721}, TextUtils.getOffsetAfter("", 0) + 18, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(scannerConfig);
        Object[] objArr2 = new Object[1];
        b(Color.red(0) + 5, 14 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{25, 7, 4, 65475, 65487, 65504, 21, '\b', 22, '\f', 23, 21, '\b'}, AndroidCharacter.getMirror('0') + 214, true, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(advertiserConfig);
        Object[] objArr3 = new Object[1];
        b(7 - (ViewConfiguration.getFadingEdgeLength() >> 16), 12 - View.combineMeasuredStates(0, 0), new char[]{11, 24, 65519, 29, 19, 65482, 65494, 65511, 14, 15, 22, '\f'}, (ViewConfiguration.getLongPressTimeout() >> 16) + 255, true, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(z);
        Object[] objArr4 = new Object[1];
        b((Process.myTid() >> 22) + 33, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35, new char[]{'\f', 14, 11, 20, 5, '\t', 5, 16, 21, 65501, '\f', '\f', 14, 11, 65533, 65535, 4, 65520, 4, 14, 1, 15, 4, 11, '\b', 0, 65513, 1, 16, 1, 14, 15, 65497, 65480, 65468}, AndroidCharacter.getMirror('0') + 221, false, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(d);
        Object[] objArr5 = new Object[1];
        b(9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 31, new char[]{'\n', 5, 16, 65513, 1, 16, 1, 14, 15, 65497, 65480, 65468, '\f', 14, 11, 20, 5, '\t', 5, 16, 21, 65504, 5, 15, 16, 65533, '\n', 65535, 1, 65521}, 269 - KeyEvent.normalizeMetaState(0), false, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(d2);
        Object[] objArr6 = new Object[1];
        a(new char[]{14403, 46757, 21503, 29536, 17987, 62343, 46433, 29, 45617, 28333, 59612, 58537, 28645, 26575, 24224, 45553, 49100, 39576, 23829, 32234, 52749, 14084, 12382, 19818, 7578, 24495, 63455, 32731, 21003, 36888, 45967, 65173}, View.MeasureSpec.makeMeasureSpec(0, 0) + 32, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(d3);
        Object[] objArr7 = new Object[1];
        a(new char[]{14403, 46757, 21503, 29536, 17987, 62343, 46433, 29, 45617, 28333, 3924, 59215, 8810, 35500, 32971, 12343, 14306, 42929, 12781, 64255, 35848, 20303, 318, 31826, 65062, 54625, 1353, 16719}, 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(z2);
        Object[] objArr8 = new Object[1];
        a(new char[]{14403, 46757, 21503, 29536, 17987, 62343, 46433, 29, 45617, 28333, 61444, 63003, 60746, 20886, 7268, 32928, 48001, 59655, 23829, 32234, 61752, 16799, 16269, 11071, 43518, 51293, 37378, 44704, 38991, 16650, 38075, 50747, 8085, 20906, 7212, 723, 64169, 62721}, TextUtils.indexOf("", "", 0, 0) + 38, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(d4);
        Object[] objArr9 = new Object[1];
        a(new char[]{14403, 46757, 21503, 29536, 17987, 62343, 46433, 29, 45617, 28333, 61444, 63003, 60746, 20886, 39344, 1453, 13003, 48645, 48224, 51384, 43518, 51293, 41535, 44965, 19255, 48153, 38075, 50747, 55986, 6615, 35566, 22925}, TextUtils.lastIndexOf("", '0', 0) + 32, objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(d5);
        Object[] objArr10 = new Object[1];
        b((Process.myTid() >> 22) + 30, 41 - TextUtils.lastIndexOf("", '0', 0), new char[]{11, 1, 15, '\f', 6, 1, 65519, 2, 3, 2, 15, 2, 11, 0, 2, 65519, 16, 16, 6, 65502, 17, 65516, 11, 2, 65514, 2, 17, 2, 15, 65498, 65481, 65469, '\r', 15, '\f', 21, 6, '\n', 6, 17, 22, 65502}, 268 - KeyEvent.getDeadChar(0, 0), false, objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(d6);
        Object[] objArr11 = new Object[1];
        a(new char[]{14403, 46757, 21503, 29536, 17987, 62343, 46433, 29, 45617, 28333, 31442, 35048, 49698, 1701, 14597, 61279, 16396, 38036, 39344, 1453, 13003, 48645, 48224, 51384, 43518, 51293, 41535, 44965, 19255, 48153, 38075, 50747, 55986, 6615, 35566, 22925}, ImageFormat.getBitsPerPixel(0) + 36, objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(d7);
        Object[] objArr12 = new Object[1];
        a(new char[]{31277, 16347}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr12);
        sb.append(((String) objArr12[0]).intern());
        String string = sb.toString();
        int i2 = asBinder + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BleConfig> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            BleConfig$$serializer bleConfig$$serializer = BleConfig$$serializer.INSTANCE;
            if (i3 == 0) {
                return bleConfig$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ BleConfig(int i, ScannerConfig scannerConfig, AdvertiserConfig advertiserConfig, boolean z, double d, double d2, double d3, boolean z2, double d4, double d5, double d6, double d7, okycx okycxVar) {
        ScannerConfig scannerConfig2;
        double d8;
        if ((i & 1) == 0) {
            scannerConfig2 = new ScannerConfig(0, 0, 0, false, 0, 0, 0, 127, (DefaultConstructorMarker) null);
            int i2 = 2 % 2;
        } else {
            scannerConfig2 = scannerConfig;
        }
        this.scanner = scannerConfig2;
        this.advertiser = (i & 2) == 0 ? new AdvertiserConfig(false, 1, (DefaultConstructorMarker) null) : advertiserConfig;
        if ((i & 4) == 0) {
            int i3 = asBinder + 49;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            this.isEnabled = true;
            int i5 = 2 % 2;
        } else {
            this.isEnabled = z;
        }
        this.proximityApproachThresholdMeters = (i & 8) == 0 ? 5.0d : d;
        int i6 = IAuthTabCallbackDefault;
        int i7 = i6 + 115;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        if ((i & 16) == 0) {
            int i9 = i6 + 7;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            this.proximityDistanceUnitMeters = 1.0d;
        } else {
            this.proximityDistanceUnitMeters = d2;
        }
        if ((i & 32) == 0) {
            int i11 = asBinder + 93;
            IAuthTabCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
            this.proximityFinalThresholdMeters = 1.0d;
        } else {
            this.proximityFinalThresholdMeters = d3;
        }
        if ((i & 64) == 0) {
            this.proximityThresholdEnabled = false;
        } else {
            this.proximityThresholdEnabled = z2;
        }
        if ((i & 128) == 0) {
            int i13 = asBinder + 69;
            IAuthTabCallbackDefault = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            d8 = -46.89d;
        } else {
            d8 = d4;
        }
        this.proximityIosReferenceRssiAtOneMeter = d8;
        int i14 = asBinder;
        int i15 = i14 + 59;
        IAuthTabCallbackDefault = i15 % 128;
        int i16 = i15 % 2;
        this.proximityIosPathLossExponent = (i & 256) == 0 ? 2.59d : d5;
        this.proximityAndroidReferenceRssiAtOneMeter = (i & 512) == 0 ? -45.99d : d6;
        int i17 = i14 + 119;
        IAuthTabCallbackDefault = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 2 % 2;
        this.proximityAndroidPathLossExponent = (i & 1024) == 0 ? 3.43d : d7;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(BleConfig bleConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(bleConfig.scanner, new ScannerConfig(0, 0, 0, false, 0, 0, 0, 127, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 0, ScannerConfig$$serializer.INSTANCE, bleConfig.scanner);
            int i4 = IAuthTabCallbackDefault + 59;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(bleConfig.advertiser, new AdvertiserConfig(false, 1, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 1, AdvertiserConfig$$serializer.INSTANCE, bleConfig.advertiser);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !bleConfig.isEnabled) {
            vylVar.onNavigationEvent(serialDescriptor, 2, bleConfig.isEnabled);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || Double.compare(bleConfig.proximityApproachThresholdMeters, 5.0d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, bleConfig.proximityApproachThresholdMeters);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || Double.compare(bleConfig.proximityDistanceUnitMeters, 1.0d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, bleConfig.proximityDistanceUnitMeters);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || Double.compare(bleConfig.proximityFinalThresholdMeters, 1.0d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, bleConfig.proximityFinalThresholdMeters);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i6 = asBinder + 43;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 43 / 0;
                if (!(true ^ bleConfig.proximityThresholdEnabled)) {
                    vylVar.onNavigationEvent(serialDescriptor, 6, bleConfig.proximityThresholdEnabled);
                    int i8 = asBinder + 29;
                    IAuthTabCallbackDefault = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 3 / 2;
                    }
                }
            } else if (bleConfig.proximityThresholdEnabled) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || Double.compare(bleConfig.proximityIosReferenceRssiAtOneMeter, -46.89d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, bleConfig.proximityIosReferenceRssiAtOneMeter);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || Double.compare(bleConfig.proximityIosPathLossExponent, 2.59d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, bleConfig.proximityIosPathLossExponent);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || Double.compare(bleConfig.proximityAndroidReferenceRssiAtOneMeter, -45.99d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 9, bleConfig.proximityAndroidReferenceRssiAtOneMeter);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || Double.compare(bleConfig.proximityAndroidPathLossExponent, 3.43d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, bleConfig.proximityAndroidPathLossExponent);
        }
        int i10 = IAuthTabCallbackDefault + 21;
        asBinder = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 12 / 0;
        }
    }

    public BleConfig(@NotNull ScannerConfig scannerConfig, @NotNull AdvertiserConfig advertiserConfig, boolean z, double d, double d2, double d3, boolean z2, double d4, double d5, double d6, double d7) {
        Intrinsics.checkNotNullParameter(scannerConfig, "");
        Intrinsics.checkNotNullParameter(advertiserConfig, "");
        this.scanner = scannerConfig;
        this.advertiser = advertiserConfig;
        this.isEnabled = z;
        this.proximityApproachThresholdMeters = d;
        this.proximityDistanceUnitMeters = d2;
        this.proximityFinalThresholdMeters = d3;
        this.proximityThresholdEnabled = z2;
        this.proximityIosReferenceRssiAtOneMeter = d4;
        this.proximityIosPathLossExponent = d5;
        this.proximityAndroidReferenceRssiAtOneMeter = d6;
        this.proximityAndroidPathLossExponent = d7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BleConfig(ScannerConfig scannerConfig, AdvertiserConfig advertiserConfig, boolean z, double d, double d2, double d3, boolean z2, double d4, double d5, double d6, double d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        ScannerConfig scannerConfig2 = (i & 1) != 0 ? new ScannerConfig(0, 0, 0, false, 0, 0, 0, 127, (DefaultConstructorMarker) null) : scannerConfig;
        boolean z3 = false;
        boolean z4 = true;
        AdvertiserConfig advertiserConfig2 = (i & 2) != 0 ? new AdvertiserConfig(false, 1, (DefaultConstructorMarker) null) : advertiserConfig;
        if ((i & 4) != 0) {
            int i2 = asBinder + 85;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        } else {
            z4 = z;
        }
        if ((i & 8) != 0) {
            int i4 = 2 % 2;
            d8 = 5.0d;
        } else {
            d8 = d;
        }
        double d13 = 1.0d;
        if ((i & 16) != 0) {
            int i5 = asBinder + 53;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            d9 = 1.0d;
        } else {
            d9 = d2;
        }
        if ((i & 32) != 0) {
            int i7 = IAuthTabCallbackDefault + 113;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                d13 = 0.0d;
            }
        } else {
            d13 = d3;
        }
        if ((i & 64) != 0) {
            int i8 = IAuthTabCallbackDefault + 125;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            z3 = z2;
        }
        if ((i & 128) != 0) {
            int i11 = asBinder + 79;
            IAuthTabCallbackDefault = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            d10 = -46.89d;
        } else {
            d10 = d4;
        }
        if ((i & 256) != 0) {
            int i12 = IAuthTabCallbackDefault + 27;
            asBinder = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 % 2;
            }
            d11 = 2.59d;
        } else {
            d11 = d5;
        }
        double d14 = (i & 512) != 0 ? -45.99d : d6;
        if ((i & 1024) != 0) {
            int i14 = IAuthTabCallbackDefault + 53;
            asBinder = i14 % 128;
            if (i14 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            d12 = 3.43d;
        } else {
            d12 = d7;
        }
        this(scannerConfig2, advertiserConfig2, z4, d8, d9, d13, z3, d10, d11, d14, d12);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 25;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            int i6 = 58224;
            while (i2 < 16) {
                int i7 = $10 + 9;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char defaultSize = (char) View.getDefaultSize(i4, i4);
                        int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int gidForName = 12433 - Process.getGidForName("");
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, maximumDrawingCacheSize, gidForName, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.lastIndexOf("", '0', 0, 0) + 11, TextUtils.indexOf("", "") + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 14 - ((Process.getThreadPriority(0) + 20) >> 6), 19901 - View.MeasureSpec.makeMeasureSpec(0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i11 = $11 + 75;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, (ViewConfiguration.getTapTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 56 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i7 = $10 + 17;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        if (z) {
            int i9 = $11 + 83;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getTapTimeout() >> 16)), 55 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = (char) 17257;
        onExtraCallback = (char) 27338;
        IAuthTabCallback = (char) 52511;
        onNavigationEvent = (char) 44010;
        onExtraCallbackWithResult = 478308992;
    }
}
