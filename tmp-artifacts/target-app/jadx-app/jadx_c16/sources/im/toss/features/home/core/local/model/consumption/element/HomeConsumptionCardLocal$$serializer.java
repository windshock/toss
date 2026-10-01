package im.toss.features.home.core.local.model.consumption.element;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.consumption.component.BadgeLocal;
import im.toss.features.home.core.local.model.consumption.component.BadgeLocal$$serializer;
import im.toss.features.home.core.local.model.consumption.component.BottomIconLocal;
import im.toss.features.home.core.local.model.consumption.component.BottomIconLocal$$serializer;
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
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionCardLocal$$serializer implements aeu2<HomeConsumptionCardLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final HomeConsumptionCardLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        HomeConsumptionCardLocal$$serializer homeConsumptionCardLocal$$serializer = new HomeConsumptionCardLocal$$serializer();
        INSTANCE = homeConsumptionCardLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.consumption.element.HomeConsumptionCardLocal", homeConsumptionCardLocal$$serializer, 11);
        Object[] objArr = new Object[1];
        a(new char[]{60483, 25019, 63405, 17805}, (-16740875) - Color.rgb(0, 0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("trackEvent", false);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("icons", false);
        Object[] objArr2 = new Object[1];
        a(new char[]{60483, 27027, 59353, 32060, 64358}, KeyEvent.getDeadChar(0, 0) + 34253, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(new char[]{60499, 10075, 31318, 36175, 49249, 7027, 11889, 24956, 46102, 53001, 515}, 51978 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("bottomImage", false);
        setanimationsloop.onWarmupCompleted("badge", false);
        setanimationsloop.onWarmupCompleted("links", false);
        setanimationsloop.onWarmupCompleted("items", false);
        setanimationsloop.onWarmupCompleted("arrow", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 99;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 43 / 0;
        }
    }

    private HomeConsumptionCardLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = HomeConsumptionCardLocal.onWarmupCompleted();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getbgcolor, getwrigglelayout, lazyArrOnWarmupCompleted[3].getValue(), getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(BottomIconLocal$$serializer.INSTANCE), sp.IAuthTabCallback(BadgeLocal$$serializer.INSTANCE), lazyArrOnWarmupCompleted[8].getValue(), lazyArrOnWarmupCompleted[9].getValue(), getbgcolor};
        int i4 = IAuthTabCallback + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeConsumptionCardLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        boolean zOnExtraCallbackWithResult;
        String strAsInterface2;
        boolean zOnExtraCallbackWithResult2;
        String str;
        String str2;
        int i;
        BottomIconLocal bottomIconLocal;
        BadgeLocal badgeLocal;
        List list;
        List list2;
        List list3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = HomeConsumptionCardLocal.onWarmupCompleted();
        int i3 = 10;
        String strAsInterface3 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            String strAsInterface4 = null;
            BottomIconLocal bottomIconLocal2 = null;
            BadgeLocal badgeLocal2 = null;
            List list4 = null;
            List list5 = null;
            List list6 = null;
            strAsInterface2 = null;
            strAsInterface = null;
            int i4 = 0;
            zOnExtraCallbackWithResult2 = false;
            zOnExtraCallbackWithResult = false;
            while (z) {
                int i5 = IAuthTabCallback + 13;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        i3 = 10;
                        z = false;
                        continue;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i4 |= 1;
                        break;
                    case 1:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i4 |= 4;
                        list6 = list6;
                        break;
                    case 3:
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnWarmupCompleted[3].getValue(), list6);
                        i4 |= 8;
                        break;
                    case 4:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i4 |= 16;
                        continue;
                    case 5:
                        i4 |= 32;
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        continue;
                    case 6:
                        bottomIconLocal2 = (BottomIconLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, BottomIconLocal$$serializer.INSTANCE, bottomIconLocal2);
                        i4 |= 64;
                        continue;
                    case 7:
                        badgeLocal2 = (BadgeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, BadgeLocal$$serializer.INSTANCE, badgeLocal2);
                        i4 |= 128;
                        continue;
                    case 8:
                        list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrOnWarmupCompleted[8].getValue(), list4);
                        i4 |= 256;
                        continue;
                    case 9:
                        list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 9, (jp) lazyArrOnWarmupCompleted[9].getValue(), list5);
                        i4 |= 512;
                        continue;
                    case 10:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3);
                        i4 |= 1024;
                        int i7 = onNavigationEvent + 109;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                i3 = 10;
            }
            int i9 = IAuthTabCallback + 39;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            str2 = strAsInterface4;
            list3 = list6;
            i = i4;
            bottomIconLocal = bottomIconLocal2;
            badgeLocal = badgeLocal2;
            list = list4;
            list2 = list5;
            str = strAsInterface3;
        } else {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            List list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnWarmupCompleted[3].getValue(), (Object) null);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            BottomIconLocal bottomIconLocal3 = (BottomIconLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, BottomIconLocal$$serializer.INSTANCE, (Object) null);
            BadgeLocal badgeLocal3 = (BadgeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, BadgeLocal$$serializer.INSTANCE, (Object) null);
            List list8 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrOnWarmupCompleted[8].getValue(), (Object) null);
            List list9 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 9, (jp) lazyArrOnWarmupCompleted[9].getValue(), (Object) null);
            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10);
            str = strAsInterface5;
            str2 = strAsInterface6;
            i = 2047;
            bottomIconLocal = bottomIconLocal3;
            badgeLocal = badgeLocal3;
            list = list8;
            list2 = list9;
            list3 = list7;
        }
        String str3 = strAsInterface;
        boolean z2 = zOnExtraCallbackWithResult;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeConsumptionCardLocal(i, str3, z2, strAsInterface2, list3, str, str2, bottomIconLocal, badgeLocal, list, list2, zOnExtraCallbackWithResult2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m258deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeConsumptionCardLocal homeConsumptionCardLocalDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = IAuthTabCallback + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return homeConsumptionCardLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeConsumptionCardLocal homeConsumptionCardLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeConsumptionCardLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeConsumptionCardLocal.onNavigationEvent(homeConsumptionCardLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeConsumptionCardLocal) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 59;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf("", "") + 24, 19627 - Gravity.getAbsoluteGravity(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 58, 6383 - Color.alpha(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 65;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 5 % 3;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 58 - TextUtils.indexOf((CharSequence) "", '0'), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = -1862112179905992448L;
    }
}
