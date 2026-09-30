package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.tmoney.LiveCheckConstants;
import im.toss.core.security.EncryptedDataRequest;
import im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda9;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseRoundCornerProgressBarSavedState1 {
    private static char IAuthTabCallback;
    private static byte[] IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static short[] asBinder;
    private static int onExtraCallback;
    public static final BaseRoundCornerProgressBarSavedState1 onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {19, 50, -9, 119};
    private static final int $$b = 232;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asInterface = 1;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            if (i3 != 0) {
                objIAuthTabCallback = BaseRoundCornerProgressBarSavedState1.this.IAuthTabCallback(null, null, null, null, null, null, null, this);
                int i4 = 96 / 0;
            } else {
                objIAuthTabCallback = BaseRoundCornerProgressBarSavedState1.this.IAuthTabCallback(null, null, null, null, null, null, null, this);
            }
            int i5 = onExtraCallback + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objIAuthTabCallback;
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.CBC.ordinal()] = 2;
                int i = onExtraCallback + 3;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int i4 = IAuthTabCallback + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private static String $$c(byte b, byte b2, short s) {
        byte[] bArr = $$a;
        int i = 115 - (b2 * 2);
        int i2 = b * 2;
        int i3 = 4 - (s * 2);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i = i4 + i;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i6 = bArr[i3];
            i3++;
            i += i6;
        }
    }

    static {
        IAuthTabCallbackStub = 0;
        IAuthTabCallback();
        onExtraCallbackWithResult = new BaseRoundCornerProgressBarSavedState1();
        int i = asInterface + 69;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | i5;
        int i10 = i8 | i5;
        int i11 = (~((~i5) | i3)) | (~i10);
        int i12 = (~(i4 | i7 | i5)) | (~(i10 | i3));
        int i13 = i5 + i3 + i + (528639218 * i6) + ((-532493036) * i2);
        int i14 = i13 * i13;
        int i15 = ((i5 * 873666089) - 1460666368) + (873666089 * i3) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i) + (1819279360 * i6) + ((-1621098496) * i2) + (586088448 * i14);
        int i16 = (i5 * (-1573143961)) + 2078511484 + (i3 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i * (-1573143025)) + (i6 * 123045422) + (i2 * (-1548035028)) + (i14 * 1845559296);
        return i15 + ((i16 * i16) * 1848705024) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    private BaseRoundCornerProgressBarSavedState1() {
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        BaseRoundCornerProgressBarSavedState1 baseRoundCornerProgressBarSavedState1 = (BaseRoundCornerProgressBarSavedState1) objArr[0];
        Key key = (Key) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[3];
        byte[] bArr2 = (byte[]) objArr[4];
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrIAuthTabCallback = baseRoundCornerProgressBarSavedState1.IAuthTabCallback(key, bArr, iAuthTabCallback, bArr2);
        int i4 = IAuthTabCallback_Parcel + 125;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return bArrIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ JsonObject onWarmupCompleted(BaseRoundCornerProgressBarSavedState1 baseRoundCornerProgressBarSavedState1, String str, CharSequence charSequence, IAuthTabCallback iAuthTabCallback, String str2, OAEPParameterSpec oAEPParameterSpec, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access100 + 99;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            iAuthTabCallback = IAuthTabCallback.GCM;
            int i5 = IAuthTabCallback_Parcel + 9;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        if ((i & 8) != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{'\r', 22, ' ', 1, 7, 17, 20, '\b', 5, 1, 19, 25, 4, 5, 15, '#', '\"', 30, '\b', 7}, (byte) (1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 20 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            str2 = ((String) objArr[0]).intern();
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            int i7 = access100 + 77;
            IAuthTabCallback_Parcel = i7 % 128;
            oAEPParameterSpec = null;
            if (i7 % 2 == 0) {
                throw null;
            }
        }
        return baseRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(str, charSequence, iAuthTabCallback2, str3, oAEPParameterSpec);
    }

    public final JsonObject onExtraCallbackWithResult(@NotNull String str, @NotNull CharSequence charSequence, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull String str2, @Nullable OAEPParameterSpec oAEPParameterSpec) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bArrOnWarmupCompleted = PageKey.onWarmupCompleted(charSequence, null, 1, null);
        JsonObject jsonObjectIAuthTabCallback = IAuthTabCallback(str, bArrOnWarmupCompleted, iAuthTabCallback, str2, oAEPParameterSpec);
        onPageHide.IAuthTabCallback(bArrOnWarmupCompleted);
        int i4 = access100 + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return jsonObjectIAuthTabCallback;
    }

    public final JsonObject IAuthTabCallback(@NotNull String str, @NotNull CharSequence charSequence, @NotNull byte[] bArr, @NotNull Key key, @NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Object obj = null;
        byte[] bArrOnWarmupCompleted = PageKey.onWarmupCompleted(charSequence, null, 1, null);
        int iIAuthTabCallback = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        JsonObject jsonObject = (JsonObject) onExtraCallback(iIAuthTabCallback2, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), 1599298030, iIAuthTabCallback, -1599298029, iIAuthTabCallback3, new Object[]{this, str, bArrOnWarmupCompleted, bArr, key, iAuthTabCallback});
        onPageHide.IAuthTabCallback(bArrOnWarmupCompleted);
        int i4 = IAuthTabCallback_Parcel + 7;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return jsonObject;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        public static final IAuthTabCallback CBC;
        public static final IAuthTabCallback GCM;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static long onWarmupCompleted;

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {CBC, GCM};
            int i5 = i3 + 33;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 6 / 0;
            }
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return enumEntries;
            }
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onNavigationEvent + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 == 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            int i4 = 98 / 0;
            return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $10 + 109;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i5 = $10 + 3;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 45813), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 83, Color.blue(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - Color.red(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, 8808 - (ViewConfiguration.getTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            a(new char[]{49998, 49933, 15374, 57494, 56841, 26622, 22648}, (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr);
            CBC = new IAuthTabCallback(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(new char[]{9312, 9255, 10549, 62892, 12840, 35793, 54858}, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            GCM = new IAuthTabCallback(((String) objArr2[0]).intern(), 1);
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        static void IAuthTabCallback() {
            onWarmupCompleted = 7797215208836278230L;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final JsonObject onExtraCallback(@NotNull String str, @NotNull List<byte[]> list, @NotNull IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        byte[] bArrOnNavigationEvent = Page.onNavigationEvent(str, 0, 1, null);
        Object[] objArr = new Object[1];
        a(new char[]{'\r', 22, 13846}, (byte) (59 - View.resolveSize(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 3, objArr);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new X509EncodedKeySpec(bArrOnNavigationEvent));
        Object[] objArr2 = new Object[1];
        a(new char[]{'#', 7, 13795}, (byte) (TextUtils.getOffsetAfter("", 0) + 26), 3 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(((String) objArr2[0]).intern());
        Intrinsics.checkNotNullExpressionValue(keyGenerator, "");
        SecretKey secretKeyOnWarmupCompleted = getTitleBar.onWarmupCompleted(keyGenerator);
        int i3 = onWarmupCompleted.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i3 != 1) {
            int i4 = access100 + 61;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0 ? i3 != 2 : i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = 16;
        } else {
            i = 12;
        }
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        Intrinsics.checkNotNull(publicKeyGeneratePublic);
        byte[] encoded = secretKeyOnWarmupCompleted.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        byte[] bArrOnNavigationEvent2 = onNavigationEvent(this, publicKeyGeneratePublic, encoded, null, null, 12, null);
        byte[] bArrOnNavigationEvent3 = onNavigationEvent(this, publicKeyGeneratePublic, bArr, null, null, 12, null);
        List<byte[]> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(onExtraCallbackWithResult.IAuthTabCallback(secretKeyOnWarmupCompleted, bArr, iAuthTabCallback, (byte[]) it.next()));
            int i5 = IAuthTabCallback_Parcel + 21;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
        JsonObject jsonObject = new JsonObject();
        Object[] objArr3 = new Object[1];
        b((byte) (KeyEvent.getMaxKeyCode() >> 16), (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1320351683 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-19) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 402261195, objArr3);
        jsonObject.addProperty(((String) objArr3[0]).intern(), Page.onExtraCallbackWithResult(bArrOnNavigationEvent2, 0, 1, null));
        Object[] objArr4 = new Object[1];
        a(new char[]{30, '#'}, (byte) (Color.argb(0, 0, 0, 0) + 93), 1 - ExpandableListView.getPackedPositionChild(0L), objArr4);
        jsonObject.addProperty(((String) objArr4[0]).intern(), Page.onExtraCallbackWithResult(bArrOnNavigationEvent3, 0, 1, null));
        JsonArray jsonArray = new JsonArray();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int i7 = access100 + 115;
            IAuthTabCallback_Parcel = i7 % 128;
            jsonArray.add(i7 % 2 == 0 ? Page.onExtraCallbackWithResult((byte[]) it2.next(), 1, 1, null) : Page.onExtraCallbackWithResult((byte[]) it2.next(), 0, 1, null));
        }
        Unit unit = Unit.INSTANCE;
        Object[] objArr5 = new Object[1];
        b((byte) ((-1) - MotionEvent.axisFromString("")), (short) View.MeasureSpec.getMode(0), TextUtils.lastIndexOf("", '0') + 1320351687, View.combineMeasuredStates(0, 0) - 19, (-402261201) - TextUtils.indexOf("", "", 0, 0), objArr5);
        jsonObject.add(((String) objArr5[0]).intern(), jsonArray);
        return jsonObject;
    }

    public static /* synthetic */ JsonObject onExtraCallbackWithResult(BaseRoundCornerProgressBarSavedState1 baseRoundCornerProgressBarSavedState1, String str, byte[] bArr, IAuthTabCallback iAuthTabCallback, String str2, OAEPParameterSpec oAEPParameterSpec, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 41;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            iAuthTabCallback = IAuthTabCallback.GCM;
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallback_Parcel + 73;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{'\r', 22, ' ', 1, 7, 17, 20, '\b', 5, 1, 19, 25, 4, 5, 15, '#', '\"', 30, '\b', 7}, (byte) (1 - (ViewConfiguration.getScrollBarSize() >> 8)), 20 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            str2 = ((String) objArr[0]).intern();
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            int i7 = IAuthTabCallback_Parcel + 35;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            oAEPParameterSpec = null;
        }
        JsonObject jsonObjectIAuthTabCallback = baseRoundCornerProgressBarSavedState1.IAuthTabCallback(str, bArr, iAuthTabCallback2, str3, oAEPParameterSpec);
        int i9 = access100 + 45;
        IAuthTabCallback_Parcel = i9 % 128;
        int i10 = i9 % 2;
        return jsonObjectIAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final JsonObject IAuthTabCallback(@NotNull String str, @NotNull byte[] bArr, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull String str2, @Nullable OAEPParameterSpec oAEPParameterSpec) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bArrOnNavigationEvent = Page.onNavigationEvent(str, 0, 1, null);
        Object[] objArr = new Object[1];
        a(new char[]{'\r', 22, 13846}, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59), 3 - View.MeasureSpec.getMode(0), objArr);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new X509EncodedKeySpec(bArrOnNavigationEvent));
        Object[] objArr2 = new Object[1];
        a(new char[]{'#', 7, 13795}, (byte) (26 - (ViewConfiguration.getTapTimeout() >> 16)), 3 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(((String) objArr2[0]).intern());
        Intrinsics.checkNotNullExpressionValue(keyGenerator, "");
        SecretKey secretKeyOnWarmupCompleted = getTitleBar.onWarmupCompleted(keyGenerator);
        int i3 = onWarmupCompleted.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i3 != 1) {
            int i4 = access100;
            int i5 = i4 + 117;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0 ? i3 != 2 : i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = i4 + 57;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            i = 16;
        } else {
            i = 12;
        }
        byte[] bArr2 = new byte[i];
        new SecureRandom().nextBytes(bArr2);
        Intrinsics.checkNotNull(publicKeyGeneratePublic);
        byte[] encoded = secretKeyOnWarmupCompleted.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        byte[] bArrOnNavigationEvent2 = onNavigationEvent(publicKeyGeneratePublic, encoded, str2, oAEPParameterSpec);
        byte[] bArrOnNavigationEvent3 = onNavigationEvent(publicKeyGeneratePublic, bArr2, str2, oAEPParameterSpec);
        byte[] bArrIAuthTabCallback = IAuthTabCallback(secretKeyOnWarmupCompleted, bArr2, iAuthTabCallback, bArr);
        JsonObject jsonObject = new JsonObject();
        Object[] objArr3 = new Object[1];
        b((byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1320351683, (-19) - (ViewConfiguration.getTouchSlop() >> 8), (-402261195) - TextUtils.indexOf((CharSequence) "", '0'), objArr3);
        jsonObject.addProperty(((String) objArr3[0]).intern(), Page.onExtraCallbackWithResult(bArrOnNavigationEvent2, 0, 1, null));
        Object[] objArr4 = new Object[1];
        a(new char[]{30, '#'}, (byte) (93 - (Process.myPid() >> 22)), 2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        jsonObject.addProperty(((String) objArr4[0]).intern(), Page.onExtraCallbackWithResult(bArrOnNavigationEvent3, 0, 1, null));
        Object[] objArr5 = new Object[1];
        a(new char[]{'#', 15, '#', 23}, (byte) (37 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr5);
        jsonObject.addProperty(((String) objArr5[0]).intern(), Page.onExtraCallbackWithResult(bArrIAuthTabCallback, 0, 1, null));
        int i8 = IAuthTabCallback_Parcel + 101;
        access100 = i8 % 128;
        int i9 = i8 % 2;
        return jsonObject;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        BaseRoundCornerProgressBarSavedState1 baseRoundCornerProgressBarSavedState1 = (BaseRoundCornerProgressBarSavedState1) objArr[0];
        String str = (String) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        byte[] bArr2 = (byte[]) objArr[3];
        Key key = (Key) objArr[4];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[5];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        byte[] bArrOnNavigationEvent = Page.onNavigationEvent(str, 0, 1, null);
        Object[] objArr2 = new Object[1];
        a(new char[]{'\r', 22, 13846}, (byte) (KeyEvent.keyCodeFromString("") + 59), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, objArr2);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(((String) objArr2[0]).intern()).generatePublic(new X509EncodedKeySpec(bArrOnNavigationEvent));
        Intrinsics.checkNotNull(publicKeyGeneratePublic);
        byte[] encoded = key.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        byte[] bArrOnNavigationEvent2 = onNavigationEvent(baseRoundCornerProgressBarSavedState1, publicKeyGeneratePublic, encoded, null, null, 12, null);
        byte[] bArrOnNavigationEvent3 = onNavigationEvent(baseRoundCornerProgressBarSavedState1, publicKeyGeneratePublic, bArr2, null, null, 12, null);
        byte[] bArrIAuthTabCallback = baseRoundCornerProgressBarSavedState1.IAuthTabCallback(key, bArr2, iAuthTabCallback, bArr);
        JsonObject jsonObject = new JsonObject();
        Object[] objArr3 = new Object[1];
        b((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (short) (ViewConfiguration.getScrollBarSize() >> 8), 1320351684 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') - 18, View.resolveSize(0, 0) - 402261194, objArr3);
        jsonObject.addProperty(((String) objArr3[0]).intern(), Page.onExtraCallbackWithResult(bArrOnNavigationEvent2, 0, 1, null));
        Object[] objArr4 = new Object[1];
        a(new char[]{30, '#'}, (byte) (Color.green(0) + 93), KeyEvent.getDeadChar(0, 0) + 2, objArr4);
        jsonObject.addProperty(((String) objArr4[0]).intern(), Page.onExtraCallbackWithResult(bArrOnNavigationEvent3, 0, 1, null));
        Object[] objArr5 = new Object[1];
        a(new char[]{'#', 15, '#', 23}, (byte) (37 - TextUtils.getTrimmedLength("")), 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
        jsonObject.addProperty(((String) objArr5[0]).intern(), Page.onExtraCallbackWithResult(bArrIAuthTabCallback, 0, 1, null));
        int i2 = access100 + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return jsonObject;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(BaseRoundCornerProgressBarSavedState1 baseRoundCornerProgressBarSavedState1, String str, List list, byte[] bArr, String str2, IAuthTabCallback iAuthTabCallback, String str3, OAEPParameterSpec oAEPParameterSpec, access13800 access13800Var, int i, Object obj) throws Throwable {
        IAuthTabCallback iAuthTabCallback2;
        String strIntern;
        OAEPParameterSpec oAEPParameterSpec2;
        IAuthTabCallback iAuthTabCallback3;
        int i2 = 2 % 2;
        if ((i & 16) != 0) {
            int i3 = access100 + 75;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                iAuthTabCallback3 = IAuthTabCallback.GCM;
                int i4 = 16 / 0;
            } else {
                iAuthTabCallback3 = IAuthTabCallback.GCM;
            }
            iAuthTabCallback2 = iAuthTabCallback3;
        } else {
            iAuthTabCallback2 = iAuthTabCallback;
        }
        if ((i & 32) != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{'\r', 22, ' ', 1, 7, 17, 20, '\b', 5, 1, 19, 25, 4, 5, 15, '#', '\"', 30, '\b', 7}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            strIntern = str3;
        }
        if ((i & 64) != 0) {
            int i5 = IAuthTabCallback_Parcel + 15;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            oAEPParameterSpec2 = null;
        } else {
            oAEPParameterSpec2 = oAEPParameterSpec;
        }
        return baseRoundCornerProgressBarSavedState1.IAuthTabCallback(str, list, bArr, str2, iAuthTabCallback2, strIntern, oAEPParameterSpec2, access13800Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0346 A[LOOP:0: B:40:0x0340->B:42:0x0346, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0383  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull String str, @NotNull List<byte[]> list, @Nullable byte[] bArr, @NotNull String str2, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull String str3, @Nullable OAEPParameterSpec oAEPParameterSpec, @NotNull access13800<? super JsonObject> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        int i;
        String str4;
        CharSequence charSequence;
        KeyFactory keyFactory;
        PublicKey publicKey;
        X509EncodedKeySpec x509EncodedKeySpec;
        String str5;
        Object obj;
        SecretKey secretKey;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        List<byte[]> list2;
        IAuthTabCallback iAuthTabCallback2;
        OAEPParameterSpec oAEPParameterSpec2;
        int i2;
        byte[] bArr5;
        byte[] bArr6;
        String str6;
        IAuthTabCallback iAuthTabCallback3;
        byte[] bArr7;
        SecretKey secretKey2;
        byte[] bArr8;
        byte[] bArr9;
        String str7;
        byte[] bArr10;
        byte[] bArrIAuthTabCallback;
        Iterator it;
        int i3;
        String strOnExtraCallbackWithResult;
        int i4 = 2 % 2;
        if (Class.forName("o.BaseRoundCornerProgressBarSavedState1$onExtraCallback").isInstance(access13800Var)) {
            int i5 = access100 + 87;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = ((onExtraCallback) access13800Var).label;
                throw null;
            }
            onextracallback = (onExtraCallback) access13800Var;
            int i7 = onextracallback.label;
            if ((Integer.MIN_VALUE & i7) != 0) {
                int i8 = IAuthTabCallback_Parcel + 121;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                onextracallback.label = i7 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj2 = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i10 = onextracallback.label;
        if (i10 == 0) {
            ResultKt.onNavigationEvent(obj2);
            byte[] bArrOnNavigationEvent = Page.onNavigationEvent(str, 0, 1, null);
            Object[] objArr = new Object[1];
            a(new char[]{'\r', 22, 13846}, (byte) (59 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.resolveSizeAndState(0, 0, 0) + 3, objArr);
            KeyFactory keyFactory2 = KeyFactory.getInstance(((String) objArr[0]).intern());
            X509EncodedKeySpec x509EncodedKeySpec2 = new X509EncodedKeySpec(bArrOnNavigationEvent);
            PublicKey publicKeyGeneratePublic = keyFactory2.generatePublic(x509EncodedKeySpec2);
            Object[] objArr2 = new Object[1];
            a(new char[]{'#', 7, 13795}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26), ((byte) KeyEvent.getModifierMetaStateMask()) + 4, objArr2);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(keyGenerator, "");
            SecretKey secretKeyOnWarmupCompleted = getTitleBar.onWarmupCompleted(keyGenerator);
            int i11 = onWarmupCompleted.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
            if (i11 == 1) {
                i = 12;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 16;
            }
            byte[] bArr11 = new byte[i];
            new SecureRandom().nextBytes(bArr11);
            Intrinsics.checkNotNull(publicKeyGeneratePublic);
            byte[] encoded = secretKeyOnWarmupCompleted.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "");
            byte[] bArrOnNavigationEvent2 = onNavigationEvent(publicKeyGeneratePublic, encoded, str3, oAEPParameterSpec);
            byte[] bArrOnNavigationEvent3 = onNavigationEvent(publicKeyGeneratePublic, bArr11, str3, oAEPParameterSpec);
            onNavigationEvent onnavigationevent = new onNavigationEvent(list, secretKeyOnWarmupCompleted, bArr11, iAuthTabCallback, (access13800) null);
            onextracallback.L$0 = access15400.onNavigationEvent(str);
            onextracallback.L$1 = access15400.onNavigationEvent(list);
            onextracallback.L$2 = bArr;
            onextracallback.L$3 = str2;
            onextracallback.L$4 = iAuthTabCallback;
            onextracallback.L$5 = access15400.onNavigationEvent(str3);
            onextracallback.L$6 = access15400.onNavigationEvent(oAEPParameterSpec);
            onextracallback.L$7 = access15400.onNavigationEvent(bArrOnNavigationEvent);
            onextracallback.L$8 = access15400.onNavigationEvent(keyFactory2);
            onextracallback.L$9 = access15400.onNavigationEvent(x509EncodedKeySpec2);
            onextracallback.L$10 = access15400.onNavigationEvent(publicKeyGeneratePublic);
            onextracallback.L$11 = secretKeyOnWarmupCompleted;
            onextracallback.L$12 = bArr11;
            onextracallback.L$13 = bArrOnNavigationEvent2;
            onextracallback.L$14 = bArrOnNavigationEvent3;
            onextracallback.I$0 = i;
            onextracallback.label = 1;
            Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(onnavigationevent, onextracallback);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                str4 = str;
                charSequence = "";
                keyFactory = keyFactory2;
                publicKey = publicKeyGeneratePublic;
                x509EncodedKeySpec = x509EncodedKeySpec2;
                str5 = str2;
                obj = objOnExtraCallbackWithResult;
                secretKey = secretKeyOnWarmupCompleted;
                bArr2 = bArr11;
                bArr3 = bArrOnNavigationEvent;
                bArr4 = bArrOnNavigationEvent2;
                list2 = list;
                iAuthTabCallback2 = iAuthTabCallback;
                oAEPParameterSpec2 = oAEPParameterSpec;
                i2 = i;
                bArr5 = bArrOnNavigationEvent3;
                bArr6 = bArr;
                str6 = str3;
            }
            return objOnWarmupCompleted;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                Object[] objArr3 = new Object[1];
                a(new char[]{23, '\f', 13906, 13906, 11, 28, 4, 11, 24, 15, 27, 22, 27, 7, 29, 28, 16, 28, 26, 22, 0, 17, '\"', 16, 29, '!', '\n', 31, 0, 2, 29, 28, 11, 22, 5, '#', 28, 6, 23, 0, 17, 0, 26, 24, 31, 11, 13915}, (byte) (View.resolveSizeAndState(0, 0, 0) + 92), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 46, objArr3);
                throw new IllegalStateException(((String) objArr3[0]).intern());
            }
            bArr7 = (byte[]) onextracallback.L$14;
            bArr10 = (byte[]) onextracallback.L$13;
            bArr8 = (byte[]) onextracallback.L$12;
            secretKey2 = (SecretKey) onextracallback.L$11;
            iAuthTabCallback3 = (IAuthTabCallback) onextracallback.L$4;
            str7 = (String) onextracallback.L$3;
            bArr9 = (byte[]) onextracallback.L$2;
            ResultKt.onNavigationEvent(obj2);
            charSequence = "";
            List list3 = (List) obj2;
            bArrIAuthTabCallback = bArr9 == null ? onExtraCallbackWithResult.IAuthTabCallback(secretKey2, bArr8, iAuthTabCallback3, bArr9) : null;
            JsonObject jsonObject = new JsonObject();
            CharSequence charSequence2 = charSequence;
            Object[] objArr4 = new Object[1];
            b((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (short) (Color.rgb(0, 0, 0) + 16777216), 1320351682 - TextUtils.indexOf(charSequence2, '0'), ((Process.getThreadPriority(0) + 20) >> 6) - 19, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 402261194, objArr4);
            jsonObject.addProperty(((String) objArr4[0]).intern(), Page.onExtraCallbackWithResult(bArr10, 0, 1, null));
            Object[] objArr5 = new Object[1];
            a(new char[]{30, '#'}, (byte) (Drawable.resolveOpacity(0, 0) + 93), 1 - TextUtils.indexOf(charSequence2, '0'), objArr5);
            jsonObject.addProperty(((String) objArr5[0]).intern(), Page.onExtraCallbackWithResult(bArr7, 0, 1, null));
            JsonObject jsonObject2 = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            it = list3.iterator();
            while (it.hasNext()) {
                int i12 = IAuthTabCallback_Parcel + 7;
                access100 = i12 % 128;
                int i13 = i12 % 2;
                jsonArray.add(Page.onExtraCallbackWithResult((byte[]) it.next(), 0, 1, null));
            }
            Unit unit = Unit.INSTANCE;
            jsonObject2.add(str7, jsonArray);
            if (bArrIAuthTabCallback == null) {
                int i14 = access100 + 37;
                IAuthTabCallback_Parcel = i14 % 128;
                if (i14 % 2 == 0) {
                    i3 = 0;
                    strOnExtraCallbackWithResult = Page.onExtraCallbackWithResult(bArrIAuthTabCallback, 0, 0, null);
                } else {
                    i3 = 0;
                    strOnExtraCallbackWithResult = Page.onExtraCallbackWithResult(bArrIAuthTabCallback, 0, 1, null);
                }
            } else {
                i3 = 0;
                strOnExtraCallbackWithResult = null;
            }
            Object[] objArr6 = new Object[1];
            a(new char[]{23, '\f', '\t', 31, 30, '\"', 23, '#', 29, 27, 11, 15, '\n', 24}, (byte) (99 - View.MeasureSpec.getSize(i3)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, objArr6);
            jsonObject2.addProperty(((String) objArr6[i3]).intern(), strOnExtraCallbackWithResult);
            Object[] objArr7 = new Object[1];
            a(new char[]{'#', 15, '#', 23}, (byte) (37 - (ViewConfiguration.getTouchSlop() >> 8)), ((Process.getThreadPriority(0) + 20) >> 6) + 4, objArr7);
            jsonObject.add(((String) objArr7[0]).intern(), jsonObject2);
            return jsonObject;
        }
        int i15 = onextracallback.I$0;
        byte[] bArr12 = (byte[]) onextracallback.L$14;
        byte[] bArr13 = (byte[]) onextracallback.L$13;
        byte[] bArr14 = (byte[]) onextracallback.L$12;
        SecretKey secretKey3 = (SecretKey) onextracallback.L$11;
        PublicKey publicKey2 = (PublicKey) onextracallback.L$10;
        X509EncodedKeySpec x509EncodedKeySpec3 = (X509EncodedKeySpec) onextracallback.L$9;
        KeyFactory keyFactory3 = (KeyFactory) onextracallback.L$8;
        byte[] bArr15 = (byte[]) onextracallback.L$7;
        oAEPParameterSpec2 = (OAEPParameterSpec) onextracallback.L$6;
        str6 = (String) onextracallback.L$5;
        IAuthTabCallback iAuthTabCallback4 = (IAuthTabCallback) onextracallback.L$4;
        String str8 = (String) onextracallback.L$3;
        byte[] bArr16 = (byte[]) onextracallback.L$2;
        List<byte[]> list4 = (List) onextracallback.L$1;
        str4 = (String) onextracallback.L$0;
        ResultKt.onNavigationEvent(obj2);
        list2 = list4;
        charSequence = "";
        secretKey = secretKey3;
        keyFactory = keyFactory3;
        publicKey = publicKey2;
        x509EncodedKeySpec = x509EncodedKeySpec3;
        obj = obj2;
        bArr4 = bArr13;
        bArr3 = bArr15;
        bArr2 = bArr14;
        i2 = i15;
        iAuthTabCallback2 = iAuthTabCallback4;
        str5 = str8;
        bArr5 = bArr12;
        bArr6 = bArr16;
        onextracallback.L$0 = access15400.onNavigationEvent(str4);
        onextracallback.L$1 = access15400.onNavigationEvent(list2);
        onextracallback.L$2 = bArr6;
        onextracallback.L$3 = str5;
        onextracallback.L$4 = iAuthTabCallback2;
        onextracallback.L$5 = access15400.onNavigationEvent(str6);
        onextracallback.L$6 = access15400.onNavigationEvent(oAEPParameterSpec2);
        onextracallback.L$7 = access15400.onNavigationEvent(bArr3);
        onextracallback.L$8 = access15400.onNavigationEvent(keyFactory);
        onextracallback.L$9 = access15400.onNavigationEvent(x509EncodedKeySpec);
        onextracallback.L$10 = access15400.onNavigationEvent(publicKey);
        onextracallback.L$11 = secretKey;
        onextracallback.L$12 = bArr2;
        onextracallback.L$13 = bArr4;
        onextracallback.L$14 = bArr5;
        onextracallback.I$0 = i2;
        onextracallback.label = 2;
        Object objIAuthTabCallback = ResourceCallback.IAuthTabCallback((Collection) obj, onextracallback);
        if (objIAuthTabCallback != objOnWarmupCompleted) {
            iAuthTabCallback3 = iAuthTabCallback2;
            bArr7 = bArr5;
            secretKey2 = secretKey;
            bArr8 = bArr2;
            bArr9 = bArr6;
            str7 = str5;
            bArr10 = bArr4;
            obj2 = objIAuthTabCallback;
            List list32 = (List) obj2;
            if (bArr9 == null) {
            }
            JsonObject jsonObject3 = new JsonObject();
            CharSequence charSequence22 = charSequence;
            Object[] objArr42 = new Object[1];
            b((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (short) (Color.rgb(0, 0, 0) + 16777216), 1320351682 - TextUtils.indexOf(charSequence22, '0'), ((Process.getThreadPriority(0) + 20) >> 6) - 19, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 402261194, objArr42);
            jsonObject3.addProperty(((String) objArr42[0]).intern(), Page.onExtraCallbackWithResult(bArr10, 0, 1, null));
            Object[] objArr52 = new Object[1];
            a(new char[]{30, '#'}, (byte) (Drawable.resolveOpacity(0, 0) + 93), 1 - TextUtils.indexOf(charSequence22, '0'), objArr52);
            jsonObject3.addProperty(((String) objArr52[0]).intern(), Page.onExtraCallbackWithResult(bArr7, 0, 1, null));
            JsonObject jsonObject22 = new JsonObject();
            JsonArray jsonArray2 = new JsonArray();
            it = list32.iterator();
            while (it.hasNext()) {
            }
            Unit unit2 = Unit.INSTANCE;
            jsonObject22.add(str7, jsonArray2);
            if (bArrIAuthTabCallback == null) {
            }
            Object[] objArr62 = new Object[1];
            a(new char[]{23, '\f', '\t', 31, 30, '\"', 23, '#', 29, 27, 11, 15, '\n', 24}, (byte) (99 - View.MeasureSpec.getSize(i3)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, objArr62);
            jsonObject22.addProperty(((String) objArr62[i3]).intern(), strOnExtraCallbackWithResult);
            Object[] objArr72 = new Object[1];
            a(new char[]{'#', 15, '#', 23}, (byte) (37 - (ViewConfiguration.getTouchSlop() >> 8)), ((Process.getThreadPriority(0) + 20) >> 6) + 4, objArr72);
            jsonObject3.add(((String) objArr72[0]).intern(), jsonObject22);
            return jsonObject3;
        }
        return objOnWarmupCompleted;
    }

    public final EncryptedDataRequest onExtraCallback(@NotNull String str, @NotNull CharSequence charSequence, @NotNull IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        JsonObject jsonObjectOnWarmupCompleted = onWarmupCompleted(this, str, charSequence, iAuthTabCallback, null, null, 24, null);
        Object[] objArr = new Object[1];
        b((byte) View.getDefaultSize(0, 0), (short) (ExpandableListView.getPackedPositionChild(0L) + 1), 1320351684 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-18) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-402261195) - MotionEvent.axisFromString(""), objArr);
        String asString = jsonObjectOnWarmupCompleted.get(((String) objArr[0]).intern()).getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{30, '#'}, (byte) (93 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3, objArr2);
        String asString2 = jsonObjectOnWarmupCompleted.get(((String) objArr2[0]).intern()).getAsString();
        Intrinsics.checkNotNullExpressionValue(asString2, "");
        Object[] objArr3 = new Object[1];
        a(new char[]{'#', 15, '#', 23}, (byte) (View.MeasureSpec.getSize(0) + 37), '4' - AndroidCharacter.getMirror('0'), objArr3);
        String asString3 = jsonObjectOnWarmupCompleted.get(((String) objArr3[0]).intern()).getAsString();
        Intrinsics.checkNotNullExpressionValue(asString3, "");
        EncryptedDataRequest encryptedDataRequest = new EncryptedDataRequest(asString, asString2, asString3);
        int i2 = access100 + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return encryptedDataRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ byte[] onNavigationEvent(BaseRoundCornerProgressBarSavedState1 baseRoundCornerProgressBarSavedState1, PublicKey publicKey, byte[] bArr, String str, OAEPParameterSpec oAEPParameterSpec, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 75;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{'\r', 22, ' ', 1, 7, 17, 20, '\b', 5, 1, 19, 25, 4, 5, 15, '#', '\"', 30, '\b', 7}, (byte) (-Process.getGidForName("")), 21 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            str = ((String) objArr[0]).intern();
            int i5 = access100 + 109;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 8) != 0) {
            int i7 = IAuthTabCallback_Parcel + 45;
            access100 = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            oAEPParameterSpec = null;
        }
        byte[] bArrOnNavigationEvent = baseRoundCornerProgressBarSavedState1.onNavigationEvent(publicKey, bArr, str, oAEPParameterSpec);
        int i8 = access100 + 71;
        IAuthTabCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return bArrOnNavigationEvent;
    }

    private final byte[] onNavigationEvent(PublicKey publicKey, byte[] bArr, String str, OAEPParameterSpec oAEPParameterSpec) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Cipher cipher = Cipher.getInstance(str);
        if (oAEPParameterSpec != null) {
            cipher.init(1, publicKey, oAEPParameterSpec);
        } else {
            int i4 = IAuthTabCallback_Parcel + 89;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                cipher.init(0, publicKey);
            } else {
                cipher.init(1, publicKey);
            }
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
        int i5 = IAuthTabCallback_Parcel + 113;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return bArrDoFinal;
        }
        throw null;
    }

    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) "", '0', 0)), 42 - View.MeasureSpec.getMode(0), 22439 - TextUtils.getCapsMode("", 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 39;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i8 = $11 + 9;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr = IAuthTabCallbackDefault;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 12843), (ViewConfiguration.getScrollBarSize() >> 8) + 55, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = IAuthTabCallbackDefault;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 43424), TextUtils.indexOf((CharSequence) "", '0') + 43, KeyEvent.keyCodeFromString("") + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (asBinder[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = $11 + 79;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onTransact), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 87 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallbackDefault;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = asBinder;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = IAuthTabCallbackDefault;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final byte[] IAuthTabCallback(Key key, byte[] bArr, IAuthTabCallback iAuthTabCallback, byte[] bArr2) throws Throwable {
        int i;
        setupStyleable setupstyleableOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 9;
        access100 = i3 % 128;
        if (i3 % 2 == 0 ? (i = onWarmupCompleted.onExtraCallbackWithResult[iAuthTabCallback.ordinal()]) == 1 : (i = onWarmupCompleted.onExtraCallbackWithResult[iAuthTabCallback.ordinal()]) == 0) {
            setupstyleableOnNavigationEvent = setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, key, new GCMParameterSpec(128, bArr), (byte[]) null, 4, (Object) null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            setupstyleableOnNavigationEvent = setProgressColor.Companion.onNavigationEvent(key, new IvParameterSpec(bArr));
        }
        byte[] bArrA_ = setupstyleableOnNavigationEvent.a_(bArr2);
        int i4 = IAuthTabCallback_Parcel + 69;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return bArrA_;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        long j;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (ViewConfiguration.getFadingEdgeLength() >> 16) + 26, Color.green(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        long j2 = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 26 - (ViewConfiguration.getPressedStateDuration() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = i + 80;
                cArr4[i2] = (char) (cArr[i2] << b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $10 + 83;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i8 = $10 + 69;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    j = j2;
                } else {
                    try {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 24825), (ViewConfiguration.getFadingEdgeLength() >> 16) + 74, 8088 - KeyEvent.keyCodeFromString(""), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i10 = $11 + 73;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                j = 0;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 30, 19489 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                j = 0;
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            j = 0;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i13 = $10 + 79;
                                $11 = i13 % 128;
                                int i14 = i13 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                            } else {
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                j2 = j;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            int i20 = $11 + 9;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static final /* synthetic */ byte[] IAuthTabCallback(BaseRoundCornerProgressBarSavedState1 baseRoundCornerProgressBarSavedState1, Key key, byte[] bArr, IAuthTabCallback iAuthTabCallback, byte[] bArr2) {
        int iIAuthTabCallback = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        return (byte[]) onExtraCallback(iIAuthTabCallback2, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), 1360578103, iIAuthTabCallback, -1360578103, iIAuthTabCallback3, new Object[]{baseRoundCornerProgressBarSavedState1, key, bArr, iAuthTabCallback, bArr2});
    }

    public final JsonObject onWarmupCompleted(@NotNull String str, @NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull Key key, @NotNull IAuthTabCallback iAuthTabCallback) {
        int iIAuthTabCallback = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
        return (JsonObject) onExtraCallback(iIAuthTabCallback2, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), 1599298030, iIAuthTabCallback, -1599298029, iIAuthTabCallback3, new Object[]{this, str, bArr, bArr2, key, iAuthTabCallback});
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{65016, 64984, 64924, 64898, 64995, 64988, 64980, 64989, 65021, 64990, 64915, 65014, 64961, 65008, 65009, 64991, 64993, 64978, 64976, 64992, 64981, 64960, 64977, 64964, 64987, 64966, 65018, 64916, 64982, 64967, 65019, 65010, 65020, 64983, 64965, 64986};
        IAuthTabCallback = (char) 51247;
        onExtraCallback = 353030197;
        onWarmupCompleted = -1538795494;
        onTransact = -1279402691;
        IAuthTabCallbackDefault = new byte[]{-7, 28, -14, -5, -16, 9, 27, -11};
    }
}
