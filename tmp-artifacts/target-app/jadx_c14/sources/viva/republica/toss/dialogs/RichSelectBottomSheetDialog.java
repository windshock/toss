package viva.republica.toss.dialogs;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE;
import o.requestTimeStamp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RichSelectBottomSheetDialog extends r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100;
    private static int[] getInterfaceDescriptor;
    public static final int onExtraCallback;
    private LinearLayout asBinder;
    private BottomSheetHeader onExtraCallbackWithResult;
    private Callback onNavigationEvent;
    private String asInterface = "";
    private String IAuthTabCallback = "";
    private List<requestTimeStamp> onTransact = new ArrayList();
    private boolean IAuthTabCallbackDefault = true;
    private ArrayList<SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> IAuthTabCallbackStub = new ArrayList<>();

    public interface Callback {
        void IAuthTabCallback(@NotNull RichSelectBottomSheetDialog richSelectBottomSheetDialog, int i, @Nullable Object obj);

        void onExtraCallback(@NotNull RichSelectBottomSheetDialog richSelectBottomSheetDialog);
    }

    static {
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        onExtraCallback = 8;
        int i = access100 + 9;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~(i7 | i6);
        int i9 = ~(i5 | i6);
        int i10 = i7 | (~i6);
        int i11 = i9 | (~(i10 | i));
        int i12 = (~i) | i10;
        int i13 = i5 + i6 + i4 + (770105990 * i2) + ((-157043368) * i3);
        int i14 = i13 * i13;
        int i15 = ((315592168 * i5) - 1432092672) + ((-1000312294) * i6) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i4) + ((-2121269248) * i2) + (1950351360 * i3) + ((-66846720) * i14);
        int i16 = (i5 * 105828664) + 1394048361 + (i6 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i4 * 105828275) + (i2 * (-227623502)) + (i3 * 619312264) + (i14 * 1925971968);
        return i15 + ((i16 * i16) * 261881856) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ void IAuthTabCallback(RichSelectBottomSheetDialog richSelectBottomSheetDialog, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(richSelectBottomSheetDialog, view);
        int i4 = IAuthTabCallback_Parcel + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(RichSelectBottomSheetDialog richSelectBottomSheetDialog, int i, requestTimeStamp requesttimestamp, View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {richSelectBottomSheetDialog, Integer.valueOf(i), requesttimestamp, view};
        IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -40740531, 40740532, objArr);
        int i5 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public boolean at_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 49;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RichSelectBottomSheetDialog onExtraCallbackWithResult(@NotNull String str, @NotNull List<requestTimeStamp> list, @Nullable Callback callback) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new RichSelectBottomSheetDialog().onNavigationEvent(str).onExtraCallback(list).onExtraCallback(callback);
        }
    }

    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = IAuthTabCallback_Parcel + 125;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(new int[]{1624171375, -1477369446, -1284556729, -2103075757}, 5 - ExpandableListView.getPackedPositionGroup(0L), objArr);
            String string = arguments.getString(((String) objArr[0]).intern());
            if (string != null) {
                onNavigationEvent(string);
            }
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("items");
            if (parcelableArrayList != null) {
                int i4 = IAuthTabCallbackStubProxy + 123;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                if (parcelableArrayList.isEmpty()) {
                    return;
                }
                onExtraCallback(parcelableArrayList);
            }
        }
    }

    public void onPrepareTrackViewParams(@NotNull Map<String, Object> map) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            super.onPrepareTrackViewParams(map);
            Object[] objArr = new Object[1];
            b(new int[]{1624171375, -1477369446, -1284556729, -2103075757}, 2 >>> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            super.onPrepareTrackViewParams(map);
            Object[] objArr2 = new Object[1];
            b(new int[]{1624171375, -1477369446, -1284556729, -2103075757}, 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        map.put(((String) obj).intern(), this.asInterface);
        int i3 = IAuthTabCallbackStubProxy + 11;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setupDialog(@NotNull Dialog dialog, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(dialog, "");
        super/*androidx.appcompat.app.AppCompatDialogFragment*/.setupDialog(dialog, i);
        dialog.setContentView(R.layout.fragment_select_bottom_sheet);
        BottomSheetHeader bottomSheetHeaderFindViewById = dialog.findViewById(R.id.header);
        Intrinsics.checkNotNullExpressionValue(bottomSheetHeaderFindViewById, "");
        this.onExtraCallbackWithResult = bottomSheetHeaderFindViewById;
        View viewFindViewById = dialog.findViewById(R.id.row_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.asBinder = (LinearLayout) viewFindViewById;
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        IAuthTabCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, -945088244, 945088244, new Object[]{this});
        onWarmupCompleted();
        int i5 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final RichSelectBottomSheetDialog onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.asInterface = str;
        int i4 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return this;
    }

    public final RichSelectBottomSheetDialog onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
        int i4 = IAuthTabCallbackStubProxy + 85;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final RichSelectBottomSheetDialog IAuthTabCallback(@NotNull SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1, "");
            this.IAuthTabCallbackStub.add(singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1);
            int i3 = 28 / 0;
        } else {
            Intrinsics.checkNotNullParameter(singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1, "");
            this.IAuthTabCallbackStub.add(singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1);
        }
        int i4 = IAuthTabCallbackStubProxy + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final RichSelectBottomSheetDialog onExtraCallback(@Nullable Callback callback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = callback;
        if (i3 == 0) {
            return this;
        }
        throw null;
    }

    public final RichSelectBottomSheetDialog onExtraCallback(@NotNull List<requestTimeStamp> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            List<requestTimeStamp> list2 = this.onTransact;
            list2.clear();
            list2.addAll(list);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        List<requestTimeStamp> list3 = this.onTransact;
        list3.clear();
        list3.addAll(list);
        int i3 = IAuthTabCallbackStubProxy + 67;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(RichSelectBottomSheetDialog richSelectBottomSheetDialog, View view) {
        int i = 2 % 2;
        Callback callback = richSelectBottomSheetDialog.onNavigationEvent;
        if (callback != null) {
            int i2 = IAuthTabCallback_Parcel + 13;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            callback.onExtraCallback(richSelectBottomSheetDialog);
            int i4 = IAuthTabCallback_Parcel + 59;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IAuthTabCallback_Parcel + 113;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getInterfaceDescriptor;
        int i5 = -1469660336;
        float f = 0.0f;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 72 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), 8848 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i5 = -1469660336;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getInterfaceDescriptor;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = $10 + 81;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 123;
                $11 = i11 % 128;
                if (i11 % i3 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), View.getDefaultSize(i6, i6) + 72, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 72 - (Process.myTid() >> 22), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i10++;
                }
                i3 = 2;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = $11 + 111;
            $10 = i12 % 128;
            int i13 = 2;
            int i14 = i12 % 2;
            int i15 = 0;
            while (i15 < 16) {
                int i16 = $10 + 31;
                $11 = i16 % 128;
                int i17 = i16 % i13;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 39, 10300 - ImageFormat.getBitsPerPixel(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
                int i18 = $10 + 47;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                i13 = 2;
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 78 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RichSelectBottomSheetDialog richSelectBottomSheetDialog = (RichSelectBottomSheetDialog) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        requestTimeStamp requesttimestamp = (requestTimeStamp) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Callback callback = richSelectBottomSheetDialog.onNavigationEvent;
            obj.hashCode();
            throw null;
        }
        Callback callback2 = richSelectBottomSheetDialog.onNavigationEvent;
        if (callback2 != null) {
            callback2.IAuthTabCallback(richSelectBottomSheetDialog, iIntValue, requesttimestamp.IAuthTabCallback());
            int i3 = IAuthTabCallbackStubProxy + 13;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0156 A[PHI: r10
      0x0156: PHI (r10v37 android.content.Context) = (r10v36 android.content.Context), (r10v39 android.content.Context) binds: [B:43:0x0154, B:40:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onWarmupCompleted() {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dialogs.RichSelectBottomSheetDialog.onWarmupCompleted():void");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 0;
        final RichSelectBottomSheetDialog richSelectBottomSheetDialog = (RichSelectBottomSheetDialog) objArr[0];
        int i2 = 2 % 2;
        BottomSheetHeader bottomSheetHeader = richSelectBottomSheetDialog.onExtraCallbackWithResult;
        if (bottomSheetHeader == null) {
            int i3 = IAuthTabCallbackStubProxy + 101;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            bottomSheetHeader = null;
        }
        bottomSheetHeader.setTitle(richSelectBottomSheetDialog.asInterface);
        bottomSheetHeader.setDescription(richSelectBottomSheetDialog.IAuthTabCallback);
        bottomSheetHeader.setShowCloseIcon(richSelectBottomSheetDialog.IAuthTabCallbackDefault);
        bottomSheetHeader.setCloseClickListener(new View.OnClickListener() { // from class: viva.republica.toss.dialogs.RichSelectBottomSheetDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RichSelectBottomSheetDialog.IAuthTabCallback(this.f$0, view);
            }
        });
        if (StringsKt.isBlank(richSelectBottomSheetDialog.asInterface)) {
            i = 8;
        } else {
            int i5 = IAuthTabCallbackStubProxy + 87;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                i = 1;
            }
        }
        bottomSheetHeader.setVisibility(i);
        return null;
    }

    private final void onExtraCallback() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        IAuthTabCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, -945088244, 945088244, new Object[]{this});
    }

    private static final void onWarmupCompleted(RichSelectBottomSheetDialog richSelectBottomSheetDialog, int i, requestTimeStamp requesttimestamp, View view) {
        Object[] objArr = {richSelectBottomSheetDialog, Integer.valueOf(i), requesttimestamp, view};
        IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -40740531, 40740532, objArr);
    }

    static void onExtraCallbackWithResult() {
        getInterfaceDescriptor = new int[]{-370170594, 1184751173, -2019805802, 1331993868, -1747954527, -461040119, -1112772369, -1401529808, -1985743945, -1599122542, 476998356, -727359798, 221067361, 779427531, -1190504203, 1420267780, 219575907, -102228515};
    }
}
