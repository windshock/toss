package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import net.sf.scuba.smartcards.BuildConfig;
import o.Cert;
import o.UST_TRANS_Finalize;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_TRANS_V2_ImportCert {
    private static final Pattern IAuthTabCallback;
    private static final Pattern IAuthTabCallbackStub;
    private static int ICustomTabsServiceDefault;
    private static int newAuthTabSession;
    private static final Map<Character, String> onExtraCallback;
    private static final char[] onExtraCallbackWithResult;
    private static final Set<Character> onNavigationEvent;
    private static final Map<String, String> onWarmupCompleted;
    private static int receiveFile;
    private static short[] requestPostMessageChannel;
    private static int requestPostMessageChannelWithExtras;
    private static byte[] setEngagementSignalsCallback;
    private int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStubProxy;
    private final UST_TRANS_ExportCert IAuthTabCallback_Parcel;
    private Integer ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private String ICustomTabsCallbackStub;
    private final int ICustomTabsCallbackStubProxy;
    private UST_TRANS_V2_GenerateCertNum ICustomTabsCallback_Parcel;
    private boolean ICustomTabsService;
    private final Boolean access000;
    private int access100;
    private UST_TRANS_VeriSign_ImportCert asBinder;
    private final boolean asInterface;
    private Cert extraCallback;
    private int extraCallbackWithResult;
    private boolean extraCommand;
    private final boolean getInterfaceDescriptor;
    private final boolean isEngagementSignalsApiAvailable;
    private final getRootCACert<UST_TRANS_V2_GenerateCertNum> mayLaunchUrl;
    private Map<String, String> newSession;
    private final Writer newSessionWithExtras;
    private final UST_TRANS_ExportCert onActivityLayout;
    private final int onActivityResized;
    private boolean onMessageChannelReady;
    private boolean onMinimized;
    private final getRootCACert<Integer> onPostMessage;
    private String onRelationshipValidationResult;
    private final char[] onTransact;
    private final Boolean onUnminimized;
    private boolean postMessage;
    private UST_TRANS_Finalize.onExtraCallback prefetch;
    private final boolean readTypedObject;
    private final Queue<Cert> writeTypedObject;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int updateVisuals = 0;
    private static int warmup = 1;
    private static int prefetchWithMultipleUrls = 0;

    private static String $$c(int i, short s, int i2) {
        int i3 = (s * 3) + 4;
        byte[] bArr = $$a;
        int i4 = (i * 3) + 115;
        int i5 = i2 * 3;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 += -i5;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i3];
            i3++;
        }
    }

    static /* synthetic */ Boolean IAuthTabCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = warmup + 73;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = uST_TRANS_V2_ImportCert.access000;
        if (i3 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String IAuthTabCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, String str) {
        int i = 2 % 2;
        int i2 = warmup + 27;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        String strAsBinder = uST_TRANS_V2_ImportCert.asBinder(str);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return strAsBinder;
    }

    static /* synthetic */ UST_TRANS_V2_GenerateCertNum IAuthTabCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, UST_TRANS_V2_GenerateCertNum uST_TRANS_V2_GenerateCertNum) {
        int i = 2 % 2;
        int i2 = updateVisuals + 71;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        uST_TRANS_V2_ImportCert.ICustomTabsCallback_Parcel = uST_TRANS_V2_GenerateCertNum;
        if (i3 != 0) {
            return uST_TRANS_V2_GenerateCertNum;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void IAuthTabCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = updateVisuals + 11;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {uST_TRANS_V2_ImportCert, Boolean.valueOf(z), Boolean.valueOf(z2)};
        onWarmupCompleted(526611505, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -526611501, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        int i4 = warmup + 49;
        updateVisuals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean IAuthTabCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, Cert cert) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = warmup + 25;
        updateVisuals = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            zBooleanValue = ((Boolean) onWarmupCompleted(1698997613, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1698997601, new Object[]{uST_TRANS_V2_ImportCert, cert}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
            int i3 = 81 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            zBooleanValue = ((Boolean) onWarmupCompleted(1698997613, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, -1698997601, new Object[]{uST_TRANS_V2_ImportCert, cert}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
        }
        int i4 = updateVisuals + 33;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = (UST_TRANS_V2_ImportCert) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 73;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        Integer num = uST_TRANS_V2_ImportCert.ICustomTabsCallback;
        int i5 = i3 + 111;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    static /* synthetic */ UST_TRANS_ExportCert IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 81;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        UST_TRANS_ExportCert uST_TRANS_ExportCert = uST_TRANS_V2_ImportCert.onActivityLayout;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 33;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return uST_TRANS_ExportCert;
        }
        throw null;
    }

    static /* synthetic */ boolean IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) throws IOException {
        int i = 2 % 2;
        int i2 = warmup + 71;
        updateVisuals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            uST_TRANS_V2_ImportCert.onActivityResized();
            throw null;
        }
        boolean zOnActivityResized = uST_TRANS_V2_ImportCert.onActivityResized();
        int i3 = updateVisuals + 47;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnActivityResized;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Boolean IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals + 119;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        Boolean bool = uST_TRANS_V2_ImportCert.onUnminimized;
        int i5 = i3 + 47;
        updateVisuals = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ UST_TRANS_VeriSign_ImportCert ICustomTabsCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 99;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        UST_TRANS_VeriSign_ImportCert uST_TRANS_VeriSign_ImportCert = uST_TRANS_V2_ImportCert.asBinder;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 25;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return uST_TRANS_VeriSign_ImportCert;
    }

    static /* synthetic */ int access000(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = warmup + 35;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        int i5 = uST_TRANS_V2_ImportCert.access100;
        if (i4 != 0) {
            int i6 = 85 / 0;
        }
        int i7 = i3 + 97;
        warmup = i7 % 128;
        if (i7 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    static /* synthetic */ boolean access100(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals + 103;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean z = uST_TRANS_V2_ImportCert.isEngagementSignalsApiAvailable;
        if (i3 != 0) {
            return z;
        }
        throw null;
    }

    static /* synthetic */ int asInterface(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = updateVisuals + 101;
        int i5 = i4 % 128;
        warmup = i5;
        if (i4 % 2 == 0) {
            i = uST_TRANS_V2_ImportCert.extraCallbackWithResult;
            i2 = i % 1;
        } else {
            i = uST_TRANS_V2_ImportCert.extraCallbackWithResult;
            i2 = i - 1;
        }
        uST_TRANS_V2_ImportCert.extraCallbackWithResult = i2;
        int i6 = i5 + 13;
        updateVisuals = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ int extraCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals + 59;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        int i5 = uST_TRANS_V2_ImportCert.onActivityResized;
        int i6 = i3 + 25;
        updateVisuals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 90 / 0;
        }
        return i5;
    }

    static /* synthetic */ boolean extraCallbackWithResult(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals + 77;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        boolean z = uST_TRANS_V2_ImportCert.ICustomTabsCallbackDefault;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 71;
        updateVisuals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return z;
    }

    static /* synthetic */ int getInterfaceDescriptor(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = warmup + 101;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = uST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Map onActivityResized(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = warmup + 1;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        Map<String, String> map = uST_TRANS_V2_ImportCert.newSession;
        int i5 = i3 + 51;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return map;
    }

    static /* synthetic */ Integer onExtraCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, Integer num) {
        int i = 2 % 2;
        int i2 = updateVisuals + 13;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        uST_TRANS_V2_ImportCert.ICustomTabsCallback = num;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 113;
        updateVisuals = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    static /* synthetic */ Cert onExtraCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals + 1;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Cert cert = uST_TRANS_V2_ImportCert.extraCallback;
        if (i3 != 0) {
            return cert;
        }
        throw null;
    }

    static /* synthetic */ UST_TRANS_VeriSign_ImportCert onExtraCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, String str) {
        int i = 2 % 2;
        int i2 = warmup + 79;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        UST_TRANS_VeriSign_ImportCert uST_TRANS_VeriSign_ImportCert = (UST_TRANS_VeriSign_ImportCert) onWarmupCompleted(1470931322, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1470931317, new Object[]{uST_TRANS_V2_ImportCert, str}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        int i4 = warmup + 89;
        updateVisuals = i4 % 128;
        if (i4 % 2 == 0) {
            return uST_TRANS_VeriSign_ImportCert;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ UST_TRANS_VeriSign_ImportCert onExtraCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, UST_TRANS_VeriSign_ImportCert uST_TRANS_VeriSign_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 81;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        uST_TRANS_V2_ImportCert.asBinder = uST_TRANS_VeriSign_ImportCert;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 33;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return uST_TRANS_VeriSign_ImportCert;
    }

    static /* synthetic */ Map onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = warmup + 71;
        updateVisuals = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    static /* synthetic */ Cert onExtraCallbackWithResult(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, Cert cert) {
        int i = 2 % 2;
        int i2 = warmup + 19;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        uST_TRANS_V2_ImportCert.extraCallback = cert;
        int i5 = i3 + 43;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return cert;
    }

    static /* synthetic */ void onExtraCallbackWithResult(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) throws IOException {
        int i = 2 % 2;
        int i2 = updateVisuals + 101;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        uST_TRANS_V2_ImportCert.extraCallbackWithResult();
        int i4 = updateVisuals + 121;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
    }

    static /* synthetic */ void onExtraCallbackWithResult(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = warmup + 11;
        updateVisuals = i3 % 128;
        int i4 = i3 % 2;
        uST_TRANS_V2_ImportCert.onNavigationEvent(i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = updateVisuals + 39;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ String onNavigationEvent(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, String str) {
        int i = 2 % 2;
        int i2 = updateVisuals + 121;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            uST_TRANS_V2_ImportCert.onTransact(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnTransact = uST_TRANS_V2_ImportCert.onTransact(str);
        int i3 = warmup + 95;
        updateVisuals = i3 % 128;
        int i4 = i3 % 2;
        return strOnTransact;
    }

    static /* synthetic */ void onNavigationEvent(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, boolean z, boolean z2, boolean z3) throws Throwable {
        int i = 2 % 2;
        int i2 = updateVisuals + 57;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        uST_TRANS_V2_ImportCert.IAuthTabCallback(z, z2, z3);
        int i4 = updateVisuals + 31;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean onNavigationEvent(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = warmup + 21;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(-680350778, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 680350789, new Object[]{uST_TRANS_V2_ImportCert}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
        int i4 = updateVisuals + 75;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = (UST_TRANS_V2_ImportCert) objArr[0];
        int i = 2 % 2;
        int i2 = updateVisuals + 69;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        getRootCACert<UST_TRANS_V2_GenerateCertNum> getrootcacert = uST_TRANS_V2_ImportCert.mayLaunchUrl;
        int i5 = i3 + 85;
        updateVisuals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return getrootcacert;
    }

    static /* synthetic */ getRootCACert onTransact(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 35;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        getRootCACert<Integer> getrootcacert = uST_TRANS_V2_ImportCert.onPostMessage;
        int i5 = i2 + 93;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return getrootcacert;
    }

    static /* synthetic */ Map onWarmupCompleted(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, Map map) {
        int i = 2 % 2;
        int i2 = updateVisuals;
        int i3 = i2 + 3;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        uST_TRANS_V2_ImportCert.newSession = map;
        if (i4 == 0) {
            int i5 = 9 / 0;
        }
        int i6 = i2 + 61;
        warmup = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    static /* synthetic */ UST_TRANS_ExportCert onWarmupCompleted(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals + 25;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        UST_TRANS_ExportCert uST_TRANS_ExportCert = uST_TRANS_V2_ImportCert.IAuthTabCallback_Parcel;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 21;
        updateVisuals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return uST_TRANS_ExportCert;
    }

    static /* synthetic */ boolean readTypedObject(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = warmup + 121;
        int i3 = i2 % 128;
        updateVisuals = i3;
        int i4 = i2 % 2;
        boolean z = uST_TRANS_V2_ImportCert.readTypedObject;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 123;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static /* synthetic */ boolean writeTypedObject(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int i = 2 % 2;
        int i2 = updateVisuals + 29;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsBinder = uST_TRANS_V2_ImportCert.asBinder();
        int i4 = updateVisuals + 119;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return zAsBinder;
        }
        throw null;
    }

    static {
        ICustomTabsServiceDefault = 1;
        onWarmupCompleted();
        onExtraCallbackWithResult = new char[]{' '};
        IAuthTabCallbackStub = Pattern.compile("\\s");
        HashSet hashSet = new HashSet();
        onNavigationEvent = hashSet;
        hashSet.add('[');
        hashSet.add(']');
        hashSet.add('{');
        hashSet.add('}');
        hashSet.add(',');
        hashSet.add('*');
        hashSet.add('&');
        HashMap map = new HashMap();
        onExtraCallback = map;
        Object[] objArr = new Object[1];
        a((short) (View.getDefaultSize(0, 0) - 47), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (-1757006117) + (ViewConfiguration.getScrollBarFadeDuration() >> 16), 687781434 - KeyEvent.getDeadChar(0, 0), (-79) - ExpandableListView.getPackedPositionChild(0L), objArr);
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
        map.put((char) 8232, "L");
        map.put((char) 8233, "P");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        onWarmupCompleted = linkedHashMap;
        linkedHashMap.put("!", "!");
        linkedHashMap.put("tag:yaml.org,2002:", "!!");
        IAuthTabCallback = Pattern.compile("^![-_\\w]*!$");
        int i = prefetchWithMultipleUrls + 33;
        ICustomTabsServiceDefault = i % 128;
        int i2 = i % 2;
    }

    public UST_TRANS_V2_ImportCert(Writer writer, UST_TRANS_Finalize uST_TRANS_Finalize) {
        if (writer == null) {
            throw new NullPointerException("Writer must be provided.");
        }
        if (uST_TRANS_Finalize == null) {
            throw new NullPointerException("DumperOptions must be provided.");
        }
        this.newSessionWithExtras = writer;
        this.mayLaunchUrl = new getRootCACert<>(100);
        this.ICustomTabsCallback_Parcel = new writeTypedObject(this, null);
        ArrayDeque arrayDeque = new ArrayDeque(100);
        this.writeTypedObject = arrayDeque;
        this.extraCallback = null;
        this.onPostMessage = new getRootCACert<>(10);
        this.ICustomTabsCallback = null;
        this.extraCallbackWithResult = 0;
        this.onMessageChannelReady = false;
        this.ICustomTabsService = false;
        this.IAuthTabCallbackStubProxy = 0;
        this.postMessage = true;
        this.onMinimized = true;
        this.ICustomTabsCallbackDefault = false;
        this.access000 = Boolean.valueOf(uST_TRANS_Finalize.access100());
        this.onUnminimized = Boolean.valueOf(uST_TRANS_Finalize.IAuthTabCallbackStubProxy());
        this.asInterface = uST_TRANS_Finalize.IAuthTabCallbackStub();
        this.IAuthTabCallbackDefault = 2;
        if (uST_TRANS_Finalize.onNavigationEvent() > 1 && uST_TRANS_Finalize.onNavigationEvent() < 10) {
            this.IAuthTabCallbackDefault = uST_TRANS_Finalize.onNavigationEvent();
        }
        this.onActivityResized = uST_TRANS_Finalize.IAuthTabCallback();
        this.readTypedObject = uST_TRANS_Finalize.onExtraCallbackWithResult();
        this.access100 = 80;
        if (uST_TRANS_Finalize.asInterface() > (this.IAuthTabCallbackDefault << 1)) {
            this.access100 = uST_TRANS_Finalize.asInterface();
            int i = warmup + 9;
            updateVisuals = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.onTransact = uST_TRANS_Finalize.onExtraCallback().getString().toCharArray();
        this.isEngagementSignalsApiAvailable = uST_TRANS_Finalize.IAuthTabCallbackDefault();
        this.ICustomTabsCallbackStubProxy = uST_TRANS_Finalize.onTransact();
        this.getInterfaceDescriptor = uST_TRANS_Finalize.IAuthTabCallback_Parcel();
        this.newSession = new LinkedHashMap();
        this.onRelationshipValidationResult = null;
        this.ICustomTabsCallbackStub = null;
        this.asBinder = null;
        this.prefetch = null;
        this.IAuthTabCallback_Parcel = new UST_TRANS_ExportCert(arrayDeque, UST_TRANS_V2_ExportCert.BLANK_LINE, UST_TRANS_V2_ExportCert.BLOCK);
        this.onActivityLayout = new UST_TRANS_ExportCert(arrayDeque, UST_TRANS_V2_ExportCert.IN_LINE);
        int i4 = updateVisuals + 61;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(requestPostMessageChannelWithExtras)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getTouchSlop() >> 8)), 42 - View.combineMeasuredStates(0, 0), 22439 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr2 = setEngagementSignalsCallback;
                if (bArr2 != null) {
                    int i8 = $11 + 67;
                    int i9 = i8 % 128;
                    $10 = i9;
                    if (i8 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    int i10 = i9 + 55;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    for (int i12 = i5; i12 < length; i12++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i12])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (Process.myTid() >> 22)), 54 - MotionEvent.axisFromString(BuildConfig.FLAVOR), 2167 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i13 = $11 + 7;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        byte[] bArr3 = setEngagementSignalsCallback;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(newAuthTabSession)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 43424), 42 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] / (-4629411779493505016L))) % ((int) (requestPostMessageChannelWithExtras ^ (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = setEngagementSignalsCallback;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(newAuthTabSession)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 43424), ((Process.getThreadPriority(0) + 20) >> 6) + 42, 22439 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (requestPostMessageChannelWithExtras ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i4;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (requestPostMessageChannel[i + ((int) (newAuthTabSession ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (requestPostMessageChannelWithExtras ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (newAuthTabSession ^ j)) + i7;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(receiveFile), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 86, (-16767649) - Color.rgb(0, 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = setEngagementSignalsCallback;
                if (bArr5 != null) {
                    int i14 = $11 + 93;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    int i16 = 0;
                    while (i16 < length2) {
                        bArr6[i16] = (byte) (bArr5[i16] ^ (-4629411779493505016L));
                        i16++;
                        int i17 = $10 + 99;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    bArr5 = bArr6;
                }
                boolean z = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i19 = $10 + 61;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    if (z) {
                        byte[] bArr7 = setEngagementSignalsCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = requestPostMessageChannel;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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

    public void IAuthTabCallback(Cert cert) throws IOException {
        int i = 2 % 2;
        int i2 = warmup + 91;
        updateVisuals = i2 % 128;
        if (i2 % 2 == 0) {
            this.writeTypedObject.add(cert);
            while (!readTypedObject()) {
                int i3 = warmup + 73;
                updateVisuals = i3 % 128;
                int i4 = i3 % 2;
                this.extraCallback = this.writeTypedObject.poll();
                this.ICustomTabsCallback_Parcel.onWarmupCompleted();
                this.extraCallback = null;
            }
            int i5 = updateVisuals + 83;
            warmup = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.writeTypedObject.add(cert);
        throw null;
    }

    private boolean readTypedObject() {
        int i = 2 % 2;
        int i2 = warmup + 101;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        if (this.writeTypedObject.isEmpty()) {
            return true;
        }
        Iterator<Cert> it = this.writeTypedObject.iterator();
        Cert next = it.next();
        while (true) {
            Cert cert = next;
            if (!(cert instanceof UST_TRNAS_Password_GenOut)) {
                if (cert instanceof getM_nDeviceOS) {
                    int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    return ((Boolean) onWarmupCompleted(1079577480, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1079577479, new Object[]{this, it, 1}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
                }
                if (cert instanceof getBKMPriKeyCCFBFH) {
                    int i4 = warmup + 15;
                    updateVisuals = i4 % 128;
                    if (i4 % 2 != 0) {
                        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                        return ((Boolean) onWarmupCompleted(1079577480, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, -1079577479, new Object[]{this, it, 5}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
                    }
                    int iOnExtraCallbackWithResult5 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult6 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    return ((Boolean) onWarmupCompleted(1079577480, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, -1079577479, new Object[]{this, it, 2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
                }
                if (cert instanceof getAuthorityKeyIdentifier) {
                    int iOnExtraCallbackWithResult7 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult8 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    return ((Boolean) onWarmupCompleted(1079577480, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult7, iOnExtraCallbackWithResult8, -1079577479, new Object[]{this, it, 3}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
                }
                if (cert instanceof getAuthorityKeyIdentifierInfo) {
                    int iOnExtraCallbackWithResult9 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult10 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    return ((Boolean) onWarmupCompleted(1079577480, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult9, iOnExtraCallbackWithResult10, -1079577479, new Object[]{this, it, 2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
                }
                if ((cert instanceof getBKMCert) || !this.getInterfaceDescriptor) {
                    return false;
                }
                int iOnExtraCallbackWithResult11 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult12 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                return ((Boolean) onWarmupCompleted(1079577480, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult11, iOnExtraCallbackWithResult12, -1079577479, new Object[]{this, it, 1}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
            }
            int i5 = warmup + 43;
            updateVisuals = i5 % 128;
            if (i5 % 2 == 0) {
                if (!it.hasNext()) {
                    return true;
                }
                next = it.next();
            } else {
                it.hasNext();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 0;
        Iterator it = (Iterator) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = warmup + 125;
        updateVisuals = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (it.hasNext()) {
            int i6 = warmup + 121;
            updateVisuals = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = ((Cert) it.next()) instanceof UST_TRNAS_Password_GenOut;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Cert cert = (Cert) it.next();
            if (!(cert instanceof UST_TRNAS_Password_GenOut)) {
                i++;
                if ((cert instanceof getM_nDeviceOS) || (cert instanceof UST_TRNAS_Init_Check)) {
                    i5++;
                } else {
                    int i7 = updateVisuals + 55;
                    warmup = i7 % 128;
                    int i8 = i7 % 2;
                    if ((cert instanceof getM_deviceName) || !(!(cert instanceof getM_deviceUInfo))) {
                        i5--;
                    } else if (cert instanceof getBKMCert) {
                        i5 = -1;
                    }
                }
                if (i5 < 0) {
                    return false;
                }
            }
        }
        return i < iIntValue;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = (UST_TRANS_V2_ImportCert) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = updateVisuals + 81;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        uST_TRANS_V2_ImportCert.onPostMessage.onWarmupCompleted(uST_TRANS_V2_ImportCert.ICustomTabsCallback);
        Integer num = uST_TRANS_V2_ImportCert.ICustomTabsCallback;
        if (num != null) {
            if (!zBooleanValue2) {
                uST_TRANS_V2_ImportCert.ICustomTabsCallback = Integer.valueOf(num.intValue() + uST_TRANS_V2_ImportCert.IAuthTabCallbackDefault);
            }
            int i4 = updateVisuals + 47;
            warmup = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
            }
            return null;
        }
        if (!zBooleanValue) {
            uST_TRANS_V2_ImportCert.ICustomTabsCallback = 0;
            return null;
        }
        int i6 = warmup + 119;
        updateVisuals = i6 % 128;
        int i7 = i6 % 2;
        uST_TRANS_V2_ImportCert.ICustomTabsCallback = Integer.valueOf(uST_TRANS_V2_ImportCert.IAuthTabCallbackDefault);
        return null;
    }

    class writeTypedObject implements UST_TRANS_V2_GenerateCertNum {
        private writeTypedObject() {
        }

        /* synthetic */ writeTypedObject(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws IOException {
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof getAuthorityKeyIdentifierInfo) {
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert, new IAuthTabCallbackDefault(uST_TRANS_V2_ImportCert, null));
            } else {
                throw new UST_TRANS_IsPCconnected("expected StreamStartEvent, but got " + UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this));
            }
        }
    }

    class extraCallback implements UST_TRANS_V2_GenerateCertNum {
        private extraCallback() {
        }

        /* synthetic */ extraCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws IOException {
            throw new UST_TRANS_IsPCconnected("expecting nothing, but got " + UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this));
        }
    }

    class IAuthTabCallbackDefault implements UST_TRANS_V2_GenerateCertNum {
        private IAuthTabCallbackDefault() {
        }

        /* synthetic */ IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws IOException {
            UST_TRANS_V2_ImportCert.this.new asInterface(true).onWarmupCompleted();
        }
    }

    class asInterface implements UST_TRANS_V2_GenerateCertNum {
        private final boolean onExtraCallback;

        public asInterface(boolean z) {
            this.onExtraCallback = z;
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws IOException {
            AnonymousClass3 anonymousClass3 = null;
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof getM_nDeviceOS) {
                getM_nDeviceOS getm_ndeviceos = (getM_nDeviceOS) UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this);
                if ((getm_ndeviceos.onExtraCallbackWithResult() != null || getm_ndeviceos.IAuthTabCallback() != null) && UST_TRANS_V2_ImportCert.extraCallbackWithResult(UST_TRANS_V2_ImportCert.this)) {
                    UST_TRANS_V2_ImportCert.this.onExtraCallback("...", true, false, false);
                    UST_TRANS_V2_ImportCert.this.onExtraCallback();
                }
                if (getm_ndeviceos.onExtraCallbackWithResult() != null) {
                    UST_TRANS_V2_ImportCert.this.onWarmupCompleted((String) UST_TRANS_V2_ImportCert.onWarmupCompleted(1692685689, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1692685680, new Object[]{UST_TRANS_V2_ImportCert.this, getm_ndeviceos.onExtraCallbackWithResult()}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult()));
                }
                UST_TRANS_V2_ImportCert.onWarmupCompleted(UST_TRANS_V2_ImportCert.this, new LinkedHashMap(UST_TRANS_V2_ImportCert.onExtraCallbackWithResult()));
                if (getm_ndeviceos.IAuthTabCallback() != null) {
                    for (String str : new TreeSet(getm_ndeviceos.IAuthTabCallback().keySet())) {
                        String str2 = getm_ndeviceos.IAuthTabCallback().get(str);
                        UST_TRANS_V2_ImportCert.onActivityResized(UST_TRANS_V2_ImportCert.this).put(str2, str);
                        UST_TRANS_V2_ImportCert.this.onExtraCallback(UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this, str), UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, str2));
                    }
                }
                if (!this.onExtraCallback || getm_ndeviceos.onWarmupCompleted() || UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue() || getm_ndeviceos.onExtraCallbackWithResult() != null || ((getm_ndeviceos.IAuthTabCallback() != null && !getm_ndeviceos.IAuthTabCallback().isEmpty()) || UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this))) {
                    UST_TRANS_V2_ImportCert.this.onExtraCallback();
                    UST_TRANS_V2_ImportCert.this.onExtraCallback("---", true, false, false);
                    if (UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue()) {
                        UST_TRANS_V2_ImportCert.this.onExtraCallback();
                    }
                }
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert, new onTransact(uST_TRANS_V2_ImportCert, anonymousClass3));
                return;
            }
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof getBKMCert) {
                UST_TRANS_V2_ImportCert.this.IAuthTabCallback();
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert2, new extraCallback(uST_TRANS_V2_ImportCert2, anonymousClass3));
            } else {
                if (!(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof UST_TRNAS_Password_GenOut)) {
                    throw new UST_TRANS_IsPCconnected("expected DocumentStartEvent, but got " + UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this));
                }
                UST_TRANS_V2_ImportCert.onWarmupCompleted(UST_TRANS_V2_ImportCert.this).onNavigationEvent(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this));
                UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
            }
        }
    }

    class onExtraCallback implements UST_TRANS_V2_GenerateCertNum {
        private onExtraCallback() {
        }

        /* synthetic */ onExtraCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws IOException {
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert, UST_TRANS_V2_ImportCert.onWarmupCompleted(uST_TRANS_V2_ImportCert).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof getM_deviceName) {
                UST_TRANS_V2_ImportCert.this.onExtraCallback();
                if (((getM_deviceName) UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)).IAuthTabCallback()) {
                    UST_TRANS_V2_ImportCert.this.onExtraCallback("...", true, false, false);
                    UST_TRANS_V2_ImportCert.this.onExtraCallback();
                }
                UST_TRANS_V2_ImportCert.this.onNavigationEvent();
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert2, uST_TRANS_V2_ImportCert2.new asInterface(false));
                return;
            }
            throw new UST_TRANS_IsPCconnected("expected DocumentEndEvent, but got " + UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this));
        }
    }

    class onTransact implements UST_TRANS_V2_GenerateCertNum {
        private onTransact() {
        }

        /* synthetic */ onTransact(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert, UST_TRANS_V2_ImportCert.onWarmupCompleted(uST_TRANS_V2_ImportCert).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            AnonymousClass3 anonymousClass3 = null;
            if (!UST_TRANS_V2_ImportCert.onWarmupCompleted(UST_TRANS_V2_ImportCert.this).onExtraCallback()) {
                UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
                if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof getM_deviceName) {
                    new onExtraCallback(UST_TRANS_V2_ImportCert.this, anonymousClass3).onWarmupCompleted();
                    return;
                }
            }
            Object[] objArr = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(new onExtraCallback(UST_TRANS_V2_ImportCert.this, anonymousClass3));
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, true, false, false);
        }
    }

    private void IAuthTabCallback(boolean z, boolean z2, boolean z3) throws Throwable {
        int i = 2 % 2;
        int i2 = updateVisuals + 117;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        this.extraCommand = z;
        this.onMessageChannelReady = z2;
        this.ICustomTabsService = z3;
        Cert cert = this.extraCallback;
        if (cert instanceof UST_TRANS_V2_IsReceiverConnected) {
            IAuthTabCallbackStubProxy();
            return;
        }
        Object obj = null;
        if (!(cert instanceof getBKMPriKeyCCFBPH)) {
            int i5 = i3 + 71;
            updateVisuals = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z4 = cert instanceof UST_TRNAS_Init_Check;
                obj.hashCode();
                throw null;
            }
            if (!(cert instanceof UST_TRNAS_Init_Check)) {
                throw new UST_TRANS_IsPCconnected("expected NodeEvent, but got " + this.extraCallback);
            }
        }
        asInterface("&");
        onWarmupCompleted(-314589963, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 314589963, new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        Cert cert2 = this.extraCallback;
        if (cert2 instanceof getBKMPriKeyCCFBPH) {
            int i6 = warmup + 47;
            updateVisuals = i6 % 128;
            if (i6 % 2 == 0) {
                ICustomTabsCallback();
                return;
            } else {
                ICustomTabsCallback();
                obj.hashCode();
                throw null;
            }
        }
        if (cert2 instanceof getBKMPriKeyCCFBFH) {
            if (this.extraCallbackWithResult == 0 && !this.access000.booleanValue() && !((getBKMPriKeyCCFBFH) this.extraCallback).onExtraCallbackWithResult()) {
                if (!((Boolean) onWarmupCompleted(-1577719790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1577719797, new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue()) {
                    onWarmupCompleted(-542426883, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 542426885, new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                    return;
                }
            }
            access100();
            return;
        }
        if (this.extraCallbackWithResult == 0 && !this.access000.booleanValue()) {
            int i7 = updateVisuals + 53;
            warmup = i7 % 128;
            if (i7 % 2 == 0) {
                ((getAuthorityKeyIdentifier) this.extraCallback).onExtraCallbackWithResult();
                throw null;
            }
            if (!((getAuthorityKeyIdentifier) this.extraCallback).onExtraCallbackWithResult() && !IAuthTabCallbackDefault()) {
                int i8 = updateVisuals + 115;
                warmup = i8 % 128;
                int i9 = i8 % 2;
                onWarmupCompleted(-726273208, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 726273211, new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                return;
            }
        }
        access000();
    }

    private void IAuthTabCallbackStubProxy() throws IOException {
        int i = 2 % 2;
        int i2 = updateVisuals + 3;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(this.extraCallback instanceof UST_TRANS_V2_IsReceiverConnected)) {
                throw new UST_TRANS_IsPCconnected("Alias must be provided");
            }
            asInterface("*");
            this.ICustomTabsCallback_Parcel = this.mayLaunchUrl.onWarmupCompleted();
            int i3 = updateVisuals + 87;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        boolean z = this.extraCallback instanceof UST_TRANS_V2_IsReceiverConnected;
        throw null;
    }

    private void ICustomTabsCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = updateVisuals + 13;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(526611505, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -526611501, new Object[]{this, true, false}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        writeTypedObject();
        this.ICustomTabsCallback = this.onPostMessage.onWarmupCompleted();
        this.ICustomTabsCallback_Parcel = this.mayLaunchUrl.onWarmupCompleted();
        int i4 = updateVisuals + 43;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }

    private void access100() throws IOException {
        int i = 2 % 2;
        int i2 = updateVisuals + 123;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback("[", true, true, false);
        this.extraCallbackWithResult++;
        onWarmupCompleted(526611505, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -526611501, new Object[]{this, true, false}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        if (this.onUnminimized.booleanValue()) {
            int i4 = warmup + 15;
            updateVisuals = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallback();
        }
        this.ICustomTabsCallback_Parcel = new IAuthTabCallbackStubProxy(this, null);
    }

    class IAuthTabCallbackStubProxy implements UST_TRANS_V2_GenerateCertNum {
        private IAuthTabCallbackStubProxy() {
        }

        /* synthetic */ IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof getBKMPriKey) {
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert, (Integer) UST_TRANS_V2_ImportCert.onTransact(uST_TRANS_V2_ImportCert).onWarmupCompleted());
                UST_TRANS_V2_ImportCert.asInterface(UST_TRANS_V2_ImportCert.this);
                UST_TRANS_V2_ImportCert.this.onExtraCallback("]", false, false, false);
                UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert.this).onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = UST_TRANS_V2_ImportCert.this;
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert2, (UST_TRANS_V2_GenerateCertNum) ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1120310653, new Object[]{uST_TRANS_V2_ImportCert2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted());
                return;
            }
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof UST_TRNAS_Password_GenOut) {
                UST_TRANS_V2_ImportCert.onWarmupCompleted(UST_TRANS_V2_ImportCert.this).onNavigationEvent(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this));
                UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
                return;
            }
            if (UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue() || ((UST_TRANS_V2_ImportCert.getInterfaceDescriptor(UST_TRANS_V2_ImportCert.this) > UST_TRANS_V2_ImportCert.access000(UST_TRANS_V2_ImportCert.this) && UST_TRANS_V2_ImportCert.access100(UST_TRANS_V2_ImportCert.this)) || UST_TRANS_V2_ImportCert.IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert.this).booleanValue())) {
                UST_TRANS_V2_ImportCert.this.onExtraCallback();
            }
            Object[] objArr = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(new readTypedObject(UST_TRANS_V2_ImportCert.this, null));
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, false, false);
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert3 = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert3, UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(uST_TRANS_V2_ImportCert3).onNavigationEvent(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
        }
    }

    class readTypedObject implements UST_TRANS_V2_GenerateCertNum {
        private readTypedObject() {
        }

        /* synthetic */ readTypedObject(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof getBKMPriKey) {
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert, (Integer) UST_TRANS_V2_ImportCert.onTransact(uST_TRANS_V2_ImportCert).onWarmupCompleted());
                UST_TRANS_V2_ImportCert.asInterface(UST_TRANS_V2_ImportCert.this);
                if (UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue()) {
                    UST_TRANS_V2_ImportCert.this.onExtraCallback(",", false, false, false);
                    UST_TRANS_V2_ImportCert.this.onExtraCallback();
                } else if (UST_TRANS_V2_ImportCert.IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert.this).booleanValue()) {
                    UST_TRANS_V2_ImportCert.this.onExtraCallback();
                }
                UST_TRANS_V2_ImportCert.this.onExtraCallback("]", false, false, false);
                UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert.this).onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
                if (UST_TRANS_V2_ImportCert.IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert.this).booleanValue()) {
                    UST_TRANS_V2_ImportCert.this.onExtraCallback();
                }
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = UST_TRANS_V2_ImportCert.this;
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert2, (UST_TRANS_V2_GenerateCertNum) ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1120310653, new Object[]{uST_TRANS_V2_ImportCert2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted());
                return;
            }
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof UST_TRNAS_Password_GenOut) {
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert3 = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert3, UST_TRANS_V2_ImportCert.onWarmupCompleted(uST_TRANS_V2_ImportCert3).onNavigationEvent(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
                return;
            }
            UST_TRANS_V2_ImportCert.this.onExtraCallback(",", false, false, false);
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
            if (UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue() || ((UST_TRANS_V2_ImportCert.getInterfaceDescriptor(UST_TRANS_V2_ImportCert.this) > UST_TRANS_V2_ImportCert.access000(UST_TRANS_V2_ImportCert.this) && UST_TRANS_V2_ImportCert.access100(UST_TRANS_V2_ImportCert.this)) || UST_TRANS_V2_ImportCert.IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert.this).booleanValue())) {
                UST_TRANS_V2_ImportCert.this.onExtraCallback();
            }
            Object[] objArr = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(UST_TRANS_V2_ImportCert.this.new readTypedObject());
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, false, false);
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert4 = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert4, UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(uST_TRANS_V2_ImportCert4).onNavigationEvent(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void access000() throws IOException {
        int i = 2 % 2;
        int i2 = warmup + 23;
        updateVisuals = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback("{", false, false, true);
            this.extraCallbackWithResult >>>= 1;
            onWarmupCompleted(526611505, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -526611501, new Object[]{this, true, false}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            if (this.onUnminimized.booleanValue()) {
                onExtraCallback();
            }
        } else {
            onExtraCallback("{", true, true, false);
            this.extraCallbackWithResult++;
            onWarmupCompleted(526611505, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -526611501, new Object[]{this, true, false}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            if (this.onUnminimized.booleanValue()) {
            }
        }
        AnonymousClass3 anonymousClass3 = null;
        this.ICustomTabsCallback_Parcel = new access100(this, anonymousClass3);
        int i3 = updateVisuals + 5;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        anonymousClass3.hashCode();
        throw null;
    }

    class access100 implements UST_TRANS_V2_GenerateCertNum {
        private access100() {
        }

        /* synthetic */ access100(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert, UST_TRANS_V2_ImportCert.onWarmupCompleted(uST_TRANS_V2_ImportCert).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof finalizeCert) {
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert2, (Integer) UST_TRANS_V2_ImportCert.onTransact(uST_TRANS_V2_ImportCert2).onWarmupCompleted());
                UST_TRANS_V2_ImportCert.asInterface(UST_TRANS_V2_ImportCert.this);
                UST_TRANS_V2_ImportCert.this.onExtraCallback("}", false, false, false);
                UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert.this).onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert3 = UST_TRANS_V2_ImportCert.this;
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert3, (UST_TRANS_V2_GenerateCertNum) ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1120310653, new Object[]{uST_TRANS_V2_ImportCert3}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted());
                return;
            }
            if (UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue() || ((UST_TRANS_V2_ImportCert.getInterfaceDescriptor(UST_TRANS_V2_ImportCert.this) > UST_TRANS_V2_ImportCert.access000(UST_TRANS_V2_ImportCert.this) && UST_TRANS_V2_ImportCert.access100(UST_TRANS_V2_ImportCert.this)) || UST_TRANS_V2_ImportCert.IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert.this).booleanValue())) {
                UST_TRANS_V2_ImportCert.this.onExtraCallback();
            }
            AnonymousClass3 anonymousClass3 = null;
            if (!UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue() && UST_TRANS_V2_ImportCert.writeTypedObject(UST_TRANS_V2_ImportCert.this)) {
                Object[] objArr = {UST_TRANS_V2_ImportCert.this};
                ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(new getInterfaceDescriptor(UST_TRANS_V2_ImportCert.this, anonymousClass3));
                UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, true, true);
                return;
            }
            UST_TRANS_V2_ImportCert.this.onExtraCallback("?", true, false, false);
            Object[] objArr2 = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(new IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert.this, anonymousClass3));
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, true, false);
        }
    }

    class access000 implements UST_TRANS_V2_GenerateCertNum {
        private access000() {
        }

        /* synthetic */ access000(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof finalizeCert) {
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert, (Integer) UST_TRANS_V2_ImportCert.onTransact(uST_TRANS_V2_ImportCert).onWarmupCompleted());
                UST_TRANS_V2_ImportCert.asInterface(UST_TRANS_V2_ImportCert.this);
                if (UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue()) {
                    UST_TRANS_V2_ImportCert.this.onExtraCallback(",", false, false, false);
                    UST_TRANS_V2_ImportCert.this.onExtraCallback();
                }
                if (UST_TRANS_V2_ImportCert.IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert.this).booleanValue()) {
                    UST_TRANS_V2_ImportCert.this.onExtraCallback();
                }
                UST_TRANS_V2_ImportCert.this.onExtraCallback("}", false, false, false);
                UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert.this).onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = UST_TRANS_V2_ImportCert.this;
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert2, (UST_TRANS_V2_GenerateCertNum) ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1120310653, new Object[]{uST_TRANS_V2_ImportCert2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted());
                return;
            }
            UST_TRANS_V2_ImportCert.this.onExtraCallback(",", false, false, false);
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert3 = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert3, UST_TRANS_V2_ImportCert.onWarmupCompleted(uST_TRANS_V2_ImportCert3).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
            if (UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue() || ((UST_TRANS_V2_ImportCert.getInterfaceDescriptor(UST_TRANS_V2_ImportCert.this) > UST_TRANS_V2_ImportCert.access000(UST_TRANS_V2_ImportCert.this) && UST_TRANS_V2_ImportCert.access100(UST_TRANS_V2_ImportCert.this)) || UST_TRANS_V2_ImportCert.IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert.this).booleanValue())) {
                UST_TRANS_V2_ImportCert.this.onExtraCallback();
            }
            AnonymousClass3 anonymousClass3 = null;
            if (!UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue() && UST_TRANS_V2_ImportCert.writeTypedObject(UST_TRANS_V2_ImportCert.this)) {
                Object[] objArr = {UST_TRANS_V2_ImportCert.this};
                ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(new getInterfaceDescriptor(UST_TRANS_V2_ImportCert.this, anonymousClass3));
                UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, true, true);
                return;
            }
            UST_TRANS_V2_ImportCert.this.onExtraCallback("?", true, false, false);
            Object[] objArr2 = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(new IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert.this, anonymousClass3));
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, true, false);
        }
    }

    class getInterfaceDescriptor implements UST_TRANS_V2_GenerateCertNum {
        private getInterfaceDescriptor() {
        }

        /* synthetic */ getInterfaceDescriptor(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            UST_TRANS_V2_ImportCert.this.onExtraCallback(":", false, false, false);
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert, UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(uST_TRANS_V2_ImportCert).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
            Object[] objArr = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(new access000(UST_TRANS_V2_ImportCert.this, null));
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, true, false);
            UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert.this).onNavigationEvent(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this));
            UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
        }
    }

    class IAuthTabCallback_Parcel implements UST_TRANS_V2_GenerateCertNum {
        private IAuthTabCallback_Parcel() {
        }

        /* synthetic */ IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            if (UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this).booleanValue() || UST_TRANS_V2_ImportCert.getInterfaceDescriptor(UST_TRANS_V2_ImportCert.this) > UST_TRANS_V2_ImportCert.access000(UST_TRANS_V2_ImportCert.this) || UST_TRANS_V2_ImportCert.IAuthTabCallback_Parcel(UST_TRANS_V2_ImportCert.this).booleanValue()) {
                UST_TRANS_V2_ImportCert.this.onExtraCallback();
            }
            UST_TRANS_V2_ImportCert.this.onExtraCallback(":", true, false, false);
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert, UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(uST_TRANS_V2_ImportCert).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
            Object[] objArr = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(new access000(UST_TRANS_V2_ImportCert.this, null));
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, true, false);
            UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert.this).onNavigationEvent(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this));
            UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z;
        UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = (UST_TRANS_V2_ImportCert) objArr[0];
        int i = 2 % 2;
        AnonymousClass3 anonymousClass3 = null;
        if (uST_TRANS_V2_ImportCert.onMessageChannelReady) {
            int i2 = updateVisuals;
            int i3 = i2 + 125;
            warmup = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z2 = uST_TRANS_V2_ImportCert.onMinimized;
                anonymousClass3.hashCode();
                throw null;
            }
            if (uST_TRANS_V2_ImportCert.onMinimized) {
                z = false;
            } else {
                int i4 = i2 + 9;
                warmup = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
        }
        onWarmupCompleted(526611505, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -526611501, new Object[]{uST_TRANS_V2_ImportCert, false, Boolean.valueOf(z)}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        uST_TRANS_V2_ImportCert.ICustomTabsCallback_Parcel = new IAuthTabCallbackStub(uST_TRANS_V2_ImportCert, anonymousClass3);
        return null;
    }

    class IAuthTabCallbackStub implements UST_TRANS_V2_GenerateCertNum {
        private IAuthTabCallbackStub() {
        }

        /* synthetic */ IAuthTabCallbackStub(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            UST_TRANS_V2_ImportCert.this.new onWarmupCompleted(true).onWarmupCompleted();
        }
    }

    class onWarmupCompleted implements UST_TRANS_V2_GenerateCertNum {
        private final boolean onExtraCallback;

        public onWarmupCompleted(boolean z) {
            this.onExtraCallback = z;
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            if (!this.onExtraCallback && (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof getBKMPriKey)) {
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert, (Integer) UST_TRANS_V2_ImportCert.onTransact(uST_TRANS_V2_ImportCert).onWarmupCompleted());
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = UST_TRANS_V2_ImportCert.this;
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert2, (UST_TRANS_V2_GenerateCertNum) ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1120310653, new Object[]{uST_TRANS_V2_ImportCert2}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted());
                return;
            }
            if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof UST_TRNAS_Password_GenOut) {
                UST_TRANS_V2_ImportCert.onWarmupCompleted(UST_TRANS_V2_ImportCert.this).onNavigationEvent(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this));
                return;
            }
            UST_TRANS_V2_ImportCert.this.onExtraCallback();
            if (!UST_TRANS_V2_ImportCert.readTypedObject(UST_TRANS_V2_ImportCert.this) || this.onExtraCallback) {
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert3 = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert3, UST_TRANS_V2_ImportCert.extraCallback(uST_TRANS_V2_ImportCert3));
            }
            UST_TRANS_V2_ImportCert.this.onExtraCallback("-", true, false, true);
            if (UST_TRANS_V2_ImportCert.readTypedObject(UST_TRANS_V2_ImportCert.this) && this.onExtraCallback) {
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert4 = UST_TRANS_V2_ImportCert.this;
                int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert4, Integer.valueOf(((Integer) UST_TRANS_V2_ImportCert.onWarmupCompleted(-2047228073, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, 2047228081, new Object[]{uST_TRANS_V2_ImportCert4}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).intValue() + UST_TRANS_V2_ImportCert.extraCallback(UST_TRANS_V2_ImportCert.this)));
            }
            if (!UST_TRANS_V2_ImportCert.onWarmupCompleted(UST_TRANS_V2_ImportCert.this).onExtraCallback()) {
                UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this, false, false);
                UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
                if (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof getBKMPriKeyCCFBPH) {
                    UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert5 = UST_TRANS_V2_ImportCert.this;
                    UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert5, UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert5, ((getBKMPriKeyCCFBPH) UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert5)).asInterface()));
                    if (!UST_TRANS_V2_ImportCert.ICustomTabsCallback(UST_TRANS_V2_ImportCert.this).asInterface()) {
                        UST_TRANS_V2_ImportCert.this.onExtraCallback();
                    }
                }
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert6 = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert6, (Integer) UST_TRANS_V2_ImportCert.onTransact(uST_TRANS_V2_ImportCert6).onWarmupCompleted());
            }
            Object[] objArr = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(UST_TRANS_V2_ImportCert.this.new onWarmupCompleted(false));
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, false, false);
            UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert.this).onExtraCallbackWithResult();
            UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
        }
    }

    class asBinder implements UST_TRANS_V2_GenerateCertNum {
        private asBinder() {
        }

        /* synthetic */ asBinder(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            UST_TRANS_V2_ImportCert.this.new IAuthTabCallback(true).onWarmupCompleted();
        }
    }

    class IAuthTabCallback implements UST_TRANS_V2_GenerateCertNum {
        private final boolean onNavigationEvent;

        public IAuthTabCallback(boolean z) {
            this.onNavigationEvent = z;
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert, UST_TRANS_V2_ImportCert.onWarmupCompleted(uST_TRANS_V2_ImportCert).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
            if (!this.onNavigationEvent && (UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this) instanceof finalizeCert)) {
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert2, (Integer) UST_TRANS_V2_ImportCert.onTransact(uST_TRANS_V2_ImportCert2).onWarmupCompleted());
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert3 = UST_TRANS_V2_ImportCert.this;
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert3, (UST_TRANS_V2_GenerateCertNum) ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1120310653, new Object[]{uST_TRANS_V2_ImportCert3}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted());
                return;
            }
            UST_TRANS_V2_ImportCert.this.onExtraCallback();
            AnonymousClass3 anonymousClass3 = null;
            if (UST_TRANS_V2_ImportCert.writeTypedObject(UST_TRANS_V2_ImportCert.this)) {
                Object[] objArr = {UST_TRANS_V2_ImportCert.this};
                ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(new onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this, anonymousClass3));
                UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, true, true);
                return;
            }
            UST_TRANS_V2_ImportCert.this.onExtraCallback("?", true, false, true);
            Object[] objArr2 = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(new onNavigationEvent(UST_TRANS_V2_ImportCert.this, anonymousClass3));
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, true, false);
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Cert cert = (Cert) objArr[1];
        int i = 2 % 2;
        if (!cert.onExtraCallback(Cert.onNavigationEvent.Scalar)) {
            int i2 = updateVisuals + 99;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        UST_TRANS_Finalize.onExtraCallback onextracallbackIAuthTabCallback = ((getBKMPriKeyCCFBPH) cert).IAuthTabCallback();
        if (onextracallbackIAuthTabCallback == UST_TRANS_Finalize.onExtraCallback.FOLDED || onextracallbackIAuthTabCallback == UST_TRANS_Finalize.onExtraCallback.LITERAL) {
            int i4 = updateVisuals + 61;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = warmup + 47;
        updateVisuals = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    class onExtraCallbackWithResult implements UST_TRANS_V2_GenerateCertNum {
        private onExtraCallbackWithResult() {
        }

        /* synthetic */ onExtraCallbackWithResult(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            UST_TRANS_V2_ImportCert.this.onExtraCallback(":", false, false, false);
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert, UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(uST_TRANS_V2_ImportCert).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = UST_TRANS_V2_ImportCert.this;
            if (!UST_TRANS_V2_ImportCert.IAuthTabCallback(uST_TRANS_V2_ImportCert2, UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert2)) && UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this)) {
                UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this, true, false);
                UST_TRANS_V2_ImportCert.this.onExtraCallback();
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert3 = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert3, (Integer) UST_TRANS_V2_ImportCert.onTransact(uST_TRANS_V2_ImportCert3).onWarmupCompleted());
            }
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert4 = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert4, UST_TRANS_V2_ImportCert.onWarmupCompleted(uST_TRANS_V2_ImportCert4).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            if (!UST_TRANS_V2_ImportCert.onWarmupCompleted(UST_TRANS_V2_ImportCert.this).onExtraCallback()) {
                UST_TRANS_V2_ImportCert.IAuthTabCallback(UST_TRANS_V2_ImportCert.this, true, false);
                UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
                UST_TRANS_V2_ImportCert.this.onExtraCallback();
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert5 = UST_TRANS_V2_ImportCert.this;
                UST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert5, (Integer) UST_TRANS_V2_ImportCert.onTransact(uST_TRANS_V2_ImportCert5).onWarmupCompleted());
            }
            Object[] objArr = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(UST_TRANS_V2_ImportCert.this.new IAuthTabCallback(false));
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, true, false);
            UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert.this).onExtraCallbackWithResult();
            UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
        }
    }

    class onNavigationEvent implements UST_TRANS_V2_GenerateCertNum {
        private onNavigationEvent() {
        }

        /* synthetic */ onNavigationEvent(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, AnonymousClass3 anonymousClass3) {
            this();
        }

        @Override // o.UST_TRANS_V2_GenerateCertNum
        public void onWarmupCompleted() throws Throwable {
            UST_TRANS_V2_ImportCert.this.onExtraCallback();
            UST_TRANS_V2_ImportCert.this.onExtraCallback(":", true, false, true);
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert, UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(uST_TRANS_V2_ImportCert).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
            UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = UST_TRANS_V2_ImportCert.this;
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(uST_TRANS_V2_ImportCert2, UST_TRANS_V2_ImportCert.onWarmupCompleted(uST_TRANS_V2_ImportCert2).onWarmupCompleted(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this)));
            UST_TRANS_V2_ImportCert.onExtraCallbackWithResult(UST_TRANS_V2_ImportCert.this);
            Object[] objArr = {UST_TRANS_V2_ImportCert.this};
            ((getRootCACert) UST_TRANS_V2_ImportCert.onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1120310653, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted(UST_TRANS_V2_ImportCert.this.new IAuthTabCallback(false));
            UST_TRANS_V2_ImportCert.onNavigationEvent(UST_TRANS_V2_ImportCert.this, false, true, false);
            UST_TRANS_V2_ImportCert.IAuthTabCallbackDefault(UST_TRANS_V2_ImportCert.this).onNavigationEvent(UST_TRANS_V2_ImportCert.onExtraCallback(UST_TRANS_V2_ImportCert.this));
            UST_TRANS_V2_ImportCert.IAuthTabCallbackStubProxy(UST_TRANS_V2_ImportCert.this);
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = (UST_TRANS_V2_ImportCert) objArr[0];
        int i = 2 % 2;
        int i2 = updateVisuals + 43;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = uST_TRANS_V2_ImportCert.extraCallback instanceof getBKMPriKeyCCFBFH;
            obj.hashCode();
            throw null;
        }
        if ((uST_TRANS_V2_ImportCert.extraCallback instanceof getBKMPriKeyCCFBFH) && !uST_TRANS_V2_ImportCert.writeTypedObject.isEmpty()) {
            int i3 = warmup + 79;
            updateVisuals = i3 % 128;
            int i4 = i3 % 2;
            if (uST_TRANS_V2_ImportCert.writeTypedObject.peek() instanceof getBKMPriKey) {
                int i5 = updateVisuals + 67;
                warmup = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        int i7 = warmup + 11;
        updateVisuals = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = updateVisuals + 53;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
            if (this.extraCallback instanceof getAuthorityKeyIdentifier) {
                if (!this.writeTypedObject.isEmpty() && (this.writeTypedObject.peek() instanceof finalizeCert)) {
                    return true;
                }
            }
        } else if (this.extraCallback instanceof getAuthorityKeyIdentifier) {
        }
        int i4 = warmup + 61;
        updateVisuals = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = (UST_TRANS_V2_ImportCert) objArr[0];
        int i = 2 % 2;
        if ((uST_TRANS_V2_ImportCert.extraCallback instanceof getM_nDeviceOS) && (!uST_TRANS_V2_ImportCert.writeTypedObject.isEmpty())) {
            int i2 = updateVisuals + 95;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            Cert certPeek = uST_TRANS_V2_ImportCert.writeTypedObject.peek();
            if (certPeek instanceof getBKMPriKeyCCFBPH) {
                getBKMPriKeyCCFBPH getbkmprikeyccfbph = (getBKMPriKeyCCFBPH) certPeek;
                if (getbkmprikeyccfbph.onTransact() == null) {
                    int i4 = warmup + 53;
                    updateVisuals = i4 % 128;
                    if (i4 % 2 != 0) {
                        getbkmprikeyccfbph.onWarmupCompleted();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (getbkmprikeyccfbph.onWarmupCompleted() == null && getbkmprikeyccfbph.onExtraCallbackWithResult() != null) {
                        int i5 = warmup + 59;
                        updateVisuals = i5 % 128;
                        int i6 = i5 % 2;
                        if (getbkmprikeyccfbph.asInterface().isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x013e, code lost:
    
        if (IAuthTabCallbackDefault() != true) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 o.Cert) = (r1v4 o.Cert), (r1v49 o.Cert) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean asBinder() {
        Cert cert;
        int length;
        int i = 2 % 2;
        int i2 = warmup + 75;
        updateVisuals = i2 % 128;
        if (i2 % 2 != 0) {
            cert = this.extraCallback;
            int i3 = 63 / 0;
            if (cert instanceof getAuthorityInformationAccess) {
                if (((getAuthorityInformationAccess) cert).onTransact() != null) {
                    int i4 = updateVisuals + 125;
                    warmup = i4 % 128;
                    int i5 = i4 % 2;
                    if (this.onRelationshipValidationResult == null) {
                        this.onRelationshipValidationResult = IAuthTabCallback(((getAuthorityInformationAccess) this.extraCallback).onTransact());
                    }
                    length = this.onRelationshipValidationResult.length();
                } else {
                    int i6 = warmup + 75;
                    updateVisuals = i6 % 128;
                    int i7 = i6 % 2;
                    length = 0;
                }
            }
        } else {
            cert = this.extraCallback;
            if (cert instanceof getAuthorityInformationAccess) {
            }
        }
        Cert cert2 = this.extraCallback;
        String strOnWarmupCompleted = cert2 instanceof getBKMPriKeyCCFBPH ? ((getBKMPriKeyCCFBPH) cert2).onWarmupCompleted() : cert2 instanceof UST_TRNAS_Init_Check ? ((UST_TRNAS_Init_Check) cert2).IAuthTabCallback() : null;
        if (strOnWarmupCompleted != null) {
            if (this.ICustomTabsCallbackStub == null) {
                this.ICustomTabsCallbackStub = (String) onWarmupCompleted(1937112152, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1937112146, new Object[]{this, strOnWarmupCompleted}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            }
            length += this.ICustomTabsCallbackStub.length();
        }
        Cert cert3 = this.extraCallback;
        if (cert3 instanceof getBKMPriKeyCCFBPH) {
            if (this.asBinder == null) {
                this.asBinder = (UST_TRANS_VeriSign_ImportCert) onWarmupCompleted(1470931322, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1470931317, new Object[]{this, ((getBKMPriKeyCCFBPH) cert3).asInterface()}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            }
            length += this.asBinder.onExtraCallbackWithResult().length();
        }
        if (length < this.ICustomTabsCallbackStubProxy) {
            int i8 = warmup + 15;
            updateVisuals = i8 % 128;
            int i9 = i8 % 2;
            Cert cert4 = this.extraCallback;
            if (!(cert4 instanceof UST_TRANS_V2_IsReceiverConnected)) {
                if ((cert4 instanceof getBKMPriKeyCCFBPH) && !this.asBinder.asInterface()) {
                    int i10 = updateVisuals + 67;
                    warmup = i10 % 128;
                    int i11 = i10 % 2;
                    if (this.asBinder.IAuthTabCallbackDefault()) {
                    }
                }
                if (!((Boolean) onWarmupCompleted(-1577719790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1577719797, new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue()) {
                    int i12 = updateVisuals + 49;
                    warmup = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            return true;
        }
        int i14 = warmup + 57;
        updateVisuals = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    private void asInterface(String str) throws IOException {
        int i = 2 % 2;
        int i2 = updateVisuals + 123;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getAuthorityInformationAccess getauthorityinformationaccess = (getAuthorityInformationAccess) this.extraCallback;
            if (getauthorityinformationaccess.onTransact() != null) {
                if (this.onRelationshipValidationResult == null) {
                    this.onRelationshipValidationResult = IAuthTabCallback(getauthorityinformationaccess.onTransact());
                    int i3 = warmup + 17;
                    updateVisuals = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 4 / 2;
                    }
                }
                onExtraCallback(str + this.onRelationshipValidationResult, true, false, false);
                this.onRelationshipValidationResult = null;
                return;
            }
            int i5 = updateVisuals + 31;
            warmup = i5 % 128;
            if (i5 % 2 != 0) {
                this.onRelationshipValidationResult = null;
                return;
            } else {
                this.onRelationshipValidationResult = null;
                int i6 = 57 / 0;
                return;
            }
        }
        ((getAuthorityInformationAccess) this.extraCallback).onTransact();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws IOException {
        String strIAuthTabCallback;
        UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = (UST_TRANS_V2_ImportCert) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 25;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        Cert cert = uST_TRANS_V2_ImportCert.extraCallback;
        if (cert instanceof getBKMPriKeyCCFBPH) {
            getBKMPriKeyCCFBPH getbkmprikeyccfbph = (getBKMPriKeyCCFBPH) cert;
            strIAuthTabCallback = getbkmprikeyccfbph.onWarmupCompleted();
            if (uST_TRANS_V2_ImportCert.prefetch == null) {
                int i4 = updateVisuals + 117;
                warmup = i4 % 128;
                int i5 = i4 % 2;
                uST_TRANS_V2_ImportCert.prefetch = uST_TRANS_V2_ImportCert.IAuthTabCallbackStub();
            }
            if (!uST_TRANS_V2_ImportCert.access000.booleanValue() || strIAuthTabCallback == null) {
                UST_TRANS_Finalize.onExtraCallback onextracallback = uST_TRANS_V2_ImportCert.prefetch;
                UST_TRANS_Finalize.onExtraCallback onextracallback2 = UST_TRANS_Finalize.onExtraCallback.PLAIN;
                if ((onextracallback == onextracallback2 && getbkmprikeyccfbph.onExtraCallbackWithResult().onNavigationEvent()) || (uST_TRANS_V2_ImportCert.prefetch != onextracallback2 && getbkmprikeyccfbph.onExtraCallbackWithResult().IAuthTabCallback())) {
                    uST_TRANS_V2_ImportCert.ICustomTabsCallbackStub = null;
                    return null;
                }
            }
            if (getbkmprikeyccfbph.onExtraCallbackWithResult().onNavigationEvent() && strIAuthTabCallback == null) {
                uST_TRANS_V2_ImportCert.ICustomTabsCallbackStub = null;
                strIAuthTabCallback = "!";
            }
        } else {
            UST_TRNAS_Init_Check uST_TRNAS_Init_Check = (UST_TRNAS_Init_Check) cert;
            strIAuthTabCallback = uST_TRNAS_Init_Check.IAuthTabCallback();
            if ((!uST_TRANS_V2_ImportCert.access000.booleanValue() || strIAuthTabCallback == null) && uST_TRNAS_Init_Check.onWarmupCompleted()) {
                uST_TRANS_V2_ImportCert.ICustomTabsCallbackStub = null;
                return null;
            }
        }
        if (strIAuthTabCallback == null) {
            throw new UST_TRANS_IsPCconnected("tag is not specified");
        }
        if (uST_TRANS_V2_ImportCert.ICustomTabsCallbackStub == null) {
            int i6 = updateVisuals + 59;
            warmup = i6 % 128;
            if (i6 % 2 == 0) {
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                uST_TRANS_V2_ImportCert.ICustomTabsCallbackStub = (String) onWarmupCompleted(1937112152, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1937112146, new Object[]{uST_TRANS_V2_ImportCert, strIAuthTabCallback}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                int i7 = 16 / 0;
            } else {
                int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                uST_TRANS_V2_ImportCert.ICustomTabsCallbackStub = (String) onWarmupCompleted(1937112152, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, -1937112146, new Object[]{uST_TRANS_V2_ImportCert, strIAuthTabCallback}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            }
        }
        uST_TRANS_V2_ImportCert.onExtraCallback(uST_TRANS_V2_ImportCert.ICustomTabsCallbackStub, true, false, false);
        uST_TRANS_V2_ImportCert.ICustomTabsCallbackStub = null;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (r10.asBinder.onNavigationEvent() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0131, code lost:
    
        if (r10.asBinder.IAuthTabCallbackDefault() == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private UST_TRANS_Finalize.onExtraCallback IAuthTabCallbackStub() {
        int i = 2 % 2;
        getBKMPriKeyCCFBPH getbkmprikeyccfbph = (getBKMPriKeyCCFBPH) this.extraCallback;
        if (this.asBinder == null) {
            this.asBinder = (UST_TRANS_VeriSign_ImportCert) onWarmupCompleted(1470931322, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1470931317, new Object[]{this, getbkmprikeyccfbph.asInterface()}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }
        if (!getbkmprikeyccfbph.IAuthTabCallback_Parcel()) {
            int i2 = updateVisuals + 101;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            if (!getbkmprikeyccfbph.asBinder()) {
                if (!this.access000.booleanValue()) {
                    if (getbkmprikeyccfbph.access000() && getBSignPriKeyCCFBFH.access000.onWarmupCompleted().equals(getbkmprikeyccfbph.onWarmupCompleted())) {
                        return UST_TRANS_Finalize.onExtraCallback.DOUBLE_QUOTED;
                    }
                    if ((getbkmprikeyccfbph.IAuthTabCallback_Parcel() || getbkmprikeyccfbph.access000()) && getbkmprikeyccfbph.onExtraCallbackWithResult().onNavigationEvent()) {
                        int i4 = warmup + 69;
                        int i5 = i4 % 128;
                        updateVisuals = i5;
                        int i6 = i4 % 2;
                        if (this.ICustomTabsService) {
                            int i7 = i5 + 97;
                            warmup = i7 % 128;
                            int i8 = i7 % 2;
                            if (!this.asBinder.asInterface() && !this.asBinder.IAuthTabCallbackDefault()) {
                                if (this.extraCallbackWithResult == 0 || !this.asBinder.onExtraCallback()) {
                                    if (this.extraCallbackWithResult == 0) {
                                        int i9 = warmup + 65;
                                        updateVisuals = i9 % 128;
                                        int i10 = i9 % 2;
                                    }
                                }
                                return UST_TRANS_Finalize.onExtraCallback.PLAIN;
                            }
                        }
                    }
                    if (!getbkmprikeyccfbph.IAuthTabCallbackStubProxy()) {
                        int i11 = updateVisuals + 13;
                        warmup = i11 % 128;
                        int i12 = i11 % 2;
                        if (getbkmprikeyccfbph.getInterfaceDescriptor()) {
                            if (this.extraCallbackWithResult == 0 && !this.ICustomTabsService && this.asBinder.IAuthTabCallback()) {
                                return getbkmprikeyccfbph.IAuthTabCallback();
                            }
                        }
                    }
                    if (!getbkmprikeyccfbph.IAuthTabCallback_Parcel()) {
                        int i13 = warmup + 25;
                        updateVisuals = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i14 = 91 / 0;
                            if (getbkmprikeyccfbph.access100()) {
                                if (this.asBinder.onWarmupCompleted()) {
                                    if (this.ICustomTabsService) {
                                        int i15 = warmup + 55;
                                        updateVisuals = i15 % 128;
                                        int i16 = i15 % 2;
                                    }
                                    return UST_TRANS_Finalize.onExtraCallback.SINGLE_QUOTED;
                                }
                            }
                        } else if (!(!getbkmprikeyccfbph.access100())) {
                        }
                    }
                    return UST_TRANS_Finalize.onExtraCallback.DOUBLE_QUOTED;
                }
            }
        }
        return UST_TRANS_Finalize.onExtraCallback.DOUBLE_QUOTED;
    }

    /* renamed from: o.UST_TRANS_V2_ImportCert$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[UST_TRANS_Finalize.onExtraCallback.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[UST_TRANS_Finalize.onExtraCallback.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[UST_TRANS_Finalize.onExtraCallback.DOUBLE_QUOTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[UST_TRANS_Finalize.onExtraCallback.SINGLE_QUOTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[UST_TRANS_Finalize.onExtraCallback.FOLDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onNavigationEvent[UST_TRANS_Finalize.onExtraCallback.LITERAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeTypedObject() throws Throwable {
        boolean z;
        int i = 2 % 2;
        int i2 = updateVisuals + 29;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        getBKMPriKeyCCFBPH getbkmprikeyccfbph = (getBKMPriKeyCCFBPH) this.extraCallback;
        if (this.asBinder == null) {
            this.asBinder = (UST_TRANS_VeriSign_ImportCert) onWarmupCompleted(1470931322, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1470931317, new Object[]{this, getbkmprikeyccfbph.asInterface()}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }
        if (!this.ICustomTabsService) {
            int i4 = updateVisuals + 97;
            int i5 = i4 % 128;
            warmup = i5;
            int i6 = i4 % 2;
            if (this.isEngagementSignalsApiAvailable) {
                int i7 = i5 + 79;
                updateVisuals = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        int i9 = AnonymousClass3.onNavigationEvent[this.prefetch.ordinal()];
        if (i9 != 1) {
            int i10 = warmup + 117;
            updateVisuals = i10 % 128;
            int i11 = i10 % 2;
            if (i9 == 2) {
                onNavigationEvent(this.asBinder.onExtraCallbackWithResult(), z);
            } else if (i9 == 3) {
                onWarmupCompleted(this.asBinder.onExtraCallbackWithResult(), z);
            } else if (i9 == 4) {
                onExtraCallbackWithResult(this.asBinder.onExtraCallbackWithResult(), z);
                int i12 = updateVisuals + 107;
                warmup = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 2 % 5;
                }
            } else {
                if (i9 != 5) {
                    throw new UST_TRANS_V2_Init("Unexpected style: " + this.prefetch);
                }
                onExtraCallbackWithResult(this.asBinder.onExtraCallbackWithResult());
            }
        } else {
            onExtraCallback(this.asBinder.onExtraCallbackWithResult(), z);
            int i14 = updateVisuals + 115;
            warmup = i14 % 128;
            int i15 = i14 % 2;
        }
        this.asBinder = null;
        this.prefetch = null;
    }

    private String IAuthTabCallback(UST_TRANS_Finalize.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = updateVisuals + 97;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        if (onwarmupcompleted.major() != 1) {
            throw new UST_TRANS_IsPCconnected("unsupported YAML version: " + onwarmupcompleted);
        }
        String representation = onwarmupcompleted.getRepresentation();
        int i4 = updateVisuals + 121;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return representation;
        }
        throw null;
    }

    private String asBinder(String str) {
        int i = 2 % 2;
        if (str.isEmpty()) {
            throw new UST_TRANS_IsPCconnected("tag handle must not be empty");
        }
        int i2 = warmup + 69;
        updateVisuals = i2 % 128;
        if (i2 % 2 == 0 ? str.charAt(0) == '!' : str.charAt(0) == '6') {
            int i3 = updateVisuals + 61;
            warmup = i3 % 128;
            if (i3 % 2 != 0 ? str.charAt(str.length() - 1) == '!' : str.charAt(str.length() >> 1) == 'r') {
                if ("!".equals(str) || IAuthTabCallback.matcher(str).matches()) {
                    int i4 = updateVisuals + 73;
                    warmup = i4 % 128;
                    int i5 = i4 % 2;
                    return str;
                }
                throw new UST_TRANS_IsPCconnected("invalid character in the tag handle: " + str);
            }
        }
        throw new UST_TRANS_IsPCconnected("tag handle must start and end with '!': " + str);
    }

    private String onTransact(String str) {
        int i = 2 % 2;
        int i2 = warmup + 97;
        updateVisuals = i2 % 128;
        if (i2 % 2 == 0) {
            if (str.isEmpty()) {
                throw new UST_TRANS_IsPCconnected("tag prefix must not be empty");
            }
            StringBuilder sb = new StringBuilder();
            int i3 = str.charAt(0) == '!' ? 1 : 0;
            while (i3 < str.length()) {
                i3++;
                int i4 = warmup + 87;
                updateVisuals = i4 % 128;
                int i5 = i4 % 2;
            }
            sb.append((CharSequence) str, 0, i3);
            return sb.toString();
        }
        str.isEmpty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = (UST_TRANS_V2_ImportCert) objArr[0];
        String strSubstring = (String) objArr[1];
        int i = 2 % 2;
        if (!(!strSubstring.isEmpty())) {
            throw new UST_TRANS_IsPCconnected("tag must not be empty");
        }
        int i2 = updateVisuals + 75;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        if ("!".equals(strSubstring)) {
            int i4 = updateVisuals + 87;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            return strSubstring;
        }
        String str = null;
        for (String str2 : uST_TRANS_V2_ImportCert.newSession.keySet()) {
            if (strSubstring.startsWith(str2)) {
                if (!"!".equals(str2)) {
                    int i6 = updateVisuals + 53;
                    warmup = i6 % 128;
                    int i7 = i6 % 2;
                    if (str2.length() < strSubstring.length()) {
                    }
                }
                str = str2;
            }
        }
        if (str != null) {
            int i8 = warmup + 9;
            updateVisuals = i8 % 128;
            int i9 = i8 % 2;
            strSubstring = strSubstring.substring(str.length());
            str = uST_TRANS_V2_ImportCert.newSession.get(str);
        }
        if (str != null) {
            return str + strSubstring;
        }
        String str3 = "!<" + strSubstring + ">";
        int i10 = warmup + 5;
        updateVisuals = i10 % 128;
        if (i10 % 2 == 0) {
            return str3;
        }
        throw null;
    }

    static String IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = updateVisuals + 67;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            str.isEmpty();
            obj.hashCode();
            throw null;
        }
        if (str.isEmpty()) {
            throw new UST_TRANS_IsPCconnected("anchor must not be empty");
        }
        Iterator<Character> it = onNavigationEvent.iterator();
        while (it.hasNext()) {
            int i3 = updateVisuals + 71;
            warmup = i3 % 128;
            if (i3 % 2 == 0) {
                str.indexOf(it.next().charValue());
                throw null;
            }
            Character next = it.next();
            if (str.indexOf(next.charValue()) >= 0) {
                throw new UST_TRANS_IsPCconnected("Invalid character '" + next + "' in the anchor: " + str);
            }
        }
        if (IAuthTabCallbackStub.matcher(str).find()) {
            throw new UST_TRANS_IsPCconnected("Anchor may not contain spaces: " + str);
        }
        int i4 = updateVisuals + 53;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[PHI: r5
      0x0058: PHI (r5v7 char) = (r5v5 char), (r5v6 char), (r5v8 char) binds: [B:23:0x0052, B:25:0x0056, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean IAuthTabCallbackDefault(String str) {
        char cCharAt;
        int i = 2 % 2;
        int i2 = warmup + 85;
        updateVisuals = i2 % 128;
        if (i2 % 2 == 0 ? str.length() > 1 : str.length() > 1) {
            if (str.charAt(0) == '0') {
                int i3 = warmup + 53;
                updateVisuals = i3 % 128;
                for (int i4 = i3 % 2 != 0 ? 0 : 1; i4 < str.length(); i4++) {
                    int i5 = warmup + 61;
                    updateVisuals = i5 % 128;
                    if (i5 % 2 == 0 ? (cCharAt = str.charAt(i4)) < '0' : (cCharAt = str.charAt(i4)) < 21) {
                        if (cCharAt != '_') {
                            return false;
                        }
                    } else if (cCharAt <= '9') {
                        continue;
                    }
                }
                int i6 = warmup + 93;
                updateVisuals = i6 % 128;
                if (i6 % 2 == 0) {
                    return true;
                }
                throw null;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int iCharCount;
        int i3;
        UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = (UST_TRANS_V2_ImportCert) objArr[0];
        String str = (String) objArr[1];
        int i4 = 2 % 2;
        if (str.isEmpty()) {
            return new UST_TRANS_VeriSign_ImportCert(str, true, false, false, true, true, false);
        }
        boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault(str);
        Object obj = null;
        if (!str.startsWith("---")) {
            int i5 = updateVisuals + 7;
            warmup = i5 % 128;
            if (i5 % 2 == 0) {
                str.startsWith("...");
                obj.hashCode();
                throw null;
            }
            z = str.startsWith("...");
        }
        int i6 = updateVisuals + 47;
        warmup = i6 % 128;
        if (i6 % 2 != 0 ? str.length() == 1 : str.length() == 0) {
            z2 = true;
        } else if (!getCRLDP.onExtraCallback.onExtraCallback(str.codePointAt(1))) {
            z2 = false;
        }
        boolean z7 = false;
        boolean z8 = false;
        int iCharCount2 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = true;
        boolean z18 = z2;
        boolean z19 = z;
        while (iCharCount2 < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount2);
            if (iCharCount2 == 0) {
                int i7 = warmup + 3;
                updateVisuals = i7 % 128;
                int i8 = i7 % 2;
                if ("#,[]{}&*!|>'\"%@`".indexOf(iCodePointAt) != -1) {
                    z = true;
                    z19 = true;
                }
                if (iCodePointAt != 63) {
                    int i9 = warmup + 119;
                    updateVisuals = i9 % 128;
                    int i10 = i9 % 2;
                    if (iCodePointAt != 58) {
                        i3 = 45;
                    } else if (z18) {
                        int i11 = updateVisuals + 35;
                        warmup = i11 % 128;
                        int i12 = i11 % 2;
                        i3 = 45;
                        z = true;
                        z19 = true;
                    } else {
                        i3 = 45;
                        z = true;
                    }
                    if (iCodePointAt == i3 && z18) {
                        z = true;
                        z19 = true;
                    }
                }
            } else {
                if (",?[]{}".indexOf(iCodePointAt) != -1) {
                    i = 58;
                    z = true;
                } else {
                    i = 58;
                }
                if (iCodePointAt == i) {
                    int i13 = warmup + 71;
                    updateVisuals = i13 % 128;
                    int i14 = i13 % 2;
                    if (z18) {
                        i2 = 35;
                        z = true;
                        z19 = true;
                        if (iCodePointAt == i2 && z17) {
                        }
                    } else {
                        z = true;
                        i2 = 35;
                        if (iCodePointAt == i2) {
                            z = true;
                            z19 = true;
                        }
                    }
                } else {
                    i2 = 35;
                    if (iCodePointAt == i2) {
                    }
                }
            }
            boolean zOnExtraCallback = getCRLDP.IAuthTabCallback.onExtraCallback(iCodePointAt);
            if (zOnExtraCallback) {
                z7 = true;
            }
            if (iCodePointAt != 10 && ((32 > iCodePointAt || iCodePointAt > 126) && ((iCodePointAt != 133 && ((iCodePointAt < 160 || iCodePointAt > 55295) && ((iCodePointAt < 57344 || iCodePointAt > 65533) && (iCodePointAt < 65536 || iCodePointAt > 1114111)))) || !uST_TRANS_V2_ImportCert.asInterface))) {
                z15 = true;
            }
            if (iCodePointAt == 32) {
                if (iCharCount2 == 0) {
                    int i15 = updateVisuals + 49;
                    warmup = i15 % 128;
                    int i16 = i15 % 2;
                    z9 = true;
                }
                if (iCharCount2 == str.length() - 1) {
                    z11 = true;
                }
                if (z16) {
                    z14 = true;
                }
                z8 = true;
            } else if (zOnExtraCallback) {
                int i17 = updateVisuals + 93;
                warmup = i17 % 128;
                if (i17 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (iCharCount2 == 0) {
                    z10 = true;
                }
                if (iCharCount2 == str.length() - 1) {
                    z12 = true;
                }
                if (z8) {
                    int i18 = warmup + 33;
                    updateVisuals = i18 % 128;
                    int i19 = i18 % 2;
                    z13 = true;
                }
                z8 = false;
                z16 = true;
                iCharCount2 += Character.charCount(iCodePointAt);
                getCRLDP getcrldp = getCRLDP.onNavigationEvent;
                z17 = !getcrldp.onExtraCallback(iCodePointAt) || zOnExtraCallback;
                z18 = iCharCount2 + 1 < str.length() || (iCharCount = Character.charCount(str.codePointAt(iCharCount2)) + iCharCount2) >= str.length() || getcrldp.onExtraCallback(str.codePointAt(iCharCount)) || zOnExtraCallback;
            } else {
                z8 = false;
            }
            z16 = false;
            iCharCount2 += Character.charCount(iCodePointAt);
            getCRLDP getcrldp2 = getCRLDP.onNavigationEvent;
            if (getcrldp2.onExtraCallback(iCodePointAt)) {
            }
            if (iCharCount2 + 1 < str.length()) {
            }
        }
        if (z9 || z10) {
            z3 = false;
        } else {
            int i20 = warmup + 45;
            updateVisuals = i20 % 128;
            if (i20 % 2 != 0) {
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            if (!z11 && !z12 && !zIAuthTabCallbackDefault) {
                z3 = true;
            }
        }
        if (z14) {
            z4 = false;
            z3 = false;
        } else {
            z4 = z3;
        }
        if (z13 || z15) {
            z4 = false;
            z5 = false;
            z3 = false;
            z6 = false;
        } else {
            z5 = !z14;
            z6 = true ^ z11;
        }
        if (z7) {
            z3 = false;
        }
        if (z) {
            z3 = false;
        }
        if (z19) {
            z4 = false;
        }
        return new UST_TRANS_VeriSign_ImportCert(str, false, z7, z3, z4, z5, z6);
    }

    void onNavigationEvent() throws IOException {
        int i = 2 % 2;
        int i2 = warmup + 5;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        this.newSessionWithExtras.flush();
        if (i3 != 0) {
            throw null;
        }
    }

    void IAuthTabCallback() throws IOException {
        int i = 2 % 2;
        int i2 = warmup + 93;
        updateVisuals = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void onExtraCallback(String str, boolean z, boolean z2, boolean z3) throws IOException {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 27;
        updateVisuals = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z4 = true;
            if (!this.postMessage && z) {
                int i4 = i2 + 63;
                updateVisuals = i4 % 128;
                if (i4 % 2 != 0) {
                    this.IAuthTabCallbackStubProxy /= 0;
                    this.newSessionWithExtras.write(onExtraCallbackWithResult);
                } else {
                    this.IAuthTabCallbackStubProxy++;
                    this.newSessionWithExtras.write(onExtraCallbackWithResult);
                }
            }
            this.postMessage = z2;
            if (this.onMinimized && z3) {
                int i5 = warmup + 117;
                updateVisuals = i5 % 128;
                int i6 = i5 % 2;
            } else {
                z4 = false;
            }
            this.onMinimized = z4;
            this.IAuthTabCallbackStubProxy += str.length();
            this.ICustomTabsCallbackDefault = false;
            this.newSessionWithExtras.write(str);
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onExtraCallback() throws IOException {
        int i = 2 % 2;
        Integer num = this.ICustomTabsCallback;
        int iIntValue = num != null ? num.intValue() : 0;
        if (!(!this.onMinimized)) {
            int i2 = updateVisuals;
            int i3 = i2 + 75;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.IAuthTabCallbackStubProxy;
            if (i5 > iIntValue) {
                IAuthTabCallback_Parcel((String) null);
            } else if (i5 == iIntValue) {
                int i6 = i2 + 89;
                warmup = i6 % 128;
                int i7 = i6 % 2;
                if (!this.postMessage) {
                }
            }
        }
        onNavigationEvent(iIntValue - this.IAuthTabCallbackStubProxy);
    }

    private void onNavigationEvent(int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = updateVisuals + 59;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        if (i <= 0) {
            return;
        }
        this.postMessage = true;
        char[] cArr = new char[i];
        int i5 = 0;
        while (i5 < i) {
            int i6 = warmup + 13;
            updateVisuals = i6 % 128;
            if (i6 % 2 != 0) {
                cArr[i5] = 'T';
                i5 += 8;
            } else {
                cArr[i5] = ' ';
                i5++;
            }
        }
        this.IAuthTabCallbackStubProxy += i;
        this.newSessionWithExtras.write(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r4.newSessionWithExtras.write(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r4.newSessionWithExtras.write(r4.onTransact);
        r5 = o.UST_TRANS_V2_ImportCert.updateVisuals + 23;
        o.UST_TRANS_V2_ImportCert.warmup = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void IAuthTabCallback_Parcel(String str) throws IOException {
        int i = 2 % 2;
        int i2 = updateVisuals + 113;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            this.postMessage = true;
            this.onMinimized = false;
            this.IAuthTabCallbackStubProxy = 0;
        } else {
            this.postMessage = true;
            this.onMinimized = true;
            this.IAuthTabCallbackStubProxy = 0;
        }
    }

    void onWarmupCompleted(String str) throws IOException {
        int i = 2 % 2;
        int i2 = updateVisuals + 93;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        this.newSessionWithExtras.write("%YAML ");
        this.newSessionWithExtras.write(str);
        IAuthTabCallback_Parcel((String) null);
        int i4 = warmup + 67;
        updateVisuals = i4 % 128;
        int i5 = i4 % 2;
    }

    void onExtraCallback(String str, String str2) throws IOException {
        int i = 2 % 2;
        int i2 = updateVisuals + 79;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        this.newSessionWithExtras.write("%TAG ");
        this.newSessionWithExtras.write(str);
        this.newSessionWithExtras.write(onExtraCallbackWithResult);
        this.newSessionWithExtras.write(str2);
        IAuthTabCallback_Parcel((String) null);
        int i4 = updateVisuals + 97;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onWarmupCompleted(String str, boolean z) throws IOException {
        int i = 2 % 2;
        ?? r5 = 0;
        onExtraCallback("'", true, false, false);
        int i2 = 0;
        boolean z2 = false;
        boolean zOnExtraCallback = false;
        int i3 = 0;
        while (i2 <= str.length()) {
            char cCharAt = i2 < str.length() ? str.charAt(i2) : r5;
            if (z2) {
                if (cCharAt == 0 || cCharAt != ' ') {
                    if (i3 + 1 == i2) {
                        int i4 = updateVisuals + 105;
                        int i5 = i4 % 128;
                        warmup = i5;
                        int i6 = i4 % 2;
                        if (this.IAuthTabCallbackStubProxy > this.access100) {
                            int i7 = i5 + 93;
                            updateVisuals = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 80 / r5;
                                if (z) {
                                    if (i3 == 0 || i2 == str.length()) {
                                        int i9 = i2 - i3;
                                        this.IAuthTabCallbackStubProxy += i9;
                                        this.newSessionWithExtras.write(str, i3, i9);
                                    } else {
                                        onExtraCallback();
                                    }
                                    i3 = i2;
                                }
                            } else if (z) {
                            }
                        }
                    }
                }
            } else if (zOnExtraCallback) {
                if (cCharAt == 0 || !(!getCRLDP.IAuthTabCallback.onWarmupCompleted(cCharAt))) {
                    if (str.charAt(i3) == '\n') {
                        IAuthTabCallback_Parcel((String) null);
                    }
                    char[] charArray = str.substring(i3, i2).toCharArray();
                    int length = charArray.length;
                    for (int i10 = r5; i10 < length; i10++) {
                        char c = charArray[i10];
                        if (c == '\n') {
                            IAuthTabCallback_Parcel((String) null);
                        } else {
                            IAuthTabCallback_Parcel(String.valueOf(c));
                        }
                    }
                    onExtraCallback();
                    i3 = i2;
                }
            } else if (!(!getCRLDP.IAuthTabCallback.onExtraCallbackWithResult(cCharAt, "\u0000 '")) && i3 < i2) {
                int i11 = i2 - i3;
                this.IAuthTabCallbackStubProxy += i11;
                this.newSessionWithExtras.write(str, i3, i11);
                i3 = i2;
            }
            if (cCharAt == '\'') {
                this.IAuthTabCallbackStubProxy += 2;
                this.newSessionWithExtras.write("''");
                i3 = i2 + 1;
            }
            if (cCharAt != 0) {
                z2 = cCharAt == ' ';
                zOnExtraCallback = getCRLDP.IAuthTabCallback.onExtraCallback(cCharAt);
            }
            i2++;
            int i12 = updateVisuals + 121;
            warmup = i12 % 128;
            int i13 = i12 % 2;
            r5 = 0;
        }
        onExtraCallback("'", r5, r5, r5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118 A[PHI: r12
      0x0118: PHI (r12v26 java.lang.String) = (r12v25 java.lang.String), (r12v29 java.lang.String) binds: [B:50:0x0116, B:47:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onNavigationEvent(String str, boolean z) throws Throwable {
        int i;
        int i2;
        Character chValueOf;
        int iCharValue;
        String str2;
        String strValueOf;
        int i3;
        String str3;
        int i4 = 2 % 2;
        int i5 = warmup + 95;
        updateVisuals = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback("\"", false, false, true);
            i = 1;
            i2 = 0;
        } else {
            onExtraCallback("\"", true, false, false);
            i = 0;
            i2 = 0;
        }
        while (i <= str.length()) {
            int i6 = warmup + 9;
            updateVisuals = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 98 / 0;
                chValueOf = i < str.length() ? Character.valueOf(str.charAt(i)) : null;
            } else if (i < str.length()) {
            }
            if (chValueOf == null || "\"\\\u0085\u2028\u2029\ufeff".indexOf(chValueOf.charValue()) != -1 || ' ' > chValueOf.charValue() || chValueOf.charValue() > '~') {
                if (i2 < i) {
                    int i8 = i - i2;
                    this.IAuthTabCallbackStubProxy += i8;
                    this.newSessionWithExtras.write(str, i2, i8);
                    i2 = i;
                }
                if (chValueOf != null) {
                    int i9 = warmup + 111;
                    updateVisuals = i9 % 128;
                    int i10 = i9 % 2;
                    Map<Character, String> map = onExtraCallback;
                    if (map.containsKey(chValueOf)) {
                        str2 = "\\" + map.get(chValueOf);
                    } else {
                        if (!Character.isHighSurrogate(chValueOf.charValue()) || (i3 = i + 1) >= str.length()) {
                            iCharValue = chValueOf.charValue();
                        } else {
                            int i11 = updateVisuals + 75;
                            warmup = i11 % 128;
                            if (i11 % 2 == 0) {
                                iCharValue = Character.toCodePoint(chValueOf.charValue(), str.charAt(i3));
                                int i12 = 58 / 0;
                            } else {
                                iCharValue = Character.toCodePoint(chValueOf.charValue(), str.charAt(i3));
                            }
                        }
                        if (this.asInterface && getBSignPriKeyPH.onWarmupCompleted(iCharValue)) {
                            int i13 = warmup + 103;
                            updateVisuals = i13 % 128;
                            if (i13 % 2 != 0) {
                                strValueOf = String.valueOf(Character.toChars(iCharValue));
                                if (Character.charCount(iCharValue) == 4) {
                                    i++;
                                }
                                str2 = strValueOf;
                            } else {
                                strValueOf = String.valueOf(Character.toChars(iCharValue));
                                if (Character.charCount(iCharValue) == 2) {
                                }
                                str2 = strValueOf;
                            }
                        } else if (chValueOf.charValue() <= 255) {
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr = new Object[1];
                            a((short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 46), (byte) Color.red(0), (Process.myTid() >> 22) - 1757006117, AndroidCharacter.getMirror('0') + 46602, (-78) - Color.argb(0, 0, 0, 0), objArr);
                            sb.append(((String) objArr[0]).intern());
                            sb.append(Integer.toString(chValueOf.charValue(), 16));
                            String string = sb.toString();
                            str2 = "\\x" + string.substring(string.length() - 2);
                        } else if (Character.charCount(iCharValue) == 2) {
                            i++;
                            str2 = "\\U" + ("000" + Long.toHexString(iCharValue)).substring(r7.length() - 8);
                        } else {
                            String str4 = "000" + Integer.toString(chValueOf.charValue(), 16);
                            str2 = "\\u" + str4.substring(str4.length() - 4);
                        }
                    }
                    this.IAuthTabCallbackStubProxy += str2.length();
                    this.newSessionWithExtras.write(str2);
                    i2 = i + 1;
                }
            }
            if (i > 0) {
                int i14 = warmup + 117;
                updateVisuals = i14 % 128;
                if (i14 % 2 != 0) {
                    if (i < str.length() % 0) {
                        int i15 = warmup + 49;
                        updateVisuals = i15 % 128;
                        if (i15 % 2 == 0 ? chValueOf.charValue() == ' ' : chValueOf.charValue() == 'u') {
                            if (this.IAuthTabCallbackStubProxy + (i - i2) > this.access100 && !(!z)) {
                                int i16 = updateVisuals + 75;
                                warmup = i16 % 128;
                                if (i16 % 2 == 0) {
                                    throw null;
                                }
                                if (i2 >= i) {
                                    str3 = "\\";
                                } else {
                                    str3 = str.substring(i2, i) + "\\";
                                }
                                if (i2 < i) {
                                    i2 = i;
                                }
                                this.IAuthTabCallbackStubProxy += str3.length();
                                this.newSessionWithExtras.write(str3);
                                onExtraCallback();
                                this.postMessage = false;
                                this.onMinimized = false;
                                if (str.charAt(i2) == ' ') {
                                    int i17 = warmup + 37;
                                    updateVisuals = i17 % 128;
                                    int i18 = i17 % 2;
                                    this.IAuthTabCallbackStubProxy++;
                                    this.newSessionWithExtras.write("\\");
                                    int i19 = updateVisuals + 59;
                                    warmup = i19 % 128;
                                    int i20 = i19 % 2;
                                }
                            }
                        } else if (i2 < i) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else if (i >= str.length() - 1) {
                    continue;
                }
            }
            i++;
        }
        onExtraCallback("\"", false, false, false);
    }

    private boolean onWarmupCompleted(List<UST_TRANS_V2_Finalize> list) throws IOException {
        int i;
        int i2 = 2 % 2;
        if (!this.getInterfaceDescriptor) {
            return false;
        }
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        for (UST_TRANS_V2_Finalize uST_TRANS_V2_Finalize : list) {
            Object obj = null;
            if (uST_TRANS_V2_Finalize.onNavigationEvent() != UST_TRANS_V2_ExportCert.BLANK_LINE) {
                int i4 = warmup;
                int i5 = i4 + 89;
                updateVisuals = i5 % 128;
                int i6 = i5 % 2;
                if (z) {
                    int i7 = i4 + 9;
                    updateVisuals = i7 % 128;
                    if (i7 % 2 != 0) {
                        uST_TRANS_V2_Finalize.onNavigationEvent();
                        UST_TRANS_V2_ExportCert uST_TRANS_V2_ExportCert = UST_TRANS_V2_ExportCert.IN_LINE;
                        obj.hashCode();
                        throw null;
                    }
                    onExtraCallback("#", uST_TRANS_V2_Finalize.onNavigationEvent() == UST_TRANS_V2_ExportCert.IN_LINE, false, false);
                    int i8 = this.IAuthTabCallbackStubProxy;
                    if (i8 > 0) {
                        i = i8 - 1;
                    } else {
                        int i9 = warmup + 35;
                        updateVisuals = i9 % 128;
                        int i10 = i9 % 2;
                        i = 0;
                    }
                    i3 = i;
                    z = false;
                } else {
                    onNavigationEvent(i3);
                    onExtraCallback("#", false, false, false);
                }
                this.newSessionWithExtras.write(uST_TRANS_V2_Finalize.onWarmupCompleted());
                IAuthTabCallback_Parcel((String) null);
            } else {
                IAuthTabCallback_Parcel((String) null);
                onExtraCallback();
            }
            z2 = true;
        }
        return z2;
    }

    private void extraCallbackWithResult() throws IOException {
        int i = 2 % 2;
        int i2 = updateVisuals + 125;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        if (!this.IAuthTabCallback_Parcel.onExtraCallback()) {
            onExtraCallback();
            onWarmupCompleted(this.IAuthTabCallback_Parcel.onWarmupCompleted());
        }
        int i4 = updateVisuals + 45;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
    }

    private boolean onActivityResized() throws IOException {
        int i = 2 % 2;
        int i2 = updateVisuals + 121;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(this.onActivityLayout.onWarmupCompleted());
        int i4 = warmup + 77;
        updateVisuals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return zOnWarmupCompleted;
    }

    private String onExtraCallback(String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        getCRLDP getcrldp = getCRLDP.IAuthTabCallback;
        if (getcrldp.onExtraCallbackWithResult(str.charAt(0), " ")) {
            int i2 = updateVisuals + 47;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            sb.append(this.IAuthTabCallbackDefault);
        }
        if (getcrldp.onWarmupCompleted(str.charAt(str.length() - 1))) {
            int i4 = warmup + 53;
            updateVisuals = i4 % 128;
            int i5 = i4 % 2;
            sb.append("-");
        } else if (str.length() == 1 || getcrldp.onExtraCallback(str.charAt(str.length() - 2))) {
            sb.append("+");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (o.getCRLDP.IAuthTabCallback.onWarmupCompleted(r11) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onExtraCallbackWithResult(String str, boolean z) throws IOException {
        char cCharAt;
        char c;
        int i;
        int i2 = 2 % 2;
        String strOnExtraCallback = onExtraCallback(str);
        char c2 = 0;
        onExtraCallback(">" + strOnExtraCallback, true, false, false);
        if (strOnExtraCallback.length() > 0 && strOnExtraCallback.charAt(strOnExtraCallback.length() - 1) == '+') {
            this.ICustomTabsCallbackDefault = true;
        }
        Object obj = null;
        if (!onActivityResized()) {
            IAuthTabCallback_Parcel((String) null);
        }
        boolean zOnExtraCallback = true;
        char c3 = 1;
        int i3 = 0;
        char c4 = 0;
        int i4 = 0;
        while (i3 <= str.length()) {
            int i5 = warmup + 109;
            updateVisuals = i5 % 128;
            if (i5 % 2 != 0) {
                str.length();
                throw null;
            }
            if (i3 < str.length()) {
                cCharAt = str.charAt(i3);
            } else {
                int i6 = updateVisuals + 117;
                warmup = i6 % 128;
                int i7 = i6 % 2;
                cCharAt = c2;
            }
            if (zOnExtraCallback) {
                if (cCharAt != 0) {
                    int i8 = updateVisuals + 97;
                    warmup = i8 % 128;
                    if (i8 % 2 == 0) {
                        getCRLDP.IAuthTabCallback.onWarmupCompleted(cCharAt);
                        obj.hashCode();
                        throw null;
                    }
                }
                if (c3 == 0) {
                    int i9 = warmup;
                    int i10 = i9 + 21;
                    updateVisuals = i10 % 128;
                    if (i10 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (cCharAt != 0) {
                        int i11 = i9 + 67;
                        updateVisuals = i11 % 128;
                        int i12 = i11 % 2;
                        if (cCharAt != ' ' && str.charAt(i4) == '\n') {
                            IAuthTabCallback_Parcel((String) null);
                        }
                    }
                }
                if (cCharAt == ' ') {
                    int i13 = warmup;
                    int i14 = i13 + 79;
                    updateVisuals = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = i13 + 95;
                    updateVisuals = i16 % 128;
                    int i17 = i16 % 2;
                    c3 = 1;
                } else {
                    c3 = c2;
                }
                char[] charArray = str.substring(i4, i3).toCharArray();
                int length = charArray.length;
                for (int i18 = c2; i18 < length; i18++) {
                    char c5 = charArray[i18];
                    if (c5 == '\n') {
                        IAuthTabCallback_Parcel((String) null);
                    } else {
                        IAuthTabCallback_Parcel(String.valueOf(c5));
                    }
                }
                if (cCharAt != 0) {
                    onExtraCallback();
                }
                c = 0;
                i = i3;
            } else if ((c4 ^ 1) != 1) {
                if (cCharAt != ' ') {
                    if (i4 + 1 != i3 || this.IAuthTabCallbackStubProxy <= this.access100) {
                        int i19 = i3 - i4;
                        this.IAuthTabCallbackStubProxy += i19;
                        this.newSessionWithExtras.write(str, i4, i19);
                        c = 0;
                        i = i3;
                    } else {
                        int i20 = warmup + 69;
                        updateVisuals = i20 % 128;
                        if (i20 % 2 != 0) {
                            throw null;
                        }
                        if (z) {
                            onExtraCallback();
                            int i21 = warmup + 87;
                            updateVisuals = i21 % 128;
                            int i22 = i21 % 2;
                        }
                        c = 0;
                        i = i3;
                    }
                }
                i = i4;
                c = 0;
            } else {
                if (!(!getCRLDP.IAuthTabCallback.onExtraCallbackWithResult(cCharAt, "\u0000 "))) {
                    int i23 = i3 - i4;
                    this.IAuthTabCallbackStubProxy += i23;
                    this.newSessionWithExtras.write(str, i4, i23);
                    if (cCharAt == 0) {
                        int i24 = updateVisuals + 95;
                        warmup = i24 % 128;
                        if (i24 % 2 == 0) {
                            IAuthTabCallback_Parcel((String) null);
                            c = 0;
                            int i25 = 14 / 0;
                        } else {
                            c = 0;
                            IAuthTabCallback_Parcel((String) null);
                        }
                    } else {
                        c = 0;
                    }
                    i = i3;
                }
                i = i4;
                c = 0;
            }
            if (cCharAt != 0) {
                zOnExtraCallback = getCRLDP.IAuthTabCallback.onExtraCallback(cCharAt);
                c4 = cCharAt == ' ' ? (char) 1 : c;
            }
            i3++;
            char c6 = c;
            i4 = i;
            c2 = c6;
        }
    }

    void onExtraCallbackWithResult(String str) throws IOException {
        char cCharAt;
        char c;
        int i = 2 % 2;
        String strOnExtraCallback = onExtraCallback(str);
        boolean zOnExtraCallback = true;
        onExtraCallback("|" + strOnExtraCallback, true, false, false);
        if (strOnExtraCallback.length() > 0 && strOnExtraCallback.charAt(strOnExtraCallback.length() - 1) == '+') {
            this.ICustomTabsCallbackDefault = true;
        }
        Object obj = null;
        if (!onActivityResized()) {
            IAuthTabCallback_Parcel((String) null);
        }
        int i2 = 0;
        for (int i3 = 0; i3 <= str.length(); i3++) {
            int i4 = warmup + 105;
            updateVisuals = i4 % 128;
            int i5 = i4 % 2;
            if (i3 < str.length()) {
                int i6 = updateVisuals + 3;
                warmup = i6 % 128;
                if (i6 % 2 == 0) {
                    cCharAt = str.charAt(i3);
                    int i7 = 20 / 0;
                } else {
                    cCharAt = str.charAt(i3);
                }
            } else {
                cCharAt = 0;
            }
            if (zOnExtraCallback) {
                int i8 = updateVisuals + 101;
                warmup = i8 % 128;
                if (i8 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (cCharAt == 0 || getCRLDP.IAuthTabCallback.onWarmupCompleted(cCharAt)) {
                    char[] charArray = str.substring(i2, i3).toCharArray();
                    int length = charArray.length;
                    for (int i9 = 0; i9 < length; i9++) {
                        int i10 = warmup + 117;
                        updateVisuals = i10 % 128;
                        if (i10 % 2 == 0 ? (c = charArray[i9]) != '\n' : (c = charArray[i9]) != 6) {
                            IAuthTabCallback_Parcel(String.valueOf(c));
                        } else {
                            IAuthTabCallback_Parcel((String) null);
                        }
                    }
                    if (cCharAt != 0) {
                        onExtraCallback();
                    }
                    i2 = i3;
                }
            } else if (cCharAt == 0 || getCRLDP.IAuthTabCallback.onExtraCallback(cCharAt)) {
                this.newSessionWithExtras.write(str, i2, i3 - i2);
                if (cCharAt == 0) {
                    int i11 = warmup + 11;
                    updateVisuals = i11 % 128;
                    int i12 = i11 % 2;
                    IAuthTabCallback_Parcel((String) null);
                }
                i2 = i3;
            }
            if (cCharAt != 0) {
                int i13 = warmup + 35;
                updateVisuals = i13 % 128;
                if (i13 % 2 != 0) {
                    getCRLDP.IAuthTabCallback.onExtraCallback(cCharAt);
                    throw null;
                }
                zOnExtraCallback = getCRLDP.IAuthTabCallback.onExtraCallback(cCharAt);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onExtraCallback(String str, boolean z) throws IOException {
        int i = 2 % 2;
        if (this.extraCommand) {
            int i2 = updateVisuals + 43;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            this.ICustomTabsCallbackDefault = true;
        }
        if (str.isEmpty()) {
            return;
        }
        int i4 = warmup + 27;
        updateVisuals = i4 % 128;
        int i5 = i4 % 2;
        if (!this.postMessage) {
            this.IAuthTabCallbackStubProxy++;
            this.newSessionWithExtras.write(onExtraCallbackWithResult);
        }
        this.postMessage = false;
        this.onMinimized = false;
        int i6 = 0;
        boolean z2 = false;
        boolean zOnExtraCallback = false;
        int i7 = 0;
        while (i6 <= str.length()) {
            char cCharAt = i6 < str.length() ? str.charAt(i6) : (char) 0;
            if (z2) {
                int i8 = updateVisuals + 45;
                int i9 = i8 % 128;
                warmup = i9;
                int i10 = i8 % 2;
                if (cCharAt != ' ') {
                    if (i7 + 1 == i6) {
                        int i11 = i9 + 49;
                        updateVisuals = i11 % 128;
                        int i12 = i11 % 2;
                        if (this.IAuthTabCallbackStubProxy > this.access100) {
                            int i13 = i9 + 83;
                            updateVisuals = i13 % 128;
                            int i14 = i13 % 2;
                            if (z) {
                                int i15 = i9 + 47;
                                updateVisuals = i15 % 128;
                                int i16 = i15 % 2;
                                onExtraCallback();
                                this.postMessage = false;
                                this.onMinimized = false;
                            } else {
                                int i17 = i6 - i7;
                                this.IAuthTabCallbackStubProxy += i17;
                                this.newSessionWithExtras.write(str, i7, i17);
                            }
                            i7 = i6;
                        }
                    }
                }
            } else if (zOnExtraCallback) {
                int i18 = warmup + 25;
                updateVisuals = i18 % 128;
                if (i18 % 2 != 0) {
                    getCRLDP.IAuthTabCallback.onWarmupCompleted(cCharAt);
                    throw null;
                }
                if (getCRLDP.IAuthTabCallback.onWarmupCompleted(cCharAt)) {
                    int i19 = updateVisuals + 113;
                    warmup = i19 % 128;
                    if (i19 % 2 != 0 ? str.charAt(i7) == '\n' : str.charAt(i7) == 20) {
                        int i20 = warmup + 115;
                        updateVisuals = i20 % 128;
                        if (i20 % 2 != 0) {
                            IAuthTabCallback_Parcel((String) null);
                            int i21 = 22 / 0;
                        } else {
                            IAuthTabCallback_Parcel((String) null);
                        }
                    }
                    for (char c : str.substring(i7, i6).toCharArray()) {
                        if (c == '\n') {
                            IAuthTabCallback_Parcel((String) null);
                        } else {
                            IAuthTabCallback_Parcel(String.valueOf(c));
                        }
                    }
                    onExtraCallback();
                    this.postMessage = false;
                    this.onMinimized = false;
                    i7 = i6;
                }
            } else if (!(!getCRLDP.IAuthTabCallback.onExtraCallbackWithResult(cCharAt, "\u0000 "))) {
                int i22 = updateVisuals + 103;
                warmup = i22 % 128;
                int i23 = i22 % 2;
                int i24 = i6 - i7;
                this.IAuthTabCallbackStubProxy += i24;
                this.newSessionWithExtras.write(str, i7, i24);
                i7 = i6;
            }
            if (cCharAt != 0) {
                z2 = cCharAt == ' ';
                zOnExtraCallback = getCRLDP.IAuthTabCallback.onExtraCallback(cCharAt);
            }
            i6++;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i) | i7 | i3);
        int i9 = (~i3) | i7;
        int i10 = i8 | (~(i9 | i)) | (~(i5 | i | i3));
        int i11 = ~i9;
        int i12 = (~(i3 | i5)) | i | i11;
        int i13 = (~(i7 | i)) | i11;
        int i14 = i5 + i + i4 + (933655473 * i2) + ((-1037598838) * i6);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i5) - 925892608) + (470833381 * i) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i4) + ((-1691877376) * i2) + ((-393216000) * i6) + ((-1633878016) * i15);
        int i17 = ((i5 * (-727610197)) - 1081761860) + (i * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i4 * (-727609241)) + (i2 * 1532828727) + (i6 * (-747900794)) + (i15 * 556466176);
        switch (i16 + (i17 * i17 * (-1911357440))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert = (UST_TRANS_V2_ImportCert) objArr[0];
                int i18 = 2 % 2;
                onWarmupCompleted(526611505, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -526611501, new Object[]{uST_TRANS_V2_ImportCert, false, false}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                uST_TRANS_V2_ImportCert.ICustomTabsCallback_Parcel = new asBinder(uST_TRANS_V2_ImportCert, null);
                int i19 = updateVisuals + 121;
                warmup = i19 % 128;
                int i20 = i19 % 2;
                return null;
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert2 = (UST_TRANS_V2_ImportCert) objArr[0];
                UST_TRANS_Finalize.onWarmupCompleted onwarmupcompleted = (UST_TRANS_Finalize.onWarmupCompleted) objArr[1];
                int i21 = 2 % 2;
                int i22 = warmup + 55;
                updateVisuals = i22 % 128;
                int i23 = i22 % 2;
                String strIAuthTabCallback = uST_TRANS_V2_ImportCert2.IAuthTabCallback(onwarmupcompleted);
                int i24 = updateVisuals + 91;
                warmup = i24 % 128;
                int i25 = i24 % 2;
                return strIAuthTabCallback;
            case 10:
                return onTransact(objArr);
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    static /* synthetic */ getRootCACert asBinder(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (getRootCACert) onWarmupCompleted(1120310663, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1120310653, new Object[]{uST_TRANS_V2_ImportCert}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    static /* synthetic */ Integer IAuthTabCallbackStub(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Integer) onWarmupCompleted(-2047228073, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 2047228081, new Object[]{uST_TRANS_V2_ImportCert}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    static /* synthetic */ String onExtraCallback(UST_TRANS_V2_ImportCert uST_TRANS_V2_ImportCert, UST_TRANS_Finalize.onWarmupCompleted onwarmupcompleted) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(1692685689, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1692685680, new Object[]{uST_TRANS_V2_ImportCert, onwarmupcompleted}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private UST_TRANS_VeriSign_ImportCert onNavigationEvent(String str) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (UST_TRANS_VeriSign_ImportCert) onWarmupCompleted(1470931322, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1470931317, new Object[]{this, str}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private boolean asInterface() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(-680350778, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 680350789, new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
    }

    private boolean onTransact() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(-1577719790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1577719797, new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
    }

    private void getInterfaceDescriptor() throws IOException {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(-726273208, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 726273211, new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private void IAuthTabCallback_Parcel() throws IOException {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(-542426883, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 542426885, new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private void IAuthTabCallback(boolean z, boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z), Boolean.valueOf(z2)};
        onWarmupCompleted(526611505, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -526611501, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private boolean onWarmupCompleted(Cert cert) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(1698997613, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1698997601, new Object[]{this, cert}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
    }

    private boolean onExtraCallbackWithResult(Iterator<Cert> it, int i) {
        Object[] objArr = {this, it, Integer.valueOf(i)};
        return ((Boolean) onWarmupCompleted(1079577480, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1079577479, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
    }

    private String IAuthTabCallbackStub(String str) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(1937112152, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1937112146, new Object[]{this, str}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private void extraCallback() throws IOException {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(-314589963, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 314589963, new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    static void onWarmupCompleted() {
        newAuthTabSession = -855764691;
        requestPostMessageChannelWithExtras = -1538795451;
        receiveFile = 1934004734;
        setEngagementSignalsCallback = new byte[]{PSSSigner.TRAILER_IMPLICIT};
    }
}
