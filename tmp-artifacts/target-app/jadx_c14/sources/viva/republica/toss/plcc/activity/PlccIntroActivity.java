package viva.republica.toss.plcc.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.zziea;
import im.toss.network.model.BaseApiResponse;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMP_UpdateCertificate;
import o.DelayProducerExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.FullScreenAdShowConfigBuilder;
import o.IPostMessageServiceStubProxy;
import o.InterstitialAdInterstitialAdShowConfigBuilder;
import o.MapConverter;
import o.NetConverter3;
import o.SessionTrackerb;
import o.TombstoneProtosMemoryMappingBuilder;
import o.clearTid;
import o.disableImageViewPreallocationAndroid;
import o.getParamImp;
import o.initMiniApp;
import o.onJsBridgeReady;
import o.setMessageBytes;
import o.toCircle;
import o.writeRaw;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.card.PlccCardTransactionActivity;
import viva.republica.toss.plcc.activity.PlccIntroActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccIntroActivity extends Hilt_PlccIntroActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static long IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    public static final int asBinder;
    private boolean asInterface;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.plcc.activity.PlccIntroActivity$$ExternalSyntheticLambda11
        public final Object invoke() {
            return PlccIntroActivity.IAuthTabCallback(this.f$0);
        }
    });
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallbackStub(this));

    static {
        IAuthTabCallback();
        Companion = new onNavigationEvent(null);
        asBinder = 8;
        int i = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ String IAuthTabCallback(PlccIntroActivity plccIntroActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(plccIntroActivity);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return strOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlccIntroActivity plccIntroActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(plccIntroActivity, dialogInterface);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        int i5 = access100 + 73;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlccIntroActivity plccIntroActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access000 + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(plccIntroActivity, th);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(PlccIntroActivity plccIntroActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(plccIntroActivity, th);
            throw null;
        }
        Unit unitOnTransact = onTransact(plccIntroActivity, th);
        int i3 = access100 + 111;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(PlccIntroActivity plccIntroActivity, DelayProducerExternalSyntheticLambda0 delayProducerExternalSyntheticLambda0, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {plccIntroActivity, delayProducerExternalSyntheticLambda0, Boolean.valueOf(z)};
        Unit unit = (Unit) onWarmupCompleted(zziea.IAuthTabCallback(), 1751212071, -1751212069, objArr, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        int i4 = access100 + 89;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(PlccIntroActivity plccIntroActivity, toCircle tocircle) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(plccIntroActivity, tocircle);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PlccIntroActivity plccIntroActivity = (PlccIntroActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(zziea.IAuthTabCallback(), 78076233, -78076233, new Object[]{plccIntroActivity, dialogInterface}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        int i4 = access000 + 67;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlccIntroActivity plccIntroActivity, DelayProducerExternalSyntheticLambda0 delayProducerExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = access000 + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(plccIntroActivity, delayProducerExternalSyntheticLambda0);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        int i5 = access100 + 87;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PlccIntroActivity plccIntroActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(zziea.IAuthTabCallback(), 504835732, -504835728, new Object[]{plccIntroActivity, dialogInterface}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        int i4 = access100 + 111;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i2;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i3 | i2 | i));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i | i2)) | (~(i13 | i8)) | (~(i3 | i));
        int i16 = i3 + i2 + i4 + ((-298151579) * i6) + ((-427515960) * i5);
        int i17 = i16 * i16;
        int i18 = (i3 * (-431502880)) + 875560960 + ((-431502880) * i2) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i4) + ((-16252928) * i6) + (423624704 * i5) + (1109590016 * i17);
        int i19 = ((i3 * (-2003555040)) - 1632655964) + (i2 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i4 * (-2003554617)) + (i6 * 1812671363) + (i5 * (-1519508360)) + (i17 * (-1288372224));
        int i20 = i18 + (i19 * i19 * (-1796407296));
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? i20 != 4 ? i20 != 5 ? onNavigationEvent(objArr) : asInterface(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, List list) {
        int i = 2 % 2;
        int i2 = access100 + 115;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(function1, list);
        }
        onExtraCallbackWithResult(function1, list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlccIntroActivity plccIntroActivity, Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access000 + 89;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            unit = (Unit) onWarmupCompleted(zziea.IAuthTabCallback(), -565115417, 565115418, new Object[]{plccIntroActivity, th}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
            int i3 = 36 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(zziea.IAuthTabCallback(), -565115417, 565115418, new Object[]{plccIntroActivity, th}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        }
        int i4 = access000 + 3;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlccIntroActivity plccIntroActivity, toCircle tocircle) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 87;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(plccIntroActivity, tocircle);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(plccIntroActivity, tocircle);
        int i3 = access100 + 119;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 125;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
        int i5 = i2 + 3;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    public static final class IAuthTabCallbackStub implements Function0<CMP_UpdateCertificate> {
        final /* synthetic */ Activity onNavigationEvent;

        public IAuthTabCallbackStub(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CMP_UpdateCertificate invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_UpdateCertificate.onExtraCallback(layoutInflater);
        }
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 61;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 105;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return sessionTrackerb;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = access000 + 63;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            int i4 = 56 / 0;
        }
        int i5 = i3 + 15;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    private final String ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access000 + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        int i4 = access000 + 11;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onNavigationEvent(PlccIntroActivity plccIntroActivity) throws Throwable {
        int i = 2 % 2;
        Intent intent = plccIntroActivity.getIntent();
        Object[] objArr = new Object[1];
        a(new char[]{29475, 12775, 63121, 47949, 30831, 15676, 58310, 41190}, 17107 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra != null) {
            return stringExtra;
        }
        int i2 = access100 + 117;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intent intent2 = plccIntroActivity.getIntent();
        Object[] objArr2 = new Object[1];
        a(new char[]{29475, 1129, 40333, 5411, 44631, 10213, 48909}, 30557 - View.resolveSizeAndState(0, 0, 0), objArr2);
        String stringExtra2 = intent2.getStringExtra(((String) objArr2[0]).intern());
        if (stringExtra2 != null) {
            return stringExtra2;
        }
        int i4 = access000 + 63;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return "";
    }

    private final CMP_UpdateCertificate updateVisuals() {
        int i = 2 % 2;
        int i2 = access100 + 87;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.IAuthTabCallbackStub.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (CMP_UpdateCertificate) value;
        }
        Object value2 = this.IAuthTabCallbackStub.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, androidx.appcompat.app.AppCompatActivity, im.toss.base.BaseActivity, viva.republica.toss.plcc.activity.PlccIntroActivity] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // viva.republica.toss.plcc.activity.Hilt_PlccIntroActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        Bundle extras;
        Object next;
        Object next2;
        Object next3;
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(updateVisuals().getRoot());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            Unit unit = Unit.INSTANCE;
        }
        ConstraintLayout root = updateVisuals().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, updateVisuals().onExtraCallback, (View) null, (View) null, false, 14, (Object) null);
        Intent intent = getIntent();
        Boolean bool = Boolean.FALSE;
        if (intent != null && (extras = intent.getExtras()) != null) {
            int i2 = access000 + 37;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            if (extras.containsKey("connecting")) {
                if (zzbq.onNavigationEvent(intent)) {
                    int i4 = access000 + 59;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        ?? string = extras2.getString("connecting");
                        if (string == 0) {
                            int i6 = access000 + 85;
                            access100 = i6 % 128;
                            int i7 = i6 % 2;
                        } else {
                            if (Intrinsics.areEqual(Boolean.class, Integer.class)) {
                                string = StringsKt.toIntOrNull((String) string);
                            } else if (Intrinsics.areEqual(Boolean.class, Long.class)) {
                                string = StringsKt.toLongOrNull((String) string);
                            } else if (Intrinsics.areEqual(Boolean.class, Float.class)) {
                                string = StringsKt.toFloatOrNull((String) string);
                            } else if (Intrinsics.areEqual(Boolean.class, Double.class)) {
                                string = StringsKt.toDoubleOrNull((String) string);
                            } else if (Intrinsics.areEqual(Boolean.class, Short.class)) {
                                int i8 = access000 + 31;
                                access100 = i8 % 128;
                                int i9 = i8 % 2;
                                string = StringsKt.toShortOrNull((String) string);
                            } else if (Intrinsics.areEqual(Boolean.class, Byte.class)) {
                                string = StringsKt.toByteOrNull((String) string);
                            } else if (!Intrinsics.areEqual(Boolean.class, Boolean.class)) {
                                if (Intrinsics.areEqual(Boolean.class, Character.class)) {
                                    string = Character.valueOf(string.charAt(0));
                                } else if (!Intrinsics.areEqual(Boolean.class, String.class)) {
                                    if (Intrinsics.areEqual(Boolean.class, Integer[].class)) {
                                        List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList = new ArrayList();
                                        Iterator it = listSplit$default.iterator();
                                        while (it.hasNext()) {
                                            int i10 = access100 + 19;
                                            access000 = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                next3 = it.next();
                                                int i11 = 92 / 0;
                                                if (((String) next3).length() > 0) {
                                                    arrayList.add(next3);
                                                }
                                            } else {
                                                next3 = it.next();
                                                if (((String) next3).length() > 0) {
                                                    arrayList.add(next3);
                                                }
                                            }
                                        }
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it2.next()).toString())));
                                        }
                                        string = arrayList2.toArray(new Integer[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Long[].class)) {
                                        List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj : listSplit$default2) {
                                            if (((String) obj).length() > 0) {
                                                arrayList3.add(obj);
                                            }
                                        }
                                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                        Iterator it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it3.next()).toString())));
                                        }
                                        string = arrayList4.toArray(new Long[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Float[].class)) {
                                        List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj2 : listSplit$default3) {
                                            if (((String) obj2).length() > 0) {
                                                arrayList5.add(obj2);
                                            }
                                        }
                                        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                        Iterator it4 = arrayList5.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it4.next()).toString())));
                                        }
                                        string = arrayList6.toArray(new Float[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Double[].class)) {
                                        List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj3 : listSplit$default4) {
                                            if (((String) obj3).length() > 0) {
                                                arrayList7.add(obj3);
                                            }
                                        }
                                        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                        Iterator it5 = arrayList7.iterator();
                                        while (it5.hasNext()) {
                                            arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it5.next()).toString())));
                                        }
                                        string = arrayList8.toArray(new Double[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Short[].class)) {
                                        List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList9 = new ArrayList();
                                        for (Object obj4 : listSplit$default5) {
                                            if (((String) obj4).length() > 0) {
                                                arrayList9.add(obj4);
                                            }
                                        }
                                        ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                        Iterator it6 = arrayList9.iterator();
                                        while (it6.hasNext()) {
                                            int i12 = access000 + 89;
                                            access100 = i12 % 128;
                                            if (i12 % 2 == 0) {
                                                arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it6.next()).toString())));
                                                int i13 = 82 / 0;
                                            } else {
                                                arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it6.next()).toString())));
                                            }
                                        }
                                        string = arrayList10.toArray(new Short[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Byte[].class)) {
                                        List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList11 = new ArrayList();
                                        for (Object obj5 : listSplit$default6) {
                                            if (((String) obj5).length() > 0) {
                                                arrayList11.add(obj5);
                                            }
                                        }
                                        ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                        Iterator it7 = arrayList11.iterator();
                                        while (it7.hasNext()) {
                                            arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it7.next()).toString())));
                                        }
                                        string = arrayList12.toArray(new Byte[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Boolean[].class)) {
                                        List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList13 = new ArrayList();
                                        Iterator it8 = listSplit$default7.iterator();
                                        while (it8.hasNext()) {
                                            int i14 = access000 + 53;
                                            access100 = i14 % 128;
                                            if (i14 % 2 == 0) {
                                                ((String) it8.next()).length();
                                                bool.hashCode();
                                                throw null;
                                            }
                                            Object next4 = it8.next();
                                            if (((String) next4).length() > 0) {
                                                arrayList13.add(next4);
                                            }
                                        }
                                        ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                        Iterator it9 = arrayList13.iterator();
                                        while (it9.hasNext()) {
                                            arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it9.next()).toString())));
                                        }
                                        string = arrayList14.toArray(new Boolean[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, Character[].class)) {
                                        List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList15 = new ArrayList();
                                        Iterator it10 = listSplit$default8.iterator();
                                        while (it10.hasNext()) {
                                            int i15 = access000 + 3;
                                            access100 = i15 % 128;
                                            if (i15 % 2 == 0) {
                                                next2 = it10.next();
                                                int i16 = 65 / 0;
                                                if (((String) next2).length() > 0) {
                                                    arrayList15.add(next2);
                                                }
                                            } else {
                                                next2 = it10.next();
                                                if (((String) next2).length() > 0) {
                                                    arrayList15.add(next2);
                                                }
                                            }
                                        }
                                        ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                        Iterator it11 = arrayList15.iterator();
                                        while (it11.hasNext()) {
                                            arrayList16.add(Character.valueOf(StringsKt.trim((String) it11.next()).toString().charAt(0)));
                                        }
                                        string = arrayList16.toArray(new Character[0]);
                                    } else if (Intrinsics.areEqual(Boolean.class, String[].class)) {
                                        List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList17 = new ArrayList();
                                        for (Object obj6 : listSplit$default9) {
                                            if (((String) obj6).length() > 0) {
                                                arrayList17.add(obj6);
                                            }
                                        }
                                        string = arrayList17.toArray(new String[0]);
                                    } else {
                                        Object[] enumConstants = Boolean.class.getEnumConstants();
                                        if (enumConstants != null) {
                                            ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                            for (Object obj7 : enumConstants) {
                                                Intrinsics.checkNotNull(obj7, "");
                                                arrayList18.add((Enum) obj7);
                                            }
                                            Iterator it12 = arrayList18.iterator();
                                            while (true) {
                                                if (it12.hasNext()) {
                                                    next = it12.next();
                                                    if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                        break;
                                                    }
                                                } else {
                                                    next = null;
                                                    break;
                                                }
                                            }
                                            string = (Enum) next;
                                        } else {
                                            string = 0;
                                        }
                                        if (string == 0) {
                                            int i17 = access100 + 53;
                                            access000 = i17 % 128;
                                            if (i17 % 2 != 0) {
                                                zzaj.onNavigationEvent().onActivityLayout();
                                                throw null;
                                            }
                                            if (zzaj.onNavigationEvent().onActivityLayout()) {
                                                throw new IllegalArgumentException(Boolean.class.getSimpleName() + " is not supported");
                                            }
                                            string = 0;
                                        }
                                    }
                                }
                            } else {
                                string = Boolean.valueOf(Boolean.parseBoolean(string));
                            }
                            if (string instanceof Boolean) {
                                bool = string;
                            } else {
                                int i18 = access100 + 43;
                                access000 = i18 % 128;
                                if (i18 % 2 != 0) {
                                    bool.hashCode();
                                    throw null;
                                }
                            }
                            bool = bool;
                        }
                    }
                } else {
                    Bundle extras3 = intent.getExtras();
                    Boolean bool2 = extras3 != null ? extras3.get("connecting") : null;
                    bool = bool2 instanceof Boolean ? bool2 : null;
                }
            }
        }
        if (bool != null) {
            bool = bool;
        }
        this.asInterface = bool.booleanValue();
        onWarmupCompleted(new PlccIntroActivity$.ExternalSyntheticLambda0((PlccIntroActivity) this));
    }

    private static final Unit IAuthTabCallback(PlccIntroActivity plccIntroActivity, toCircle tocircle) throws Throwable {
        int i = 2 % 2;
        if (tocircle == null) {
            int i2 = access100 + 25;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            plccIntroActivity.setEngagementSignalsCallback();
            int i4 = access000 + 101;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            plccIntroActivity.onNavigationEvent(tocircle);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, List list) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            function1.invoke(CollectionsKt.firstOrNull(list));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        function1.invoke(CollectionsKt.firstOrNull(list));
        Unit unit2 = Unit.INSTANCE;
        int i3 = access000 + 17;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 17;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), View.resolveSize(0, 0) + 24, 19626 - TextUtils.indexOf((CharSequence) "", '0'), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackDefault ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 117;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), View.resolveSize(0, 0) + 59, 6383 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onWarmupCompleted(PlccIntroActivity plccIntroActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 11;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            plccIntroActivity.finish();
            Unit unit = Unit.INSTANCE;
            int i3 = access000 + 17;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        plccIntroActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, viva.republica.toss.plcc.activity.PlccIntroActivity] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ?? r2 = (PlccIntroActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, (Context) r2, false, (initMiniApp) null, (Function0) null, new PlccIntroActivity$.ExternalSyntheticLambda8((PlccIntroActivity) r2), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 33;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(Function1<? super toCircle, Unit> function1) throws Throwable {
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, TextUtils.getTrimmedLength("") + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1023870124);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 29426), 22 - Color.blue(0), 24734 - Gravity.getAbsoluteGravity(0, 0), -206043708, false, "getInterfaceDescriptor", new Class[0]);
            }
            writeRaw<BaseApiResponse<List<toCircle>>> writerawOnExtraCallbackWithResult = ((FullScreenAdShowConfigBuilder) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallbackWithResult();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new IAuthTabCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            onNavigationEvent(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new PlccIntroActivity$.ExternalSyntheticLambda9(this), new PlccIntroActivity$.ExternalSyntheticLambda10(function1)));
            int i2 = access000 + 17;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(toCircle tocircle) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 1;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = onExtraCallback.IAuthTabCallback[tocircle.onNavigationEvent().ordinal()];
            throw null;
        }
        switch (onExtraCallback.IAuthTabCallback[tocircle.onNavigationEvent().ordinal()]) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
            case 2:
            case 3:
                onExtraCallback(PlccCardTransactionActivity.onExtraCallbackWithResult.IAuthTabCallback(PlccCardTransactionActivity.Companion, this, tocircle.onExtraCallbackWithResult(), null, 4, null));
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                onExtraCallback(PlccIssueStatusActivity.Companion.onExtraCallbackWithResult(this, tocircle));
                break;
            case 12:
            case 13:
            case 14:
                setEngagementSignalsCallback();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (tocircle.onWarmupCompleted()) {
            onJsBridgeReady.onNavigationEvent(this, getString(R.string.app_plcc_activity___7341abb77f), 0, 2, (Object) null);
            int i4 = access000 + 109;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onWarmupCompleted(PlccIntroActivity plccIntroActivity, DelayProducerExternalSyntheticLambda0 delayProducerExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delayProducerExternalSyntheticLambda0, "");
        onWarmupCompleted(zziea.IAuthTabCallback(), 1452548255, -1452548250, new Object[]{plccIntroActivity, delayProducerExternalSyntheticLambda0}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 65;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PlccIntroActivity plccIntroActivity = (PlccIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 61;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            plccIntroActivity.finish();
            return Unit.INSTANCE;
        }
        plccIntroActivity.finish();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PlccIntroActivity plccIntroActivity, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, plccIntroActivity, false, (initMiniApp) null, (Function0) null, new PlccIntroActivity$.ExternalSyntheticLambda7(plccIntroActivity), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 63;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void setEngagementSignalsCallback() throws Throwable {
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29427), 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 24735 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971064817);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - ExpandableListView.getPackedPositionChild(0L)), KeyEvent.getDeadChar(0, 0) + 22, TextUtils.indexOf("", "", 0) + 24734, -1144844641, false, "access100", new Class[0]);
            }
            writeRaw<BaseApiResponse<DelayProducerExternalSyntheticLambda0>> writerawOnWarmupCompleted = ((InterstitialAdInterstitialAdShowConfigBuilder) ((Method) objOnExtraCallback2).invoke(obj, null)).onWarmupCompleted();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            onNavigationEvent(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new PlccIntroActivity$.ExternalSyntheticLambda4(this), new PlccIntroActivity$.ExternalSyntheticLambda5(this)));
            int i2 = access000 + 47;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 85 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        PlccIntroActivity plccIntroActivity = (PlccIntroActivity) objArr[0];
        DelayProducerExternalSyntheticLambda0 delayProducerExternalSyntheticLambda0 = (DelayProducerExternalSyntheticLambda0) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 25;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!plccIntroActivity.asInterface) {
                plccIntroActivity.onExtraCallback(delayProducerExternalSyntheticLambda0);
                int i3 = access100 + 39;
                access000 = i3 % 128;
                if (i3 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 29426), View.resolveSizeAndState(0, 0, 0) + 22, 24734 - TextUtils.indexOf("", ""), -842029757, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1023870124);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 24735, -206043708, false, "getInterfaceDescriptor", new Class[0]);
                }
                writeRaw<BaseApiResponse<Boolean>> writerawOnExtraCallback = ((FullScreenAdShowConfigBuilder) ((Method) objOnExtraCallback2).invoke(obj2, null)).onExtraCallback();
                MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new PlccIntroActivity$.ExternalSyntheticLambda2(plccIntroActivity), new PlccIntroActivity$.ExternalSyntheticLambda3(plccIntroActivity, delayProducerExternalSyntheticLambda0));
                return null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        boolean z = plccIntroActivity.asInterface;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(PlccIntroActivity plccIntroActivity, toCircle tocircle) throws Throwable {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 27;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (tocircle != null) {
            plccIntroActivity.onNavigationEvent(tocircle);
        } else {
            int i4 = i2 + 1;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                plccIntroActivity.setEngagementSignalsCallback();
                int i5 = 41 / 0;
            } else {
                plccIntroActivity.setEngagementSignalsCallback();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r6) throws java.lang.Throwable {
        /*
            r0 = 0
            r1 = r6[r0]
            viva.republica.toss.plcc.activity.PlccIntroActivity r1 = (viva.republica.toss.plcc.activity.PlccIntroActivity) r1
            r2 = 1
            r2 = r6[r2]
            o.DelayProducerExternalSyntheticLambda0 r2 = (o.DelayProducerExternalSyntheticLambda0) r2
            r3 = 2
            r6 = r6[r3]
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            int r4 = r3 % r3
            int r4 = viva.republica.toss.plcc.activity.PlccIntroActivity.access100
            int r4 = r4 + 17
            int r5 = r4 % 128
            viva.republica.toss.plcc.activity.PlccIntroActivity.access000 = r5
            int r4 = r4 % r3
            if (r4 == 0) goto L25
            r1.asInterface = r0
            if (r6 == 0) goto L32
            goto L29
        L25:
            r1.asInterface = r0
            if (r6 == 0) goto L32
        L29:
            viva.republica.toss.plcc.activity.PlccIntroActivity$$ExternalSyntheticLambda6 r6 = new viva.republica.toss.plcc.activity.PlccIntroActivity$$ExternalSyntheticLambda6
            r6.<init>(r1)
            r1.onWarmupCompleted(r6)
            goto L3e
        L32:
            r1.onExtraCallback(r2)
            int r6 = viva.republica.toss.plcc.activity.PlccIntroActivity.access000
            int r6 = r6 + 81
            int r0 = r6 % 128
            viva.republica.toss.plcc.activity.PlccIntroActivity.access100 = r0
            int r6 = r6 % r3
        L3e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccIntroActivity.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PlccIntroActivity plccIntroActivity = (PlccIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        plccIntroActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 87;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onTransact(PlccIntroActivity plccIntroActivity, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, plccIntroActivity, false, (initMiniApp) null, (Function0) null, new PlccIntroActivity$.ExternalSyntheticLambda1(plccIntroActivity), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 23;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(DelayProducerExternalSyntheticLambda0 delayProducerExternalSyntheticLambda0) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onExtraCallback.onWarmupCompleted[delayProducerExternalSyntheticLambda0.IAuthTabCallback().ordinal()];
        if (i4 == 1) {
            if (delayProducerExternalSyntheticLambda0.onExtraCallbackWithResult() != null) {
                validateRelationship();
                return;
            } else {
                validateRelationship();
                return;
            }
        }
        int i5 = access000 + 67;
        int i6 = i5 % 128;
        access100 = i6;
        int i7 = i5 % 2;
        if (i4 == 2) {
            validateRelationship();
            return;
        }
        int i8 = i6 + 103;
        access000 = i8 % 128;
        if (i8 % 2 == 0 ? i4 != 3 : i4 != 4) {
            if (i4 != 4) {
                int i9 = i6 + 9;
                access000 = i9 % 128;
                int i10 = i9 % 2;
                if (i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                onJsBridgeReady.onNavigationEvent(this, getString(R.string.app_plcc_activity___858104a51a), 0, 2, (Object) null);
                finish();
                return;
            }
        }
        onJsBridgeReady.onNavigationEvent(this, getString(R.string.app_plcc_activity___3babedb380), 0, 2, (Object) null);
        finish();
    }

    private final void validateRelationship() throws Throwable {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerbOnNavigationEvent = onNavigationEvent();
        Context context = getContext();
        String strICustomTabsServiceStub = ICustomTabsServiceStub();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{29474, 30423, 30919, 25325, 25839, 28314, 20620, 23175, 23738, 18144, 18432, 12815, 13396, 15968, 8317, 10757, 11277, 5659, 6182, 556, 1480, 3987, 61904, 64485, 65003, 59278, 59856, 54161, 54709, 57254, 49479, 52037, 52494, 46948, 47458, 41734, 42259, 44843, 37167, 39709, 40653, 32903}, ExpandableListView.getPackedPositionGroup(0L) + 1523, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append("TOSSHANAPLCC");
        sb.append("&referrer=");
        sb.append(strICustomTabsServiceStub);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnNavigationEvent, context, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        finish();
        int i2 = access000 + 109;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(Intent intent) {
        int i = 2 % 2;
        int i2 = access000 + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ Intent onNavigationEvent(onNavigationEvent onnavigationevent, Context context, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return onnavigationevent.onWarmupCompleted(context, z, z2);
        }

        public final Intent onWarmupCompleted(@NotNull Context context, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) PlccIntroActivity.class).putExtra("skipIntro", z).putExtra("connecting", z2);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(PlccIntroActivity plccIntroActivity, DialogInterface dialogInterface) {
        return (Unit) onWarmupCompleted(zziea.IAuthTabCallback(), 2041285867, -2041285864, new Object[]{plccIntroActivity, dialogInterface}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(PlccIntroActivity plccIntroActivity, Throwable th) {
        return (Unit) onWarmupCompleted(zziea.IAuthTabCallback(), -565115417, 565115418, new Object[]{plccIntroActivity, th}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(PlccIntroActivity plccIntroActivity, DialogInterface dialogInterface) {
        return (Unit) onWarmupCompleted(zziea.IAuthTabCallback(), 504835732, -504835728, new Object[]{plccIntroActivity, dialogInterface}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    private final void IAuthTabCallback(DelayProducerExternalSyntheticLambda0 delayProducerExternalSyntheticLambda0) {
        onWarmupCompleted(zziea.IAuthTabCallback(), 1452548255, -1452548250, new Object[]{this, delayProducerExternalSyntheticLambda0}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    private static final Unit asInterface(PlccIntroActivity plccIntroActivity, DialogInterface dialogInterface) {
        return (Unit) onWarmupCompleted(zziea.IAuthTabCallback(), 78076233, -78076233, new Object[]{plccIntroActivity, dialogInterface}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(PlccIntroActivity plccIntroActivity, DelayProducerExternalSyntheticLambda0 delayProducerExternalSyntheticLambda0, boolean z) {
        Object[] objArr = {plccIntroActivity, delayProducerExternalSyntheticLambda0, Boolean.valueOf(z)};
        return (Unit) onWarmupCompleted(zziea.IAuthTabCallback(), 1751212071, -1751212069, objArr, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccIntroActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 71;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        int i5 = access000 + 7;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccIntroActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        int i5 = access100 + 95;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccIntroActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access000 + 53;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccIntroActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access000 + 17;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackDefault = 5470907348499887718L;
    }
}
