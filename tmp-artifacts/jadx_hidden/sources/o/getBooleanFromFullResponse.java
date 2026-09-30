package o;

import android.content.Context;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import im.toss.selfprotect.DexguardWrapper$;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getBooleanFromAdObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class getBooleanFromFullResponse implements newArray {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static final long IAuthTabCallback;
    private static byte[] IAuthTabCallbackStubProxy = null;
    private static char[] IAuthTabCallback_Parcel = null;
    private static int ICustomTabsCallback = 0;
    private static int access000 = 0;
    private static int access100 = 0;
    private static int asInterface = 0;
    private static boolean extraCallback = false;
    private static boolean extraCallbackWithResult = false;
    private static short[] getInterfaceDescriptor = null;
    private static int onActivityResized = 1;
    private static final String onExtraCallback;
    public static final String onExtraCallbackWithResult;
    private static int onMessageChannelReady = 0;
    private static final String onNavigationEvent;
    public static final String onWarmupCompleted;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private final getBooleanFromAdObject IAuthTabCallbackDefault;
    private final Map<s8ExternalSyntheticLambda1, Long> IAuthTabCallbackStub;
    private final EnumSet<s8ExternalSyntheticLambda1> asBinder;
    private final Function0<TextRoundCornerProgressBarSavedState1> onTransact;

    public static final /* synthetic */ class onExtraCallback {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallback.class);
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[startRearDisplaySession.values().length];
            try {
                int iOrdinal = startRearDisplaySession.LOW.ordinal();
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5171);
                iArr[iOrdinal] = 1;
                int i = onNavigationEvent;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
                if (((((~i) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i)) & 1) != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[startRearDisplaySession.HIGH.ordinal()] = 2;
                int i3 = onNavigationEvent;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3073);
                int i4 = i3 & iOnWarmupCompleted2;
                if ((((((i3 ^ iOnWarmupCompleted2) | i4) & (~i4)) >> 27) & 1) != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[startRearDisplaySession.MAX.ordinal()] = 3;
                int i6 = onNavigationEvent;
                int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5014);
                int i7 = (~iOnWarmupCompleted3) & i6;
                int i8 = (~i6) & iOnWarmupCompleted3;
                if ((1 & (((i8 & i7) | (i7 ^ i8)) >> 2)) == 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
        }
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(s8ExternalSyntheticLambda1 s8externalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(s8externalsyntheticlambda1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CharSequence charSequenceOnExtraCallback = onExtraCallback(s8externalsyntheticlambda1);
        int i3 = ICustomTabsCallback + 95;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return charSequenceOnExtraCallback;
    }

    public static /* synthetic */ CharSequence onNavigationEvent(IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(iconRoundCornerProgressBarOnIconClickListener);
        }
        IAuthTabCallback(iconRoundCornerProgressBarOnIconClickListener);
        throw null;
    }

    public static /* synthetic */ CharSequence onNavigationEvent(s8ExternalSyntheticLambda1 s8externalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnTransact = onTransact(s8externalsyntheticlambda1);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return charSequenceOnTransact;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(iconRoundCornerProgressBarOnIconClickListener);
        int i4 = ICustomTabsCallback + 75;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallbackWithResult;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(s8ExternalSyntheticLambda1 s8externalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(s8externalsyntheticlambda1);
        int i4 = writeTypedObject + 65;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8 | i3);
        int i10 = ~i3;
        int i11 = (~(i7 | i10)) | (~(i8 | i4 | i3));
        int i12 = (~(i3 | i7)) | (~(i8 | i10));
        int i13 = i4 + i + i6 + ((-1255669517) * i2) + (533247121 * i5);
        int i14 = i13 * i13;
        int i15 = ((i4 * (-1895547823)) - 858849280) + ((-1895547823) * i) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i6) + (760610816 * i2) + ((-1057882112) * i5) + (1344208896 * i14);
        int i16 = ((i4 * (-122328301)) - 2132886715) + (i * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i6 * (-122328029)) + (i2 * (-1196579527)) + (i5 * 656595923) + (i14 * 138215424);
        return i15 + ((i16 * i16) * (-833028096)) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public getBooleanFromFullResponse(@NotNull EnumSet<s8ExternalSyntheticLambda1> enumSet, @NotNull Function0<? extends TextRoundCornerProgressBarSavedState1> function0) {
        Intrinsics.checkNotNullParameter(enumSet, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.asBinder = enumSet;
        this.onTransact = function0;
        this.IAuthTabCallbackStub = new LinkedHashMap();
        this.IAuthTabCallbackDefault = new getBooleanFromAdObject(enumSet);
    }

    private static final CharSequence onExtraCallback(s8ExternalSyntheticLambda1 s8externalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String id = s8externalsyntheticlambda1.getDetectFactor().getId();
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = ICustomTabsCallback + 19;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return id;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        s8ExternalSyntheticLambda1 s8externalsyntheticlambda1 = (s8ExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 59;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        IconRoundCornerProgressBarSavedState1 detectFactor = s8externalsyntheticlambda1.getDetectFactor();
        if (i3 == 0) {
            return detectFactor.getId();
        }
        detectFactor.getId();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        s8ExternalSyntheticLambda1 s8externalsyntheticlambda1 = (s8ExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String id = s8externalsyntheticlambda1.getDetectFactor().getId();
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        int i5 = ICustomTabsCallback + 63;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return id;
    }

    private static final CharSequence onExtraCallbackWithResult(IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iconRoundCornerProgressBarOnIconClickListener, "");
            iconRoundCornerProgressBarOnIconClickListener.onExtraCallbackWithResult().getId();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iconRoundCornerProgressBarOnIconClickListener, "");
        String id = iconRoundCornerProgressBarOnIconClickListener.onExtraCallbackWithResult().getId();
        int i3 = ICustomTabsCallback + 105;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return id;
        }
        throw null;
    }

    private static final CharSequence IAuthTabCallback(IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iconRoundCornerProgressBarOnIconClickListener, "");
        String id = iconRoundCornerProgressBarOnIconClickListener.onExtraCallbackWithResult().getId();
        int i4 = writeTypedObject + 91;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return id;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.newArray
    public Set<IconRoundCornerProgressBarOnIconClickListener> onNavigationEvent(@NotNull Context context, @NotNull startRearDisplaySession startreardisplaysession, @NotNull String str) throws NoWhenBranchMatchedException {
        EnumSet enumSetOf;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(startreardisplaysession, "");
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted();
        containsKeyForAdObject.onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        b(null, new byte[]{-105, -119, -118, -113, -118, -119, -107, -106, -107, -122, -127, -126, -108, -109, -110, -116, -118, -115, -116}, null, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr);
        ((String) objArr[0]).intern();
        Objects.toString(startreardisplaysession);
        Object[] objArr2 = new Object[1];
        a((short) ((-15) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 187135145, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 517141098, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 78, objArr2);
        ((String) objArr2[0]).intern();
        Context applicationContext = context.getApplicationContext();
        int i2 = onExtraCallback.onWarmupCompleted[startreardisplaysession.ordinal()];
        if (i2 != 1) {
            int i3 = writeTypedObject + 89;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            if (i2 == 2) {
                enumSetOf = EnumSet.of(s8ExternalSyntheticLambda1.HOOK, s8ExternalSyntheticLambda1.DEBUGGER, s8ExternalSyntheticLambda1.EMULATOR);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                enumSetOf = EnumSet.of(s8ExternalSyntheticLambda1.HOOK, s8ExternalSyntheticLambda1.DEBUGGER, s8ExternalSyntheticLambda1.EMULATOR, s8ExternalSyntheticLambda1.TAMPER_CERT, s8ExternalSyntheticLambda1.ROOT);
            }
        } else {
            enumSetOf = EnumSet.of(s8ExternalSyntheticLambda1.DEBUGGER, s8ExternalSyntheticLambda1.EMULATOR);
        }
        EnumSet enumSet = enumSetOf;
        Intrinsics.checkNotNull(enumSet);
        Set<? extends s8ExternalSyntheticLambda1> setIntersect = CollectionsKt.intersect(enumSet, this.asBinder);
        containsKeyForAdObject.onExtraCallbackWithResult();
        startreardisplaysession.getLevel();
        Set<? extends s8ExternalSyntheticLambda1> set = setIntersect;
        CollectionsKt.joinToString$default(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new DexguardWrapper$.ExternalSyntheticLambda0(), 31, (Object) null);
        Object[] objArr3 = new Object[1];
        b(null, new byte[]{-104, -107, -122, -127, -126, -108, -109, -110, -116, -118, -115, -116}, null, (Process.myPid() >> 22) + 127, objArr3);
        ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((short) (Color.argb(0, 0, 0, 0) + 2), (byte) (ViewConfiguration.getTapTimeout() >> 16), 187135151 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getOffsetBefore("", 0) - 517141110, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 78, objArr4);
        ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b(null, new byte[]{-104, -107, -111, -119, -108, -125, -118, -127, -107, -102, -103}, null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, objArr5);
        ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a((short) (61 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (Process.myTid() >> 22), 187135155 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-517141101) + (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) - 78, objArr6);
        ((String) objArr6[0]).intern();
        containsKeyForAdObject.onExtraCallbackWithResult();
        CollectionsKt.joinToString$default(enumSet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new DexguardWrapper$.ExternalSyntheticLambda1(), 31, (Object) null);
        CollectionsKt.joinToString$default(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new DexguardWrapper$.ExternalSyntheticLambda2(), 31, (Object) null);
        Object[] objArr7 = new Object[1];
        a((short) (View.resolveSizeAndState(0, 0, 0) - 49), (byte) Color.blue(0), 187135156 - (Process.myPid() >> 22), (-517141043) - (ViewConfiguration.getLongPressTimeout() >> 16), (-79) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr7);
        ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a((short) ((-85) - (ViewConfiguration.getScrollBarSize() >> 8)), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 187135191, (-517141101) - (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.getDeadChar(0, 0) - 78, objArr8);
        ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a((short) (62 - (ViewConfiguration.getTouchSlop() >> 8)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 187135155 - (ViewConfiguration.getScrollBarSize() >> 8), (-517141101) - TextUtils.getCapsMode("", 0, 0), (-78) - Color.red(0), objArr9);
        ((String) objArr9[0]).intern();
        Intrinsics.checkNotNull(applicationContext);
        Set<IconRoundCornerProgressBarOnIconClickListener> setOnWarmupCompleted = onWarmupCompleted(applicationContext, setIntersect);
        if (!setOnWarmupCompleted.isEmpty()) {
            containsKeyForAdObject.onExtraCallbackWithResult();
            CollectionsKt.joinToString$default(setOnWarmupCompleted, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new DexguardWrapper$.ExternalSyntheticLambda3(), 31, (Object) null);
            Object[] objArr10 = new Object[1];
            b(null, new byte[]{-107, -125, -111, -116, -118, -111, -118, -122, -107, -122, -127, -126, -108, -109, -110, -116, -118, -115, -116}, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr10);
            ((String) objArr10[0]).intern();
            return setOnWarmupCompleted;
        }
        containsKeyForAdObject.onExtraCallbackWithResult();
        CollectionsKt.joinToString$default(setOnWarmupCompleted, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new DexguardWrapper$.ExternalSyntheticLambda4(), 31, (Object) null);
        Object[] objArr11 = new Object[1];
        b(null, new byte[]{-107, -119, -126, -100, -127, -101, -112, -107, -122, -127, -126, -108, -109, -110, -116, -118, -115, -116}, null, Drawable.resolveOpacity(0, 0) + 127, objArr11);
        ((String) objArr11[0]).intern();
        int i5 = writeTypedObject + 91;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return setOnWarmupCompleted;
        }
        throw null;
    }

    private final Set<IconRoundCornerProgressBarOnIconClickListener> onWarmupCompleted(Context context, Set<? extends s8ExternalSyntheticLambda1> set) {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        for (s8ExternalSyntheticLambda1 s8externalsyntheticlambda1 : set) {
            int i2 = ICustomTabsCallback + 37;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Long l = this.IAuthTabCallbackStub.get(s8externalsyntheticlambda1);
            Object obj = null;
            if (l != null) {
                int i4 = ICustomTabsCallback + 35;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                if (System.currentTimeMillis() - l.longValue() <= IAuthTabCallback) {
                    containsKeyForAdObject.onExtraCallbackWithResult();
                    s8externalsyntheticlambda1.getDetectFactor().getId();
                    Object[] objArr = new Object[1];
                    b(null, new byte[]{-107, -124, -121, -110, -125, -107, -122, -127, -126, -108, -109, -110, -116, -118, -115, -116}, null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr);
                    ((String) objArr[0]).intern();
                }
            }
            this.IAuthTabCallbackStub.put(s8externalsyntheticlambda1, Long.valueOf(System.currentTimeMillis()));
            s8ExternalSyntheticLambda1 s8externalsyntheticlambda1SafeCheck = s8externalsyntheticlambda1.safeCheck(context);
            Iterator<T> it = AppLovinAdBase.onNavigationEvent().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((IconRoundCornerProgressBarOnIconClickListener) next).onExtraCallbackWithResult() == (s8externalsyntheticlambda1SafeCheck != null ? s8externalsyntheticlambda1SafeCheck.getDetectFactor() : null)) {
                    obj = next;
                    break;
                }
            }
            IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener = (IconRoundCornerProgressBarOnIconClickListener) obj;
            if (iconRoundCornerProgressBarOnIconClickListener != null) {
                hashSet.add(iconRoundCornerProgressBarOnIconClickListener);
            }
        }
        return hashSet;
    }

    private final void onWarmupCompleted() {
        synchronized (this) {
            getBooleanFromAdObject getbooleanfromadobject = this.IAuthTabCallbackDefault;
            getbooleanfromadobject.onExtraCallback();
            getbooleanfromadobject.onTransact();
            getbooleanfromadobject.asInterface();
            if (Process.is64Bit()) {
                getbooleanfromadobject.IAuthTabCallbackStub();
                getbooleanfromadobject.asBinder();
            } else {
                IAuthTabCallback();
            }
            getbooleanfromadobject.IAuthTabCallbackDefault();
        }
    }

    private final void IAuthTabCallback() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onTransact.invoke();
            Object[] objArr = new Object[1];
            b(null, new byte[]{-115, -125, -126, -127, -116, -123, -117, -120, -123, -122, -118, -119, -120, -126, -125, -121, -122, -123, -124, -125, -126, -127}, null, 45 << View.resolveSizeAndState(0, 1, 1), objArr);
            if (textRoundCornerProgressBarSavedState1.onExtraCallback(((String) objArr[0]).intern(), true)) {
                return;
            }
        } else {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onTransact.invoke();
            Object[] objArr2 = new Object[1];
            b(null, new byte[]{-115, -125, -126, -127, -116, -123, -117, -120, -123, -122, -118, -119, -120, -126, -125, -121, -122, -123, -124, -125, -126, -127}, null, 127 - View.resolveSizeAndState(0, 0, 0), objArr2);
            if (textRoundCornerProgressBarSavedState1.onExtraCallback(((String) objArr2[0]).intern(), false)) {
                return;
            }
        }
        a((short) (Color.argb(0, 0, 0, 0) - 113), (byte) Color.red(0), View.MeasureSpec.getSize(0) + 187135026, (-517141028) + (ViewConfiguration.getFadingEdgeLength() >> 16), (-78) - (ViewConfiguration.getTapTimeout() >> 16), new Object[1]);
        if (!textRoundCornerProgressBarSavedState1.onExtraCallback(((String) r7[0]).intern(), false)) {
            Object[] objArr3 = new Object[1];
            a((short) (TextUtils.indexOf("", "") - 113), (byte) Drawable.resolveOpacity(0, 0), TextUtils.getOffsetAfter("", 0) + 187135026, (-517141029) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) - 78, objArr3);
            textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) objArr3[0]).intern(), true, true);
            try {
                this.IAuthTabCallbackDefault.IAuthTabCallbackStub();
                Object[] objArr4 = new Object[1];
                a((short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 113), (byte) (AndroidCharacter.getMirror('0') - '0'), 187135026 - View.MeasureSpec.makeMeasureSpec(0, 0), (-517141029) - TextUtils.lastIndexOf("", '0'), (-78) - KeyEvent.getDeadChar(0, 0), objArr4);
                textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) objArr4[0]).intern(), false, true);
                int i3 = writeTypedObject + 33;
                ICustomTabsCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 97 / 0;
                    return;
                }
                return;
            } catch (Throwable th) {
                Object[] objArr5 = new Object[1];
                a((short) (TextUtils.indexOf("", "") - 113), (byte) (Process.myTid() >> 22), KeyEvent.normalizeMetaState(0) + 187135026, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 517141029, Gravity.getAbsoluteGravity(0, 0) - 78, objArr5);
                textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) objArr5[0]).intern(), false, true);
                throw th;
            }
        }
        Object[] objArr6 = new Object[1];
        b(null, new byte[]{-115, -125, -126, -127, -116, -123, -117, -120, -123, -122, -118, -119, -120, -126, -125, -121, -122, -123, -124, -125, -126, -127}, null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, objArr6);
        textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(((String) objArr6[0]).intern(), true, true);
        containsKeyForAdObject.onExtraCallbackWithResult();
        ViewConfiguration.getEdgeSlop();
        TextUtils.getOffsetAfter("", 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        Color.green(0);
        ExpandableListView.getPackedPositionForGroup(0);
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr7 = new Object[1];
        b(null, new byte[]{-111, -119, -108, -125, -118, -127}, null, 127 - View.combineMeasuredStates(0, 0), objArr7);
        String strIntern = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 118), (byte) TextUtils.indexOf("", ""), View.MeasureSpec.getSize(0) + 187135120, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 517141028, (-78) - Gravity.getAbsoluteGravity(0, 0), objArr8);
        Pair[] pairArr = {getWrite.IAuthTabCallback(strIntern, ((String) objArr8[0]).intern())};
        Object[] objArr9 = new Object[1];
        b(null, new byte[]{-111, -112, -118, -113, -118, -123, -125, -122, -114}, null, Color.rgb(0, 0, 0) + 16777343, objArr9);
        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, ((String) objArr9[0]).intern(), false, (String) null, (List) null, access8100.IAuthTabCallback(pairArr), (Function1) null, 46, (Object) null);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a((short) (Process.getGidForName("") - 85), (byte) Color.argb(0, 0, 0, 0), 187135016 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-517141040) - Color.red(0), (-79) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) ((-113) - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (byte) ExpandableListView.getPackedPositionType(0L), 187135026 - (ViewConfiguration.getTouchSlop() >> 8), (-517141028) + (Process.myTid() >> 22), (-78) - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
        onExtraCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(null, new byte[]{-115, -125, -126, -127, -116, -123, -117, -120, -123, -122, -118, -119, -120, -126, -125, -121, -122, -123, -124, -125, -126, -127}, null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, objArr3);
        onNavigationEvent = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(null, new byte[]{-111, -112, -118, -113, -118, -123, -125, -122, -114}, null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, objArr4);
        onWarmupCompleted = ((String) objArr4[0]).intern();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallback = TimeUnit.SECONDS.toMillis(60L);
        int i = onMessageChannelReady + 29;
        onActivityResized = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback_Parcel;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i3]);
            }
            cArr2 = cArr3;
        }
        int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(readTypedObject);
        if (extraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                int i4 = $10 + 53;
                $11 = i4 % 128;
                int i5 = i4 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (extraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i6 = $10 + 33;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        String str = new String(cArr6);
        int i8 = $10 + 79;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i9 = 48 / 0;
            objArr[0] = str;
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int length;
        byte[] bArr;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, access000);
        int i6 = iO == -1 ? 1 : 0;
        if (i6 != 0) {
            byte[] bArr2 = IAuthTabCallbackStubProxy;
            if (bArr2 != null) {
                int i7 = $11 + 13;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i9 = 0; i9 < length2; i9++) {
                    bArr3[i9] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr2[i9]);
                }
                bArr2 = bArr3;
            }
            if (bArr2 != null) {
                int i10 = $11 + 35;
                $10 = i10 % 128;
                iO = (byte) (i10 % 2 != 0 ? ((byte) (IAuthTabCallbackStubProxy[getBooleanFromAdObject.onWarmupCompleted.o(i, asInterface)] % (-4629411779493505016L))) << ((int) (access000 ^ (-4629411779493505016L))) : ((byte) (IAuthTabCallbackStubProxy[getBooleanFromAdObject.onWarmupCompleted.o(i, asInterface)] ^ (-4629411779493505016L))) + ((int) (access000 ^ (-4629411779493505016L))));
            } else {
                iO = (short) (((short) (getInterfaceDescriptor[((int) (asInterface ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (access000 ^ (-4629411779493505016L))));
            }
        }
        if (iO > 0) {
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iO) - 2) + ((int) (asInterface ^ (-4629411779493505016L))) + i6;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, access100, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr4 = IAuthTabCallbackStubProxy;
            if (bArr4 != null) {
                int i11 = $11 + 121;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i4 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i4 = 0;
                }
                while (i4 < length) {
                    bArr[i4] = (byte) (bArr4[i4] ^ (-4629411779493505016L));
                    i4++;
                }
                bArr4 = bArr;
            }
            boolean z = bArr4 != null;
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                if (!z) {
                    short[] sArr = getInterfaceDescriptor;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                } else {
                    byte[] bArr5 = IAuthTabCallbackStubProxy;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
            }
        }
        String string = sb.toString();
        int i12 = $11 + 103;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = string;
    }

    private static final CharSequence onExtraCallbackWithResult(s8ExternalSyntheticLambda1 s8externalsyntheticlambda1) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (CharSequence) onWarmupCompleted(709986481, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -709986481, new Object[]{s8externalsyntheticlambda1}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    private static final CharSequence onTransact(s8ExternalSyntheticLambda1 s8externalsyntheticlambda1) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (CharSequence) onWarmupCompleted(-1055769314, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, 1055769315, new Object[]{s8externalsyntheticlambda1}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    static void onExtraCallback() {
        asInterface = 1352618975;
        access000 = -1538795451;
        access100 = -1164629346;
        IAuthTabCallbackStubProxy = new byte[]{-76, 64, 97, 91, 95, 83, 74, 109, 92, -63, 98, 126, 126, 111, 114, 110, -118, 106, 120, Byte.MAX_VALUE, 110, 120, -117, 103, 86, -116, Byte.MAX_VALUE, 104, 102, -117, 104, -13, -31, 15, -7, -4, -13, -2, 12, 51, -84, -11, -15, 78, -68, -5, -11, 52, -94, -1, -10, -27, -1, 2, -2, -19, 3, 53, -83, -2, -10, -10, -29, 1, -29, -14, 64, -42, -59, -14, -6, -29, 1, -15, 52, -84, 11, -9, 37, -5, -1, 3, -94, -1, 79, -68, -1, -7, 10, -15, -18, 10, -11, 52, -91, -4, -16, 23, 40, -64, -3, 2, -17, -60, 98, -113, 108, -116, 113, 106, -118, 110, -117, 114, Byte.MAX_VALUE, 120, 124, 102, 119, 126, 107, 119, 114, 114, 108, 122, -113, 108, -78, -44, 5, 4, 19, 93, 11, -66, -7, 3, -68, -35, 49, -19, 48, 40, 74, 66, 17, 43, 74, 21, 87, -9, 96, 8, 58, 60, 36, 74, 39, 42, 72, 58, 125, -27, 43, 74, 21, 87, 5, 49, 39, 38, 62, -55, 85, 6, 70, 82, 82, 67, 86, 78, 93, 96, -98, 65, 80};
        IAuthTabCallback_Parcel = new char[]{32598, 32551, 32597, 32592, 32545, 32548, 32607, 32550, 32604, 32603, 32591, 32549, 32600, 32602, 32586, 32594, 32596, 32605, 32569, 32587, 32736, 32531, 32526, 32536, 32543, 32540, 32593, 32595};
        readTypedObject = -1184333888;
        extraCallbackWithResult = true;
        extraCallback = true;
    }
}
