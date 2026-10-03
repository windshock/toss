package viva.republica.toss.appsintoss;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import gatewayprotocol.v1.AdResponseKtKt;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CloseableUtils;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda4;
import o.SplitControllersplitInfoList1ExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.WindowInfoTrackerCompanionExternalSyntheticLambda0;
import o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1;
import o.access13800;
import o.findResAndMsg;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getShine;
import o.getTileModeX;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AppsInTossSubscriptionDemoViewModel extends ViewModel {
    private final getCornerRadius<String> IAuthTabCallback;
    private final SafeWindowLayoutComponentProviderExternalSyntheticLambda4 IAuthTabCallbackDefault;
    private final setRubIn<String> IAuthTabCallbackStub;
    private final setRubIn<Boolean> IAuthTabCallbackStubProxy;
    private final setRubIn<String> IAuthTabCallback_Parcel;
    private final getTileModeX<Boolean> access000;
    private String access100;
    private final getCornerRadius<List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>> asBinder;
    private final setRubIn<String> asInterface;
    private final SplitControllersplitInfoList1ExternalSyntheticLambda0 getInterfaceDescriptor;
    private final getBorderRadius<Boolean> onExtraCallback;
    private final getCornerRadius<String> onExtraCallbackWithResult;
    private final getCornerRadius<String> onNavigationEvent;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 onTransact;
    private final getCornerRadius<Boolean> onWarmupCompleted;
    private final setRubIn<List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>> writeTypedObject;
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 200;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int readTypedObject = 0;
    private static int ICustomTabsCallback = 1;
    private static char[] extraCallback = {20590, 29237, 5323, 14204, 55556, 64440, 40525, 41190, 17033, 25944, 2039};
    private static long extraCallbackWithResult = -5326589407882063992L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = 97 - r8
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r0 = viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoViewModel.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r8 = r8 + 1
            r4 = r0[r8]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoViewModel.$$c(int, int, short):java.lang.String");
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i3);
        int i9 = ~(i6 | i3);
        int i10 = i7 | (~i3);
        int i11 = i9 | (~(i10 | i4));
        int i12 = (~i4) | i10;
        int i13 = i6 + i3 + i5 + (770105990 * i2) + ((-157043368) * i);
        int i14 = i13 * i13;
        int i15 = ((315592168 * i6) - 1432092672) + ((-1000312294) * i3) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i5) + ((-2121269248) * i2) + (1950351360 * i) + ((-66846720) * i14);
        int i16 = (i6 * 105828664) + 1394048361 + (i3 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i5 * 105828275) + (i2 * (-227623502)) + (i * 619312264) + (i14 * 1925971968);
        int i17 = i15 + (i16 * i16 * 261881856);
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
        }
        AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModel = (AppsInTossSubscriptionDemoViewModel) objArr[0];
        int i18 = 2 % 2;
        int i19 = readTypedObject;
        int i20 = i19 + 89;
        ICustomTabsCallback = i20 % 128;
        int i21 = i20 % 2;
        setRubIn<List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>> setrubin = appsInTossSubscriptionDemoViewModel.writeTypedObject;
        int i22 = i19 + 45;
        ICustomTabsCallback = i22 % 128;
        int i23 = i22 % 2;
        return setrubin;
    }

    @Inject
    public AppsInTossSubscriptionDemoViewModel(@NotNull SafeWindowLayoutComponentProviderExternalSyntheticLambda4 safeWindowLayoutComponentProviderExternalSyntheticLambda4, @NotNull SplitControllersplitInfoList1ExternalSyntheticLambda0 splitControllersplitInfoList1ExternalSyntheticLambda0, @NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20) throws Throwable {
        Intrinsics.checkNotNullParameter(safeWindowLayoutComponentProviderExternalSyntheticLambda4, "");
        Intrinsics.checkNotNullParameter(splitControllersplitInfoList1ExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda20, "");
        this.IAuthTabCallbackDefault = safeWindowLayoutComponentProviderExternalSyntheticLambda4;
        this.getInterfaceDescriptor = splitControllersplitInfoList1ExternalSyntheticLambda0;
        this.onTransact = safeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
        getCornerRadius<String> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent("019bfa90-ad4c-799f-b227-b4159e6867f7");
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent;
        this.IAuthTabCallbackStub = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        Object[] objArr = new Object[1];
        a(Process.myPid() >> 22, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 48595), objArr);
        getCornerRadius<String> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent(((String) objArr[0]).intern());
        this.IAuthTabCallback = getcornerradiusOnNavigationEvent2;
        this.asInterface = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent2);
        getCornerRadius<String> getcornerradiusOnNavigationEvent3 = setShine.onNavigationEvent("");
        this.onNavigationEvent = getcornerradiusOnNavigationEvent3;
        this.IAuthTabCallback_Parcel = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent3);
        getCornerRadius<List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>> getcornerradiusOnNavigationEvent4 = setShine.onNavigationEvent(CollectionsKt.emptyList());
        this.asBinder = getcornerradiusOnNavigationEvent4;
        this.writeTypedObject = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent4);
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent5 = setShine.onNavigationEvent(Boolean.FALSE);
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent5;
        this.IAuthTabCallbackStubProxy = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent5);
        this.access100 = "KR";
        getBorderRadius<Boolean> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onExtraCallback = getborderradiusOnWarmupCompleted;
        this.access000 = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
    }

    public static final /* synthetic */ SplitControllersplitInfoList1ExternalSyntheticLambda0 IAuthTabCallback(AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 69;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        SplitControllersplitInfoList1ExternalSyntheticLambda0 splitControllersplitInfoList1ExternalSyntheticLambda0 = appsInTossSubscriptionDemoViewModel.getInterfaceDescriptor;
        if (i3 == 0) {
            return splitControllersplitInfoList1ExternalSyntheticLambda0;
        }
        throw null;
    }

    public static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 onExtraCallback(AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 53;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20 = appsInTossSubscriptionDemoViewModel.onTransact;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 95;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ SafeWindowLayoutComponentProviderExternalSyntheticLambda4 onExtraCallbackWithResult(AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        SafeWindowLayoutComponentProviderExternalSyntheticLambda4 safeWindowLayoutComponentProviderExternalSyntheticLambda4 = appsInTossSubscriptionDemoViewModel.IAuthTabCallbackDefault;
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return safeWindowLayoutComponentProviderExternalSyntheticLambda4;
    }

    public static final /* synthetic */ getBorderRadius onNavigationEvent(AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<Boolean> getborderradius = appsInTossSubscriptionDemoViewModel.onExtraCallback;
        if (i3 == 0) {
            return getborderradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModel = (AppsInTossSubscriptionDemoViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        getCornerRadius<List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>> getcornerradius = appsInTossSubscriptionDemoViewModel.asBinder;
        if (i4 != 0) {
            int i5 = 2 / 0;
        }
        int i6 = i3 + 117;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius onWarmupCompleted(AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModel) {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        getCornerRadius<Boolean> getcornerradius = appsInTossSubscriptionDemoViewModel.onWarmupCompleted;
        int i5 = i3 + 45;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public final setRubIn<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<String> setrubin = this.IAuthTabCallbackStub;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return setrubin;
    }

    public final setRubIn<String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 95;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<String> setrubin = this.asInterface;
        int i5 = i2 + 55;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModel = (AppsInTossSubscriptionDemoViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        setRubIn<String> setrubin = appsInTossSubscriptionDemoViewModel.IAuthTabCallback_Parcel;
        int i5 = i3 + 41;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return setrubin;
    }

    public final setRubIn<Boolean> asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 113;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Boolean> setrubin = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 123;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getTileModeX<Boolean> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getTileModeX<Boolean> gettilemodex = this.access000;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return gettilemodex;
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult.onWarmupCompleted(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult.onWarmupCompleted(str);
            int i3 = 10 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModel = (AppsInTossSubscriptionDemoViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        appsInTossSubscriptionDemoViewModel.IAuthTabCallback.onWarmupCompleted(str);
        int i4 = ICustomTabsCallback + 33;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent.onWarmupCompleted(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent.onWarmupCompleted(str);
            int i3 = 47 / 0;
        }
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequence = (CharSequence) this.onNavigationEvent.IAuthTabCallback();
        if (StringsKt.isBlank(charSequence)) {
            int i4 = ICustomTabsCallback + 81;
            readTypedObject = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            charSequence = null;
        }
        return (String) charSequence;
    }

    public final WindowInfoTrackerCompanionExternalSyntheticLambda0 onNavigationEvent() {
        int i = 2 % 2;
        WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = new WindowInfoTrackerCompanionExternalSyntheticLambda0((String) this.onExtraCallbackWithResult.IAuthTabCallback(), (String) this.IAuthTabCallback.IAuthTabCallback(), (Integer) null, 4, (DefaultConstructorMarker) null);
        int i2 = readTypedObject + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return windowInfoTrackerCompanionExternalSyntheticLambda0;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $countryCode;
        final /* synthetic */ WindowInfoTrackerCompanionExternalSyntheticLambda0 $miniAppInfo;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, String str, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$miniAppInfo = windowInfoTrackerCompanionExternalSyntheticLambda0;
            this.$countryCode = str;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return AppsInTossSubscriptionDemoViewModel.this.new onWarmupCompleted(this.$miniAppInfo, this.$countryCode, access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r13 != r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
        
            if (r1.emit(r3, r12) == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoViewModel.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.access100 = str;
        WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent();
        this.onWarmupCompleted.onWarmupCompleted(Boolean.TRUE);
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(windowInfoTrackerCompanionExternalSyntheticLambda0OnNavigationEvent, str, null), 3, (Object) null);
        int i2 = readTypedObject + 97;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(extraCallback[i % i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 59697), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, 10972 - TextUtils.lastIndexOf("", '0', 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(extraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.argb(0, 0, 0, 0)), 32 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getTrimmedLength("")), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, 1494 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(extraCallback[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.lastIndexOf("", '0', 0, 0)), 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(extraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (Process.myTid() >> 22) + 31, View.MeasureSpec.getMode(0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.green(0)), KeyEvent.getDeadChar(0, 0) + 44, TextUtils.getOffsetBefore("", 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) (-1);
                byte b6 = (byte) (b5 + 1);
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49123), 44 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1493, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            int i7 = $10 + 95;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this.access100);
        int i4 = readTypedObject + 95;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void asBinder() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, (access13800) null), 3, (Object) null);
        int i2 = readTypedObject + 5;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallbackDefault(AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModel) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (getCornerRadius) onExtraCallback(AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, 426198639, new Object[]{appsInTossSubscriptionDemoViewModel}, iIAuthTabCallback, iIAuthTabCallback2, -426198638);
    }

    public final setRubIn<String> IAuthTabCallbackStub() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (setRubIn) onExtraCallback(AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, -1224943270, new Object[]{this}, iIAuthTabCallback, iIAuthTabCallback2, 1224943273);
    }

    public final setRubIn<List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>> onTransact() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (setRubIn) onExtraCallback(AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, 1888048395, new Object[]{this}, iIAuthTabCallback, iIAuthTabCallback2, -1888048393);
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        onExtraCallback(AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, 906322503, new Object[]{this, str}, iIAuthTabCallback, iIAuthTabCallback2, -906322503);
    }
}
