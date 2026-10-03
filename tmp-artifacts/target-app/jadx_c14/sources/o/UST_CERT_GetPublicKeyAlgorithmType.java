package o;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Filter;
import android.widget.Filterable;
import im.toss.base.BaseActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppMsgReceiver2;
import o.UST_CERT_GetPublicKeyAlgorithmType;
import o.access502;
import o.onSwitchToDarkTheme;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetPublicKeyAlgorithmType extends exitAllPages<Object> implements Filterable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallbackDefault = 6921;
    private static char IAuthTabCallbackStubProxy = 2572;
    private static int IAuthTabCallback_Parcel = 1;
    private static char access000 = 21190;
    private static int access100 = 0;
    private static char asBinder = 63193;
    private final List<Object> IAuthTabCallback;
    private final boolean IAuthTabCallbackStub;
    private final List<Object> asInterface;
    private String onNavigationEvent;
    private final onExtraCallbackWithResult onTransact;

    static final /* synthetic */ class IAuthTabCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 IAuthTabCallback;

        IAuthTabCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.IAuthTabCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.IAuthTabCallback.invoke(obj);
        }
    }

    public static final class onWarmupCompleted {
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i2 | i5);
        int i8 = ~(i5 | i);
        int i9 = i7 | i8;
        int i10 = ~i2;
        int i11 = ~i5;
        int i12 = (~(i10 | i)) | (~(i10 | i11)) | (~(i11 | i));
        int i13 = ~i;
        int i14 = i12 | (~(i13 | i2 | i5));
        int i15 = (~(i13 | i11)) | i2 | i8;
        int i16 = i2 + i5 + i3 + (1962400304 * i4) + (1167700406 * i6);
        int i17 = i16 * i16;
        int i18 = ((i2 * (-1019457937)) - 559939584) + ((-1019457937) * i5) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i3) + ((-1660944384) * i4) + ((-325058560) * i6) + (867827712 * i17);
        int i19 = ((i2 * (-1629562239)) - 1134582380) + (i5 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i3 * (-1629561329)) + (i4 * (-1621399344)) + (i6 * (-873382486)) + (i17 * 1407582208);
        if (i18 + (i19 * i19 * (-1895432192)) == 1) {
            return IAuthTabCallback(objArr);
        }
        UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType = (UST_CERT_GetPublicKeyAlgorithmType) objArr[0];
        List list = (List) objArr[1];
        int i20 = 2 % 2;
        int i21 = IAuthTabCallback_Parcel + 47;
        access100 = i21 % 128;
        int i22 = i21 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        uST_CERT_GetPublicKeyAlgorithmType.asInterface.clear();
        List<Object> list2 = uST_CERT_GetPublicKeyAlgorithmType.asInterface;
        List list3 = list;
        Iterator it = list3.iterator();
        int i23 = access100 + 5;
        IAuthTabCallback_Parcel = i23 % 128;
        int i24 = i23 % 2;
        while (it.hasNext()) {
            ((onSwitchToDarkTheme) it.next()).access000();
        }
        uST_CERT_GetPublicKeyAlgorithmType.onExtraCallbackWithResult(list2, (List<onSwitchToDarkTheme>) list3);
        ((ExoPlayerImplExternalSyntheticLambda31) uST_CERT_GetPublicKeyAlgorithmType).onWarmupCompleted = uST_CERT_GetPublicKeyAlgorithmType.asInterface;
        uST_CERT_GetPublicKeyAlgorithmType.notifyDataSetChanged();
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType, String str) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(uST_CERT_GetPublicKeyAlgorithmType, str);
        int i4 = IAuthTabCallback_Parcel + 59;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public UST_CERT_GetPublicKeyAlgorithmType(@NotNull UST_CERT_GetSerial uST_CERT_GetSerial, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @Nullable final String str, boolean z, @NotNull staticInit staticinit, @NotNull final getDummyAd getdummyad, @NotNull final SessionTrackera sessionTrackera, @NotNull final String str2) {
        Intrinsics.checkNotNullParameter(uST_CERT_GetSerial, "");
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(staticinit, "");
        Intrinsics.checkNotNullParameter(getdummyad, "");
        Intrinsics.checkNotNullParameter(sessionTrackera, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallbackStub = z;
        this.asInterface = new ArrayList();
        this.IAuthTabCallback = new ArrayList();
        this.onTransact = new onExtraCallbackWithResult();
        this.onNavigationEvent = "";
        uST_CERT_GetSerial.onExtraCallbackWithResult().observe(textFieldScrollKtExternalSyntheticLambda0, new IAuthTabCallback(new Function1() { // from class: viva.republica.toss.contact.AppBridgeSelectContactAdapter$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return UST_CERT_GetPublicKeyAlgorithmType.onWarmupCompleted(this.f$0, (String) obj);
            }
        }));
        onExtraCallbackWithResult(new PromiseImpl(uST_CERT_GetSerial.onExtraCallbackWithResult(), staticinit));
        access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult.onWarmupCompleted(R.layout.item_contact_receiver_permission);
        onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.contact.AppBridgeSelectContactAdapter$$ExternalSyntheticLambda2
            public final Object invoke(Object obj, Object obj2) {
                return UST_CERT_GetPublicKeyAlgorithmType.onExtraCallback(str, getdummyad, sessionTrackera, str2, (AppMsgReceiver2) obj, (UST_CERT_GetPublicKeyAlgorithmType.onWarmupCompleted) obj2);
            }
        });
        if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
            onextracallbackwithresult.onExtraCallback(asInterface.onExtraCallback);
        }
        onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult2.onWarmupCompleted(R.layout.layout_transfer_receiver_message);
        onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.contact.AppBridgeSelectContactAdapter$$ExternalSyntheticLambda3
            public final Object invoke(Object obj, Object obj2) {
                return UST_CERT_GetPublicKeyAlgorithmType.onExtraCallbackWithResult((AppMsgReceiver2) obj, (UST_CERT_GetPublicKeyAlgorithmType.onNavigationEvent) obj2);
            }
        });
        if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
            onextracallbackwithresult2.onExtraCallback(onTransact.onNavigationEvent);
            int i = IAuthTabCallback_Parcel + 61;
            access100 = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
        int i3 = IAuthTabCallback_Parcel + 41;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType = (UST_CERT_GetPublicKeyAlgorithmType) objArr[0];
        List<Object> list = (List) objArr[1];
        List<onSwitchToDarkTheme> list2 = (List) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        uST_CERT_GetPublicKeyAlgorithmType.onExtraCallbackWithResult(list, list2);
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List IAuthTabCallback(UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 97;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        List<Object> list = uST_CERT_GetPublicKeyAlgorithmType.asInterface;
        int i5 = i2 + 67;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return list;
    }

    public static final /* synthetic */ List onNavigationEvent(UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 59;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        List<Object> list = uST_CERT_GetPublicKeyAlgorithmType.IAuthTabCallback;
        int i5 = i2 + 87;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final class asInterface implements Function1<Object, Boolean> {
        public static final asInterface onExtraCallback = new asInterface();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onWarmupCompleted);
        }
    }

    public static final class onTransact implements Function1<Object, Boolean> {
        public static final onTransact onNavigationEvent = new onTransact();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onNavigationEvent);
        }
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = str;
        getFilter().filter(str);
        int i4 = IAuthTabCallback_Parcel + 117;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType, String str) {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(str);
        uST_CERT_GetPublicKeyAlgorithmType.onExtraCallback(str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 117;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static void onExtraCallback(getDummyAd getdummyad, SessionTrackera sessionTrackera, String str, View view) {
        BaseActivity baseActivity;
        int i = 2 % 2;
        BaseActivity context = view.getContext();
        if (context instanceof BaseActivity) {
            int i2 = IAuthTabCallback_Parcel + 101;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                baseActivity = context;
                int i3 = 16 / 0;
            } else {
                baseActivity = context;
            }
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            int i4 = access100 + 9;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                H5TinyPopMenuTitleBarTheme.IAuthTabCallback.onNavigationEvent(baseActivity, getdummyad, sessionTrackera, str);
                int i5 = 88 / 0;
            } else {
                H5TinyPopMenuTitleBarTheme.IAuthTabCallback.onNavigationEvent(baseActivity, getdummyad, sessionTrackera, str);
            }
            int i6 = IAuthTabCallback_Parcel + 75;
            access100 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0111 A[PHI: r11
      0x0111: PHI (r11v13 android.view.View) = (r11v12 android.view.View), (r11v16 android.view.View) binds: [B:39:0x010f, B:36:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119 A[PHI: r11
      0x0119: PHI (r11v14 android.view.View) = (r11v12 android.view.View), (r11v16 android.view.View) binds: [B:39:0x010f, B:36:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r11
      0x003d: PHI (r11v2 int) = (r11v1 int), (r11v32 int) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Unit onExtraCallback(java.lang.String r6, final o.getDummyAd r7, final o.SessionTrackera r8, final java.lang.String r9, o.AppMsgReceiver2 r10, o.UST_CERT_GetPublicKeyAlgorithmType.onWarmupCompleted r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyAlgorithmType.onExtraCallback(java.lang.String, o.getDummyAd, o.SessionTrackera, java.lang.String, o.AppMsgReceiver2, o.UST_CERT_GetPublicKeyAlgorithmType$onWarmupCompleted):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[PHI: r2
      0x003c: PHI (r2v18 android.widget.TextView) = (r2v17 android.widget.TextView), (r2v22 android.widget.TextView) binds: [B:10:0x003a, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[PHI: r2
      0x0044: PHI (r2v19 android.widget.TextView) = (r2v17 android.widget.TextView), (r2v22 android.widget.TextView) binds: [B:10:0x003a, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Unit onExtraCallbackWithResult(o.AppMsgReceiver2 r4, o.UST_CERT_GetPublicKeyAlgorithmType.onNavigationEvent r5) {
        /*
            java.lang.String r0 = ""
            r1 = 2
            int r2 = r1 % r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = viva.republica.toss.R.id.title
            android.util.SparseArray r2 = r4.onWarmupCompleted()
            java.lang.Object r2 = r2.get(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L4b
            int r2 = o.UST_CERT_GetPublicKeyAlgorithmType.access100
            int r2 = r2 + 121
            int r3 = r2 % 128
            o.UST_CERT_GetPublicKeyAlgorithmType.IAuthTabCallback_Parcel = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L32
            android.view.View r2 = r4.onNavigationEvent
            android.view.View r2 = r2.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 4
            int r3 = r3 / 0
            if (r2 == 0) goto L44
            goto L3c
        L32:
            android.view.View r2 = r4.onNavigationEvent
            android.view.View r2 = r2.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L44
        L3c:
            android.util.SparseArray r3 = r4.onWarmupCompleted()
            r3.put(r0, r2)
            goto L4b
        L44:
            android.util.SparseArray r3 = r4.onWarmupCompleted()
            r3.remove(r0)
        L4b:
            if (r2 == 0) goto L5d
            int r0 = o.UST_CERT_GetPublicKeyAlgorithmType.access100
            int r0 = r0 + 101
            int r3 = r0 % 128
            o.UST_CERT_GetPublicKeyAlgorithmType.IAuthTabCallback_Parcel = r3
            int r0 = r0 % r1
            java.lang.String r0 = r5.onExtraCallback()
            r2.setText(r0)
        L5d:
            int r0 = viva.republica.toss.R.id.message
            android.util.SparseArray r2 = r4.onWarmupCompleted()
            java.lang.Object r2 = r2.get(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L84
            android.view.View r2 = r4.onNavigationEvent
            android.view.View r2 = r2.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L7d
            android.util.SparseArray r4 = r4.onWarmupCompleted()
            r4.put(r0, r2)
            goto L84
        L7d:
            android.util.SparseArray r4 = r4.onWarmupCompleted()
            r4.remove(r0)
        L84:
            if (r2 == 0) goto L8d
            java.lang.String r4 = r5.onExtraCallbackWithResult()
            r2.setText(r4)
        L8d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            int r5 = o.UST_CERT_GetPublicKeyAlgorithmType.access100
            int r5 = r5 + 67
            int r0 = r5 % 128
            o.UST_CERT_GetPublicKeyAlgorithmType.IAuthTabCallback_Parcel = r0
            int r5 = r5 % r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyAlgorithmType.onExtraCallbackWithResult(o.AppMsgReceiver2, o.UST_CERT_GetPublicKeyAlgorithmType$onNavigationEvent):kotlin.Unit");
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(java.util.List<java.lang.Object> r9, java.util.List<o.onSwitchToDarkTheme> r10) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.UST_CERT_GetPublicKeyAlgorithmType.IAuthTabCallback_Parcel
            int r1 = r1 + 49
            int r2 = r1 % 128
            o.UST_CERT_GetPublicKeyAlgorithmType.access100 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            java.lang.String r1 = r8.onNavigationEvent
            int r1 = r1.length()
            r2 = 80
            int r2 = r2 / 0
            if (r1 <= 0) goto L53
            goto L23
        L1b:
            java.lang.String r1 = r8.onNavigationEvent
            int r1 = r1.length()
            if (r1 <= 0) goto L53
        L23:
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L53
            o.UserChoiceBillingListener r10 = o.UserChoiceBillingListener.onExtraCallback
            android.content.Context r10 = r10.onExtraCallback()
            int r1 = viva.republica.toss.R.string.no_search_result
            java.lang.String r10 = r10.getString(r1)
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            o.UST_CERT_GetPublicKeyAlgorithmType$onNavigationEvent r2 = new o.UST_CERT_GetPublicKeyAlgorithmType$onNavigationEvent
            r2.<init>(r10, r1)
            r9.add(r2)
            int r9 = o.UST_CERT_GetPublicKeyAlgorithmType.IAuthTabCallback_Parcel
            int r9 = r9 + 109
            int r10 = r9 % 128
            o.UST_CERT_GetPublicKeyAlgorithmType.access100 = r10
            int r9 = r9 % r0
            if (r9 != 0) goto L4e
            return
        L4e:
            r9 = 0
            r9.hashCode()
            throw r9
        L53:
            o.H5TinyPopMenuTitleBarTheme r0 = o.H5TinyPopMenuTitleBarTheme.IAuthTabCallback
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            int r1 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r6 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r5 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r3 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            r7 = 957813783(0x39171417, float:1.4407966E-4)
            r4 = -957813781(0xffffffffc6e8ebeb, float:-29813.959)
            java.lang.Object r0 = o.H5TinyPopMenuTitleBarTheme.IAuthTabCallback(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L84
            o.UST_CERT_GetPublicKeyAlgorithmType$onWarmupCompleted r10 = new o.UST_CERT_GetPublicKeyAlgorithmType$onWarmupCompleted
            r10.<init>()
            r9.add(r10)
            return
        L84:
            java.util.List r10 = o.enableAndroidTextMeasurementOptimizations.onWarmupCompleted(r10)
            boolean r0 = r8.IAuthTabCallbackStub
            if (r0 == 0) goto L97
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            o.UST_CERT_GetPublicKeyAlgorithmType$onExtraCallback r0 = new o.UST_CERT_GetPublicKeyAlgorithmType$onExtraCallback
            r0.<init>()
            java.util.List r10 = kotlin.collections.CollectionsKt.sortedWith(r10, r0)
        L97:
            java.util.Collection r10 = (java.util.Collection) r10
            r9.addAll(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyAlgorithmType.onExtraCallbackWithResult(java.util.List, java.util.List):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 113;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 71;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = i7;
                int i11 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallbackStubProxy ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(access000);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int i13 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i3) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, i13, bitsPerPixel, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12435 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i10 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 16015), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i14 = $11 + 45;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i16 = $11 + 89;
        $10 = i16 % 128;
        if (i16 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent {
        private final String IAuthTabCallback;
        private final String onWarmupCompleted;

        public onNavigationEvent(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.IAuthTabCallback = str;
            this.onWarmupCompleted = str2;
        }

        public final String onExtraCallback() {
            return this.IAuthTabCallback;
        }

        public final String onExtraCallbackWithResult() {
            return this.onWarmupCompleted;
        }
    }

    final class onExtraCallbackWithResult extends Filter {
        public onExtraCallbackWithResult() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(@Nullable CharSequence charSequence) {
            List listIAuthTabCallback;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType = UST_CERT_GetPublicKeyAlgorithmType.this;
            if (charSequence == null || StringsKt.isBlank(charSequence)) {
                listIAuthTabCallback = UST_CERT_GetPublicKeyAlgorithmType.IAuthTabCallback(uST_CERT_GetPublicKeyAlgorithmType);
            } else {
                listIAuthTabCallback = new ArrayList();
                List listIAuthTabCallback2 = UST_CERT_GetPublicKeyAlgorithmType.IAuthTabCallback(uST_CERT_GetPublicKeyAlgorithmType);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listIAuthTabCallback2) {
                    if (obj instanceof onSwitchToDarkTheme) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (onNavigationEvent((onSwitchToDarkTheme) obj2, charSequence)) {
                        arrayList2.add(obj2);
                    }
                }
                UST_CERT_GetPublicKeyAlgorithmType.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), new Object[]{uST_CERT_GetPublicKeyAlgorithmType, listIAuthTabCallback, arrayList2}, -2017820916, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2017820917, nSetPosition.onExtraCallbackWithResult());
            }
            filterResults.values = listIAuthTabCallback;
            filterResults.count = listIAuthTabCallback.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(@Nullable CharSequence charSequence, @Nullable Filter.FilterResults filterResults) {
            if ((filterResults != null ? filterResults.values : null) != null) {
                UST_CERT_GetPublicKeyAlgorithmType.onNavigationEvent(UST_CERT_GetPublicKeyAlgorithmType.this).clear();
                if (charSequence == null || charSequence.length() == 0) {
                    UST_CERT_GetPublicKeyAlgorithmType.onNavigationEvent(UST_CERT_GetPublicKeyAlgorithmType.this).addAll(UST_CERT_GetPublicKeyAlgorithmType.IAuthTabCallback(UST_CERT_GetPublicKeyAlgorithmType.this));
                } else {
                    Object obj = filterResults.values;
                    List listEmptyList = obj instanceof List ? (List) obj : null;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    UST_CERT_GetPublicKeyAlgorithmType.onNavigationEvent(UST_CERT_GetPublicKeyAlgorithmType.this).addAll(listEmptyList);
                }
                UST_CERT_GetPublicKeyAlgorithmType uST_CERT_GetPublicKeyAlgorithmType = UST_CERT_GetPublicKeyAlgorithmType.this;
                uST_CERT_GetPublicKeyAlgorithmType.onNavigationEvent(UST_CERT_GetPublicKeyAlgorithmType.onNavigationEvent(uST_CERT_GetPublicKeyAlgorithmType));
                UST_CERT_GetPublicKeyAlgorithmType.this.notifyDataSetChanged();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final boolean onNavigationEvent(im.toss.featurescommon.contacts.library.Receivable r7, java.lang.CharSequence r8) {
            /*
                r6 = this;
                o.getSignForPKCS7V3NoContents r0 = o.getSignForPKCS7V3NoContents.IAuthTabCallback
                java.lang.String r1 = r7.onExtraCallback()
                java.lang.String r2 = r8.toString()
                boolean r1 = r0.onNavigationEvent(r1, r2)
                boolean r2 = r7 instanceof o.onSwitchToDarkTheme
                r3 = 0
                if (r2 == 0) goto L2d
                r2 = r7
                o.onSwitchToDarkTheme r2 = (o.onSwitchToDarkTheme) r2
                java.lang.String r4 = r2.onNavigationEvent()
                int r4 = r4.length()
                if (r4 <= 0) goto L2d
                java.lang.String r2 = r2.onNavigationEvent()
                java.lang.String r4 = r8.toString()
                boolean r0 = r0.onNavigationEvent(r2, r4)
                goto L2e
            L2d:
                r0 = r3
            L2e:
                java.lang.String r8 = o.mergeParams.onNavigationEvent(r8)
                int r2 = r8.length()
                r4 = 1
                if (r2 <= 0) goto L47
                java.lang.String r7 = r7.IAuthTabCallbackStub()
                r2 = 2
                r5 = 0
                boolean r7 = kotlin.text.StringsKt.contains$default(r7, r8, r3, r2, r5)
                if (r7 == 0) goto L47
                r7 = r4
                goto L48
            L47:
                r7 = r3
            L48:
                if (r1 != 0) goto L4f
                if (r7 != 0) goto L4f
                if (r0 != 0) goto L4f
                return r3
            L4f:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyAlgorithmType.onExtraCallbackWithResult.onNavigationEvent(im.toss.featurescommon.contacts.library.Receivable, java.lang.CharSequence):boolean");
        }
    }

    public static final class onExtraCallback<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            onSwitchToDarkTheme.IAuthTabCallback iAuthTabCallback = onSwitchToDarkTheme.Companion;
            return getCodeNameBytes.IAuthTabCallback(Boolean.valueOf(ArraysKt.contains(iAuthTabCallback.onWarmupCompleted(), ((onSwitchToDarkTheme) t2).onExtraCallback())), Boolean.valueOf(ArraysKt.contains(iAuthTabCallback.onWarmupCompleted(), ((onSwitchToDarkTheme) t).onExtraCallback())));
        }
    }

    public final void onNavigationEvent(@NotNull List<onSwitchToDarkTheme> list) {
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), new Object[]{this, list}, -701146427, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 701146427, nSetPosition.onExtraCallbackWithResult());
    }
}
