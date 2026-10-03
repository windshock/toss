package viva.republica.toss.card.register;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ALCEyeBlink;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DomainConfigProxy;
import o.PlayerErrorCode;
import o.SessionTrackerb;
import o.UST_CMP_IssueCertificate_SendConf;
import o.addExtra;
import o.getIssuerAndSerialNumber;
import o.setMediationService;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeCardRegisterActivity extends Hilt_SchemeCardRegisterActivity {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static int access000;
    private static byte[] extraCallback;
    public static final int onTransact;
    private static int readTypedObject;
    private static short[] writeTypedObject;
    private boolean IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private String access100;
    private String asBinder;
    private long asInterface;
    private String getInterfaceDescriptor;

    @Inject
    public DomainConfigProxy homeChangeHelper;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {35, -27, Byte.MIN_VALUE, 50};
    private static final int $$b = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 0;
    private static int onMessageChannelReady = 1;
    private static int extraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = 115 - r8
            byte[] r1 = viva.republica.toss.card.register.SchemeCardRegisterActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2f
        L16:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.register.SchemeCardRegisterActivity.$$c(int, byte, int):java.lang.String");
    }

    static {
        readTypedObject = 0;
        setEngagementSignalsCallback();
        Companion = new onNavigationEvent(null);
        onTransact = 8;
        int i = extraCallbackWithResult + 51;
        readTypedObject = i % 128;
        int i2 = i % 2;
    }

    @Override // viva.republica.toss.card.CardBaseActivity
    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 63;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 35;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 67;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return sessionTrackerb;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.card.register.Hilt_SchemeCardRegisterActivity, viva.republica.toss.card.CardBaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        if (bundle != null) {
            this.asBinder = bundle.getString("executionId");
        }
        if (bundle == null) {
            onWarmupCompleted(getIntent());
            ICustomTabsServiceStub();
            int i2 = onMessageChannelReady + 51;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = ICustomTabsCallback + 25;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 63;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            super.onNewIntent(intent);
            onWarmupCompleted(intent);
            ICustomTabsServiceStub();
            return;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        onWarmupCompleted(intent);
        ICustomTabsServiceStub();
        throw null;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle, @NotNull PersistableBundle persistableBundle) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            Intrinsics.checkNotNullParameter(persistableBundle, "");
            bundle.putString("executionId", this.asBinder);
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
            Intrinsics.checkNotNullParameter(persistableBundle, "");
            bundle.putString("executionId", this.asBinder);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v62, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v64, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r8v65, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v66, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r8v67, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r8v68, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v69, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private final void onWarmupCompleted(Intent intent) throws Throwable {
        ?? string;
        Object next;
        int i = 2 % 2;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("vendorId");
            if (stringExtra == null) {
                int i2 = onMessageChannelReady + 35;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
                stringExtra = intent.getStringExtra("cardCode");
                if (stringExtra == null) {
                    stringExtra = "";
                }
            }
            Integer intOrNull = StringsKt.toIntOrNull(stringExtra);
            int intExtra = 0;
            onNavigationEvent(intOrNull != null ? intOrNull.intValue() : intent.getIntExtra("vendorId", intent.getIntExtra("cardCode", 0)));
            String stringExtra2 = intent.getStringExtra("cardId");
            if (stringExtra2 == null) {
                int i4 = onMessageChannelReady + 113;
                ICustomTabsCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                stringExtra2 = "";
            }
            Long longOrNull = StringsKt.toLongOrNull(stringExtra2);
            this.asInterface = longOrNull != null ? longOrNull.longValue() : intent.getLongExtra("cardId", 0L);
            Object[] objArr = new Object[1];
            a((short) (TextUtils.lastIndexOf("", '0', 0, 0) + 55), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), 1862118918 - View.resolveSizeAndState(0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1728710837, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 39, objArr);
            String stringExtra3 = intent.getStringExtra(((String) objArr[0]).intern());
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.access100 = stringExtra3;
            Object[] objArr2 = new Object[1];
            a((short) ((-21) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 1862118909, (-1728710838) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 33, objArr2);
            String stringExtra4 = intent.getStringExtra(((String) objArr2[0]).intern());
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            this.getInterfaceDescriptor = stringExtra4;
            ?? r1 = Boolean.FALSE;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                int i5 = onMessageChannelReady + 81;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                if (extras.containsKey("deletable")) {
                    int i7 = onMessageChannelReady + 73;
                    ICustomTabsCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        zzbq.onNavigationEvent(intent);
                        obj.hashCode();
                        throw null;
                    }
                    if (zzbq.onNavigationEvent(intent)) {
                        int i8 = onMessageChannelReady + 121;
                        ICustomTabsCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            intent.getExtras();
                            throw null;
                        }
                        Bundle extras2 = intent.getExtras();
                        if (extras2 != null && (string = extras2.getString("deletable")) != 0) {
                            if (Intrinsics.areEqual(Boolean.class, Integer.class)) {
                                string = StringsKt.toIntOrNull((String) string);
                            } else if (Intrinsics.areEqual(Boolean.class, Long.class)) {
                                string = StringsKt.toLongOrNull((String) string);
                            } else if (!(!Intrinsics.areEqual(Boolean.class, Float.class))) {
                                string = StringsKt.toFloatOrNull((String) string);
                            } else if (Intrinsics.areEqual(Boolean.class, Double.class)) {
                                string = StringsKt.toDoubleOrNull((String) string);
                            } else if (Intrinsics.areEqual(Boolean.class, Short.class)) {
                                string = StringsKt.toShortOrNull((String) string);
                            } else if (Intrinsics.areEqual(Boolean.class, Byte.class)) {
                                string = StringsKt.toByteOrNull((String) string);
                            } else if (Intrinsics.areEqual(Boolean.class, Boolean.class)) {
                                string = Boolean.valueOf(Boolean.parseBoolean(string));
                            } else if (Intrinsics.areEqual(Boolean.class, Character.class)) {
                                string = Character.valueOf(string.charAt(0));
                            } else if (!Intrinsics.areEqual(Boolean.class, String.class)) {
                                if (Intrinsics.areEqual(Boolean.class, Integer[].class)) {
                                    List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : listSplit$default) {
                                        if (((String) obj).length() > 0) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                    }
                                    string = arrayList2.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Long[].class)) {
                                    List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj2 : listSplit$default2) {
                                        if (((String) obj2).length() > 0) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        int i9 = ICustomTabsCallback + 29;
                                        onMessageChannelReady = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                            throw null;
                                        }
                                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                    }
                                    string = arrayList4.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Float[].class)) {
                                    List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj3 : listSplit$default3) {
                                        if (((String) obj3).length() > 0) {
                                            arrayList5.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                    Iterator it3 = arrayList5.iterator();
                                    while (it3.hasNext()) {
                                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                                    }
                                    string = arrayList6.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Double[].class)) {
                                    List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj4 : listSplit$default4) {
                                        if (((String) obj4).length() > 0) {
                                            arrayList7.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it4 = arrayList7.iterator();
                                    while (it4.hasNext()) {
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                    }
                                    string = arrayList8.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj5 : listSplit$default5) {
                                        if (((String) obj5).length() > 0) {
                                            arrayList9.add(obj5);
                                        }
                                    }
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                    Iterator it5 = arrayList9.iterator();
                                    while (it5.hasNext()) {
                                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                                    }
                                    string = arrayList10.toArray(new Short[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Byte[].class)) {
                                    List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj6 : listSplit$default6) {
                                        if (((String) obj6).length() > 0) {
                                            arrayList11.add(obj6);
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it6 = arrayList11.iterator();
                                    while (it6.hasNext()) {
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                                    }
                                    string = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList13 = new ArrayList();
                                    for (Object obj7 : listSplit$default7) {
                                        if (((String) obj7).length() > 0) {
                                            arrayList13.add(obj7);
                                        }
                                    }
                                    ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                    Iterator it7 = arrayList13.iterator();
                                    while (it7.hasNext()) {
                                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                                    }
                                    string = arrayList14.toArray(new Boolean[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Character[].class)) {
                                    List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList15 = new ArrayList();
                                    for (Object obj8 : listSplit$default8) {
                                        if (((String) obj8).length() > 0) {
                                            arrayList15.add(obj8);
                                        }
                                    }
                                    ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                    Iterator it8 = arrayList15.iterator();
                                    while (it8.hasNext()) {
                                        int i10 = ICustomTabsCallback + 43;
                                        onMessageChannelReady = i10 % 128;
                                        arrayList16.add(Character.valueOf(i10 % 2 == 0 ? StringsKt.trim((String) it8.next()).toString().charAt(1) : StringsKt.trim((String) it8.next()).toString().charAt(0)));
                                    }
                                    string = arrayList16.toArray(new Character[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, String[].class)) {
                                    List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList17 = new ArrayList();
                                    for (Object obj9 : listSplit$default9) {
                                        if (((String) obj9).length() > 0) {
                                            arrayList17.add(obj9);
                                        }
                                    }
                                    string = arrayList17.toArray(new String[0]);
                                } else {
                                    Object[] enumConstants = Boolean.class.getEnumConstants();
                                    if (enumConstants != null) {
                                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                        int length = enumConstants.length;
                                        int i11 = 0;
                                        while (i11 < length) {
                                            int i12 = onMessageChannelReady + 71;
                                            ICustomTabsCallback = i12 % 128;
                                            if (i12 % 2 != 0) {
                                                Object obj10 = enumConstants[i11];
                                                Intrinsics.checkNotNull(obj10, "");
                                                arrayList18.add((Enum) obj10);
                                                i11 += 8;
                                            } else {
                                                Object obj11 = enumConstants[i11];
                                                Intrinsics.checkNotNull(obj11, "");
                                                arrayList18.add((Enum) obj11);
                                                i11++;
                                            }
                                        }
                                        Iterator it9 = arrayList18.iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            int i13 = onMessageChannelReady + 29;
                                            ICustomTabsCallback = i13 % 128;
                                            int i14 = i13 % 2;
                                            next = it9.next();
                                            if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                break;
                                            }
                                        }
                                        string = (Enum) next;
                                    } else {
                                        string = 0;
                                    }
                                    if (string == 0) {
                                        int i15 = onMessageChannelReady + 35;
                                        ICustomTabsCallback = i15 % 128;
                                        if (i15 % 2 != 0) {
                                            zzaj.onNavigationEvent().onActivityLayout();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                                            throw new IllegalArgumentException(Boolean.class.getSimpleName() + " is not supported");
                                        }
                                        string = 0;
                                    }
                                }
                            }
                            obj = (Boolean) (string instanceof Boolean ? string : null);
                        }
                    } else {
                        Bundle extras3 = intent.getExtras();
                        Object obj12 = extras3 != null ? extras3.get("deletable") : null;
                        obj = (Boolean) (obj12 instanceof Boolean ? obj12 : null);
                    }
                }
            }
            if (obj != null) {
                r1 = obj;
            }
            this.IAuthTabCallbackDefault = r1.booleanValue();
            if (intent.getBooleanExtra("im.toss.is_deep_link_flag", false)) {
                String stringExtra5 = intent.getStringExtra("monthRange");
                if (stringExtra5 == null) {
                    stringExtra5 = "";
                }
                Integer intOrNull2 = StringsKt.toIntOrNull(stringExtra5);
                if (intOrNull2 != null) {
                    intExtra = intOrNull2.intValue();
                }
            } else {
                intExtra = intent.getIntExtra("monthRange", 0);
            }
            this.IAuthTabCallbackStub = intExtra;
            getIssuerAndSerialNumber getissuerandserialnumber = getIssuerAndSerialNumber.onNavigationEvent;
            UST_CMP_IssueCertificate_SendConf uST_CMP_IssueCertificate_SendConf = UST_CMP_IssueCertificate_SendConf.CARD;
            if (true ^ getissuerandserialnumber.onNavigationEvent(uST_CMP_IssueCertificate_SendConf)) {
                String stringExtra6 = intent.getStringExtra("executionId");
                String str = stringExtra6 != null ? stringExtra6 : "";
                if (str.length() > 0) {
                    getissuerandserialnumber.onWarmupCompleted(uST_CMP_IssueCertificate_SendConf, str);
                } else {
                    getissuerandserialnumber.onExtraCallback(uST_CMP_IssueCertificate_SendConf);
                }
                this.asBinder = getissuerandserialnumber.onWarmupCompleted(uST_CMP_IssueCertificate_SendConf);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStub() throws Throwable {
        Object obj;
        String strOnNavigationEvent;
        int i = 2 % 2;
        String str = "";
        if (!addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted)) {
            int i2 = ICustomTabsCallback + 105;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((short) ((ViewConfiguration.getEdgeSlop() >> 16) - 17), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1862118838, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1728710838, (-15) - TextUtils.indexOf((CharSequence) "", '0'), objArr);
            Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
            Object[] objArr2 = new Object[1];
            a((short) ((-30) - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1862118867 - View.MeasureSpec.getSize(0), (-1728710839) - KeyEvent.normalizeMetaState(0), (-36) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), "card.register");
            SessionTrackerb.IAuthTabCallback(IAuthTabCallback(), this, builderBuildUpon.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            finish();
            return;
        }
        Object[] objArr3 = new Object[1];
        a((short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 103), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1862118874 - Color.argb(0, 0, 0, 0), Process.getGidForName("") - 1728710837, TextUtils.indexOf((CharSequence) "", '0') - 16, objArr3);
        Uri.Builder builderBuildUpon2 = Uri.parse(((String) objArr3[0]).intern()).buildUpon();
        if (onNavigationEvent() != 0) {
            int i4 = ICustomTabsCallback + 19;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr4 = new Object[1];
            a((short) (View.resolveSizeAndState(0, 0, 0) - 51), (byte) KeyEvent.keyCodeFromString(""), TextUtils.indexOf((CharSequence) "", '0', 0) + 1862118901, (-1728710854) - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 35, objArr4);
            builderBuildUpon2.appendQueryParameter(((String) objArr4[0]).intern(), String.valueOf(onNavigationEvent()));
        } else {
            builderBuildUpon2.appendQueryParameter("industries", "CARD");
        }
        Intent intent = getIntent();
        Object[] objArr5 = new Object[1];
        a((short) ((-30) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (byte) Drawable.resolveOpacity(0, 0), 1862118866 - TextUtils.lastIndexOf("", '0', 0, 0), (-1728710839) - View.MeasureSpec.getMode(0), (-36) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
        String stringExtra = intent.getStringExtra(((String) objArr5[0]).intern());
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (StringsKt.isBlank(stringExtra) && (stringExtra = getIntent().getStringExtra("from")) == null) {
            int i6 = ICustomTabsCallback + 101;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            stringExtra = "";
        }
        if (StringsKt.isBlank(stringExtra)) {
            stringExtra = "card_register";
        }
        Object[] objArr6 = new Object[1];
        a((short) ((Process.myPid() >> 22) - 30), (byte) (Color.rgb(0, 0, 0) + 16777216), 1862118866 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-1728710838) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-36) - TextUtils.getOffsetBefore("", 0), objArr6);
        builderBuildUpon2.appendQueryParameter(((String) objArr6[0]).intern(), stringExtra);
        String str2 = this.getInterfaceDescriptor;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            Object[] objArr7 = new Object[1];
            a((short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 21), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1862118907 - ((byte) KeyEvent.getModifierMetaStateMask()), KeyEvent.keyCodeFromString("") - 1728710839, View.resolveSize(0, 0) - 33, objArr7);
            builderBuildUpon2.appendQueryParameter(((String) objArr7[0]).intern(), this.getInterfaceDescriptor);
            builderBuildUpon2.appendQueryParameter("cardNotificationEnabled", "false");
        }
        Object obj2 = null;
        try {
            Result.Companion companion = Result.Companion;
            Gson gsonOnExtraCallback = ALCEyeBlink.onExtraCallback();
            String stringExtra2 = getIntent().getStringExtra(setMediationService.onNavigationEvent);
            if (stringExtra2 == null) {
                int i8 = onMessageChannelReady;
                int i9 = i8 + 11;
                ICustomTabsCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i10 = i8 + 125;
                ICustomTabsCallback = i10 % 128;
                int i11 = i10 % 2;
            } else {
                str = stringExtra2;
            }
            obj = Result.constructor-impl((setMediationService) gsonOnExtraCallback.fromJson(str, setMediationService.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        setMediationService setmediationservice = (setMediationService) obj;
        if (setmediationservice != null) {
            int i12 = ICustomTabsCallback + 95;
            onMessageChannelReady = i12 % 128;
            int i13 = i12 % 2;
            setMediationService.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = setmediationservice.onNavigationEvent();
            if (onextracallbackwithresultOnNavigationEvent != null) {
                int i14 = onMessageChannelReady + 49;
                ICustomTabsCallback = i14 % 128;
                if (i14 % 2 != 0) {
                    onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult();
                    obj2.hashCode();
                    throw null;
                }
                String strOnExtraCallbackWithResult = onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult != null) {
                    builderBuildUpon2.appendQueryParameter("orgListTitle", strOnExtraCallbackWithResult);
                }
            }
            setMediationService.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent2 = setmediationservice.onNavigationEvent();
            if (onextracallbackwithresultOnNavigationEvent2 != null && (strOnNavigationEvent = onextracallbackwithresultOnNavigationEvent2.onNavigationEvent()) != null) {
                int i15 = onMessageChannelReady + 65;
                ICustomTabsCallback = i15 % 128;
                int i16 = i15 % 2;
                builderBuildUpon2.appendQueryParameter("orgListDesc", strOnNavigationEvent);
            }
        }
        SessionTrackerb.onExtraCallbackWithResult(IAuthTabCallback(), getContext(), builderBuildUpon2.build().toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        finish();
    }

    @Override // viva.republica.toss.card.CardBaseActivity
    public String getScreenName() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 65;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return "SchemeCardRegisterActivity";
    }

    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static char[] onExtraCallback = {64961, 64976, 64982, 64998, 64967, 64986, 64983, 64991, 64981};
        private static char onWarmupCompleted = 51242;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ Intent onWarmupCompleted(onNavigationEvent onnavigationevent, Context context, int i, long j, String str, String str2, boolean z, String str3, String str4, String str5, int i2, Object obj) {
            long j2;
            String str6;
            boolean z2;
            String str7;
            int i3 = 2 % 2;
            int i4 = onNavigationEvent + 7;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            int i6 = i4 % 2;
            if ((i2 & 4) != 0) {
                int i7 = i5 + 105;
                onNavigationEvent = i7 % 128;
                j2 = i7 % 2 == 0 ? 1L : 0L;
            } else {
                j2 = j;
            }
            if ((i2 & 16) != 0) {
                int i8 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                str6 = null;
            } else {
                str6 = str2;
            }
            if ((i2 & 32) != 0) {
                int i9 = onNavigationEvent;
                int i10 = i9 + 25;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i9 + 63;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i2 & 64) != 0) {
                int i14 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                str7 = null;
            } else {
                str7 = str3;
            }
            return onnavigationevent.IAuthTabCallback(context, i, j2, str, str6, z2, str7, str4, str5);
        }

        public final Intent IAuthTabCallback(@NotNull Context context, int i, long j, @NotNull String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable String str4, @Nullable String str5) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) SchemeCardRegisterActivity.class);
            intent.putExtra("cardCode", i);
            intent.putExtra("cardId", j);
            intent.putExtra("from", str);
            Object[] objArr = new Object[1];
            a(new char[]{1, 0, '\b', 3, 1, 0, 4, 7, 6, 3, 13939}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 124), TextUtils.getTrimmedLength("") + 11, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str2);
            intent.putExtra("deletable", z);
            intent.putExtra("funnel", str3);
            Object[] objArr2 = new Object[1];
            a(new char[]{1, 0, 2, 5, 13876, 13876, 0, 1}, (byte) (TextUtils.getOffsetAfter("", 0) + 76), (KeyEvent.getMaxKeyCode() >> 16) + 8, objArr2);
            intent.putExtra(((String) objArr2[0]).intern(), str4);
            intent.putExtra("serviceReferrer", str5);
            int i3 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 0;
            }
            return intent;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            long j;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallback;
            long j2 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 23139 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 23139 - View.resolveSize(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i5 = $11 + 125;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    i2 = i + 82;
                    cArr4[i2] = (char) (cArr[i2] >> b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i6 = $10 + 115;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        j = j2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 74 - ExpandableListView.getPackedPositionGroup(j2), 8088 - Drawable.resolveOpacity(0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    j = 0;
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 30 - ExpandableListView.getPackedPositionGroup(0L), 19488 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    j = 0;
                                }
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                            } else {
                                j = 0;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i8 = $10 + 57;
                                    $11 = i8 % 128;
                                    int i9 = i8 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                                } else {
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
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
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = $11 + 63;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[PHI: r4
      0x0084: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v22 byte[]) binds: [B:19:0x0082, B:16:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r25, byte r26, int r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.register.SchemeCardRegisterActivity.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    @Override // viva.republica.toss.card.register.Hilt_SchemeCardRegisterActivity, viva.republica.toss.card.CardBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        int i5 = ICustomTabsCallback + 73;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // viva.republica.toss.card.register.Hilt_SchemeCardRegisterActivity, viva.republica.toss.card.CardBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = onMessageChannelReady + 73;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    @Override // viva.republica.toss.card.register.Hilt_SchemeCardRegisterActivity, viva.republica.toss.card.CardBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
    }

    @Override // viva.republica.toss.card.register.Hilt_SchemeCardRegisterActivity, viva.republica.toss.card.CardBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 97;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        int i5 = onMessageChannelReady + 3;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    static void setEngagementSignalsCallback() {
        IAuthTabCallback_Parcel = 893749826;
        access000 = -1538795484;
        IAuthTabCallbackStubProxy = -1018310367;
        extraCallback = new byte[]{17, 13, 28, 19, 78, -46, 1, 28, 26, 30, 79, -43, -10, 44, 6, -12, 21, 71, 25, 14, -48, 25, 29, 4, 27, 22, 14, 4, 27, 35, 25, 22, 35, 21, 23, 25, 124, 80, 96, 121, 97, 97, 82, -94, 61, 92, 114, 108, 90, 123, -83, 111, 84, 38, 111, 99, 106, 97, 124, 84, 106, 97, 73, 60, 32, 87, 26, 45, 76, 57, 7, 58, -2, 46, 27, 0, 22, 18, 28, 0, -53, -54, -35, -73, 8, 8, 8, 8, 8, 8};
    }
}
