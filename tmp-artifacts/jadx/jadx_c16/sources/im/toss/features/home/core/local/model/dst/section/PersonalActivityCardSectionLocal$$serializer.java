package im.toss.features.home.core.local.model.dst.section;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import im.toss.features.home.core.local.model.dst.property.MarginLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.OuterStrokeLocal;
import im.toss.features.home.core.local.model.dst.property.OuterStrokeLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.StrokeAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.StrokeAttributeLocal$$serializer;
import im.toss.features.home.core.local.model.dst.section.BaseSectionLocal;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getKekid;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PersonalActivityCardSectionLocal$$serializer implements aeu2<PersonalActivityCardSectionLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final PersonalActivityCardSectionLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        PersonalActivityCardSectionLocal$$serializer personalActivityCardSectionLocal$$serializer = new PersonalActivityCardSectionLocal$$serializer();
        INSTANCE = personalActivityCardSectionLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.section.PersonalActivityCardSectionLocal", personalActivityCardSectionLocal$$serializer, 14);
        setanimationsloop.onWarmupCompleted("id", false);
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 2}, false, new byte[]{0, 1, 1, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("items", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        setanimationsloop.onWarmupCompleted("activityItems", false);
        setanimationsloop.onWarmupCompleted("activityItemIds", true);
        setanimationsloop.onWarmupCompleted("activityHeader", false);
        setanimationsloop.onWarmupCompleted("margin", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        setanimationsloop.onWarmupCompleted("activityBackgroundColor", false);
        setanimationsloop.onWarmupCompleted("cornerRadius", false);
        setanimationsloop.onWarmupCompleted("corners", false);
        setanimationsloop.onWarmupCompleted("stroke", false);
        setanimationsloop.onWarmupCompleted("outerStroke", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 35;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private PersonalActivityCardSectionLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArr = (Lazy[]) PersonalActivityCardSectionLocal.onExtraCallback(-267416657, getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[0], getKekid.onExtraCallback(), 267416657, getKekid.onExtraCallback());
        ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback((KSerializer) lazyArr[1].getValue()), lazyArr[2].getValue(), sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE), lazyArr[4].getValue(), lazyArr[5].getValue(), sp.IAuthTabCallback(ActivityHeaderLocal$$serializer.INSTANCE), sp.IAuthTabCallback(MarginLocal$$serializer.INSTANCE), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(setVideoListener.onWarmupCompleted), lazyArr[11].getValue(), sp.IAuthTabCallback(StrokeAttributeLocal$$serializer.INSTANCE), sp.IAuthTabCallback(OuterStrokeLocal$$serializer.INSTANCE)};
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PersonalActivityCardSectionLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        OuterStrokeLocal outerStrokeLocal;
        PaddingLocal paddingLocal;
        StrokeAttributeLocal strokeAttributeLocal;
        List list;
        List list2;
        Set set;
        ColorAttributeLocal colorAttributeLocal;
        ColorAttributeLocal colorAttributeLocal2;
        int i;
        Double d;
        List list3;
        ActivityHeaderLocal activityHeaderLocal;
        String str;
        BaseSectionLocal.onWarmupCompleted onwarmupcompleted;
        MarginLocal marginLocal;
        List list4;
        int i2;
        List list5;
        MarginLocal marginLocal2;
        OuterStrokeLocal outerStrokeLocal2;
        PaddingLocal paddingLocal2;
        boolean z;
        List list6;
        MarginLocal marginLocal3;
        OuterStrokeLocal outerStrokeLocal3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArr = (Lazy[]) PersonalActivityCardSectionLocal.onExtraCallback(-267416657, getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[0], getKekid.onExtraCallback(), 267416657, getKekid.onExtraCallback());
        List list7 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            BaseSectionLocal.onWarmupCompleted onwarmupcompleted2 = (BaseSectionLocal.onWarmupCompleted) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArr[1].getValue(), (Object) null);
            List list8 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArr[2].getValue(), (Object) null);
            PaddingLocal paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, PaddingLocal$$serializer.INSTANCE, (Object) null);
            List list9 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArr[4].getValue(), (Object) null);
            List list10 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArr[5].getValue(), (Object) null);
            ActivityHeaderLocal activityHeaderLocal2 = (ActivityHeaderLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, ActivityHeaderLocal$$serializer.INSTANCE, (Object) null);
            MarginLocal marginLocal4 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, MarginLocal$$serializer.INSTANCE, (Object) null);
            ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
            ColorAttributeLocal colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, serializerVar, (Object) null);
            ColorAttributeLocal colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, serializerVar, (Object) null);
            Double d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, setVideoListener.onWarmupCompleted, (Object) null);
            Set set2 = (Set) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 11, (jp) lazyArr[11].getValue(), (Object) null);
            StrokeAttributeLocal strokeAttributeLocal2 = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, StrokeAttributeLocal$$serializer.INSTANCE, (Object) null);
            outerStrokeLocal = (OuterStrokeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, OuterStrokeLocal$$serializer.INSTANCE, (Object) null);
            str = strAsInterface;
            set = set2;
            onwarmupcompleted = onwarmupcompleted2;
            list3 = list9;
            paddingLocal = paddingLocal3;
            list = list10;
            colorAttributeLocal2 = colorAttributeLocal4;
            marginLocal = marginLocal4;
            activityHeaderLocal = activityHeaderLocal2;
            d = d2;
            colorAttributeLocal = colorAttributeLocal3;
            i = 16383;
            strokeAttributeLocal = strokeAttributeLocal2;
            list2 = list8;
        } else {
            int i6 = 0;
            boolean z2 = true;
            OuterStrokeLocal outerStrokeLocal4 = null;
            PaddingLocal paddingLocal4 = null;
            StrokeAttributeLocal strokeAttributeLocal3 = null;
            List list11 = null;
            List list12 = null;
            Set set3 = null;
            ColorAttributeLocal colorAttributeLocal5 = null;
            ColorAttributeLocal colorAttributeLocal6 = null;
            Double d3 = null;
            ActivityHeaderLocal activityHeaderLocal3 = null;
            String strAsInterface2 = null;
            BaseSectionLocal.onWarmupCompleted onwarmupcompleted3 = null;
            MarginLocal marginLocal5 = null;
            while (!(!z2)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        list5 = list12;
                        marginLocal2 = marginLocal5;
                        outerStrokeLocal2 = outerStrokeLocal4;
                        z2 = false;
                        paddingLocal4 = paddingLocal4;
                        outerStrokeLocal4 = outerStrokeLocal2;
                        marginLocal5 = marginLocal2;
                        list12 = list5;
                    case 0:
                        paddingLocal2 = paddingLocal4;
                        list5 = list12;
                        marginLocal2 = marginLocal5;
                        outerStrokeLocal2 = outerStrokeLocal4;
                        z = true;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        paddingLocal4 = paddingLocal2;
                        outerStrokeLocal4 = outerStrokeLocal2;
                        marginLocal5 = marginLocal2;
                        list12 = list5;
                    case 1:
                        paddingLocal2 = paddingLocal4;
                        List list13 = list12;
                        marginLocal2 = marginLocal5;
                        outerStrokeLocal2 = outerStrokeLocal4;
                        z = true;
                        list5 = list13;
                        onwarmupcompleted3 = (BaseSectionLocal.onWarmupCompleted) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArr[1].getValue(), onwarmupcompleted3);
                        i6 |= 2;
                        int i7 = onExtraCallbackWithResult + 81;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        paddingLocal4 = paddingLocal2;
                        outerStrokeLocal4 = outerStrokeLocal2;
                        marginLocal5 = marginLocal2;
                        list12 = list5;
                    case 2:
                        List list14 = list12;
                        MarginLocal marginLocal6 = marginLocal5;
                        i6 |= 4;
                        paddingLocal4 = paddingLocal4;
                        list12 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArr[2].getValue(), list14);
                        outerStrokeLocal4 = outerStrokeLocal4;
                        marginLocal5 = marginLocal6;
                    case 3:
                        list6 = list12;
                        marginLocal3 = marginLocal5;
                        outerStrokeLocal3 = outerStrokeLocal4;
                        paddingLocal4 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, PaddingLocal$$serializer.INSTANCE, paddingLocal4);
                        i6 |= 8;
                        outerStrokeLocal4 = outerStrokeLocal3;
                        marginLocal5 = marginLocal3;
                        list12 = list6;
                    case 4:
                        list6 = list12;
                        marginLocal3 = marginLocal5;
                        outerStrokeLocal3 = outerStrokeLocal4;
                        list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArr[4].getValue(), list7);
                        i6 |= 16;
                        outerStrokeLocal4 = outerStrokeLocal3;
                        marginLocal5 = marginLocal3;
                        list12 = list6;
                    case 5:
                        list6 = list12;
                        marginLocal3 = marginLocal5;
                        outerStrokeLocal3 = outerStrokeLocal4;
                        list11 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArr[5].getValue(), list11);
                        i6 |= 32;
                        outerStrokeLocal4 = outerStrokeLocal3;
                        marginLocal5 = marginLocal3;
                        list12 = list6;
                    case 6:
                        list6 = list12;
                        marginLocal3 = marginLocal5;
                        outerStrokeLocal3 = outerStrokeLocal4;
                        activityHeaderLocal3 = (ActivityHeaderLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, ActivityHeaderLocal$$serializer.INSTANCE, activityHeaderLocal3);
                        i6 |= 64;
                        outerStrokeLocal4 = outerStrokeLocal3;
                        marginLocal5 = marginLocal3;
                        list12 = list6;
                    case 7:
                        i6 |= 128;
                        outerStrokeLocal4 = outerStrokeLocal4;
                        list12 = list12;
                        marginLocal5 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, MarginLocal$$serializer.INSTANCE, marginLocal5);
                    case 8:
                        list4 = list12;
                        colorAttributeLocal5 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal5);
                        i6 |= 256;
                        list12 = list4;
                    case 9:
                        list4 = list12;
                        colorAttributeLocal6 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal6);
                        i6 |= 512;
                        list12 = list4;
                    case 10:
                        list4 = list12;
                        d3 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, setVideoListener.onWarmupCompleted, d3);
                        i6 |= 1024;
                        list12 = list4;
                    case 11:
                        list4 = list12;
                        set3 = (Set) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 11, (jp) lazyArr[11].getValue(), set3);
                        i6 |= 2048;
                        i2 = IAuthTabCallback + 43;
                        onExtraCallbackWithResult = i2 % 128;
                        int i9 = i2 % 2;
                        list12 = list4;
                    case 12:
                        list4 = list12;
                        strokeAttributeLocal3 = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, StrokeAttributeLocal$$serializer.INSTANCE, strokeAttributeLocal3);
                        i6 |= 4096;
                        i2 = onExtraCallbackWithResult + 67;
                        IAuthTabCallback = i2 % 128;
                        int i92 = i2 % 2;
                        list12 = list4;
                    case 13:
                        list4 = list12;
                        outerStrokeLocal4 = (OuterStrokeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, OuterStrokeLocal$$serializer.INSTANCE, outerStrokeLocal4);
                        i6 |= 8192;
                        list12 = list4;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            outerStrokeLocal = outerStrokeLocal4;
            paddingLocal = paddingLocal4;
            strokeAttributeLocal = strokeAttributeLocal3;
            list = list11;
            list2 = list12;
            set = set3;
            colorAttributeLocal = colorAttributeLocal5;
            colorAttributeLocal2 = colorAttributeLocal6;
            i = i6;
            d = d3;
            list3 = list7;
            activityHeaderLocal = activityHeaderLocal3;
            str = strAsInterface2;
            onwarmupcompleted = onwarmupcompleted3;
            marginLocal = marginLocal5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PersonalActivityCardSectionLocal(i, str, onwarmupcompleted, list2, paddingLocal, list3, list, activityHeaderLocal, marginLocal, colorAttributeLocal, colorAttributeLocal2, d, set, strokeAttributeLocal, outerStrokeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m469deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        PersonalActivityCardSectionLocal personalActivityCardSectionLocalDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return personalActivityCardSectionLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PersonalActivityCardSectionLocal personalActivityCardSectionLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(personalActivityCardSectionLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PersonalActivityCardSectionLocal.onExtraCallback(personalActivityCardSectionLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PersonalActivityCardSectionLocal) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        long j = 0;
        if (cArr2 != null) {
            int i7 = $10 + 15;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 35283), 36 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    int i9 = $10 + 87;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.getCapsMode("", 0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 66, TextUtils.lastIndexOf("", '0', 0, 0) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (Process.myPid() >> 22) + 29, 17657 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49466), 69 - TextUtils.lastIndexOf("", '0', 0), 12486 - (ViewConfiguration.getPressedStateDuration() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i13 = $11 + 39;
                $10 = i13 % 128;
                int i14 = i13 % 2;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i15 = $10 + 95;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 1, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 - i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 / i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i16 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i16, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i16);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i17 = $11 + 29;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i19 = $10 + 123;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] * iArr[5]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new char[]{27254, 27172, 27170, 27192};
    }
}
