package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.GeckoHubImp;
import o.TextRoundCornerProgressBarSavedState1;
import o.UST_CERT_ChangePrikeyPassword;
import o.UST_CERT_EncryptPrikey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_EncryptPrikey {
    public static final int IAuthTabCallback;
    private static final Lazy IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static short[] IAuthTabCallbackStubProxy;
    private static long access100;
    private static int asBinder;
    private static int asInterface;
    private static int extraCallbackWithResult;
    private static byte[] getInterfaceDescriptor;
    private static final String onExtraCallback;
    public static final UST_CERT_EncryptPrikey onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static final String onTransact;
    private static final String onWarmupCompleted;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 90;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int readTypedObject = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;

    private static String $$c(int i, short s, short s2) {
        int i2 = s * 2;
        byte[] bArr = $$a;
        int i3 = 115 - (s2 * 4);
        int i4 = i + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + i5;
            i4 = i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            int i7 = i4 + 1;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i7];
            i4 = i7;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~(i3 | i2)) | i;
        int i8 = i2 | i3 | i;
        int i9 = ~i3;
        int i10 = i3 + i + i5 + ((-421447895) * i4) + ((-859425246) * i6);
        int i11 = i10 * i10;
        int i12 = (i3 * (-629045104)) + 1817116672 + ((-629045104) * i) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i5) + ((-2125594624) * i4) + (888930304 * i6) + (441384960 * i11);
        int i13 = (i3 * 1303038832) + 2077918271 + (i * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i5 * 1303038783) + (i4 * 1583617559) + (i6 * (-1102559138)) + (i11 * 510722048);
        int i14 = i12 + (i13 * i13 * 607191040);
        return i14 != 1 ? i14 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access000 + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = onExtraCallback();
        int i4 = access000 + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    private UST_CERT_EncryptPrikey() {
    }

    static {
        extraCallbackWithResult = 0;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((short) ((-23) - Drawable.resolveOpacity(0, 0)), (byte) (74 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1638427736 - ExpandableListView.getPackedPositionType(0L), 1543945978 + (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Process.getGidForName("") + 11, objArr);
        onTransact = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) ((-88) - (ViewConfiguration.getPressedStateDuration() >> 16)), (byte) (6 - View.resolveSizeAndState(0, 0, 0)), 1638427754 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0') + 1543945976, Color.argb(0, 0, 0, 0) + 8, objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 87), (byte) ((-103) - (ViewConfiguration.getTapTimeout() >> 16)), (Process.myPid() >> 22) + 1638427770, 1543945976 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr3);
        onExtraCallback = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((short) (Gravity.getAbsoluteGravity(0, 0) + 65), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32), 1638427782 - Color.alpha(0), 1543945975 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-3) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
        onNavigationEvent = ((String) objArr4[0]).intern();
        onExtraCallbackWithResult = new UST_CERT_EncryptPrikey();
        IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtpStorage$$ExternalSyntheticLambda0
            public final Object invoke() {
                return (TextRoundCornerProgressBarSavedState1) UST_CERT_EncryptPrikey.onExtraCallback(273524553, new Object[0], GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -273524551, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            }
        });
        IAuthTabCallback = 8;
        int i = readTypedObject + 5;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static final TextRoundCornerProgressBarSavedState1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            addPolicy.ITrustedWebActivityServiceStubProxy();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStubProxy = addPolicy.ITrustedWebActivityServiceStubProxy();
        int i3 = access000 + 113;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStubProxy;
        }
        obj.hashCode();
        throw null;
    }

    private final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) IAuthTabCallbackDefault.getValue();
        int i4 = IAuthTabCallback_Parcel + 79;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    public final OtpCredential.Pin onNavigationEvent(@NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        OtpCredential.Pin pin = (OtpCredential.Pin) onExtraCallback(-1736917132, new Object[]{this, uST_CERT_ChangePrikeyPassword}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1736917132, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        if (pin == null) {
            int i2 = access000 + 63;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return onExtraCallback(uST_CERT_ChangePrikeyPassword);
        }
        int i4 = IAuthTabCallback_Parcel + 87;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return pin;
    }

    public final OtpCredential.Card IAuthTabCallback(@NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword) {
        int i = 2 % 2;
        int i2 = access000 + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
            asInterface(uST_CERT_ChangePrikeyPassword);
            throw null;
        }
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        OtpCredential.Card cardAsInterface = asInterface(uST_CERT_ChangePrikeyPassword);
        if (cardAsInterface != null) {
            int i3 = IAuthTabCallback_Parcel + 69;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                return cardAsInterface;
            }
            obj.hashCode();
            throw null;
        }
        OtpCredential.Card card = (OtpCredential.Card) onExtraCallback(1818648586, new Object[]{this, uST_CERT_ChangePrikeyPassword}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1818648585, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        int i4 = access000 + 23;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return card;
    }

    public final void onNavigationEvent(@NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, @NotNull OtpCredential.Pin pin) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        Intrinsics.checkNotNullParameter(pin, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = onExtraCallbackWithResult();
        String strOnWarmupCompleted = onWarmupCompleted(uST_CERT_ChangePrikeyPassword, UST_CERT_DecryptPrikey.Pin);
        wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
        wie2VarOnExtraCallback.onExtraCallback();
        textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult.onNavigationEvent(strOnWarmupCompleted, wie2VarOnExtraCallback.onWarmupCompleted(OtpCredential.Pin.Companion.serializer(), pin));
        int i4 = access000 + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onExtraCallbackWithResult(@NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, @NotNull OtpCredential.Card card) throws NoWhenBranchMatchedException {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = access000 + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
            Intrinsics.checkNotNullParameter(card, "");
            boolean z = card instanceof OtpCredential.Card.Stored;
            throw null;
        }
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        Intrinsics.checkNotNullParameter(card, "");
        if (card instanceof OtpCredential.Card.Stored) {
            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            strOnWarmupCompleted = wie2VarOnExtraCallback.onWarmupCompleted(OtpCredential.Card.Stored.Companion.serializer(), card);
        } else {
            if (!(card instanceof OtpCredential.Card.PendingMigration_5_255_256)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = IAuthTabCallback_Parcel + 91;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                wie2 wie2VarOnExtraCallback2 = EndMotionInteraction.onExtraCallback();
                wie2VarOnExtraCallback2.onExtraCallback();
                wie2VarOnExtraCallback2.onWarmupCompleted(OtpCredential.Card.PendingMigration_5_255_256.Companion.serializer(), card);
                throw null;
            }
            wie2 wie2VarOnExtraCallback3 = EndMotionInteraction.onExtraCallback();
            wie2VarOnExtraCallback3.onExtraCallback();
            strOnWarmupCompleted = wie2VarOnExtraCallback3.onWarmupCompleted(OtpCredential.Card.PendingMigration_5_255_256.Companion.serializer(), card);
        }
        onExtraCallbackWithResult().onNavigationEvent(onWarmupCompleted(uST_CERT_ChangePrikeyPassword, UST_CERT_DecryptPrikey.Card), strOnWarmupCompleted);
        int i4 = access000 + 103;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(UST_CERT_EncryptPrikey uST_CERT_EncryptPrikey, UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access000;
        int i4 = i3 + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0 ? (i & 4) != 0 : (i & 2) != 0) {
            int i5 = i3 + 47;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            str = null;
        }
        return uST_CERT_EncryptPrikey.onExtraCallbackWithResult(uST_CERT_ChangePrikeyPassword, uST_CERT_DecryptPrikey, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean onExtraCallbackWithResult(@NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, @NotNull UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey, @Nullable String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        Intrinsics.checkNotNullParameter(uST_CERT_DecryptPrikey, "");
        int i2 = IAuthTabCallback.onExtraCallbackWithResult[uST_CERT_DecryptPrikey.ordinal()];
        if (i2 == 1) {
            if (onNavigationEvent(uST_CERT_ChangePrikeyPassword) == null) {
                return false;
            }
            int i3 = IAuthTabCallback_Parcel + 49;
            access000 = i3 % 128;
            return i3 % 2 != 0;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        OtpCredential.Card cardIAuthTabCallback = IAuthTabCallback(uST_CERT_ChangePrikeyPassword);
        if (cardIAuthTabCallback == null) {
            return false;
        }
        int i4 = IAuthTabCallback_Parcel + 93;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return Intrinsics.areEqual(cardIAuthTabCallback.onExtraCallbackWithResult(), str);
        }
        int i5 = 10 / 0;
        return Intrinsics.areEqual(cardIAuthTabCallback.onExtraCallbackWithResult(), str);
    }

    public final void IAuthTabCallback(@NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, @NotNull UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
            Intrinsics.checkNotNullParameter(uST_CERT_DecryptPrikey, "");
            onExtraCallbackWithResult().onNavigationEvent(onWarmupCompleted(uST_CERT_ChangePrikeyPassword, uST_CERT_DecryptPrikey), "");
            onExtraCallbackWithResult(uST_CERT_ChangePrikeyPassword, uST_CERT_DecryptPrikey);
            return;
        }
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        Intrinsics.checkNotNullParameter(uST_CERT_DecryptPrikey, "");
        onExtraCallbackWithResult().onNavigationEvent(onWarmupCompleted(uST_CERT_ChangePrikeyPassword, uST_CERT_DecryptPrikey), "");
        onExtraCallbackWithResult(uST_CERT_ChangePrikeyPassword, uST_CERT_DecryptPrikey);
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uST_CERT_ChangePrikeyPassword, "");
        Iterator it = UST_CERT_DecryptPrikey.getEntries().iterator();
        while (!(!it.hasNext())) {
            int i4 = access000 + 43;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                onExtraCallbackWithResult.IAuthTabCallback(uST_CERT_ChangePrikeyPassword, (UST_CERT_DecryptPrikey) it.next());
                throw null;
            }
            onExtraCallbackWithResult.IAuthTabCallback(uST_CERT_ChangePrikeyPassword, (UST_CERT_DecryptPrikey) it.next());
        }
    }

    private final String onWarmupCompleted(UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey) throws Throwable {
        int i = 2 % 2;
        String strIAuthTabCallback = uST_CERT_ChangePrikeyPassword.IAuthTabCallback();
        String typeString = uST_CERT_DecryptPrikey.getTypeString();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) (View.MeasureSpec.makeMeasureSpec(0, 0) + 68), (byte) (70 - (Process.myPid() >> 22)), 1638427787 + (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1543946011 - Color.alpha(0), Color.argb(0, 0, 0, 0) + 5, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strIAuthTabCallback);
        Object[] objArr2 = new Object[1];
        b(new char[]{39365, 17261, 13112, 36159, 39322}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(typeString);
        String string = sb.toString();
        int i2 = access000 + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(access100 ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 27;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(access100)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 45812), ExpandableListView.getPackedPositionChild(0L) + 85, 21233 - (ViewConfiguration.getEdgeSlop() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 14185), 19 - Color.green(0), 8808 - (KeyEvent.getMaxKeyCode() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 119;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Object obj;
        UST_CERT_EncryptPrikey uST_CERT_EncryptPrikey = (UST_CERT_EncryptPrikey) objArr[0];
        int i = 2 % 2;
        String strOnWarmupCompleted = uST_CERT_EncryptPrikey.onWarmupCompleted((UST_CERT_ChangePrikeyPassword) objArr[1], UST_CERT_DecryptPrikey.Pin);
        String strOnExtraCallbackWithResult = uST_CERT_EncryptPrikey.onExtraCallbackWithResult().onExtraCallbackWithResult(strOnWarmupCompleted, "");
        Object obj2 = null;
        if (strOnExtraCallbackWithResult.length() <= 0) {
            int i2 = IAuthTabCallback_Parcel + 123;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            strOnExtraCallbackWithResult = null;
        }
        if (strOnExtraCallbackWithResult == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = Result.constructor-impl((OtpCredential.Pin) wie2VarOnExtraCallback.onExtraCallback(OtpCredential.Pin.Companion.serializer(), strOnExtraCallbackWithResult));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i4 = access000 + 21;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a((short) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 23), (byte) (74 - (ViewConfiguration.getTapTimeout() >> 16)), Drawable.resolveOpacity(0, 0) + 1638427736, 1543945979 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(new char[]{45956, 37032, 47573, 16197, 46048, 38561, 46438, 11270, 43621, 36666, 40945, 5061, 33009, 43430, 34417, 30976, 65383, 49703, 57585, 24708, 54758, 64676, 52080, 17989, 52308, 5409, 13819, 44485, 10924, 4005, 7284, 37660, 358, 10285, 1717, 64208, 32731, 17146, 24864, 57424, 22107, 31610, 19360, 51155, 19620, 38309, 45692, 11522, 43894, 36393, 40161, 5260, 33259, 43174, 34620}, 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr3[0]).intern(), th2, (Map) null, 8, (Object) null);
            onExtraCallbackWithResult.onExtraCallbackWithResult().onTransact(strOnWarmupCompleted);
        }
        if (Result.onExtraCallback(obj)) {
            int i6 = IAuthTabCallback_Parcel + 125;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        } else {
            obj2 = obj;
        }
        return (OtpCredential.Pin) obj2;
    }

    private final OtpCredential.Card asInterface(UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword) {
        Object obj;
        int i = 2 % 2;
        int i2 = access000 + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult().onExtraCallbackWithResult(onWarmupCompleted(uST_CERT_ChangePrikeyPassword, UST_CERT_DecryptPrikey.Card), "");
        if (strOnExtraCallbackWithResult.length() <= 0) {
            strOnExtraCallbackWithResult = null;
        }
        if (strOnExtraCallbackWithResult != null) {
            try {
                Result.Companion companion = Result.Companion;
                wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
                wie2VarOnExtraCallback.onExtraCallback();
                obj = Result.constructor-impl((OtpCredential.Card.Stored) wie2VarOnExtraCallback.onExtraCallback(OtpCredential.Card.Stored.Companion.serializer(), strOnExtraCallbackWithResult));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.exceptionOrNull-impl(obj) != null) {
                try {
                    Result.Companion companion3 = Result.Companion;
                    wie2 wie2VarOnExtraCallback2 = EndMotionInteraction.onExtraCallback();
                    wie2VarOnExtraCallback2.onExtraCallback();
                    obj = Result.constructor-impl((OtpCredential.Card) wie2VarOnExtraCallback2.onExtraCallback(OtpCredential.Card.PendingMigration_5_255_256.Companion.serializer(), strOnExtraCallbackWithResult));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th2));
                }
            }
            return (OtpCredential.Card) (Result.onExtraCallback(obj) ? null : obj);
        }
        int i4 = IAuthTabCallback_Parcel + 45;
        int i5 = i4 % 128;
        access000 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 37;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 56 / 0;
        }
        return null;
    }

    private final OtpCredential.Pin onExtraCallback(UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword) throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        if (!(uST_CERT_ChangePrikeyPassword instanceof UST_CERT_ChangePrikeyPassword.IAuthTabCallback)) {
            return null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 89), (byte) (7 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 1638427754, 1543945975 - ((Process.getThreadPriority(0) + 20) >> 6), 8 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult.onExtraCallbackWithResult(((String) objArr[0]).intern(), "");
        if (strOnExtraCallbackWithResult.length() <= 0) {
            strOnExtraCallbackWithResult = null;
        }
        if (strOnExtraCallbackWithResult != null) {
            OtpCredential.Pin pin = new OtpCredential.Pin(strOnExtraCallbackWithResult);
            int i2 = IAuthTabCallback_Parcel + 41;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return pin;
        }
        int i4 = access000 + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        UST_CERT_EncryptPrikey uST_CERT_EncryptPrikey = (UST_CERT_EncryptPrikey) objArr[0];
        UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword = (UST_CERT_ChangePrikeyPassword) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 71;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        if (!(uST_CERT_ChangePrikeyPassword instanceof UST_CERT_ChangePrikeyPassword.IAuthTabCallback)) {
            int i5 = i3 + 71;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 15 / 0;
            }
            return null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = uST_CERT_EncryptPrikey.onExtraCallbackWithResult();
        Object[] objArr2 = new Object[1];
        a((short) (65 - TextUtils.indexOf("", "")), (byte) (31 - TextUtils.indexOf((CharSequence) "", '0')), Color.green(0) + 1638427782, 1543945975 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 3, objArr2);
        String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult.onExtraCallbackWithResult(((String) objArr2[0]).intern(), "");
        if (strOnExtraCallbackWithResult.length() <= 0) {
            int i7 = access000 + 31;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            strOnExtraCallbackWithResult = null;
        }
        if (strOnExtraCallbackWithResult == null) {
            return null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult2 = uST_CERT_EncryptPrikey.onExtraCallbackWithResult();
        StringBuilder sb = new StringBuilder();
        sb.append(strOnExtraCallbackWithResult);
        Object[] objArr3 = new Object[1];
        b(new char[]{29398, 41034, 15377, 13441, 29435, 42597, 12421, 10208, 27413, 49145, 6708, 6210, 16804, 39247, 933, 29418, 15923, 62163}, TextUtils.getOffsetAfter("", 0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String strOnExtraCallbackWithResult2 = textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult2.onExtraCallbackWithResult(sb.toString(), "");
        if (strOnExtraCallbackWithResult2.length() <= 0) {
            strOnExtraCallbackWithResult2 = null;
        }
        if (strOnExtraCallbackWithResult2 == null) {
            return null;
        }
        return new OtpCredential.Card.Stored(strOnExtraCallbackWithResult, strOnExtraCallbackWithResult2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallbackWithResult(UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
            if (!(uST_CERT_ChangePrikeyPassword instanceof UST_CERT_ChangePrikeyPassword.IAuthTabCallback)) {
                return;
            }
        } else if (!(uST_CERT_ChangePrikeyPassword instanceof UST_CERT_ChangePrikeyPassword.IAuthTabCallback)) {
            return;
        }
        int i4 = IAuthTabCallback.onExtraCallbackWithResult[uST_CERT_DecryptPrikey.ordinal()];
        if (i4 == 1) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            Object[] objArr = new Object[1];
            a((short) ((-88) - View.getDefaultSize(0, 0)), (byte) (6 - Color.green(0)), 1638427755 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 1543945975, 8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult.onTransact(((String) objArr[0]).intern());
            return;
        }
        if (i4 == 2) {
            int i5 = IAuthTabCallback_Parcel + 101;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult2 = onExtraCallbackWithResult();
            Object[] objArr2 = new Object[1];
            a((short) (65 - ExpandableListView.getPackedPositionGroup(0L)), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31), 1638427782 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getTapTimeout() >> 16) + 1543945975, (-2) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult2.onExtraCallbackWithResult(((String) objArr2[0]).intern(), "");
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult3 = onExtraCallbackWithResult();
            Object[] objArr3 = new Object[1];
            a((short) (Color.green(0) + 65), (byte) (32 - Color.green(0)), 1638427782 - TextUtils.getCapsMode("", 0, 0), 1543945975 - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.keyCodeFromString("") - 3, objArr3);
            textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult3.onTransact(((String) objArr3[0]).intern());
            if (strOnExtraCallbackWithResult.length() > 0) {
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult4 = onExtraCallbackWithResult();
                StringBuilder sb = new StringBuilder();
                sb.append(strOnExtraCallbackWithResult);
                Object[] objArr4 = new Object[1];
                b(new char[]{29398, 41034, 15377, 13441, 29435, 42597, 12421, 10208, 27413, 49145, 6708, 6210, 16804, 39247, 933, 29418, 15923, 62163}, View.combineMeasuredStates(0, 0), objArr4);
                sb.append(((String) objArr4[0]).intern());
                textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult4.onTransact(sb.toString());
                int i7 = access000 + 107;
                IAuthTabCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.keyCodeFromString("")), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = -1;
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = getInterfaceDescriptor;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) i7;
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 12843), 55 - (ViewConfiguration.getTouchSlop() >> 8), 2167 - ((Process.getThreadPriority(0) + 20) >> 6), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i8++;
                        i7 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $11 + 103;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        byte[] bArr3 = getInterfaceDescriptor;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallbackStub)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43425), Gravity.getAbsoluteGravity(0, 0) + 42, 22438 - Process.getGidForName(""), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] & (-4629411779493505016L))) >> ((int) (asBinder & (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = getInterfaceDescriptor;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallbackStub)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getScrollBarSize() >> 8) + 42, KeyEvent.keyCodeFromString("") + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i5;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallbackStubProxy[i + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i10 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallbackStub ^ j));
                if (z2) {
                    int i11 = $11 + 39;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i10 + i4;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asInterface), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 86 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = getInterfaceDescriptor;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = $11 + 83;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        bArr6[i13] = (byte) (bArr5[i13] ^ (-4629411779493505016L));
                    }
                    int i16 = $11 + 5;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    z = true;
                } else {
                    int i18 = $10 + 81;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr7 = getInterfaceDescriptor;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallbackStubProxy;
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

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(273524553, new Object[0], GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -273524551, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final OtpCredential.Card onWarmupCompleted(UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword) {
        return (OtpCredential.Card) onExtraCallback(1818648586, new Object[]{this, uST_CERT_ChangePrikeyPassword}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1818648585, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final OtpCredential.Pin onTransact(UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword) {
        return (OtpCredential.Pin) onExtraCallback(-1736917132, new Object[]{this, uST_CERT_ChangePrikeyPassword}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1736917132, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStub = 974146464;
        asBinder = -1538795519;
        asInterface = 129931600;
        getInterfaceDescriptor = new byte[]{-61, 107, -76, 104, -64, -118, -56, -59, -114, -65, -36, -60, -64, -118, -50, 82, -57, -119, 98, 124, 33, 105, 69, 105, 88, 100, 53, 90, 83, 116, 108, 84, 75, 83, -20, -46, -83, -27, -55, -27, -74, -22, -24, -6, -61, -5, -14, -19, -23, -124, -20, 109, 126, -9, 26, 112, 101, 125, 113, 11, -9, 3, 120, 10, 8, 8, 8, 8, 8};
        access100 = 153038882775203180L;
    }
}
