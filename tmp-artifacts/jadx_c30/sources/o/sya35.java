package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.onDowngrade;
import o.sya35;
import o.sya43;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya35 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Pattern IAuthTabCallback;
    private static boolean newAuthTabSession = false;
    private static int newSessionWithExtras = 0;
    private static final Map<Character, String> onNavigationEvent;
    private static final Map<String, String> onWarmupCompleted;
    private static char[] postMessage = null;
    private static boolean prefetch = false;
    private static int prefetchWithMultipleUrls = 0;
    private static int requestPostMessageChannel = 1;
    private static int requestPostMessageChannelWithExtras = 0;
    private static int setEngagementSignalsCallback = 1;
    private int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private sya43 IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private final boolean ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private String ICustomTabsCallbackStub;
    private sya6 ICustomTabsCallbackStubProxy;
    private sya30 ICustomTabsCallback_Parcel;
    private final setVideoPlayCallback ICustomTabsService;
    private final boolean access000;
    private final Queue<sya43> access100;
    private final Boolean asBinder;
    private final String asInterface;
    private Integer extraCallback;
    private boolean extraCallbackWithResult;
    private final boolean extraCommand;
    private int getInterfaceDescriptor;
    private final PAGLogoView<sya30> isEngagementSignalsApiAvailable;
    private Map<String, String> mayLaunchUrl;
    private boolean newSession;
    private final sya14 onActivityLayout;
    private final Boolean onActivityResized;
    private final boolean onExtraCallback;
    private sya34 onExtraCallbackWithResult;
    private final int onMessageChannelReady;
    private boolean onMinimized;
    private boolean onPostMessage;
    private Optional<sya18> onRelationshipValidationResult;
    private final sya14 onTransact;
    private boolean onUnminimized;
    private final int readTypedObject;
    private final PAGLogoView<Integer> writeTypedObject;

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i3 | i2);
        int i12 = i6 | i11;
        int i13 = (~(i6 | i2)) | (~(i7 | i8 | i9)) | i11 | (~(i3 | i6));
        int i14 = i3 + i2 + i5 + (1272450877 * i4) + ((-51365948) * i);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i3) + 922746880 + ((-1437248296) * i2) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i5) + ((-1881145344) * i4) + ((-578813952) * i) + ((-124846080) * i15);
        int i17 = (i3 * 1187242746) + 1002376400 + (i2 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i5 * 1187242569) + (i4 * (-1484311963)) + (i * 1141305060) + (i15 * 516358144);
        switch (i16 + (i17 * i17 * (-861863936))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                sya35 sya35Var = (sya35) objArr[0];
                int i18 = 2 % 2;
                int i19 = prefetchWithMultipleUrls + 113;
                requestPostMessageChannel = i19 % 128;
                if (i19 % 2 == 0) {
                    sya35Var.IAuthTabCallback("&", true);
                } else {
                    sya35Var.IAuthTabCallback("&", false);
                }
                return null;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                String str = (String) objArr[1];
                int i20 = 2 % 2;
                int i21 = requestPostMessageChannel + 9;
                prefetchWithMultipleUrls = i21 % 128;
                int i22 = i21 % 2;
                if (str.isEmpty()) {
                    throw new sya7("tag handle must not be empty");
                }
                int i23 = requestPostMessageChannel + 23;
                prefetchWithMultipleUrls = i23 % 128;
                if (i23 % 2 == 0 ? str.charAt(0) == '!' : str.charAt(1) == '\'') {
                    if (str.charAt(str.length() - 1) == '!') {
                        int i24 = requestPostMessageChannel + 9;
                        prefetchWithMultipleUrls = i24 % 128;
                        int i25 = i24 % 2;
                        if (!"!".equals(str)) {
                            int i26 = prefetchWithMultipleUrls + 27;
                            requestPostMessageChannel = i26 % 128;
                            int i27 = i26 % 2;
                            if (!IAuthTabCallback.matcher(str).matches()) {
                                throw new sya7("invalid character in the tag handle: " + str);
                            }
                        }
                        return str;
                    }
                }
                throw new sya7("tag handle must start and end with '!': " + str);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                sya35 sya35Var2 = (sya35) objArr[0];
                String str2 = (String) objArr[1];
                int i28 = 2 % 2;
                int i29 = prefetchWithMultipleUrls + 51;
                requestPostMessageChannel = i29 % 128;
                int i30 = i29 % 2;
                String strAsBinder = sya35Var2.asBinder(str2);
                int i31 = prefetchWithMultipleUrls + 125;
                requestPostMessageChannel = i31 % 128;
                int i32 = i31 % 2;
                return strAsBinder;
            default:
                return onNavigationEvent(objArr);
        }
    }

    static /* synthetic */ sya43 IAuthTabCallback(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 97;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        sya43 sya43Var = sya35Var.IAuthTabCallbackStubProxy;
        int i5 = i2 + 49;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return sya43Var;
    }

    static /* synthetic */ void IAuthTabCallback(sya35 sya35Var, int i) {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 35;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        sya35Var.IAuthTabCallback(i);
        int i5 = requestPostMessageChannel + 41;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ int IAuthTabCallbackDefault(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 49;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int i4 = sya35Var.IAuthTabCallback_Parcel;
        sya35Var.IAuthTabCallback_Parcel = i3 != 0 ? i4 >> 1 : i4 - 1;
        return i4;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        sya35 sya35Var = (sya35) objArr[0];
        Map<String, String> map = (Map) objArr[1];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 85;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        sya35Var.mayLaunchUrl = map;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 115;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        sya35 sya35Var = (sya35) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 77;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        PAGLogoView<sya30> pAGLogoView = sya35Var.isEngagementSignalsApiAvailable;
        if (i3 == 0) {
            return pAGLogoView;
        }
        throw null;
    }

    static /* synthetic */ PAGLogoView IAuthTabCallbackStub(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 85;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        PAGLogoView<Integer> pAGLogoView = sya35Var.writeTypedObject;
        int i5 = i3 + 103;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 == 0) {
            return pAGLogoView;
        }
        throw null;
    }

    static /* synthetic */ Boolean IAuthTabCallbackStubProxy(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 121;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        Boolean bool = sya35Var.onActivityResized;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 79;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return bool;
    }

    static /* synthetic */ boolean IAuthTabCallback_Parcel(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 121;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = sya35Var.IAuthTabCallbackStub();
        int i4 = requestPostMessageChannel + 105;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackStub;
    }

    static /* synthetic */ void ICustomTabsCallback(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 35;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        sya35Var.extraCallbackWithResult();
        int i4 = requestPostMessageChannel + 53;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    static /* synthetic */ boolean access000(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 9;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        boolean z = sya35Var.ICustomTabsCallback;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return z;
    }

    static /* synthetic */ int access100(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 37;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        int i5 = sya35Var.IAuthTabCallbackStub;
        if (i4 == 0) {
            int i6 = 10 / 0;
        }
        int i7 = i3 + 19;
        prefetchWithMultipleUrls = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        sya35 sya35Var = (sya35) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 45;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return sya35Var.IAuthTabCallback(str);
        }
        sya35Var.IAuthTabCallback(str);
        throw null;
    }

    static /* synthetic */ boolean asBinder(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 31;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        boolean zICustomTabsCallback = sya35Var.ICustomTabsCallback();
        int i4 = requestPostMessageChannel + 99;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return zICustomTabsCallback;
    }

    static /* synthetic */ sya14 asInterface(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 117;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        sya14 sya14Var = sya35Var.onActivityLayout;
        int i5 = i2 + 107;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return sya14Var;
    }

    static /* synthetic */ int extraCallbackWithResult(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 63;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = sya35Var.readTypedObject;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    static /* synthetic */ boolean getInterfaceDescriptor(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 25;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        boolean z = sya35Var.extraCommand;
        if (i4 != 0) {
            int i5 = 24 / 0;
        }
        int i6 = i2 + 117;
        prefetchWithMultipleUrls = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    static /* synthetic */ Map onActivityLayout(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 33;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = sya35Var.mayLaunchUrl;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 37;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return map;
    }

    static /* synthetic */ Integer onExtraCallback(sya35 sya35Var, Integer num) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 67;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        sya35Var.extraCallback = num;
        int i5 = i3 + 101;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        sya35 sya35Var = (sya35) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 5;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        boolean z = sya35Var.onPostMessage;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return Boolean.valueOf(z);
    }

    static /* synthetic */ String onExtraCallback(sya35 sya35Var, onDowngrade ondowngrade) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 41;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = sya35Var.onExtraCallback(ondowngrade);
        int i4 = prefetchWithMultipleUrls + 117;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    static /* synthetic */ Queue onExtraCallback(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 39;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Queue<sya43> queue = sya35Var.access100;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 1;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 != 0) {
            return queue;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ sya30 onExtraCallback(sya35 sya35Var, sya30 sya30Var) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 41;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        sya35Var.ICustomTabsCallback_Parcel = sya30Var;
        if (i3 == 0) {
            return sya30Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void onExtraCallback(sya35 sya35Var, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 63;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        sya35Var.onExtraCallback(z, z2);
        int i4 = requestPostMessageChannel + 103;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Boolean onExtraCallbackWithResult(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 81;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = sya35Var.asBinder;
        if (i3 != 0) {
            return bool;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        sya35 sya35Var = (sya35) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        int i5 = sya35Var.getInterfaceDescriptor;
        int i6 = i3 + 39;
        prefetchWithMultipleUrls = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    static /* synthetic */ String onExtraCallbackWithResult(sya35 sya35Var, String str) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 21;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        String str2 = (String) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var, str}, -1203935919, 1203935925, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
        int i4 = prefetchWithMultipleUrls + 3;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    static /* synthetic */ sya34 onExtraCallbackWithResult(sya35 sya35Var, sya34 sya34Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 103;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        sya35Var.onExtraCallbackWithResult = sya34Var;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return sya34Var;
    }

    static /* synthetic */ boolean onNavigationEvent(sya35 sya35Var, sya43 sya43Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 67;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = sya35Var.onExtraCallbackWithResult(sya43Var);
        int i4 = requestPostMessageChannel + 113;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    static /* synthetic */ Integer onWarmupCompleted(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 9;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Integer num = sya35Var.extraCallback;
        if (i3 != 0) {
            return num;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 97;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ sya43 onWarmupCompleted(sya35 sya35Var, sya43 sya43Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 85;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        sya35Var.IAuthTabCallbackStubProxy = sya43Var;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 85;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return sya43Var;
    }

    static /* synthetic */ void onWarmupCompleted(sya35 sya35Var, boolean z, boolean z2, boolean z3) throws Throwable {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 83;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        sya35Var.onExtraCallbackWithResult(z, z2, z3);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ sya14 readTypedObject(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 35;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        sya14 sya14Var = sya35Var.onTransact;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 73;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return sya14Var;
    }

    static /* synthetic */ sya34 writeTypedObject(sya35 sya35Var) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 91;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        sya34 sya34Var = sya35Var.onExtraCallbackWithResult;
        if (i3 == 0) {
            return sya34Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        HashMap map = new HashMap();
        onNavigationEvent = map;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{ISOFileInfo.DATA_BYTES2}, 126 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), objArr);
        map.put((char) 0, ((String) objArr[0]).intern());
        map.put((char) 7, "a");
        map.put('\b', "b");
        map.put('\t', "t");
        map.put('\n', "n");
        map.put((char) 11, "v");
        map.put('\f', "f");
        map.put('\r', "r");
        map.put((char) 27, "e");
        map.put('\"', "\"");
        map.put('\\', "\\");
        map.put((char) 133, "N");
        map.put((char) 160, "_");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        onWarmupCompleted = linkedHashMap;
        linkedHashMap.put("!", "!");
        linkedHashMap.put("tag:yaml.org,2002:", "!!");
        IAuthTabCallback = Pattern.compile("^![-_\\w]*!$");
        int i = requestPostMessageChannelWithExtras + 5;
        setEngagementSignalsCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 40 / 0;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = postMessage;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 65;
                $11 = i5 % 128;
                if (i5 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 77, ((byte) KeyEvent.getModifierMetaStateMask()) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                        i4 = 0;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 77, View.getDefaultSize(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4++;
                        i2 = 2;
                        obj = null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(newSessionWithExtras)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 75 - Color.argb(0, 0, 0, 0), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        int i6 = 1052772399;
        if (prefetch) {
            int i7 = $11 + 5;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 63 - (ViewConfiguration.getLongPressTimeout() >> 16), 12215 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!newAuthTabSession) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i9 = $11 + 79;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 % 5;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 16777279 + Color.rgb(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i6 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0041 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted(sya43 sya43Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 37;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            this.access100.add(sya43Var);
            throw null;
        }
        this.access100.add(sya43Var);
        int i3 = requestPostMessageChannel + 33;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        while (!((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, -1790517540, 1790517540, iIAuthTabCallback, iIAuthTabCallback, iIAuthTabCallback)).booleanValue()) {
            int i5 = requestPostMessageChannel + 67;
            prefetchWithMultipleUrls = i5 % 128;
            if (i5 % 2 != 0) {
                this.IAuthTabCallbackStubProxy = this.access100.poll();
                this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult();
                this.IAuthTabCallbackStubProxy = null;
                int i6 = 3 / 0;
            } else {
                this.IAuthTabCallbackStubProxy = this.access100.poll();
                this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult();
                this.IAuthTabCallbackStubProxy = null;
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        sya35 sya35Var = (sya35) objArr[0];
        int i = 2 % 2;
        if (sya35Var.access100.isEmpty()) {
            return true;
        }
        Iterator<sya43> it = sya35Var.access100.iterator();
        sya43 next = it.next();
        while (true) {
            sya43 sya43Var = next;
            if (!(sya43Var instanceof sya40)) {
                if (sya43Var instanceof sya39) {
                    int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                    return Boolean.valueOf(((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var, it, 1}, 1755151729, -1755151718, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).booleanValue());
                }
                if (sya43Var instanceof sya50) {
                    int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback5 = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback6 = OverseasRrnInputTextField.IAuthTabCallback();
                    return Boolean.valueOf(((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var, it, 2}, 1755151729, -1755151718, iIAuthTabCallback6, iIAuthTabCallback5, iIAuthTabCallback4)).booleanValue());
                }
                if (sya43Var instanceof sya45) {
                    int i2 = requestPostMessageChannel + 123;
                    prefetchWithMultipleUrls = i2 % 128;
                    int i3 = i2 % 2;
                    int iIAuthTabCallback7 = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback8 = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback9 = OverseasRrnInputTextField.IAuthTabCallback();
                    return Boolean.valueOf(((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var, it, 3}, 1755151729, -1755151718, iIAuthTabCallback9, iIAuthTabCallback8, iIAuthTabCallback7)).booleanValue());
                }
                if (sya43Var instanceof sya491) {
                    int iIAuthTabCallback10 = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback11 = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback12 = OverseasRrnInputTextField.IAuthTabCallback();
                    return Boolean.valueOf(((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var, it, 2}, 1755151729, -1755151718, iIAuthTabCallback12, iIAuthTabCallback11, iIAuthTabCallback10)).booleanValue());
                }
                if ((sya43Var instanceof sya49) || !sya35Var.access000) {
                    return false;
                }
                int i4 = requestPostMessageChannel + 85;
                prefetchWithMultipleUrls = i4 % 128;
                int i5 = i4 % 2;
                int iIAuthTabCallback13 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback14 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback15 = OverseasRrnInputTextField.IAuthTabCallback();
                return Boolean.valueOf(((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var, it, 1}, 1755151729, -1755151718, iIAuthTabCallback15, iIAuthTabCallback14, iIAuthTabCallback13)).booleanValue());
            }
            if (!it.hasNext()) {
                int i6 = prefetchWithMultipleUrls + 77;
                requestPostMessageChannel = i6 % 128;
                if (i6 % 2 != 0) {
                    return true;
                }
                int i7 = 24 / 0;
                return true;
            }
            next = it.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 0;
        Iterator it = (Iterator) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = 0;
        while (it.hasNext()) {
            int i4 = requestPostMessageChannel + 49;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = ((sya43) it.next()) instanceof sya40;
                throw null;
            }
            sya43 sya43Var = (sya43) it.next();
            if (!(sya43Var instanceof sya40)) {
                i++;
                if ((sya43Var instanceof sya39) || (sya43Var instanceof sya38)) {
                    i3++;
                } else if (!(!(sya43Var instanceof sya36))) {
                    i3--;
                    int i5 = requestPostMessageChannel + 45;
                    prefetchWithMultipleUrls = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    int i7 = requestPostMessageChannel + 29;
                    prefetchWithMultipleUrls = i7 % 128;
                    int i8 = i7 % 2;
                    if (!(sya43Var instanceof sya37)) {
                        if (sya43Var instanceof sya49) {
                            i3 = -1;
                        }
                    }
                }
                if (i3 < 0) {
                    return false;
                }
            }
        }
        return i < iIntValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if ((!r5) == true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r4.extraCallback = java.lang.Integer.valueOf(r4.IAuthTabCallbackDefault);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r4.extraCallback = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r6 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r5 = o.sya35.requestPostMessageChannel + 53;
        o.sya35.prefetchWithMultipleUrls = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if ((r5 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r5 = r1.intValue() >> r4.IAuthTabCallbackDefault;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r5 = r1.intValue() + r4.IAuthTabCallbackDefault;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        r4.extraCallback = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r1 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallback(boolean z, boolean z2) {
        Integer num;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 115;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            this.writeTypedObject.onExtraCallback(this.extraCallback);
            num = this.extraCallback;
            int i3 = 86 / 0;
        } else {
            this.writeTypedObject.onExtraCallback(this.extraCallback);
            num = this.extraCallback;
        }
    }

    class extraCallback implements sya30 {
        private extraCallback() {
        }

        /* synthetic */ extraCallback(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() {
            throw new sya7("expecting nothing, but got " + sya35.IAuthTabCallback(sya35.this));
        }
    }

    public class asBinder implements sya30 {
        private final boolean onExtraCallbackWithResult;

        public asBinder(boolean z) {
            this.onExtraCallbackWithResult = z;
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() {
            AnonymousClass5 anonymousClass5 = null;
            if (sya35.IAuthTabCallback(sya35.this).onNavigationEvent() == sya43.IAuthTabCallback.DocumentStart) {
                onWarmupCompleted((sya39) sya35.IAuthTabCallback(sya35.this));
                sya35 sya35Var = sya35.this;
                sya35.onExtraCallback(sya35Var, new IAuthTabCallbackDefault(sya35Var, anonymousClass5));
            } else if (sya35.IAuthTabCallback(sya35.this).onNavigationEvent() == sya43.IAuthTabCallback.StreamEnd) {
                sya35 sya35Var2 = sya35.this;
                sya35.onExtraCallback(sya35Var2, new extraCallback(sya35Var2, anonymousClass5));
            } else if (sya35.IAuthTabCallback(sya35.this) instanceof sya40) {
                sya35.readTypedObject(sya35.this).onExtraCallback(sya35.IAuthTabCallback(sya35.this));
                sya35.ICustomTabsCallback(sya35.this);
            } else {
                throw new sya7("expected DocumentStartEvent, but got " + sya35.IAuthTabCallback(sya35.this));
            }
        }

        private void onWarmupCompleted(sya39 sya39Var) {
            if (sya39Var.IAuthTabCallback().isPresent() || !sya39Var.onExtraCallbackWithResult().isEmpty()) {
                Object[] objArr = {sya35.this};
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                if (((Boolean) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, 227306609, -227306607, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue()) {
                    sya35.this.onNavigationEvent("...", true, false, false);
                    sya35.this.onExtraCallback();
                }
            }
            sya39Var.IAuthTabCallback().ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.emitter.Emitter$ExpectDocumentStart$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    sya35.asBinder.IAuthTabCallback(this.f$0, (onDowngrade) obj);
                }
            });
            Object[] objArr2 = {sya35.this, new LinkedHashMap(sya35.onWarmupCompleted())};
            int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
            if (!sya39Var.onExtraCallbackWithResult().isEmpty()) {
                onWarmupCompleted(sya39Var.onExtraCallbackWithResult());
            }
            if (!this.onExtraCallbackWithResult || sya39Var.onExtraCallback() || sya35.onExtraCallbackWithResult(sya35.this).booleanValue() || sya39Var.IAuthTabCallback().isPresent() || !sya39Var.onExtraCallbackWithResult().isEmpty() || onNavigationEvent()) {
                sya35.this.onExtraCallback();
                sya35.this.onNavigationEvent("---", true, false, false);
                if (sya35.onExtraCallbackWithResult(sya35.this).booleanValue()) {
                    sya35.this.onExtraCallback();
                }
            }
        }

        public static /* synthetic */ void IAuthTabCallback(asBinder asbinder, onDowngrade ondowngrade) {
            sya35 sya35Var = sya35.this;
            sya35Var.onWarmupCompleted(sya35.onExtraCallback(sya35Var, ondowngrade));
        }

        private void onWarmupCompleted(Map<String, String> map) {
            for (String str : new TreeSet(map.keySet())) {
                String str2 = map.get(str);
                sya35.onActivityLayout(sya35.this).put(str2, str);
                String strOnExtraCallbackWithResult = sya35.onExtraCallbackWithResult(sya35.this, str);
                Object[] objArr = {sya35.this, str2};
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                sya35.this.onExtraCallback(strOnExtraCallbackWithResult, (String) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -1375296904, 1375296916, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback));
            }
        }

        private boolean onNavigationEvent() {
            if (sya35.IAuthTabCallback(sya35.this).onNavigationEvent() != sya43.IAuthTabCallback.DocumentStart || sya35.onExtraCallback(sya35.this).isEmpty()) {
                return false;
            }
            sya43 sya43Var = (sya43) sya35.onExtraCallback(sya35.this).peek();
            if (sya43Var.onNavigationEvent() != sya43.IAuthTabCallback.Scalar) {
                return false;
            }
            sya492 sya492Var = (sya492) sya43Var;
            return (sya492Var.onTransact().isPresent() || sya492Var.IAuthTabCallback().isPresent() || sya492Var.onWarmupCompleted() == null || !sya492Var.IAuthTabCallbackDefault().isEmpty()) ? false : true;
        }
    }

    class onExtraCallbackWithResult implements sya30 {
        private onExtraCallbackWithResult() {
        }

        /* synthetic */ onExtraCallbackWithResult(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() {
            sya35 sya35Var = sya35.this;
            sya35.onWarmupCompleted(sya35Var, sya35.readTypedObject(sya35Var).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            sya35.ICustomTabsCallback(sya35.this);
            if (sya35.IAuthTabCallback(sya35.this).onNavigationEvent() == sya43.IAuthTabCallback.DocumentEnd) {
                sya35.this.onExtraCallback();
                if (((sya36) sya35.IAuthTabCallback(sya35.this)).onExtraCallback()) {
                    sya35.this.onNavigationEvent("...", true, false, false);
                    sya35.this.onExtraCallback();
                }
                sya35 sya35Var2 = sya35.this;
                sya35.onExtraCallback(sya35Var2, sya35Var2.new asBinder(false));
                return;
            }
            throw new sya7("expected DocumentEndEvent, but got " + sya35.IAuthTabCallback(sya35.this));
        }
    }

    class IAuthTabCallbackDefault implements sya30 {
        private IAuthTabCallbackDefault() {
        }

        /* synthetic */ IAuthTabCallbackDefault(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() throws Throwable {
            sya35 sya35Var = sya35.this;
            sya35.onWarmupCompleted(sya35Var, sya35.readTypedObject(sya35Var).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            AnonymousClass5 anonymousClass5 = null;
            if (!sya35.readTypedObject(sya35.this).onExtraCallbackWithResult()) {
                sya35.ICustomTabsCallback(sya35.this);
                if (sya35.IAuthTabCallback(sya35.this) instanceof sya36) {
                    new onExtraCallbackWithResult(sya35.this, anonymousClass5).onExtraCallbackWithResult();
                    return;
                }
            }
            Object[] objArr = {sya35.this};
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).onExtraCallback(new onExtraCallbackWithResult(sya35.this, anonymousClass5));
            sya35.onWarmupCompleted(sya35.this, true, false, false);
        }
    }

    private void onExtraCallbackWithResult(boolean z, boolean z2, boolean z3) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 29;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            this.onUnminimized = z;
            this.onMinimized = z2;
            this.ICustomTabsCallbackDefault = z3;
            this.IAuthTabCallbackStubProxy.onNavigationEvent();
            sya43.IAuthTabCallback iAuthTabCallback = sya43.IAuthTabCallback.Alias;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.onUnminimized = z;
        this.onMinimized = z2;
        this.ICustomTabsCallbackDefault = z3;
        if (this.IAuthTabCallbackStubProxy.onNavigationEvent() == sya43.IAuthTabCallback.Alias) {
            onExtraCallback(z3);
            return;
        }
        if (this.IAuthTabCallbackStubProxy.onNavigationEvent() != sya43.IAuthTabCallback.Scalar) {
            int i3 = prefetchWithMultipleUrls + 73;
            requestPostMessageChannel = i3 % 128;
            int i4 = i3 % 2;
            if (this.IAuthTabCallbackStubProxy.onNavigationEvent() != sya43.IAuthTabCallback.SequenceStart) {
                int i5 = requestPostMessageChannel + 123;
                prefetchWithMultipleUrls = i5 % 128;
                int i6 = i5 % 2;
                if (this.IAuthTabCallbackStubProxy.onNavigationEvent() != sya43.IAuthTabCallback.MappingStart) {
                    throw new sya7("expected NodeEvent, but got " + this.IAuthTabCallbackStubProxy.onNavigationEvent());
                }
            }
        }
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, -238631294, 238631298, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
        IAuthTabCallbackStubProxy();
        onNavigationEvent(this.IAuthTabCallbackStubProxy.onNavigationEvent());
    }

    private void onNavigationEvent(sya43.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 41;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 != 0 ? (i = AnonymousClass5.onWarmupCompleted[iAuthTabCallback.ordinal()]) == 1 : (i = AnonymousClass5.onWarmupCompleted[iAuthTabCallback.ordinal()]) == 1) {
            access100();
            return;
        }
        if (i == 2) {
            if (this.IAuthTabCallback_Parcel == 0 && !this.asBinder.booleanValue() && !((sya50) this.IAuthTabCallbackStubProxy).onWarmupCompleted()) {
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                if (!((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, -1212317729, 1212317734, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).booleanValue()) {
                    asInterface();
                    return;
                }
            }
            asBinder();
            return;
        }
        if (i == 3) {
            if (this.IAuthTabCallback_Parcel == 0) {
                int i4 = prefetchWithMultipleUrls + 93;
                requestPostMessageChannel = i4 % 128;
                int i5 = i4 % 2;
                if (!this.asBinder.booleanValue()) {
                    int i6 = requestPostMessageChannel + 9;
                    prefetchWithMultipleUrls = i6 % 128;
                    int i7 = i6 % 2;
                    if (!((sya45) this.IAuthTabCallbackStubProxy).onWarmupCompleted()) {
                        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                        if (!((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, -2002870114, 2002870122, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                            onTransact();
                            return;
                        }
                    }
                }
            }
            IAuthTabCallbackDefault();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        throw new o.sya7("Expecting Alias.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((r3.IAuthTabCallbackStubProxy instanceof o.sya28) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if ((r3.IAuthTabCallbackStubProxy instanceof o.sya28) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        onWarmupCompleted(r4);
        r3.ICustomTabsCallback_Parcel = r3.isEngagementSignalsApiAvailable.onNavigationEvent();
        r4 = o.sya35.requestPostMessageChannel + 31;
        o.sya35.prefetchWithMultipleUrls = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 61;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
    }

    private void access100() throws Throwable {
        sya30 sya30VarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 23;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(true, true);
            IAuthTabCallback_Parcel();
            this.extraCallback = this.writeTypedObject.onNavigationEvent();
            sya30VarOnNavigationEvent = this.isEngagementSignalsApiAvailable.onNavigationEvent();
        } else {
            onExtraCallback(true, false);
            IAuthTabCallback_Parcel();
            this.extraCallback = this.writeTypedObject.onNavigationEvent();
            sya30VarOnNavigationEvent = this.isEngagementSignalsApiAvailable.onNavigationEvent();
        }
        this.ICustomTabsCallback_Parcel = sya30VarOnNavigationEvent;
        int i3 = prefetchWithMultipleUrls + 77;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void asBinder() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 125;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent("[", false, true, false);
            this.IAuthTabCallback_Parcel = this.IAuthTabCallback_Parcel;
            onExtraCallback(false, true);
            if (this.onActivityResized.booleanValue()) {
                onExtraCallback();
            }
        } else {
            onNavigationEvent("[", true, true, false);
            this.IAuthTabCallback_Parcel++;
            onExtraCallback(true, false);
            if (this.onActivityResized.booleanValue()) {
            }
        }
        this.ICustomTabsCallback_Parcel = new getInterfaceDescriptor(this, null);
        int i3 = requestPostMessageChannel + 111;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
    }

    class getInterfaceDescriptor implements sya30 {
        private getInterfaceDescriptor() {
        }

        /* synthetic */ getInterfaceDescriptor(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00d1  */
        @Override // o.sya30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onExtraCallbackWithResult() throws Throwable {
            if (sya35.IAuthTabCallback(sya35.this).onNavigationEvent() == sya43.IAuthTabCallback.SequenceEnd) {
                sya35 sya35Var = sya35.this;
                sya35.onExtraCallback(sya35Var, (Integer) sya35.IAuthTabCallbackStub(sya35Var).onNavigationEvent());
                sya35.IAuthTabCallbackDefault(sya35.this);
                sya35.this.onNavigationEvent("]", false, false, false);
                sya35.asInterface(sya35.this).onNavigationEvent();
                sya35.asBinder(sya35.this);
                sya35 sya35Var2 = sya35.this;
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                sya35.onExtraCallback(sya35Var2, (sya30) ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var2}, -601092040, 601092049, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).onNavigationEvent());
                return;
            }
            if (sya35.IAuthTabCallback(sya35.this) instanceof sya40) {
                sya35.readTypedObject(sya35.this).onExtraCallback(sya35.IAuthTabCallback(sya35.this));
                sya35.ICustomTabsCallback(sya35.this);
                return;
            }
            if (!sya35.onExtraCallbackWithResult(sya35.this).booleanValue()) {
                Object[] objArr = {sya35.this};
                int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback5 = OverseasRrnInputTextField.IAuthTabCallback();
                if ((((Integer) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -1393087396, 1393087399, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback4)).intValue() > sya35.access100(sya35.this) && sya35.getInterfaceDescriptor(sya35.this)) || sya35.IAuthTabCallbackStubProxy(sya35.this).booleanValue()) {
                    sya35.this.onExtraCallback();
                }
            }
            Object[] objArr2 = {sya35.this};
            int iIAuthTabCallback6 = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback7 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr2, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback7, iIAuthTabCallback6)).onExtraCallback(new access000(sya35.this, null));
            sya35.onWarmupCompleted(sya35.this, false, false, false);
            sya35 sya35Var3 = sya35.this;
            sya35.onWarmupCompleted(sya35Var3, sya35.asInterface(sya35Var3).onExtraCallback(sya35.IAuthTabCallback(sya35.this)));
            sya35.asBinder(sya35.this);
        }
    }

    class access000 implements sya30 {
        private access000() {
        }

        /* synthetic */ access000(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
        @Override // o.sya30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onExtraCallbackWithResult() throws Throwable {
            if (sya35.IAuthTabCallback(sya35.this).onNavigationEvent() == sya43.IAuthTabCallback.SequenceEnd) {
                sya35 sya35Var = sya35.this;
                sya35.onExtraCallback(sya35Var, (Integer) sya35.IAuthTabCallbackStub(sya35Var).onNavigationEvent());
                sya35.IAuthTabCallbackDefault(sya35.this);
                if (sya35.onExtraCallbackWithResult(sya35.this).booleanValue()) {
                    sya35.this.onNavigationEvent(",", false, false, false);
                    sya35.this.onExtraCallback();
                } else if (sya35.IAuthTabCallbackStubProxy(sya35.this).booleanValue()) {
                    sya35.this.onExtraCallback();
                }
                sya35.this.onNavigationEvent("]", false, false, false);
                sya35.asInterface(sya35.this).onNavigationEvent();
                sya35.asBinder(sya35.this);
                if (sya35.IAuthTabCallbackStubProxy(sya35.this).booleanValue()) {
                    sya35.this.onExtraCallback();
                }
                sya35 sya35Var2 = sya35.this;
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                sya35.onExtraCallback(sya35Var2, (sya30) ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var2}, -601092040, 601092049, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).onNavigationEvent());
                return;
            }
            if (sya35.IAuthTabCallback(sya35.this) instanceof sya40) {
                sya35 sya35Var3 = sya35.this;
                sya35.onWarmupCompleted(sya35Var3, sya35.readTypedObject(sya35Var3).onExtraCallback(sya35.IAuthTabCallback(sya35.this)));
                return;
            }
            sya35.this.onNavigationEvent(",", false, false, false);
            sya35.ICustomTabsCallback(sya35.this);
            if (!sya35.onExtraCallbackWithResult(sya35.this).booleanValue()) {
                Object[] objArr = {sya35.this};
                int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback5 = OverseasRrnInputTextField.IAuthTabCallback();
                if ((((Integer) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -1393087396, 1393087399, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback4)).intValue() > sya35.access100(sya35.this) && sya35.getInterfaceDescriptor(sya35.this)) || sya35.IAuthTabCallbackStubProxy(sya35.this).booleanValue()) {
                    sya35.this.onExtraCallback();
                }
            }
            Object[] objArr2 = {sya35.this};
            int iIAuthTabCallback6 = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback7 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr2, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback7, iIAuthTabCallback6)).onExtraCallback(sya35.this.new access000());
            sya35.onWarmupCompleted(sya35.this, false, false, false);
            sya35 sya35Var4 = sya35.this;
            sya35.onWarmupCompleted(sya35Var4, sya35.asInterface(sya35Var4).onExtraCallback(sya35.IAuthTabCallback(sya35.this)));
            sya35.asBinder(sya35.this);
        }
    }

    private void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        onNavigationEvent("{", true, true, false);
        this.IAuthTabCallback_Parcel++;
        onExtraCallback(true, false);
        if (!(!this.onActivityResized.booleanValue())) {
            int i2 = requestPostMessageChannel + 29;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            int i4 = prefetchWithMultipleUrls + 91;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
        }
        this.ICustomTabsCallback_Parcel = new onTransact(this, null);
    }

    class onTransact implements sya30 {
        private onTransact() {
        }

        /* synthetic */ onTransact(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
        @Override // o.sya30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onExtraCallbackWithResult() throws Throwable {
            sya35 sya35Var = sya35.this;
            sya35.onWarmupCompleted(sya35Var, sya35.readTypedObject(sya35Var).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            sya35.ICustomTabsCallback(sya35.this);
            if (sya35.IAuthTabCallback(sya35.this).onNavigationEvent() == sya43.IAuthTabCallback.MappingEnd) {
                sya35 sya35Var2 = sya35.this;
                sya35.onExtraCallback(sya35Var2, (Integer) sya35.IAuthTabCallbackStub(sya35Var2).onNavigationEvent());
                sya35.IAuthTabCallbackDefault(sya35.this);
                sya35.this.onNavigationEvent("}", false, false, false);
                sya35.asInterface(sya35.this).onNavigationEvent();
                sya35.asBinder(sya35.this);
                sya35 sya35Var3 = sya35.this;
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                sya35.onExtraCallback(sya35Var3, (sya30) ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var3}, -601092040, 601092049, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).onNavigationEvent());
                return;
            }
            if (!sya35.onExtraCallbackWithResult(sya35.this).booleanValue()) {
                Object[] objArr = {sya35.this};
                int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback5 = OverseasRrnInputTextField.IAuthTabCallback();
                if ((((Integer) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -1393087396, 1393087399, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback4)).intValue() > sya35.access100(sya35.this) && sya35.getInterfaceDescriptor(sya35.this)) || sya35.IAuthTabCallbackStubProxy(sya35.this).booleanValue()) {
                    sya35.this.onExtraCallback();
                }
            }
            AnonymousClass5 anonymousClass5 = null;
            if (!sya35.onExtraCallbackWithResult(sya35.this).booleanValue() && sya35.IAuthTabCallback_Parcel(sya35.this)) {
                Object[] objArr2 = {sya35.this};
                int iIAuthTabCallback6 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback7 = OverseasRrnInputTextField.IAuthTabCallback();
                ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr2, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback7, iIAuthTabCallback6)).onExtraCallback(new IAuthTabCallback_Parcel(sya35.this, anonymousClass5));
                sya35.onWarmupCompleted(sya35.this, false, true, true);
                return;
            }
            sya35.this.onNavigationEvent("?", true, false, false);
            Object[] objArr3 = {sya35.this};
            int iIAuthTabCallback8 = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback9 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr3, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback9, iIAuthTabCallback8)).onExtraCallback(new access100(sya35.this, anonymousClass5));
            sya35.onWarmupCompleted(sya35.this, false, true, false);
        }
    }

    class IAuthTabCallbackStubProxy implements sya30 {
        private IAuthTabCallbackStubProxy() {
        }

        /* synthetic */ IAuthTabCallbackStubProxy(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00f8  */
        @Override // o.sya30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onExtraCallbackWithResult() throws Throwable {
            if (sya35.IAuthTabCallback(sya35.this).onNavigationEvent() == sya43.IAuthTabCallback.MappingEnd) {
                sya35 sya35Var = sya35.this;
                sya35.onExtraCallback(sya35Var, (Integer) sya35.IAuthTabCallbackStub(sya35Var).onNavigationEvent());
                sya35.IAuthTabCallbackDefault(sya35.this);
                if (sya35.onExtraCallbackWithResult(sya35.this).booleanValue()) {
                    sya35.this.onNavigationEvent(",", false, false, false);
                    sya35.this.onExtraCallback();
                }
                if (sya35.IAuthTabCallbackStubProxy(sya35.this).booleanValue()) {
                    sya35.this.onExtraCallback();
                }
                sya35.this.onNavigationEvent("}", false, false, false);
                sya35.asInterface(sya35.this).onNavigationEvent();
                sya35.asBinder(sya35.this);
                sya35 sya35Var2 = sya35.this;
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                sya35.onExtraCallback(sya35Var2, (sya30) ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var2}, -601092040, 601092049, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).onNavigationEvent());
                return;
            }
            sya35.this.onNavigationEvent(",", false, false, false);
            sya35 sya35Var3 = sya35.this;
            sya35.onWarmupCompleted(sya35Var3, sya35.readTypedObject(sya35Var3).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            sya35.ICustomTabsCallback(sya35.this);
            if (!sya35.onExtraCallbackWithResult(sya35.this).booleanValue()) {
                Object[] objArr = {sya35.this};
                int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback5 = OverseasRrnInputTextField.IAuthTabCallback();
                if ((((Integer) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -1393087396, 1393087399, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback4)).intValue() > sya35.access100(sya35.this) && sya35.getInterfaceDescriptor(sya35.this)) || sya35.IAuthTabCallbackStubProxy(sya35.this).booleanValue()) {
                    sya35.this.onExtraCallback();
                }
            }
            AnonymousClass5 anonymousClass5 = null;
            if (!sya35.onExtraCallbackWithResult(sya35.this).booleanValue() && sya35.IAuthTabCallback_Parcel(sya35.this)) {
                Object[] objArr2 = {sya35.this};
                int iIAuthTabCallback6 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback7 = OverseasRrnInputTextField.IAuthTabCallback();
                ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr2, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback7, iIAuthTabCallback6)).onExtraCallback(new IAuthTabCallback_Parcel(sya35.this, anonymousClass5));
                sya35.onWarmupCompleted(sya35.this, false, true, true);
                return;
            }
            sya35.this.onNavigationEvent("?", true, false, false);
            Object[] objArr3 = {sya35.this};
            int iIAuthTabCallback8 = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback9 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr3, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback9, iIAuthTabCallback8)).onExtraCallback(new access100(sya35.this, anonymousClass5));
            sya35.onWarmupCompleted(sya35.this, false, true, false);
        }
    }

    class IAuthTabCallback_Parcel implements sya30 {
        private IAuthTabCallback_Parcel() {
        }

        /* synthetic */ IAuthTabCallback_Parcel(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() throws Throwable {
            sya35.this.onNavigationEvent(":", false, false, false);
            sya35 sya35Var = sya35.this;
            sya35.onWarmupCompleted(sya35Var, sya35.asInterface(sya35Var).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            sya35.asBinder(sya35.this);
            Object[] objArr = {sya35.this};
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).onExtraCallback(new IAuthTabCallbackStubProxy(sya35.this, null));
            sya35.onWarmupCompleted(sya35.this, false, true, false);
            sya35.asInterface(sya35.this).onExtraCallback(sya35.IAuthTabCallback(sya35.this));
            sya35.asBinder(sya35.this);
        }
    }

    class access100 implements sya30 {
        private access100() {
        }

        /* synthetic */ access100(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
        @Override // o.sya30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onExtraCallbackWithResult() throws Throwable {
            if (!sya35.onExtraCallbackWithResult(sya35.this).booleanValue()) {
                Object[] objArr = {sya35.this};
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                if (((Integer) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -1393087396, 1393087399, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).intValue() > sya35.access100(sya35.this) || sya35.IAuthTabCallbackStubProxy(sya35.this).booleanValue()) {
                    sya35.this.onExtraCallback();
                }
            }
            sya35.this.onNavigationEvent(":", true, false, false);
            sya35 sya35Var = sya35.this;
            sya35.onWarmupCompleted(sya35Var, sya35.asInterface(sya35Var).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            sya35.asBinder(sya35.this);
            Object[] objArr2 = {sya35.this};
            int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr2, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3)).onExtraCallback(new IAuthTabCallbackStubProxy(sya35.this, null));
            sya35.onWarmupCompleted(sya35.this, false, true, false);
            sya35.asInterface(sya35.this).onExtraCallback(sya35.IAuthTabCallback(sya35.this));
            sya35.asBinder(sya35.this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void asInterface() {
        boolean z;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 51;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        AnonymousClass5 anonymousClass5 = null;
        if (i2 % 2 == 0) {
            anonymousClass5.hashCode();
            throw null;
        }
        if (this.onMinimized) {
            int i4 = i3 + 47;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            z = !this.extraCallbackWithResult;
        }
        onExtraCallback(false, z);
        this.ICustomTabsCallback_Parcel = new asInterface(this, anonymousClass5);
    }

    class asInterface implements sya30 {
        private asInterface() {
        }

        /* synthetic */ asInterface(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() throws Throwable {
            sya35.this.new onNavigationEvent(true).onExtraCallbackWithResult();
        }
    }

    class onNavigationEvent implements sya30 {
        private final boolean onNavigationEvent;

        public onNavigationEvent(boolean z) {
            this.onNavigationEvent = z;
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() throws Throwable {
            if (!this.onNavigationEvent && sya35.IAuthTabCallback(sya35.this).onNavigationEvent() == sya43.IAuthTabCallback.SequenceEnd) {
                sya35 sya35Var = sya35.this;
                sya35.onExtraCallback(sya35Var, (Integer) sya35.IAuthTabCallbackStub(sya35Var).onNavigationEvent());
                sya35 sya35Var2 = sya35.this;
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                sya35.onExtraCallback(sya35Var2, (sya30) ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var2}, -601092040, 601092049, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).onNavigationEvent());
                return;
            }
            if (sya35.IAuthTabCallback(sya35.this) instanceof sya40) {
                sya35.readTypedObject(sya35.this).onExtraCallback(sya35.IAuthTabCallback(sya35.this));
                return;
            }
            sya35.this.onExtraCallback();
            if (!sya35.access000(sya35.this) || this.onNavigationEvent) {
                sya35 sya35Var3 = sya35.this;
                sya35.IAuthTabCallback(sya35Var3, sya35.extraCallbackWithResult(sya35Var3));
            }
            sya35.this.onNavigationEvent("-", true, false, true);
            if (sya35.access000(sya35.this) && this.onNavigationEvent) {
                sya35 sya35Var4 = sya35.this;
                sya35.onExtraCallback(sya35Var4, Integer.valueOf(sya35.onWarmupCompleted(sya35Var4).intValue() + sya35.extraCallbackWithResult(sya35.this)));
            }
            if (!sya35.readTypedObject(sya35.this).onExtraCallbackWithResult()) {
                sya35.onExtraCallback(sya35.this, false, false);
                sya35.ICustomTabsCallback(sya35.this);
                if (sya35.IAuthTabCallback(sya35.this) instanceof sya492) {
                    sya35 sya35Var5 = sya35.this;
                    Object[] objArr = {sya35Var5, ((sya492) sya35.IAuthTabCallback(sya35Var5)).IAuthTabCallbackDefault()};
                    int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback5 = OverseasRrnInputTextField.IAuthTabCallback();
                    sya35.onExtraCallbackWithResult(sya35Var5, (sya34) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, 261407843, -261407833, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback4));
                    if (!sya35.writeTypedObject(sya35.this).IAuthTabCallbackStub()) {
                        sya35.this.onExtraCallback();
                    }
                }
                sya35 sya35Var6 = sya35.this;
                sya35.onExtraCallback(sya35Var6, (Integer) sya35.IAuthTabCallbackStub(sya35Var6).onNavigationEvent());
            }
            Object[] objArr2 = {sya35.this};
            int iIAuthTabCallback6 = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback7 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr2, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback7, iIAuthTabCallback6)).onExtraCallback(sya35.this.new onNavigationEvent(false));
            sya35.onWarmupCompleted(sya35.this, false, false, false);
            sya35.asInterface(sya35.this).onNavigationEvent();
            sya35.asBinder(sya35.this);
        }
    }

    private void onTransact() {
        int i = 2 % 2;
        onExtraCallback(false, false);
        this.ICustomTabsCallback_Parcel = new IAuthTabCallbackStub(this, null);
        int i2 = requestPostMessageChannel + 9;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
    }

    class IAuthTabCallbackStub implements sya30 {
        private IAuthTabCallbackStub() {
        }

        /* synthetic */ IAuthTabCallbackStub(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() throws Throwable {
            sya35.this.new onExtraCallback(true).onExtraCallbackWithResult();
        }
    }

    class onExtraCallback implements sya30 {
        private final boolean onExtraCallback;

        public onExtraCallback(boolean z) {
            this.onExtraCallback = z;
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() throws Throwable {
            sya35 sya35Var = sya35.this;
            sya35.onWarmupCompleted(sya35Var, sya35.readTypedObject(sya35Var).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            sya35.ICustomTabsCallback(sya35.this);
            if (!this.onExtraCallback && sya35.IAuthTabCallback(sya35.this).onNavigationEvent() == sya43.IAuthTabCallback.MappingEnd) {
                sya35 sya35Var2 = sya35.this;
                sya35.onExtraCallback(sya35Var2, (Integer) sya35.IAuthTabCallbackStub(sya35Var2).onNavigationEvent());
                sya35 sya35Var3 = sya35.this;
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                sya35.onExtraCallback(sya35Var3, (sya30) ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var3}, -601092040, 601092049, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).onNavigationEvent());
                return;
            }
            sya35.this.onExtraCallback();
            AnonymousClass5 anonymousClass5 = null;
            if (sya35.IAuthTabCallback_Parcel(sya35.this)) {
                Object[] objArr = {sya35.this};
                int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback5 = OverseasRrnInputTextField.IAuthTabCallback();
                ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback4)).onExtraCallback(new IAuthTabCallback(sya35.this, anonymousClass5));
                sya35.onWarmupCompleted(sya35.this, false, true, true);
                return;
            }
            sya35.this.onNavigationEvent("?", true, false, true);
            Object[] objArr2 = {sya35.this};
            int iIAuthTabCallback6 = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback7 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr2, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback7, iIAuthTabCallback6)).onExtraCallback(new onWarmupCompleted(sya35.this, anonymousClass5));
            sya35.onWarmupCompleted(sya35.this, false, true, false);
        }
    }

    private boolean onExtraCallbackWithResult(sya43 sya43Var) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 27;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        if (sya43Var.onNavigationEvent() == sya43.IAuthTabCallback.Scalar) {
            sya6 sya6VarOnExtraCallback = ((sya492) sya43Var).onExtraCallback();
            if (sya6VarOnExtraCallback == sya6.FOLDED || sya6VarOnExtraCallback == sya6.LITERAL) {
                return true;
            }
            int i4 = prefetchWithMultipleUrls + 61;
            requestPostMessageChannel = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = requestPostMessageChannel;
        int i6 = i5 + 7;
        prefetchWithMultipleUrls = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 125;
        prefetchWithMultipleUrls = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    class IAuthTabCallback implements sya30 {
        private IAuthTabCallback() {
        }

        /* synthetic */ IAuthTabCallback(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() throws Throwable {
            sya35.this.onNavigationEvent(":", false, false, false);
            sya35 sya35Var = sya35.this;
            sya35.onWarmupCompleted(sya35Var, sya35.asInterface(sya35Var).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            sya35 sya35Var2 = sya35.this;
            if (!sya35.onNavigationEvent(sya35Var2, sya35.IAuthTabCallback(sya35Var2)) && sya35.asBinder(sya35.this)) {
                sya35.onExtraCallback(sya35.this, true, false);
                sya35.this.onExtraCallback();
                sya35 sya35Var3 = sya35.this;
                sya35.onExtraCallback(sya35Var3, (Integer) sya35.IAuthTabCallbackStub(sya35Var3).onNavigationEvent());
            }
            sya35 sya35Var4 = sya35.this;
            sya35.onWarmupCompleted(sya35Var4, sya35.readTypedObject(sya35Var4).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            if (!sya35.readTypedObject(sya35.this).onExtraCallbackWithResult()) {
                sya35.onExtraCallback(sya35.this, true, false);
                sya35.ICustomTabsCallback(sya35.this);
                sya35.this.onExtraCallback();
                sya35 sya35Var5 = sya35.this;
                sya35.onExtraCallback(sya35Var5, (Integer) sya35.IAuthTabCallbackStub(sya35Var5).onNavigationEvent());
            }
            Object[] objArr = {sya35.this};
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).onExtraCallback(sya35.this.new onExtraCallback(false));
            sya35.onWarmupCompleted(sya35.this, false, true, false);
            sya35.asInterface(sya35.this).onNavigationEvent();
            sya35.asBinder(sya35.this);
        }
    }

    class onWarmupCompleted implements sya30 {
        private onWarmupCompleted() {
        }

        /* synthetic */ onWarmupCompleted(sya35 sya35Var, AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // o.sya30
        public void onExtraCallbackWithResult() throws Throwable {
            sya35.this.onExtraCallback();
            sya35.this.onNavigationEvent(":", true, false, true);
            sya35 sya35Var = sya35.this;
            sya35.onWarmupCompleted(sya35Var, sya35.asInterface(sya35Var).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            sya35.asBinder(sya35.this);
            sya35 sya35Var2 = sya35.this;
            sya35.onWarmupCompleted(sya35Var2, sya35.readTypedObject(sya35Var2).onExtraCallbackWithResult(sya35.IAuthTabCallback(sya35.this)));
            sya35.ICustomTabsCallback(sya35.this);
            Object[] objArr = {sya35.this};
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            ((PAGLogoView) sya35.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, -601092040, 601092049, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).onExtraCallback(sya35.this.new onExtraCallback(false));
            sya35.onWarmupCompleted(sya35.this, false, true, false);
            sya35.asInterface(sya35.this).onExtraCallback(sya35.IAuthTabCallback(sya35.this));
            sya35.asBinder(sya35.this);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        sya35 sya35Var = (sya35) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 31;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            sya35Var.IAuthTabCallbackStubProxy.onNavigationEvent();
            sya43.IAuthTabCallback iAuthTabCallback = sya43.IAuthTabCallback.SequenceStart;
            throw null;
        }
        if (sya35Var.IAuthTabCallbackStubProxy.onNavigationEvent() == sya43.IAuthTabCallback.SequenceStart && !sya35Var.access100.isEmpty() && sya35Var.access100.peek().onNavigationEvent() == sya43.IAuthTabCallback.SequenceEnd) {
            int i3 = prefetchWithMultipleUrls + 105;
            requestPostMessageChannel = i3 % 128;
            return i3 % 2 != 0;
        }
        int i4 = prefetchWithMultipleUrls + 113;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        sya35 sya35Var = (sya35) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 99;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            if (sya35Var.IAuthTabCallbackStubProxy.onNavigationEvent() != sya43.IAuthTabCallback.MappingStart || sya35Var.access100.isEmpty() || sya35Var.access100.peek().onNavigationEvent() != sya43.IAuthTabCallback.MappingEnd) {
                return false;
            }
            int i3 = prefetchWithMultipleUrls + 115;
            requestPostMessageChannel = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        sya35Var.IAuthTabCallbackStubProxy.onNavigationEvent();
        sya43.IAuthTabCallback iAuthTabCallback = sya43.IAuthTabCallback.MappingStart;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
    
        if (((java.lang.Boolean) IAuthTabCallback(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r14}, -2002870114, 2002870122, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), r12, r13)).booleanValue() != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean IAuthTabCallbackStub() {
        int length;
        int i = 2 % 2;
        sya43 sya43Var = this.IAuthTabCallbackStubProxy;
        if (sya43Var instanceof sya44) {
            int i2 = requestPostMessageChannel + 119;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            Optional<sya18> optionalOnTransact = ((sya44) sya43Var).onTransact();
            if (optionalOnTransact.isPresent()) {
                if (!this.onRelationshipValidationResult.isPresent()) {
                    this.onRelationshipValidationResult = optionalOnTransact;
                }
                length = optionalOnTransact.get().onExtraCallbackWithResult().length();
            } else {
                length = 0;
            }
        }
        Optional<String> optionalEmpty = Optional.empty();
        sya43.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent();
        sya43.IAuthTabCallback iAuthTabCallback = sya43.IAuthTabCallback.Scalar;
        if (iAuthTabCallbackOnNavigationEvent == iAuthTabCallback) {
            optionalEmpty = ((sya492) this.IAuthTabCallbackStubProxy).IAuthTabCallback();
        } else {
            sya43 sya43Var2 = this.IAuthTabCallbackStubProxy;
            if (sya43Var2 instanceof sya38) {
                optionalEmpty = ((sya38) sya43Var2).onExtraCallbackWithResult();
            }
        }
        if (!(!optionalEmpty.isPresent())) {
            if (this.ICustomTabsCallbackStub == null) {
                int i4 = requestPostMessageChannel + 71;
                prefetchWithMultipleUrls = i4 % 128;
                int i5 = i4 % 2;
                this.ICustomTabsCallbackStub = onExtraCallback(optionalEmpty.get());
            }
            length += this.ICustomTabsCallbackStub.length();
        }
        if (this.IAuthTabCallbackStubProxy.onNavigationEvent() == iAuthTabCallback) {
            if (this.onExtraCallbackWithResult == null) {
                this.onExtraCallbackWithResult = IAuthTabCallback(((sya492) this.IAuthTabCallbackStubProxy).IAuthTabCallbackDefault());
            }
            length += this.onExtraCallbackWithResult.onNavigationEvent().length();
        }
        if (length < this.onMessageChannelReady) {
            if (this.IAuthTabCallbackStubProxy.onNavigationEvent() != sya43.IAuthTabCallback.Alias) {
                int i6 = requestPostMessageChannel + 87;
                prefetchWithMultipleUrls = i6 % 128;
                Object obj = null;
                if (i6 % 2 != 0) {
                    this.IAuthTabCallbackStubProxy.onNavigationEvent();
                    throw null;
                }
                if (this.IAuthTabCallbackStubProxy.onNavigationEvent() == iAuthTabCallback) {
                    int i7 = requestPostMessageChannel + 57;
                    prefetchWithMultipleUrls = i7 % 128;
                    if (i7 % 2 != 0) {
                        this.onExtraCallbackWithResult.IAuthTabCallbackStub();
                        obj.hashCode();
                        throw null;
                    }
                    if (this.onExtraCallbackWithResult.IAuthTabCallbackStub() || this.onExtraCallbackWithResult.asBinder()) {
                    }
                }
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                if (!((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, -1212317729, 1212317734, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue()) {
                    int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                }
            }
            int i8 = requestPostMessageChannel + 99;
            prefetchWithMultipleUrls = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        return false;
    }

    private void IAuthTabCallback(String str, boolean z) {
        int i = 2 % 2;
        Optional<sya18> optionalOnTransact = ((sya44) this.IAuthTabCallbackStubProxy).onTransact();
        if (optionalOnTransact.isPresent()) {
            int i2 = requestPostMessageChannel + 91;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            sya18 sya18Var = optionalOnTransact.get();
            if (!this.onRelationshipValidationResult.isPresent()) {
                this.onRelationshipValidationResult = optionalOnTransact;
            }
            onNavigationEvent(str + sya18Var, true, false, false);
        }
        this.onRelationshipValidationResult = Optional.empty();
        if (z) {
            int i4 = requestPostMessageChannel + 117;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 != 0) {
                IAuthTabCallback(0);
            } else {
                IAuthTabCallback(1);
            }
        }
    }

    private void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 57;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback("*", z);
        int i4 = prefetchWithMultipleUrls + 29;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r1.onWarmupCompleted().onNavigationEvent() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r1.onWarmupCompleted().onNavigationEvent() != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void IAuthTabCallbackStubProxy() {
        Optional<String> optionalOnExtraCallbackWithResult;
        int i = 2 % 2;
        Object obj = null;
        if (this.IAuthTabCallbackStubProxy.onNavigationEvent() == sya43.IAuthTabCallback.Scalar) {
            sya492 sya492Var = (sya492) this.IAuthTabCallbackStubProxy;
            optionalOnExtraCallbackWithResult = sya492Var.IAuthTabCallback();
            if (this.ICustomTabsCallbackStubProxy == null) {
                this.ICustomTabsCallbackStubProxy = IAuthTabCallback(sya492Var);
            }
            if (!this.asBinder.booleanValue() || !optionalOnExtraCallbackWithResult.isPresent()) {
                sya6 sya6Var = this.ICustomTabsCallbackStubProxy;
                sya6 sya6Var2 = sya6.PLAIN;
                if (sya6Var != sya6Var2 || (!sya492Var.onWarmupCompleted().onExtraCallbackWithResult())) {
                    if (this.ICustomTabsCallbackStubProxy != sya6Var2) {
                        int i2 = prefetchWithMultipleUrls + 31;
                        requestPostMessageChannel = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i3 = 87 / 0;
                        }
                    }
                }
                this.ICustomTabsCallbackStub = null;
                return;
            }
            if (sya492Var.onWarmupCompleted().onExtraCallbackWithResult() && !optionalOnExtraCallbackWithResult.isPresent()) {
                optionalOnExtraCallbackWithResult = Optional.of("!");
                this.ICustomTabsCallbackStub = null;
            }
        } else {
            sya38 sya38Var = (sya38) this.IAuthTabCallbackStubProxy;
            optionalOnExtraCallbackWithResult = sya38Var.onExtraCallbackWithResult();
            if ((!this.asBinder.booleanValue() || !optionalOnExtraCallbackWithResult.isPresent()) && sya38Var.onExtraCallback()) {
                this.ICustomTabsCallbackStub = null;
                return;
            }
        }
        if (!optionalOnExtraCallbackWithResult.isPresent()) {
            throw new sya7("tag is not specified");
        }
        if (this.ICustomTabsCallbackStub == null) {
            this.ICustomTabsCallbackStub = onExtraCallback(optionalOnExtraCallbackWithResult.get());
        }
        onNavigationEvent(this.ICustomTabsCallbackStub, true, false, false);
        this.ICustomTabsCallbackStub = null;
        int i4 = requestPostMessageChannel + 83;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        if (r4.onExtraCallbackWithResult.onWarmupCompleted() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f7, code lost:
    
        if (r4.onExtraCallbackWithResult.IAuthTabCallback() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (r4.onExtraCallbackWithResult.IAuthTabCallback() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0106, code lost:
    
        return r5.onExtraCallback();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private sya6 IAuthTabCallback(sya492 sya492Var) {
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = IAuthTabCallback(sya492Var.IAuthTabCallbackDefault());
        }
        if (!sya492Var.IAuthTabCallback_Parcel()) {
            int i2 = prefetchWithMultipleUrls + 93;
            requestPostMessageChannel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 68 / 0;
                if (!sya492Var.asBinder()) {
                    if (!this.asBinder.booleanValue()) {
                        if (sya492Var.access000() && Optional.of(uh25.getInterfaceDescriptor.onNavigationEvent()).equals(sya492Var.IAuthTabCallback())) {
                            return sya6.DOUBLE_QUOTED;
                        }
                        if ((sya492Var.IAuthTabCallback_Parcel() || sya492Var.access000()) && sya492Var.onWarmupCompleted().onExtraCallbackWithResult() && (!this.ICustomTabsCallbackDefault || (!this.onExtraCallbackWithResult.IAuthTabCallbackStub() && !this.onExtraCallbackWithResult.asBinder()))) {
                            if (this.IAuthTabCallback_Parcel == 0 || !this.onExtraCallbackWithResult.onExtraCallback()) {
                                if (this.IAuthTabCallback_Parcel == 0) {
                                    int i4 = requestPostMessageChannel + 73;
                                    prefetchWithMultipleUrls = i4 % 128;
                                    int i5 = i4 % 2;
                                }
                            }
                            sya6 sya6Var = sya6.PLAIN;
                            int i6 = prefetchWithMultipleUrls + 57;
                            requestPostMessageChannel = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 28 / 0;
                            }
                            return sya6Var;
                        }
                        if (!sya492Var.IAuthTabCallbackStubProxy()) {
                            int i8 = prefetchWithMultipleUrls + 113;
                            requestPostMessageChannel = i8 % 128;
                            if (i8 % 2 == 0) {
                                sya492Var.getInterfaceDescriptor();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (sya492Var.getInterfaceDescriptor()) {
                                if (this.IAuthTabCallback_Parcel == 0 && !this.ICustomTabsCallbackDefault) {
                                    int i9 = requestPostMessageChannel + 115;
                                    prefetchWithMultipleUrls = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        int i10 = 27 / 0;
                                    }
                                }
                            }
                        }
                        if (!sya492Var.IAuthTabCallback_Parcel()) {
                            int i11 = requestPostMessageChannel + 27;
                            prefetchWithMultipleUrls = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 7 / 0;
                                if (sya492Var.access100()) {
                                    if (!(!this.onExtraCallbackWithResult.onExtraCallbackWithResult())) {
                                        int i13 = requestPostMessageChannel + 105;
                                        prefetchWithMultipleUrls = i13 % 128;
                                        int i14 = i13 % 2;
                                        if (!this.ICustomTabsCallbackDefault || !this.onExtraCallbackWithResult.asBinder()) {
                                            return sya6.SINGLE_QUOTED;
                                        }
                                    }
                                }
                            } else if (sya492Var.access100()) {
                            }
                        }
                        return sya6.DOUBLE_QUOTED;
                    }
                }
            } else if (!sya492Var.asBinder()) {
            }
        }
        return sya6.DOUBLE_QUOTED;
    }

    /* renamed from: o.sya35$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] onExtraCallback;
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[sya6.values().length];
            onExtraCallback = iArr;
            try {
                iArr[sya6.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[sya6.DOUBLE_QUOTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[sya6.SINGLE_QUOTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallback[sya6.FOLDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallback[sya6.LITERAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[sya43.IAuthTabCallback.values().length];
            onWarmupCompleted = iArr2;
            try {
                iArr2[sya43.IAuthTabCallback.Scalar.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onWarmupCompleted[sya43.IAuthTabCallback.SequenceStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onWarmupCompleted[sya43.IAuthTabCallback.MappingStart.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void IAuthTabCallback_Parcel() throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 29;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        sya492 sya492Var = (sya492) this.IAuthTabCallbackStubProxy;
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = IAuthTabCallback(sya492Var.IAuthTabCallbackDefault());
        }
        boolean z = false;
        if (!this.ICustomTabsCallbackDefault) {
            int i5 = prefetchWithMultipleUrls + 85;
            requestPostMessageChannel = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 53 / 0;
                if (this.extraCommand) {
                    z = true;
                }
            } else if (this.extraCommand) {
            }
        }
        int i7 = AnonymousClass5.onExtraCallback[this.ICustomTabsCallbackStubProxy.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                int i8 = requestPostMessageChannel + 83;
                int i9 = i8 % 128;
                prefetchWithMultipleUrls = i9;
                int i10 = i8 % 2;
                if (i7 != 3) {
                    int i11 = i9 + 39;
                    int i12 = i11 % 128;
                    requestPostMessageChannel = i12;
                    if (i11 % 2 != 0 ? i7 == 4 : i7 == 5) {
                        onExtraCallback(this.onExtraCallbackWithResult.onNavigationEvent(), z);
                    } else {
                        if (i7 != 5) {
                            throw new uh16("Unexpected scalarStyle: " + this.ICustomTabsCallbackStubProxy);
                        }
                        int i13 = i12 + 47;
                        prefetchWithMultipleUrls = i13 % 128;
                        int i14 = i13 % 2;
                        onNavigationEvent(this.onExtraCallbackWithResult.onNavigationEvent());
                        i = requestPostMessageChannel + 3;
                        prefetchWithMultipleUrls = i % 128;
                    }
                } else {
                    onExtraCallbackWithResult(this.onExtraCallbackWithResult.onNavigationEvent(), z);
                }
            } else {
                onWarmupCompleted(this.onExtraCallbackWithResult.onNavigationEvent(), z);
            }
            this.onExtraCallbackWithResult = null;
            this.ICustomTabsCallbackStubProxy = null;
        }
        onNavigationEvent(this.onExtraCallbackWithResult.onNavigationEvent(), z);
        i = prefetchWithMultipleUrls + 17;
        requestPostMessageChannel = i % 128;
        int i15 = i % 2;
        this.onExtraCallbackWithResult = null;
        this.ICustomTabsCallbackStubProxy = null;
    }

    private String onExtraCallback(onDowngrade ondowngrade) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 99;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        if (ondowngrade.onExtraCallback() != 1) {
            throw new sya7("unsupported YAML version: " + ondowngrade);
        }
        int i4 = requestPostMessageChannel + 93;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            ondowngrade.onWarmupCompleted();
            throw null;
        }
        String strOnWarmupCompleted = ondowngrade.onWarmupCompleted();
        int i5 = prefetchWithMultipleUrls + 21;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return strOnWarmupCompleted;
    }

    private String asBinder(String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 39;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            str.isEmpty();
            throw null;
        }
        if (str.isEmpty()) {
            throw new sya7("tag prefix must not be empty");
        }
        StringBuilder sb = new StringBuilder();
        if (str.charAt(0) == '!') {
            i = 1;
        } else {
            int i4 = prefetchWithMultipleUrls + 11;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        }
        while (i < str.length()) {
            int i6 = requestPostMessageChannel + 19;
            prefetchWithMultipleUrls = i6 % 128;
            int i7 = i6 % 2;
            i++;
        }
        sb.append((CharSequence) str, 0, i);
        return sb.toString();
    }

    private String onExtraCallback(String str) {
        int i = 2 % 2;
        if (!(!str.isEmpty())) {
            throw new sya7("tag must not be empty");
        }
        Object obj = null;
        if ("!".equals(str)) {
            int i2 = requestPostMessageChannel + 107;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        String str2 = null;
        for (String str3 : this.mayLaunchUrl.keySet()) {
            if (str.startsWith(str3)) {
                if (!"!".equals(str3)) {
                    int i3 = requestPostMessageChannel + 45;
                    prefetchWithMultipleUrls = i3 % 128;
                    if (i3 % 2 != 0) {
                        str3.length();
                        str.length();
                        throw null;
                    }
                    if (str3.length() < str.length()) {
                    }
                }
                str2 = str3;
            }
        }
        if (str2 != null) {
            int i4 = prefetchWithMultipleUrls + 45;
            requestPostMessageChannel = i4 % 128;
            if (i4 % 2 == 0) {
                str.substring(str2.length());
                this.mayLaunchUrl.get(str2);
                throw null;
            }
            str = str.substring(str2.length());
            str2 = this.mayLaunchUrl.get(str2);
        }
        if (str2 == null) {
            return "!<" + str + ">";
        }
        String str4 = str2 + str;
        int i5 = requestPostMessageChannel + 7;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private sya34 IAuthTabCallback(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        int i2;
        boolean z9;
        char c;
        boolean z10;
        int i3 = 2 % 2;
        int i4 = requestPostMessageChannel + 67;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        if (str.isEmpty()) {
            return new sya34(str, true, false, false, true, true, false);
        }
        if (str.startsWith("---") || str.startsWith("...")) {
            z = true;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        if (str.length() == 1 || sya61.onTransact.onExtraCallbackWithResult(str.codePointAt(1))) {
            z3 = true;
        } else {
            int i6 = prefetchWithMultipleUrls + 73;
            requestPostMessageChannel = i6 % 128;
            int i7 = i6 % 2;
            z3 = false;
        }
        boolean z11 = true;
        boolean z12 = z3;
        int iCharCount = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = z2;
        boolean z23 = false;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCharCount == 0) {
                if ("#,[]{}&*!|>'\"%@`".indexOf(iCodePointAt) != -1) {
                    int i8 = prefetchWithMultipleUrls + 55;
                    requestPostMessageChannel = i8 % 128;
                    int i9 = i8 % 2;
                    z = true;
                    z22 = true;
                }
                if (iCodePointAt == 63 || iCodePointAt == 58) {
                    if (z12) {
                        int i10 = prefetchWithMultipleUrls + 45;
                        requestPostMessageChannel = i10 % 128;
                        int i11 = i10 % 2;
                        z = true;
                        z22 = true;
                    } else {
                        z = true;
                    }
                }
                if (iCodePointAt == 45 && z12) {
                    z = true;
                    z22 = true;
                }
            } else {
                if (",?[]{}".indexOf(iCodePointAt) != -1) {
                    i = 58;
                    z = true;
                } else {
                    i = 58;
                }
                if (iCodePointAt == i) {
                    z = true;
                    if (z12) {
                        z22 = true;
                    }
                }
                if (iCodePointAt == 35 && z11) {
                }
            }
            boolean zOnExtraCallbackWithResult = sya61.onWarmupCompleted.onExtraCallbackWithResult(iCodePointAt);
            if (zOnExtraCallbackWithResult) {
                int i12 = prefetchWithMultipleUrls + 75;
                requestPostMessageChannel = i12 % 128;
                z23 = i12 % 2 != 0;
            }
            if (iCodePointAt == 10) {
                i2 = 32;
            } else {
                if (32 <= iCodePointAt) {
                    int i13 = prefetchWithMultipleUrls + 21;
                    requestPostMessageChannel = i13 % 128;
                    int i14 = i13 % 2;
                    if (iCodePointAt <= 126) {
                    }
                    i2 = 32;
                }
                if ((iCodePointAt == 133 || ((iCodePointAt >= 160 && iCodePointAt <= 55295) || ((iCodePointAt >= 57344 && iCodePointAt <= 65533) || (iCodePointAt >= 65536 && iCodePointAt <= 1114111)))) && this.onExtraCallback) {
                    i2 = 32;
                } else {
                    i2 = 32;
                    z19 = true;
                }
            }
            if (iCodePointAt == i2) {
                if (iCharCount == 0) {
                    z13 = true;
                }
                if (iCharCount == str.length() - 1) {
                    int i15 = prefetchWithMultipleUrls + 71;
                    requestPostMessageChannel = i15 % 128;
                    z15 = i15 % 2 != 0;
                }
                if (z20) {
                    int i16 = prefetchWithMultipleUrls + 117;
                    requestPostMessageChannel = i16 % 128;
                    z17 = i16 % 2 != 0;
                }
                z9 = true;
            } else if (zOnExtraCallbackWithResult) {
                if (iCharCount == 0) {
                    z14 = true;
                }
                if (iCharCount == str.length() - 1) {
                    z16 = true;
                }
                if (z21) {
                    z18 = true;
                }
                z20 = true;
                z21 = false;
                iCharCount += Character.charCount(iCodePointAt);
                sya61 sya61Var = sya61.asBinder;
                z11 = !sya61Var.onExtraCallbackWithResult(iCodePointAt) || zOnExtraCallbackWithResult;
                boolean z24 = z;
                if (iCharCount + 1 >= str.length()) {
                    int i17 = prefetchWithMultipleUrls + 11;
                    requestPostMessageChannel = i17 % 128;
                    int i18 = i17 % 2;
                    int iCharCount2 = Character.charCount(str.codePointAt(iCharCount)) + iCharCount;
                    if (iCharCount2 >= str.length() || sya61Var.onExtraCallbackWithResult(str.codePointAt(iCharCount2))) {
                        c = 2;
                    } else {
                        int i19 = prefetchWithMultipleUrls + 13;
                        requestPostMessageChannel = i19 % 128;
                        c = 2;
                        if (i19 % 2 == 0) {
                            throw null;
                        }
                        z10 = zOnExtraCallbackWithResult;
                    }
                }
                z12 = z10;
                z = z24;
            } else {
                z9 = false;
            }
            z21 = z9;
            z20 = false;
            iCharCount += Character.charCount(iCodePointAt);
            sya61 sya61Var2 = sya61.asBinder;
            if (sya61Var2.onExtraCallbackWithResult(iCodePointAt)) {
            }
            boolean z242 = z;
            if (iCharCount + 1 >= str.length()) {
            }
            z12 = z10;
            z = z242;
        }
        if (z13 || z14 || z15 || z16) {
            z4 = false;
            z5 = false;
        } else {
            z4 = true;
            z5 = true;
        }
        if (z17) {
            z4 = false;
            z6 = true;
            z5 = false;
        } else {
            z6 = true;
        }
        boolean z25 = !z17;
        if (z18 || z19) {
            z4 = false;
            z7 = false;
            z8 = false;
            z5 = false;
        } else {
            z8 = z6 ^ z15;
            z7 = z25;
        }
        if (z23) {
            z4 = false;
        }
        boolean z26 = z ? false : z4;
        if (z22) {
            z5 = false;
        }
        return new sya34(str, false, z23, z26, z5, z7, z8);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onNavigationEvent(String str, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 71;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        boolean z4 = true;
        if (i2 % 2 == 0) {
            int i4 = 23 / 0;
            if (!this.newSession) {
                if (z) {
                    int i5 = i3 + 99;
                    prefetchWithMultipleUrls = i5 % 128;
                    int i6 = i5 % 2;
                    this.getInterfaceDescriptor++;
                }
            }
        } else if (!this.newSession) {
        }
        this.newSession = z2;
        if (this.extraCallbackWithResult) {
            int i7 = prefetchWithMultipleUrls + 21;
            int i8 = i7 % 128;
            requestPostMessageChannel = i8;
            if (i7 % 2 == 0) {
                throw null;
            }
            if (!z3) {
                z4 = false;
            } else {
                int i9 = i8 + 45;
                prefetchWithMultipleUrls = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        this.extraCallbackWithResult = z4;
        this.getInterfaceDescriptor += str.length();
        this.onPostMessage = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int onExtraCallback() {
        int i = 2 % 2;
        Integer num = this.extraCallback;
        int iIntValue = num != null ? num.intValue() : 0;
        Object obj = null;
        if (this.extraCallbackWithResult) {
            int i2 = prefetchWithMultipleUrls;
            int i3 = i2 + 45;
            requestPostMessageChannel = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = this.getInterfaceDescriptor;
            if (i4 > iIntValue) {
                onTransact((String) null);
                int i5 = requestPostMessageChannel + 101;
                prefetchWithMultipleUrls = i5 % 128;
                int i6 = i5 % 2;
            } else if (i4 == iIntValue) {
                int i7 = i2 + 7;
                requestPostMessageChannel = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 24 / 0;
                    if (!this.newSession) {
                    }
                } else if (!this.newSession) {
                }
            }
        }
        int i9 = iIntValue - this.getInterfaceDescriptor;
        IAuthTabCallback(i9);
        return i9;
    }

    private void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 31;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        if (i <= 0) {
            return;
        }
        this.newSession = true;
        int i5 = 0;
        while (i5 < i) {
            i5++;
            int i6 = prefetchWithMultipleUrls + 53;
            requestPostMessageChannel = i6 % 128;
            int i7 = i6 % 2;
        }
        this.getInterfaceDescriptor += i;
    }

    private void onTransact(String str) {
        int i = 2 % 2;
        this.newSession = true;
        this.extraCallbackWithResult = true;
        this.getInterfaceDescriptor = 0;
        if (str == null) {
            int i2 = requestPostMessageChannel + 37;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = requestPostMessageChannel + 53;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    void onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 101;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        onTransact((String) null);
        int i4 = requestPostMessageChannel + 99;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    void onExtraCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 83;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onTransact((String) null);
        int i4 = prefetchWithMultipleUrls + 27;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallbackWithResult(String str, boolean z) {
        int i = 2 % 2;
        onNavigationEvent("'", true, false, false);
        int i2 = 0;
        boolean z2 = false;
        boolean zOnExtraCallbackWithResult = false;
        int i3 = 0;
        while (i2 <= str.length()) {
            int i4 = prefetchWithMultipleUrls + 33;
            requestPostMessageChannel = i4 % 128;
            if (i4 % 2 == 0) {
                str.length();
                throw null;
            }
            char cCharAt = i2 < str.length() ? str.charAt(i2) : (char) 0;
            if (z2) {
                int i5 = requestPostMessageChannel + 55;
                int i6 = i5 % 128;
                prefetchWithMultipleUrls = i6;
                int i7 = i5 % 2;
                if (cCharAt != ' ') {
                    int i8 = i6 + 89;
                    requestPostMessageChannel = i8 % 128;
                    if (i8 % 2 != 0 ? i3 + 1 != i2 : i3 != i2) {
                        this.getInterfaceDescriptor += i2 - i3;
                        i3 = i2;
                    } else if (this.getInterfaceDescriptor > this.IAuthTabCallbackStub && z) {
                        int i9 = i6 + 41;
                        requestPostMessageChannel = i9 % 128;
                        int i10 = i9 % 2;
                        if (i3 != 0 && i2 != str.length()) {
                            onExtraCallback();
                        }
                        i3 = i2;
                    }
                }
            } else if (zOnExtraCallbackWithResult) {
                if (cCharAt == 0 || sya61.onWarmupCompleted.onNavigationEvent(cCharAt)) {
                    char c = '\n';
                    if (str.charAt(i3) == '\n') {
                        int i11 = prefetchWithMultipleUrls + 55;
                        requestPostMessageChannel = i11 % 128;
                        int i12 = i11 % 2;
                        onTransact((String) null);
                    }
                    char[] charArray = str.substring(i3, i2).toCharArray();
                    int length = charArray.length;
                    int i13 = 0;
                    while (i13 < length) {
                        char c2 = charArray[i13];
                        if (c2 == c) {
                            int i14 = requestPostMessageChannel + 85;
                            prefetchWithMultipleUrls = i14 % 128;
                            if (i14 % 2 != 0) {
                                onTransact((String) null);
                                int i15 = 46 / 0;
                            } else {
                                onTransact((String) null);
                            }
                        } else {
                            onTransact(String.valueOf(c2));
                        }
                        i13++;
                        c = '\n';
                    }
                    onExtraCallback();
                    i3 = i2;
                }
            } else if (sya61.onWarmupCompleted.onNavigationEvent(cCharAt, "\u0000 '") && i3 < i2) {
                this.getInterfaceDescriptor += i2 - i3;
                i3 = i2;
            }
            if (cCharAt == '\'') {
                this.getInterfaceDescriptor += 2;
                i3 = i2 + 1;
            }
            if (cCharAt != 0) {
                z2 = cCharAt == ' ';
                zOnExtraCallbackWithResult = sya61.onWarmupCompleted.onExtraCallbackWithResult(cCharAt);
            }
            i2++;
        }
        onNavigationEvent("'", false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onWarmupCompleted(String str, boolean z) throws Throwable {
        String str2;
        int i;
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 11;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent("\"", true, false, false);
        int i5 = 0;
        int i6 = 0;
        while (i5 <= str.length()) {
            Object obj = null;
            Character chValueOf = i5 < str.length() ? Character.valueOf(str.charAt(i5)) : null;
            String str3 = "\\";
            if (chValueOf == null || "\"\\\u0085\u2028\u2029\ufeff".indexOf(chValueOf.charValue()) != -1) {
                if (i6 < i5) {
                    int i7 = prefetchWithMultipleUrls + 75;
                    requestPostMessageChannel = i7 % 128;
                    int i8 = i7 % 2;
                    this.getInterfaceDescriptor += i5 - i6;
                    i6 = i5;
                }
                if (chValueOf != null) {
                    Map<Character, String> map = onNavigationEvent;
                    if (map.containsKey(chValueOf)) {
                        str2 = "\\" + map.get(chValueOf);
                        int i9 = prefetchWithMultipleUrls + 29;
                        requestPostMessageChannel = i9 % 128;
                        int i10 = i9 % 2;
                    } else if (Character.isHighSurrogate(chValueOf.charValue())) {
                        int i11 = requestPostMessageChannel + 77;
                        prefetchWithMultipleUrls = i11 % 128;
                        int iCharValue = (i11 % 2 == 0 ? (i = i5 + 1) >= str.length() : (i = i5 + (-1)) >= str.length()) ? chValueOf.charValue() : Character.toCodePoint(chValueOf.charValue(), str.charAt(i));
                        if (this.onExtraCallback && lt12.onWarmupCompleted(iCharValue)) {
                            int i12 = prefetchWithMultipleUrls + 119;
                            requestPostMessageChannel = i12 % 128;
                            int i13 = i12 % 2;
                            String strValueOf = String.valueOf(Character.toChars(iCharValue));
                            if (Character.charCount(iCharValue) == 2) {
                                i5++;
                            }
                            str2 = strValueOf;
                        } else if (chValueOf.charValue() <= 255) {
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr = new Object[1];
                            a(null, null, new byte[]{ISOFileInfo.DATA_BYTES2}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + CertificateBody.profileType, objArr);
                            sb.append(((String) objArr[0]).intern());
                            sb.append(Integer.toString(chValueOf.charValue(), 16));
                            String string = sb.toString();
                            str2 = "\\x" + string.substring(string.length() - 2);
                        } else if (Character.charCount(iCharValue) == 2) {
                            i5++;
                            str2 = "\\U" + ("000" + Long.toHexString(iCharValue)).substring(r7.length() - 8);
                        } else {
                            String str4 = "000" + Integer.toString(chValueOf.charValue(), 16);
                            str2 = "\\u" + str4.substring(str4.length() - 4);
                        }
                    }
                    this.getInterfaceDescriptor += str2.length();
                    i6 = i5 + 1;
                }
            } else {
                int i14 = requestPostMessageChannel + 85;
                prefetchWithMultipleUrls = i14 % 128;
                int i15 = i14 % 2;
                if (' ' <= chValueOf.charValue()) {
                    int i16 = prefetchWithMultipleUrls + 125;
                    requestPostMessageChannel = i16 % 128;
                    int i17 = i16 % 2;
                    if (chValueOf.charValue() > '~') {
                    }
                }
            }
            if (i5 > 0 && i5 < str.length() - 1 && ((chValueOf.charValue() == ' ' || i6 >= i5) && this.getInterfaceDescriptor + (i5 - i6) > this.IAuthTabCallbackStub && z)) {
                int i18 = requestPostMessageChannel;
                int i19 = i18 + 103;
                prefetchWithMultipleUrls = i19 % 128;
                int i20 = i19 % 2;
                if (i6 >= i5) {
                    int i21 = i18 + 103;
                    prefetchWithMultipleUrls = i21 % 128;
                    if (i21 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    str3 = str.substring(i6, i5) + "\\";
                }
                if (i6 < i5) {
                    i6 = i5;
                }
                this.getInterfaceDescriptor += str3.length();
                onExtraCallback();
                this.newSession = false;
                this.extraCallbackWithResult = false;
                if (str.charAt(i6) == ' ') {
                    this.getInterfaceDescriptor++;
                }
            }
            i5++;
            int i22 = prefetchWithMultipleUrls + 63;
            requestPostMessageChannel = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 4 / 3;
            }
        }
        onNavigationEvent("\"", false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[PHI: r3
      0x004d: PHI (r3v8 o.sya15) = (r3v7 o.sya15), (r3v12 o.sya15) binds: [B:13:0x004b, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean IAuthTabCallback(List<sya15> list) {
        sya15 next;
        int i = 2 % 2;
        if (!this.access000) {
            return false;
        }
        int i2 = prefetchWithMultipleUrls + 87;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Iterator<sya15> it = list.iterator();
        boolean z = true;
        boolean z2 = false;
        int i4 = 0;
        int iOnExtraCallback = 0;
        while (!(!it.hasNext())) {
            int i5 = prefetchWithMultipleUrls + 123;
            requestPostMessageChannel = i5 % 128;
            if (i5 % 2 == 0) {
                next = it.next();
                int i6 = 86 / 0;
                if (next.onNavigationEvent() != sya17.BLANK_LINE) {
                    if (z) {
                        int i7 = requestPostMessageChannel + 107;
                        prefetchWithMultipleUrls = i7 % 128;
                        int i8 = i7 % 2;
                        onNavigationEvent("#", next.onNavigationEvent() == sya17.IN_LINE, false, false);
                        int i9 = this.getInterfaceDescriptor;
                        i4 = i9 > 0 ? i9 - 1 : 0;
                        z = false;
                    } else {
                        IAuthTabCallback(i4 - iOnExtraCallback);
                        onNavigationEvent("#", false, false, false);
                    }
                    next.IAuthTabCallback();
                    onTransact((String) null);
                    iOnExtraCallback = 0;
                } else {
                    onTransact((String) null);
                    iOnExtraCallback = onExtraCallback();
                }
            } else {
                next = it.next();
                if (next.onNavigationEvent() != sya17.BLANK_LINE) {
                }
            }
            z2 = true;
        }
        return z2;
    }

    private void extraCallbackWithResult() {
        int i = 2 % 2;
        if (!this.onTransact.onExtraCallbackWithResult()) {
            int i2 = requestPostMessageChannel + 105;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            IAuthTabCallback(this.onTransact.IAuthTabCallback());
        }
        int i4 = prefetchWithMultipleUrls + 125;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    private boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 117;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(this.onActivityLayout.IAuthTabCallback());
        int i4 = prefetchWithMultipleUrls + 81;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sya61 sya61Var = sya61.onWarmupCompleted;
        if (sya61Var.onNavigationEvent(str.charAt(0), " ")) {
            sb.append(this.IAuthTabCallbackDefault);
            int i2 = prefetchWithMultipleUrls + 89;
            requestPostMessageChannel = i2 % 128;
            int i3 = i2 % 2;
        }
        if (sya61Var.onNavigationEvent(str.charAt(str.length() - 1))) {
            int i4 = requestPostMessageChannel + 123;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
            sb.append("-");
        } else if (str.length() != 1) {
            int i6 = prefetchWithMultipleUrls + 109;
            requestPostMessageChannel = i6 % 128;
            int i7 = i6 % 2;
            if (sya61Var.onExtraCallbackWithResult(str.charAt(str.length() - 2))) {
                sb.append("+");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0140 A[PHI: r5
      0x0140: PHI (r5v15 boolean) = (r5v14 boolean), (r5v18 boolean) binds: [B:73:0x013e, B:70:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143 A[PHI: r5
      0x0143: PHI (r5v16 boolean) = (r5v14 boolean), (r5v18 boolean) binds: [B:73:0x013e, B:70:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onExtraCallback(String str, boolean z) {
        char cCharAt;
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        boolean z2 = true;
        onNavigationEvent(">" + strOnExtraCallbackWithResult, true, false, false);
        if (strOnExtraCallbackWithResult.length() > 0 && strOnExtraCallbackWithResult.charAt(strOnExtraCallbackWithResult.length() - 1) == '+') {
            this.onPostMessage = true;
        }
        Object obj = null;
        if (!ICustomTabsCallback()) {
            onTransact((String) null);
        }
        boolean z3 = true;
        boolean z4 = true;
        int i2 = 0;
        boolean z5 = false;
        int i3 = 0;
        while (i2 <= str.length()) {
            int i4 = prefetchWithMultipleUrls + 103;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
            if (i2 < str.length()) {
                int i6 = prefetchWithMultipleUrls + 55;
                requestPostMessageChannel = i6 % 128;
                int i7 = i6 % 2;
                cCharAt = str.charAt(i2);
            } else {
                cCharAt = 0;
            }
            if (z3) {
                if (cCharAt == 0 || sya61.onWarmupCompleted.onNavigationEvent(cCharAt)) {
                    if (!z4) {
                        int i8 = requestPostMessageChannel + 121;
                        int i9 = i8 % 128;
                        prefetchWithMultipleUrls = i9;
                        if (i8 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (cCharAt != 0) {
                            int i10 = i9 + 55;
                            requestPostMessageChannel = i10 % 128;
                            int i11 = i10 % 2;
                            if (cCharAt != ' ') {
                                int i12 = i9 + 5;
                                requestPostMessageChannel = i12 % 128;
                                int i13 = i12 % 2;
                                if (str.charAt(i3) == '\n') {
                                    int i14 = requestPostMessageChannel + 53;
                                    prefetchWithMultipleUrls = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        onTransact((String) null);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    onTransact((String) null);
                                }
                            }
                        }
                    }
                    if (cCharAt == ' ') {
                        z4 = z2;
                    } else {
                        int i15 = prefetchWithMultipleUrls + 83;
                        requestPostMessageChannel = i15 % 128;
                        int i16 = i15 % 2;
                        z4 = false;
                    }
                    for (char c : str.substring(i3, i2).toCharArray()) {
                        if (c == '\n') {
                            onTransact((String) null);
                        } else {
                            onTransact(String.valueOf(c));
                        }
                    }
                    if (cCharAt != 0) {
                        onExtraCallback();
                    }
                    i3 = i2;
                }
            } else if (z5) {
                if (cCharAt != ' ') {
                    if (i3 + 1 == i2 && this.getInterfaceDescriptor > this.IAuthTabCallbackStub && z) {
                        onExtraCallback();
                    } else {
                        this.getInterfaceDescriptor += i2 - i3;
                    }
                    i3 = i2;
                }
            } else if (sya61.onWarmupCompleted.onNavigationEvent(cCharAt, "\u0000 ")) {
                this.getInterfaceDescriptor += i2 - i3;
                if (cCharAt == 0) {
                    onTransact((String) null);
                }
                i3 = i2;
            }
            if (cCharAt != 0) {
                int i17 = requestPostMessageChannel + 27;
                prefetchWithMultipleUrls = i17 % 128;
                if (i17 % 2 != 0) {
                    zOnExtraCallbackWithResult = sya61.onWarmupCompleted.onExtraCallbackWithResult(cCharAt);
                    if (cCharAt == 'I') {
                        z3 = zOnExtraCallbackWithResult;
                        z5 = true;
                    } else {
                        z3 = zOnExtraCallbackWithResult;
                        z5 = false;
                    }
                } else {
                    zOnExtraCallbackWithResult = sya61.onWarmupCompleted.onExtraCallbackWithResult(cCharAt);
                    if (cCharAt == ' ') {
                    }
                }
            }
            i2++;
            z2 = true;
        }
        int i18 = requestPostMessageChannel + 3;
        prefetchWithMultipleUrls = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    void onNavigationEvent(String str) {
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        boolean zOnExtraCallbackWithResult = true;
        onNavigationEvent("|" + strOnExtraCallbackWithResult, true, false, false);
        if (strOnExtraCallbackWithResult.length() > 0 && strOnExtraCallbackWithResult.charAt(strOnExtraCallbackWithResult.length() - 1) == '+') {
            this.onPostMessage = true;
        }
        if (!ICustomTabsCallback()) {
            onTransact((String) null);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 <= str.length()) {
            int i4 = requestPostMessageChannel + 81;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 != 0) {
                str.length();
                throw null;
            }
            char cCharAt = i2 < str.length() ? str.charAt(i2) : (char) 0;
            if (zOnExtraCallbackWithResult) {
                if (cCharAt == 0 || sya61.onWarmupCompleted.onNavigationEvent(cCharAt)) {
                    for (char c : str.substring(i3, i2).toCharArray()) {
                        if (c == '\n') {
                            int i5 = prefetchWithMultipleUrls + 35;
                            requestPostMessageChannel = i5 % 128;
                            int i6 = i5 % 2;
                            onTransact((String) null);
                        } else {
                            onTransact(String.valueOf(c));
                            int i7 = prefetchWithMultipleUrls + 11;
                            requestPostMessageChannel = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                    if (cCharAt != 0) {
                        onExtraCallback();
                    }
                    i3 = i2;
                }
            } else if (cCharAt == 0 || sya61.onWarmupCompleted.onExtraCallbackWithResult(cCharAt)) {
                if (cCharAt == 0) {
                    int i9 = prefetchWithMultipleUrls + 33;
                    requestPostMessageChannel = i9 % 128;
                    int i10 = i9 % 2;
                    onTransact((String) null);
                }
                i3 = i2;
            }
            if (cCharAt != 0) {
                int i11 = requestPostMessageChannel + 13;
                prefetchWithMultipleUrls = i11 % 128;
                int i12 = i11 % 2;
                zOnExtraCallbackWithResult = sya61.onWarmupCompleted.onExtraCallbackWithResult(cCharAt);
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onNavigationEvent(String str, boolean z) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 75;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.onUnminimized) {
            this.onPostMessage = true;
        }
        if (str.isEmpty()) {
            return;
        }
        if (!this.newSession) {
            int i3 = prefetchWithMultipleUrls + 111;
            requestPostMessageChannel = i3 % 128;
            int i4 = i3 % 2;
            this.getInterfaceDescriptor++;
        }
        this.newSession = false;
        this.extraCallbackWithResult = false;
        int i5 = 0;
        boolean z2 = false;
        boolean zOnExtraCallbackWithResult = false;
        int i6 = 0;
        while (i5 <= str.length()) {
            char cCharAt = i5 < str.length() ? str.charAt(i5) : (char) 0;
            if (z2) {
                int i7 = requestPostMessageChannel;
                int i8 = i7 + 79;
                prefetchWithMultipleUrls = i8 % 128;
                if (i8 % 2 == 0 ? cCharAt != ' ' : cCharAt != 'd') {
                    if (i6 + 1 == i5) {
                        int i9 = i7 + 113;
                        int i10 = i9 % 128;
                        prefetchWithMultipleUrls = i10;
                        if (i9 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (this.getInterfaceDescriptor > this.IAuthTabCallbackStub) {
                            int i11 = i10 + 49;
                            requestPostMessageChannel = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i12 = 47 / 0;
                                if (z) {
                                    onExtraCallback();
                                    this.newSession = false;
                                    this.extraCallbackWithResult = false;
                                } else {
                                    this.getInterfaceDescriptor += i5 - i6;
                                }
                            } else if (z) {
                            }
                            i6 = i5;
                        }
                    }
                }
            } else if (zOnExtraCallbackWithResult) {
                if (sya61.onWarmupCompleted.onNavigationEvent(cCharAt)) {
                    int i13 = requestPostMessageChannel + 29;
                    prefetchWithMultipleUrls = i13 % 128;
                    int i14 = i13 % 2;
                    char c = '\n';
                    if (str.charAt(i6) == '\n') {
                        int i15 = prefetchWithMultipleUrls + 13;
                        requestPostMessageChannel = i15 % 128;
                        if (i15 % 2 == 0) {
                            onTransact((String) null);
                            obj.hashCode();
                            throw null;
                        }
                        onTransact((String) null);
                    }
                    char[] charArray = str.substring(i6, i5).toCharArray();
                    int length = charArray.length;
                    int i16 = 0;
                    while (i16 < length) {
                        char c2 = charArray[i16];
                        if (c2 == c) {
                            onTransact((String) null);
                            int i17 = prefetchWithMultipleUrls + 99;
                            requestPostMessageChannel = i17 % 128;
                            int i18 = i17 % 2;
                        } else {
                            onTransact(String.valueOf(c2));
                            int i19 = requestPostMessageChannel + 35;
                            prefetchWithMultipleUrls = i19 % 128;
                            int i20 = i19 % 2;
                        }
                        i16++;
                        c = '\n';
                    }
                    onExtraCallback();
                    this.newSession = false;
                    this.extraCallbackWithResult = false;
                    i6 = i5;
                }
            } else if (sya61.onWarmupCompleted.onNavigationEvent(cCharAt, "\u0000 ")) {
                this.getInterfaceDescriptor += i5 - i6;
                i6 = i5;
            }
            if (cCharAt != 0) {
                z2 = cCharAt == ' ';
                zOnExtraCallbackWithResult = sya61.onWarmupCompleted.onExtraCallbackWithResult(cCharAt);
            }
            i5++;
        }
    }

    static /* synthetic */ Map onWarmupCompleted() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (Map) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[0], 1365946216, -1365946215, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
    }

    static /* synthetic */ String onExtraCallback(sya35 sya35Var, String str) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (String) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var, str}, -1375296904, 1375296916, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
    }

    static /* synthetic */ PAGLogoView onNavigationEvent(sya35 sya35Var) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (PAGLogoView) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var}, -601092040, 601092049, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
    }

    static /* synthetic */ int onTransact(sya35 sya35Var) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Integer) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var}, -1393087396, 1393087399, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).intValue();
    }

    static /* synthetic */ sya34 onNavigationEvent(sya35 sya35Var, String str) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (sya34) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var, str}, 261407843, -261407833, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
    }

    static /* synthetic */ boolean extraCallback(sya35 sya35Var) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var}, 227306609, -227306607, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
    }

    static /* synthetic */ Map onWarmupCompleted(sya35 sya35Var, Map map) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (Map) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{sya35Var, map}, -161497200, 161497207, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
    }

    private boolean onNavigationEvent() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, -2002870114, 2002870122, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
    }

    private boolean onExtraCallbackWithResult() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, -1212317729, 1212317734, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
    }

    private boolean onNavigationEvent(Iterator<sya43> it, int i) {
        Object[] objArr = {this, it, Integer.valueOf(i)};
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, 1755151729, -1755151718, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
    }

    private boolean access000() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, -1790517540, 1790517540, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
    }

    private String asInterface(String str) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (String) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, str}, -1203935919, 1203935925, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
    }

    private void getInterfaceDescriptor() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this}, -238631294, 238631298, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
    }

    static void IAuthTabCallback() {
        postMessage = new char[]{32396};
        newSessionWithExtras = -1184333956;
        newAuthTabSession = true;
        prefetch = true;
    }
}
