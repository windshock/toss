package o;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.TdsProgressBarV0View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.parseExtension;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class parseExtension extends enableNativeCSSParsing {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] ICustomTabsCallbackStub = {27164, 27340, 27182, 27179, 27337, 27370, 27372, 27372, 27370, 27346, 27349, 27373, 27371, 27346, 27346, 27348, 27357, 27191, 27191, 27355, 27347, 27347, 27351, 27345, 27345, 27345, 27348, 27188, 27338, 27370, 27351, 27350, 27348, 27348, 27348, 27353, 27186, 27340, 27375, 27348, 27352, 27198, 27468, 27500, 27501, 27501, 27503, 27475, 27314, 27468, 27472, 27477, 27474, 27502, 27474, 27477, 27471, 27312, 27478, 27482, 27317, 27468, 27503, 27476, 27480, 27475, 27468, 27310, 27307, 27465, 27498, 27500, 27500, 27475, 27483, 27481, 27502, 27499, 27474, 27475, 27257, 27198, 27199, 27177, 27176, 27175, 27181, 27177, 27175, 27181, 27178, 27181, 27175, 27198, 27175, 27179, 27170, 27167, 27167, 27197, 27197, 27194, 27198, 27170, 27172, 27138, 27136, 27173, 27141, 27166, 27197, 27199, 27199, 27167, 27142, 27176, 27168, 27172, 27172, 27197, 27167, 27233, 27258, 27160, 27199, 27196, 27194, 27168, 27177, 27172, 27169, 27137, 27143, 27174, 27172, 27177};
    private static int extraCommand = 1;
    private static int isEngagementSignalsApiAvailable;
    private final TdsRollingNumberV1View ICustomTabsCallback;
    private final ViewGroup ICustomTabsCallbackDefault;
    private final TextView ICustomTabsCallbackStubProxy;
    private final TdsImageView extraCallback;
    private final TdsListRowV1View onActivityLayout;
    private final TextView onActivityResized;
    private final TdsListRowV1View onMessageChannelReady;
    private final TdsListRowV1View onMinimized;
    private final TdsProgressBarV0View onPostMessage;
    private final TdsListRowV1View onRelationshipValidationResult;
    private final TdsBadgeV1View onUnminimized;
    private final TextView writeTypedObject;

    public static /* synthetic */ Unit IAuthTabCallback(swapLeftAndRightInRTL swapleftandrightinrtl, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 83;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(swapleftandrightinrtl, setDetectableSize);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        int i5 = extraCommand + 41;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(parseExtension parseextension, swapLeftAndRightInRTL swapleftandrightinrtl, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 95;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(parseextension, swapleftandrightinrtl, view);
        }
        onNavigationEvent(parseextension, swapleftandrightinrtl, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(parseExtension parseextension, swapLeftAndRightInRTL swapleftandrightinrtl, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 89;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(parseextension, swapleftandrightinrtl, view);
        int i4 = isEngagementSignalsApiAvailable + 109;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(swapLeftAndRightInRTL swapleftandrightinrtl, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 57;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(swapleftandrightinrtl, setDetectableSize);
        int i4 = isEngagementSignalsApiAvailable + 109;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public parseExtension(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingOnWarmupCompleted = ContextMenuAreaKtExternalSyntheticLambda0.onWarmupCompleted(LayoutInflater.from(viewGroup.getContext()), toRealPath.onNavigationEvent.TEENS_HENEM_BOX.getLayoutResId(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingOnWarmupCompleted, "");
        super(viewDataBindingOnWarmupCompleted);
        this.ICustomTabsCallbackDefault = viewGroup;
        this.onMessageChannelReady = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.completedBanner);
        this.onActivityLayout = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.trollBannerRow);
        this.ICustomTabsCallbackStubProxy = (TextView) ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.titleText);
        this.onActivityResized = (TextView) ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.goalAmountText);
        TextView textView = (TextView) ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.boxCoverTextView);
        this.writeTypedObject = textView;
        this.extraCallback = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.boxCoverImageView);
        this.ICustomTabsCallback = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.balance);
        this.onUnminimized = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.progressBadge);
        this.onPostMessage = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.henemProgress);
        this.onRelationshipValidationResult = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.memoRow);
        this.onMinimized = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.fangirlGroupRow);
        textView.setTextSize(1, 70.0f);
    }

    private static final Unit onExtraCallback(swapLeftAndRightInRTL swapleftandrightinrtl, SetDetectableSize setDetectableSize) {
        String str;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 49;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("henembox_name", swapleftandrightinrtl.onPostMessage());
        if (((Boolean) swapLeftAndRightInRTL.onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{swapleftandrightinrtl}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1336129391, -1336129387, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue()) {
            int i4 = extraCommand + 115;
            isEngagementSignalsApiAvailable = i4 % 128;
            str = "Y";
            if (i4 % 2 != 0) {
                int i5 = 84 / 0;
            }
        } else {
            int i6 = isEngagementSignalsApiAvailable + 79;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
            str = "N";
        }
        setDetectableSize.onExtraCallback("fangirl_savings", str);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(swapLeftAndRightInRTL swapleftandrightinrtl, SetDetectableSize setDetectableSize) {
        String str;
        int i = 2 % 2;
        int i2 = extraCommand + 125;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("henembox_name", swapleftandrightinrtl.onPostMessage());
        Object obj = null;
        if (!((Boolean) swapLeftAndRightInRTL.onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{swapleftandrightinrtl}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1336129391, -1336129387, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue()) {
            str = "N";
        } else {
            int i4 = extraCommand + 55;
            int i5 = i4 % 128;
            isEngagementSignalsApiAvailable = i5;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = i5 + 125;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
            str = "Y";
        }
        setDetectableSize.onExtraCallback("fangirl_savings", str);
        Unit unit = Unit.INSTANCE;
        int i8 = extraCommand + 13;
        isEngagementSignalsApiAvailable = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(parseExtension parseextension, final swapLeftAndRightInRTL swapleftandrightinrtl, View view) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1225569L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.viewholder.HenemSavingBoxViewHolder$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return parseExtension.IAuthTabCallback(swapleftandrightinrtl, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        resumeForClick resumeforclick = resumeForClick.asBinder;
        Context context = parseextension.ICustomTabsCallbackDefault.getContext();
        Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("henemBox", swapleftandrightinrtl)});
        Object[] objArr = new Object[1];
        a(new int[]{0, 41, 49, 13}, true, new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0}, objArr);
        SessionTrackerb.onExtraCallbackWithResult(resumeforclick, context, ((String) objArr[0]).intern(), false, (Function1) null, bundleOnNavigationEvent, false, 44, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = isEngagementSignalsApiAvailable + 67;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void IAuthTabCallback(parseExtension parseextension, swapLeftAndRightInRTL swapleftandrightinrtl, View view) throws Throwable {
        int i = 2 % 2;
        resumeForClick resumeforclick = resumeForClick.asBinder;
        Context context = parseextension.ICustomTabsCallbackDefault.getContext();
        Long lOnTransact = swapleftandrightinrtl.onTransact();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{41, 39, 177, 0}, true, new byte[]{0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(lOnTransact);
        SessionTrackerb.onExtraCallbackWithResult(resumeforclick, context, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = isEngagementSignalsApiAvailable + 53;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallback(@org.jetbrains.annotations.Nullable o.enableInteropViewManagerClassLookUpOptimizationIOS r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.parseExtension.onExtraCallback(o.enableInteropViewManagerClassLookUpOptimizationIOS):void");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        char[] cArr;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = ICustomTabsCallbackStub;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 35283), TextUtils.getTrimmedLength("") + 35, 14239 - TextUtils.getOffsetAfter("", 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i9 = $11 + 93;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10934), 65 - Color.red(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, 17658 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49466), 70 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i12 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i12, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i13 = $10 + 31;
            $11 = i13 % 128;
            int i14 = 2;
            int i15 = i13 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i16 = $11 + 83;
                $10 = i16 % 128;
                if (i16 % i14 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(trackGroupExternalSyntheticLambda0.onNavigationEvent + i5) >>> 1];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent % 0;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
                int i17 = $10 + 21;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                i14 = 2;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i19 = $10 + 15;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i21 = $11 + 41;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] + iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent << 1;
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
